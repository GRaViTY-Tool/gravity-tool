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
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.Type;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MAbstractMethodDefinition;

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.AnnotationTypeNested;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
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
				.pattern_AnnotationTypeNested_1_1_performtransformation_greenBFFBFBFBB(eNestedType, typeGraph,
						tOuterType, tOuterPackage, csp);
		TypeToTAbstractType eNestedTypeToTNestedType = (TypeToTAbstractType) result1_green[1];
		TPackage tNestedPackage = (TPackage) result1_green[2];
		TAnnotationType tNestedType = (TAnnotationType) result1_green[4];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[6];

		Object[] result2_black = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_1_2_collecttranslatedelements_blackBBBBB(eNestedType,
						eNestedTypeToTNestedType, tNestedPackage, tNestedType, mBodyToTAnnotation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eNestedType] = " + eNestedType
					+ ", " + "[eNestedTypeToTNestedType] = " + eNestedTypeToTNestedType + ", " + "[tNestedPackage] = "
					+ tNestedPackage + ", " + "[tNestedType] = " + tNestedType + ", " + "[mBodyToTAnnotation] = "
					+ mBodyToTAnnotation + ".");
		}
		Object[] result2_green = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_1_2_collecttranslatedelements_greenFBBBBB(eNestedType,
						eNestedTypeToTNestedType, tNestedPackage, tNestedType, mBodyToTAnnotation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_1_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, eNestedType,
						eNestedTypeToTNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType,
						eOuterTypeToTOuterInterface, mBodyToTAnnotation, eOuterType, tOuterPackage);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eNestedType] = " + eNestedType + ", " + "[eNestedTypeToTNestedType] = "
					+ eNestedTypeToTNestedType + ", " + "[tNestedPackage] = " + tNestedPackage + ", " + "[typeGraph] = "
					+ typeGraph + ", " + "[tNestedType] = " + tNestedType + ", " + "[tOuterType] = " + tOuterType + ", "
					+ "[eOuterTypeToTOuterInterface] = " + eOuterTypeToTOuterInterface + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[eOuterType] = " + eOuterType + ", "
					+ "[tOuterPackage] = " + tOuterPackage + ".");
		}
		AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_1_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, eNestedType, eNestedTypeToTNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType,
				mBodyToTAnnotation, eOuterType, tOuterPackage);
		//nothing EMoflonEdge mBodyToTAnnotation__eNestedType____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tNestedPackage__tNestedType____ownedTypes = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tNestedType__tNestedPackage____package = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tOuterPackage__tNestedPackage____subpackage = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tNestedPackage__tOuterPackage____parent = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge typeGraph__tNestedType____ownedTypes = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tNestedType__typeGraph____pg = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tOuterType__tNestedType____innerTypes = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tNestedType__tOuterType____outerType = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tNestedPackage__typeGraph____typeGraph = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge mBodyToTAnnotation__tNestedType____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge eNestedTypeToTNestedType__eNestedType____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge eOuterType__eNestedType____bodyDeclarations = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge typeGraph__tNestedType____tAnnotationTypes = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge eNestedTypeToTNestedType__tNestedType____target = (EMoflonEdge) result3_green[25];

		// 
		// 
		AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_1_5_registerobjects_expressionBBBBBBBBBBBB(this,
				ruleresult, eNestedType, eNestedTypeToTNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType,
				eOuterTypeToTOuterInterface, mBodyToTAnnotation, eOuterType, tOuterPackage);
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
				//nothing EMoflonEdge eOuterTypeToTOuterInterface__eOuterType____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge typeGraph__tOuterType____ownedTypes = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tOuterType__typeGraph____pg = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tOuterPackage__tOuterType____ownedTypes = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tOuterType__tOuterPackage____package = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge eOuterType__eNestedType____bodyDeclarations = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tOuterPackage__typeGraph____typeGraph = (EMoflonEdge) result3_green[14];
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
		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.name", true, csp);
		var_eNestedType_name.setValue(eNestedType.getName());
		var_eNestedType_name.setType("String");
		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.proxy", true, csp);
		var_eNestedType_proxy.setValue(eNestedType.isProxy());
		var_eNestedType_proxy.setType("Boolean");
		Variable var_eOuterType_name = CSPFactoryHelper.eINSTANCE.createVariable("eOuterType.name", true, csp);
		var_eOuterType_name.setValue(eOuterType.getName());
		var_eOuterType_name.setType("String");

		// Create unbound variables
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", csp);
		var_tNestedType_tName.setType("String");
		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tLib", csp);
		var_tNestedType_tLib.setType("Boolean");
		Variable var_tNestedPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage.tName", csp);
		var_tNestedPackage_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(addSuffix);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_eNestedType_name, var_tNestedType_tName);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_eNestedType_proxy, var_tNestedType_tLib);
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_eOuterType_name, literal0, var_tNestedPackage_tName);

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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject eNestedType, EObject eNestedTypeToTNestedType,
			EObject tNestedPackage, EObject typeGraph, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject mBodyToTAnnotation, EObject eOuterType,
			EObject tOuterPackage) {
		ruleresult.registerObject("eNestedType", eNestedType);
		ruleresult.registerObject("eNestedTypeToTNestedType", eNestedTypeToTNestedType);
		ruleresult.registerObject("tNestedPackage", tNestedPackage);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("tNestedType", tNestedType);
		ruleresult.registerObject("tOuterType", tOuterType);
		ruleresult.registerObject("eOuterTypeToTOuterInterface", eOuterTypeToTOuterInterface);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
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
	public boolean isAppropriate_BWD(Match match, TPackage tNestedPackage, TypeGraph typeGraph,
			TAnnotationType tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {

		Object[] result1_black = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_10_1_initialbindings_blackBBBBBBB(this, match, tNestedPackage, typeGraph,
						tNestedType, tOuterType, tOuterPackage);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tNestedPackage] = " + tNestedPackage + ", " + "[typeGraph] = "
					+ typeGraph + ", " + "[tNestedType] = " + tNestedType + ", " + "[tOuterType] = " + tOuterType + ", "
					+ "[tOuterPackage] = " + tOuterPackage + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, tNestedPackage,
						typeGraph, tNestedType, tOuterType, tOuterPackage);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tNestedPackage] = " + tNestedPackage + ", " + "[typeGraph] = "
					+ typeGraph + ", " + "[tNestedType] = " + tNestedType + ", " + "[tOuterType] = " + tOuterType + ", "
					+ "[tOuterPackage] = " + tOuterPackage + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationTypeNestedImpl
					.pattern_AnnotationTypeNested_10_4_collectelementstobetranslated_blackBBBBBB(match, tNestedPackage,
							typeGraph, tNestedType, tOuterType, tOuterPackage);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tNestedPackage] = " + tNestedPackage + ", " + "[typeGraph] = " + typeGraph + ", "
						+ "[tNestedType] = " + tNestedType + ", " + "[tOuterType] = " + tOuterType + ", "
						+ "[tOuterPackage] = " + tOuterPackage + ".");
			}
			AnnotationTypeNestedImpl
					.pattern_AnnotationTypeNested_10_4_collectelementstobetranslated_greenBBBBBBFFFFFFFFFF(match,
							tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage);
			//nothing EMoflonEdge tNestedPackage__tNestedType____ownedTypes = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge tNestedType__tNestedPackage____package = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tOuterPackage__tNestedPackage____subpackage = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge tNestedPackage__tOuterPackage____parent = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge typeGraph__tNestedType____ownedTypes = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge tNestedType__typeGraph____pg = (EMoflonEdge) result4_green[11];
			//nothing EMoflonEdge tOuterType__tNestedType____innerTypes = (EMoflonEdge) result4_green[12];
			//nothing EMoflonEdge tNestedType__tOuterType____outerType = (EMoflonEdge) result4_green[13];
			//nothing EMoflonEdge tNestedPackage__typeGraph____typeGraph = (EMoflonEdge) result4_green[14];
			//nothing EMoflonEdge typeGraph__tNestedType____tAnnotationTypes = (EMoflonEdge) result4_green[15];

			Object[] result5_black = AnnotationTypeNestedImpl
					.pattern_AnnotationTypeNested_10_5_collectcontextelements_blackBBBBBB(match, tNestedPackage,
							typeGraph, tNestedType, tOuterType, tOuterPackage);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tNestedPackage] = " + tNestedPackage + ", " + "[typeGraph] = " + typeGraph + ", "
						+ "[tNestedType] = " + tNestedType + ", " + "[tOuterType] = " + tOuterType + ", "
						+ "[tOuterPackage] = " + tOuterPackage + ".");
			}
			AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_10_5_collectcontextelements_greenBBBBFFFFF(match,
					typeGraph, tOuterType, tOuterPackage);
			//nothing EMoflonEdge typeGraph__tOuterType____ownedTypes = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge tOuterType__typeGraph____pg = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge tOuterPackage__tOuterType____ownedTypes = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge tOuterType__tOuterPackage____package = (EMoflonEdge) result5_green[7];
			//nothing EMoflonEdge tOuterPackage__typeGraph____typeGraph = (EMoflonEdge) result5_green[8];

			// 
			AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_10_6_registerobjectstomatch_expressionBBBBBBB(this,
					match, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage);
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
				.pattern_AnnotationTypeNested_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TPackage tNestedPackage = (TPackage) result1_bindingAndBlack[0];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[1];
		TAnnotationType tNestedType = (TAnnotationType) result1_bindingAndBlack[2];
		TAbstractType tOuterType = (TAbstractType) result1_bindingAndBlack[3];
		TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result1_bindingAndBlack[4];
		AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result1_bindingAndBlack[5];
		TPackage tOuterPackage = (TPackage) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_11_1_performtransformation_greenFFBFBB(tNestedType, eOuterType, csp);
		AnnotationTypeDeclaration eNestedType = (AnnotationTypeDeclaration) result1_green[0];
		TypeToTAbstractType eNestedTypeToTNestedType = (TypeToTAbstractType) result1_green[1];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[3];

		Object[] result2_black = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_11_2_collecttranslatedelements_blackBBBBB(eNestedType,
						eNestedTypeToTNestedType, tNestedPackage, tNestedType, mBodyToTAnnotation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eNestedType] = " + eNestedType
					+ ", " + "[eNestedTypeToTNestedType] = " + eNestedTypeToTNestedType + ", " + "[tNestedPackage] = "
					+ tNestedPackage + ", " + "[tNestedType] = " + tNestedType + ", " + "[mBodyToTAnnotation] = "
					+ mBodyToTAnnotation + ".");
		}
		Object[] result2_green = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_11_2_collecttranslatedelements_greenFBBBBB(eNestedType,
						eNestedTypeToTNestedType, tNestedPackage, tNestedType, mBodyToTAnnotation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_11_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, eNestedType,
						eNestedTypeToTNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType,
						eOuterTypeToTOuterInterface, mBodyToTAnnotation, eOuterType, tOuterPackage);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eNestedType] = " + eNestedType + ", " + "[eNestedTypeToTNestedType] = "
					+ eNestedTypeToTNestedType + ", " + "[tNestedPackage] = " + tNestedPackage + ", " + "[typeGraph] = "
					+ typeGraph + ", " + "[tNestedType] = " + tNestedType + ", " + "[tOuterType] = " + tOuterType + ", "
					+ "[eOuterTypeToTOuterInterface] = " + eOuterTypeToTOuterInterface + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[eOuterType] = " + eOuterType + ", "
					+ "[tOuterPackage] = " + tOuterPackage + ".");
		}
		AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_11_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, eNestedType, eNestedTypeToTNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType,
				mBodyToTAnnotation, eOuterType, tOuterPackage);
		//nothing EMoflonEdge mBodyToTAnnotation__eNestedType____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tNestedPackage__tNestedType____ownedTypes = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tNestedType__tNestedPackage____package = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tOuterPackage__tNestedPackage____subpackage = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tNestedPackage__tOuterPackage____parent = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge typeGraph__tNestedType____ownedTypes = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tNestedType__typeGraph____pg = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tOuterType__tNestedType____innerTypes = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tNestedType__tOuterType____outerType = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tNestedPackage__typeGraph____typeGraph = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge mBodyToTAnnotation__tNestedType____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge eNestedTypeToTNestedType__eNestedType____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge eOuterType__eNestedType____bodyDeclarations = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge typeGraph__tNestedType____tAnnotationTypes = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge eNestedTypeToTNestedType__tNestedType____target = (EMoflonEdge) result3_green[25];

		// 
		// 
		AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_11_5_registerobjects_expressionBBBBBBBBBBBB(this,
				ruleresult, eNestedType, eNestedTypeToTNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType,
				eOuterTypeToTOuterInterface, mBodyToTAnnotation, eOuterType, tOuterPackage);
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
				.pattern_AnnotationTypeNested_12_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TPackage tNestedPackage = (TPackage) result2_binding[0];
		TypeGraph typeGraph = (TypeGraph) result2_binding[1];
		TAnnotationType tNestedType = (TAnnotationType) result2_binding[2];
		TAbstractType tOuterType = (TAbstractType) result2_binding[3];
		TPackage tOuterPackage = (TPackage) result2_binding[4];
		for (Object[] result2_black : AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_12_2_corematch_blackBBBBFFBB(tNestedPackage, typeGraph, tNestedType,
						tOuterType, tOuterPackage, match)) {
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result2_black[4];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_black[5];
			// ForEach 
			for (Object[] result3_black : AnnotationTypeNestedImpl
					.pattern_AnnotationTypeNested_12_3_findcontext_blackBBBBBBB(tNestedPackage, typeGraph, tNestedType,
							tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage)) {
				Object[] result3_green = AnnotationTypeNestedImpl
						.pattern_AnnotationTypeNested_12_3_findcontext_greenBBBBBBBFFFFFFFFFFFFFFFFFF(tNestedPackage,
								typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
								tOuterPackage);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge tNestedPackage__tNestedType____ownedTypes = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tNestedType__tNestedPackage____package = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tOuterPackage__tNestedPackage____subpackage = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tNestedPackage__tOuterPackage____parent = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eOuterTypeToTOuterInterface__eOuterType____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge typeGraph__tOuterType____ownedTypes = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tOuterType__typeGraph____pg = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge typeGraph__tNestedType____ownedTypes = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tNestedType__typeGraph____pg = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge tOuterPackage__tOuterType____ownedTypes = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge tOuterType__tOuterPackage____package = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge tOuterType__tNestedType____innerTypes = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge tNestedType__tOuterType____outerType = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge tNestedPackage__typeGraph____typeGraph = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge typeGraph__tNestedType____tAnnotationTypes = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge tOuterPackage__typeGraph____typeGraph = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge eOuterTypeToTOuterInterface__tOuterType____target = (EMoflonEdge) result3_green[24];

				Object[] result4_bindingAndBlack = AnnotationTypeNestedImpl
						.pattern_AnnotationTypeNested_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface,
								eOuterType, tOuterPackage);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tNestedPackage] = "
							+ tNestedPackage + ", " + "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = "
							+ tNestedType + ", " + "[tOuterType] = " + tOuterType + ", "
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
	public void registerObjectsToMatch_BWD(Match match, TPackage tNestedPackage, TypeGraph typeGraph,
			TAnnotationType tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {
		match.registerObject("tNestedPackage", tNestedPackage);
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
	public CSP isAppropriate_solveCsp_BWD(Match match, TPackage tNestedPackage, TypeGraph typeGraph,
			TAnnotationType tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TPackage tNestedPackage,
			TypeGraph typeGraph, TAnnotationType tNestedType, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", true, csp);
		var_tNestedType_tName.setValue(tNestedType.getTName());
		var_tNestedType_tName.setType("String");
		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tLib", true, csp);
		var_tNestedType_tLib.setValue(tNestedType.isTLib());
		var_tNestedType_tLib.setType("Boolean");
		Variable var_eOuterType_name = CSPFactoryHelper.eINSTANCE.createVariable("eOuterType.name", true, csp);
		var_eOuterType_name.setValue(eOuterType.getName());
		var_eOuterType_name.setType("String");
		Variable var_tNestedPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage.tName", true,
				csp);
		var_tNestedPackage_tName.setValue(tNestedPackage.getTName());
		var_tNestedPackage_tName.setType("String");

		// Create unbound variables
		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.name", csp);
		var_eNestedType_name.setType("String");
		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.proxy", csp);
		var_eNestedType_proxy.setType("Boolean");

		// Create constraints
		AddSuffix addSuffix = new AddSuffix();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(addSuffix);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_eOuterType_name, literal0, var_tNestedPackage_tName);
		eq.setRuleName("NoRuleName");
		eq.solve(var_eNestedType_name, var_tNestedType_tName);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_eNestedType_proxy, var_tNestedType_tLib);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tNestedPackage", tNestedPackage);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject eNestedType, EObject eNestedTypeToTNestedType,
			EObject tNestedPackage, EObject typeGraph, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject mBodyToTAnnotation, EObject eOuterType,
			EObject tOuterPackage) {
		ruleresult.registerObject("eNestedType", eNestedType);
		ruleresult.registerObject("eNestedTypeToTNestedType", eNestedTypeToTNestedType);
		ruleresult.registerObject("tNestedPackage", tNestedPackage);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("tNestedType", tNestedType);
		ruleresult.registerObject("tOuterType", tOuterType);
		ruleresult.registerObject("eOuterTypeToTOuterInterface", eOuterTypeToTOuterInterface);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("eOuterType", eOuterType);
		ruleresult.registerObject("tOuterPackage", tOuterPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tNestedPackage").eClass())
						.equals("basic.TPackage.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tNestedType").eClass())
						.equals("basic.annotations.TAnnotationType.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_733(EMoflonEdge _edge_ownedTypes) {

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
				.pattern_AnnotationTypeNested_20_2_testcorematchandDECs_blackFFFFFB(_edge_ownedTypes)) {
			TPackage tNestedPackage = (TPackage) result2_black[0];
			TypeGraph typeGraph = (TypeGraph) result2_black[1];
			TAnnotationType tNestedType = (TAnnotationType) result2_black[2];
			TAbstractType tOuterType = (TAbstractType) result2_black[3];
			TPackage tOuterPackage = (TPackage) result2_black[4];
			Object[] result2_green = AnnotationTypeNestedImpl
					.pattern_AnnotationTypeNested_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationTypeNestedImpl
					.pattern_AnnotationTypeNested_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_753(EMoflonEdge _edge_abstractTypeDeclaration) {

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

		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType", true, csp);
		var_eNestedType_proxy.setValue(__helper.getValue("eNestedType", "proxy"));
		var_eNestedType_proxy.setType("boolean");

		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_tLib.setValue(__helper.getValue("tNestedType", "tLib"));
		var_tNestedType_tLib.setType("boolean");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$");
		var_literal0.setType("");

		Variable var_eOuterType_name = CSPFactoryHelper.eINSTANCE.createVariable("eOuterType", true, csp);
		var_eOuterType_name.setValue(__helper.getValue("eOuterType", "name"));
		var_eOuterType_name.setType("String");

		Variable var_tNestedPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage", true, csp);
		var_tNestedPackage_tName.setValue(__helper.getValue("tNestedPackage", "tName"));
		var_tNestedPackage_tName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		AddSuffix addSuffix2 = new AddSuffix();
		csp.getConstraints().add(addSuffix2);

		eq0.setRuleName("AnnotationTypeNested");
		eq0.solve(var_eNestedType_name, var_tNestedType_tName);

		eq1.setRuleName("AnnotationTypeNested");
		eq1.solve(var_eNestedType_proxy, var_tNestedType_tLib);

		addSuffix2.setRuleName("AnnotationTypeNested");
		addSuffix2.solve(var_eOuterType_name, var_literal0, var_tNestedPackage_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tNestedType_tName.setBound(false);
			var_tNestedType_tLib.setBound(false);
			var_tNestedPackage_tName.setBound(false);
			eq0.solve(var_eNestedType_name, var_tNestedType_tName);
			eq1.solve(var_eNestedType_proxy, var_tNestedType_tLib);
			addSuffix2.solve(var_eOuterType_name, var_literal0, var_tNestedPackage_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tNestedType", "tName", var_tNestedType_tName.getValue());
				__helper.setValue("tNestedType", "tLib", var_tNestedType_tLib.getValue());
				__helper.setValue("tNestedPackage", "tName", var_tNestedPackage_tName.getValue());
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

		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType", true, csp);
		var_eNestedType_proxy.setValue(__helper.getValue("eNestedType", "proxy"));
		var_eNestedType_proxy.setType("boolean");

		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_tLib.setValue(__helper.getValue("tNestedType", "tLib"));
		var_tNestedType_tLib.setType("boolean");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$");
		var_literal0.setType("");

		Variable var_eOuterType_name = CSPFactoryHelper.eINSTANCE.createVariable("eOuterType", true, csp);
		var_eOuterType_name.setValue(__helper.getValue("eOuterType", "name"));
		var_eOuterType_name.setType("String");

		Variable var_tNestedPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage", true, csp);
		var_tNestedPackage_tName.setValue(__helper.getValue("tNestedPackage", "tName"));
		var_tNestedPackage_tName.setType("String");

		AddSuffix addSuffix0 = new AddSuffix();
		csp.getConstraints().add(addSuffix0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		Eq eq2 = new Eq();
		csp.getConstraints().add(eq2);

		addSuffix0.setRuleName("AnnotationTypeNested");
		addSuffix0.solve(var_eOuterType_name, var_literal0, var_tNestedPackage_tName);

		eq1.setRuleName("AnnotationTypeNested");
		eq1.solve(var_eNestedType_name, var_tNestedType_tName);

		eq2.setRuleName("AnnotationTypeNested");
		eq2.solve(var_eNestedType_proxy, var_tNestedType_tLib);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_eNestedType_name.setBound(false);
			var_eNestedType_proxy.setBound(false);
			addSuffix0.solve(var_eOuterType_name, var_literal0, var_tNestedPackage_tName);
			eq1.solve(var_eNestedType_name, var_tNestedType_tName);
			eq2.solve(var_eNestedType_proxy, var_tNestedType_tLib);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("eNestedType", "name", var_eNestedType_name.getValue());
				__helper.setValue("eNestedType", "proxy", var_eNestedType_proxy.getValue());
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
				.pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		AnnotationTypeDeclaration eNestedType = (AnnotationTypeDeclaration) result2_bindingAndBlack[0];
		TPackage tNestedPackage = (TPackage) result2_bindingAndBlack[1];
		TypeGraph typeGraph = (TypeGraph) result2_bindingAndBlack[2];
		TAnnotationType tNestedType = (TAnnotationType) result2_bindingAndBlack[3];
		TAbstractType tOuterType = (TAbstractType) result2_bindingAndBlack[4];
		AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_bindingAndBlack[5];
		TPackage tOuterPackage = (TPackage) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = AnnotationTypeNestedImpl
				.pattern_AnnotationTypeNested_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, eNestedType,
						tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterType, tOuterPackage, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[eNestedType] = " + eNestedType + ", " + "[tNestedPackage] = " + tNestedPackage + ", "
					+ "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = " + tNestedType + ", " + "[tOuterType] = "
					+ tOuterType + ", " + "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage
					+ ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
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
						.pattern_AnnotationTypeNested_24_6_createcorrespondence_blackBBBBBBBB(eNestedType,
								tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterType, tOuterPackage, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eNestedType] = "
							+ eNestedType + ", " + "[tNestedPackage] = " + tNestedPackage + ", " + "[typeGraph] = "
							+ typeGraph + ", " + "[tNestedType] = " + tNestedType + ", " + "[tOuterType] = "
							+ tOuterType + ", " + "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = "
							+ tOuterPackage + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_24_6_createcorrespondence_greenBFBFB(eNestedType,
						tNestedType, ccMatch);
				//nothing TypeToTAbstractType eNestedTypeToTNestedType = (TypeToTAbstractType) result6_green[1];
				//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[3];

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
	public CSP isApplicable_solveCsp_CC(AnnotationTypeDeclaration eNestedType, TPackage tNestedPackage,
			TypeGraph typeGraph, TAnnotationType tNestedType, TAbstractType tOuterType,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.name", true, csp);
		var_eNestedType_name.setValue(eNestedType.getName());
		var_eNestedType_name.setType("String");
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", true, csp);
		var_tNestedType_tName.setValue(tNestedType.getTName());
		var_tNestedType_tName.setType("String");
		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.proxy", true, csp);
		var_eNestedType_proxy.setValue(eNestedType.isProxy());
		var_eNestedType_proxy.setType("Boolean");
		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tLib", true, csp);
		var_tNestedType_tLib.setValue(tNestedType.isTLib());
		var_tNestedType_tLib.setType("Boolean");
		Variable var_eOuterType_name = CSPFactoryHelper.eINSTANCE.createVariable("eOuterType.name", true, csp);
		var_eOuterType_name.setValue(eOuterType.getName());
		var_eOuterType_name.setType("String");
		Variable var_tNestedPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage.tName", true,
				csp);
		var_tNestedPackage_tName.setValue(tNestedPackage.getTName());
		var_tNestedPackage_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(addSuffix);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_eNestedType_name, var_tNestedType_tName);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_eNestedType_proxy, var_tNestedType_tLib);
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_eOuterType_name, literal0, var_tNestedPackage_tName);
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
	public boolean checkDEC_BWD(TPackage tNestedPackage, TypeGraph typeGraph, TAnnotationType tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {// 
		Object[] result1_black = AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_28_1_matchtggpattern_blackBBBBB(
				tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage);
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
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result2_black[3];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_black[4];
			TPackage tOuterPackage = (TPackage) result2_black[5];

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
					AnnotationTypeNestedImpl.pattern_AnnotationTypeNested_29_6_perform_greenFFFBFBFBBBB(typeGraph,
							tOuterType, eOuterType, tOuterPackage, ruleResult, csp);
					//nothing AnnotationTypeDeclaration eNestedType = (AnnotationTypeDeclaration) result6_green[0];
					//nothing TypeToTAbstractType eNestedTypeToTNestedType = (TypeToTAbstractType) result6_green[1];
					//nothing TPackage tNestedPackage = (TPackage) result6_green[2];
					//nothing TAnnotationType tNestedType = (TAnnotationType) result6_green[4];
					//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[6];

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
		Variable var_eOuterType_name = CSPFactoryHelper.eINSTANCE.createVariable("eOuterType.name", true, csp);
		var_eOuterType_name.setValue(eOuterType.getName());
		var_eOuterType_name.setType("String");

		// Create unbound variables
		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.name", csp);
		var_eNestedType_name.setType("String");
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", csp);
		var_tNestedType_tName.setType("String");
		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.proxy", csp);
		var_eNestedType_proxy.setType("Boolean");
		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tLib", csp);
		var_tNestedType_tLib.setType("Boolean");
		Variable var_tNestedPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage.tName", csp);
		var_tNestedPackage_tName.setType("String");

		// Create constraints
		AddSuffix addSuffix = new AddSuffix();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(addSuffix);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_eOuterType_name, literal0, var_tNestedPackage_tName);
		eq.setRuleName("NoRuleName");
		eq.solve(var_eNestedType_name, var_tNestedType_tName);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_eNestedType_proxy, var_tNestedType_tLib);

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
		case RulesPackage.ANNOTATION_TYPE_NESTED___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.ANNOTATION_TYPE_NESTED___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPROPRIATE_BWD__MATCH_TPACKAGE_TYPEGRAPH_TANNOTATIONTYPE_TABSTRACTTYPE_TPACKAGE:
			return isAppropriate_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2), (TAnnotationType) arguments.get(3), (TAbstractType) arguments.get(4),
					(TPackage) arguments.get(5));
		case RulesPackage.ANNOTATION_TYPE_NESTED___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPACKAGE_TYPEGRAPH_TANNOTATIONTYPE_TABSTRACTTYPE_TPACKAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2), (TAnnotationType) arguments.get(3), (TAbstractType) arguments.get(4),
					(TPackage) arguments.get(5));
			return null;
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPACKAGE_TYPEGRAPH_TANNOTATIONTYPE_TABSTRACTTYPE_TPACKAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2), (TAnnotationType) arguments.get(3), (TAbstractType) arguments.get(4),
					(TPackage) arguments.get(5));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TPACKAGE_TYPEGRAPH_TANNOTATIONTYPE_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TPACKAGE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2), (TAnnotationType) arguments.get(3), (TAbstractType) arguments.get(4),
					(TypeToTAbstractType) arguments.get(5), (AbstractTypeDeclaration) arguments.get(6),
					(TPackage) arguments.get(7));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.ANNOTATION_TYPE_NESTED___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPROPRIATE_BWD_EMOFLON_EDGE_733__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_733((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPROPRIATE_FWD_EMOFLON_EDGE_753__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_753((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPLICABLE_SOLVE_CSP_CC__ANNOTATIONTYPEDECLARATION_TPACKAGE_TYPEGRAPH_TANNOTATIONTYPE_TABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TPACKAGE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((AnnotationTypeDeclaration) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2), (TAnnotationType) arguments.get(3), (TAbstractType) arguments.get(4),
					(AbstractTypeDeclaration) arguments.get(5), (TPackage) arguments.get(6), (Match) arguments.get(7),
					(Match) arguments.get(8));
		case RulesPackage.ANNOTATION_TYPE_NESTED___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_NESTED___CHECK_DEC_FWD__ANNOTATIONTYPEDECLARATION_ABSTRACTTYPEDECLARATION:
			return checkDEC_FWD((AnnotationTypeDeclaration) arguments.get(0),
					(AbstractTypeDeclaration) arguments.get(1));
		case RulesPackage.ANNOTATION_TYPE_NESTED___CHECK_DEC_BWD__TPACKAGE_TYPEGRAPH_TANNOTATIONTYPE_TABSTRACTTYPE_TPACKAGE:
			return checkDEC_BWD((TPackage) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAnnotationType) arguments.get(2), (TAbstractType) arguments.get(3), (TPackage) arguments.get(4));
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

	public static final Object[] pattern_AnnotationTypeNested_1_1_performtransformation_greenBFFBFBFBB(
			AnnotationTypeDeclaration eNestedType, TypeGraph typeGraph, TAbstractType tOuterType,
			TPackage tOuterPackage, CSP csp) {
		TypeToTAbstractType eNestedTypeToTNestedType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		TPackage tNestedPackage = BasicFactory.eINSTANCE.createTPackage();
		TAnnotationType tNestedType = AnnotationsFactory.eINSTANCE.createTAnnotationType();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		Object _localVariable_0 = csp.getValue("tNestedPackage", "tName");
		Object _localVariable_1 = csp.getValue("tNestedType", "tName");
		Object _localVariable_2 = csp.getValue("tNestedType", "tLib");
		eNestedTypeToTNestedType.setSource(eNestedType);
		tOuterPackage.getSubpackage().add(tNestedPackage);
		tNestedPackage.setTypeGraph(typeGraph);
		tNestedPackage.getOwnedTypes().add(tNestedType);
		typeGraph.getOwnedTypes().add(tNestedType);
		tOuterType.getInnerTypes().add(tNestedType);
		typeGraph.getTAnnotationTypes().add(tNestedType);
		eNestedTypeToTNestedType.setTarget(tNestedType);
		mBodyToTAnnotation.setSource(eNestedType);
		mBodyToTAnnotation.setTarget(tNestedType);
		String tNestedPackage_tName_prime = (String) _localVariable_0;
		String tNestedType_tName_prime = (String) _localVariable_1;
		boolean tNestedType_tLib_prime = (boolean) _localVariable_2;
		tNestedPackage.setTName(tNestedPackage_tName_prime);
		tNestedType.setTName(tNestedType_tName_prime);
		tNestedType.setTLib(Boolean.valueOf(tNestedType_tLib_prime));
		return new Object[] { eNestedType, eNestedTypeToTNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType,
				mBodyToTAnnotation, tOuterPackage, csp };
	}

	public static final Object[] pattern_AnnotationTypeNested_1_2_collecttranslatedelements_blackBBBBB(
			AnnotationTypeDeclaration eNestedType, TypeToTAbstractType eNestedTypeToTNestedType,
			TPackage tNestedPackage, TAnnotationType tNestedType, ASTNodeToTAnnotatable mBodyToTAnnotation) {
		return new Object[] { eNestedType, eNestedTypeToTNestedType, tNestedPackage, tNestedType, mBodyToTAnnotation };
	}

	public static final Object[] pattern_AnnotationTypeNested_1_2_collecttranslatedelements_greenFBBBBB(
			AnnotationTypeDeclaration eNestedType, TypeToTAbstractType eNestedTypeToTNestedType,
			TPackage tNestedPackage, TAnnotationType tNestedType, ASTNodeToTAnnotatable mBodyToTAnnotation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(eNestedType);
		ruleresult.getCreatedLinkElements().add(eNestedTypeToTNestedType);
		ruleresult.getCreatedElements().add(tNestedPackage);
		ruleresult.getCreatedElements().add(tNestedType);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		return new Object[] { ruleresult, eNestedType, eNestedTypeToTNestedType, tNestedPackage, tNestedType,
				mBodyToTAnnotation };
	}

	public static final Object[] pattern_AnnotationTypeNested_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject eNestedType, EObject eNestedTypeToTNestedType, EObject tNestedPackage,
			EObject typeGraph, EObject tNestedType, EObject tOuterType, EObject eOuterTypeToTOuterInterface,
			EObject mBodyToTAnnotation, EObject eOuterType, EObject tOuterPackage) {
		if (!eNestedType.equals(eNestedTypeToTNestedType)) {
			if (!eNestedType.equals(tNestedPackage)) {
				if (!eNestedType.equals(typeGraph)) {
					if (!eNestedType.equals(tNestedType)) {
						if (!eNestedType.equals(tOuterType)) {
							if (!eNestedType.equals(eOuterTypeToTOuterInterface)) {
								if (!eNestedType.equals(mBodyToTAnnotation)) {
									if (!eNestedType.equals(eOuterType)) {
										if (!eNestedType.equals(tOuterPackage)) {
											if (!eNestedTypeToTNestedType.equals(tNestedPackage)) {
												if (!eNestedTypeToTNestedType.equals(typeGraph)) {
													if (!eNestedTypeToTNestedType.equals(tNestedType)) {
														if (!eNestedTypeToTNestedType.equals(tOuterType)) {
															if (!eNestedTypeToTNestedType
																	.equals(eOuterTypeToTOuterInterface)) {
																if (!eNestedTypeToTNestedType
																		.equals(mBodyToTAnnotation)) {
																	if (!eNestedTypeToTNestedType.equals(eOuterType)) {
																		if (!eNestedTypeToTNestedType
																				.equals(tOuterPackage)) {
																			if (!tNestedPackage.equals(typeGraph)) {
																				if (!tNestedPackage
																						.equals(tNestedType)) {
																					if (!tNestedPackage
																							.equals(tOuterType)) {
																						if (!tNestedPackage.equals(
																								tOuterPackage)) {
																							if (!tNestedType.equals(
																									typeGraph)) {
																								if (!tNestedType.equals(
																										tOuterType)) {
																									if (!tNestedType
																											.equals(tOuterPackage)) {
																										if (!tOuterType
																												.equals(typeGraph)) {
																											if (!eOuterTypeToTOuterInterface
																													.equals(tNestedPackage)) {
																												if (!eOuterTypeToTOuterInterface
																														.equals(typeGraph)) {
																													if (!eOuterTypeToTOuterInterface
																															.equals(tNestedType)) {
																														if (!eOuterTypeToTOuterInterface
																																.equals(tOuterType)) {
																															if (!eOuterTypeToTOuterInterface
																																	.equals(mBodyToTAnnotation)) {
																																if (!eOuterTypeToTOuterInterface
																																		.equals(tOuterPackage)) {
																																	if (!mBodyToTAnnotation
																																			.equals(tNestedPackage)) {
																																		if (!mBodyToTAnnotation
																																				.equals(typeGraph)) {
																																			if (!mBodyToTAnnotation
																																					.equals(tNestedType)) {
																																				if (!mBodyToTAnnotation
																																						.equals(tOuterType)) {
																																					if (!mBodyToTAnnotation
																																							.equals(tOuterPackage)) {
																																						if (!eOuterType
																																								.equals(tNestedPackage)) {
																																							if (!eOuterType
																																									.equals(typeGraph)) {
																																								if (!eOuterType
																																										.equals(tNestedType)) {
																																									if (!eOuterType
																																											.equals(tOuterType)) {
																																										if (!eOuterType
																																												.equals(eOuterTypeToTOuterInterface)) {
																																											if (!eOuterType
																																													.equals(mBodyToTAnnotation)) {
																																												if (!eOuterType
																																														.equals(tOuterPackage)) {
																																													if (!tOuterPackage
																																															.equals(typeGraph)) {
																																														if (!tOuterPackage
																																																.equals(tOuterType)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	eNestedType,
																																																	eNestedTypeToTNestedType,
																																																	tNestedPackage,
																																																	typeGraph,
																																																	tNestedType,
																																																	tOuterType,
																																																	eOuterTypeToTOuterInterface,
																																																	mBodyToTAnnotation,
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

	public static final Object[] pattern_AnnotationTypeNested_1_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject eNestedType, EObject eNestedTypeToTNestedType, EObject tNestedPackage,
			EObject typeGraph, EObject tNestedType, EObject tOuterType, EObject mBodyToTAnnotation, EObject eOuterType,
			EObject tOuterPackage) {
		EMoflonEdge mBodyToTAnnotation__eNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tNestedPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tNestedType____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedTypeToTNestedType__eNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterType__eNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____tAnnotationTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedTypeToTNestedType__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationTypeNested";
		String mBodyToTAnnotation__eNestedType____source_name_prime = "source";
		String tNestedPackage__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__tNestedPackage____package_name_prime = "package";
		String tOuterPackage__tNestedPackage____subpackage_name_prime = "subpackage";
		String tNestedPackage__tOuterPackage____parent_name_prime = "parent";
		String typeGraph__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__typeGraph____pg_name_prime = "pg";
		String tOuterType__tNestedType____innerTypes_name_prime = "innerTypes";
		String tNestedType__tOuterType____outerType_name_prime = "outerType";
		String tNestedPackage__typeGraph____typeGraph_name_prime = "typeGraph";
		String mBodyToTAnnotation__tNestedType____target_name_prime = "target";
		String eNestedTypeToTNestedType__eNestedType____source_name_prime = "source";
		String eNestedType__eOuterType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String eOuterType__eNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		String typeGraph__tNestedType____tAnnotationTypes_name_prime = "tAnnotationTypes";
		String eNestedTypeToTNestedType__tNestedType____target_name_prime = "target";
		mBodyToTAnnotation__eNestedType____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__eNestedType____source.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__eNestedType____source);
		tNestedPackage__tNestedType____ownedTypes.setSrc(tNestedPackage);
		tNestedPackage__tNestedType____ownedTypes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(tNestedPackage__tNestedType____ownedTypes);
		tNestedType__tNestedPackage____package.setSrc(tNestedType);
		tNestedType__tNestedPackage____package.setTrg(tNestedPackage);
		ruleresult.getCreatedEdges().add(tNestedType__tNestedPackage____package);
		tOuterPackage__tNestedPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tNestedPackage____subpackage.setTrg(tNestedPackage);
		ruleresult.getCreatedEdges().add(tOuterPackage__tNestedPackage____subpackage);
		tNestedPackage__tOuterPackage____parent.setSrc(tNestedPackage);
		tNestedPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		ruleresult.getCreatedEdges().add(tNestedPackage__tOuterPackage____parent);
		typeGraph__tNestedType____ownedTypes.setSrc(typeGraph);
		typeGraph__tNestedType____ownedTypes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(typeGraph__tNestedType____ownedTypes);
		tNestedType__typeGraph____pg.setSrc(tNestedType);
		tNestedType__typeGraph____pg.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(tNestedType__typeGraph____pg);
		tOuterType__tNestedType____innerTypes.setSrc(tOuterType);
		tOuterType__tNestedType____innerTypes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(tOuterType__tNestedType____innerTypes);
		tNestedType__tOuterType____outerType.setSrc(tNestedType);
		tNestedType__tOuterType____outerType.setTrg(tOuterType);
		ruleresult.getCreatedEdges().add(tNestedType__tOuterType____outerType);
		tNestedPackage__typeGraph____typeGraph.setSrc(tNestedPackage);
		tNestedPackage__typeGraph____typeGraph.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(tNestedPackage__typeGraph____typeGraph);
		mBodyToTAnnotation__tNestedType____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tNestedType____target);
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
		eNestedTypeToTNestedType__tNestedType____target.setSrc(eNestedTypeToTNestedType);
		eNestedTypeToTNestedType__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(eNestedTypeToTNestedType__tNestedType____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mBodyToTAnnotation__eNestedType____source.setName(mBodyToTAnnotation__eNestedType____source_name_prime);
		tNestedPackage__tNestedType____ownedTypes.setName(tNestedPackage__tNestedType____ownedTypes_name_prime);
		tNestedType__tNestedPackage____package.setName(tNestedType__tNestedPackage____package_name_prime);
		tOuterPackage__tNestedPackage____subpackage.setName(tOuterPackage__tNestedPackage____subpackage_name_prime);
		tNestedPackage__tOuterPackage____parent.setName(tNestedPackage__tOuterPackage____parent_name_prime);
		typeGraph__tNestedType____ownedTypes.setName(typeGraph__tNestedType____ownedTypes_name_prime);
		tNestedType__typeGraph____pg.setName(tNestedType__typeGraph____pg_name_prime);
		tOuterType__tNestedType____innerTypes.setName(tOuterType__tNestedType____innerTypes_name_prime);
		tNestedType__tOuterType____outerType.setName(tNestedType__tOuterType____outerType_name_prime);
		tNestedPackage__typeGraph____typeGraph.setName(tNestedPackage__typeGraph____typeGraph_name_prime);
		mBodyToTAnnotation__tNestedType____target.setName(mBodyToTAnnotation__tNestedType____target_name_prime);
		eNestedTypeToTNestedType__eNestedType____source
				.setName(eNestedTypeToTNestedType__eNestedType____source_name_prime);
		eNestedType__eOuterType____abstractTypeDeclaration
				.setName(eNestedType__eOuterType____abstractTypeDeclaration_name_prime);
		eOuterType__eNestedType____bodyDeclarations.setName(eOuterType__eNestedType____bodyDeclarations_name_prime);
		typeGraph__tNestedType____tAnnotationTypes.setName(typeGraph__tNestedType____tAnnotationTypes_name_prime);
		eNestedTypeToTNestedType__tNestedType____target
				.setName(eNestedTypeToTNestedType__tNestedType____target_name_prime);
		return new Object[] { ruleresult, eNestedType, eNestedTypeToTNestedType, tNestedPackage, typeGraph, tNestedType,
				tOuterType, mBodyToTAnnotation, eOuterType, tOuterPackage, mBodyToTAnnotation__eNestedType____source,
				tNestedPackage__tNestedType____ownedTypes, tNestedType__tNestedPackage____package,
				tOuterPackage__tNestedPackage____subpackage, tNestedPackage__tOuterPackage____parent,
				typeGraph__tNestedType____ownedTypes, tNestedType__typeGraph____pg,
				tOuterType__tNestedType____innerTypes, tNestedType__tOuterType____outerType,
				tNestedPackage__typeGraph____typeGraph, mBodyToTAnnotation__tNestedType____target,
				eNestedTypeToTNestedType__eNestedType____source, eNestedType__eOuterType____abstractTypeDeclaration,
				eOuterType__eNestedType____bodyDeclarations, typeGraph__tNestedType____tAnnotationTypes,
				eNestedTypeToTNestedType__tNestedType____target };
	}

	public static final void pattern_AnnotationTypeNested_1_5_registerobjects_expressionBBBBBBBBBBBB(
			AnnotationTypeNested _this, PerformRuleResult ruleresult, EObject eNestedType,
			EObject eNestedTypeToTNestedType, EObject tNestedPackage, EObject typeGraph, EObject tNestedType,
			EObject tOuterType, EObject eOuterTypeToTOuterInterface, EObject mBodyToTAnnotation, EObject eOuterType,
			EObject tOuterPackage) {
		_this.registerObjects_FWD(ruleresult, eNestedType, eNestedTypeToTNestedType, tNestedPackage, typeGraph,
				tNestedType, tOuterType, eOuterTypeToTOuterInterface, mBodyToTAnnotation, eOuterType, tOuterPackage);

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
						TypeGraph typeGraph = tOuterType.getPg();
						if (typeGraph != null) {
							TPackage tOuterPackage = tOuterType.getPackage();
							if (tOuterPackage != null) {
								if (typeGraph.equals(tOuterPackage.getTypeGraph())) {
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
		EMoflonEdge eOuterTypeToTOuterInterface__eOuterType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterType__eNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterTypeToTOuterInterface__tOuterType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eOuterTypeToTOuterInterface__eOuterType____source_name_prime = "source";
		String typeGraph__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String tOuterType__typeGraph____pg_name_prime = "pg";
		String tOuterPackage__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String tOuterType__tOuterPackage____package_name_prime = "package";
		String eNestedType__eOuterType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String eOuterType__eNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		String tOuterPackage__typeGraph____typeGraph_name_prime = "typeGraph";
		String eOuterTypeToTOuterInterface__tOuterType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(eNestedType);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface);
		isApplicableMatch.getAllContextElements().add(eOuterType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage);
		eOuterTypeToTOuterInterface__eOuterType____source.setSrc(eOuterTypeToTOuterInterface);
		eOuterTypeToTOuterInterface__eOuterType____source.setTrg(eOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface__eOuterType____source);
		typeGraph__tOuterType____ownedTypes.setSrc(typeGraph);
		typeGraph__tOuterType____ownedTypes.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(typeGraph__tOuterType____ownedTypes);
		tOuterType__typeGraph____pg.setSrc(tOuterType);
		tOuterType__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterType__typeGraph____pg);
		tOuterPackage__tOuterType____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterType____ownedTypes.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tOuterType____ownedTypes);
		tOuterType__tOuterPackage____package.setSrc(tOuterType);
		tOuterType__tOuterPackage____package.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tOuterType__tOuterPackage____package);
		eNestedType__eOuterType____abstractTypeDeclaration.setSrc(eNestedType);
		eNestedType__eOuterType____abstractTypeDeclaration.setTrg(eOuterType);
		isApplicableMatch.getAllContextElements().add(eNestedType__eOuterType____abstractTypeDeclaration);
		eOuterType__eNestedType____bodyDeclarations.setSrc(eOuterType);
		eOuterType__eNestedType____bodyDeclarations.setTrg(eNestedType);
		isApplicableMatch.getAllContextElements().add(eOuterType__eNestedType____bodyDeclarations);
		tOuterPackage__typeGraph____typeGraph.setSrc(tOuterPackage);
		tOuterPackage__typeGraph____typeGraph.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__typeGraph____typeGraph);
		eOuterTypeToTOuterInterface__tOuterType____target.setSrc(eOuterTypeToTOuterInterface);
		eOuterTypeToTOuterInterface__tOuterType____target.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface__tOuterType____target);
		eOuterTypeToTOuterInterface__eOuterType____source
				.setName(eOuterTypeToTOuterInterface__eOuterType____source_name_prime);
		typeGraph__tOuterType____ownedTypes.setName(typeGraph__tOuterType____ownedTypes_name_prime);
		tOuterType__typeGraph____pg.setName(tOuterType__typeGraph____pg_name_prime);
		tOuterPackage__tOuterType____ownedTypes.setName(tOuterPackage__tOuterType____ownedTypes_name_prime);
		tOuterType__tOuterPackage____package.setName(tOuterType__tOuterPackage____package_name_prime);
		eNestedType__eOuterType____abstractTypeDeclaration
				.setName(eNestedType__eOuterType____abstractTypeDeclaration_name_prime);
		eOuterType__eNestedType____bodyDeclarations.setName(eOuterType__eNestedType____bodyDeclarations_name_prime);
		tOuterPackage__typeGraph____typeGraph.setName(tOuterPackage__typeGraph____typeGraph_name_prime);
		eOuterTypeToTOuterInterface__tOuterType____target
				.setName(eOuterTypeToTOuterInterface__tOuterType____target_name_prime);
		return new Object[] { eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
				tOuterPackage, isApplicableMatch, eOuterTypeToTOuterInterface__eOuterType____source,
				typeGraph__tOuterType____ownedTypes, tOuterType__typeGraph____pg,
				tOuterPackage__tOuterType____ownedTypes, tOuterType__tOuterPackage____package,
				eNestedType__eOuterType____abstractTypeDeclaration, eOuterType__eNestedType____bodyDeclarations,
				tOuterPackage__typeGraph____typeGraph, eOuterTypeToTOuterInterface__tOuterType____target };
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

	public static final Object[] pattern_AnnotationTypeNested_10_1_initialbindings_blackBBBBBBB(
			AnnotationTypeNested _this, Match match, TPackage tNestedPackage, TypeGraph typeGraph,
			TAnnotationType tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				return new Object[] { _this, match, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_10_2_SolveCSP_bindingFBBBBBBB(AnnotationTypeNested _this,
			Match match, TPackage tNestedPackage, TypeGraph typeGraph, TAnnotationType tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tNestedPackage, typeGraph, tNestedType,
				tOuterType, tOuterPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tNestedPackage, typeGraph, tNestedType, tOuterType,
					tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeNested_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
			AnnotationTypeNested _this, Match match, TPackage tNestedPackage, TypeGraph typeGraph,
			TAnnotationType tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {
		Object[] result_pattern_AnnotationTypeNested_10_2_SolveCSP_binding = pattern_AnnotationTypeNested_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage);
		if (result_pattern_AnnotationTypeNested_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeNested_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeNested_10_2_SolveCSP_black = pattern_AnnotationTypeNested_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeNested_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tNestedPackage, typeGraph, tNestedType, tOuterType,
						tOuterPackage };
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

	public static final Object[] pattern_AnnotationTypeNested_10_4_collectelementstobetranslated_blackBBBBBB(
			Match match, TPackage tNestedPackage, TypeGraph typeGraph, TAnnotationType tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				return new Object[] { match, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_10_4_collectelementstobetranslated_greenBBBBBBFFFFFFFFFF(
			Match match, TPackage tNestedPackage, TypeGraph typeGraph, TAnnotationType tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		EMoflonEdge tNestedPackage__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tNestedPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tNestedType____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____tAnnotationTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tNestedPackage);
		match.getToBeTranslatedNodes().add(tNestedType);
		String tNestedPackage__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__tNestedPackage____package_name_prime = "package";
		String tOuterPackage__tNestedPackage____subpackage_name_prime = "subpackage";
		String tNestedPackage__tOuterPackage____parent_name_prime = "parent";
		String typeGraph__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__typeGraph____pg_name_prime = "pg";
		String tOuterType__tNestedType____innerTypes_name_prime = "innerTypes";
		String tNestedType__tOuterType____outerType_name_prime = "outerType";
		String tNestedPackage__typeGraph____typeGraph_name_prime = "typeGraph";
		String typeGraph__tNestedType____tAnnotationTypes_name_prime = "tAnnotationTypes";
		tNestedPackage__tNestedType____ownedTypes.setSrc(tNestedPackage);
		tNestedPackage__tNestedType____ownedTypes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(tNestedPackage__tNestedType____ownedTypes);
		tNestedType__tNestedPackage____package.setSrc(tNestedType);
		tNestedType__tNestedPackage____package.setTrg(tNestedPackage);
		match.getToBeTranslatedEdges().add(tNestedType__tNestedPackage____package);
		tOuterPackage__tNestedPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tNestedPackage____subpackage.setTrg(tNestedPackage);
		match.getToBeTranslatedEdges().add(tOuterPackage__tNestedPackage____subpackage);
		tNestedPackage__tOuterPackage____parent.setSrc(tNestedPackage);
		tNestedPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		match.getToBeTranslatedEdges().add(tNestedPackage__tOuterPackage____parent);
		typeGraph__tNestedType____ownedTypes.setSrc(typeGraph);
		typeGraph__tNestedType____ownedTypes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(typeGraph__tNestedType____ownedTypes);
		tNestedType__typeGraph____pg.setSrc(tNestedType);
		tNestedType__typeGraph____pg.setTrg(typeGraph);
		match.getToBeTranslatedEdges().add(tNestedType__typeGraph____pg);
		tOuterType__tNestedType____innerTypes.setSrc(tOuterType);
		tOuterType__tNestedType____innerTypes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(tOuterType__tNestedType____innerTypes);
		tNestedType__tOuterType____outerType.setSrc(tNestedType);
		tNestedType__tOuterType____outerType.setTrg(tOuterType);
		match.getToBeTranslatedEdges().add(tNestedType__tOuterType____outerType);
		tNestedPackage__typeGraph____typeGraph.setSrc(tNestedPackage);
		tNestedPackage__typeGraph____typeGraph.setTrg(typeGraph);
		match.getToBeTranslatedEdges().add(tNestedPackage__typeGraph____typeGraph);
		typeGraph__tNestedType____tAnnotationTypes.setSrc(typeGraph);
		typeGraph__tNestedType____tAnnotationTypes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(typeGraph__tNestedType____tAnnotationTypes);
		tNestedPackage__tNestedType____ownedTypes.setName(tNestedPackage__tNestedType____ownedTypes_name_prime);
		tNestedType__tNestedPackage____package.setName(tNestedType__tNestedPackage____package_name_prime);
		tOuterPackage__tNestedPackage____subpackage.setName(tOuterPackage__tNestedPackage____subpackage_name_prime);
		tNestedPackage__tOuterPackage____parent.setName(tNestedPackage__tOuterPackage____parent_name_prime);
		typeGraph__tNestedType____ownedTypes.setName(typeGraph__tNestedType____ownedTypes_name_prime);
		tNestedType__typeGraph____pg.setName(tNestedType__typeGraph____pg_name_prime);
		tOuterType__tNestedType____innerTypes.setName(tOuterType__tNestedType____innerTypes_name_prime);
		tNestedType__tOuterType____outerType.setName(tNestedType__tOuterType____outerType_name_prime);
		tNestedPackage__typeGraph____typeGraph.setName(tNestedPackage__typeGraph____typeGraph_name_prime);
		typeGraph__tNestedType____tAnnotationTypes.setName(typeGraph__tNestedType____tAnnotationTypes_name_prime);
		return new Object[] { match, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage,
				tNestedPackage__tNestedType____ownedTypes, tNestedType__tNestedPackage____package,
				tOuterPackage__tNestedPackage____subpackage, tNestedPackage__tOuterPackage____parent,
				typeGraph__tNestedType____ownedTypes, tNestedType__typeGraph____pg,
				tOuterType__tNestedType____innerTypes, tNestedType__tOuterType____outerType,
				tNestedPackage__typeGraph____typeGraph, typeGraph__tNestedType____tAnnotationTypes };
	}

	public static final Object[] pattern_AnnotationTypeNested_10_5_collectcontextelements_blackBBBBBB(Match match,
			TPackage tNestedPackage, TypeGraph typeGraph, TAnnotationType tNestedType, TAbstractType tOuterType,
			TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				return new Object[] { match, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_10_5_collectcontextelements_greenBBBBFFFFF(Match match,
			TypeGraph typeGraph, TAbstractType tOuterType, TPackage tOuterPackage) {
		EMoflonEdge typeGraph__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(typeGraph);
		match.getContextNodes().add(tOuterType);
		match.getContextNodes().add(tOuterPackage);
		String typeGraph__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String tOuterType__typeGraph____pg_name_prime = "pg";
		String tOuterPackage__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String tOuterType__tOuterPackage____package_name_prime = "package";
		String tOuterPackage__typeGraph____typeGraph_name_prime = "typeGraph";
		typeGraph__tOuterType____ownedTypes.setSrc(typeGraph);
		typeGraph__tOuterType____ownedTypes.setTrg(tOuterType);
		match.getContextEdges().add(typeGraph__tOuterType____ownedTypes);
		tOuterType__typeGraph____pg.setSrc(tOuterType);
		tOuterType__typeGraph____pg.setTrg(typeGraph);
		match.getContextEdges().add(tOuterType__typeGraph____pg);
		tOuterPackage__tOuterType____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterType____ownedTypes.setTrg(tOuterType);
		match.getContextEdges().add(tOuterPackage__tOuterType____ownedTypes);
		tOuterType__tOuterPackage____package.setSrc(tOuterType);
		tOuterType__tOuterPackage____package.setTrg(tOuterPackage);
		match.getContextEdges().add(tOuterType__tOuterPackage____package);
		tOuterPackage__typeGraph____typeGraph.setSrc(tOuterPackage);
		tOuterPackage__typeGraph____typeGraph.setTrg(typeGraph);
		match.getContextEdges().add(tOuterPackage__typeGraph____typeGraph);
		typeGraph__tOuterType____ownedTypes.setName(typeGraph__tOuterType____ownedTypes_name_prime);
		tOuterType__typeGraph____pg.setName(tOuterType__typeGraph____pg_name_prime);
		tOuterPackage__tOuterType____ownedTypes.setName(tOuterPackage__tOuterType____ownedTypes_name_prime);
		tOuterType__tOuterPackage____package.setName(tOuterType__tOuterPackage____package_name_prime);
		tOuterPackage__typeGraph____typeGraph.setName(tOuterPackage__typeGraph____typeGraph_name_prime);
		return new Object[] { match, typeGraph, tOuterType, tOuterPackage, typeGraph__tOuterType____ownedTypes,
				tOuterType__typeGraph____pg, tOuterPackage__tOuterType____ownedTypes,
				tOuterType__tOuterPackage____package, tOuterPackage__typeGraph____typeGraph };
	}

	public static final void pattern_AnnotationTypeNested_10_6_registerobjectstomatch_expressionBBBBBBB(
			AnnotationTypeNested _this, Match match, TPackage tNestedPackage, TypeGraph typeGraph,
			TAnnotationType tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {
		_this.registerObjectsToMatch_BWD(match, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage);

	}

	public static final boolean pattern_AnnotationTypeNested_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeNested_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeNested_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tNestedPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_2 = isApplicableMatch.getObject("tNestedType");
		EObject _localVariable_3 = isApplicableMatch.getObject("tOuterType");
		EObject _localVariable_4 = isApplicableMatch.getObject("eOuterTypeToTOuterInterface");
		EObject _localVariable_5 = isApplicableMatch.getObject("eOuterType");
		EObject _localVariable_6 = isApplicableMatch.getObject("tOuterPackage");
		EObject tmpTNestedPackage = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpTNestedType = _localVariable_2;
		EObject tmpTOuterType = _localVariable_3;
		EObject tmpEOuterTypeToTOuterInterface = _localVariable_4;
		EObject tmpEOuterType = _localVariable_5;
		EObject tmpTOuterPackage = _localVariable_6;
		if (tmpTNestedPackage instanceof TPackage) {
			TPackage tNestedPackage = (TPackage) tmpTNestedPackage;
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
									return new Object[] { tNestedPackage, typeGraph, tNestedType, tOuterType,
											eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_11_1_performtransformation_blackBBBBBBBFBB(
			TPackage tNestedPackage, TypeGraph typeGraph, TAnnotationType tNestedType, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			AnnotationTypeNested _this, IsApplicableMatch isApplicableMatch) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { tNestedPackage, typeGraph, tNestedType, tOuterType,
								eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			AnnotationTypeNested _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationTypeNested_11_1_performtransformation_binding = pattern_AnnotationTypeNested_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationTypeNested_11_1_performtransformation_binding != null) {
			TPackage tNestedPackage = (TPackage) result_pattern_AnnotationTypeNested_11_1_performtransformation_binding[0];
			TypeGraph typeGraph = (TypeGraph) result_pattern_AnnotationTypeNested_11_1_performtransformation_binding[1];
			TAnnotationType tNestedType = (TAnnotationType) result_pattern_AnnotationTypeNested_11_1_performtransformation_binding[2];
			TAbstractType tOuterType = (TAbstractType) result_pattern_AnnotationTypeNested_11_1_performtransformation_binding[3];
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result_pattern_AnnotationTypeNested_11_1_performtransformation_binding[4];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result_pattern_AnnotationTypeNested_11_1_performtransformation_binding[5];
			TPackage tOuterPackage = (TPackage) result_pattern_AnnotationTypeNested_11_1_performtransformation_binding[6];

			Object[] result_pattern_AnnotationTypeNested_11_1_performtransformation_black = pattern_AnnotationTypeNested_11_1_performtransformation_blackBBBBBBBFBB(
					tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
					tOuterPackage, _this, isApplicableMatch);
			if (result_pattern_AnnotationTypeNested_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationTypeNested_11_1_performtransformation_black[7];

				return new Object[] { tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface,
						eOuterType, tOuterPackage, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_11_1_performtransformation_greenFFBFBB(
			TAnnotationType tNestedType, AbstractTypeDeclaration eOuterType, CSP csp) {
		AnnotationTypeDeclaration eNestedType = JavaFactory.eINSTANCE.createAnnotationTypeDeclaration();
		TypeToTAbstractType eNestedTypeToTNestedType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		Object _localVariable_0 = csp.getValue("eNestedType", "name");
		Object _localVariable_1 = csp.getValue("eNestedType", "proxy");
		eNestedType.setAbstractTypeDeclaration(eOuterType);
		eNestedTypeToTNestedType.setSource(eNestedType);
		eNestedTypeToTNestedType.setTarget(tNestedType);
		mBodyToTAnnotation.setSource(eNestedType);
		mBodyToTAnnotation.setTarget(tNestedType);
		String eNestedType_name_prime = (String) _localVariable_0;
		boolean eNestedType_proxy_prime = (boolean) _localVariable_1;
		eNestedType.setName(eNestedType_name_prime);
		eNestedType.setProxy(Boolean.valueOf(eNestedType_proxy_prime));
		return new Object[] { eNestedType, eNestedTypeToTNestedType, tNestedType, mBodyToTAnnotation, eOuterType, csp };
	}

	public static final Object[] pattern_AnnotationTypeNested_11_2_collecttranslatedelements_blackBBBBB(
			AnnotationTypeDeclaration eNestedType, TypeToTAbstractType eNestedTypeToTNestedType,
			TPackage tNestedPackage, TAnnotationType tNestedType, ASTNodeToTAnnotatable mBodyToTAnnotation) {
		return new Object[] { eNestedType, eNestedTypeToTNestedType, tNestedPackage, tNestedType, mBodyToTAnnotation };
	}

	public static final Object[] pattern_AnnotationTypeNested_11_2_collecttranslatedelements_greenFBBBBB(
			AnnotationTypeDeclaration eNestedType, TypeToTAbstractType eNestedTypeToTNestedType,
			TPackage tNestedPackage, TAnnotationType tNestedType, ASTNodeToTAnnotatable mBodyToTAnnotation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(eNestedType);
		ruleresult.getCreatedLinkElements().add(eNestedTypeToTNestedType);
		ruleresult.getTranslatedElements().add(tNestedPackage);
		ruleresult.getTranslatedElements().add(tNestedType);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		return new Object[] { ruleresult, eNestedType, eNestedTypeToTNestedType, tNestedPackage, tNestedType,
				mBodyToTAnnotation };
	}

	public static final Object[] pattern_AnnotationTypeNested_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject eNestedType, EObject eNestedTypeToTNestedType, EObject tNestedPackage,
			EObject typeGraph, EObject tNestedType, EObject tOuterType, EObject eOuterTypeToTOuterInterface,
			EObject mBodyToTAnnotation, EObject eOuterType, EObject tOuterPackage) {
		if (!eNestedType.equals(eNestedTypeToTNestedType)) {
			if (!eNestedType.equals(tNestedPackage)) {
				if (!eNestedType.equals(typeGraph)) {
					if (!eNestedType.equals(tNestedType)) {
						if (!eNestedType.equals(tOuterType)) {
							if (!eNestedType.equals(eOuterTypeToTOuterInterface)) {
								if (!eNestedType.equals(mBodyToTAnnotation)) {
									if (!eNestedType.equals(eOuterType)) {
										if (!eNestedType.equals(tOuterPackage)) {
											if (!eNestedTypeToTNestedType.equals(tNestedPackage)) {
												if (!eNestedTypeToTNestedType.equals(typeGraph)) {
													if (!eNestedTypeToTNestedType.equals(tNestedType)) {
														if (!eNestedTypeToTNestedType.equals(tOuterType)) {
															if (!eNestedTypeToTNestedType
																	.equals(eOuterTypeToTOuterInterface)) {
																if (!eNestedTypeToTNestedType
																		.equals(mBodyToTAnnotation)) {
																	if (!eNestedTypeToTNestedType.equals(eOuterType)) {
																		if (!eNestedTypeToTNestedType
																				.equals(tOuterPackage)) {
																			if (!tNestedPackage.equals(typeGraph)) {
																				if (!tNestedPackage
																						.equals(tNestedType)) {
																					if (!tNestedPackage
																							.equals(tOuterType)) {
																						if (!tNestedPackage.equals(
																								tOuterPackage)) {
																							if (!tNestedType.equals(
																									typeGraph)) {
																								if (!tNestedType.equals(
																										tOuterType)) {
																									if (!tNestedType
																											.equals(tOuterPackage)) {
																										if (!tOuterType
																												.equals(typeGraph)) {
																											if (!eOuterTypeToTOuterInterface
																													.equals(tNestedPackage)) {
																												if (!eOuterTypeToTOuterInterface
																														.equals(typeGraph)) {
																													if (!eOuterTypeToTOuterInterface
																															.equals(tNestedType)) {
																														if (!eOuterTypeToTOuterInterface
																																.equals(tOuterType)) {
																															if (!eOuterTypeToTOuterInterface
																																	.equals(mBodyToTAnnotation)) {
																																if (!eOuterTypeToTOuterInterface
																																		.equals(tOuterPackage)) {
																																	if (!mBodyToTAnnotation
																																			.equals(tNestedPackage)) {
																																		if (!mBodyToTAnnotation
																																				.equals(typeGraph)) {
																																			if (!mBodyToTAnnotation
																																					.equals(tNestedType)) {
																																				if (!mBodyToTAnnotation
																																						.equals(tOuterType)) {
																																					if (!mBodyToTAnnotation
																																							.equals(tOuterPackage)) {
																																						if (!eOuterType
																																								.equals(tNestedPackage)) {
																																							if (!eOuterType
																																									.equals(typeGraph)) {
																																								if (!eOuterType
																																										.equals(tNestedType)) {
																																									if (!eOuterType
																																											.equals(tOuterType)) {
																																										if (!eOuterType
																																												.equals(eOuterTypeToTOuterInterface)) {
																																											if (!eOuterType
																																													.equals(mBodyToTAnnotation)) {
																																												if (!eOuterType
																																														.equals(tOuterPackage)) {
																																													if (!tOuterPackage
																																															.equals(typeGraph)) {
																																														if (!tOuterPackage
																																																.equals(tOuterType)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	eNestedType,
																																																	eNestedTypeToTNestedType,
																																																	tNestedPackage,
																																																	typeGraph,
																																																	tNestedType,
																																																	tOuterType,
																																																	eOuterTypeToTOuterInterface,
																																																	mBodyToTAnnotation,
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

	public static final Object[] pattern_AnnotationTypeNested_11_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject eNestedType, EObject eNestedTypeToTNestedType, EObject tNestedPackage,
			EObject typeGraph, EObject tNestedType, EObject tOuterType, EObject mBodyToTAnnotation, EObject eOuterType,
			EObject tOuterPackage) {
		EMoflonEdge mBodyToTAnnotation__eNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tNestedPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tNestedType____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedTypeToTNestedType__eNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterType__eNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____tAnnotationTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedTypeToTNestedType__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationTypeNested";
		String mBodyToTAnnotation__eNestedType____source_name_prime = "source";
		String tNestedPackage__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__tNestedPackage____package_name_prime = "package";
		String tOuterPackage__tNestedPackage____subpackage_name_prime = "subpackage";
		String tNestedPackage__tOuterPackage____parent_name_prime = "parent";
		String typeGraph__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__typeGraph____pg_name_prime = "pg";
		String tOuterType__tNestedType____innerTypes_name_prime = "innerTypes";
		String tNestedType__tOuterType____outerType_name_prime = "outerType";
		String tNestedPackage__typeGraph____typeGraph_name_prime = "typeGraph";
		String mBodyToTAnnotation__tNestedType____target_name_prime = "target";
		String eNestedTypeToTNestedType__eNestedType____source_name_prime = "source";
		String eNestedType__eOuterType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String eOuterType__eNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		String typeGraph__tNestedType____tAnnotationTypes_name_prime = "tAnnotationTypes";
		String eNestedTypeToTNestedType__tNestedType____target_name_prime = "target";
		mBodyToTAnnotation__eNestedType____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__eNestedType____source.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__eNestedType____source);
		tNestedPackage__tNestedType____ownedTypes.setSrc(tNestedPackage);
		tNestedPackage__tNestedType____ownedTypes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(tNestedPackage__tNestedType____ownedTypes);
		tNestedType__tNestedPackage____package.setSrc(tNestedType);
		tNestedType__tNestedPackage____package.setTrg(tNestedPackage);
		ruleresult.getTranslatedEdges().add(tNestedType__tNestedPackage____package);
		tOuterPackage__tNestedPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tNestedPackage____subpackage.setTrg(tNestedPackage);
		ruleresult.getTranslatedEdges().add(tOuterPackage__tNestedPackage____subpackage);
		tNestedPackage__tOuterPackage____parent.setSrc(tNestedPackage);
		tNestedPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		ruleresult.getTranslatedEdges().add(tNestedPackage__tOuterPackage____parent);
		typeGraph__tNestedType____ownedTypes.setSrc(typeGraph);
		typeGraph__tNestedType____ownedTypes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(typeGraph__tNestedType____ownedTypes);
		tNestedType__typeGraph____pg.setSrc(tNestedType);
		tNestedType__typeGraph____pg.setTrg(typeGraph);
		ruleresult.getTranslatedEdges().add(tNestedType__typeGraph____pg);
		tOuterType__tNestedType____innerTypes.setSrc(tOuterType);
		tOuterType__tNestedType____innerTypes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(tOuterType__tNestedType____innerTypes);
		tNestedType__tOuterType____outerType.setSrc(tNestedType);
		tNestedType__tOuterType____outerType.setTrg(tOuterType);
		ruleresult.getTranslatedEdges().add(tNestedType__tOuterType____outerType);
		tNestedPackage__typeGraph____typeGraph.setSrc(tNestedPackage);
		tNestedPackage__typeGraph____typeGraph.setTrg(typeGraph);
		ruleresult.getTranslatedEdges().add(tNestedPackage__typeGraph____typeGraph);
		mBodyToTAnnotation__tNestedType____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tNestedType____target);
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
		eNestedTypeToTNestedType__tNestedType____target.setSrc(eNestedTypeToTNestedType);
		eNestedTypeToTNestedType__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(eNestedTypeToTNestedType__tNestedType____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mBodyToTAnnotation__eNestedType____source.setName(mBodyToTAnnotation__eNestedType____source_name_prime);
		tNestedPackage__tNestedType____ownedTypes.setName(tNestedPackage__tNestedType____ownedTypes_name_prime);
		tNestedType__tNestedPackage____package.setName(tNestedType__tNestedPackage____package_name_prime);
		tOuterPackage__tNestedPackage____subpackage.setName(tOuterPackage__tNestedPackage____subpackage_name_prime);
		tNestedPackage__tOuterPackage____parent.setName(tNestedPackage__tOuterPackage____parent_name_prime);
		typeGraph__tNestedType____ownedTypes.setName(typeGraph__tNestedType____ownedTypes_name_prime);
		tNestedType__typeGraph____pg.setName(tNestedType__typeGraph____pg_name_prime);
		tOuterType__tNestedType____innerTypes.setName(tOuterType__tNestedType____innerTypes_name_prime);
		tNestedType__tOuterType____outerType.setName(tNestedType__tOuterType____outerType_name_prime);
		tNestedPackage__typeGraph____typeGraph.setName(tNestedPackage__typeGraph____typeGraph_name_prime);
		mBodyToTAnnotation__tNestedType____target.setName(mBodyToTAnnotation__tNestedType____target_name_prime);
		eNestedTypeToTNestedType__eNestedType____source
				.setName(eNestedTypeToTNestedType__eNestedType____source_name_prime);
		eNestedType__eOuterType____abstractTypeDeclaration
				.setName(eNestedType__eOuterType____abstractTypeDeclaration_name_prime);
		eOuterType__eNestedType____bodyDeclarations.setName(eOuterType__eNestedType____bodyDeclarations_name_prime);
		typeGraph__tNestedType____tAnnotationTypes.setName(typeGraph__tNestedType____tAnnotationTypes_name_prime);
		eNestedTypeToTNestedType__tNestedType____target
				.setName(eNestedTypeToTNestedType__tNestedType____target_name_prime);
		return new Object[] { ruleresult, eNestedType, eNestedTypeToTNestedType, tNestedPackage, typeGraph, tNestedType,
				tOuterType, mBodyToTAnnotation, eOuterType, tOuterPackage, mBodyToTAnnotation__eNestedType____source,
				tNestedPackage__tNestedType____ownedTypes, tNestedType__tNestedPackage____package,
				tOuterPackage__tNestedPackage____subpackage, tNestedPackage__tOuterPackage____parent,
				typeGraph__tNestedType____ownedTypes, tNestedType__typeGraph____pg,
				tOuterType__tNestedType____innerTypes, tNestedType__tOuterType____outerType,
				tNestedPackage__typeGraph____typeGraph, mBodyToTAnnotation__tNestedType____target,
				eNestedTypeToTNestedType__eNestedType____source, eNestedType__eOuterType____abstractTypeDeclaration,
				eOuterType__eNestedType____bodyDeclarations, typeGraph__tNestedType____tAnnotationTypes,
				eNestedTypeToTNestedType__tNestedType____target };
	}

	public static final void pattern_AnnotationTypeNested_11_5_registerobjects_expressionBBBBBBBBBBBB(
			AnnotationTypeNested _this, PerformRuleResult ruleresult, EObject eNestedType,
			EObject eNestedTypeToTNestedType, EObject tNestedPackage, EObject typeGraph, EObject tNestedType,
			EObject tOuterType, EObject eOuterTypeToTOuterInterface, EObject mBodyToTAnnotation, EObject eOuterType,
			EObject tOuterPackage) {
		_this.registerObjects_BWD(ruleresult, eNestedType, eNestedTypeToTNestedType, tNestedPackage, typeGraph,
				tNestedType, tOuterType, eOuterTypeToTOuterInterface, mBodyToTAnnotation, eOuterType, tOuterPackage);

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

	public static final Object[] pattern_AnnotationTypeNested_12_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tNestedPackage");
		EObject _localVariable_1 = match.getObject("typeGraph");
		EObject _localVariable_2 = match.getObject("tNestedType");
		EObject _localVariable_3 = match.getObject("tOuterType");
		EObject _localVariable_4 = match.getObject("tOuterPackage");
		EObject tmpTNestedPackage = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpTNestedType = _localVariable_2;
		EObject tmpTOuterType = _localVariable_3;
		EObject tmpTOuterPackage = _localVariable_4;
		if (tmpTNestedPackage instanceof TPackage) {
			TPackage tNestedPackage = (TPackage) tmpTNestedPackage;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpTNestedType instanceof TAnnotationType) {
					TAnnotationType tNestedType = (TAnnotationType) tmpTNestedType;
					if (tmpTOuterType instanceof TAbstractType) {
						TAbstractType tOuterType = (TAbstractType) tmpTOuterType;
						if (tmpTOuterPackage instanceof TPackage) {
							TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
							return new Object[] { tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage,
									match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeNested_12_2_corematch_blackBBBBFFBB(
			TPackage tNestedPackage, TypeGraph typeGraph, TAnnotationType tNestedType, TAbstractType tOuterType,
			TPackage tOuterPackage, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				for (TypeToTAbstractType eOuterTypeToTOuterInterface : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tOuterType, TypeToTAbstractType.class, "target")) {
					Type tmpEOuterType = eOuterTypeToTOuterInterface.getSource();
					if (tmpEOuterType instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
						_result.add(new Object[] { tNestedPackage, typeGraph, tNestedType, tOuterType,
								eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeNested_12_3_findcontext_blackBBBBBBB(
			TPackage tNestedPackage, TypeGraph typeGraph, TAnnotationType tNestedType, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				if (tNestedPackage.getOwnedTypes().contains(tNestedType)) {
					if (tOuterPackage.getSubpackage().contains(tNestedPackage)) {
						if (eOuterType.equals(eOuterTypeToTOuterInterface.getSource())) {
							if (typeGraph.getOwnedTypes().contains(tOuterType)) {
								if (typeGraph.getOwnedTypes().contains(tNestedType)) {
									if (tOuterPackage.getOwnedTypes().contains(tOuterType)) {
										if (tOuterType.getInnerTypes().contains(tNestedType)) {
											if (typeGraph.equals(tNestedPackage.getTypeGraph())) {
												if (typeGraph.getTAnnotationTypes().contains(tNestedType)) {
													if (typeGraph.equals(tOuterPackage.getTypeGraph())) {
														if (tOuterType
																.equals(eOuterTypeToTOuterInterface.getTarget())) {
															_result.add(new Object[] { tNestedPackage, typeGraph,
																	tNestedType, tOuterType,
																	eOuterTypeToTOuterInterface, eOuterType,
																	tOuterPackage });
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationTypeNested_12_3_findcontext_greenBBBBBBBFFFFFFFFFFFFFFFFFF(
			TPackage tNestedPackage, TypeGraph typeGraph, TAnnotationType tNestedType, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tNestedPackage__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tNestedPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterTypeToTOuterInterface__eOuterType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tNestedType____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____tAnnotationTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterTypeToTOuterInterface__tOuterType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tNestedPackage__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__tNestedPackage____package_name_prime = "package";
		String tOuterPackage__tNestedPackage____subpackage_name_prime = "subpackage";
		String tNestedPackage__tOuterPackage____parent_name_prime = "parent";
		String eOuterTypeToTOuterInterface__eOuterType____source_name_prime = "source";
		String typeGraph__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String tOuterType__typeGraph____pg_name_prime = "pg";
		String typeGraph__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__typeGraph____pg_name_prime = "pg";
		String tOuterPackage__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String tOuterType__tOuterPackage____package_name_prime = "package";
		String tOuterType__tNestedType____innerTypes_name_prime = "innerTypes";
		String tNestedType__tOuterType____outerType_name_prime = "outerType";
		String tNestedPackage__typeGraph____typeGraph_name_prime = "typeGraph";
		String typeGraph__tNestedType____tAnnotationTypes_name_prime = "tAnnotationTypes";
		String tOuterPackage__typeGraph____typeGraph_name_prime = "typeGraph";
		String eOuterTypeToTOuterInterface__tOuterType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tNestedPackage);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tNestedType);
		isApplicableMatch.getAllContextElements().add(tOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface);
		isApplicableMatch.getAllContextElements().add(eOuterType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage);
		tNestedPackage__tNestedType____ownedTypes.setSrc(tNestedPackage);
		tNestedPackage__tNestedType____ownedTypes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(tNestedPackage__tNestedType____ownedTypes);
		tNestedType__tNestedPackage____package.setSrc(tNestedType);
		tNestedType__tNestedPackage____package.setTrg(tNestedPackage);
		isApplicableMatch.getAllContextElements().add(tNestedType__tNestedPackage____package);
		tOuterPackage__tNestedPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tNestedPackage____subpackage.setTrg(tNestedPackage);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tNestedPackage____subpackage);
		tNestedPackage__tOuterPackage____parent.setSrc(tNestedPackage);
		tNestedPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tNestedPackage__tOuterPackage____parent);
		eOuterTypeToTOuterInterface__eOuterType____source.setSrc(eOuterTypeToTOuterInterface);
		eOuterTypeToTOuterInterface__eOuterType____source.setTrg(eOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface__eOuterType____source);
		typeGraph__tOuterType____ownedTypes.setSrc(typeGraph);
		typeGraph__tOuterType____ownedTypes.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(typeGraph__tOuterType____ownedTypes);
		tOuterType__typeGraph____pg.setSrc(tOuterType);
		tOuterType__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterType__typeGraph____pg);
		typeGraph__tNestedType____ownedTypes.setSrc(typeGraph);
		typeGraph__tNestedType____ownedTypes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(typeGraph__tNestedType____ownedTypes);
		tNestedType__typeGraph____pg.setSrc(tNestedType);
		tNestedType__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tNestedType__typeGraph____pg);
		tOuterPackage__tOuterType____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterType____ownedTypes.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tOuterType____ownedTypes);
		tOuterType__tOuterPackage____package.setSrc(tOuterType);
		tOuterType__tOuterPackage____package.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tOuterType__tOuterPackage____package);
		tOuterType__tNestedType____innerTypes.setSrc(tOuterType);
		tOuterType__tNestedType____innerTypes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(tOuterType__tNestedType____innerTypes);
		tNestedType__tOuterType____outerType.setSrc(tNestedType);
		tNestedType__tOuterType____outerType.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(tNestedType__tOuterType____outerType);
		tNestedPackage__typeGraph____typeGraph.setSrc(tNestedPackage);
		tNestedPackage__typeGraph____typeGraph.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tNestedPackage__typeGraph____typeGraph);
		typeGraph__tNestedType____tAnnotationTypes.setSrc(typeGraph);
		typeGraph__tNestedType____tAnnotationTypes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(typeGraph__tNestedType____tAnnotationTypes);
		tOuterPackage__typeGraph____typeGraph.setSrc(tOuterPackage);
		tOuterPackage__typeGraph____typeGraph.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__typeGraph____typeGraph);
		eOuterTypeToTOuterInterface__tOuterType____target.setSrc(eOuterTypeToTOuterInterface);
		eOuterTypeToTOuterInterface__tOuterType____target.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface__tOuterType____target);
		tNestedPackage__tNestedType____ownedTypes.setName(tNestedPackage__tNestedType____ownedTypes_name_prime);
		tNestedType__tNestedPackage____package.setName(tNestedType__tNestedPackage____package_name_prime);
		tOuterPackage__tNestedPackage____subpackage.setName(tOuterPackage__tNestedPackage____subpackage_name_prime);
		tNestedPackage__tOuterPackage____parent.setName(tNestedPackage__tOuterPackage____parent_name_prime);
		eOuterTypeToTOuterInterface__eOuterType____source
				.setName(eOuterTypeToTOuterInterface__eOuterType____source_name_prime);
		typeGraph__tOuterType____ownedTypes.setName(typeGraph__tOuterType____ownedTypes_name_prime);
		tOuterType__typeGraph____pg.setName(tOuterType__typeGraph____pg_name_prime);
		typeGraph__tNestedType____ownedTypes.setName(typeGraph__tNestedType____ownedTypes_name_prime);
		tNestedType__typeGraph____pg.setName(tNestedType__typeGraph____pg_name_prime);
		tOuterPackage__tOuterType____ownedTypes.setName(tOuterPackage__tOuterType____ownedTypes_name_prime);
		tOuterType__tOuterPackage____package.setName(tOuterType__tOuterPackage____package_name_prime);
		tOuterType__tNestedType____innerTypes.setName(tOuterType__tNestedType____innerTypes_name_prime);
		tNestedType__tOuterType____outerType.setName(tNestedType__tOuterType____outerType_name_prime);
		tNestedPackage__typeGraph____typeGraph.setName(tNestedPackage__typeGraph____typeGraph_name_prime);
		typeGraph__tNestedType____tAnnotationTypes.setName(typeGraph__tNestedType____tAnnotationTypes_name_prime);
		tOuterPackage__typeGraph____typeGraph.setName(tOuterPackage__typeGraph____typeGraph_name_prime);
		eOuterTypeToTOuterInterface__tOuterType____target
				.setName(eOuterTypeToTOuterInterface__tOuterType____target_name_prime);
		return new Object[] { tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface,
				eOuterType, tOuterPackage, isApplicableMatch, tNestedPackage__tNestedType____ownedTypes,
				tNestedType__tNestedPackage____package, tOuterPackage__tNestedPackage____subpackage,
				tNestedPackage__tOuterPackage____parent, eOuterTypeToTOuterInterface__eOuterType____source,
				typeGraph__tOuterType____ownedTypes, tOuterType__typeGraph____pg, typeGraph__tNestedType____ownedTypes,
				tNestedType__typeGraph____pg, tOuterPackage__tOuterType____ownedTypes,
				tOuterType__tOuterPackage____package, tOuterType__tNestedType____innerTypes,
				tNestedType__tOuterType____outerType, tNestedPackage__typeGraph____typeGraph,
				typeGraph__tNestedType____tAnnotationTypes, tOuterPackage__typeGraph____typeGraph,
				eOuterTypeToTOuterInterface__tOuterType____target };
	}

	public static final Object[] pattern_AnnotationTypeNested_12_4_solveCSP_bindingFBBBBBBBBB(
			AnnotationTypeNested _this, IsApplicableMatch isApplicableMatch, TPackage tNestedPackage,
			TypeGraph typeGraph, TAnnotationType tNestedType, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tNestedPackage, typeGraph,
				tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tNestedPackage, typeGraph, tNestedType, tOuterType,
					eOuterTypeToTOuterInterface, eOuterType, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeNested_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			AnnotationTypeNested _this, IsApplicableMatch isApplicableMatch, TPackage tNestedPackage,
			TypeGraph typeGraph, TAnnotationType tNestedType, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage) {
		Object[] result_pattern_AnnotationTypeNested_12_4_solveCSP_binding = pattern_AnnotationTypeNested_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tNestedPackage, typeGraph, tNestedType, tOuterType,
				eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
		if (result_pattern_AnnotationTypeNested_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeNested_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeNested_12_4_solveCSP_black = pattern_AnnotationTypeNested_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeNested_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tNestedPackage, typeGraph, tNestedType, tOuterType,
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
			TPackage tNestedPackage, TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			TPackage __DEC_tNestedPackage_parent_98554 = tNestedPackage.getParent();
			if (__DEC_tNestedPackage_parent_98554 != null) {
				if (!tNestedPackage.equals(__DEC_tNestedPackage_parent_98554)) {
					if (!tOuterPackage.equals(__DEC_tNestedPackage_parent_98554)) {
						return new Object[] { tNestedPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_20_2_testcorematchandDECs_black_nac_1BB(
			TPackage tNestedPackage, TypeGraph typeGraph) {
		TypeGraph __DEC_tNestedPackage_packages_513682 = tNestedPackage.getPg();
		if (__DEC_tNestedPackage_packages_513682 != null) {
			if (!typeGraph.equals(__DEC_tNestedPackage_packages_513682)) {
				return new Object[] { tNestedPackage, typeGraph };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_20_2_testcorematchandDECs_black_nac_2BB(
			TAnnotationType tNestedType, TypeGraph typeGraph) {
		for (TypeGraph __DEC_tNestedType_tAnnotationTypes_861594 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tNestedType, TypeGraph.class, "tAnnotationTypes")) {
			if (!typeGraph.equals(__DEC_tNestedType_tAnnotationTypes_861594)) {
				return new Object[] { tNestedType, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_20_2_testcorematchandDECs_black_nac_3BBB(
			TAnnotationType tNestedType, TPackage tNestedPackage, TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			TPackage __DEC_tNestedType_ownedTypes_891727 = tNestedType.getPackage();
			if (__DEC_tNestedType_ownedTypes_891727 != null) {
				if (!tNestedPackage.equals(__DEC_tNestedType_ownedTypes_891727)) {
					if (!tOuterPackage.equals(__DEC_tNestedType_ownedTypes_891727)) {
						return new Object[] { tNestedType, tNestedPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_20_2_testcorematchandDECs_black_nac_4BB(
			TAnnotationType tNestedType, TAbstractType tOuterType) {
		if (!tNestedType.equals(tOuterType)) {
			TAbstractType __DEC_tNestedType_innerTypes_323474 = tNestedType.getOuterType();
			if (__DEC_tNestedType_innerTypes_323474 != null) {
				if (!tNestedType.equals(__DEC_tNestedType_innerTypes_323474)) {
					if (!tOuterType.equals(__DEC_tNestedType_innerTypes_323474)) {
						return new Object[] { tNestedType, tOuterType };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_20_2_testcorematchandDECs_black_nac_5BB(
			TypeGraph typeGraph, TPackage tNestedPackage) {
		if (typeGraph.getPackages().contains(tNestedPackage)) {
			return new Object[] { typeGraph, tNestedPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_20_2_testcorematchandDECs_black_nac_6BB(
			TPackage tOuterPackage, TAnnotationType tNestedType) {
		if (tOuterPackage.getOwnedTypes().contains(tNestedType)) {
			return new Object[] { tOuterPackage, tNestedType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeNested_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_ownedTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTNestedPackage = _edge_ownedTypes.getSrc();
		if (tmpTNestedPackage instanceof TPackage) {
			TPackage tNestedPackage = (TPackage) tmpTNestedPackage;
			EObject tmpTNestedType = _edge_ownedTypes.getTrg();
			if (tmpTNestedType instanceof TAnnotationType) {
				TAnnotationType tNestedType = (TAnnotationType) tmpTNestedType;
				if (tNestedPackage.getOwnedTypes().contains(tNestedType)) {
					TPackage tOuterPackage = tNestedPackage.getParent();
					if (tOuterPackage != null) {
						if (!tNestedPackage.equals(tOuterPackage)) {
							TypeGraph typeGraph = tNestedPackage.getTypeGraph();
							if (typeGraph != null) {
								if (typeGraph.getOwnedTypes().contains(tNestedType)) {
									if (typeGraph.getTAnnotationTypes().contains(tNestedType)) {
										if (typeGraph.equals(tOuterPackage.getTypeGraph())) {
											TAbstractType tOuterType = tNestedType.getOuterType();
											if (tOuterType != null) {
												if (!tNestedType.equals(tOuterType)) {
													if (typeGraph.getOwnedTypes().contains(tOuterType)) {
														if (tOuterPackage.getOwnedTypes().contains(tOuterType)) {
															if (pattern_AnnotationTypeNested_20_2_testcorematchandDECs_black_nac_0BB(
																	tNestedPackage, tOuterPackage) == null) {
																if (pattern_AnnotationTypeNested_20_2_testcorematchandDECs_black_nac_3BBB(
																		tNestedType, tNestedPackage,
																		tOuterPackage) == null) {
																	if (pattern_AnnotationTypeNested_20_2_testcorematchandDECs_black_nac_6BB(
																			tOuterPackage, tNestedType) == null) {
																		if (pattern_AnnotationTypeNested_20_2_testcorematchandDECs_black_nac_1BB(
																				tNestedPackage, typeGraph) == null) {
																			if (pattern_AnnotationTypeNested_20_2_testcorematchandDECs_black_nac_2BB(
																					tNestedType, typeGraph) == null) {
																				if (pattern_AnnotationTypeNested_20_2_testcorematchandDECs_black_nac_5BB(
																						typeGraph,
																						tNestedPackage) == null) {
																					if (pattern_AnnotationTypeNested_20_2_testcorematchandDECs_black_nac_4BB(
																							tNestedType,
																							tOuterType) == null) {
																						_result.add(new Object[] {
																								tNestedPackage,
																								typeGraph, tNestedType,
																								tOuterType,
																								tOuterPackage,
																								_edge_ownedTypes });
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}

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

	public static final boolean pattern_AnnotationTypeNested_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			AnnotationTypeNested _this, Match match, TPackage tNestedPackage, TypeGraph typeGraph,
			TAnnotationType tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tNestedPackage, typeGraph, tNestedType, tOuterType,
				tOuterPackage);
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
		AnonymousClassDeclaration __DEC_eNestedType_anonymousClassDeclarationOwner_937900 = eNestedType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_eNestedType_anonymousClassDeclarationOwner_937900 != null) {
			return new Object[] { eNestedType };
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_21_2_testcorematchandDECs_black_nac_1B(
			AnnotationTypeDeclaration eNestedType) {
		for (Model __DEC_eNestedType_orphanTypes_394506 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eNestedType, Model.class, "orphanTypes")) {
			return new Object[] { eNestedType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_21_2_testcorematchandDECs_black_nac_2B(
			AnnotationTypeDeclaration eNestedType) {
		org.eclipse.modisco.java.Package __DEC_eNestedType_ownedElements_315750 = eNestedType.getPackage();
		if (__DEC_eNestedType_ownedElements_315750 != null) {
			return new Object[] { eNestedType };
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_21_2_testcorematchandDECs_black_nac_3B(
			AnnotationTypeDeclaration eNestedType) {
		for (MAbstractMethodDefinition __DEC_eNestedType_mInnerTypes_178943 : org.moflon.core.utilities.eMoflonEMFUtil
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
									if (pattern_AnnotationTypeNested_21_2_testcorematchandDECs_black_nac_3B(
											eNestedType) == null) {
										_result.add(new Object[] { eNestedType, eOuterType,
												_edge_abstractTypeDeclaration });
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

	public static final Object[] pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("eNestedType");
		EObject _localVariable_1 = targetMatch.getObject("tNestedPackage");
		EObject _localVariable_2 = targetMatch.getObject("typeGraph");
		EObject _localVariable_3 = targetMatch.getObject("tNestedType");
		EObject _localVariable_4 = targetMatch.getObject("tOuterType");
		EObject _localVariable_5 = sourceMatch.getObject("eOuterType");
		EObject _localVariable_6 = targetMatch.getObject("tOuterPackage");
		EObject tmpENestedType = _localVariable_0;
		EObject tmpTNestedPackage = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpTNestedType = _localVariable_3;
		EObject tmpTOuterType = _localVariable_4;
		EObject tmpEOuterType = _localVariable_5;
		EObject tmpTOuterPackage = _localVariable_6;
		if (tmpENestedType instanceof AnnotationTypeDeclaration) {
			AnnotationTypeDeclaration eNestedType = (AnnotationTypeDeclaration) tmpENestedType;
			if (tmpTNestedPackage instanceof TPackage) {
				TPackage tNestedPackage = (TPackage) tmpTNestedPackage;
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
									return new Object[] { eNestedType, tNestedPackage, typeGraph, tNestedType,
											tOuterType, eOuterType, tOuterPackage, sourceMatch, targetMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_blackBBBBBBBBB(
			AnnotationTypeDeclaration eNestedType, TPackage tNestedPackage, TypeGraph typeGraph,
			TAnnotationType tNestedType, TAbstractType tOuterType, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage, Match sourceMatch, Match targetMatch) {
		if (!eNestedType.equals(eOuterType)) {
			if (!tNestedPackage.equals(tOuterPackage)) {
				if (!tNestedType.equals(tOuterType)) {
					if (!sourceMatch.equals(targetMatch)) {
						return new Object[] { eNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType,
								eOuterType, tOuterPackage, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_binding = pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_binding != null) {
			AnnotationTypeDeclaration eNestedType = (AnnotationTypeDeclaration) result_pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_binding[0];
			TPackage tNestedPackage = (TPackage) result_pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_binding[1];
			TypeGraph typeGraph = (TypeGraph) result_pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_binding[2];
			TAnnotationType tNestedType = (TAnnotationType) result_pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_binding[3];
			TAbstractType tOuterType = (TAbstractType) result_pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_binding[4];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result_pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_binding[5];
			TPackage tOuterPackage = (TPackage) result_pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_black = pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					eNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterType, tOuterPackage,
					sourceMatch, targetMatch);
			if (result_pattern_AnnotationTypeNested_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { eNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterType,
						tOuterPackage, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_24_3_solvecsp_bindingFBBBBBBBBBB(
			AnnotationTypeNested _this, AnnotationTypeDeclaration eNestedType, TPackage tNestedPackage,
			TypeGraph typeGraph, TAnnotationType tNestedType, TAbstractType tOuterType,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(eNestedType, tNestedPackage, typeGraph, tNestedType,
				tOuterType, eOuterType, tOuterPackage, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, eNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType,
					eOuterType, tOuterPackage, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeNested_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			AnnotationTypeNested _this, AnnotationTypeDeclaration eNestedType, TPackage tNestedPackage,
			TypeGraph typeGraph, TAnnotationType tNestedType, TAbstractType tOuterType,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationTypeNested_24_3_solvecsp_binding = pattern_AnnotationTypeNested_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, eNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterType, tOuterPackage,
				sourceMatch, targetMatch);
		if (result_pattern_AnnotationTypeNested_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeNested_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnnotationTypeNested_24_3_solvecsp_black = pattern_AnnotationTypeNested_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnnotationTypeNested_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, eNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType,
						eOuterType, tOuterPackage, sourceMatch, targetMatch };
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

	public static final Object[] pattern_AnnotationTypeNested_24_6_createcorrespondence_blackBBBBBBBB(
			AnnotationTypeDeclaration eNestedType, TPackage tNestedPackage, TypeGraph typeGraph,
			TAnnotationType tNestedType, TAbstractType tOuterType, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage, CCMatch ccMatch) {
		if (!eNestedType.equals(eOuterType)) {
			if (!tNestedPackage.equals(tOuterPackage)) {
				if (!tNestedType.equals(tOuterType)) {
					return new Object[] { eNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterType,
							tOuterPackage, ccMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_24_6_createcorrespondence_greenBFBFB(
			AnnotationTypeDeclaration eNestedType, TAnnotationType tNestedType, CCMatch ccMatch) {
		TypeToTAbstractType eNestedTypeToTNestedType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		eNestedTypeToTNestedType.setSource(eNestedType);
		eNestedTypeToTNestedType.setTarget(tNestedType);
		ccMatch.getCreateCorr().add(eNestedTypeToTNestedType);
		mBodyToTAnnotation.setSource(eNestedType);
		mBodyToTAnnotation.setTarget(tNestedType);
		ccMatch.getCreateCorr().add(mBodyToTAnnotation);
		return new Object[] { eNestedType, eNestedTypeToTNestedType, tNestedType, mBodyToTAnnotation, ccMatch };
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
		AnonymousClassDeclaration __DEC_eNestedType_anonymousClassDeclarationOwner_50821 = eNestedType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_eNestedType_anonymousClassDeclarationOwner_50821 != null) {
			return new Object[] { eNestedType };
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_27_1_matchtggpattern_black_nac_1B(
			AnnotationTypeDeclaration eNestedType) {
		for (Model __DEC_eNestedType_orphanTypes_5810 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eNestedType, Model.class, "orphanTypes")) {
			return new Object[] { eNestedType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_27_1_matchtggpattern_black_nac_2B(
			AnnotationTypeDeclaration eNestedType) {
		org.eclipse.modisco.java.Package __DEC_eNestedType_ownedElements_858197 = eNestedType.getPackage();
		if (__DEC_eNestedType_ownedElements_858197 != null) {
			return new Object[] { eNestedType };
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_27_1_matchtggpattern_black_nac_3B(
			AnnotationTypeDeclaration eNestedType) {
		for (MAbstractMethodDefinition __DEC_eNestedType_mInnerTypes_604176 : org.moflon.core.utilities.eMoflonEMFUtil
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
							if (pattern_AnnotationTypeNested_27_1_matchtggpattern_black_nac_3B(eNestedType) == null) {
								return new Object[] { eNestedType, eOuterType };
							}
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
			TPackage tNestedPackage, TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			TPackage __DEC_tNestedPackage_parent_682175 = tNestedPackage.getParent();
			if (__DEC_tNestedPackage_parent_682175 != null) {
				if (!tNestedPackage.equals(__DEC_tNestedPackage_parent_682175)) {
					if (!tOuterPackage.equals(__DEC_tNestedPackage_parent_682175)) {
						return new Object[] { tNestedPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_28_1_matchtggpattern_black_nac_1BB(
			TPackage tNestedPackage, TypeGraph typeGraph) {
		TypeGraph __DEC_tNestedPackage_packages_36014 = tNestedPackage.getPg();
		if (__DEC_tNestedPackage_packages_36014 != null) {
			if (!typeGraph.equals(__DEC_tNestedPackage_packages_36014)) {
				return new Object[] { tNestedPackage, typeGraph };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_28_1_matchtggpattern_black_nac_2BB(
			TAnnotationType tNestedType, TypeGraph typeGraph) {
		for (TypeGraph __DEC_tNestedType_tAnnotationTypes_613185 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tNestedType, TypeGraph.class, "tAnnotationTypes")) {
			if (!typeGraph.equals(__DEC_tNestedType_tAnnotationTypes_613185)) {
				return new Object[] { tNestedType, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_28_1_matchtggpattern_black_nac_3BBB(
			TAnnotationType tNestedType, TPackage tNestedPackage, TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			TPackage __DEC_tNestedType_ownedTypes_328418 = tNestedType.getPackage();
			if (__DEC_tNestedType_ownedTypes_328418 != null) {
				if (!tNestedPackage.equals(__DEC_tNestedType_ownedTypes_328418)) {
					if (!tOuterPackage.equals(__DEC_tNestedType_ownedTypes_328418)) {
						return new Object[] { tNestedType, tNestedPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_28_1_matchtggpattern_black_nac_4BB(
			TAnnotationType tNestedType, TAbstractType tOuterType) {
		if (!tNestedType.equals(tOuterType)) {
			TAbstractType __DEC_tNestedType_innerTypes_920589 = tNestedType.getOuterType();
			if (__DEC_tNestedType_innerTypes_920589 != null) {
				if (!tNestedType.equals(__DEC_tNestedType_innerTypes_920589)) {
					if (!tOuterType.equals(__DEC_tNestedType_innerTypes_920589)) {
						return new Object[] { tNestedType, tOuterType };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_28_1_matchtggpattern_black_nac_5BB(TypeGraph typeGraph,
			TPackage tNestedPackage) {
		if (typeGraph.getPackages().contains(tNestedPackage)) {
			return new Object[] { typeGraph, tNestedPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_28_1_matchtggpattern_black_nac_6BB(TPackage tOuterPackage,
			TAnnotationType tNestedType) {
		if (tOuterPackage.getOwnedTypes().contains(tNestedType)) {
			return new Object[] { tOuterPackage, tNestedType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_28_1_matchtggpattern_blackBBBBB(TPackage tNestedPackage,
			TypeGraph typeGraph, TAnnotationType tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				if (tNestedPackage.getOwnedTypes().contains(tNestedType)) {
					if (tOuterPackage.getSubpackage().contains(tNestedPackage)) {
						if (typeGraph.getOwnedTypes().contains(tOuterType)) {
							if (typeGraph.getOwnedTypes().contains(tNestedType)) {
								if (tOuterPackage.getOwnedTypes().contains(tOuterType)) {
									if (tOuterType.getInnerTypes().contains(tNestedType)) {
										if (typeGraph.equals(tNestedPackage.getTypeGraph())) {
											if (typeGraph.getTAnnotationTypes().contains(tNestedType)) {
												if (typeGraph.equals(tOuterPackage.getTypeGraph())) {
													if (pattern_AnnotationTypeNested_28_1_matchtggpattern_black_nac_0BB(
															tNestedPackage, tOuterPackage) == null) {
														if (pattern_AnnotationTypeNested_28_1_matchtggpattern_black_nac_1BB(
																tNestedPackage, typeGraph) == null) {
															if (pattern_AnnotationTypeNested_28_1_matchtggpattern_black_nac_2BB(
																	tNestedType, typeGraph) == null) {
																if (pattern_AnnotationTypeNested_28_1_matchtggpattern_black_nac_3BBB(
																		tNestedType, tNestedPackage,
																		tOuterPackage) == null) {
																	if (pattern_AnnotationTypeNested_28_1_matchtggpattern_black_nac_4BB(
																			tNestedType, tOuterType) == null) {
																		if (pattern_AnnotationTypeNested_28_1_matchtggpattern_black_nac_5BB(
																				typeGraph, tNestedPackage) == null) {
																			if (pattern_AnnotationTypeNested_28_1_matchtggpattern_black_nac_6BB(
																					tOuterPackage,
																					tNestedType) == null) {
																				return new Object[] { tNestedPackage,
																						typeGraph, tNestedType,
																						tOuterType, tOuterPackage };
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eOuterTypeToTOuterInterface) {
		if (ruleResult.getCorrObjects().contains(eOuterTypeToTOuterInterface)) {
			return new Object[] { ruleResult, eOuterTypeToTOuterInterface };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration eOuterType) {
		if (ruleResult.getSourceObjects().contains(eOuterType)) {
			return new Object[] { ruleResult, eOuterType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeNested_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TPackage tOuterPackage) {
		if (ruleResult.getTargetObjects().contains(tOuterPackage)) {
			return new Object[] { ruleResult, tOuterPackage };
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
							TypeGraph typeGraph = tOuterType.getPg();
							if (typeGraph != null) {
								TPackage tOuterPackage = tOuterType.getPackage();
								if (tOuterPackage != null) {
									if (typeGraph.equals(tOuterPackage.getTypeGraph())) {
										if (pattern_AnnotationTypeNested_29_2_isapplicablecore_black_nac_2BB(ruleResult,
												eOuterTypeToTOuterInterface) == null) {
											if (pattern_AnnotationTypeNested_29_2_isapplicablecore_black_nac_1BB(
													ruleResult, tOuterType) == null) {
												if (pattern_AnnotationTypeNested_29_2_isapplicablecore_black_nac_3BB(
														ruleResult, eOuterType) == null) {
													if (pattern_AnnotationTypeNested_29_2_isapplicablecore_black_nac_0BB(
															ruleResult, typeGraph) == null) {
														if (pattern_AnnotationTypeNested_29_2_isapplicablecore_black_nac_4BB(
																ruleResult, tOuterPackage) == null) {
															_result.add(new Object[] { eOuterTypeToTOuterInterfaceList,
																	typeGraph, tOuterType, eOuterTypeToTOuterInterface,
																	eOuterType, tOuterPackage, ruleEntryContainer,
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

	public static final Object[] pattern_AnnotationTypeNested_29_6_perform_greenFFFBFBFBBBB(TypeGraph typeGraph,
			TAbstractType tOuterType, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		AnnotationTypeDeclaration eNestedType = JavaFactory.eINSTANCE.createAnnotationTypeDeclaration();
		TypeToTAbstractType eNestedTypeToTNestedType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		TPackage tNestedPackage = BasicFactory.eINSTANCE.createTPackage();
		TAnnotationType tNestedType = AnnotationsFactory.eINSTANCE.createTAnnotationType();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		Object _localVariable_0 = csp.getValue("eNestedType", "name");
		Object _localVariable_1 = csp.getValue("eNestedType", "proxy");
		Object _localVariable_2 = csp.getValue("tNestedPackage", "tName");
		Object _localVariable_3 = csp.getValue("tNestedType", "tName");
		Object _localVariable_4 = csp.getValue("tNestedType", "tLib");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_5 = ruleResult.getIncrementedPerformCount();
		eNestedType.setAbstractTypeDeclaration(eOuterType);
		ruleResult.getSourceObjects().add(eNestedType);
		eNestedTypeToTNestedType.setSource(eNestedType);
		ruleResult.getCorrObjects().add(eNestedTypeToTNestedType);
		tOuterPackage.getSubpackage().add(tNestedPackage);
		tNestedPackage.setTypeGraph(typeGraph);
		ruleResult.getTargetObjects().add(tNestedPackage);
		tNestedPackage.getOwnedTypes().add(tNestedType);
		typeGraph.getOwnedTypes().add(tNestedType);
		tOuterType.getInnerTypes().add(tNestedType);
		typeGraph.getTAnnotationTypes().add(tNestedType);
		eNestedTypeToTNestedType.setTarget(tNestedType);
		ruleResult.getTargetObjects().add(tNestedType);
		mBodyToTAnnotation.setSource(eNestedType);
		mBodyToTAnnotation.setTarget(tNestedType);
		ruleResult.getCorrObjects().add(mBodyToTAnnotation);
		String eNestedType_name_prime = (String) _localVariable_0;
		boolean eNestedType_proxy_prime = (boolean) _localVariable_1;
		String tNestedPackage_tName_prime = (String) _localVariable_2;
		String tNestedType_tName_prime = (String) _localVariable_3;
		boolean tNestedType_tLib_prime = (boolean) _localVariable_4;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_5);
		eNestedType.setName(eNestedType_name_prime);
		eNestedType.setProxy(Boolean.valueOf(eNestedType_proxy_prime));
		tNestedPackage.setTName(tNestedPackage_tName_prime);
		tNestedType.setTName(tNestedType_tName_prime);
		tNestedType.setTLib(Boolean.valueOf(tNestedType_tLib_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { eNestedType, eNestedTypeToTNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType,
				mBodyToTAnnotation, eOuterType, tOuterPackage, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_AnnotationTypeNested_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnnotationTypeNestedImpl
