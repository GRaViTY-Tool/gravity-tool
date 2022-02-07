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
import org.eclipse.modisco.java.AnnotationTypeDeclaration;
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.Type;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MAbstractMethodDefinition;

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.AnnotationTypeNested;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

import org.gravity.typegraph.basic.annotations.AnnotationsFactory;
import org.gravity.typegraph.basic.annotations.TAnnotationType;

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
 * An implementation of the model object '<em><b>Annotation Type Nested</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnnotationTypeNestedImpl extends AbstractRuleImpl implements AnnotationTypeNested {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationTypeNestedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnnotationTypeNested();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, AnnotationTypeDeclaration eNestedType,
			AbstractTypeDeclaration eOuterType) {

		Object[] result1_black = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_0_1_initialbindings_blackBBBB(this, match, eNestedType, eOuterType);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[eNestedType] = " + eNestedType + ", " + "[eOuterType] = " + eOuterType + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, eNestedType, eOuterType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[eNestedType] = " + eNestedType + ", " + "[eOuterType] = " + eOuterType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationTypeNestedImpl
					.pattern_AnnotationTypeNested_0_4_collectelementstobetranslated_blackBBB(match, eNestedType,
							eOuterType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eNestedType] = " + eNestedType + ", " + "[eOuterType] = " + eOuterType + ".");
			}
			AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_0_4_collectelementstobetranslated_greenBBBFF(match,
					eNestedType, eOuterType);
			//nothing EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge eOuterType__eNestedType____bodyDeclarations = (EMoflonEdge) result4_green[4];

			Object[] result5_black = AnnotationTypeNestedImpl
					.pattern_AnnotationTypeNested_0_5_collectcontextelements_blackBBB(match, eNestedType, eOuterType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eNestedType] = " + eNestedType + ", " + "[eOuterType] = " + eOuterType + ".");
			}
			AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_0_5_collectcontextelements_greenBB(match, eOuterType);

			// 
			AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_0_6_registerobjectstomatch_expressionBBBB(this, match,
					eNestedType, eOuterType);
			return AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_0_7_expressionF();
		} else {
			return AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		AnnotationTypeDeclaration eNestedType = (AnnotationTypeDeclaration) result1_bindingAndBlack[0];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[1];
		TAbstractType tOuterType = (TAbstractType) result1_bindingAndBlack[2];
		TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result1_bindingAndBlack[3];
		AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result1_bindingAndBlack[4];
		TPackage tOuterPackage = (TPackage) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_1_1_performtransformation_greenBFFBFBBB(eNestedType, typeGraph,
						tOuterType, tOuterPackage, csp);
		ASTNodeToTAnnotatable astNodeToAnnotatable = (ASTNodeToTAnnotatable) result1_green[1];
		TypeToTAbstractType eNestedTypeToTNestedType = (TypeToTAbstractType) result1_green[2];
		TAnnotationType tNestedType = (TAnnotationType) result1_green[4];

		Object[] result2_black = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_1_2_collecttranslatedelements_blackBBBB(eNestedType, astNodeToAnnotatable,
						eNestedTypeToTNestedType, tNestedType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eNestedType] = " + eNestedType
					+ ", " + "[astNodeToAnnotatable] = " + astNodeToAnnotatable + ", " + "[eNestedTypeToTNestedType] = "
					+ eNestedTypeToTNestedType + ", " + "[tNestedType] = " + tNestedType + ".");
		}
		Object[] result2_green = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_1_2_collecttranslatedelements_greenFBBBB(eNestedType,
						astNodeToAnnotatable, eNestedTypeToTNestedType, tNestedType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, eNestedType,
						astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph, tNestedType, tOuterType,
						eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eNestedType] = " + eNestedType + ", " + "[astNodeToAnnotatable] = "
					+ astNodeToAnnotatable + ", " + "[eNestedTypeToTNestedType] = " + eNestedTypeToTNestedType + ", "
					+ "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = " + tNestedType + ", " + "[tOuterType] = "
					+ tOuterType + ", " + "[eOuterTypeToTOuterInterface] = " + eOuterTypeToTOuterInterface + ", "
					+ "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
		}
		AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFFF(
				ruleresult, eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph, tNestedType,
				tOuterType, eOuterType, tOuterPackage);
		//nothing EMoflonEdge astNodeToAnnotatable__eNestedType____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge typeGraph__tNestedType____ownedTypes = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tNestedType__typeGraph____model = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tOuterType__tNestedType____innerTypes = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tNestedType__tOuterType____outerType = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge astNodeToAnnotatable__tNestedType____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge eNestedTypeToTNestedType__eNestedType____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge eOuterType__eNestedType____bodyDeclarations = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge typeGraph__tNestedType____tAnnotationTypes = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tOuterPackage__tNestedType____ownedTypes = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge tNestedType__tOuterPackage____package = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge eNestedTypeToTNestedType__tNestedType____target = (EMoflonEdge) result3_green[21];

		// 
		// 
		AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph, tNestedType,
				tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
		return AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		AnnotationTypeDeclaration eNestedType = (AnnotationTypeDeclaration) result2_binding[0];
		AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_binding[1];
		for (Object[] result2_black : AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_2_2_corematch_blackBFFBB(eNestedType, eOuterType, match)) {
			TAbstractType tOuterType = (TAbstractType) result2_black[1];
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result2_black[2];
			// ForEach 
			for (Object[] result3_black : AnnotationTypeNestedImpl
					.pattern_AnnotationTypeNested_2_3_findcontext_blackBFBBBF(eNestedType, tOuterType,
							eOuterTypeToTOuterInterface, eOuterType)) {
				TypeGraph typeGraph = (TypeGraph) result3_black[1];
				TPackage tOuterPackage = (TPackage) result3_black[5];
				Object[] result3_green = AnnotationTypeNestedImpl
						.pattern_AnnotationTypeNested_2_3_findcontext_greenBBBBBBFFFFFFFFFF(eNestedType, typeGraph,
								tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge tOuterPackage__typeGraph____model = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge eOuterTypeToTOuterInterface__eOuterType____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge typeGraph__tOuterType____ownedTypes = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tOuterType__typeGraph____model = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tOuterType__tOuterPackage____package = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tOuterPackage__tOuterType____ownedTypes = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge eOuterType__eNestedType____bodyDeclarations = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge eOuterTypeToTOuterInterface__tOuterType____target = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = AnnotationTypeNestedImpl
						.pattern_AnnotationTypeNested_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
								tOuterPackage);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eNestedType] = " + eNestedType
							+ ", " + "[typeGraph] = " + typeGraph + ", " + "[tOuterType] = " + tOuterType + ", "
							+ "[eOuterTypeToTOuterInterface] = " + eOuterTypeToTOuterInterface + ", "
							+ "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationTypeNestedImpl
							.pattern_AnnotationTypeNested_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, AnnotationTypeDeclaration eNestedType,
			AbstractTypeDeclaration eOuterType) {
		match.registerObject("eNestedType", eNestedType);
		match.registerObject("eOuterType", eOuterType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, AnnotationTypeDeclaration eNestedType,
			AbstractTypeDeclaration eOuterType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, AnnotationTypeDeclaration eNestedType,
			TypeGraph typeGraph, TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_tOuterType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterType.tName", true, csp);
		var_tOuterType_tName.setValue(tOuterType.getTName());
		var_tOuterType_tName.setType("String");
		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.name", true, csp);
		var_eNestedType_name.setValue(eNestedType.getName());
		var_eNestedType_name.setType("String");

		// Create unbound variables
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", csp);
		var_tNestedType_tName.setType("String");

		// Create constraints
		Concat concat = new Concat();

		csp.getConstraints().add(concat);

		// Solve CSP
		concat.setRuleName("NoRuleName");
		concat.solve(literal0, var_tOuterType_tName, var_eNestedType_name, var_tNestedType_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eNestedType", eNestedType);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tOuterType", tOuterType);
		isApplicableMatch.registerObject("eOuterTypeToTOuterInterface", eOuterTypeToTOuterInterface);
		isApplicableMatch.registerObject("eOuterType", eOuterType);
		isApplicableMatch.registerObject("tOuterPackage", tOuterPackage);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject eNestedType, EObject astNodeToAnnotatable,
			EObject eNestedTypeToTNestedType, EObject typeGraph, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject eOuterType, EObject tOuterPackage) {
		ruleresult.registerObject("eNestedType", eNestedType);
		ruleresult.registerObject("astNodeToAnnotatable", astNodeToAnnotatable);
		ruleresult.registerObject("eNestedTypeToTNestedType", eNestedTypeToTNestedType);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("tNestedType", tNestedType);
		ruleresult.registerObject("tOuterType", tOuterType);
		ruleresult.registerObject("eOuterTypeToTOuterInterface", eOuterTypeToTOuterInterface);
		ruleresult.registerObject("eOuterType", eOuterType);
		ruleresult.registerObject("tOuterPackage", tOuterPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eNestedType").eClass())
				.equals("java.AnnotationTypeDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TypeGraph typeGraph, TAnnotationType tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {

		Object[] result1_black = AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_10_1_initialbindings_blackBBBBBB(
				this, match, typeGraph, tNestedType, tOuterType, tOuterPackage);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = " + tNestedType + ", "
							+ "[tOuterType] = " + tOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, typeGraph, tNestedType,
						tOuterType, tOuterPackage);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = " + tNestedType + ", "
							+ "[tOuterType] = " + tOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationTypeNestedImpl
					.pattern_AnnotationTypeNested_10_4_collectelementstobetranslated_blackBBBBB(match, typeGraph,
							tNestedType, tOuterType, tOuterPackage);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = " + tNestedType + ", "
						+ "[tOuterType] = " + tOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
			}
			AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_10_4_collectelementstobetranslated_greenBBBBBFFFFFFF(
					match, typeGraph, tNestedType, tOuterType, tOuterPackage);
			//nothing EMoflonEdge typeGraph__tNestedType____ownedTypes = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tNestedType__typeGraph____model = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge tOuterType__tNestedType____innerTypes = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tNestedType__tOuterType____outerType = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge typeGraph__tNestedType____tAnnotationTypes = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge tOuterPackage__tNestedType____ownedTypes = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge tNestedType__tOuterPackage____package = (EMoflonEdge) result4_green[11];

			Object[] result5_black = AnnotationTypeNestedImpl
					.pattern_AnnotationTypeNested_10_5_collectcontextelements_blackBBBBB(match, typeGraph, tNestedType,
							tOuterType, tOuterPackage);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = " + tNestedType + ", "
						+ "[tOuterType] = " + tOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
			}
			AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_10_5_collectcontextelements_greenBBBBFFFFF(match,
					typeGraph, tOuterType, tOuterPackage);
			//nothing EMoflonEdge tOuterPackage__typeGraph____model = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge typeGraph__tOuterType____ownedTypes = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge tOuterType__typeGraph____model = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge tOuterType__tOuterPackage____package = (EMoflonEdge) result5_green[7];
			//nothing EMoflonEdge tOuterPackage__tOuterType____ownedTypes = (EMoflonEdge) result5_green[8];

			// 
			AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_10_6_registerobjectstomatch_expressionBBBBBB(this,
					match, typeGraph, tNestedType, tOuterType, tOuterPackage);
			return AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_10_7_expressionF();
		} else {
			return AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[0];
		TAnnotationType tNestedType = (TAnnotationType) result1_bindingAndBlack[1];
		TAbstractType tOuterType = (TAbstractType) result1_bindingAndBlack[2];
		TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result1_bindingAndBlack[3];
		AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result1_bindingAndBlack[4];
		TPackage tOuterPackage = (TPackage) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_11_1_performtransformation_greenFFFBBB(tNestedType, eOuterType, csp);
		AnnotationTypeDeclaration eNestedType = (AnnotationTypeDeclaration) result1_green[0];
		ASTNodeToTAnnotatable astNodeToAnnotatable = (ASTNodeToTAnnotatable) result1_green[1];
		TypeToTAbstractType eNestedTypeToTNestedType = (TypeToTAbstractType) result1_green[2];

		Object[] result2_black = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_11_2_collecttranslatedelements_blackBBBB(eNestedType,
						astNodeToAnnotatable, eNestedTypeToTNestedType, tNestedType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eNestedType] = " + eNestedType
					+ ", " + "[astNodeToAnnotatable] = " + astNodeToAnnotatable + ", " + "[eNestedTypeToTNestedType] = "
					+ eNestedTypeToTNestedType + ", " + "[tNestedType] = " + tNestedType + ".");
		}
		Object[] result2_green = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_11_2_collecttranslatedelements_greenFBBBB(eNestedType,
						astNodeToAnnotatable, eNestedTypeToTNestedType, tNestedType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, eNestedType,
						astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph, tNestedType, tOuterType,
						eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eNestedType] = " + eNestedType + ", " + "[astNodeToAnnotatable] = "
					+ astNodeToAnnotatable + ", " + "[eNestedTypeToTNestedType] = " + eNestedTypeToTNestedType + ", "
					+ "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = " + tNestedType + ", " + "[tOuterType] = "
					+ tOuterType + ", " + "[eOuterTypeToTOuterInterface] = " + eOuterTypeToTOuterInterface + ", "
					+ "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
		}
		AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFFF(
				ruleresult, eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph, tNestedType,
				tOuterType, eOuterType, tOuterPackage);
		//nothing EMoflonEdge astNodeToAnnotatable__eNestedType____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge typeGraph__tNestedType____ownedTypes = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tNestedType__typeGraph____model = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tOuterType__tNestedType____innerTypes = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tNestedType__tOuterType____outerType = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge astNodeToAnnotatable__tNestedType____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge eNestedTypeToTNestedType__eNestedType____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge eOuterType__eNestedType____bodyDeclarations = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge typeGraph__tNestedType____tAnnotationTypes = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tOuterPackage__tNestedType____ownedTypes = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge tNestedType__tOuterPackage____package = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge eNestedTypeToTNestedType__tNestedType____target = (EMoflonEdge) result3_green[21];

		// 
		// 
		AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph, tNestedType,
				tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
		return AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeGraph typeGraph = (TypeGraph) result2_binding[0];
		TAnnotationType tNestedType = (TAnnotationType) result2_binding[1];
		TAbstractType tOuterType = (TAbstractType) result2_binding[2];
		TPackage tOuterPackage = (TPackage) result2_binding[3];
		for (Object[] result2_black : AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_12_2_corematch_blackBBBFFBB(
				typeGraph, tNestedType, tOuterType, tOuterPackage, match)) {
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result2_black[3];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_black[4];
			// ForEach 
			for (Object[] result3_black : AnnotationTypeNestedImpl
					.pattern_AnnotationTypeNested_12_3_findcontext_blackBBBBBB(typeGraph, tNestedType, tOuterType,
							eOuterTypeToTOuterInterface, eOuterType, tOuterPackage)) {
				Object[] result3_green = AnnotationTypeNestedImpl
						.pattern_AnnotationTypeNested_12_3_findcontext_greenBBBBBBFFFFFFFFFFFFFFF(typeGraph,
								tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge tOuterPackage__typeGraph____model = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge eOuterTypeToTOuterInterface__eOuterType____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge typeGraph__tNestedType____ownedTypes = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tNestedType__typeGraph____model = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge typeGraph__tOuterType____ownedTypes = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tOuterType__typeGraph____model = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tOuterType__tNestedType____innerTypes = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tNestedType__tOuterType____outerType = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tOuterType__tOuterPackage____package = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tOuterPackage__tOuterType____ownedTypes = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge typeGraph__tNestedType____tAnnotationTypes = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge tOuterPackage__tNestedType____ownedTypes = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge tNestedType__tOuterPackage____package = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge eOuterTypeToTOuterInterface__tOuterType____target = (EMoflonEdge) result3_green[20];

				Object[] result4_bindingAndBlack = AnnotationTypeNestedImpl
						.pattern_AnnotationTypeNested_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
								tOuterPackage);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[typeGraph] = " + typeGraph + ", "
							+ "[tNestedType] = " + tNestedType + ", " + "[tOuterType] = " + tOuterType + ", "
							+ "[eOuterTypeToTOuterInterface] = " + eOuterTypeToTOuterInterface + ", "
							+ "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationTypeNestedImpl
							.pattern_AnnotationTypeNested_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TypeGraph typeGraph, TAnnotationType tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		match.registerObject("typeGraph", typeGraph);
		match.registerObject("tNestedType", tNestedType);
		match.registerObject("tOuterType", tOuterType);
		match.registerObject("tOuterPackage", tOuterPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph typeGraph, TAnnotationType tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeGraph typeGraph,
			TAnnotationType tNestedType, TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_tOuterType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterType.tName", true, csp);
		var_tOuterType_tName.setValue(tOuterType.getTName());
		var_tOuterType_tName.setType("String");
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", true, csp);
		var_tNestedType_tName.setValue(tNestedType.getTName());
		var_tNestedType_tName.setType("String");

		// Create unbound variables
		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.name", csp);
		var_eNestedType_name.setType("String");

		// Create constraints
		Concat concat = new Concat();

		csp.getConstraints().add(concat);

		// Solve CSP
		concat.setRuleName("NoRuleName");
		concat.solve(literal0, var_tOuterType_tName, var_eNestedType_name, var_tNestedType_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tNestedType", tNestedType);
		isApplicableMatch.registerObject("tOuterType", tOuterType);
		isApplicableMatch.registerObject("eOuterTypeToTOuterInterface", eOuterTypeToTOuterInterface);
		isApplicableMatch.registerObject("eOuterType", eOuterType);
		isApplicableMatch.registerObject("tOuterPackage", tOuterPackage);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject eNestedType, EObject astNodeToAnnotatable,
			EObject eNestedTypeToTNestedType, EObject typeGraph, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject eOuterType, EObject tOuterPackage) {
		ruleresult.registerObject("eNestedType", eNestedType);
		ruleresult.registerObject("astNodeToAnnotatable", astNodeToAnnotatable);
		ruleresult.registerObject("eNestedTypeToTNestedType", eNestedTypeToTNestedType);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("tNestedType", tNestedType);
		ruleresult.registerObject("tOuterType", tOuterType);
		ruleresult.registerObject("eOuterTypeToTOuterInterface", eOuterTypeToTOuterInterface);
		ruleresult.registerObject("eOuterType", eOuterType);
		ruleresult.registerObject("tOuterPackage", tOuterPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tNestedType").eClass())
				.equals("basic.annotations.TAnnotationType.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_76(EMoflonEdge _edge_ownedTypes) {

		Object[] result1_bindingAndBlack = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_20_2_testcorematchandDECs_blackFFFFB(_edge_ownedTypes)) {
			TypeGraph typeGraph = (TypeGraph) result2_black[0];
			TAnnotationType tNestedType = (TAnnotationType) result2_black[1];
			TAbstractType tOuterType = (TAbstractType) result2_black[2];
			TPackage tOuterPackage = (TPackage) result2_black[3];
			Object[] result2_green = AnnotationTypeNestedImpl
					.pattern_AnnotationTypeNested_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationTypeNestedImpl
					.pattern_AnnotationTypeNested_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, typeGraph, tNestedType, tOuterType, tOuterPackage)) {
				// 
				if (AnnotationTypeNestedImpl
						.pattern_AnnotationTypeNested_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationTypeNestedImpl
							.pattern_AnnotationTypeNested_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_79(EMoflonEdge _edge_abstractTypeDeclaration) {

		Object[] result1_bindingAndBlack = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_21_2_testcorematchandDECs_blackFFB(_edge_abstractTypeDeclaration)) {
			AnnotationTypeDeclaration eNestedType = (AnnotationTypeDeclaration) result2_black[0];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_black[1];
			Object[] result2_green = AnnotationTypeNestedImpl
					.pattern_AnnotationTypeNested_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationTypeNestedImpl
					.pattern_AnnotationTypeNested_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, eNestedType, eOuterType)) {
				// 
				if (AnnotationTypeNestedImpl
						.pattern_AnnotationTypeNested_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationTypeNestedImpl
							.pattern_AnnotationTypeNested_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnnotationTypeNested");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType", true, csp);
		var_eNestedType_name.setValue(__helper.getValue("eNestedType", "name"));
		var_eNestedType_name.setType("String");

		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_tName.setValue(__helper.getValue("tNestedType", "tName"));
		var_tNestedType_tName.setType("String");

		Variable var_tOuterType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterType", true, csp);
		var_tOuterType_tName.setValue(__helper.getValue("tOuterType", "tName"));
		var_tOuterType_tName.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$");
		var_literal0.setType("");

		Concat concat0 = new Concat();
		csp.getConstraints().add(concat0);

		concat0.setRuleName("AnnotationTypeNested");
		concat0.solve(var_literal0, var_tOuterType_tName, var_eNestedType_name, var_tNestedType_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tNestedType_tName.setBound(false);
			concat0.solve(var_literal0, var_tOuterType_tName, var_eNestedType_name, var_tNestedType_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tNestedType", "tName", var_tNestedType_tName.getValue());
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
		ruleResult.setRule("AnnotationTypeNested");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType", true, csp);
		var_eNestedType_name.setValue(__helper.getValue("eNestedType", "name"));
		var_eNestedType_name.setType("String");

		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_tName.setValue(__helper.getValue("tNestedType", "tName"));
		var_tNestedType_tName.setType("String");

		Variable var_tOuterType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterType", true, csp);
		var_tOuterType_tName.setValue(__helper.getValue("tOuterType", "tName"));
		var_tOuterType_tName.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$");
		var_literal0.setType("");

		Concat concat0 = new Concat();
		csp.getConstraints().add(concat0);

		concat0.setRuleName("AnnotationTypeNested");
		concat0.solve(var_literal0, var_tOuterType_tName, var_eNestedType_name, var_tNestedType_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_eNestedType_name.setBound(false);
			concat0.solve(var_literal0, var_tOuterType_tName, var_eNestedType_name, var_tNestedType_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("eNestedType", "name", var_eNestedType_name.getValue());
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

		Object[] result1_black = AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		AnnotationTypeDeclaration eNestedType = (AnnotationTypeDeclaration) result2_bindingAndBlack[0];
		TypeGraph typeGraph = (TypeGraph) result2_bindingAndBlack[1];
		TAnnotationType tNestedType = (TAnnotationType) result2_bindingAndBlack[2];
		TAbstractType tOuterType = (TAbstractType) result2_bindingAndBlack[3];
		AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_bindingAndBlack[4];
		TPackage tOuterPackage = (TPackage) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, eNestedType, typeGraph,
						tNestedType, tOuterType, eOuterType, tOuterPackage, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[eNestedType] = " + eNestedType + ", " + "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = "
					+ tNestedType + ", " + "[tOuterType] = " + tOuterType + ", " + "[eOuterType] = " + eOuterType + ", "
					+ "[tOuterPackage] = " + tOuterPackage + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnnotationTypeNestedImpl
					.pattern_AnnotationTypeNested_24_5_matchcorrcontext_blackBFBBB(tOuterType, eOuterType, sourceMatch,
							targetMatch)) {
				TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result5_black[1];
				Object[] result5_green = AnnotationTypeNestedImpl
						.pattern_AnnotationTypeNested_24_5_matchcorrcontext_greenBBBF(eOuterTypeToTOuterInterface,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = AnnotationTypeNestedImpl
						.pattern_AnnotationTypeNested_24_6_createcorrespondence_blackBBBBBBB(eNestedType, typeGraph,
								tNestedType, tOuterType, eOuterType, tOuterPackage, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[eNestedType] = " + eNestedType + ", "
									+ "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = " + tNestedType + ", "
									+ "[tOuterType] = " + tOuterType + ", " + "[eOuterType] = " + eOuterType + ", "
									+ "[tOuterPackage] = " + tOuterPackage + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_24_6_createcorrespondence_greenBFFBB(eNestedType,
						tNestedType, ccMatch);
				//nothing ASTNodeToTAnnotatable astNodeToAnnotatable = (ASTNodeToTAnnotatable) result6_green[1];
				//nothing TypeToTAbstractType eNestedTypeToTNestedType = (TypeToTAbstractType) result6_green[2];

				Object[] result7_black = AnnotationTypeNestedImpl
						.pattern_AnnotationTypeNested_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(AnnotationTypeDeclaration eNestedType, TypeGraph typeGraph,
			TAnnotationType tNestedType, TAbstractType tOuterType, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_tOuterType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterType.tName", true, csp);
		var_tOuterType_tName.setValue(tOuterType.getTName());
		var_tOuterType_tName.setType("String");
		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.name", true, csp);
		var_eNestedType_name.setValue(eNestedType.getName());
		var_eNestedType_name.setType("String");
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", true, csp);
		var_tNestedType_tName.setValue(tNestedType.getTName());
		var_tNestedType_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Concat concat = new Concat();

		csp.getConstraints().add(concat);

		// Solve CSP
		concat.setRuleName("NoRuleName");
		concat.solve(literal0, var_tOuterType_tName, var_eNestedType_name, var_tNestedType_tName);
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
	public boolean checkDEC_FWD(AnnotationTypeDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {// 
		Object[] result1_black = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_27_1_matchtggpattern_blackBB(eNestedType, eOuterType);
		if (result1_black != null) {
			return AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_27_2_expressionF();
		} else {
			return AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TypeGraph typeGraph, TAnnotationType tNestedType, TAbstractType tOuterType,
			TPackage tOuterPackage) {// 
		Object[] result1_black = AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_28_1_matchtggpattern_blackBBBB(
				typeGraph, tNestedType, tOuterType, tOuterPackage);
		if (result1_black != null) {
			return AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_28_2_expressionF();
		} else {
			return AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType eOuterTypeToTOuterInterfaceParameter) {

		Object[] result1_black = AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_29_2_isapplicablecore_blackFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList eOuterTypeToTOuterInterfaceList = (RuleEntryList) result2_black[0];
			TypeGraph typeGraph = (TypeGraph) result2_black[1];
			TAbstractType tOuterType = (TAbstractType) result2_black[2];
			TPackage tOuterPackage = (TPackage) result2_black[3];
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result2_black[4];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_black[5];

			Object[] result3_bindingAndBlack = AnnotationTypeNestedImpl
					.pattern_AnnotationTypeNested_29_3_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
							typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[typeGraph] = " + typeGraph + ", "
						+ "[tOuterType] = " + tOuterType + ", " + "[eOuterTypeToTOuterInterface] = "
						+ eOuterTypeToTOuterInterface + ", " + "[eOuterType] = " + eOuterType + ", "
						+ "[tOuterPackage] = " + tOuterPackage + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = AnnotationTypeNestedImpl
						.pattern_AnnotationTypeNested_29_5_checknacs_blackBBBBB(typeGraph, tOuterType,
								eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
				if (result5_black != null) {

					Object[] result6_black = AnnotationTypeNestedImpl
							.pattern_AnnotationTypeNested_29_6_perform_blackBBBBBB(typeGraph, tOuterType,
									eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[typeGraph] = "
								+ typeGraph + ", " + "[tOuterType] = " + tOuterType + ", "
								+ "[eOuterTypeToTOuterInterface] = " + eOuterTypeToTOuterInterface + ", "
								+ "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_29_6_perform_greenFFFBFBBBBB(typeGraph,
							tOuterType, eOuterType, tOuterPackage, ruleResult, csp);
					//nothing AnnotationTypeDeclaration eNestedType = (AnnotationTypeDeclaration) result6_green[0];
					//nothing ASTNodeToTAnnotatable astNodeToAnnotatable = (ASTNodeToTAnnotatable) result6_green[1];
					//nothing TypeToTAbstractType eNestedTypeToTNestedType = (TypeToTAbstractType) result6_green[2];
					//nothing TAnnotationType tNestedType = (TAnnotationType) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeGraph typeGraph,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_tOuterType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterType.tName", true, csp);
		var_tOuterType_tName.setValue(tOuterType.getTName());
		var_tOuterType_tName.setType("String");

		// Create unbound variables
		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.name", csp);
		var_eNestedType_name.setType("String");
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", csp);
		var_tNestedType_tName.setType("String");

		// Create constraints
		Concat concat = new Concat();

		csp.getConstraints().add(concat);

		// Solve CSP
		concat.setRuleName("NoRuleName");
		concat.solve(literal0, var_tOuterType_tName, var_eNestedType_name, var_tNestedType_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tOuterType", tOuterType);
		isApplicableMatch.registerObject("eOuterTypeToTOuterInterface", eOuterTypeToTOuterInterface);
		isApplicableMatch.registerObject("eOuterType", eOuterType);
		isApplicableMatch.registerObject("tOuterPackage", tOuterPackage);
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
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPROPRIATE_FWD__MATCH_ANNOTATIONTYPEDECLARATION_ABSTRACTTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (AnnotationTypeDeclaration) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.ANNOTATION_TYPE_NESTED___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ANNOTATIONTYPEDECLARATION_ABSTRACTTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (AnnotationTypeDeclaration) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
			return null;
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ANNOTATIONTYPEDECLARATION_ABSTRACTTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (AnnotationTypeDeclaration) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ANNOTATIONTYPEDECLARATION_TYPEGRAPH_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TPACKAGE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(AnnotationTypeDeclaration) arguments.get(1), (TypeGraph) arguments.get(2),
					(TAbstractType) arguments.get(3), (TypeToTAbstractType) arguments.get(4),
					(AbstractTypeDeclaration) arguments.get(5), (TPackage) arguments.get(6));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.ANNOTATION_TYPE_NESTED___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TANNOTATIONTYPE_TABSTRACTTYPE_TPACKAGE:
			return isAppropriate_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAnnotationType) arguments.get(2), (TAbstractType) arguments.get(3), (TPackage) arguments.get(4));
		case RulesPackage.ANNOTATION_TYPE_NESTED___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TANNOTATIONTYPE_TABSTRACTTYPE_TPACKAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAnnotationType) arguments.get(2), (TAbstractType) arguments.get(3), (TPackage) arguments.get(4));
			return null;
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TANNOTATIONTYPE_TABSTRACTTYPE_TPACKAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAnnotationType) arguments.get(2), (TAbstractType) arguments.get(3), (TPackage) arguments.get(4));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_TANNOTATIONTYPE_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TPACKAGE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAnnotationType) arguments.get(2), (TAbstractType) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (AbstractTypeDeclaration) arguments.get(5),
					(TPackage) arguments.get(6));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.ANNOTATION_TYPE_NESTED___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPROPRIATE_BWD_EMOFLON_EDGE_76__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_76((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPROPRIATE_FWD_EMOFLON_EDGE_79__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_79((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPLICABLE_SOLVE_CSP_CC__ANNOTATIONTYPEDECLARATION_TYPEGRAPH_TANNOTATIONTYPE_TABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TPACKAGE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((AnnotationTypeDeclaration) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAnnotationType) arguments.get(2), (TAbstractType) arguments.get(3),
					(AbstractTypeDeclaration) arguments.get(4), (TPackage) arguments.get(5), (Match) arguments.get(6),
					(Match) arguments.get(7));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___CHECK_DEC_FWD__ANNOTATIONTYPEDECLARATION_ABSTRACTTYPEDECLARATION:
			return checkDEC_FWD((AnnotationTypeDeclaration) arguments.get(0),
					(AbstractTypeDeclaration) arguments.get(1));
		case RulesPackage.ANNOTATION_TYPE_NESTED___CHECK_DEC_BWD__TYPEGRAPH_TANNOTATIONTYPE_TABSTRACTTYPE_TPACKAGE:
			return checkDEC_BWD((TypeGraph) arguments.get(0), (TAnnotationType) arguments.get(1),
					(TAbstractType) arguments.get(2), (TPackage) arguments.get(3));
		case RulesPackage.ANNOTATION_TYPE_NESTED___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1));
		case RulesPackage.ANNOTATION_TYPE_NESTED___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TPACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAbstractType) arguments.get(2), (TypeToTAbstractType) arguments.get(3),
					(AbstractTypeDeclaration) arguments.get(4), (TPackage) arguments.get(5),
					(ModelgeneratorRuleResult) arguments.get(6));
		case RulesPackage.ANNOTATION_TYPE_NESTED___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnnotationTypeNested_0_1_initialbindings_blackBBBB(AnnotationTypeNested _this,
			Match match, AnnotationTypeDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		if (!eNestedType.equals(eOuterType)) {
			return new Object[] { _this, match, eNestedType, eOuterType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_0_2_SolveCSP_bindingFBBBB(AnnotationTypeNested _this,
			Match match, AnnotationTypeDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eNestedType, eOuterType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eNestedType, eOuterType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeNested_0_2_SolveCSP_bindingAndBlackFBBBB(
			AnnotationTypeNested _this, Match match, AnnotationTypeDeclaration eNestedType,
			AbstractTypeDeclaration eOuterType) {
		Object[] result_pattern_AnnotationTypeNested_0_2_SolveCSP_binding = pattern_AnnotationTypeNested_0_2_SolveCSP_bindingFBBBB(
				_this, match, eNestedType, eOuterType);
		if (result_pattern_AnnotationTypeNested_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeNested_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeNested_0_2_SolveCSP_black = pattern_AnnotationTypeNested_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeNested_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eNestedType, eOuterType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeNested_0_3_CheckCSP_expressionFBB(AnnotationTypeNested _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_0_4_collectelementstobetranslated_blackBBB(Match match,
			AnnotationTypeDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		if (!eNestedType.equals(eOuterType)) {
			return new Object[] { match, eNestedType, eOuterType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			AnnotationTypeDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterType__eNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eNestedType);
		String eNestedType__eOuterType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String eOuterType__eNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		eNestedType__eOuterType____abstractTypeDeclaration.setSrc(eNestedType);
		eNestedType__eOuterType____abstractTypeDeclaration.setTrg(eOuterType);
		match.getToBeTranslatedEdges().add(eNestedType__eOuterType____abstractTypeDeclaration);
		eOuterType__eNestedType____bodyDeclarations.setSrc(eOuterType);
		eOuterType__eNestedType____bodyDeclarations.setTrg(eNestedType);
		match.getToBeTranslatedEdges().add(eOuterType__eNestedType____bodyDeclarations);
		eNestedType__eOuterType____abstractTypeDeclaration
				.setName(eNestedType__eOuterType____abstractTypeDeclaration_name_prime);
		eOuterType__eNestedType____bodyDeclarations.setName(eOuterType__eNestedType____bodyDeclarations_name_prime);
		return new Object[] { match, eNestedType, eOuterType, eNestedType__eOuterType____abstractTypeDeclaration,
				eOuterType__eNestedType____bodyDeclarations };
	}

	public static final Object[] pattern_AnnotationTypeNested_0_5_collectcontextelements_blackBBB(Match match,
			AnnotationTypeDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		if (!eNestedType.equals(eOuterType)) {
			return new Object[] { match, eNestedType, eOuterType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_0_5_collectcontextelements_greenBB(Match match,
			AbstractTypeDeclaration eOuterType) {
		match.getContextNodes().add(eOuterType);
		return new Object[] { match, eOuterType };
	}

	public static final void pattern_AnnotationTypeNested_0_6_registerobjectstomatch_expressionBBBB(
			AnnotationTypeNested _this, Match match, AnnotationTypeDeclaration eNestedType,
			AbstractTypeDeclaration eOuterType) {
		_this.registerObjectsToMatch_FWD(match, eNestedType, eOuterType);

	}

	public static final boolean pattern_AnnotationTypeNested_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeNested_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eNestedType");
		EObject _localVariable_1 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_2 = isApplicableMatch.getObject("tOuterType");
		EObject _localVariable_3 = isApplicableMatch.getObject("eOuterTypeToTOuterInterface");
		EObject _localVariable_4 = isApplicableMatch.getObject("eOuterType");
		EObject _localVariable_5 = isApplicableMatch.getObject("tOuterPackage");
		EObject tmpENestedType = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpTOuterType = _localVariable_2;
		EObject tmpEOuterTypeToTOuterInterface = _localVariable_3;
		EObject tmpEOuterType = _localVariable_4;
		EObject tmpTOuterPackage = _localVariable_5;
		if (tmpENestedType instanceof AnnotationTypeDeclaration) {
			AnnotationTypeDeclaration eNestedType = (AnnotationTypeDeclaration) tmpENestedType;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpTOuterType instanceof TAbstractType) {
					TAbstractType tOuterType = (TAbstractType) tmpTOuterType;
					if (tmpEOuterTypeToTOuterInterface instanceof TypeToTAbstractType) {
						TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) tmpEOuterTypeToTOuterInterface;
						if (tmpEOuterType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
							if (tmpTOuterPackage instanceof TPackage) {
								TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
								return new Object[] { eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface,
										eOuterType, tOuterPackage, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_1_1_performtransformation_blackBBBBBBFBB(
			AnnotationTypeDeclaration eNestedType, TypeGraph typeGraph, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			AnnotationTypeNested _this, IsApplicableMatch isApplicableMatch) {
		if (!eNestedType.equals(eOuterType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
							tOuterPackage, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			AnnotationTypeNested _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationTypeNested_1_1_performtransformation_binding = pattern_AnnotationTypeNested_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationTypeNested_1_1_performtransformation_binding != null) {
			AnnotationTypeDeclaration eNestedType = (AnnotationTypeDeclaration) result_pattern_AnnotationTypeNested_1_1_performtransformation_binding[0];
			TypeGraph typeGraph = (TypeGraph) result_pattern_AnnotationTypeNested_1_1_performtransformation_binding[1];
			TAbstractType tOuterType = (TAbstractType) result_pattern_AnnotationTypeNested_1_1_performtransformation_binding[2];
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result_pattern_AnnotationTypeNested_1_1_performtransformation_binding[3];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result_pattern_AnnotationTypeNested_1_1_performtransformation_binding[4];
			TPackage tOuterPackage = (TPackage) result_pattern_AnnotationTypeNested_1_1_performtransformation_binding[5];

			Object[] result_pattern_AnnotationTypeNested_1_1_performtransformation_black = pattern_AnnotationTypeNested_1_1_performtransformation_blackBBBBBBFBB(
					eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, _this,
					isApplicableMatch);
			if (result_pattern_AnnotationTypeNested_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationTypeNested_1_1_performtransformation_black[6];

				return new Object[] { eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
						tOuterPackage, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_1_1_performtransformation_greenBFFBFBBB(
			AnnotationTypeDeclaration eNestedType, TypeGraph typeGraph, TAbstractType tOuterType,
			TPackage tOuterPackage, CSP csp) {
		ASTNodeToTAnnotatable astNodeToAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeToTAbstractType eNestedTypeToTNestedType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		TAnnotationType tNestedType = AnnotationsFactory.eINSTANCE.createTAnnotationType();
		Object _localVariable_0 = csp.getValue("tNestedType", "tName");
		astNodeToAnnotatable.setSource(eNestedType);
		eNestedTypeToTNestedType.setSource(eNestedType);
		typeGraph.getOwnedTypes().add(tNestedType);
		tOuterType.getInnerTypes().add(tNestedType);
		astNodeToAnnotatable.setTarget(tNestedType);
		typeGraph.getTAnnotationTypes().add(tNestedType);
		tOuterPackage.getOwnedTypes().add(tNestedType);
		eNestedTypeToTNestedType.setTarget(tNestedType);
		String tNestedType_tName_prime = (String) _localVariable_0;
		tNestedType.setTName(tNestedType_tName_prime);
		return new Object[] { eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph, tNestedType,
				tOuterType, tOuterPackage, csp };
	}

	public static final Object[] pattern_AnnotationTypeNested_1_2_collecttranslatedelements_blackBBBB(
			AnnotationTypeDeclaration eNestedType, ASTNodeToTAnnotatable astNodeToAnnotatable,
			TypeToTAbstractType eNestedTypeToTNestedType, TAnnotationType tNestedType) {
		return new Object[] { eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, tNestedType };
	}

	public static final Object[] pattern_AnnotationTypeNested_1_2_collecttranslatedelements_greenFBBBB(
			AnnotationTypeDeclaration eNestedType, ASTNodeToTAnnotatable astNodeToAnnotatable,
			TypeToTAbstractType eNestedTypeToTNestedType, TAnnotationType tNestedType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(eNestedType);
		ruleresult.getCreatedLinkElements().add(astNodeToAnnotatable);
		ruleresult.getCreatedLinkElements().add(eNestedTypeToTNestedType);
		ruleresult.getCreatedElements().add(tNestedType);
		return new Object[] { ruleresult, eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, tNestedType };
	}

	public static final Object[] pattern_AnnotationTypeNested_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject eNestedType, EObject astNodeToAnnotatable,
			EObject eNestedTypeToTNestedType, EObject typeGraph, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject eOuterType, EObject tOuterPackage) {
		if (!eNestedType.equals(eNestedTypeToTNestedType)) {
			if (!eNestedType.equals(typeGraph)) {
				if (!eNestedType.equals(tNestedType)) {
					if (!eNestedType.equals(tOuterType)) {
						if (!eNestedType.equals(eOuterTypeToTOuterInterface)) {
							if (!eNestedType.equals(eOuterType)) {
								if (!eNestedType.equals(tOuterPackage)) {
									if (!astNodeToAnnotatable.equals(eNestedType)) {
										if (!astNodeToAnnotatable.equals(eNestedTypeToTNestedType)) {
											if (!astNodeToAnnotatable.equals(typeGraph)) {
												if (!astNodeToAnnotatable.equals(tNestedType)) {
													if (!astNodeToAnnotatable.equals(tOuterType)) {
														if (!astNodeToAnnotatable.equals(eOuterTypeToTOuterInterface)) {
															if (!astNodeToAnnotatable.equals(eOuterType)) {
																if (!astNodeToAnnotatable.equals(tOuterPackage)) {
																	if (!eNestedTypeToTNestedType.equals(typeGraph)) {
																		if (!eNestedTypeToTNestedType
																				.equals(tNestedType)) {
																			if (!eNestedTypeToTNestedType
																					.equals(tOuterType)) {
																				if (!eNestedTypeToTNestedType.equals(
																						eOuterTypeToTOuterInterface)) {
																					if (!eNestedTypeToTNestedType
																							.equals(eOuterType)) {
																						if (!eNestedTypeToTNestedType
																								.equals(tOuterPackage)) {
																							if (!tNestedType.equals(
																									typeGraph)) {
																								if (!tNestedType.equals(
																										tOuterType)) {
																									if (!tNestedType
																											.equals(tOuterPackage)) {
																										if (!tOuterType
																												.equals(typeGraph)) {
																											if (!eOuterTypeToTOuterInterface
																													.equals(typeGraph)) {
																												if (!eOuterTypeToTOuterInterface
																														.equals(tNestedType)) {
																													if (!eOuterTypeToTOuterInterface
																															.equals(tOuterType)) {
																														if (!eOuterTypeToTOuterInterface
																																.equals(tOuterPackage)) {
																															if (!eOuterType
																																	.equals(typeGraph)) {
																																if (!eOuterType
																																		.equals(tNestedType)) {
																																	if (!eOuterType
																																			.equals(tOuterType)) {
																																		if (!eOuterType
																																				.equals(eOuterTypeToTOuterInterface)) {
																																			if (!eOuterType
																																					.equals(tOuterPackage)) {
																																				if (!tOuterPackage
																																						.equals(typeGraph)) {
																																					if (!tOuterPackage
																																							.equals(tOuterType)) {
																																						return new Object[] {
																																								ruleresult,
																																								eNestedType,
																																								astNodeToAnnotatable,
																																								eNestedTypeToTNestedType,
																																								typeGraph,
																																								tNestedType,
																																								tOuterType,
																																								eOuterTypeToTOuterInterface,
																																								eOuterType,
																																								tOuterPackage };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationTypeNested_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject eNestedType, EObject astNodeToAnnotatable,
			EObject eNestedTypeToTNestedType, EObject typeGraph, EObject tNestedType, EObject tOuterType,
			EObject eOuterType, EObject tOuterPackage) {
		EMoflonEdge astNodeToAnnotatable__eNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tNestedType____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge astNodeToAnnotatable__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedTypeToTNestedType__eNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterType__eNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____tAnnotationTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedTypeToTNestedType__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationTypeNested";
		String astNodeToAnnotatable__eNestedType____source_name_prime = "source";
		String typeGraph__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__typeGraph____model_name_prime = "model";
		String tOuterType__tNestedType____innerTypes_name_prime = "innerTypes";
		String tNestedType__tOuterType____outerType_name_prime = "outerType";
		String astNodeToAnnotatable__tNestedType____target_name_prime = "target";
		String eNestedTypeToTNestedType__eNestedType____source_name_prime = "source";
		String eNestedType__eOuterType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String eOuterType__eNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		String typeGraph__tNestedType____tAnnotationTypes_name_prime = "tAnnotationTypes";
		String tOuterPackage__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__tOuterPackage____package_name_prime = "package";
		String eNestedTypeToTNestedType__tNestedType____target_name_prime = "target";
		astNodeToAnnotatable__eNestedType____source.setSrc(astNodeToAnnotatable);
		astNodeToAnnotatable__eNestedType____source.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(astNodeToAnnotatable__eNestedType____source);
		typeGraph__tNestedType____ownedTypes.setSrc(typeGraph);
		typeGraph__tNestedType____ownedTypes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(typeGraph__tNestedType____ownedTypes);
		tNestedType__typeGraph____model.setSrc(tNestedType);
		tNestedType__typeGraph____model.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(tNestedType__typeGraph____model);
		tOuterType__tNestedType____innerTypes.setSrc(tOuterType);
		tOuterType__tNestedType____innerTypes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(tOuterType__tNestedType____innerTypes);
		tNestedType__tOuterType____outerType.setSrc(tNestedType);
		tNestedType__tOuterType____outerType.setTrg(tOuterType);
		ruleresult.getCreatedEdges().add(tNestedType__tOuterType____outerType);
		astNodeToAnnotatable__tNestedType____target.setSrc(astNodeToAnnotatable);
		astNodeToAnnotatable__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(astNodeToAnnotatable__tNestedType____target);
		eNestedTypeToTNestedType__eNestedType____source.setSrc(eNestedTypeToTNestedType);
		eNestedTypeToTNestedType__eNestedType____source.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(eNestedTypeToTNestedType__eNestedType____source);
		eNestedType__eOuterType____abstractTypeDeclaration.setSrc(eNestedType);
		eNestedType__eOuterType____abstractTypeDeclaration.setTrg(eOuterType);
		ruleresult.getTranslatedEdges().add(eNestedType__eOuterType____abstractTypeDeclaration);
		eOuterType__eNestedType____bodyDeclarations.setSrc(eOuterType);
		eOuterType__eNestedType____bodyDeclarations.setTrg(eNestedType);
		ruleresult.getTranslatedEdges().add(eOuterType__eNestedType____bodyDeclarations);
		typeGraph__tNestedType____tAnnotationTypes.setSrc(typeGraph);
		typeGraph__tNestedType____tAnnotationTypes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(typeGraph__tNestedType____tAnnotationTypes);
		tOuterPackage__tNestedType____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tNestedType____ownedTypes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(tOuterPackage__tNestedType____ownedTypes);
		tNestedType__tOuterPackage____package.setSrc(tNestedType);
		tNestedType__tOuterPackage____package.setTrg(tOuterPackage);
		ruleresult.getCreatedEdges().add(tNestedType__tOuterPackage____package);
		eNestedTypeToTNestedType__tNestedType____target.setSrc(eNestedTypeToTNestedType);
		eNestedTypeToTNestedType__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(eNestedTypeToTNestedType__tNestedType____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		astNodeToAnnotatable__eNestedType____source.setName(astNodeToAnnotatable__eNestedType____source_name_prime);
		typeGraph__tNestedType____ownedTypes.setName(typeGraph__tNestedType____ownedTypes_name_prime);
		tNestedType__typeGraph____model.setName(tNestedType__typeGraph____model_name_prime);
		tOuterType__tNestedType____innerTypes.setName(tOuterType__tNestedType____innerTypes_name_prime);
		tNestedType__tOuterType____outerType.setName(tNestedType__tOuterType____outerType_name_prime);
		astNodeToAnnotatable__tNestedType____target.setName(astNodeToAnnotatable__tNestedType____target_name_prime);
		eNestedTypeToTNestedType__eNestedType____source
				.setName(eNestedTypeToTNestedType__eNestedType____source_name_prime);
		eNestedType__eOuterType____abstractTypeDeclaration
				.setName(eNestedType__eOuterType____abstractTypeDeclaration_name_prime);
		eOuterType__eNestedType____bodyDeclarations.setName(eOuterType__eNestedType____bodyDeclarations_name_prime);
		typeGraph__tNestedType____tAnnotationTypes.setName(typeGraph__tNestedType____tAnnotationTypes_name_prime);
		tOuterPackage__tNestedType____ownedTypes.setName(tOuterPackage__tNestedType____ownedTypes_name_prime);
		tNestedType__tOuterPackage____package.setName(tNestedType__tOuterPackage____package_name_prime);
		eNestedTypeToTNestedType__tNestedType____target
				.setName(eNestedTypeToTNestedType__tNestedType____target_name_prime);
		return new Object[] { ruleresult, eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph,
				tNestedType, tOuterType, eOuterType, tOuterPackage, astNodeToAnnotatable__eNestedType____source,
				typeGraph__tNestedType____ownedTypes, tNestedType__typeGraph____model,
				tOuterType__tNestedType____innerTypes, tNestedType__tOuterType____outerType,
				astNodeToAnnotatable__tNestedType____target, eNestedTypeToTNestedType__eNestedType____source,
				eNestedType__eOuterType____abstractTypeDeclaration, eOuterType__eNestedType____bodyDeclarations,
				typeGraph__tNestedType____tAnnotationTypes, tOuterPackage__tNestedType____ownedTypes,
				tNestedType__tOuterPackage____package, eNestedTypeToTNestedType__tNestedType____target };
	}

	public static final void pattern_AnnotationTypeNested_1_5_registerobjects_expressionBBBBBBBBBBB(
			AnnotationTypeNested _this, PerformRuleResult ruleresult, EObject eNestedType, EObject astNodeToAnnotatable,
			EObject eNestedTypeToTNestedType, EObject typeGraph, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject eOuterType, EObject tOuterPackage) {
		_this.registerObjects_FWD(ruleresult, eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph,
				tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);

	}

	public static final PerformRuleResult pattern_AnnotationTypeNested_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_2_1_preparereturnvalue_bindingFB(
			AnnotationTypeNested _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationTypeNested _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationTypeNested _this) {
		Object[] result_pattern_AnnotationTypeNested_2_1_preparereturnvalue_binding = pattern_AnnotationTypeNested_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeNested_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationTypeNested_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeNested_2_1_preparereturnvalue_black = pattern_AnnotationTypeNested_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationTypeNested_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationTypeNested_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationTypeNested";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationTypeNested_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("eNestedType");
		EObject _localVariable_1 = match.getObject("eOuterType");
		EObject tmpENestedType = _localVariable_0;
		EObject tmpEOuterType = _localVariable_1;
		if (tmpENestedType instanceof AnnotationTypeDeclaration) {
			AnnotationTypeDeclaration eNestedType = (AnnotationTypeDeclaration) tmpENestedType;
			if (tmpEOuterType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
				return new Object[] { eNestedType, eOuterType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeNested_2_2_corematch_blackBFFBB(
			AnnotationTypeDeclaration eNestedType, AbstractTypeDeclaration eOuterType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eNestedType.equals(eOuterType)) {
			for (TypeToTAbstractType eOuterTypeToTOuterInterface : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eOuterType, TypeToTAbstractType.class, "source")) {
				TAbstractType tOuterType = eOuterTypeToTOuterInterface.getTarget();
				if (tOuterType != null) {
					_result.add(
							new Object[] { eNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeNested_2_3_findcontext_blackBFBBBF(
			AnnotationTypeDeclaration eNestedType, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eNestedType.equals(eOuterType)) {
			if (eOuterType.equals(eOuterTypeToTOuterInterface.getSource())) {
				if (eOuterType.equals(eNestedType.getAbstractTypeDeclaration())) {
					if (tOuterType.equals(eOuterTypeToTOuterInterface.getTarget())) {
						TypeGraph typeGraph = tOuterType.getModel();
						if (typeGraph != null) {
							TPackage tOuterPackage = tOuterType.getPackage();
							if (tOuterPackage != null) {
								if (typeGraph.equals(tOuterPackage.getModel())) {
									_result.add(new Object[] { eNestedType, typeGraph, tOuterType,
											eOuterTypeToTOuterInterface, eOuterType, tOuterPackage });
								}
							}

						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_2_3_findcontext_greenBBBBBBFFFFFFFFFF(
			AnnotationTypeDeclaration eNestedType, TypeGraph typeGraph, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tOuterPackage__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterTypeToTOuterInterface__eOuterType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterType__eNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterTypeToTOuterInterface__tOuterType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tOuterPackage__typeGraph____model_name_prime = "model";
		String eOuterTypeToTOuterInterface__eOuterType____source_name_prime = "source";
		String typeGraph__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String tOuterType__typeGraph____model_name_prime = "model";
		String tOuterType__tOuterPackage____package_name_prime = "package";
		String tOuterPackage__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String eNestedType__eOuterType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String eOuterType__eNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		String eOuterTypeToTOuterInterface__tOuterType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(eNestedType);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface);
		isApplicableMatch.getAllContextElements().add(eOuterType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage);
		tOuterPackage__typeGraph____model.setSrc(tOuterPackage);
		tOuterPackage__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__typeGraph____model);
		eOuterTypeToTOuterInterface__eOuterType____source.setSrc(eOuterTypeToTOuterInterface);
		eOuterTypeToTOuterInterface__eOuterType____source.setTrg(eOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface__eOuterType____source);
		typeGraph__tOuterType____ownedTypes.setSrc(typeGraph);
		typeGraph__tOuterType____ownedTypes.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(typeGraph__tOuterType____ownedTypes);
		tOuterType__typeGraph____model.setSrc(tOuterType);
		tOuterType__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterType__typeGraph____model);
		tOuterType__tOuterPackage____package.setSrc(tOuterType);
		tOuterType__tOuterPackage____package.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tOuterType__tOuterPackage____package);
		tOuterPackage__tOuterType____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterType____ownedTypes.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tOuterType____ownedTypes);
		eNestedType__eOuterType____abstractTypeDeclaration.setSrc(eNestedType);
		eNestedType__eOuterType____abstractTypeDeclaration.setTrg(eOuterType);
		isApplicableMatch.getAllContextElements().add(eNestedType__eOuterType____abstractTypeDeclaration);
		eOuterType__eNestedType____bodyDeclarations.setSrc(eOuterType);
		eOuterType__eNestedType____bodyDeclarations.setTrg(eNestedType);
		isApplicableMatch.getAllContextElements().add(eOuterType__eNestedType____bodyDeclarations);
		eOuterTypeToTOuterInterface__tOuterType____target.setSrc(eOuterTypeToTOuterInterface);
		eOuterTypeToTOuterInterface__tOuterType____target.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface__tOuterType____target);
		tOuterPackage__typeGraph____model.setName(tOuterPackage__typeGraph____model_name_prime);
		eOuterTypeToTOuterInterface__eOuterType____source
				.setName(eOuterTypeToTOuterInterface__eOuterType____source_name_prime);
		typeGraph__tOuterType____ownedTypes.setName(typeGraph__tOuterType____ownedTypes_name_prime);
		tOuterType__typeGraph____model.setName(tOuterType__typeGraph____model_name_prime);
		tOuterType__tOuterPackage____package.setName(tOuterType__tOuterPackage____package_name_prime);
		tOuterPackage__tOuterType____ownedTypes.setName(tOuterPackage__tOuterType____ownedTypes_name_prime);
		eNestedType__eOuterType____abstractTypeDeclaration
				.setName(eNestedType__eOuterType____abstractTypeDeclaration_name_prime);
		eOuterType__eNestedType____bodyDeclarations.setName(eOuterType__eNestedType____bodyDeclarations_name_prime);
		eOuterTypeToTOuterInterface__tOuterType____target
				.setName(eOuterTypeToTOuterInterface__tOuterType____target_name_prime);
		return new Object[] { eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
				tOuterPackage, isApplicableMatch, tOuterPackage__typeGraph____model,
				eOuterTypeToTOuterInterface__eOuterType____source, typeGraph__tOuterType____ownedTypes,
				tOuterType__typeGraph____model, tOuterType__tOuterPackage____package,
				tOuterPackage__tOuterType____ownedTypes, eNestedType__eOuterType____abstractTypeDeclaration,
				eOuterType__eNestedType____bodyDeclarations, eOuterTypeToTOuterInterface__tOuterType____target };
	}

	public static final Object[] pattern_AnnotationTypeNested_2_4_solveCSP_bindingFBBBBBBBB(AnnotationTypeNested _this,
			IsApplicableMatch isApplicableMatch, AnnotationTypeDeclaration eNestedType, TypeGraph typeGraph,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, eNestedType, typeGraph, tOuterType,
				eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eNestedType, typeGraph, tOuterType,
					eOuterTypeToTOuterInterface, eOuterType, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeNested_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			AnnotationTypeNested _this, IsApplicableMatch isApplicableMatch, AnnotationTypeDeclaration eNestedType,
			TypeGraph typeGraph, TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		Object[] result_pattern_AnnotationTypeNested_2_4_solveCSP_binding = pattern_AnnotationTypeNested_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
				tOuterPackage);
		if (result_pattern_AnnotationTypeNested_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeNested_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeNested_2_4_solveCSP_black = pattern_AnnotationTypeNested_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeNested_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eNestedType, typeGraph, tOuterType,
						eOuterTypeToTOuterInterface, eOuterType, tOuterPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeNested_2_5_checkCSP_expressionFBB(AnnotationTypeNested _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationTypeNested_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationTypeNested";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationTypeNested_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_10_1_initialbindings_blackBBBBBB(
			AnnotationTypeNested _this, Match match, TypeGraph typeGraph, TAnnotationType tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		if (!tNestedType.equals(tOuterType)) {
			return new Object[] { _this, match, typeGraph, tNestedType, tOuterType, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_10_2_SolveCSP_bindingFBBBBBB(AnnotationTypeNested _this,
			Match match, TypeGraph typeGraph, TAnnotationType tNestedType, TAbstractType tOuterType,
			TPackage tOuterPackage) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, typeGraph, tNestedType, tOuterType,
				tOuterPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, typeGraph, tNestedType, tOuterType, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeNested_10_2_SolveCSP_bindingAndBlackFBBBBBB(
			AnnotationTypeNested _this, Match match, TypeGraph typeGraph, TAnnotationType tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		Object[] result_pattern_AnnotationTypeNested_10_2_SolveCSP_binding = pattern_AnnotationTypeNested_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, typeGraph, tNestedType, tOuterType, tOuterPackage);
		if (result_pattern_AnnotationTypeNested_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeNested_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeNested_10_2_SolveCSP_black = pattern_AnnotationTypeNested_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeNested_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, typeGraph, tNestedType, tOuterType, tOuterPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeNested_10_3_CheckCSP_expressionFBB(AnnotationTypeNested _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_10_4_collectelementstobetranslated_blackBBBBB(Match match,
			TypeGraph typeGraph, TAnnotationType tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {
		if (!tNestedType.equals(tOuterType)) {
			return new Object[] { match, typeGraph, tNestedType, tOuterType, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_10_4_collectelementstobetranslated_greenBBBBBFFFFFFF(
			Match match, TypeGraph typeGraph, TAnnotationType tNestedType, TAbstractType tOuterType,
			TPackage tOuterPackage) {
		EMoflonEdge typeGraph__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tNestedType____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____tAnnotationTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tNestedType);
		String typeGraph__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__typeGraph____model_name_prime = "model";
		String tOuterType__tNestedType____innerTypes_name_prime = "innerTypes";
		String tNestedType__tOuterType____outerType_name_prime = "outerType";
		String typeGraph__tNestedType____tAnnotationTypes_name_prime = "tAnnotationTypes";
		String tOuterPackage__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__tOuterPackage____package_name_prime = "package";
		typeGraph__tNestedType____ownedTypes.setSrc(typeGraph);
		typeGraph__tNestedType____ownedTypes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(typeGraph__tNestedType____ownedTypes);
		tNestedType__typeGraph____model.setSrc(tNestedType);
		tNestedType__typeGraph____model.setTrg(typeGraph);
		match.getToBeTranslatedEdges().add(tNestedType__typeGraph____model);
		tOuterType__tNestedType____innerTypes.setSrc(tOuterType);
		tOuterType__tNestedType____innerTypes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(tOuterType__tNestedType____innerTypes);
		tNestedType__tOuterType____outerType.setSrc(tNestedType);
		tNestedType__tOuterType____outerType.setTrg(tOuterType);
		match.getToBeTranslatedEdges().add(tNestedType__tOuterType____outerType);
		typeGraph__tNestedType____tAnnotationTypes.setSrc(typeGraph);
		typeGraph__tNestedType____tAnnotationTypes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(typeGraph__tNestedType____tAnnotationTypes);
		tOuterPackage__tNestedType____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tNestedType____ownedTypes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(tOuterPackage__tNestedType____ownedTypes);
		tNestedType__tOuterPackage____package.setSrc(tNestedType);
		tNestedType__tOuterPackage____package.setTrg(tOuterPackage);
		match.getToBeTranslatedEdges().add(tNestedType__tOuterPackage____package);
		typeGraph__tNestedType____ownedTypes.setName(typeGraph__tNestedType____ownedTypes_name_prime);
		tNestedType__typeGraph____model.setName(tNestedType__typeGraph____model_name_prime);
		tOuterType__tNestedType____innerTypes.setName(tOuterType__tNestedType____innerTypes_name_prime);
		tNestedType__tOuterType____outerType.setName(tNestedType__tOuterType____outerType_name_prime);
		typeGraph__tNestedType____tAnnotationTypes.setName(typeGraph__tNestedType____tAnnotationTypes_name_prime);
		tOuterPackage__tNestedType____ownedTypes.setName(tOuterPackage__tNestedType____ownedTypes_name_prime);
		tNestedType__tOuterPackage____package.setName(tNestedType__tOuterPackage____package_name_prime);
		return new Object[] { match, typeGraph, tNestedType, tOuterType, tOuterPackage,
				typeGraph__tNestedType____ownedTypes, tNestedType__typeGraph____model,
				tOuterType__tNestedType____innerTypes, tNestedType__tOuterType____outerType,
				typeGraph__tNestedType____tAnnotationTypes, tOuterPackage__tNestedType____ownedTypes,
				tNestedType__tOuterPackage____package };
	}

	public static final Object[] pattern_AnnotationTypeNested_10_5_collectcontextelements_blackBBBBB(Match match,
			TypeGraph typeGraph, TAnnotationType tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {
		if (!tNestedType.equals(tOuterType)) {
			return new Object[] { match, typeGraph, tNestedType, tOuterType, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_10_5_collectcontextelements_greenBBBBFFFFF(Match match,
			TypeGraph typeGraph, TAbstractType tOuterType, TPackage tOuterPackage) {
		EMoflonEdge tOuterPackage__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(typeGraph);
		match.getContextNodes().add(tOuterType);
		match.getContextNodes().add(tOuterPackage);
		String tOuterPackage__typeGraph____model_name_prime = "model";
		String typeGraph__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String tOuterType__typeGraph____model_name_prime = "model";
		String tOuterType__tOuterPackage____package_name_prime = "package";
		String tOuterPackage__tOuterType____ownedTypes_name_prime = "ownedTypes";
		tOuterPackage__typeGraph____model.setSrc(tOuterPackage);
		tOuterPackage__typeGraph____model.setTrg(typeGraph);
		match.getContextEdges().add(tOuterPackage__typeGraph____model);
		typeGraph__tOuterType____ownedTypes.setSrc(typeGraph);
		typeGraph__tOuterType____ownedTypes.setTrg(tOuterType);
		match.getContextEdges().add(typeGraph__tOuterType____ownedTypes);
		tOuterType__typeGraph____model.setSrc(tOuterType);
		tOuterType__typeGraph____model.setTrg(typeGraph);
		match.getContextEdges().add(tOuterType__typeGraph____model);
		tOuterType__tOuterPackage____package.setSrc(tOuterType);
		tOuterType__tOuterPackage____package.setTrg(tOuterPackage);
		match.getContextEdges().add(tOuterType__tOuterPackage____package);
		tOuterPackage__tOuterType____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterType____ownedTypes.setTrg(tOuterType);
		match.getContextEdges().add(tOuterPackage__tOuterType____ownedTypes);
		tOuterPackage__typeGraph____model.setName(tOuterPackage__typeGraph____model_name_prime);
		typeGraph__tOuterType____ownedTypes.setName(typeGraph__tOuterType____ownedTypes_name_prime);
		tOuterType__typeGraph____model.setName(tOuterType__typeGraph____model_name_prime);
		tOuterType__tOuterPackage____package.setName(tOuterType__tOuterPackage____package_name_prime);
		tOuterPackage__tOuterType____ownedTypes.setName(tOuterPackage__tOuterType____ownedTypes_name_prime);
		return new Object[] { match, typeGraph, tOuterType, tOuterPackage, tOuterPackage__typeGraph____model,
				typeGraph__tOuterType____ownedTypes, tOuterType__typeGraph____model,
				tOuterType__tOuterPackage____package, tOuterPackage__tOuterType____ownedTypes };
	}

	public static final void pattern_AnnotationTypeNested_10_6_registerobjectstomatch_expressionBBBBBB(
			AnnotationTypeNested _this, Match match, TypeGraph typeGraph, TAnnotationType tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		_this.registerObjectsToMatch_BWD(match, typeGraph, tNestedType, tOuterType, tOuterPackage);

	}

	public static final boolean pattern_AnnotationTypeNested_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeNested_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_1 = isApplicableMatch.getObject("tNestedType");
		EObject _localVariable_2 = isApplicableMatch.getObject("tOuterType");
		EObject _localVariable_3 = isApplicableMatch.getObject("eOuterTypeToTOuterInterface");
		EObject _localVariable_4 = isApplicableMatch.getObject("eOuterType");
		EObject _localVariable_5 = isApplicableMatch.getObject("tOuterPackage");
		EObject tmpTypeGraph = _localVariable_0;
		EObject tmpTNestedType = _localVariable_1;
		EObject tmpTOuterType = _localVariable_2;
		EObject tmpEOuterTypeToTOuterInterface = _localVariable_3;
		EObject tmpEOuterType = _localVariable_4;
		EObject tmpTOuterPackage = _localVariable_5;
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			if (tmpTNestedType instanceof TAnnotationType) {
				TAnnotationType tNestedType = (TAnnotationType) tmpTNestedType;
				if (tmpTOuterType instanceof TAbstractType) {
					TAbstractType tOuterType = (TAbstractType) tmpTOuterType;
					if (tmpEOuterTypeToTOuterInterface instanceof TypeToTAbstractType) {
						TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) tmpEOuterTypeToTOuterInterface;
						if (tmpEOuterType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
							if (tmpTOuterPackage instanceof TPackage) {
								TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
								return new Object[] { typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface,
										eOuterType, tOuterPackage, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_11_1_performtransformation_blackBBBBBBFBB(
			TypeGraph typeGraph, TAnnotationType tNestedType, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			AnnotationTypeNested _this, IsApplicableMatch isApplicableMatch) {
		if (!tNestedType.equals(tOuterType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
							tOuterPackage, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			AnnotationTypeNested _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationTypeNested_11_1_performtransformation_binding = pattern_AnnotationTypeNested_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationTypeNested_11_1_performtransformation_binding != null) {
			TypeGraph typeGraph = (TypeGraph) result_pattern_AnnotationTypeNested_11_1_performtransformation_binding[0];
			TAnnotationType tNestedType = (TAnnotationType) result_pattern_AnnotationTypeNested_11_1_performtransformation_binding[1];
			TAbstractType tOuterType = (TAbstractType) result_pattern_AnnotationTypeNested_11_1_performtransformation_binding[2];
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result_pattern_AnnotationTypeNested_11_1_performtransformation_binding[3];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result_pattern_AnnotationTypeNested_11_1_performtransformation_binding[4];
			TPackage tOuterPackage = (TPackage) result_pattern_AnnotationTypeNested_11_1_performtransformation_binding[5];

			Object[] result_pattern_AnnotationTypeNested_11_1_performtransformation_black = pattern_AnnotationTypeNested_11_1_performtransformation_blackBBBBBBFBB(
					typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, _this,
					isApplicableMatch);
			if (result_pattern_AnnotationTypeNested_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationTypeNested_11_1_performtransformation_black[6];

				return new Object[] { typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
						tOuterPackage, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_11_1_performtransformation_greenFFFBBB(
			TAnnotationType tNestedType, AbstractTypeDeclaration eOuterType, CSP csp) {
		AnnotationTypeDeclaration eNestedType = JavaFactory.eINSTANCE.createAnnotationTypeDeclaration();
		ASTNodeToTAnnotatable astNodeToAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeToTAbstractType eNestedTypeToTNestedType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		Object _localVariable_0 = csp.getValue("eNestedType", "name");
		eNestedType.setAbstractTypeDeclaration(eOuterType);
		astNodeToAnnotatable.setSource(eNestedType);
		astNodeToAnnotatable.setTarget(tNestedType);
		eNestedTypeToTNestedType.setSource(eNestedType);
		eNestedTypeToTNestedType.setTarget(tNestedType);
		String eNestedType_name_prime = (String) _localVariable_0;
		eNestedType.setName(eNestedType_name_prime);
		return new Object[] { eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, tNestedType, eOuterType,
				csp };
	}

	public static final Object[] pattern_AnnotationTypeNested_11_2_collecttranslatedelements_blackBBBB(
			AnnotationTypeDeclaration eNestedType, ASTNodeToTAnnotatable astNodeToAnnotatable,
			TypeToTAbstractType eNestedTypeToTNestedType, TAnnotationType tNestedType) {
		return new Object[] { eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, tNestedType };
	}

	public static final Object[] pattern_AnnotationTypeNested_11_2_collecttranslatedelements_greenFBBBB(
			AnnotationTypeDeclaration eNestedType, ASTNodeToTAnnotatable astNodeToAnnotatable,
			TypeToTAbstractType eNestedTypeToTNestedType, TAnnotationType tNestedType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(eNestedType);
		ruleresult.getCreatedLinkElements().add(astNodeToAnnotatable);
		ruleresult.getCreatedLinkElements().add(eNestedTypeToTNestedType);
		ruleresult.getTranslatedElements().add(tNestedType);
		return new Object[] { ruleresult, eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, tNestedType };
	}

	public static final Object[] pattern_AnnotationTypeNested_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject eNestedType, EObject astNodeToAnnotatable,
			EObject eNestedTypeToTNestedType, EObject typeGraph, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject eOuterType, EObject tOuterPackage) {
		if (!eNestedType.equals(eNestedTypeToTNestedType)) {
			if (!eNestedType.equals(typeGraph)) {
				if (!eNestedType.equals(tNestedType)) {
					if (!eNestedType.equals(tOuterType)) {
						if (!eNestedType.equals(eOuterTypeToTOuterInterface)) {
							if (!eNestedType.equals(eOuterType)) {
								if (!eNestedType.equals(tOuterPackage)) {
									if (!astNodeToAnnotatable.equals(eNestedType)) {
										if (!astNodeToAnnotatable.equals(eNestedTypeToTNestedType)) {
											if (!astNodeToAnnotatable.equals(typeGraph)) {
												if (!astNodeToAnnotatable.equals(tNestedType)) {
													if (!astNodeToAnnotatable.equals(tOuterType)) {
														if (!astNodeToAnnotatable.equals(eOuterTypeToTOuterInterface)) {
															if (!astNodeToAnnotatable.equals(eOuterType)) {
																if (!astNodeToAnnotatable.equals(tOuterPackage)) {
																	if (!eNestedTypeToTNestedType.equals(typeGraph)) {
																		if (!eNestedTypeToTNestedType
																				.equals(tNestedType)) {
																			if (!eNestedTypeToTNestedType
																					.equals(tOuterType)) {
																				if (!eNestedTypeToTNestedType.equals(
																						eOuterTypeToTOuterInterface)) {
																					if (!eNestedTypeToTNestedType
																							.equals(eOuterType)) {
																						if (!eNestedTypeToTNestedType
																								.equals(tOuterPackage)) {
																							if (!tNestedType.equals(
																									typeGraph)) {
																								if (!tNestedType.equals(
																										tOuterType)) {
																									if (!tNestedType
																											.equals(tOuterPackage)) {
																										if (!tOuterType
																												.equals(typeGraph)) {
																											if (!eOuterTypeToTOuterInterface
																													.equals(typeGraph)) {
																												if (!eOuterTypeToTOuterInterface
																														.equals(tNestedType)) {
																													if (!eOuterTypeToTOuterInterface
																															.equals(tOuterType)) {
																														if (!eOuterTypeToTOuterInterface
																																.equals(tOuterPackage)) {
																															if (!eOuterType
																																	.equals(typeGraph)) {
																																if (!eOuterType
																																		.equals(tNestedType)) {
																																	if (!eOuterType
																																			.equals(tOuterType)) {
																																		if (!eOuterType
																																				.equals(eOuterTypeToTOuterInterface)) {
																																			if (!eOuterType
																																					.equals(tOuterPackage)) {
																																				if (!tOuterPackage
																																						.equals(typeGraph)) {
																																					if (!tOuterPackage
																																							.equals(tOuterType)) {
																																						return new Object[] {
																																								ruleresult,
																																								eNestedType,
																																								astNodeToAnnotatable,
																																								eNestedTypeToTNestedType,
																																								typeGraph,
																																								tNestedType,
																																								tOuterType,
																																								eOuterTypeToTOuterInterface,
																																								eOuterType,
																																								tOuterPackage };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationTypeNested_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject eNestedType, EObject astNodeToAnnotatable,
			EObject eNestedTypeToTNestedType, EObject typeGraph, EObject tNestedType, EObject tOuterType,
			EObject eOuterType, EObject tOuterPackage) {
		EMoflonEdge astNodeToAnnotatable__eNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tNestedType____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge astNodeToAnnotatable__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedTypeToTNestedType__eNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterType__eNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____tAnnotationTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedTypeToTNestedType__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationTypeNested";
		String astNodeToAnnotatable__eNestedType____source_name_prime = "source";
		String typeGraph__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__typeGraph____model_name_prime = "model";
		String tOuterType__tNestedType____innerTypes_name_prime = "innerTypes";
		String tNestedType__tOuterType____outerType_name_prime = "outerType";
		String astNodeToAnnotatable__tNestedType____target_name_prime = "target";
		String eNestedTypeToTNestedType__eNestedType____source_name_prime = "source";
		String eNestedType__eOuterType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String eOuterType__eNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		String typeGraph__tNestedType____tAnnotationTypes_name_prime = "tAnnotationTypes";
		String tOuterPackage__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__tOuterPackage____package_name_prime = "package";
		String eNestedTypeToTNestedType__tNestedType____target_name_prime = "target";
		astNodeToAnnotatable__eNestedType____source.setSrc(astNodeToAnnotatable);
		astNodeToAnnotatable__eNestedType____source.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(astNodeToAnnotatable__eNestedType____source);
		typeGraph__tNestedType____ownedTypes.setSrc(typeGraph);
		typeGraph__tNestedType____ownedTypes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(typeGraph__tNestedType____ownedTypes);
		tNestedType__typeGraph____model.setSrc(tNestedType);
		tNestedType__typeGraph____model.setTrg(typeGraph);
		ruleresult.getTranslatedEdges().add(tNestedType__typeGraph____model);
		tOuterType__tNestedType____innerTypes.setSrc(tOuterType);
		tOuterType__tNestedType____innerTypes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(tOuterType__tNestedType____innerTypes);
		tNestedType__tOuterType____outerType.setSrc(tNestedType);
		tNestedType__tOuterType____outerType.setTrg(tOuterType);
		ruleresult.getTranslatedEdges().add(tNestedType__tOuterType____outerType);
		astNodeToAnnotatable__tNestedType____target.setSrc(astNodeToAnnotatable);
		astNodeToAnnotatable__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(astNodeToAnnotatable__tNestedType____target);
		eNestedTypeToTNestedType__eNestedType____source.setSrc(eNestedTypeToTNestedType);
		eNestedTypeToTNestedType__eNestedType____source.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(eNestedTypeToTNestedType__eNestedType____source);
		eNestedType__eOuterType____abstractTypeDeclaration.setSrc(eNestedType);
		eNestedType__eOuterType____abstractTypeDeclaration.setTrg(eOuterType);
		ruleresult.getCreatedEdges().add(eNestedType__eOuterType____abstractTypeDeclaration);
		eOuterType__eNestedType____bodyDeclarations.setSrc(eOuterType);
		eOuterType__eNestedType____bodyDeclarations.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(eOuterType__eNestedType____bodyDeclarations);
		typeGraph__tNestedType____tAnnotationTypes.setSrc(typeGraph);
		typeGraph__tNestedType____tAnnotationTypes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(typeGraph__tNestedType____tAnnotationTypes);
		tOuterPackage__tNestedType____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tNestedType____ownedTypes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(tOuterPackage__tNestedType____ownedTypes);
		tNestedType__tOuterPackage____package.setSrc(tNestedType);
		tNestedType__tOuterPackage____package.setTrg(tOuterPackage);
		ruleresult.getTranslatedEdges().add(tNestedType__tOuterPackage____package);
		eNestedTypeToTNestedType__tNestedType____target.setSrc(eNestedTypeToTNestedType);
		eNestedTypeToTNestedType__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(eNestedTypeToTNestedType__tNestedType____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		astNodeToAnnotatable__eNestedType____source.setName(astNodeToAnnotatable__eNestedType____source_name_prime);
		typeGraph__tNestedType____ownedTypes.setName(typeGraph__tNestedType____ownedTypes_name_prime);
		tNestedType__typeGraph____model.setName(tNestedType__typeGraph____model_name_prime);
		tOuterType__tNestedType____innerTypes.setName(tOuterType__tNestedType____innerTypes_name_prime);
		tNestedType__tOuterType____outerType.setName(tNestedType__tOuterType____outerType_name_prime);
		astNodeToAnnotatable__tNestedType____target.setName(astNodeToAnnotatable__tNestedType____target_name_prime);
		eNestedTypeToTNestedType__eNestedType____source
				.setName(eNestedTypeToTNestedType__eNestedType____source_name_prime);
		eNestedType__eOuterType____abstractTypeDeclaration
				.setName(eNestedType__eOuterType____abstractTypeDeclaration_name_prime);
		eOuterType__eNestedType____bodyDeclarations.setName(eOuterType__eNestedType____bodyDeclarations_name_prime);
		typeGraph__tNestedType____tAnnotationTypes.setName(typeGraph__tNestedType____tAnnotationTypes_name_prime);
		tOuterPackage__tNestedType____ownedTypes.setName(tOuterPackage__tNestedType____ownedTypes_name_prime);
		tNestedType__tOuterPackage____package.setName(tNestedType__tOuterPackage____package_name_prime);
		eNestedTypeToTNestedType__tNestedType____target
				.setName(eNestedTypeToTNestedType__tNestedType____target_name_prime);
		return new Object[] { ruleresult, eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph,
				tNestedType, tOuterType, eOuterType, tOuterPackage, astNodeToAnnotatable__eNestedType____source,
				typeGraph__tNestedType____ownedTypes, tNestedType__typeGraph____model,
				tOuterType__tNestedType____innerTypes, tNestedType__tOuterType____outerType,
				astNodeToAnnotatable__tNestedType____target, eNestedTypeToTNestedType__eNestedType____source,
				eNestedType__eOuterType____abstractTypeDeclaration, eOuterType__eNestedType____bodyDeclarations,
				typeGraph__tNestedType____tAnnotationTypes, tOuterPackage__tNestedType____ownedTypes,
				tNestedType__tOuterPackage____package, eNestedTypeToTNestedType__tNestedType____target };
	}

	public static final void pattern_AnnotationTypeNested_11_5_registerobjects_expressionBBBBBBBBBBB(
			AnnotationTypeNested _this, PerformRuleResult ruleresult, EObject eNestedType, EObject astNodeToAnnotatable,
			EObject eNestedTypeToTNestedType, EObject typeGraph, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject eOuterType, EObject tOuterPackage) {
		_this.registerObjects_BWD(ruleresult, eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph,
				tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);

	}

	public static final PerformRuleResult pattern_AnnotationTypeNested_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_12_1_preparereturnvalue_bindingFB(
			AnnotationTypeNested _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_12_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationTypeNested _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationTypeNested _this) {
		Object[] result_pattern_AnnotationTypeNested_12_1_preparereturnvalue_binding = pattern_AnnotationTypeNested_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeNested_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationTypeNested_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeNested_12_1_preparereturnvalue_black = pattern_AnnotationTypeNested_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationTypeNested_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationTypeNested_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationTypeNested";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationTypeNested_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("typeGraph");
		EObject _localVariable_1 = match.getObject("tNestedType");
		EObject _localVariable_2 = match.getObject("tOuterType");
		EObject _localVariable_3 = match.getObject("tOuterPackage");
		EObject tmpTypeGraph = _localVariable_0;
		EObject tmpTNestedType = _localVariable_1;
		EObject tmpTOuterType = _localVariable_2;
		EObject tmpTOuterPackage = _localVariable_3;
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			if (tmpTNestedType instanceof TAnnotationType) {
				TAnnotationType tNestedType = (TAnnotationType) tmpTNestedType;
				if (tmpTOuterType instanceof TAbstractType) {
					TAbstractType tOuterType = (TAbstractType) tmpTOuterType;
					if (tmpTOuterPackage instanceof TPackage) {
						TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
						return new Object[] { typeGraph, tNestedType, tOuterType, tOuterPackage, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeNested_12_2_corematch_blackBBBFFBB(TypeGraph typeGraph,
			TAnnotationType tNestedType, TAbstractType tOuterType, TPackage tOuterPackage, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tNestedType.equals(tOuterType)) {
			for (TypeToTAbstractType eOuterTypeToTOuterInterface : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tOuterType, TypeToTAbstractType.class, "target")) {
				Type tmpEOuterType = eOuterTypeToTOuterInterface.getSource();
				if (tmpEOuterType instanceof AbstractTypeDeclaration) {
					AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
					_result.add(new Object[] { typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface,
							eOuterType, tOuterPackage, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeNested_12_3_findcontext_blackBBBBBB(
			TypeGraph typeGraph, TAnnotationType tNestedType, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tNestedType.equals(tOuterType)) {
			if (typeGraph.equals(tOuterPackage.getModel())) {
				if (eOuterType.equals(eOuterTypeToTOuterInterface.getSource())) {
					if (typeGraph.getOwnedTypes().contains(tNestedType)) {
						if (typeGraph.getOwnedTypes().contains(tOuterType)) {
							if (tOuterType.getInnerTypes().contains(tNestedType)) {
								if (tOuterPackage.equals(tOuterType.getPackage())) {
									if (typeGraph.getTAnnotationTypes().contains(tNestedType)) {
										if (tOuterPackage.getOwnedTypes().contains(tNestedType)) {
											if (tOuterType.equals(eOuterTypeToTOuterInterface.getTarget())) {
												_result.add(new Object[] { typeGraph, tNestedType, tOuterType,
														eOuterTypeToTOuterInterface, eOuterType, tOuterPackage });
											}
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

	public static final Object[] pattern_AnnotationTypeNested_12_3_findcontext_greenBBBBBBFFFFFFFFFFFFFFF(
			TypeGraph typeGraph, TAnnotationType tNestedType, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tOuterPackage__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterTypeToTOuterInterface__eOuterType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tNestedType____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____tAnnotationTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterTypeToTOuterInterface__tOuterType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tOuterPackage__typeGraph____model_name_prime = "model";
		String eOuterTypeToTOuterInterface__eOuterType____source_name_prime = "source";
		String typeGraph__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__typeGraph____model_name_prime = "model";
		String typeGraph__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String tOuterType__typeGraph____model_name_prime = "model";
		String tOuterType__tNestedType____innerTypes_name_prime = "innerTypes";
		String tNestedType__tOuterType____outerType_name_prime = "outerType";
		String tOuterType__tOuterPackage____package_name_prime = "package";
		String tOuterPackage__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String typeGraph__tNestedType____tAnnotationTypes_name_prime = "tAnnotationTypes";
		String tOuterPackage__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__tOuterPackage____package_name_prime = "package";
		String eOuterTypeToTOuterInterface__tOuterType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tNestedType);
		isApplicableMatch.getAllContextElements().add(tOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface);
		isApplicableMatch.getAllContextElements().add(eOuterType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage);
		tOuterPackage__typeGraph____model.setSrc(tOuterPackage);
		tOuterPackage__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__typeGraph____model);
		eOuterTypeToTOuterInterface__eOuterType____source.setSrc(eOuterTypeToTOuterInterface);
		eOuterTypeToTOuterInterface__eOuterType____source.setTrg(eOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface__eOuterType____source);
		typeGraph__tNestedType____ownedTypes.setSrc(typeGraph);
		typeGraph__tNestedType____ownedTypes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(typeGraph__tNestedType____ownedTypes);
		tNestedType__typeGraph____model.setSrc(tNestedType);
		tNestedType__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tNestedType__typeGraph____model);
		typeGraph__tOuterType____ownedTypes.setSrc(typeGraph);
		typeGraph__tOuterType____ownedTypes.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(typeGraph__tOuterType____ownedTypes);
		tOuterType__typeGraph____model.setSrc(tOuterType);
		tOuterType__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterType__typeGraph____model);
		tOuterType__tNestedType____innerTypes.setSrc(tOuterType);
		tOuterType__tNestedType____innerTypes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(tOuterType__tNestedType____innerTypes);
		tNestedType__tOuterType____outerType.setSrc(tNestedType);
		tNestedType__tOuterType____outerType.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(tNestedType__tOuterType____outerType);
		tOuterType__tOuterPackage____package.setSrc(tOuterType);
		tOuterType__tOuterPackage____package.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tOuterType__tOuterPackage____package);
		tOuterPackage__tOuterType____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterType____ownedTypes.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tOuterType____ownedTypes);
		typeGraph__tNestedType____tAnnotationTypes.setSrc(typeGraph);
		typeGraph__tNestedType____tAnnotationTypes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(typeGraph__tNestedType____tAnnotationTypes);
		tOuterPackage__tNestedType____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tNestedType____ownedTypes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tNestedType____ownedTypes);
		tNestedType__tOuterPackage____package.setSrc(tNestedType);
		tNestedType__tOuterPackage____package.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tNestedType__tOuterPackage____package);
		eOuterTypeToTOuterInterface__tOuterType____target.setSrc(eOuterTypeToTOuterInterface);
		eOuterTypeToTOuterInterface__tOuterType____target.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface__tOuterType____target);
		tOuterPackage__typeGraph____model.setName(tOuterPackage__typeGraph____model_name_prime);
		eOuterTypeToTOuterInterface__eOuterType____source
				.setName(eOuterTypeToTOuterInterface__eOuterType____source_name_prime);
		typeGraph__tNestedType____ownedTypes.setName(typeGraph__tNestedType____ownedTypes_name_prime);
		tNestedType__typeGraph____model.setName(tNestedType__typeGraph____model_name_prime);
		typeGraph__tOuterType____ownedTypes.setName(typeGraph__tOuterType____ownedTypes_name_prime);
		tOuterType__typeGraph____model.setName(tOuterType__typeGraph____model_name_prime);
		tOuterType__tNestedType____innerTypes.setName(tOuterType__tNestedType____innerTypes_name_prime);
		tNestedType__tOuterType____outerType.setName(tNestedType__tOuterType____outerType_name_prime);
		tOuterType__tOuterPackage____package.setName(tOuterType__tOuterPackage____package_name_prime);
		tOuterPackage__tOuterType____ownedTypes.setName(tOuterPackage__tOuterType____ownedTypes_name_prime);
		typeGraph__tNestedType____tAnnotationTypes.setName(typeGraph__tNestedType____tAnnotationTypes_name_prime);
		tOuterPackage__tNestedType____ownedTypes.setName(tOuterPackage__tNestedType____ownedTypes_name_prime);
		tNestedType__tOuterPackage____package.setName(tNestedType__tOuterPackage____package_name_prime);
		eOuterTypeToTOuterInterface__tOuterType____target
				.setName(eOuterTypeToTOuterInterface__tOuterType____target_name_prime);
		return new Object[] { typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
				tOuterPackage, isApplicableMatch, tOuterPackage__typeGraph____model,
				eOuterTypeToTOuterInterface__eOuterType____source, typeGraph__tNestedType____ownedTypes,
				tNestedType__typeGraph____model, typeGraph__tOuterType____ownedTypes, tOuterType__typeGraph____model,
				tOuterType__tNestedType____innerTypes, tNestedType__tOuterType____outerType,
				tOuterType__tOuterPackage____package, tOuterPackage__tOuterType____ownedTypes,
				typeGraph__tNestedType____tAnnotationTypes, tOuterPackage__tNestedType____ownedTypes,
				tNestedType__tOuterPackage____package, eOuterTypeToTOuterInterface__tOuterType____target };
	}

	public static final Object[] pattern_AnnotationTypeNested_12_4_solveCSP_bindingFBBBBBBBB(AnnotationTypeNested _this,
			IsApplicableMatch isApplicableMatch, TypeGraph typeGraph, TAnnotationType tNestedType,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, typeGraph, tNestedType, tOuterType,
				eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, typeGraph, tNestedType, tOuterType,
					eOuterTypeToTOuterInterface, eOuterType, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeNested_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			AnnotationTypeNested _this, IsApplicableMatch isApplicableMatch, TypeGraph typeGraph,
			TAnnotationType tNestedType, TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		Object[] result_pattern_AnnotationTypeNested_12_4_solveCSP_binding = pattern_AnnotationTypeNested_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
				tOuterPackage);
		if (result_pattern_AnnotationTypeNested_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeNested_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeNested_12_4_solveCSP_black = pattern_AnnotationTypeNested_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeNested_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, typeGraph, tNestedType, tOuterType,
						eOuterTypeToTOuterInterface, eOuterType, tOuterPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeNested_12_5_checkCSP_expressionFBB(AnnotationTypeNested _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationTypeNested_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationTypeNested";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationTypeNested_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_20_1_preparereturnvalue_bindingFB(
			AnnotationTypeNested _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnnotationTypeNested _this) {
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

	public static final Object[] pattern_AnnotationTypeNested_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationTypeNested _this) {
		Object[] result_pattern_AnnotationTypeNested_20_1_preparereturnvalue_binding = pattern_AnnotationTypeNested_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeNested_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationTypeNested_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeNested_20_1_preparereturnvalue_black = pattern_AnnotationTypeNested_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationTypeNested_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationTypeNested_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationTypeNested_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnnotationTypeNested_20_2_testcorematchandDECs_black_nac_0BB(
			TAnnotationType tNestedType, TypeGraph typeGraph) {
		for (TypeGraph __DEC_tNestedType_tAnnotationTypes_153864 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tNestedType, TypeGraph.class, "tAnnotationTypes")) {
			if (!typeGraph.equals(__DEC_tNestedType_tAnnotationTypes_153864)) {
				return new Object[] { tNestedType, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_20_2_testcorematchandDECs_black_nac_1BB(
			TAnnotationType tNestedType, TPackage tOuterPackage) {
		TPackage __DEC_tNestedType_ownedTypes_750150 = tNestedType.getPackage();
		if (__DEC_tNestedType_ownedTypes_750150 != null) {
			if (!tOuterPackage.equals(__DEC_tNestedType_ownedTypes_750150)) {
				return new Object[] { tNestedType, tOuterPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_20_2_testcorematchandDECs_black_nac_2BB(
			TAnnotationType tNestedType, TAbstractType tOuterType) {
		if (!tNestedType.equals(tOuterType)) {
			TAbstractType __DEC_tNestedType_innerTypes_404529 = tNestedType.getOuterType();
			if (__DEC_tNestedType_innerTypes_404529 != null) {
				if (!tNestedType.equals(__DEC_tNestedType_innerTypes_404529)) {
					if (!tOuterType.equals(__DEC_tNestedType_innerTypes_404529)) {
						return new Object[] { tNestedType, tOuterType };
					}
				}
			}

		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeNested_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_ownedTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTypeGraph = _edge_ownedTypes.getSrc();
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			EObject tmpTNestedType = _edge_ownedTypes.getTrg();
			if (tmpTNestedType instanceof TAnnotationType) {
				TAnnotationType tNestedType = (TAnnotationType) tmpTNestedType;
				if (typeGraph.getOwnedTypes().contains(tNestedType)) {
					if (typeGraph.getTAnnotationTypes().contains(tNestedType)) {
						TAbstractType tOuterType = tNestedType.getOuterType();
						if (tOuterType != null) {
							if (!tNestedType.equals(tOuterType)) {
								if (typeGraph.getOwnedTypes().contains(tOuterType)) {
									TPackage tOuterPackage = tNestedType.getPackage();
									if (tOuterPackage != null) {
										if (typeGraph.equals(tOuterPackage.getModel())) {
											if (tOuterPackage.equals(tOuterType.getPackage())) {
												if (pattern_AnnotationTypeNested_20_2_testcorematchandDECs_black_nac_0BB(
														tNestedType, typeGraph) == null) {
													if (pattern_AnnotationTypeNested_20_2_testcorematchandDECs_black_nac_2BB(
															tNestedType, tOuterType) == null) {
														if (pattern_AnnotationTypeNested_20_2_testcorematchandDECs_black_nac_1BB(
																tNestedType, tOuterPackage) == null) {
															_result.add(new Object[] { typeGraph, tNestedType,
																	tOuterType, tOuterPackage, _edge_ownedTypes });
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationTypeNested_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationTypeNested_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			AnnotationTypeNested _this, Match match, TypeGraph typeGraph, TAnnotationType tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, typeGraph, tNestedType, tOuterType, tOuterPackage);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeNested_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationTypeNested _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationTypeNested_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_21_1_preparereturnvalue_bindingFB(
			AnnotationTypeNested _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnnotationTypeNested _this) {
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

	public static final Object[] pattern_AnnotationTypeNested_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationTypeNested _this) {
		Object[] result_pattern_AnnotationTypeNested_21_1_preparereturnvalue_binding = pattern_AnnotationTypeNested_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeNested_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationTypeNested_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeNested_21_1_preparereturnvalue_black = pattern_AnnotationTypeNested_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationTypeNested_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationTypeNested_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationTypeNested_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnnotationTypeNested_21_2_testcorematchandDECs_black_nac_0B(
			AnnotationTypeDeclaration eNestedType) {
		AnonymousClassDeclaration __DEC_eNestedType_anonymousClassDeclarationOwner_100567 = eNestedType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_eNestedType_anonymousClassDeclarationOwner_100567 != null) {
			return new Object[] { eNestedType };
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_21_2_testcorematchandDECs_black_nac_1B(
			AnnotationTypeDeclaration eNestedType) {
		org.eclipse.modisco.java.Package __DEC_eNestedType_ownedElements_99701 = eNestedType.getPackage();
		if (__DEC_eNestedType_ownedElements_99701 != null) {
			return new Object[] { eNestedType };
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_21_2_testcorematchandDECs_black_nac_2B(
			AnnotationTypeDeclaration eNestedType) {
		for (MAbstractMethodDefinition __DEC_eNestedType_mInnerTypes_96540 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eNestedType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { eNestedType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeNested_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_abstractTypeDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpENestedType = _edge_abstractTypeDeclaration.getSrc();
		if (tmpENestedType instanceof AnnotationTypeDeclaration) {
			AnnotationTypeDeclaration eNestedType = (AnnotationTypeDeclaration) tmpENestedType;
			EObject tmpEOuterType = _edge_abstractTypeDeclaration.getTrg();
			if (tmpEOuterType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
				if (!eNestedType.equals(eOuterType)) {
					if (eOuterType.equals(eNestedType.getAbstractTypeDeclaration())) {
						if (pattern_AnnotationTypeNested_21_2_testcorematchandDECs_black_nac_0B(eNestedType) == null) {
							if (pattern_AnnotationTypeNested_21_2_testcorematchandDECs_black_nac_1B(
									eNestedType) == null) {
								if (pattern_AnnotationTypeNested_21_2_testcorematchandDECs_black_nac_2B(
										eNestedType) == null) {
									_result.add(
											new Object[] { eNestedType, eOuterType, _edge_abstractTypeDeclaration });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationTypeNested_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			AnnotationTypeNested _this, Match match, AnnotationTypeDeclaration eNestedType,
			AbstractTypeDeclaration eOuterType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eNestedType, eOuterType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeNested_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationTypeNested _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationTypeNested_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_24_1_prepare_blackB(AnnotationTypeNested _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationTypeNested_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("eNestedType");
		EObject _localVariable_1 = targetMatch.getObject("typeGraph");
		EObject _localVariable_2 = targetMatch.getObject("tNestedType");
		EObject _localVariable_3 = targetMatch.getObject("tOuterType");
		EObject _localVariable_4 = sourceMatch.getObject("eOuterType");
		EObject _localVariable_5 = targetMatch.getObject("tOuterPackage");
		EObject tmpENestedType = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpTNestedType = _localVariable_2;
		EObject tmpTOuterType = _localVariable_3;
		EObject tmpEOuterType = _localVariable_4;
		EObject tmpTOuterPackage = _localVariable_5;
		if (tmpENestedType instanceof AnnotationTypeDeclaration) {
			AnnotationTypeDeclaration eNestedType = (AnnotationTypeDeclaration) tmpENestedType;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpTNestedType instanceof TAnnotationType) {
					TAnnotationType tNestedType = (TAnnotationType) tmpTNestedType;
					if (tmpTOuterType instanceof TAbstractType) {
						TAbstractType tOuterType = (TAbstractType) tmpTOuterType;
						if (tmpEOuterType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
							if (tmpTOuterPackage instanceof TPackage) {
								TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
								return new Object[] { eNestedType, typeGraph, tNestedType, tOuterType, eOuterType,
										tOuterPackage, sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_blackBBBBBBBB(
			AnnotationTypeDeclaration eNestedType, TypeGraph typeGraph, TAnnotationType tNestedType,
			TAbstractType tOuterType, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, Match sourceMatch,
			Match targetMatch) {
		if (!eNestedType.equals(eOuterType)) {
			if (!tNestedType.equals(tOuterType)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { eNestedType, typeGraph, tNestedType, tOuterType, eOuterType, tOuterPackage,
							sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_binding = pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_binding != null) {
			AnnotationTypeDeclaration eNestedType = (AnnotationTypeDeclaration) result_pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_binding[0];
			TypeGraph typeGraph = (TypeGraph) result_pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_binding[1];
			TAnnotationType tNestedType = (TAnnotationType) result_pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_binding[2];
			TAbstractType tOuterType = (TAbstractType) result_pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_binding[3];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result_pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_binding[4];
			TPackage tOuterPackage = (TPackage) result_pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_black = pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_blackBBBBBBBB(
					eNestedType, typeGraph, tNestedType, tOuterType, eOuterType, tOuterPackage, sourceMatch,
					targetMatch);
			if (result_pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { eNestedType, typeGraph, tNestedType, tOuterType, eOuterType, tOuterPackage,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_24_3_solvecsp_bindingFBBBBBBBBB(
			AnnotationTypeNested _this, AnnotationTypeDeclaration eNestedType, TypeGraph typeGraph,
			TAnnotationType tNestedType, TAbstractType tOuterType, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(eNestedType, typeGraph, tNestedType, tOuterType,
				eOuterType, tOuterPackage, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, eNestedType, typeGraph, tNestedType, tOuterType, eOuterType,
					tOuterPackage, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeNested_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			AnnotationTypeNested _this, AnnotationTypeDeclaration eNestedType, TypeGraph typeGraph,
			TAnnotationType tNestedType, TAbstractType tOuterType, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationTypeNested_24_3_solvecsp_binding = pattern_AnnotationTypeNested_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, eNestedType, typeGraph, tNestedType, tOuterType, eOuterType, tOuterPackage, sourceMatch,
				targetMatch);
		if (result_pattern_AnnotationTypeNested_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeNested_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnnotationTypeNested_24_3_solvecsp_black = pattern_AnnotationTypeNested_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnnotationTypeNested_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, eNestedType, typeGraph, tNestedType, tOuterType, eOuterType,
						tOuterPackage, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeNested_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeNested_24_5_matchcorrcontext_blackBFBBB(
			TAbstractType tOuterType, AbstractTypeDeclaration eOuterType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType eOuterTypeToTOuterInterface : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eOuterType, TypeToTAbstractType.class, "source")) {
				if (tOuterType.equals(eOuterTypeToTOuterInterface.getTarget())) {
					_result.add(new Object[] { tOuterType, eOuterTypeToTOuterInterface, eOuterType, sourceMatch,
							targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_24_5_matchcorrcontext_greenBBBF(
			TypeToTAbstractType eOuterTypeToTOuterInterface, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnnotationTypeNested";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(eOuterTypeToTOuterInterface);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { eOuterTypeToTOuterInterface, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_AnnotationTypeNested_24_6_createcorrespondence_blackBBBBBBB(
			AnnotationTypeDeclaration eNestedType, TypeGraph typeGraph, TAnnotationType tNestedType,
			TAbstractType tOuterType, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, CCMatch ccMatch) {
		if (!eNestedType.equals(eOuterType)) {
			if (!tNestedType.equals(tOuterType)) {
				return new Object[] { eNestedType, typeGraph, tNestedType, tOuterType, eOuterType, tOuterPackage,
						ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_24_6_createcorrespondence_greenBFFBB(
			AnnotationTypeDeclaration eNestedType, TAnnotationType tNestedType, CCMatch ccMatch) {
		ASTNodeToTAnnotatable astNodeToAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeToTAbstractType eNestedTypeToTNestedType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		astNodeToAnnotatable.setSource(eNestedType);
		astNodeToAnnotatable.setTarget(tNestedType);
		ccMatch.getCreateCorr().add(astNodeToAnnotatable);
		eNestedTypeToTNestedType.setSource(eNestedType);
		eNestedTypeToTNestedType.setTarget(tNestedType);
		ccMatch.getCreateCorr().add(eNestedTypeToTNestedType);
		return new Object[] { eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, tNestedType, ccMatch };
	}

	public static final Object[] pattern_AnnotationTypeNested_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AnnotationTypeNested_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AnnotationTypeNested";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationTypeNested_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_27_1_matchtggpattern_black_nac_0B(
			AnnotationTypeDeclaration eNestedType) {
		AnonymousClassDeclaration __DEC_eNestedType_anonymousClassDeclarationOwner_867632 = eNestedType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_eNestedType_anonymousClassDeclarationOwner_867632 != null) {
			return new Object[] { eNestedType };
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_27_1_matchtggpattern_black_nac_1B(
			AnnotationTypeDeclaration eNestedType) {
		org.eclipse.modisco.java.Package __DEC_eNestedType_ownedElements_632073 = eNestedType.getPackage();
		if (__DEC_eNestedType_ownedElements_632073 != null) {
			return new Object[] { eNestedType };
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_27_1_matchtggpattern_black_nac_2B(
			AnnotationTypeDeclaration eNestedType) {
		for (MAbstractMethodDefinition __DEC_eNestedType_mInnerTypes_806277 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eNestedType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { eNestedType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_27_1_matchtggpattern_blackBB(
			AnnotationTypeDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		if (!eNestedType.equals(eOuterType)) {
			if (eOuterType.equals(eNestedType.getAbstractTypeDeclaration())) {
				if (pattern_AnnotationTypeNested_27_1_matchtggpattern_black_nac_0B(eNestedType) == null) {
					if (pattern_AnnotationTypeNested_27_1_matchtggpattern_black_nac_1B(eNestedType) == null) {
						if (pattern_AnnotationTypeNested_27_1_matchtggpattern_black_nac_2B(eNestedType) == null) {
							return new Object[] { eNestedType, eOuterType };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeNested_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeNested_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_28_1_matchtggpattern_black_nac_0BB(
			TAnnotationType tNestedType, TypeGraph typeGraph) {
		for (TypeGraph __DEC_tNestedType_tAnnotationTypes_761699 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tNestedType, TypeGraph.class, "tAnnotationTypes")) {
			if (!typeGraph.equals(__DEC_tNestedType_tAnnotationTypes_761699)) {
				return new Object[] { tNestedType, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_28_1_matchtggpattern_black_nac_1BB(
			TAnnotationType tNestedType, TPackage tOuterPackage) {
		TPackage __DEC_tNestedType_ownedTypes_643761 = tNestedType.getPackage();
		if (__DEC_tNestedType_ownedTypes_643761 != null) {
			if (!tOuterPackage.equals(__DEC_tNestedType_ownedTypes_643761)) {
				return new Object[] { tNestedType, tOuterPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_28_1_matchtggpattern_black_nac_2BB(
			TAnnotationType tNestedType, TAbstractType tOuterType) {
		if (!tNestedType.equals(tOuterType)) {
			TAbstractType __DEC_tNestedType_innerTypes_12257 = tNestedType.getOuterType();
			if (__DEC_tNestedType_innerTypes_12257 != null) {
				if (!tNestedType.equals(__DEC_tNestedType_innerTypes_12257)) {
					if (!tOuterType.equals(__DEC_tNestedType_innerTypes_12257)) {
						return new Object[] { tNestedType, tOuterType };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_28_1_matchtggpattern_blackBBBB(TypeGraph typeGraph,
			TAnnotationType tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {
		if (!tNestedType.equals(tOuterType)) {
			if (typeGraph.equals(tOuterPackage.getModel())) {
				if (typeGraph.getOwnedTypes().contains(tNestedType)) {
					if (typeGraph.getOwnedTypes().contains(tOuterType)) {
						if (tOuterType.getInnerTypes().contains(tNestedType)) {
							if (tOuterPackage.equals(tOuterType.getPackage())) {
								if (typeGraph.getTAnnotationTypes().contains(tNestedType)) {
									if (tOuterPackage.getOwnedTypes().contains(tNestedType)) {
										if (pattern_AnnotationTypeNested_28_1_matchtggpattern_black_nac_0BB(tNestedType,
												typeGraph) == null) {
											if (pattern_AnnotationTypeNested_28_1_matchtggpattern_black_nac_1BB(
													tNestedType, tOuterPackage) == null) {
												if (pattern_AnnotationTypeNested_28_1_matchtggpattern_black_nac_2BB(
														tNestedType, tOuterType) == null) {
													return new Object[] { typeGraph, tNestedType, tOuterType,
															tOuterPackage };
												}
											}
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

	public static final boolean pattern_AnnotationTypeNested_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeNested_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_29_1_createresult_blackB(AnnotationTypeNested _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationTypeNested_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnnotationTypeNested_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph typeGraph) {
		if (ruleResult.getTargetObjects().contains(typeGraph)) {
			return new Object[] { ruleResult, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tOuterType) {
		if (ruleResult.getTargetObjects().contains(tOuterType)) {
			return new Object[] { ruleResult, tOuterType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TPackage tOuterPackage) {
		if (ruleResult.getTargetObjects().contains(tOuterPackage)) {
			return new Object[] { ruleResult, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eOuterTypeToTOuterInterface) {
		if (ruleResult.getCorrObjects().contains(eOuterTypeToTOuterInterface)) {
			return new Object[] { ruleResult, eOuterTypeToTOuterInterface };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration eOuterType) {
		if (ruleResult.getSourceObjects().contains(eOuterType)) {
			return new Object[] { ruleResult, eOuterType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeNested_29_2_isapplicablecore_blackFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eOuterTypeToTOuterInterfaceList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpEOuterTypeToTOuterInterface : eOuterTypeToTOuterInterfaceList.getEntryObjects()) {
				if (tmpEOuterTypeToTOuterInterface instanceof TypeToTAbstractType) {
					TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) tmpEOuterTypeToTOuterInterface;
					TAbstractType tOuterType = eOuterTypeToTOuterInterface.getTarget();
					if (tOuterType != null) {
						Type tmpEOuterType = eOuterTypeToTOuterInterface.getSource();
						if (tmpEOuterType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
							TypeGraph typeGraph = tOuterType.getModel();
							if (typeGraph != null) {
								TPackage tOuterPackage = tOuterType.getPackage();
								if (tOuterPackage != null) {
									if (typeGraph.equals(tOuterPackage.getModel())) {
										if (pattern_AnnotationTypeNested_29_2_isapplicablecore_black_nac_3BB(ruleResult,
												eOuterTypeToTOuterInterface) == null) {
											if (pattern_AnnotationTypeNested_29_2_isapplicablecore_black_nac_1BB(
													ruleResult, tOuterType) == null) {
												if (pattern_AnnotationTypeNested_29_2_isapplicablecore_black_nac_4BB(
														ruleResult, eOuterType) == null) {
													if (pattern_AnnotationTypeNested_29_2_isapplicablecore_black_nac_0BB(
															ruleResult, typeGraph) == null) {
														if (pattern_AnnotationTypeNested_29_2_isapplicablecore_black_nac_2BB(
																ruleResult, tOuterPackage) == null) {
															_result.add(new Object[] { eOuterTypeToTOuterInterfaceList,
																	typeGraph, tOuterType, tOuterPackage,
																	eOuterTypeToTOuterInterface, eOuterType,
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
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_29_3_solveCSP_bindingFBBBBBBBB(AnnotationTypeNested _this,
			IsApplicableMatch isApplicableMatch, TypeGraph typeGraph, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, typeGraph, tOuterType,
				eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, typeGraph, tOuterType, eOuterTypeToTOuterInterface,
					eOuterType, tOuterPackage, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeNested_29_3_solveCSP_bindingAndBlackFBBBBBBBB(
			AnnotationTypeNested _this, IsApplicableMatch isApplicableMatch, TypeGraph typeGraph,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnnotationTypeNested_29_3_solveCSP_binding = pattern_AnnotationTypeNested_29_3_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage,
				ruleResult);
		if (result_pattern_AnnotationTypeNested_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeNested_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeNested_29_3_solveCSP_black = pattern_AnnotationTypeNested_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeNested_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, typeGraph, tOuterType, eOuterTypeToTOuterInterface,
						eOuterType, tOuterPackage, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeNested_29_4_checkCSP_expressionFBB(AnnotationTypeNested _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_29_5_checknacs_blackBBBBB(TypeGraph typeGraph,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		return new Object[] { typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage };
	}

	public static final Object[] pattern_AnnotationTypeNested_29_6_perform_blackBBBBBB(TypeGraph typeGraph,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage,
				ruleResult };
	}

	public static final Object[] pattern_AnnotationTypeNested_29_6_perform_greenFFFBFBBBBB(TypeGraph typeGraph,
			TAbstractType tOuterType, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		AnnotationTypeDeclaration eNestedType = JavaFactory.eINSTANCE.createAnnotationTypeDeclaration();
		ASTNodeToTAnnotatable astNodeToAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeToTAbstractType eNestedTypeToTNestedType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		TAnnotationType tNestedType = AnnotationsFactory.eINSTANCE.createTAnnotationType();
		Object _localVariable_0 = csp.getValue("eNestedType", "name");
		Object _localVariable_1 = csp.getValue("tNestedType", "tName");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		eNestedType.setAbstractTypeDeclaration(eOuterType);
		ruleResult.getSourceObjects().add(eNestedType);
		astNodeToAnnotatable.setSource(eNestedType);
		ruleResult.getCorrObjects().add(astNodeToAnnotatable);
		eNestedTypeToTNestedType.setSource(eNestedType);
		ruleResult.getCorrObjects().add(eNestedTypeToTNestedType);
		typeGraph.getOwnedTypes().add(tNestedType);
		tOuterType.getInnerTypes().add(tNestedType);
		astNodeToAnnotatable.setTarget(tNestedType);
		typeGraph.getTAnnotationTypes().add(tNestedType);
		tOuterPackage.getOwnedTypes().add(tNestedType);
		eNestedTypeToTNestedType.setTarget(tNestedType);
		ruleResult.getTargetObjects().add(tNestedType);
		String eNestedType_name_prime = (String) _localVariable_0;
		String tNestedType_tName_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		eNestedType.setName(eNestedType_name_prime);
		tNestedType.setTName(tNestedType_tName_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph, tNestedType,
				tOuterType, eOuterType, tOuterPackage, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_AnnotationTypeNested_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnnotationTypeNestedImpl
