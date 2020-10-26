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
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.Type;

import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MClass;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.ClassDeclarationToTClass;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.ClassInnerClassMember;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TPackage;
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
 * An implementation of the model object '<em><b>Class Inner Class Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ClassInnerClassMemberImpl extends AbstractRuleImpl implements ClassInnerClassMember {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassInnerClassMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getClassInnerClassMember();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MClass mInnerClass, ClassDeclaration eOuterClass,
			MAbstractMethodDefinition mDefinition) {

		Object[] result1_black = ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_0_1_initialbindings_blackBBBBB(
				this, match, mInnerClass, eOuterClass, mDefinition);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mInnerClass] = " + mInnerClass + ", " + "[eOuterClass] = "
					+ eOuterClass + ", " + "[mDefinition] = " + mDefinition + ".");
		}

		Object[] result2_bindingAndBlack = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mInnerClass, eOuterClass,
						mDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mInnerClass] = " + mInnerClass + ", " + "[eOuterClass] = "
					+ eOuterClass + ", " + "[mDefinition] = " + mDefinition + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ClassInnerClassMemberImpl
					.pattern_ClassInnerClassMember_0_4_collectelementstobetranslated_blackBBBB(match, mInnerClass,
							eOuterClass, mDefinition);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mInnerClass] = " + mInnerClass + ", " + "[eOuterClass] = " + eOuterClass + ", "
						+ "[mDefinition] = " + mDefinition + ".");
			}
			ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_0_4_collectelementstobetranslated_greenBBBF(match,
					mInnerClass, mDefinition);
			//nothing EMoflonEdge mDefinition__mInnerClass____mInnerTypes = (EMoflonEdge) result4_green[3];

			Object[] result5_black = ClassInnerClassMemberImpl
					.pattern_ClassInnerClassMember_0_5_collectcontextelements_blackBBBB(match, mInnerClass, eOuterClass,
							mDefinition);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mInnerClass] = " + mInnerClass + ", " + "[eOuterClass] = " + eOuterClass + ", "
						+ "[mDefinition] = " + mDefinition + ".");
			}
			ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_0_5_collectcontextelements_greenBBBFF(match,
					eOuterClass, mDefinition);
			//nothing EMoflonEdge eOuterClass__mDefinition____bodyDeclarations = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge mDefinition__eOuterClass____abstractTypeDeclaration = (EMoflonEdge) result5_green[4];

			// 
			ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_0_6_registerobjectstomatch_expressionBBBBB(this,
					match, mInnerClass, eOuterClass, mDefinition);
			return ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_0_7_expressionF();
		} else {
			return ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MClass mInnerClass = (MClass) result1_bindingAndBlack[0];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[1];
		ClassDeclaration eOuterClass = (ClassDeclaration) result1_bindingAndBlack[2];
		MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) result1_bindingAndBlack[3];
		TClass tOuterClass = (TClass) result1_bindingAndBlack[4];
		TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result1_bindingAndBlack[5];
		TPackage tOuterPackage = (TPackage) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_1_1_performtransformation_greenFBBFBFFBB(mInnerClass, typeGraph,
						tOuterClass, tOuterPackage, csp);
		TypeToTAbstractType tInnerTypeToTInnerAbstractType = (TypeToTAbstractType) result1_green[0];
		TPackage tInnerPackage = (TPackage) result1_green[3];
		TClass tInnerClass = (TClass) result1_green[5];
		ClassDeclarationToTClass tInnerClassToTInnerClass = (ClassDeclarationToTClass) result1_green[6];

		Object[] result2_black = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_1_2_collecttranslatedelements_blackBBBBB(tInnerTypeToTInnerAbstractType,
						mInnerClass, tInnerPackage, tInnerClass, tInnerClassToTInnerClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: "
					+ "[tInnerTypeToTInnerAbstractType] = " + tInnerTypeToTInnerAbstractType + ", " + "[mInnerClass] = "
					+ mInnerClass + ", " + "[tInnerPackage] = " + tInnerPackage + ", " + "[tInnerClass] = "
					+ tInnerClass + ", " + "[tInnerClassToTInnerClass] = " + tInnerClassToTInnerClass + ".");
		}
		Object[] result2_green = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_1_2_collecttranslatedelements_greenFBBBBB(tInnerTypeToTInnerAbstractType,
						mInnerClass, tInnerPackage, tInnerClass, tInnerClassToTInnerClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(ruleresult,
						tInnerTypeToTInnerAbstractType, mInnerClass, typeGraph, eOuterClass, tInnerPackage, mDefinition,
						tOuterClass, tInnerClass, eOuterClassToTOuterClass, tInnerClassToTInnerClass, tOuterPackage);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tInnerTypeToTInnerAbstractType] = " + tInnerTypeToTInnerAbstractType + ", "
					+ "[mInnerClass] = " + mInnerClass + ", " + "[typeGraph] = " + typeGraph + ", " + "[eOuterClass] = "
					+ eOuterClass + ", " + "[tInnerPackage] = " + tInnerPackage + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[tOuterClass] = " + tOuterClass + ", " + "[tInnerClass] = " + tInnerClass
					+ ", " + "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", "
					+ "[tInnerClassToTInnerClass] = " + tInnerClassToTInnerClass + ", " + "[tOuterPackage] = "
					+ tOuterPackage + ".");
		}
		ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_1_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFF(
				ruleresult, tInnerTypeToTInnerAbstractType, mInnerClass, typeGraph, tInnerPackage, mDefinition,
				tOuterClass, tInnerClass, tInnerClassToTInnerClass, tOuterPackage);
		//nothing EMoflonEdge tInnerClassToTInnerClass__tInnerClass____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge typeGraph__tInnerClass____classes = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tInnerPackage__tInnerClass____classes = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tInnerTypeToTInnerAbstractType__mInnerClass____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tInnerTypeToTInnerAbstractType__tInnerClass____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tInnerPackage__tOuterPackage____parent = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tOuterPackage__tInnerPackage____subpackage = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tInnerClass__tInnerPackage____package = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tInnerClassToTInnerClass__mInnerClass____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge typeGraph__tInnerClass____ownedTypes = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge tInnerClass__typeGraph____pg = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge tOuterClass__tInnerClass____innerTypes = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge tInnerClass__tOuterClass____outerType = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge mDefinition__mInnerClass____mInnerTypes = (EMoflonEdge) result3_green[24];

		// 
		// 
		ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_1_5_registerobjects_expressionBBBBBBBBBBBBB(this,
				ruleresult, tInnerTypeToTInnerAbstractType, mInnerClass, typeGraph, eOuterClass, tInnerPackage,
				mDefinition, tOuterClass, tInnerClass, eOuterClassToTOuterClass, tInnerClassToTInnerClass,
				tOuterPackage);
		return ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MClass mInnerClass = (MClass) result2_binding[0];
		ClassDeclaration eOuterClass = (ClassDeclaration) result2_binding[1];
		MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) result2_binding[2];
		for (Object[] result2_black : ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_2_2_corematch_blackBBBFFB(
				mInnerClass, eOuterClass, mDefinition, match)) {
			TClass tOuterClass = (TClass) result2_black[3];
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result2_black[4];
			// ForEach 
			for (Object[] result3_black : ClassInnerClassMemberImpl
					.pattern_ClassInnerClassMember_2_3_findcontext_blackBFBBBBF(mInnerClass, eOuterClass, mDefinition,
							tOuterClass, eOuterClassToTOuterClass)) {
				TypeGraph typeGraph = (TypeGraph) result3_black[1];
				TPackage tOuterPackage = (TPackage) result3_black[6];
				Object[] result3_green = ClassInnerClassMemberImpl
						.pattern_ClassInnerClassMember_2_3_findcontext_greenBBBBBBBFFFFFFFFFF(mInnerClass, typeGraph,
								eOuterClass, mDefinition, tOuterClass, eOuterClassToTOuterClass, tOuterPackage);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge eOuterClassToTOuterClass__eOuterClass____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge eOuterClassToTOuterClass__tOuterClass____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge eOuterClass__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mDefinition__eOuterClass____abstractTypeDeclaration = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge typeGraph__tOuterClass____ownedTypes = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tOuterClass__typeGraph____pg = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tOuterClass__tOuterPackage____package = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tOuterPackage__tOuterClass____ownedTypes = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mDefinition__mInnerClass____mInnerTypes = (EMoflonEdge) result3_green[16];

				Object[] result4_bindingAndBlack = ClassInnerClassMemberImpl
						.pattern_ClassInnerClassMember_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								mInnerClass, typeGraph, eOuterClass, mDefinition, tOuterClass, eOuterClassToTOuterClass,
								tOuterPackage);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mInnerClass] = " + mInnerClass
							+ ", " + "[typeGraph] = " + typeGraph + ", " + "[eOuterClass] = " + eOuterClass + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[tOuterClass] = " + tOuterClass + ", "
							+ "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", " + "[tOuterPackage] = "
							+ tOuterPackage + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ClassInnerClassMemberImpl
							.pattern_ClassInnerClassMember_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MClass mInnerClass, ClassDeclaration eOuterClass,
			MAbstractMethodDefinition mDefinition) {
		match.registerObject("mInnerClass", mInnerClass);
		match.registerObject("eOuterClass", eOuterClass);
		match.registerObject("mDefinition", mDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MClass mInnerClass, ClassDeclaration eOuterClass,
			MAbstractMethodDefinition mDefinition) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MClass mInnerClass, TypeGraph typeGraph,
			ClassDeclaration eOuterClass, MAbstractMethodDefinition mDefinition, TClass tOuterClass,
			TypeToTAbstractType eOuterClassToTOuterClass, TPackage tOuterPackage) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$1");
		literal0.setType("");

		// Create attribute variables
		Variable var_mInnerClass_name = CSPFactoryHelper.eINSTANCE.createVariable("mInnerClass.name", true, csp);
		var_mInnerClass_name.setValue(mInnerClass.getName());
		var_mInnerClass_name.setType("String");
		Variable var_tOuterClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterClass.tName", true, csp);
		var_tOuterClass_tName.setValue(tOuterClass.getTName());
		var_tOuterClass_tName.setType("String");

		// Create unbound variables
		Variable var_tInnerClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass.tName", csp);
		var_tInnerClass_tName.setType("String");
		Variable var_tInnerPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerPackage.tName", csp);
		var_tInnerPackage_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(addSuffix);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mInnerClass_name, var_tInnerClass_tName);
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_tOuterClass_tName, literal0, var_tInnerPackage_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mInnerClass", mInnerClass);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("eOuterClass", eOuterClass);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tOuterClass", tOuterClass);
		isApplicableMatch.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tInnerTypeToTInnerAbstractType,
			EObject mInnerClass, EObject typeGraph, EObject eOuterClass, EObject tInnerPackage, EObject mDefinition,
			EObject tOuterClass, EObject tInnerClass, EObject eOuterClassToTOuterClass,
			EObject tInnerClassToTInnerClass, EObject tOuterPackage) {
		ruleresult.registerObject("tInnerTypeToTInnerAbstractType", tInnerTypeToTInnerAbstractType);
		ruleresult.registerObject("mInnerClass", mInnerClass);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("eOuterClass", eOuterClass);
		ruleresult.registerObject("tInnerPackage", tInnerPackage);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("tOuterClass", tOuterClass);
		ruleresult.registerObject("tInnerClass", tInnerClass);
		ruleresult.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
		ruleresult.registerObject("tInnerClassToTInnerClass", tInnerClassToTInnerClass);
		ruleresult.registerObject("tOuterPackage", tOuterPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mInnerClass").eClass())
				.equals("modisco.MClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TypeGraph typeGraph, TPackage tInnerPackage, TClass tOuterClass,
			TClass tInnerClass, TPackage tOuterPackage) {

		Object[] result1_black = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_10_1_initialbindings_blackBBBBBBB(this, match, typeGraph, tInnerPackage,
						tOuterClass, tInnerClass, tOuterPackage);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[typeGraph] = " + typeGraph + ", " + "[tInnerPackage] = "
					+ tInnerPackage + ", " + "[tOuterClass] = " + tOuterClass + ", " + "[tInnerClass] = " + tInnerClass
					+ ", " + "[tOuterPackage] = " + tOuterPackage + ".");
		}

		Object[] result2_bindingAndBlack = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, typeGraph,
						tInnerPackage, tOuterClass, tInnerClass, tOuterPackage);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[typeGraph] = " + typeGraph + ", " + "[tInnerPackage] = "
					+ tInnerPackage + ", " + "[tOuterClass] = " + tOuterClass + ", " + "[tInnerClass] = " + tInnerClass
					+ ", " + "[tOuterPackage] = " + tOuterPackage + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ClassInnerClassMemberImpl
					.pattern_ClassInnerClassMember_10_4_collectelementstobetranslated_blackBBBBBB(match, typeGraph,
							tInnerPackage, tOuterClass, tInnerClass, tOuterPackage);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tInnerPackage] = " + tInnerPackage + ", "
						+ "[tOuterClass] = " + tOuterClass + ", " + "[tInnerClass] = " + tInnerClass + ", "
						+ "[tOuterPackage] = " + tOuterPackage + ".");
			}
			ClassInnerClassMemberImpl
					.pattern_ClassInnerClassMember_10_4_collectelementstobetranslated_greenBBBBBBFFFFFFFFFF(match,
							typeGraph, tInnerPackage, tOuterClass, tInnerClass, tOuterPackage);
			//nothing EMoflonEdge typeGraph__tInnerClass____classes = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge tInnerPackage__tInnerClass____classes = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tInnerPackage__tOuterPackage____parent = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge tOuterPackage__tInnerPackage____subpackage = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge tInnerClass__tInnerPackage____package = (EMoflonEdge) result4_green[11];
			//nothing EMoflonEdge typeGraph__tInnerClass____ownedTypes = (EMoflonEdge) result4_green[12];
			//nothing EMoflonEdge tInnerClass__typeGraph____pg = (EMoflonEdge) result4_green[13];
			//nothing EMoflonEdge tOuterClass__tInnerClass____innerTypes = (EMoflonEdge) result4_green[14];
			//nothing EMoflonEdge tInnerClass__tOuterClass____outerType = (EMoflonEdge) result4_green[15];

			Object[] result5_black = ClassInnerClassMemberImpl
					.pattern_ClassInnerClassMember_10_5_collectcontextelements_blackBBBBBB(match, typeGraph,
							tInnerPackage, tOuterClass, tInnerClass, tOuterPackage);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tInnerPackage] = " + tInnerPackage + ", "
						+ "[tOuterClass] = " + tOuterClass + ", " + "[tInnerClass] = " + tInnerClass + ", "
						+ "[tOuterPackage] = " + tOuterPackage + ".");
			}
			ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_10_5_collectcontextelements_greenBBBBFFFF(match,
					typeGraph, tOuterClass, tOuterPackage);
			//nothing EMoflonEdge typeGraph__tOuterClass____ownedTypes = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge tOuterClass__typeGraph____pg = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge tOuterClass__tOuterPackage____package = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge tOuterPackage__tOuterClass____ownedTypes = (EMoflonEdge) result5_green[7];

			// 
			ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_10_6_registerobjectstomatch_expressionBBBBBBB(this,
					match, typeGraph, tInnerPackage, tOuterClass, tInnerClass, tOuterPackage);
			return ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_10_7_expressionF();
		} else {
			return ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[0];
		ClassDeclaration eOuterClass = (ClassDeclaration) result1_bindingAndBlack[1];
		TPackage tInnerPackage = (TPackage) result1_bindingAndBlack[2];
		MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) result1_bindingAndBlack[3];
		TClass tOuterClass = (TClass) result1_bindingAndBlack[4];
		TClass tInnerClass = (TClass) result1_bindingAndBlack[5];
		TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result1_bindingAndBlack[6];
		TPackage tOuterPackage = (TPackage) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_11_1_performtransformation_greenFFBBFB(mDefinition, tInnerClass, csp);
		TypeToTAbstractType tInnerTypeToTInnerAbstractType = (TypeToTAbstractType) result1_green[0];
		MClass mInnerClass = (MClass) result1_green[1];
		ClassDeclarationToTClass tInnerClassToTInnerClass = (ClassDeclarationToTClass) result1_green[4];

		Object[] result2_black = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_11_2_collecttranslatedelements_blackBBBBB(tInnerTypeToTInnerAbstractType,
						mInnerClass, tInnerPackage, tInnerClass, tInnerClassToTInnerClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: "
					+ "[tInnerTypeToTInnerAbstractType] = " + tInnerTypeToTInnerAbstractType + ", " + "[mInnerClass] = "
					+ mInnerClass + ", " + "[tInnerPackage] = " + tInnerPackage + ", " + "[tInnerClass] = "
					+ tInnerClass + ", " + "[tInnerClassToTInnerClass] = " + tInnerClassToTInnerClass + ".");
		}
		Object[] result2_green = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_11_2_collecttranslatedelements_greenFBBBBB(
						tInnerTypeToTInnerAbstractType, mInnerClass, tInnerPackage, tInnerClass,
						tInnerClassToTInnerClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_11_3_bookkeepingforedges_blackBBBBBBBBBBBB(ruleresult,
						tInnerTypeToTInnerAbstractType, mInnerClass, typeGraph, eOuterClass, tInnerPackage, mDefinition,
						tOuterClass, tInnerClass, eOuterClassToTOuterClass, tInnerClassToTInnerClass, tOuterPackage);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tInnerTypeToTInnerAbstractType] = " + tInnerTypeToTInnerAbstractType + ", "
					+ "[mInnerClass] = " + mInnerClass + ", " + "[typeGraph] = " + typeGraph + ", " + "[eOuterClass] = "
					+ eOuterClass + ", " + "[tInnerPackage] = " + tInnerPackage + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[tOuterClass] = " + tOuterClass + ", " + "[tInnerClass] = " + tInnerClass
					+ ", " + "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", "
					+ "[tInnerClassToTInnerClass] = " + tInnerClassToTInnerClass + ", " + "[tOuterPackage] = "
					+ tOuterPackage + ".");
		}
		ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_11_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFF(
				ruleresult, tInnerTypeToTInnerAbstractType, mInnerClass, typeGraph, tInnerPackage, mDefinition,
				tOuterClass, tInnerClass, tInnerClassToTInnerClass, tOuterPackage);
		//nothing EMoflonEdge tInnerClassToTInnerClass__tInnerClass____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge typeGraph__tInnerClass____classes = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tInnerPackage__tInnerClass____classes = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tInnerTypeToTInnerAbstractType__mInnerClass____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tInnerTypeToTInnerAbstractType__tInnerClass____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tInnerPackage__tOuterPackage____parent = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tOuterPackage__tInnerPackage____subpackage = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tInnerClass__tInnerPackage____package = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tInnerClassToTInnerClass__mInnerClass____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge typeGraph__tInnerClass____ownedTypes = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge tInnerClass__typeGraph____pg = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge tOuterClass__tInnerClass____innerTypes = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge tInnerClass__tOuterClass____outerType = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge mDefinition__mInnerClass____mInnerTypes = (EMoflonEdge) result3_green[24];

		// 
		// 
		ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_11_5_registerobjects_expressionBBBBBBBBBBBBB(this,
				ruleresult, tInnerTypeToTInnerAbstractType, mInnerClass, typeGraph, eOuterClass, tInnerPackage,
				mDefinition, tOuterClass, tInnerClass, eOuterClassToTOuterClass, tInnerClassToTInnerClass,
				tOuterPackage);
		return ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_12_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeGraph typeGraph = (TypeGraph) result2_binding[0];
		TPackage tInnerPackage = (TPackage) result2_binding[1];
		TClass tOuterClass = (TClass) result2_binding[2];
		TClass tInnerClass = (TClass) result2_binding[3];
		TPackage tOuterPackage = (TPackage) result2_binding[4];
		for (Object[] result2_black : ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_12_2_corematch_blackBFBBBFBB(typeGraph, tInnerPackage, tOuterClass,
						tInnerClass, tOuterPackage, match)) {
			ClassDeclaration eOuterClass = (ClassDeclaration) result2_black[1];
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result2_black[5];
			// ForEach 
			for (Object[] result3_black : ClassInnerClassMemberImpl
					.pattern_ClassInnerClassMember_12_3_findcontext_blackBBBFBBBB(typeGraph, eOuterClass, tInnerPackage,
							tOuterClass, tInnerClass, eOuterClassToTOuterClass, tOuterPackage)) {
				MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) result3_black[3];
				Object[] result3_green = ClassInnerClassMemberImpl
						.pattern_ClassInnerClassMember_12_3_findcontext_greenBBBBBBBBFFFFFFFFFFFFFFFFFFF(typeGraph,
								eOuterClass, tInnerPackage, mDefinition, tOuterClass, tInnerClass,
								eOuterClassToTOuterClass, tOuterPackage);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge eOuterClassToTOuterClass__eOuterClass____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge typeGraph__tInnerClass____classes = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tInnerPackage__tInnerClass____classes = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eOuterClassToTOuterClass__tOuterClass____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tInnerPackage__tOuterPackage____parent = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tOuterPackage__tInnerPackage____subpackage = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tInnerClass__tInnerPackage____package = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge typeGraph__tInnerClass____ownedTypes = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge tInnerClass__typeGraph____pg = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge eOuterClass__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge mDefinition__eOuterClass____abstractTypeDeclaration = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge tOuterClass__tInnerClass____innerTypes = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge tInnerClass__tOuterClass____outerType = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge typeGraph__tOuterClass____ownedTypes = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge tOuterClass__typeGraph____pg = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge tOuterClass__tOuterPackage____package = (EMoflonEdge) result3_green[25];
				//nothing EMoflonEdge tOuterPackage__tOuterClass____ownedTypes = (EMoflonEdge) result3_green[26];

				Object[] result4_bindingAndBlack = ClassInnerClassMemberImpl
						.pattern_ClassInnerClassMember_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								typeGraph, eOuterClass, tInnerPackage, mDefinition, tOuterClass, tInnerClass,
								eOuterClassToTOuterClass, tOuterPackage);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[typeGraph] = " + typeGraph + ", "
							+ "[eOuterClass] = " + eOuterClass + ", " + "[tInnerPackage] = " + tInnerPackage + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[tOuterClass] = " + tOuterClass + ", "
							+ "[tInnerClass] = " + tInnerClass + ", " + "[eOuterClassToTOuterClass] = "
							+ eOuterClassToTOuterClass + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ClassInnerClassMemberImpl
							.pattern_ClassInnerClassMember_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TypeGraph typeGraph, TPackage tInnerPackage, TClass tOuterClass,
			TClass tInnerClass, TPackage tOuterPackage) {
		match.registerObject("typeGraph", typeGraph);
		match.registerObject("tInnerPackage", tInnerPackage);
		match.registerObject("tOuterClass", tOuterClass);
		match.registerObject("tInnerClass", tInnerClass);
		match.registerObject("tOuterPackage", tOuterPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph typeGraph, TPackage tInnerPackage, TClass tOuterClass,
			TClass tInnerClass, TPackage tOuterPackage) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$1");
		literal0.setType("");

		// Create attribute variables
		Variable var_tOuterClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterClass.tName", true, csp);
		var_tOuterClass_tName.setValue(tOuterClass.getTName());
		var_tOuterClass_tName.setType("String");
		Variable var_tInnerPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerPackage.tName", true, csp);
		var_tInnerPackage_tName.setValue(tInnerPackage.getTName());
		var_tInnerPackage_tName.setType("String");

		// Create unbound variables

		// Create constraints
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(addSuffix);

		// Solve CSP
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_tOuterClass_tName, literal0, var_tInnerPackage_tName);
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
			ClassDeclaration eOuterClass, TPackage tInnerPackage, MAbstractMethodDefinition mDefinition,
			TClass tOuterClass, TClass tInnerClass, TypeToTAbstractType eOuterClassToTOuterClass,
			TPackage tOuterPackage) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tInnerClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass.tName", true, csp);
		var_tInnerClass_tName.setValue(tInnerClass.getTName());
		var_tInnerClass_tName.setType("String");

		// Create unbound variables
		Variable var_mInnerClass_name = CSPFactoryHelper.eINSTANCE.createVariable("mInnerClass.name", csp);
		var_mInnerClass_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mInnerClass_name, var_tInnerClass_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("eOuterClass", eOuterClass);
		isApplicableMatch.registerObject("tInnerPackage", tInnerPackage);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tOuterClass", tOuterClass);
		isApplicableMatch.registerObject("tInnerClass", tInnerClass);
		isApplicableMatch.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tInnerTypeToTInnerAbstractType,
			EObject mInnerClass, EObject typeGraph, EObject eOuterClass, EObject tInnerPackage, EObject mDefinition,
			EObject tOuterClass, EObject tInnerClass, EObject eOuterClassToTOuterClass,
			EObject tInnerClassToTInnerClass, EObject tOuterPackage) {
		ruleresult.registerObject("tInnerTypeToTInnerAbstractType", tInnerTypeToTInnerAbstractType);
		ruleresult.registerObject("mInnerClass", mInnerClass);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("eOuterClass", eOuterClass);
		ruleresult.registerObject("tInnerPackage", tInnerPackage);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("tOuterClass", tOuterClass);
		ruleresult.registerObject("tInnerClass", tInnerClass);
		ruleresult.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
		ruleresult.registerObject("tInnerClassToTInnerClass", tInnerClassToTInnerClass);
		ruleresult.registerObject("tOuterPackage", tOuterPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tInnerPackage").eClass())
						.equals("basic.TPackage.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tInnerClass").eClass())
						.equals("basic.TClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_50(EMoflonEdge _edge_classes) {

		Object[] result1_bindingAndBlack = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_20_2_testcorematchandDECs_blackFFFFFB(_edge_classes)) {
			TypeGraph typeGraph = (TypeGraph) result2_black[0];
			TPackage tInnerPackage = (TPackage) result2_black[1];
			TClass tOuterClass = (TClass) result2_black[2];
			TClass tInnerClass = (TClass) result2_black[3];
			TPackage tOuterPackage = (TPackage) result2_black[4];
			Object[] result2_green = ClassInnerClassMemberImpl
					.pattern_ClassInnerClassMember_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ClassInnerClassMemberImpl
					.pattern_ClassInnerClassMember_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, typeGraph, tInnerPackage, tOuterClass, tInnerClass, tOuterPackage)) {
				// 
				if (ClassInnerClassMemberImpl
						.pattern_ClassInnerClassMember_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ClassInnerClassMemberImpl
							.pattern_ClassInnerClassMember_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_51(EMoflonEdge _edge_mInnerTypes) {

		Object[] result1_bindingAndBlack = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_21_2_testcorematchandDECs_blackFFFB(_edge_mInnerTypes)) {
			MClass mInnerClass = (MClass) result2_black[0];
			ClassDeclaration eOuterClass = (ClassDeclaration) result2_black[1];
			MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) result2_black[2];
			Object[] result2_green = ClassInnerClassMemberImpl
					.pattern_ClassInnerClassMember_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ClassInnerClassMemberImpl
					.pattern_ClassInnerClassMember_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, mInnerClass, eOuterClass, mDefinition)) {
				// 
				if (ClassInnerClassMemberImpl
						.pattern_ClassInnerClassMember_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ClassInnerClassMemberImpl
							.pattern_ClassInnerClassMember_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ClassInnerClassMember");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mInnerClass_name = CSPFactoryHelper.eINSTANCE.createVariable("mInnerClass", true, csp);
		var_mInnerClass_name.setValue(__helper.getValue("mInnerClass", "name"));
		var_mInnerClass_name.setType("String");

		Variable var_tInnerClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass", true, csp);
		var_tInnerClass_tName.setValue(__helper.getValue("tInnerClass", "tName"));
		var_tInnerClass_tName.setType("String");

		Variable var_tOuterClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterClass", true, csp);
		var_tOuterClass_tName.setValue(__helper.getValue("tOuterClass", "tName"));
		var_tOuterClass_tName.setType("String");

		Variable var_tInnerPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerPackage", true, csp);
		var_tInnerPackage_tName.setValue(__helper.getValue("tInnerPackage", "tName"));
		var_tInnerPackage_tName.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$1");
		var_literal0.setType("");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		AddSuffix addSuffix1 = new AddSuffix();
		csp.getConstraints().add(addSuffix1);

		eq0.setRuleName("ClassInnerClassMember");
		eq0.solve(var_mInnerClass_name, var_tInnerClass_tName);

		addSuffix1.setRuleName("ClassInnerClassMember");
		addSuffix1.solve(var_tOuterClass_tName, var_literal0, var_tInnerPackage_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tInnerClass_tName.setBound(false);
			var_tInnerPackage_tName.setBound(false);
			eq0.solve(var_mInnerClass_name, var_tInnerClass_tName);
			addSuffix1.solve(var_tOuterClass_tName, var_literal0, var_tInnerPackage_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tInnerClass", "tName", var_tInnerClass_tName.getValue());
				__helper.setValue("tInnerPackage", "tName", var_tInnerPackage_tName.getValue());
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
		ruleResult.setRule("ClassInnerClassMember");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mInnerClass_name = CSPFactoryHelper.eINSTANCE.createVariable("mInnerClass", true, csp);
		var_mInnerClass_name.setValue(__helper.getValue("mInnerClass", "name"));
		var_mInnerClass_name.setType("String");

		Variable var_tInnerClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass", true, csp);
		var_tInnerClass_tName.setValue(__helper.getValue("tInnerClass", "tName"));
		var_tInnerClass_tName.setType("String");

		Variable var_tOuterClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterClass", true, csp);
		var_tOuterClass_tName.setValue(__helper.getValue("tOuterClass", "tName"));
		var_tOuterClass_tName.setType("String");

		Variable var_tInnerPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerPackage", true, csp);
		var_tInnerPackage_tName.setValue(__helper.getValue("tInnerPackage", "tName"));
		var_tInnerPackage_tName.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$1");
		var_literal0.setType("");

		AddSuffix addSuffix0 = new AddSuffix();
		csp.getConstraints().add(addSuffix0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		addSuffix0.setRuleName("ClassInnerClassMember");
		addSuffix0.solve(var_tOuterClass_tName, var_literal0, var_tInnerPackage_tName);

		eq1.setRuleName("ClassInnerClassMember");
		eq1.solve(var_mInnerClass_name, var_tInnerClass_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mInnerClass_name.setBound(false);
			addSuffix0.solve(var_tOuterClass_tName, var_literal0, var_tInnerPackage_tName);
			eq1.solve(var_mInnerClass_name, var_tInnerClass_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mInnerClass", "name", var_mInnerClass_name.getValue());
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

		Object[] result1_black = ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MClass mInnerClass = (MClass) result2_bindingAndBlack[0];
		TypeGraph typeGraph = (TypeGraph) result2_bindingAndBlack[1];
		ClassDeclaration eOuterClass = (ClassDeclaration) result2_bindingAndBlack[2];
		TPackage tInnerPackage = (TPackage) result2_bindingAndBlack[3];
		MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) result2_bindingAndBlack[4];
		TClass tOuterClass = (TClass) result2_bindingAndBlack[5];
		TClass tInnerClass = (TClass) result2_bindingAndBlack[6];
		TPackage tOuterPackage = (TPackage) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, mInnerClass, typeGraph,
						eOuterClass, tInnerPackage, mDefinition, tOuterClass, tInnerClass, tOuterPackage, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mInnerClass] = " + mInnerClass + ", " + "[typeGraph] = " + typeGraph + ", " + "[eOuterClass] = "
					+ eOuterClass + ", " + "[tInnerPackage] = " + tInnerPackage + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[tOuterClass] = " + tOuterClass + ", " + "[tInnerClass] = " + tInnerClass
					+ ", " + "[tOuterPackage] = " + tOuterPackage + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ClassInnerClassMemberImpl
					.pattern_ClassInnerClassMember_24_5_matchcorrcontext_blackBBFBB(eOuterClass, tOuterClass,
							sourceMatch, targetMatch)) {
				TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result5_black[2];
				Object[] result5_green = ClassInnerClassMemberImpl
						.pattern_ClassInnerClassMember_24_5_matchcorrcontext_greenBBBF(eOuterClassToTOuterClass,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = ClassInnerClassMemberImpl
						.pattern_ClassInnerClassMember_24_6_createcorrespondence_blackBBBBBBBBB(mInnerClass, typeGraph,
								eOuterClass, tInnerPackage, mDefinition, tOuterClass, tInnerClass, tOuterPackage,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mInnerClass] = "
							+ mInnerClass + ", " + "[typeGraph] = " + typeGraph + ", " + "[eOuterClass] = "
							+ eOuterClass + ", " + "[tInnerPackage] = " + tInnerPackage + ", " + "[mDefinition] = "
							+ mDefinition + ", " + "[tOuterClass] = " + tOuterClass + ", " + "[tInnerClass] = "
							+ tInnerClass + ", " + "[tOuterPackage] = " + tOuterPackage + ", " + "[ccMatch] = "
							+ ccMatch + ".");
				}
				ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_24_6_createcorrespondence_greenFBBFB(
						mInnerClass, tInnerClass, ccMatch);
				//nothing TypeToTAbstractType tInnerTypeToTInnerAbstractType = (TypeToTAbstractType) result6_green[0];
				//nothing ClassDeclarationToTClass tInnerClassToTInnerClass = (ClassDeclarationToTClass) result6_green[3];

				Object[] result7_black = ClassInnerClassMemberImpl
						.pattern_ClassInnerClassMember_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MClass mInnerClass, TypeGraph typeGraph, ClassDeclaration eOuterClass,
			TPackage tInnerPackage, MAbstractMethodDefinition mDefinition, TClass tOuterClass, TClass tInnerClass,
			TPackage tOuterPackage, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$1");
		literal0.setType("");

		// Create attribute variables
		Variable var_mInnerClass_name = CSPFactoryHelper.eINSTANCE.createVariable("mInnerClass.name", true, csp);
		var_mInnerClass_name.setValue(mInnerClass.getName());
		var_mInnerClass_name.setType("String");
		Variable var_tInnerClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass.tName", true, csp);
		var_tInnerClass_tName.setValue(tInnerClass.getTName());
		var_tInnerClass_tName.setType("String");
		Variable var_tOuterClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterClass.tName", true, csp);
		var_tOuterClass_tName.setValue(tOuterClass.getTName());
		var_tOuterClass_tName.setType("String");
		Variable var_tInnerPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerPackage.tName", true, csp);
		var_tInnerPackage_tName.setValue(tInnerPackage.getTName());
		var_tInnerPackage_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(addSuffix);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mInnerClass_name, var_tInnerClass_tName);
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_tOuterClass_tName, literal0, var_tInnerPackage_tName);
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
	public boolean checkDEC_FWD(MClass mInnerClass, ClassDeclaration eOuterClass,
			MAbstractMethodDefinition mDefinition) {// 
		Object[] result1_black = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_27_1_matchtggpattern_blackBBB(mInnerClass, eOuterClass, mDefinition);
		if (result1_black != null) {
			return ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_27_2_expressionF();
		} else {
			return ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TypeGraph typeGraph, TPackage tInnerPackage, TClass tOuterClass, TClass tInnerClass,
			TPackage tOuterPackage) {// 
		Object[] result1_black = ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_28_1_matchtggpattern_blackBBBBB(typeGraph, tInnerPackage, tOuterClass,
						tInnerClass, tOuterPackage);
		if (result1_black != null) {
			return ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_28_2_expressionF();
		} else {
			return ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType eOuterClassToTOuterClassParameter) {

		Object[] result1_black = ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ClassInnerClassMemberImpl
				.pattern_ClassInnerClassMember_29_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList eOuterClassToTOuterClassList = (RuleEntryList) result2_black[0];
			TypeGraph typeGraph = (TypeGraph) result2_black[1];
			TClass tOuterClass = (TClass) result2_black[2];
			TPackage tOuterPackage = (TPackage) result2_black[3];
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result2_black[4];
			ClassDeclaration eOuterClass = (ClassDeclaration) result2_black[5];
			MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) result2_black[6];

			Object[] result3_bindingAndBlack = ClassInnerClassMemberImpl
					.pattern_ClassInnerClassMember_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							typeGraph, eOuterClass, mDefinition, tOuterClass, eOuterClassToTOuterClass, tOuterPackage,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[typeGraph] = " + typeGraph + ", "
						+ "[eOuterClass] = " + eOuterClass + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[tOuterClass] = " + tOuterClass + ", " + "[eOuterClassToTOuterClass] = "
						+ eOuterClassToTOuterClass + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ClassInnerClassMemberImpl
						.pattern_ClassInnerClassMember_29_5_checknacs_blackBBBBBB(typeGraph, eOuterClass, mDefinition,
								tOuterClass, eOuterClassToTOuterClass, tOuterPackage);
				if (result5_black != null) {

					Object[] result6_black = ClassInnerClassMemberImpl
							.pattern_ClassInnerClassMember_29_6_perform_blackBBBBBBB(typeGraph, eOuterClass,
									mDefinition, tOuterClass, eOuterClassToTOuterClass, tOuterPackage, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[typeGraph] = "
								+ typeGraph + ", " + "[eOuterClass] = " + eOuterClass + ", " + "[mDefinition] = "
								+ mDefinition + ", " + "[tOuterClass] = " + tOuterClass + ", "
								+ "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", "
								+ "[tOuterPackage] = " + tOuterPackage + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_29_6_perform_greenFFBFBBFFBBB(typeGraph,
							mDefinition, tOuterClass, tOuterPackage, ruleResult, csp);
					//nothing TypeToTAbstractType tInnerTypeToTInnerAbstractType = (TypeToTAbstractType) result6_green[0];
					//nothing MClass mInnerClass = (MClass) result6_green[1];
					//nothing TPackage tInnerPackage = (TPackage) result6_green[3];
					//nothing TClass tInnerClass = (TClass) result6_green[6];
					//nothing ClassDeclarationToTClass tInnerClassToTInnerClass = (ClassDeclarationToTClass) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return ClassInnerClassMemberImpl.pattern_ClassInnerClassMember_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeGraph typeGraph,
			ClassDeclaration eOuterClass, MAbstractMethodDefinition mDefinition, TClass tOuterClass,
			TypeToTAbstractType eOuterClassToTOuterClass, TPackage tOuterPackage, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$1");
		literal0.setType("");

		// Create attribute variables
		Variable var_tOuterClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterClass.tName", true, csp);
		var_tOuterClass_tName.setValue(tOuterClass.getTName());
		var_tOuterClass_tName.setType("String");

		// Create unbound variables
		Variable var_mInnerClass_name = CSPFactoryHelper.eINSTANCE.createVariable("mInnerClass.name", csp);
		var_mInnerClass_name.setType("String");
		Variable var_tInnerClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass.tName", csp);
		var_tInnerClass_tName.setType("String");
		Variable var_tInnerPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerPackage.tName", csp);
		var_tInnerPackage_tName.setType("String");

		// Create constraints
		AddSuffix addSuffix = new AddSuffix();
		Eq eq = new Eq();

		csp.getConstraints().add(addSuffix);
		csp.getConstraints().add(eq);

		// Solve CSP
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_tOuterClass_tName, literal0, var_tInnerPackage_tName);
		eq.setRuleName("NoRuleName");
		eq.solve(var_mInnerClass_name, var_tInnerClass_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("eOuterClass", eOuterClass);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tOuterClass", tOuterClass);
		isApplicableMatch.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
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
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___IS_APPROPRIATE_FWD__MATCH_MCLASS_CLASSDECLARATION_MABSTRACTMETHODDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (MClass) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (MAbstractMethodDefinition) arguments.get(3));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MCLASS_CLASSDECLARATION_MABSTRACTMETHODDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MClass) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (MAbstractMethodDefinition) arguments.get(3));
			return null;
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MCLASS_CLASSDECLARATION_MABSTRACTMETHODDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MClass) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (MAbstractMethodDefinition) arguments.get(3));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MCLASS_TYPEGRAPH_CLASSDECLARATION_MABSTRACTMETHODDEFINITION_TCLASS_TYPETOTABSTRACTTYPE_TPACKAGE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MClass) arguments.get(1),
					(TypeGraph) arguments.get(2), (ClassDeclaration) arguments.get(3),
					(MAbstractMethodDefinition) arguments.get(4), (TClass) arguments.get(5),
					(TypeToTAbstractType) arguments.get(6), (TPackage) arguments.get(7));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TPACKAGE_TCLASS_TCLASS_TPACKAGE:
			return isAppropriate_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TPackage) arguments.get(2), (TClass) arguments.get(3), (TClass) arguments.get(4),
					(TPackage) arguments.get(5));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TPACKAGE_TCLASS_TCLASS_TPACKAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TPackage) arguments.get(2), (TClass) arguments.get(3), (TClass) arguments.get(4),
					(TPackage) arguments.get(5));
			return null;
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TPACKAGE_TCLASS_TCLASS_TPACKAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TPackage) arguments.get(2), (TClass) arguments.get(3), (TClass) arguments.get(4),
					(TPackage) arguments.get(5));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_CLASSDECLARATION_TPACKAGE_MABSTRACTMETHODDEFINITION_TCLASS_TCLASS_TYPETOTABSTRACTTYPE_TPACKAGE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (TPackage) arguments.get(3),
					(MAbstractMethodDefinition) arguments.get(4), (TClass) arguments.get(5), (TClass) arguments.get(6),
					(TypeToTAbstractType) arguments.get(7), (TPackage) arguments.get(8));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___IS_APPROPRIATE_BWD_EMOFLON_EDGE_50__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_50((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_51__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_51((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___IS_APPLICABLE_SOLVE_CSP_CC__MCLASS_TYPEGRAPH_CLASSDECLARATION_TPACKAGE_MABSTRACTMETHODDEFINITION_TCLASS_TCLASS_TPACKAGE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((MClass) arguments.get(0), (TypeGraph) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (TPackage) arguments.get(3),
					(MAbstractMethodDefinition) arguments.get(4), (TClass) arguments.get(5), (TClass) arguments.get(6),
					(TPackage) arguments.get(7), (Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___CHECK_DEC_FWD__MCLASS_CLASSDECLARATION_MABSTRACTMETHODDEFINITION:
			return checkDEC_FWD((MClass) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(MAbstractMethodDefinition) arguments.get(2));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___CHECK_DEC_BWD__TYPEGRAPH_TPACKAGE_TCLASS_TCLASS_TPACKAGE:
			return checkDEC_BWD((TypeGraph) arguments.get(0), (TPackage) arguments.get(1), (TClass) arguments.get(2),
					(TClass) arguments.get(3), (TPackage) arguments.get(4));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_CLASSDECLARATION_MABSTRACTMETHODDEFINITION_TCLASS_TYPETOTABSTRACTTYPE_TPACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (MAbstractMethodDefinition) arguments.get(3),
					(TClass) arguments.get(4), (TypeToTAbstractType) arguments.get(5), (TPackage) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.CLASS_INNER_CLASS_MEMBER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ClassInnerClassMember_0_1_initialbindings_blackBBBBB(
			ClassInnerClassMember _this, Match match, MClass mInnerClass, ClassDeclaration eOuterClass,
			MAbstractMethodDefinition mDefinition) {
		if (!eOuterClass.equals(mInnerClass)) {
			return new Object[] { _this, match, mInnerClass, eOuterClass, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_0_2_SolveCSP_bindingFBBBBB(ClassInnerClassMember _this,
			Match match, MClass mInnerClass, ClassDeclaration eOuterClass, MAbstractMethodDefinition mDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mInnerClass, eOuterClass, mDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mInnerClass, eOuterClass, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerClassMember_0_2_SolveCSP_bindingAndBlackFBBBBB(
			ClassInnerClassMember _this, Match match, MClass mInnerClass, ClassDeclaration eOuterClass,
			MAbstractMethodDefinition mDefinition) {
		Object[] result_pattern_ClassInnerClassMember_0_2_SolveCSP_binding = pattern_ClassInnerClassMember_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mInnerClass, eOuterClass, mDefinition);
		if (result_pattern_ClassInnerClassMember_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerClassMember_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassInnerClassMember_0_2_SolveCSP_black = pattern_ClassInnerClassMember_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassInnerClassMember_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mInnerClass, eOuterClass, mDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerClassMember_0_3_CheckCSP_expressionFBB(ClassInnerClassMember _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_0_4_collectelementstobetranslated_blackBBBB(Match match,
			MClass mInnerClass, ClassDeclaration eOuterClass, MAbstractMethodDefinition mDefinition) {
		if (!eOuterClass.equals(mInnerClass)) {
			return new Object[] { match, mInnerClass, eOuterClass, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_0_4_collectelementstobetranslated_greenBBBF(Match match,
			MClass mInnerClass, MAbstractMethodDefinition mDefinition) {
		EMoflonEdge mDefinition__mInnerClass____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mInnerClass);
		String mDefinition__mInnerClass____mInnerTypes_name_prime = "mInnerTypes";
		mDefinition__mInnerClass____mInnerTypes.setSrc(mDefinition);
		mDefinition__mInnerClass____mInnerTypes.setTrg(mInnerClass);
		match.getToBeTranslatedEdges().add(mDefinition__mInnerClass____mInnerTypes);
		mDefinition__mInnerClass____mInnerTypes.setName(mDefinition__mInnerClass____mInnerTypes_name_prime);
		return new Object[] { match, mInnerClass, mDefinition, mDefinition__mInnerClass____mInnerTypes };
	}

	public static final Object[] pattern_ClassInnerClassMember_0_5_collectcontextelements_blackBBBB(Match match,
			MClass mInnerClass, ClassDeclaration eOuterClass, MAbstractMethodDefinition mDefinition) {
		if (!eOuterClass.equals(mInnerClass)) {
			return new Object[] { match, mInnerClass, eOuterClass, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_0_5_collectcontextelements_greenBBBFF(Match match,
			ClassDeclaration eOuterClass, MAbstractMethodDefinition mDefinition) {
		EMoflonEdge eOuterClass__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__eOuterClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(eOuterClass);
		match.getContextNodes().add(mDefinition);
		String eOuterClass__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__eOuterClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		eOuterClass__mDefinition____bodyDeclarations.setSrc(eOuterClass);
		eOuterClass__mDefinition____bodyDeclarations.setTrg(mDefinition);
		match.getContextEdges().add(eOuterClass__mDefinition____bodyDeclarations);
		mDefinition__eOuterClass____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__eOuterClass____abstractTypeDeclaration.setTrg(eOuterClass);
		match.getContextEdges().add(mDefinition__eOuterClass____abstractTypeDeclaration);
		eOuterClass__mDefinition____bodyDeclarations.setName(eOuterClass__mDefinition____bodyDeclarations_name_prime);
		mDefinition__eOuterClass____abstractTypeDeclaration
				.setName(mDefinition__eOuterClass____abstractTypeDeclaration_name_prime);
		return new Object[] { match, eOuterClass, mDefinition, eOuterClass__mDefinition____bodyDeclarations,
				mDefinition__eOuterClass____abstractTypeDeclaration };
	}

	public static final void pattern_ClassInnerClassMember_0_6_registerobjectstomatch_expressionBBBBB(
			ClassInnerClassMember _this, Match match, MClass mInnerClass, ClassDeclaration eOuterClass,
			MAbstractMethodDefinition mDefinition) {
		_this.registerObjectsToMatch_FWD(match, mInnerClass, eOuterClass, mDefinition);

	}

	public static final boolean pattern_ClassInnerClassMember_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassInnerClassMember_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mInnerClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_2 = isApplicableMatch.getObject("eOuterClass");
		EObject _localVariable_3 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_4 = isApplicableMatch.getObject("tOuterClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("eOuterClassToTOuterClass");
		EObject _localVariable_6 = isApplicableMatch.getObject("tOuterPackage");
		EObject tmpMInnerClass = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpEOuterClass = _localVariable_2;
		EObject tmpMDefinition = _localVariable_3;
		EObject tmpTOuterClass = _localVariable_4;
		EObject tmpEOuterClassToTOuterClass = _localVariable_5;
		EObject tmpTOuterPackage = _localVariable_6;
		if (tmpMInnerClass instanceof MClass) {
			MClass mInnerClass = (MClass) tmpMInnerClass;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpEOuterClass instanceof ClassDeclaration) {
					ClassDeclaration eOuterClass = (ClassDeclaration) tmpEOuterClass;
					if (tmpMDefinition instanceof MAbstractMethodDefinition) {
						MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) tmpMDefinition;
						if (tmpTOuterClass instanceof TClass) {
							TClass tOuterClass = (TClass) tmpTOuterClass;
							if (tmpEOuterClassToTOuterClass instanceof TypeToTAbstractType) {
								TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) tmpEOuterClassToTOuterClass;
								if (tmpTOuterPackage instanceof TPackage) {
									TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
									return new Object[] { mInnerClass, typeGraph, eOuterClass, mDefinition, tOuterClass,
											eOuterClassToTOuterClass, tOuterPackage, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_1_1_performtransformation_blackBBBBBBBFBB(
			MClass mInnerClass, TypeGraph typeGraph, ClassDeclaration eOuterClass,
			MAbstractMethodDefinition mDefinition, TClass tOuterClass, TypeToTAbstractType eOuterClassToTOuterClass,
			TPackage tOuterPackage, ClassInnerClassMember _this, IsApplicableMatch isApplicableMatch) {
		if (!eOuterClass.equals(mInnerClass)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { mInnerClass, typeGraph, eOuterClass, mDefinition, tOuterClass,
							eOuterClassToTOuterClass, tOuterPackage, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			ClassInnerClassMember _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassInnerClassMember_1_1_performtransformation_binding = pattern_ClassInnerClassMember_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ClassInnerClassMember_1_1_performtransformation_binding != null) {
			MClass mInnerClass = (MClass) result_pattern_ClassInnerClassMember_1_1_performtransformation_binding[0];
			TypeGraph typeGraph = (TypeGraph) result_pattern_ClassInnerClassMember_1_1_performtransformation_binding[1];
			ClassDeclaration eOuterClass = (ClassDeclaration) result_pattern_ClassInnerClassMember_1_1_performtransformation_binding[2];
			MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) result_pattern_ClassInnerClassMember_1_1_performtransformation_binding[3];
			TClass tOuterClass = (TClass) result_pattern_ClassInnerClassMember_1_1_performtransformation_binding[4];
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result_pattern_ClassInnerClassMember_1_1_performtransformation_binding[5];
			TPackage tOuterPackage = (TPackage) result_pattern_ClassInnerClassMember_1_1_performtransformation_binding[6];

			Object[] result_pattern_ClassInnerClassMember_1_1_performtransformation_black = pattern_ClassInnerClassMember_1_1_performtransformation_blackBBBBBBBFBB(
					mInnerClass, typeGraph, eOuterClass, mDefinition, tOuterClass, eOuterClassToTOuterClass,
					tOuterPackage, _this, isApplicableMatch);
			if (result_pattern_ClassInnerClassMember_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassInnerClassMember_1_1_performtransformation_black[7];

				return new Object[] { mInnerClass, typeGraph, eOuterClass, mDefinition, tOuterClass,
						eOuterClassToTOuterClass, tOuterPackage, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_1_1_performtransformation_greenFBBFBFFBB(
			MClass mInnerClass, TypeGraph typeGraph, TClass tOuterClass, TPackage tOuterPackage, CSP csp) {
		TypeToTAbstractType tInnerTypeToTInnerAbstractType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		TPackage tInnerPackage = BasicFactory.eINSTANCE.createTPackage();
		TClass tInnerClass = BasicFactory.eINSTANCE.createTClass();
		ClassDeclarationToTClass tInnerClassToTInnerClass = PmFactory.eINSTANCE.createClassDeclarationToTClass();
		Object _localVariable_0 = csp.getValue("tInnerPackage", "tName");
		Object _localVariable_1 = csp.getValue("tInnerClass", "tName");
		tInnerTypeToTInnerAbstractType.setSource(mInnerClass);
		tInnerPackage.setParent(tOuterPackage);
		typeGraph.getClasses().add(tInnerClass);
		tInnerPackage.getClasses().add(tInnerClass);
		tInnerTypeToTInnerAbstractType.setTarget(tInnerClass);
		tInnerPackage.getOwnedTypes().add(tInnerClass);
		typeGraph.getOwnedTypes().add(tInnerClass);
		tOuterClass.getInnerTypes().add(tInnerClass);
		tInnerClassToTInnerClass.setTarget(tInnerClass);
		tInnerClassToTInnerClass.setSource(mInnerClass);
		String tInnerPackage_tName_prime = (String) _localVariable_0;
		String tInnerClass_tName_prime = (String) _localVariable_1;
		tInnerPackage.setTName(tInnerPackage_tName_prime);
		tInnerClass.setTName(tInnerClass_tName_prime);
		return new Object[] { tInnerTypeToTInnerAbstractType, mInnerClass, typeGraph, tInnerPackage, tOuterClass,
				tInnerClass, tInnerClassToTInnerClass, tOuterPackage, csp };
	}

	public static final Object[] pattern_ClassInnerClassMember_1_2_collecttranslatedelements_blackBBBBB(
			TypeToTAbstractType tInnerTypeToTInnerAbstractType, MClass mInnerClass, TPackage tInnerPackage,
			TClass tInnerClass, ClassDeclarationToTClass tInnerClassToTInnerClass) {
		return new Object[] { tInnerTypeToTInnerAbstractType, mInnerClass, tInnerPackage, tInnerClass,
				tInnerClassToTInnerClass };
	}

	public static final Object[] pattern_ClassInnerClassMember_1_2_collecttranslatedelements_greenFBBBBB(
			TypeToTAbstractType tInnerTypeToTInnerAbstractType, MClass mInnerClass, TPackage tInnerPackage,
			TClass tInnerClass, ClassDeclarationToTClass tInnerClassToTInnerClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(tInnerTypeToTInnerAbstractType);
		ruleresult.getTranslatedElements().add(mInnerClass);
		ruleresult.getCreatedElements().add(tInnerPackage);
		ruleresult.getCreatedElements().add(tInnerClass);
		ruleresult.getCreatedLinkElements().add(tInnerClassToTInnerClass);
		return new Object[] { ruleresult, tInnerTypeToTInnerAbstractType, mInnerClass, tInnerPackage, tInnerClass,
				tInnerClassToTInnerClass };
	}

	public static final Object[] pattern_ClassInnerClassMember_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tInnerTypeToTInnerAbstractType, EObject mInnerClass,
			EObject typeGraph, EObject eOuterClass, EObject tInnerPackage, EObject mDefinition, EObject tOuterClass,
			EObject tInnerClass, EObject eOuterClassToTOuterClass, EObject tInnerClassToTInnerClass,
			EObject tOuterPackage) {
		if (!tInnerTypeToTInnerAbstractType.equals(typeGraph)) {
			if (!tInnerTypeToTInnerAbstractType.equals(tOuterClass)) {
				if (!tInnerTypeToTInnerAbstractType.equals(tOuterPackage)) {
					if (!mInnerClass.equals(tInnerTypeToTInnerAbstractType)) {
						if (!mInnerClass.equals(typeGraph)) {
							if (!mInnerClass.equals(tInnerPackage)) {
								if (!mInnerClass.equals(tOuterClass)) {
									if (!mInnerClass.equals(tInnerClass)) {
										if (!mInnerClass.equals(tInnerClassToTInnerClass)) {
											if (!mInnerClass.equals(tOuterPackage)) {
												if (!eOuterClass.equals(tInnerTypeToTInnerAbstractType)) {
													if (!eOuterClass.equals(mInnerClass)) {
														if (!eOuterClass.equals(typeGraph)) {
															if (!eOuterClass.equals(tInnerPackage)) {
																if (!eOuterClass.equals(mDefinition)) {
																	if (!eOuterClass.equals(tOuterClass)) {
																		if (!eOuterClass.equals(tInnerClass)) {
																			if (!eOuterClass
																					.equals(eOuterClassToTOuterClass)) {
																				if (!eOuterClass.equals(
																						tInnerClassToTInnerClass)) {
																					if (!eOuterClass
																							.equals(tOuterPackage)) {
																						if (!tInnerPackage.equals(
																								tInnerTypeToTInnerAbstractType)) {
																							if (!tInnerPackage.equals(
																									typeGraph)) {
																								if (!tInnerPackage
																										.equals(tOuterClass)) {
																									if (!tInnerPackage
																											.equals(tOuterPackage)) {
																										if (!mDefinition
																												.equals(tInnerTypeToTInnerAbstractType)) {
																											if (!mDefinition
																													.equals(mInnerClass)) {
																												if (!mDefinition
																														.equals(typeGraph)) {
																													if (!mDefinition
																															.equals(tInnerPackage)) {
																														if (!mDefinition
																																.equals(tOuterClass)) {
																															if (!mDefinition
																																	.equals(tInnerClass)) {
																																if (!mDefinition
																																		.equals(tInnerClassToTInnerClass)) {
																																	if (!mDefinition
																																			.equals(tOuterPackage)) {
																																		if (!tOuterClass
																																				.equals(typeGraph)) {
																																			if (!tOuterClass
																																					.equals(tOuterPackage)) {
																																				if (!tInnerClass
																																						.equals(tInnerTypeToTInnerAbstractType)) {
																																					if (!tInnerClass
																																							.equals(typeGraph)) {
																																						if (!tInnerClass
																																								.equals(tInnerPackage)) {
																																							if (!tInnerClass
																																									.equals(tOuterClass)) {
																																								if (!tInnerClass
																																										.equals(tInnerClassToTInnerClass)) {
																																									if (!tInnerClass
																																											.equals(tOuterPackage)) {
																																										if (!eOuterClassToTOuterClass
																																												.equals(tInnerTypeToTInnerAbstractType)) {
																																											if (!eOuterClassToTOuterClass
																																													.equals(mInnerClass)) {
																																												if (!eOuterClassToTOuterClass
																																														.equals(typeGraph)) {
																																													if (!eOuterClassToTOuterClass
																																															.equals(tInnerPackage)) {
																																														if (!eOuterClassToTOuterClass
																																																.equals(mDefinition)) {
																																															if (!eOuterClassToTOuterClass
																																																	.equals(tOuterClass)) {
																																																if (!eOuterClassToTOuterClass
																																																		.equals(tInnerClass)) {
																																																	if (!eOuterClassToTOuterClass
																																																			.equals(tInnerClassToTInnerClass)) {
																																																		if (!eOuterClassToTOuterClass
																																																				.equals(tOuterPackage)) {
																																																			if (!tInnerClassToTInnerClass
																																																					.equals(tInnerTypeToTInnerAbstractType)) {
																																																				if (!tInnerClassToTInnerClass
																																																						.equals(typeGraph)) {
																																																					if (!tInnerClassToTInnerClass
																																																							.equals(tInnerPackage)) {
																																																						if (!tInnerClassToTInnerClass
																																																								.equals(tOuterClass)) {
																																																							if (!tInnerClassToTInnerClass
																																																									.equals(tOuterPackage)) {
																																																								if (!tOuterPackage
																																																										.equals(typeGraph)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											tInnerTypeToTInnerAbstractType,
																																																											mInnerClass,
																																																											typeGraph,
																																																											eOuterClass,
																																																											tInnerPackage,
																																																											mDefinition,
																																																											tOuterClass,
																																																											tInnerClass,
																																																											eOuterClassToTOuterClass,
																																																											tInnerClassToTInnerClass,
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
											}
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

	public static final Object[] pattern_ClassInnerClassMember_1_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tInnerTypeToTInnerAbstractType, EObject mInnerClass,
			EObject typeGraph, EObject tInnerPackage, EObject mDefinition, EObject tOuterClass, EObject tInnerClass,
			EObject tInnerClassToTInnerClass, EObject tOuterPackage) {
		EMoflonEdge tInnerClassToTInnerClass__tInnerClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerTypeToTInnerAbstractType__mInnerClass____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tInnerTypeToTInnerAbstractType__tInnerClass____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tInnerPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tInnerPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClassToTInnerClass__mInnerClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tInnerClass____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tOuterClass____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mInnerClass____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassInnerClassMember";
		String tInnerClassToTInnerClass__tInnerClass____target_name_prime = "target";
		String typeGraph__tInnerClass____classes_name_prime = "classes";
		String tInnerPackage__tInnerClass____classes_name_prime = "classes";
		String tInnerTypeToTInnerAbstractType__mInnerClass____source_name_prime = "source";
		String tInnerTypeToTInnerAbstractType__tInnerClass____target_name_prime = "target";
		String tInnerPackage__tOuterPackage____parent_name_prime = "parent";
		String tOuterPackage__tInnerPackage____subpackage_name_prime = "subpackage";
		String tInnerPackage__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__tInnerPackage____package_name_prime = "package";
		String tInnerClassToTInnerClass__mInnerClass____source_name_prime = "source";
		String typeGraph__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__typeGraph____pg_name_prime = "pg";
		String tOuterClass__tInnerClass____innerTypes_name_prime = "innerTypes";
		String tInnerClass__tOuterClass____outerType_name_prime = "outerType";
		String mDefinition__mInnerClass____mInnerTypes_name_prime = "mInnerTypes";
		tInnerClassToTInnerClass__tInnerClass____target.setSrc(tInnerClassToTInnerClass);
		tInnerClassToTInnerClass__tInnerClass____target.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(tInnerClassToTInnerClass__tInnerClass____target);
		typeGraph__tInnerClass____classes.setSrc(typeGraph);
		typeGraph__tInnerClass____classes.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(typeGraph__tInnerClass____classes);
		tInnerPackage__tInnerClass____classes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____classes.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(tInnerPackage__tInnerClass____classes);
		tInnerTypeToTInnerAbstractType__mInnerClass____source.setSrc(tInnerTypeToTInnerAbstractType);
		tInnerTypeToTInnerAbstractType__mInnerClass____source.setTrg(mInnerClass);
		ruleresult.getCreatedEdges().add(tInnerTypeToTInnerAbstractType__mInnerClass____source);
		tInnerTypeToTInnerAbstractType__tInnerClass____target.setSrc(tInnerTypeToTInnerAbstractType);
		tInnerTypeToTInnerAbstractType__tInnerClass____target.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(tInnerTypeToTInnerAbstractType__tInnerClass____target);
		tInnerPackage__tOuterPackage____parent.setSrc(tInnerPackage);
		tInnerPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		ruleresult.getCreatedEdges().add(tInnerPackage__tOuterPackage____parent);
		tOuterPackage__tInnerPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tInnerPackage____subpackage.setTrg(tInnerPackage);
		ruleresult.getCreatedEdges().add(tOuterPackage__tInnerPackage____subpackage);
		tInnerPackage__tInnerClass____ownedTypes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____ownedTypes.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(tInnerPackage__tInnerClass____ownedTypes);
		tInnerClass__tInnerPackage____package.setSrc(tInnerClass);
		tInnerClass__tInnerPackage____package.setTrg(tInnerPackage);
		ruleresult.getCreatedEdges().add(tInnerClass__tInnerPackage____package);
		tInnerClassToTInnerClass__mInnerClass____source.setSrc(tInnerClassToTInnerClass);
		tInnerClassToTInnerClass__mInnerClass____source.setTrg(mInnerClass);
		ruleresult.getCreatedEdges().add(tInnerClassToTInnerClass__mInnerClass____source);
		typeGraph__tInnerClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tInnerClass____ownedTypes.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(typeGraph__tInnerClass____ownedTypes);
		tInnerClass__typeGraph____pg.setSrc(tInnerClass);
		tInnerClass__typeGraph____pg.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(tInnerClass__typeGraph____pg);
		tOuterClass__tInnerClass____innerTypes.setSrc(tOuterClass);
		tOuterClass__tInnerClass____innerTypes.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(tOuterClass__tInnerClass____innerTypes);
		tInnerClass__tOuterClass____outerType.setSrc(tInnerClass);
		tInnerClass__tOuterClass____outerType.setTrg(tOuterClass);
		ruleresult.getCreatedEdges().add(tInnerClass__tOuterClass____outerType);
		mDefinition__mInnerClass____mInnerTypes.setSrc(mDefinition);
		mDefinition__mInnerClass____mInnerTypes.setTrg(mInnerClass);
		ruleresult.getTranslatedEdges().add(mDefinition__mInnerClass____mInnerTypes);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tInnerClassToTInnerClass__tInnerClass____target
				.setName(tInnerClassToTInnerClass__tInnerClass____target_name_prime);
		typeGraph__tInnerClass____classes.setName(typeGraph__tInnerClass____classes_name_prime);
		tInnerPackage__tInnerClass____classes.setName(tInnerPackage__tInnerClass____classes_name_prime);
		tInnerTypeToTInnerAbstractType__mInnerClass____source
				.setName(tInnerTypeToTInnerAbstractType__mInnerClass____source_name_prime);
		tInnerTypeToTInnerAbstractType__tInnerClass____target
				.setName(tInnerTypeToTInnerAbstractType__tInnerClass____target_name_prime);
		tInnerPackage__tOuterPackage____parent.setName(tInnerPackage__tOuterPackage____parent_name_prime);
		tOuterPackage__tInnerPackage____subpackage.setName(tOuterPackage__tInnerPackage____subpackage_name_prime);
		tInnerPackage__tInnerClass____ownedTypes.setName(tInnerPackage__tInnerClass____ownedTypes_name_prime);
		tInnerClass__tInnerPackage____package.setName(tInnerClass__tInnerPackage____package_name_prime);
		tInnerClassToTInnerClass__mInnerClass____source
				.setName(tInnerClassToTInnerClass__mInnerClass____source_name_prime);
		typeGraph__tInnerClass____ownedTypes.setName(typeGraph__tInnerClass____ownedTypes_name_prime);
		tInnerClass__typeGraph____pg.setName(tInnerClass__typeGraph____pg_name_prime);
		tOuterClass__tInnerClass____innerTypes.setName(tOuterClass__tInnerClass____innerTypes_name_prime);
		tInnerClass__tOuterClass____outerType.setName(tInnerClass__tOuterClass____outerType_name_prime);
		mDefinition__mInnerClass____mInnerTypes.setName(mDefinition__mInnerClass____mInnerTypes_name_prime);
		return new Object[] { ruleresult, tInnerTypeToTInnerAbstractType, mInnerClass, typeGraph, tInnerPackage,
				mDefinition, tOuterClass, tInnerClass, tInnerClassToTInnerClass, tOuterPackage,
				tInnerClassToTInnerClass__tInnerClass____target, typeGraph__tInnerClass____classes,
				tInnerPackage__tInnerClass____classes, tInnerTypeToTInnerAbstractType__mInnerClass____source,
				tInnerTypeToTInnerAbstractType__tInnerClass____target, tInnerPackage__tOuterPackage____parent,
				tOuterPackage__tInnerPackage____subpackage, tInnerPackage__tInnerClass____ownedTypes,
				tInnerClass__tInnerPackage____package, tInnerClassToTInnerClass__mInnerClass____source,
				typeGraph__tInnerClass____ownedTypes, tInnerClass__typeGraph____pg,
				tOuterClass__tInnerClass____innerTypes, tInnerClass__tOuterClass____outerType,
				mDefinition__mInnerClass____mInnerTypes };
	}

	public static final void pattern_ClassInnerClassMember_1_5_registerobjects_expressionBBBBBBBBBBBBB(
			ClassInnerClassMember _this, PerformRuleResult ruleresult, EObject tInnerTypeToTInnerAbstractType,
			EObject mInnerClass, EObject typeGraph, EObject eOuterClass, EObject tInnerPackage, EObject mDefinition,
			EObject tOuterClass, EObject tInnerClass, EObject eOuterClassToTOuterClass,
			EObject tInnerClassToTInnerClass, EObject tOuterPackage) {
		_this.registerObjects_FWD(ruleresult, tInnerTypeToTInnerAbstractType, mInnerClass, typeGraph, eOuterClass,
				tInnerPackage, mDefinition, tOuterClass, tInnerClass, eOuterClassToTOuterClass,
				tInnerClassToTInnerClass, tOuterPackage);

	}

	public static final PerformRuleResult pattern_ClassInnerClassMember_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_2_1_preparereturnvalue_bindingFB(
			ClassInnerClassMember _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ClassInnerClassMember _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_2_1_preparereturnvalue_bindingAndBlackFFB(
			ClassInnerClassMember _this) {
		Object[] result_pattern_ClassInnerClassMember_2_1_preparereturnvalue_binding = pattern_ClassInnerClassMember_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassInnerClassMember_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassInnerClassMember_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassInnerClassMember_2_1_preparereturnvalue_black = pattern_ClassInnerClassMember_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassInnerClassMember_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassInnerClassMember_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ClassInnerClassMember";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassInnerClassMember_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mInnerClass");
		EObject _localVariable_1 = match.getObject("eOuterClass");
		EObject _localVariable_2 = match.getObject("mDefinition");
		EObject tmpMInnerClass = _localVariable_0;
		EObject tmpEOuterClass = _localVariable_1;
		EObject tmpMDefinition = _localVariable_2;
		if (tmpMInnerClass instanceof MClass) {
			MClass mInnerClass = (MClass) tmpMInnerClass;
			if (tmpEOuterClass instanceof ClassDeclaration) {
				ClassDeclaration eOuterClass = (ClassDeclaration) tmpEOuterClass;
				if (tmpMDefinition instanceof MAbstractMethodDefinition) {
					MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) tmpMDefinition;
					return new Object[] { mInnerClass, eOuterClass, mDefinition, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInnerClassMember_2_2_corematch_blackBBBFFB(MClass mInnerClass,
			ClassDeclaration eOuterClass, MAbstractMethodDefinition mDefinition, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eOuterClass.equals(mInnerClass)) {
			for (TypeToTAbstractType eOuterClassToTOuterClass : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eOuterClass, TypeToTAbstractType.class, "source")) {
				TAbstractType tmpTOuterClass = eOuterClassToTOuterClass.getTarget();
				if (tmpTOuterClass instanceof TClass) {
					TClass tOuterClass = (TClass) tmpTOuterClass;
					_result.add(new Object[] { mInnerClass, eOuterClass, mDefinition, tOuterClass,
							eOuterClassToTOuterClass, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassInnerClassMember_2_3_findcontext_blackBFBBBBF(
			MClass mInnerClass, ClassDeclaration eOuterClass, MAbstractMethodDefinition mDefinition, TClass tOuterClass,
			TypeToTAbstractType eOuterClassToTOuterClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eOuterClass.equals(mInnerClass)) {
			if (eOuterClass.equals(eOuterClassToTOuterClass.getSource())) {
				if (tOuterClass.equals(eOuterClassToTOuterClass.getTarget())) {
					if (eOuterClass.getBodyDeclarations().contains(mDefinition)) {
						if (mDefinition.getMInnerTypes().contains(mInnerClass)) {
							TypeGraph typeGraph = tOuterClass.getPg();
							if (typeGraph != null) {
								TPackage tOuterPackage = tOuterClass.getPackage();
								if (tOuterPackage != null) {
									_result.add(new Object[] { mInnerClass, typeGraph, eOuterClass, mDefinition,
											tOuterClass, eOuterClassToTOuterClass, tOuterPackage });
								}

							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_2_3_findcontext_greenBBBBBBBFFFFFFFFFF(
			MClass mInnerClass, TypeGraph typeGraph, ClassDeclaration eOuterClass,
			MAbstractMethodDefinition mDefinition, TClass tOuterClass, TypeToTAbstractType eOuterClassToTOuterClass,
			TPackage tOuterPackage) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eOuterClassToTOuterClass__eOuterClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClassToTOuterClass__tOuterClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClass__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__eOuterClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mInnerClass____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eOuterClassToTOuterClass__eOuterClass____source_name_prime = "source";
		String eOuterClassToTOuterClass__tOuterClass____target_name_prime = "target";
		String eOuterClass__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__eOuterClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String typeGraph__tOuterClass____ownedTypes_name_prime = "ownedTypes";
		String tOuterClass__typeGraph____pg_name_prime = "pg";
		String tOuterClass__tOuterPackage____package_name_prime = "package";
		String tOuterPackage__tOuterClass____ownedTypes_name_prime = "ownedTypes";
		String mDefinition__mInnerClass____mInnerTypes_name_prime = "mInnerTypes";
		isApplicableMatch.getAllContextElements().add(mInnerClass);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(eOuterClass);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(tOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass);
		isApplicableMatch.getAllContextElements().add(tOuterPackage);
		eOuterClassToTOuterClass__eOuterClass____source.setSrc(eOuterClassToTOuterClass);
		eOuterClassToTOuterClass__eOuterClass____source.setTrg(eOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass__eOuterClass____source);
		eOuterClassToTOuterClass__tOuterClass____target.setSrc(eOuterClassToTOuterClass);
		eOuterClassToTOuterClass__tOuterClass____target.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass__tOuterClass____target);
		eOuterClass__mDefinition____bodyDeclarations.setSrc(eOuterClass);
		eOuterClass__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(eOuterClass__mDefinition____bodyDeclarations);
		mDefinition__eOuterClass____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__eOuterClass____abstractTypeDeclaration.setTrg(eOuterClass);
		isApplicableMatch.getAllContextElements().add(mDefinition__eOuterClass____abstractTypeDeclaration);
		typeGraph__tOuterClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tOuterClass____ownedTypes.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tOuterClass____ownedTypes);
		tOuterClass__typeGraph____pg.setSrc(tOuterClass);
		tOuterClass__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterClass__typeGraph____pg);
		tOuterClass__tOuterPackage____package.setSrc(tOuterClass);
		tOuterClass__tOuterPackage____package.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tOuterClass__tOuterPackage____package);
		tOuterPackage__tOuterClass____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterClass____ownedTypes.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tOuterClass____ownedTypes);
		mDefinition__mInnerClass____mInnerTypes.setSrc(mDefinition);
		mDefinition__mInnerClass____mInnerTypes.setTrg(mInnerClass);
		isApplicableMatch.getAllContextElements().add(mDefinition__mInnerClass____mInnerTypes);
		eOuterClassToTOuterClass__eOuterClass____source
				.setName(eOuterClassToTOuterClass__eOuterClass____source_name_prime);
		eOuterClassToTOuterClass__tOuterClass____target
				.setName(eOuterClassToTOuterClass__tOuterClass____target_name_prime);
		eOuterClass__mDefinition____bodyDeclarations.setName(eOuterClass__mDefinition____bodyDeclarations_name_prime);
		mDefinition__eOuterClass____abstractTypeDeclaration
				.setName(mDefinition__eOuterClass____abstractTypeDeclaration_name_prime);
		typeGraph__tOuterClass____ownedTypes.setName(typeGraph__tOuterClass____ownedTypes_name_prime);
		tOuterClass__typeGraph____pg.setName(tOuterClass__typeGraph____pg_name_prime);
		tOuterClass__tOuterPackage____package.setName(tOuterClass__tOuterPackage____package_name_prime);
		tOuterPackage__tOuterClass____ownedTypes.setName(tOuterPackage__tOuterClass____ownedTypes_name_prime);
		mDefinition__mInnerClass____mInnerTypes.setName(mDefinition__mInnerClass____mInnerTypes_name_prime);
		return new Object[] { mInnerClass, typeGraph, eOuterClass, mDefinition, tOuterClass, eOuterClassToTOuterClass,
				tOuterPackage, isApplicableMatch, eOuterClassToTOuterClass__eOuterClass____source,
				eOuterClassToTOuterClass__tOuterClass____target, eOuterClass__mDefinition____bodyDeclarations,
				mDefinition__eOuterClass____abstractTypeDeclaration, typeGraph__tOuterClass____ownedTypes,
				tOuterClass__typeGraph____pg, tOuterClass__tOuterPackage____package,
				tOuterPackage__tOuterClass____ownedTypes, mDefinition__mInnerClass____mInnerTypes };
	}

	public static final Object[] pattern_ClassInnerClassMember_2_4_solveCSP_bindingFBBBBBBBBB(
			ClassInnerClassMember _this, IsApplicableMatch isApplicableMatch, MClass mInnerClass, TypeGraph typeGraph,
			ClassDeclaration eOuterClass, MAbstractMethodDefinition mDefinition, TClass tOuterClass,
			TypeToTAbstractType eOuterClassToTOuterClass, TPackage tOuterPackage) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mInnerClass, typeGraph, eOuterClass,
				mDefinition, tOuterClass, eOuterClassToTOuterClass, tOuterPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mInnerClass, typeGraph, eOuterClass, mDefinition,
					tOuterClass, eOuterClassToTOuterClass, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerClassMember_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			ClassInnerClassMember _this, IsApplicableMatch isApplicableMatch, MClass mInnerClass, TypeGraph typeGraph,
			ClassDeclaration eOuterClass, MAbstractMethodDefinition mDefinition, TClass tOuterClass,
			TypeToTAbstractType eOuterClassToTOuterClass, TPackage tOuterPackage) {
		Object[] result_pattern_ClassInnerClassMember_2_4_solveCSP_binding = pattern_ClassInnerClassMember_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mInnerClass, typeGraph, eOuterClass, mDefinition, tOuterClass,
				eOuterClassToTOuterClass, tOuterPackage);
		if (result_pattern_ClassInnerClassMember_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerClassMember_2_4_solveCSP_binding[0];

			Object[] result_pattern_ClassInnerClassMember_2_4_solveCSP_black = pattern_ClassInnerClassMember_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassInnerClassMember_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mInnerClass, typeGraph, eOuterClass, mDefinition,
						tOuterClass, eOuterClassToTOuterClass, tOuterPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerClassMember_2_5_checkCSP_expressionFBB(ClassInnerClassMember _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassInnerClassMember_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassInnerClassMember";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassInnerClassMember_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_10_1_initialbindings_blackBBBBBBB(
			ClassInnerClassMember _this, Match match, TypeGraph typeGraph, TPackage tInnerPackage, TClass tOuterClass,
			TClass tInnerClass, TPackage tOuterPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			if (!tInnerClass.equals(tOuterClass)) {
				return new Object[] { _this, match, typeGraph, tInnerPackage, tOuterClass, tInnerClass, tOuterPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_10_2_SolveCSP_bindingFBBBBBBB(
			ClassInnerClassMember _this, Match match, TypeGraph typeGraph, TPackage tInnerPackage, TClass tOuterClass,
			TClass tInnerClass, TPackage tOuterPackage) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, typeGraph, tInnerPackage, tOuterClass,
				tInnerClass, tOuterPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, typeGraph, tInnerPackage, tOuterClass, tInnerClass,
					tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerClassMember_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
			ClassInnerClassMember _this, Match match, TypeGraph typeGraph, TPackage tInnerPackage, TClass tOuterClass,
			TClass tInnerClass, TPackage tOuterPackage) {
		Object[] result_pattern_ClassInnerClassMember_10_2_SolveCSP_binding = pattern_ClassInnerClassMember_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, typeGraph, tInnerPackage, tOuterClass, tInnerClass, tOuterPackage);
		if (result_pattern_ClassInnerClassMember_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerClassMember_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassInnerClassMember_10_2_SolveCSP_black = pattern_ClassInnerClassMember_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassInnerClassMember_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, typeGraph, tInnerPackage, tOuterClass, tInnerClass,
						tOuterPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerClassMember_10_3_CheckCSP_expressionFBB(ClassInnerClassMember _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_10_4_collectelementstobetranslated_blackBBBBBB(
			Match match, TypeGraph typeGraph, TPackage tInnerPackage, TClass tOuterClass, TClass tInnerClass,
			TPackage tOuterPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			if (!tInnerClass.equals(tOuterClass)) {
				return new Object[] { match, typeGraph, tInnerPackage, tOuterClass, tInnerClass, tOuterPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_10_4_collectelementstobetranslated_greenBBBBBBFFFFFFFFFF(
			Match match, TypeGraph typeGraph, TPackage tInnerPackage, TClass tOuterClass, TClass tInnerClass,
			TPackage tOuterPackage) {
		EMoflonEdge typeGraph__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tInnerPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tInnerPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tInnerClass____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tOuterClass____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tInnerPackage);
		match.getToBeTranslatedNodes().add(tInnerClass);
		String typeGraph__tInnerClass____classes_name_prime = "classes";
		String tInnerPackage__tInnerClass____classes_name_prime = "classes";
		String tInnerPackage__tOuterPackage____parent_name_prime = "parent";
		String tOuterPackage__tInnerPackage____subpackage_name_prime = "subpackage";
		String tInnerPackage__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__tInnerPackage____package_name_prime = "package";
		String typeGraph__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__typeGraph____pg_name_prime = "pg";
		String tOuterClass__tInnerClass____innerTypes_name_prime = "innerTypes";
		String tInnerClass__tOuterClass____outerType_name_prime = "outerType";
		typeGraph__tInnerClass____classes.setSrc(typeGraph);
		typeGraph__tInnerClass____classes.setTrg(tInnerClass);
		match.getToBeTranslatedEdges().add(typeGraph__tInnerClass____classes);
		tInnerPackage__tInnerClass____classes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____classes.setTrg(tInnerClass);
		match.getToBeTranslatedEdges().add(tInnerPackage__tInnerClass____classes);
		tInnerPackage__tOuterPackage____parent.setSrc(tInnerPackage);
		tInnerPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		match.getToBeTranslatedEdges().add(tInnerPackage__tOuterPackage____parent);
		tOuterPackage__tInnerPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tInnerPackage____subpackage.setTrg(tInnerPackage);
		match.getToBeTranslatedEdges().add(tOuterPackage__tInnerPackage____subpackage);
		tInnerPackage__tInnerClass____ownedTypes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____ownedTypes.setTrg(tInnerClass);
		match.getToBeTranslatedEdges().add(tInnerPackage__tInnerClass____ownedTypes);
		tInnerClass__tInnerPackage____package.setSrc(tInnerClass);
		tInnerClass__tInnerPackage____package.setTrg(tInnerPackage);
		match.getToBeTranslatedEdges().add(tInnerClass__tInnerPackage____package);
		typeGraph__tInnerClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tInnerClass____ownedTypes.setTrg(tInnerClass);
		match.getToBeTranslatedEdges().add(typeGraph__tInnerClass____ownedTypes);
		tInnerClass__typeGraph____pg.setSrc(tInnerClass);
		tInnerClass__typeGraph____pg.setTrg(typeGraph);
		match.getToBeTranslatedEdges().add(tInnerClass__typeGraph____pg);
		tOuterClass__tInnerClass____innerTypes.setSrc(tOuterClass);
		tOuterClass__tInnerClass____innerTypes.setTrg(tInnerClass);
		match.getToBeTranslatedEdges().add(tOuterClass__tInnerClass____innerTypes);
		tInnerClass__tOuterClass____outerType.setSrc(tInnerClass);
		tInnerClass__tOuterClass____outerType.setTrg(tOuterClass);
		match.getToBeTranslatedEdges().add(tInnerClass__tOuterClass____outerType);
		typeGraph__tInnerClass____classes.setName(typeGraph__tInnerClass____classes_name_prime);
		tInnerPackage__tInnerClass____classes.setName(tInnerPackage__tInnerClass____classes_name_prime);
		tInnerPackage__tOuterPackage____parent.setName(tInnerPackage__tOuterPackage____parent_name_prime);
		tOuterPackage__tInnerPackage____subpackage.setName(tOuterPackage__tInnerPackage____subpackage_name_prime);
		tInnerPackage__tInnerClass____ownedTypes.setName(tInnerPackage__tInnerClass____ownedTypes_name_prime);
		tInnerClass__tInnerPackage____package.setName(tInnerClass__tInnerPackage____package_name_prime);
		typeGraph__tInnerClass____ownedTypes.setName(typeGraph__tInnerClass____ownedTypes_name_prime);
		tInnerClass__typeGraph____pg.setName(tInnerClass__typeGraph____pg_name_prime);
		tOuterClass__tInnerClass____innerTypes.setName(tOuterClass__tInnerClass____innerTypes_name_prime);
		tInnerClass__tOuterClass____outerType.setName(tInnerClass__tOuterClass____outerType_name_prime);
		return new Object[] { match, typeGraph, tInnerPackage, tOuterClass, tInnerClass, tOuterPackage,
				typeGraph__tInnerClass____classes, tInnerPackage__tInnerClass____classes,
				tInnerPackage__tOuterPackage____parent, tOuterPackage__tInnerPackage____subpackage,
				tInnerPackage__tInnerClass____ownedTypes, tInnerClass__tInnerPackage____package,
				typeGraph__tInnerClass____ownedTypes, tInnerClass__typeGraph____pg,
				tOuterClass__tInnerClass____innerTypes, tInnerClass__tOuterClass____outerType };
	}

	public static final Object[] pattern_ClassInnerClassMember_10_5_collectcontextelements_blackBBBBBB(Match match,
			TypeGraph typeGraph, TPackage tInnerPackage, TClass tOuterClass, TClass tInnerClass,
			TPackage tOuterPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			if (!tInnerClass.equals(tOuterClass)) {
				return new Object[] { match, typeGraph, tInnerPackage, tOuterClass, tInnerClass, tOuterPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_10_5_collectcontextelements_greenBBBBFFFF(Match match,
			TypeGraph typeGraph, TClass tOuterClass, TPackage tOuterPackage) {
		EMoflonEdge typeGraph__tOuterClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(typeGraph);
		match.getContextNodes().add(tOuterClass);
		match.getContextNodes().add(tOuterPackage);
		String typeGraph__tOuterClass____ownedTypes_name_prime = "ownedTypes";
		String tOuterClass__typeGraph____pg_name_prime = "pg";
		String tOuterClass__tOuterPackage____package_name_prime = "package";
		String tOuterPackage__tOuterClass____ownedTypes_name_prime = "ownedTypes";
		typeGraph__tOuterClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tOuterClass____ownedTypes.setTrg(tOuterClass);
		match.getContextEdges().add(typeGraph__tOuterClass____ownedTypes);
		tOuterClass__typeGraph____pg.setSrc(tOuterClass);
		tOuterClass__typeGraph____pg.setTrg(typeGraph);
		match.getContextEdges().add(tOuterClass__typeGraph____pg);
		tOuterClass__tOuterPackage____package.setSrc(tOuterClass);
		tOuterClass__tOuterPackage____package.setTrg(tOuterPackage);
		match.getContextEdges().add(tOuterClass__tOuterPackage____package);
		tOuterPackage__tOuterClass____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterClass____ownedTypes.setTrg(tOuterClass);
		match.getContextEdges().add(tOuterPackage__tOuterClass____ownedTypes);
		typeGraph__tOuterClass____ownedTypes.setName(typeGraph__tOuterClass____ownedTypes_name_prime);
		tOuterClass__typeGraph____pg.setName(tOuterClass__typeGraph____pg_name_prime);
		tOuterClass__tOuterPackage____package.setName(tOuterClass__tOuterPackage____package_name_prime);
		tOuterPackage__tOuterClass____ownedTypes.setName(tOuterPackage__tOuterClass____ownedTypes_name_prime);
		return new Object[] { match, typeGraph, tOuterClass, tOuterPackage, typeGraph__tOuterClass____ownedTypes,
				tOuterClass__typeGraph____pg, tOuterClass__tOuterPackage____package,
				tOuterPackage__tOuterClass____ownedTypes };
	}

	public static final void pattern_ClassInnerClassMember_10_6_registerobjectstomatch_expressionBBBBBBB(
			ClassInnerClassMember _this, Match match, TypeGraph typeGraph, TPackage tInnerPackage, TClass tOuterClass,
			TClass tInnerClass, TPackage tOuterPackage) {
		_this.registerObjectsToMatch_BWD(match, typeGraph, tInnerPackage, tOuterClass, tInnerClass, tOuterPackage);

	}

	public static final boolean pattern_ClassInnerClassMember_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassInnerClassMember_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_11_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_1 = isApplicableMatch.getObject("eOuterClass");
		EObject _localVariable_2 = isApplicableMatch.getObject("tInnerPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_4 = isApplicableMatch.getObject("tOuterClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("tInnerClass");
		EObject _localVariable_6 = isApplicableMatch.getObject("eOuterClassToTOuterClass");
		EObject _localVariable_7 = isApplicableMatch.getObject("tOuterPackage");
		EObject tmpTypeGraph = _localVariable_0;
		EObject tmpEOuterClass = _localVariable_1;
		EObject tmpTInnerPackage = _localVariable_2;
		EObject tmpMDefinition = _localVariable_3;
		EObject tmpTOuterClass = _localVariable_4;
		EObject tmpTInnerClass = _localVariable_5;
		EObject tmpEOuterClassToTOuterClass = _localVariable_6;
		EObject tmpTOuterPackage = _localVariable_7;
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			if (tmpEOuterClass instanceof ClassDeclaration) {
				ClassDeclaration eOuterClass = (ClassDeclaration) tmpEOuterClass;
				if (tmpTInnerPackage instanceof TPackage) {
					TPackage tInnerPackage = (TPackage) tmpTInnerPackage;
					if (tmpMDefinition instanceof MAbstractMethodDefinition) {
						MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) tmpMDefinition;
						if (tmpTOuterClass instanceof TClass) {
							TClass tOuterClass = (TClass) tmpTOuterClass;
							if (tmpTInnerClass instanceof TClass) {
								TClass tInnerClass = (TClass) tmpTInnerClass;
								if (tmpEOuterClassToTOuterClass instanceof TypeToTAbstractType) {
									TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) tmpEOuterClassToTOuterClass;
									if (tmpTOuterPackage instanceof TPackage) {
										TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
										return new Object[] { typeGraph, eOuterClass, tInnerPackage, mDefinition,
												tOuterClass, tInnerClass, eOuterClassToTOuterClass, tOuterPackage,
												isApplicableMatch };
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

	public static final Object[] pattern_ClassInnerClassMember_11_1_performtransformation_blackBBBBBBBBFBB(
			TypeGraph typeGraph, ClassDeclaration eOuterClass, TPackage tInnerPackage,
			MAbstractMethodDefinition mDefinition, TClass tOuterClass, TClass tInnerClass,
			TypeToTAbstractType eOuterClassToTOuterClass, TPackage tOuterPackage, ClassInnerClassMember _this,
			IsApplicableMatch isApplicableMatch) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			if (!tInnerClass.equals(tOuterClass)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { typeGraph, eOuterClass, tInnerPackage, mDefinition, tOuterClass,
								tInnerClass, eOuterClassToTOuterClass, tOuterPackage, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			ClassInnerClassMember _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassInnerClassMember_11_1_performtransformation_binding = pattern_ClassInnerClassMember_11_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ClassInnerClassMember_11_1_performtransformation_binding != null) {
			TypeGraph typeGraph = (TypeGraph) result_pattern_ClassInnerClassMember_11_1_performtransformation_binding[0];
			ClassDeclaration eOuterClass = (ClassDeclaration) result_pattern_ClassInnerClassMember_11_1_performtransformation_binding[1];
			TPackage tInnerPackage = (TPackage) result_pattern_ClassInnerClassMember_11_1_performtransformation_binding[2];
			MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) result_pattern_ClassInnerClassMember_11_1_performtransformation_binding[3];
			TClass tOuterClass = (TClass) result_pattern_ClassInnerClassMember_11_1_performtransformation_binding[4];
			TClass tInnerClass = (TClass) result_pattern_ClassInnerClassMember_11_1_performtransformation_binding[5];
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result_pattern_ClassInnerClassMember_11_1_performtransformation_binding[6];
			TPackage tOuterPackage = (TPackage) result_pattern_ClassInnerClassMember_11_1_performtransformation_binding[7];

			Object[] result_pattern_ClassInnerClassMember_11_1_performtransformation_black = pattern_ClassInnerClassMember_11_1_performtransformation_blackBBBBBBBBFBB(
					typeGraph, eOuterClass, tInnerPackage, mDefinition, tOuterClass, tInnerClass,
					eOuterClassToTOuterClass, tOuterPackage, _this, isApplicableMatch);
			if (result_pattern_ClassInnerClassMember_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassInnerClassMember_11_1_performtransformation_black[8];

				return new Object[] { typeGraph, eOuterClass, tInnerPackage, mDefinition, tOuterClass, tInnerClass,
						eOuterClassToTOuterClass, tOuterPackage, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_11_1_performtransformation_greenFFBBFB(
			MAbstractMethodDefinition mDefinition, TClass tInnerClass, CSP csp) {
		TypeToTAbstractType tInnerTypeToTInnerAbstractType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		MClass mInnerClass = ModiscoFactory.eINSTANCE.createMClass();
		ClassDeclarationToTClass tInnerClassToTInnerClass = PmFactory.eINSTANCE.createClassDeclarationToTClass();
		Object _localVariable_0 = csp.getValue("mInnerClass", "name");
		tInnerTypeToTInnerAbstractType.setTarget(tInnerClass);
		tInnerTypeToTInnerAbstractType.setSource(mInnerClass);
		mDefinition.getMInnerTypes().add(mInnerClass);
		tInnerClassToTInnerClass.setTarget(tInnerClass);
		tInnerClassToTInnerClass.setSource(mInnerClass);
		String mInnerClass_name_prime = (String) _localVariable_0;
		mInnerClass.setName(mInnerClass_name_prime);
		return new Object[] { tInnerTypeToTInnerAbstractType, mInnerClass, mDefinition, tInnerClass,
				tInnerClassToTInnerClass, csp };
	}

	public static final Object[] pattern_ClassInnerClassMember_11_2_collecttranslatedelements_blackBBBBB(
			TypeToTAbstractType tInnerTypeToTInnerAbstractType, MClass mInnerClass, TPackage tInnerPackage,
			TClass tInnerClass, ClassDeclarationToTClass tInnerClassToTInnerClass) {
		return new Object[] { tInnerTypeToTInnerAbstractType, mInnerClass, tInnerPackage, tInnerClass,
				tInnerClassToTInnerClass };
	}

	public static final Object[] pattern_ClassInnerClassMember_11_2_collecttranslatedelements_greenFBBBBB(
			TypeToTAbstractType tInnerTypeToTInnerAbstractType, MClass mInnerClass, TPackage tInnerPackage,
			TClass tInnerClass, ClassDeclarationToTClass tInnerClassToTInnerClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(tInnerTypeToTInnerAbstractType);
		ruleresult.getCreatedElements().add(mInnerClass);
		ruleresult.getTranslatedElements().add(tInnerPackage);
		ruleresult.getTranslatedElements().add(tInnerClass);
		ruleresult.getCreatedLinkElements().add(tInnerClassToTInnerClass);
		return new Object[] { ruleresult, tInnerTypeToTInnerAbstractType, mInnerClass, tInnerPackage, tInnerClass,
				tInnerClassToTInnerClass };
	}

	public static final Object[] pattern_ClassInnerClassMember_11_3_bookkeepingforedges_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tInnerTypeToTInnerAbstractType, EObject mInnerClass,
			EObject typeGraph, EObject eOuterClass, EObject tInnerPackage, EObject mDefinition, EObject tOuterClass,
			EObject tInnerClass, EObject eOuterClassToTOuterClass, EObject tInnerClassToTInnerClass,
			EObject tOuterPackage) {
		if (!tInnerTypeToTInnerAbstractType.equals(typeGraph)) {
			if (!tInnerTypeToTInnerAbstractType.equals(tOuterClass)) {
				if (!tInnerTypeToTInnerAbstractType.equals(tOuterPackage)) {
					if (!mInnerClass.equals(tInnerTypeToTInnerAbstractType)) {
						if (!mInnerClass.equals(typeGraph)) {
							if (!mInnerClass.equals(tInnerPackage)) {
								if (!mInnerClass.equals(tOuterClass)) {
									if (!mInnerClass.equals(tInnerClass)) {
										if (!mInnerClass.equals(tInnerClassToTInnerClass)) {
											if (!mInnerClass.equals(tOuterPackage)) {
												if (!eOuterClass.equals(tInnerTypeToTInnerAbstractType)) {
													if (!eOuterClass.equals(mInnerClass)) {
														if (!eOuterClass.equals(typeGraph)) {
															if (!eOuterClass.equals(tInnerPackage)) {
																if (!eOuterClass.equals(mDefinition)) {
																	if (!eOuterClass.equals(tOuterClass)) {
																		if (!eOuterClass.equals(tInnerClass)) {
																			if (!eOuterClass
																					.equals(eOuterClassToTOuterClass)) {
																				if (!eOuterClass.equals(
																						tInnerClassToTInnerClass)) {
																					if (!eOuterClass
																							.equals(tOuterPackage)) {
																						if (!tInnerPackage.equals(
																								tInnerTypeToTInnerAbstractType)) {
																							if (!tInnerPackage.equals(
																									typeGraph)) {
																								if (!tInnerPackage
																										.equals(tOuterClass)) {
																									if (!tInnerPackage
																											.equals(tOuterPackage)) {
																										if (!mDefinition
																												.equals(tInnerTypeToTInnerAbstractType)) {
																											if (!mDefinition
																													.equals(mInnerClass)) {
																												if (!mDefinition
																														.equals(typeGraph)) {
																													if (!mDefinition
																															.equals(tInnerPackage)) {
																														if (!mDefinition
																																.equals(tOuterClass)) {
																															if (!mDefinition
																																	.equals(tInnerClass)) {
																																if (!mDefinition
																																		.equals(tInnerClassToTInnerClass)) {
																																	if (!mDefinition
																																			.equals(tOuterPackage)) {
																																		if (!tOuterClass
																																				.equals(typeGraph)) {
																																			if (!tOuterClass
																																					.equals(tOuterPackage)) {
																																				if (!tInnerClass
																																						.equals(tInnerTypeToTInnerAbstractType)) {
																																					if (!tInnerClass
																																							.equals(typeGraph)) {
																																						if (!tInnerClass
																																								.equals(tInnerPackage)) {
																																							if (!tInnerClass
																																									.equals(tOuterClass)) {
																																								if (!tInnerClass
																																										.equals(tInnerClassToTInnerClass)) {
																																									if (!tInnerClass
																																											.equals(tOuterPackage)) {
																																										if (!eOuterClassToTOuterClass
																																												.equals(tInnerTypeToTInnerAbstractType)) {
																																											if (!eOuterClassToTOuterClass
																																													.equals(mInnerClass)) {
																																												if (!eOuterClassToTOuterClass
																																														.equals(typeGraph)) {
																																													if (!eOuterClassToTOuterClass
																																															.equals(tInnerPackage)) {
																																														if (!eOuterClassToTOuterClass
																																																.equals(mDefinition)) {
																																															if (!eOuterClassToTOuterClass
																																																	.equals(tOuterClass)) {
																																																if (!eOuterClassToTOuterClass
																																																		.equals(tInnerClass)) {
																																																	if (!eOuterClassToTOuterClass
																																																			.equals(tInnerClassToTInnerClass)) {
																																																		if (!eOuterClassToTOuterClass
																																																				.equals(tOuterPackage)) {
																																																			if (!tInnerClassToTInnerClass
																																																					.equals(tInnerTypeToTInnerAbstractType)) {
																																																				if (!tInnerClassToTInnerClass
																																																						.equals(typeGraph)) {
																																																					if (!tInnerClassToTInnerClass
																																																							.equals(tInnerPackage)) {
																																																						if (!tInnerClassToTInnerClass
																																																								.equals(tOuterClass)) {
																																																							if (!tInnerClassToTInnerClass
																																																									.equals(tOuterPackage)) {
																																																								if (!tOuterPackage
																																																										.equals(typeGraph)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											tInnerTypeToTInnerAbstractType,
																																																											mInnerClass,
																																																											typeGraph,
																																																											eOuterClass,
																																																											tInnerPackage,
																																																											mDefinition,
																																																											tOuterClass,
																																																											tInnerClass,
																																																											eOuterClassToTOuterClass,
																																																											tInnerClassToTInnerClass,
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
											}
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

	public static final Object[] pattern_ClassInnerClassMember_11_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tInnerTypeToTInnerAbstractType, EObject mInnerClass,
			EObject typeGraph, EObject tInnerPackage, EObject mDefinition, EObject tOuterClass, EObject tInnerClass,
			EObject tInnerClassToTInnerClass, EObject tOuterPackage) {
		EMoflonEdge tInnerClassToTInnerClass__tInnerClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerTypeToTInnerAbstractType__mInnerClass____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tInnerTypeToTInnerAbstractType__tInnerClass____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tInnerPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tInnerPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClassToTInnerClass__mInnerClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tInnerClass____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tOuterClass____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mInnerClass____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassInnerClassMember";
		String tInnerClassToTInnerClass__tInnerClass____target_name_prime = "target";
		String typeGraph__tInnerClass____classes_name_prime = "classes";
		String tInnerPackage__tInnerClass____classes_name_prime = "classes";
		String tInnerTypeToTInnerAbstractType__mInnerClass____source_name_prime = "source";
		String tInnerTypeToTInnerAbstractType__tInnerClass____target_name_prime = "target";
		String tInnerPackage__tOuterPackage____parent_name_prime = "parent";
		String tOuterPackage__tInnerPackage____subpackage_name_prime = "subpackage";
		String tInnerPackage__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__tInnerPackage____package_name_prime = "package";
		String tInnerClassToTInnerClass__mInnerClass____source_name_prime = "source";
		String typeGraph__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__typeGraph____pg_name_prime = "pg";
		String tOuterClass__tInnerClass____innerTypes_name_prime = "innerTypes";
		String tInnerClass__tOuterClass____outerType_name_prime = "outerType";
		String mDefinition__mInnerClass____mInnerTypes_name_prime = "mInnerTypes";
		tInnerClassToTInnerClass__tInnerClass____target.setSrc(tInnerClassToTInnerClass);
		tInnerClassToTInnerClass__tInnerClass____target.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(tInnerClassToTInnerClass__tInnerClass____target);
		typeGraph__tInnerClass____classes.setSrc(typeGraph);
		typeGraph__tInnerClass____classes.setTrg(tInnerClass);
		ruleresult.getTranslatedEdges().add(typeGraph__tInnerClass____classes);
		tInnerPackage__tInnerClass____classes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____classes.setTrg(tInnerClass);
		ruleresult.getTranslatedEdges().add(tInnerPackage__tInnerClass____classes);
		tInnerTypeToTInnerAbstractType__mInnerClass____source.setSrc(tInnerTypeToTInnerAbstractType);
		tInnerTypeToTInnerAbstractType__mInnerClass____source.setTrg(mInnerClass);
		ruleresult.getCreatedEdges().add(tInnerTypeToTInnerAbstractType__mInnerClass____source);
		tInnerTypeToTInnerAbstractType__tInnerClass____target.setSrc(tInnerTypeToTInnerAbstractType);
		tInnerTypeToTInnerAbstractType__tInnerClass____target.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(tInnerTypeToTInnerAbstractType__tInnerClass____target);
		tInnerPackage__tOuterPackage____parent.setSrc(tInnerPackage);
		tInnerPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		ruleresult.getTranslatedEdges().add(tInnerPackage__tOuterPackage____parent);
		tOuterPackage__tInnerPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tInnerPackage____subpackage.setTrg(tInnerPackage);
		ruleresult.getTranslatedEdges().add(tOuterPackage__tInnerPackage____subpackage);
		tInnerPackage__tInnerClass____ownedTypes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____ownedTypes.setTrg(tInnerClass);
		ruleresult.getTranslatedEdges().add(tInnerPackage__tInnerClass____ownedTypes);
		tInnerClass__tInnerPackage____package.setSrc(tInnerClass);
		tInnerClass__tInnerPackage____package.setTrg(tInnerPackage);
		ruleresult.getTranslatedEdges().add(tInnerClass__tInnerPackage____package);
		tInnerClassToTInnerClass__mInnerClass____source.setSrc(tInnerClassToTInnerClass);
		tInnerClassToTInnerClass__mInnerClass____source.setTrg(mInnerClass);
		ruleresult.getCreatedEdges().add(tInnerClassToTInnerClass__mInnerClass____source);
		typeGraph__tInnerClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tInnerClass____ownedTypes.setTrg(tInnerClass);
		ruleresult.getTranslatedEdges().add(typeGraph__tInnerClass____ownedTypes);
		tInnerClass__typeGraph____pg.setSrc(tInnerClass);
		tInnerClass__typeGraph____pg.setTrg(typeGraph);
		ruleresult.getTranslatedEdges().add(tInnerClass__typeGraph____pg);
		tOuterClass__tInnerClass____innerTypes.setSrc(tOuterClass);
		tOuterClass__tInnerClass____innerTypes.setTrg(tInnerClass);
		ruleresult.getTranslatedEdges().add(tOuterClass__tInnerClass____innerTypes);
		tInnerClass__tOuterClass____outerType.setSrc(tInnerClass);
		tInnerClass__tOuterClass____outerType.setTrg(tOuterClass);
		ruleresult.getTranslatedEdges().add(tInnerClass__tOuterClass____outerType);
		mDefinition__mInnerClass____mInnerTypes.setSrc(mDefinition);
		mDefinition__mInnerClass____mInnerTypes.setTrg(mInnerClass);
		ruleresult.getCreatedEdges().add(mDefinition__mInnerClass____mInnerTypes);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tInnerClassToTInnerClass__tInnerClass____target
				.setName(tInnerClassToTInnerClass__tInnerClass____target_name_prime);
		typeGraph__tInnerClass____classes.setName(typeGraph__tInnerClass____classes_name_prime);
		tInnerPackage__tInnerClass____classes.setName(tInnerPackage__tInnerClass____classes_name_prime);
		tInnerTypeToTInnerAbstractType__mInnerClass____source
				.setName(tInnerTypeToTInnerAbstractType__mInnerClass____source_name_prime);
		tInnerTypeToTInnerAbstractType__tInnerClass____target
				.setName(tInnerTypeToTInnerAbstractType__tInnerClass____target_name_prime);
		tInnerPackage__tOuterPackage____parent.setName(tInnerPackage__tOuterPackage____parent_name_prime);
		tOuterPackage__tInnerPackage____subpackage.setName(tOuterPackage__tInnerPackage____subpackage_name_prime);
		tInnerPackage__tInnerClass____ownedTypes.setName(tInnerPackage__tInnerClass____ownedTypes_name_prime);
		tInnerClass__tInnerPackage____package.setName(tInnerClass__tInnerPackage____package_name_prime);
		tInnerClassToTInnerClass__mInnerClass____source
				.setName(tInnerClassToTInnerClass__mInnerClass____source_name_prime);
		typeGraph__tInnerClass____ownedTypes.setName(typeGraph__tInnerClass____ownedTypes_name_prime);
		tInnerClass__typeGraph____pg.setName(tInnerClass__typeGraph____pg_name_prime);
		tOuterClass__tInnerClass____innerTypes.setName(tOuterClass__tInnerClass____innerTypes_name_prime);
		tInnerClass__tOuterClass____outerType.setName(tInnerClass__tOuterClass____outerType_name_prime);
		mDefinition__mInnerClass____mInnerTypes.setName(mDefinition__mInnerClass____mInnerTypes_name_prime);
		return new Object[] { ruleresult, tInnerTypeToTInnerAbstractType, mInnerClass, typeGraph, tInnerPackage,
				mDefinition, tOuterClass, tInnerClass, tInnerClassToTInnerClass, tOuterPackage,
				tInnerClassToTInnerClass__tInnerClass____target, typeGraph__tInnerClass____classes,
				tInnerPackage__tInnerClass____classes, tInnerTypeToTInnerAbstractType__mInnerClass____source,
				tInnerTypeToTInnerAbstractType__tInnerClass____target, tInnerPackage__tOuterPackage____parent,
				tOuterPackage__tInnerPackage____subpackage, tInnerPackage__tInnerClass____ownedTypes,
				tInnerClass__tInnerPackage____package, tInnerClassToTInnerClass__mInnerClass____source,
				typeGraph__tInnerClass____ownedTypes, tInnerClass__typeGraph____pg,
				tOuterClass__tInnerClass____innerTypes, tInnerClass__tOuterClass____outerType,
				mDefinition__mInnerClass____mInnerTypes };
	}

	public static final void pattern_ClassInnerClassMember_11_5_registerobjects_expressionBBBBBBBBBBBBB(
			ClassInnerClassMember _this, PerformRuleResult ruleresult, EObject tInnerTypeToTInnerAbstractType,
			EObject mInnerClass, EObject typeGraph, EObject eOuterClass, EObject tInnerPackage, EObject mDefinition,
			EObject tOuterClass, EObject tInnerClass, EObject eOuterClassToTOuterClass,
			EObject tInnerClassToTInnerClass, EObject tOuterPackage) {
		_this.registerObjects_BWD(ruleresult, tInnerTypeToTInnerAbstractType, mInnerClass, typeGraph, eOuterClass,
				tInnerPackage, mDefinition, tOuterClass, tInnerClass, eOuterClassToTOuterClass,
				tInnerClassToTInnerClass, tOuterPackage);

	}

	public static final PerformRuleResult pattern_ClassInnerClassMember_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_12_1_preparereturnvalue_bindingFB(
			ClassInnerClassMember _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_12_1_preparereturnvalue_blackFBB(EClass eClass,
			ClassInnerClassMember _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_12_1_preparereturnvalue_bindingAndBlackFFB(
			ClassInnerClassMember _this) {
		Object[] result_pattern_ClassInnerClassMember_12_1_preparereturnvalue_binding = pattern_ClassInnerClassMember_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassInnerClassMember_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassInnerClassMember_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassInnerClassMember_12_1_preparereturnvalue_black = pattern_ClassInnerClassMember_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassInnerClassMember_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassInnerClassMember_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ClassInnerClassMember";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassInnerClassMember_12_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("typeGraph");
		EObject _localVariable_1 = match.getObject("tInnerPackage");
		EObject _localVariable_2 = match.getObject("tOuterClass");
		EObject _localVariable_3 = match.getObject("tInnerClass");
		EObject _localVariable_4 = match.getObject("tOuterPackage");
		EObject tmpTypeGraph = _localVariable_0;
		EObject tmpTInnerPackage = _localVariable_1;
		EObject tmpTOuterClass = _localVariable_2;
		EObject tmpTInnerClass = _localVariable_3;
		EObject tmpTOuterPackage = _localVariable_4;
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			if (tmpTInnerPackage instanceof TPackage) {
				TPackage tInnerPackage = (TPackage) tmpTInnerPackage;
				if (tmpTOuterClass instanceof TClass) {
					TClass tOuterClass = (TClass) tmpTOuterClass;
					if (tmpTInnerClass instanceof TClass) {
						TClass tInnerClass = (TClass) tmpTInnerClass;
						if (tmpTOuterPackage instanceof TPackage) {
							TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
							return new Object[] { typeGraph, tInnerPackage, tOuterClass, tInnerClass, tOuterPackage,
									match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInnerClassMember_12_2_corematch_blackBFBBBFBB(
			TypeGraph typeGraph, TPackage tInnerPackage, TClass tOuterClass, TClass tInnerClass, TPackage tOuterPackage,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tInnerPackage.equals(tOuterPackage)) {
			if (!tInnerClass.equals(tOuterClass)) {
				for (TypeToTAbstractType eOuterClassToTOuterClass : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tOuterClass, TypeToTAbstractType.class, "target")) {
					Type tmpEOuterClass = eOuterClassToTOuterClass.getSource();
					if (tmpEOuterClass instanceof ClassDeclaration) {
						ClassDeclaration eOuterClass = (ClassDeclaration) tmpEOuterClass;
						_result.add(new Object[] { typeGraph, eOuterClass, tInnerPackage, tOuterClass, tInnerClass,
								eOuterClassToTOuterClass, tOuterPackage, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassInnerClassMember_12_3_findcontext_blackBBBFBBBB(
			TypeGraph typeGraph, ClassDeclaration eOuterClass, TPackage tInnerPackage, TClass tOuterClass,
			TClass tInnerClass, TypeToTAbstractType eOuterClassToTOuterClass, TPackage tOuterPackage) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tInnerPackage.equals(tOuterPackage)) {
			if (!tInnerClass.equals(tOuterClass)) {
				if (eOuterClass.equals(eOuterClassToTOuterClass.getSource())) {
					if (typeGraph.getClasses().contains(tInnerClass)) {
						if (tInnerPackage.getClasses().contains(tInnerClass)) {
							if (tOuterClass.equals(eOuterClassToTOuterClass.getTarget())) {
								if (tOuterPackage.equals(tInnerPackage.getParent())) {
									if (tInnerPackage.getOwnedTypes().contains(tInnerClass)) {
										if (typeGraph.getOwnedTypes().contains(tInnerClass)) {
											if (tOuterClass.getInnerTypes().contains(tInnerClass)) {
												if (typeGraph.getOwnedTypes().contains(tOuterClass)) {
													if (tOuterPackage.equals(tOuterClass.getPackage())) {
														for (BodyDeclaration tmpMDefinition : eOuterClass
																.getBodyDeclarations()) {
															if (tmpMDefinition instanceof MAbstractMethodDefinition) {
																MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) tmpMDefinition;
																_result.add(new Object[] { typeGraph, eOuterClass,
																		tInnerPackage, mDefinition, tOuterClass,
																		tInnerClass, eOuterClassToTOuterClass,
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
		}
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_12_3_findcontext_greenBBBBBBBBFFFFFFFFFFFFFFFFFFF(
			TypeGraph typeGraph, ClassDeclaration eOuterClass, TPackage tInnerPackage,
			MAbstractMethodDefinition mDefinition, TClass tOuterClass, TClass tInnerClass,
			TypeToTAbstractType eOuterClassToTOuterClass, TPackage tOuterPackage) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eOuterClassToTOuterClass__eOuterClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClassToTOuterClass__tOuterClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tInnerPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tInnerPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClass__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__eOuterClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tInnerClass____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tOuterClass____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eOuterClassToTOuterClass__eOuterClass____source_name_prime = "source";
		String typeGraph__tInnerClass____classes_name_prime = "classes";
		String tInnerPackage__tInnerClass____classes_name_prime = "classes";
		String eOuterClassToTOuterClass__tOuterClass____target_name_prime = "target";
		String tInnerPackage__tOuterPackage____parent_name_prime = "parent";
		String tOuterPackage__tInnerPackage____subpackage_name_prime = "subpackage";
		String tInnerPackage__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__tInnerPackage____package_name_prime = "package";
		String typeGraph__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__typeGraph____pg_name_prime = "pg";
		String eOuterClass__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__eOuterClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String tOuterClass__tInnerClass____innerTypes_name_prime = "innerTypes";
		String tInnerClass__tOuterClass____outerType_name_prime = "outerType";
		String typeGraph__tOuterClass____ownedTypes_name_prime = "ownedTypes";
		String tOuterClass__typeGraph____pg_name_prime = "pg";
		String tOuterClass__tOuterPackage____package_name_prime = "package";
		String tOuterPackage__tOuterClass____ownedTypes_name_prime = "ownedTypes";
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(eOuterClass);
		isApplicableMatch.getAllContextElements().add(tInnerPackage);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(tOuterClass);
		isApplicableMatch.getAllContextElements().add(tInnerClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass);
		isApplicableMatch.getAllContextElements().add(tOuterPackage);
		eOuterClassToTOuterClass__eOuterClass____source.setSrc(eOuterClassToTOuterClass);
		eOuterClassToTOuterClass__eOuterClass____source.setTrg(eOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass__eOuterClass____source);
		typeGraph__tInnerClass____classes.setSrc(typeGraph);
		typeGraph__tInnerClass____classes.setTrg(tInnerClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tInnerClass____classes);
		tInnerPackage__tInnerClass____classes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____classes.setTrg(tInnerClass);
		isApplicableMatch.getAllContextElements().add(tInnerPackage__tInnerClass____classes);
		eOuterClassToTOuterClass__tOuterClass____target.setSrc(eOuterClassToTOuterClass);
		eOuterClassToTOuterClass__tOuterClass____target.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass__tOuterClass____target);
		tInnerPackage__tOuterPackage____parent.setSrc(tInnerPackage);
		tInnerPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tInnerPackage__tOuterPackage____parent);
		tOuterPackage__tInnerPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tInnerPackage____subpackage.setTrg(tInnerPackage);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tInnerPackage____subpackage);
		tInnerPackage__tInnerClass____ownedTypes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____ownedTypes.setTrg(tInnerClass);
		isApplicableMatch.getAllContextElements().add(tInnerPackage__tInnerClass____ownedTypes);
		tInnerClass__tInnerPackage____package.setSrc(tInnerClass);
		tInnerClass__tInnerPackage____package.setTrg(tInnerPackage);
		isApplicableMatch.getAllContextElements().add(tInnerClass__tInnerPackage____package);
		typeGraph__tInnerClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tInnerClass____ownedTypes.setTrg(tInnerClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tInnerClass____ownedTypes);
		tInnerClass__typeGraph____pg.setSrc(tInnerClass);
		tInnerClass__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tInnerClass__typeGraph____pg);
		eOuterClass__mDefinition____bodyDeclarations.setSrc(eOuterClass);
		eOuterClass__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(eOuterClass__mDefinition____bodyDeclarations);
		mDefinition__eOuterClass____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__eOuterClass____abstractTypeDeclaration.setTrg(eOuterClass);
		isApplicableMatch.getAllContextElements().add(mDefinition__eOuterClass____abstractTypeDeclaration);
		tOuterClass__tInnerClass____innerTypes.setSrc(tOuterClass);
		tOuterClass__tInnerClass____innerTypes.setTrg(tInnerClass);
		isApplicableMatch.getAllContextElements().add(tOuterClass__tInnerClass____innerTypes);
		tInnerClass__tOuterClass____outerType.setSrc(tInnerClass);
		tInnerClass__tOuterClass____outerType.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(tInnerClass__tOuterClass____outerType);
		typeGraph__tOuterClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tOuterClass____ownedTypes.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tOuterClass____ownedTypes);
		tOuterClass__typeGraph____pg.setSrc(tOuterClass);
		tOuterClass__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterClass__typeGraph____pg);
		tOuterClass__tOuterPackage____package.setSrc(tOuterClass);
		tOuterClass__tOuterPackage____package.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tOuterClass__tOuterPackage____package);
		tOuterPackage__tOuterClass____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterClass____ownedTypes.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tOuterClass____ownedTypes);
		eOuterClassToTOuterClass__eOuterClass____source
				.setName(eOuterClassToTOuterClass__eOuterClass____source_name_prime);
		typeGraph__tInnerClass____classes.setName(typeGraph__tInnerClass____classes_name_prime);
		tInnerPackage__tInnerClass____classes.setName(tInnerPackage__tInnerClass____classes_name_prime);
		eOuterClassToTOuterClass__tOuterClass____target
				.setName(eOuterClassToTOuterClass__tOuterClass____target_name_prime);
		tInnerPackage__tOuterPackage____parent.setName(tInnerPackage__tOuterPackage____parent_name_prime);
		tOuterPackage__tInnerPackage____subpackage.setName(tOuterPackage__tInnerPackage____subpackage_name_prime);
		tInnerPackage__tInnerClass____ownedTypes.setName(tInnerPackage__tInnerClass____ownedTypes_name_prime);
		tInnerClass__tInnerPackage____package.setName(tInnerClass__tInnerPackage____package_name_prime);
		typeGraph__tInnerClass____ownedTypes.setName(typeGraph__tInnerClass____ownedTypes_name_prime);
		tInnerClass__typeGraph____pg.setName(tInnerClass__typeGraph____pg_name_prime);
		eOuterClass__mDefinition____bodyDeclarations.setName(eOuterClass__mDefinition____bodyDeclarations_name_prime);
		mDefinition__eOuterClass____abstractTypeDeclaration
				.setName(mDefinition__eOuterClass____abstractTypeDeclaration_name_prime);
		tOuterClass__tInnerClass____innerTypes.setName(tOuterClass__tInnerClass____innerTypes_name_prime);
		tInnerClass__tOuterClass____outerType.setName(tInnerClass__tOuterClass____outerType_name_prime);
		typeGraph__tOuterClass____ownedTypes.setName(typeGraph__tOuterClass____ownedTypes_name_prime);
		tOuterClass__typeGraph____pg.setName(tOuterClass__typeGraph____pg_name_prime);
		tOuterClass__tOuterPackage____package.setName(tOuterClass__tOuterPackage____package_name_prime);
		tOuterPackage__tOuterClass____ownedTypes.setName(tOuterPackage__tOuterClass____ownedTypes_name_prime);
		return new Object[] { typeGraph, eOuterClass, tInnerPackage, mDefinition, tOuterClass, tInnerClass,
				eOuterClassToTOuterClass, tOuterPackage, isApplicableMatch,
				eOuterClassToTOuterClass__eOuterClass____source, typeGraph__tInnerClass____classes,
				tInnerPackage__tInnerClass____classes, eOuterClassToTOuterClass__tOuterClass____target,
				tInnerPackage__tOuterPackage____parent, tOuterPackage__tInnerPackage____subpackage,
				tInnerPackage__tInnerClass____ownedTypes, tInnerClass__tInnerPackage____package,
				typeGraph__tInnerClass____ownedTypes, tInnerClass__typeGraph____pg,
				eOuterClass__mDefinition____bodyDeclarations, mDefinition__eOuterClass____abstractTypeDeclaration,
				tOuterClass__tInnerClass____innerTypes, tInnerClass__tOuterClass____outerType,
				typeGraph__tOuterClass____ownedTypes, tOuterClass__typeGraph____pg,
				tOuterClass__tOuterPackage____package, tOuterPackage__tOuterClass____ownedTypes };
	}

	public static final Object[] pattern_ClassInnerClassMember_12_4_solveCSP_bindingFBBBBBBBBBB(
			ClassInnerClassMember _this, IsApplicableMatch isApplicableMatch, TypeGraph typeGraph,
			ClassDeclaration eOuterClass, TPackage tInnerPackage, MAbstractMethodDefinition mDefinition,
			TClass tOuterClass, TClass tInnerClass, TypeToTAbstractType eOuterClassToTOuterClass,
			TPackage tOuterPackage) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, typeGraph, eOuterClass, tInnerPackage,
				mDefinition, tOuterClass, tInnerClass, eOuterClassToTOuterClass, tOuterPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, typeGraph, eOuterClass, tInnerPackage, mDefinition,
					tOuterClass, tInnerClass, eOuterClassToTOuterClass, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerClassMember_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			ClassInnerClassMember _this, IsApplicableMatch isApplicableMatch, TypeGraph typeGraph,
			ClassDeclaration eOuterClass, TPackage tInnerPackage, MAbstractMethodDefinition mDefinition,
			TClass tOuterClass, TClass tInnerClass, TypeToTAbstractType eOuterClassToTOuterClass,
			TPackage tOuterPackage) {
		Object[] result_pattern_ClassInnerClassMember_12_4_solveCSP_binding = pattern_ClassInnerClassMember_12_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, typeGraph, eOuterClass, tInnerPackage, mDefinition, tOuterClass, tInnerClass,
				eOuterClassToTOuterClass, tOuterPackage);
		if (result_pattern_ClassInnerClassMember_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerClassMember_12_4_solveCSP_binding[0];

			Object[] result_pattern_ClassInnerClassMember_12_4_solveCSP_black = pattern_ClassInnerClassMember_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassInnerClassMember_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, typeGraph, eOuterClass, tInnerPackage, mDefinition,
						tOuterClass, tInnerClass, eOuterClassToTOuterClass, tOuterPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerClassMember_12_5_checkCSP_expressionFBB(ClassInnerClassMember _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassInnerClassMember_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassInnerClassMember";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassInnerClassMember_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_20_1_preparereturnvalue_bindingFB(
			ClassInnerClassMember _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ClassInnerClassMember _this) {
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

	public static final Object[] pattern_ClassInnerClassMember_20_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassInnerClassMember _this) {
		Object[] result_pattern_ClassInnerClassMember_20_1_preparereturnvalue_binding = pattern_ClassInnerClassMember_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassInnerClassMember_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassInnerClassMember_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassInnerClassMember_20_1_preparereturnvalue_black = pattern_ClassInnerClassMember_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassInnerClassMember_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassInnerClassMember_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassInnerClassMember_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_0BB(
			TPackage tInnerPackage, TypeGraph typeGraph) {
		TypeGraph __DEC_tInnerPackage_typeGraph_902012 = tInnerPackage.getTypeGraph();
		if (__DEC_tInnerPackage_typeGraph_902012 != null) {
			if (!typeGraph.equals(__DEC_tInnerPackage_typeGraph_902012)) {
				return new Object[] { tInnerPackage, typeGraph };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_1BB(
			TPackage tInnerPackage, TPackage tOuterPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			TPackage __DEC_tInnerPackage_subpackage_871210 = tInnerPackage.getParent();
			if (__DEC_tInnerPackage_subpackage_871210 != null) {
				if (!tInnerPackage.equals(__DEC_tInnerPackage_subpackage_871210)) {
					if (!tOuterPackage.equals(__DEC_tInnerPackage_subpackage_871210)) {
						return new Object[] { tInnerPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_2BB(
			TPackage tInnerPackage, TypeGraph typeGraph) {
		TypeGraph __DEC_tInnerPackage_packages_895585 = tInnerPackage.getPg();
		if (__DEC_tInnerPackage_packages_895585 != null) {
			if (!typeGraph.equals(__DEC_tInnerPackage_packages_895585)) {
				return new Object[] { tInnerPackage, typeGraph };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_3BBB(
			TClass tInnerClass, TPackage tInnerPackage, TPackage tOuterPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			for (TPackage __DEC_tInnerClass_classes_723032 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tInnerClass, TPackage.class, "classes")) {
				if (!tInnerPackage.equals(__DEC_tInnerClass_classes_723032)) {
					if (!tOuterPackage.equals(__DEC_tInnerClass_classes_723032)) {
						return new Object[] { tInnerClass, tInnerPackage, tOuterPackage };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_4BB(
			TClass tInnerClass, TypeGraph typeGraph) {
		for (TypeGraph __DEC_tInnerClass_classes_218271 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tInnerClass, TypeGraph.class, "classes")) {
			if (!typeGraph.equals(__DEC_tInnerClass_classes_218271)) {
				return new Object[] { tInnerClass, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_5BBB(
			TClass tInnerClass, TPackage tInnerPackage, TPackage tOuterPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			TPackage __DEC_tInnerClass_ownedTypes_46973 = tInnerClass.getPackage();
			if (__DEC_tInnerClass_ownedTypes_46973 != null) {
				if (!tInnerPackage.equals(__DEC_tInnerClass_ownedTypes_46973)) {
					if (!tOuterPackage.equals(__DEC_tInnerClass_ownedTypes_46973)) {
						return new Object[] { tInnerClass, tInnerPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_6BB(
			TClass tInnerClass, TClass tOuterClass) {
		if (!tInnerClass.equals(tOuterClass)) {
			TAbstractType __DEC_tInnerClass_innerTypes_322322 = tInnerClass.getOuterType();
			if (__DEC_tInnerClass_innerTypes_322322 != null) {
				if (!tInnerClass.equals(__DEC_tInnerClass_innerTypes_322322)) {
					if (!tOuterClass.equals(__DEC_tInnerClass_innerTypes_322322)) {
						return new Object[] { tInnerClass, tOuterClass };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_7BB(
			TPackage tInnerPackage, TypeGraph typeGraph) {
		if (typeGraph.equals(tInnerPackage.getTypeGraph())) {
			return new Object[] { tInnerPackage, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_8BB(
			TypeGraph typeGraph, TPackage tInnerPackage) {
		if (typeGraph.getPackages().contains(tInnerPackage)) {
			return new Object[] { typeGraph, tInnerPackage };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_9BB(
			TPackage tOuterPackage, TClass tInnerClass) {
		if (tOuterPackage.getClasses().contains(tInnerClass)) {
			return new Object[] { tOuterPackage, tInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_10BB(
			TPackage tOuterPackage, TClass tInnerClass) {
		if (tOuterPackage.getOwnedTypes().contains(tInnerClass)) {
			return new Object[] { tOuterPackage, tInnerClass };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInnerClassMember_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_classes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTypeGraph = _edge_classes.getSrc();
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			EObject tmpTInnerClass = _edge_classes.getTrg();
			if (tmpTInnerClass instanceof TClass) {
				TClass tInnerClass = (TClass) tmpTInnerClass;
				if (typeGraph.getClasses().contains(tInnerClass)) {
					if (typeGraph.getOwnedTypes().contains(tInnerClass)) {
						TPackage tInnerPackage = tInnerClass.getPackage();
						if (tInnerPackage != null) {
							if (tInnerPackage.getClasses().contains(tInnerClass)) {
								TAbstractType tmpTOuterClass = tInnerClass.getOuterType();
								if (tmpTOuterClass instanceof TClass) {
									TClass tOuterClass = (TClass) tmpTOuterClass;
									if (!tInnerClass.equals(tOuterClass)) {
										if (typeGraph.getOwnedTypes().contains(tOuterClass)) {
											TPackage tOuterPackage = tInnerPackage.getParent();
											if (tOuterPackage != null) {
												if (!tInnerPackage.equals(tOuterPackage)) {
													if (tOuterPackage.equals(tOuterClass.getPackage())) {
														if (pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_4BB(
																tInnerClass, typeGraph) == null) {
															if (pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_0BB(
																	tInnerPackage, typeGraph) == null) {
																if (pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_2BB(
																		tInnerPackage, typeGraph) == null) {
																	if (pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_7BB(
																			tInnerPackage, typeGraph) == null) {
																		if (pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_8BB(
																				typeGraph, tInnerPackage) == null) {
																			if (pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_6BB(
																					tInnerClass, tOuterClass) == null) {
																				if (pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_1BB(
																						tInnerPackage,
																						tOuterPackage) == null) {
																					if (pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_3BBB(
																							tInnerClass, tInnerPackage,
																							tOuterPackage) == null) {
																						if (pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_5BBB(
																								tInnerClass,
																								tInnerPackage,
																								tOuterPackage) == null) {
																							if (pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_9BB(
																									tOuterPackage,
																									tInnerClass) == null) {
																								if (pattern_ClassInnerClassMember_20_2_testcorematchandDECs_black_nac_10BB(
																										tOuterPackage,
																										tInnerClass) == null) {
																									_result.add(
																											new Object[] {
																													typeGraph,
																													tInnerPackage,
																													tOuterClass,
																													tInnerClass,
																													tOuterPackage,
																													_edge_classes });
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}

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

	public static final Object[] pattern_ClassInnerClassMember_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassInnerClassMember_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			ClassInnerClassMember _this, Match match, TypeGraph typeGraph, TPackage tInnerPackage, TClass tOuterClass,
			TClass tInnerClass, TPackage tOuterPackage) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, typeGraph, tInnerPackage, tOuterClass, tInnerClass,
				tOuterPackage);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassInnerClassMember_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassInnerClassMember _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassInnerClassMember_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_21_1_preparereturnvalue_bindingFB(
			ClassInnerClassMember _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ClassInnerClassMember _this) {
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

	public static final Object[] pattern_ClassInnerClassMember_21_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassInnerClassMember _this) {
		Object[] result_pattern_ClassInnerClassMember_21_1_preparereturnvalue_binding = pattern_ClassInnerClassMember_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassInnerClassMember_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassInnerClassMember_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassInnerClassMember_21_1_preparereturnvalue_black = pattern_ClassInnerClassMember_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassInnerClassMember_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassInnerClassMember_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassInnerClassMember_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ClassInnerClassMember_21_2_testcorematchandDECs_black_nac_0BB(
			MClass mInnerClass, ClassDeclaration eOuterClass) {
		if (!eOuterClass.equals(mInnerClass)) {
			AbstractTypeDeclaration __DEC_mInnerClass_abstractTypeDeclaration_570666 = mInnerClass
					.getAbstractTypeDeclaration();
			if (__DEC_mInnerClass_abstractTypeDeclaration_570666 != null) {
				if (!mInnerClass.equals(__DEC_mInnerClass_abstractTypeDeclaration_570666)) {
					if (!eOuterClass.equals(__DEC_mInnerClass_abstractTypeDeclaration_570666)) {
						return new Object[] { mInnerClass, eOuterClass };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_21_2_testcorematchandDECs_black_nac_1B(
			MClass mInnerClass) {
		AnonymousClassDeclaration __DEC_mInnerClass_anonymousClassDeclarationOwner_656253 = mInnerClass
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mInnerClass_anonymousClassDeclarationOwner_656253 != null) {
			return new Object[] { mInnerClass };
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_21_2_testcorematchandDECs_black_nac_2B(
			MClass mInnerClass) {
		for (Model __DEC_mInnerClass_orphanTypes_353595 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mInnerClass, Model.class, "orphanTypes")) {
			return new Object[] { mInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_21_2_testcorematchandDECs_black_nac_3B(
			MClass mInnerClass) {
		org.eclipse.modisco.java.Package __DEC_mInnerClass_ownedElements_288830 = mInnerClass.getPackage();
		if (__DEC_mInnerClass_ownedElements_288830 != null) {
			return new Object[] { mInnerClass };
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_21_2_testcorematchandDECs_black_nac_4BB(
			MClass mInnerClass, MAbstractMethodDefinition mDefinition) {
		for (MAbstractMethodDefinition __DEC_mInnerClass_mInnerTypes_118668 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mInnerClass, MAbstractMethodDefinition.class, "mInnerTypes")) {
			if (!mDefinition.equals(__DEC_mInnerClass_mInnerTypes_118668)) {
				return new Object[] { mInnerClass, mDefinition };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_21_2_testcorematchandDECs_black_nac_5BB(
			MClass mInnerClass, ClassDeclaration eOuterClass) {
		if (eOuterClass.equals(mInnerClass.getAbstractTypeDeclaration())) {
			return new Object[] { mInnerClass, eOuterClass };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInnerClassMember_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_mInnerTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMDefinition = _edge_mInnerTypes.getSrc();
		if (tmpMDefinition instanceof MAbstractMethodDefinition) {
			MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) tmpMDefinition;
			EObject tmpMInnerClass = _edge_mInnerTypes.getTrg();
			if (tmpMInnerClass instanceof MClass) {
				MClass mInnerClass = (MClass) tmpMInnerClass;
				if (mDefinition.getMInnerTypes().contains(mInnerClass)) {
					AbstractTypeDeclaration tmpEOuterClass = mDefinition.getAbstractTypeDeclaration();
					if (tmpEOuterClass instanceof ClassDeclaration) {
						ClassDeclaration eOuterClass = (ClassDeclaration) tmpEOuterClass;
						if (!eOuterClass.equals(mInnerClass)) {
							if (pattern_ClassInnerClassMember_21_2_testcorematchandDECs_black_nac_1B(
									mInnerClass) == null) {
								if (pattern_ClassInnerClassMember_21_2_testcorematchandDECs_black_nac_2B(
										mInnerClass) == null) {
									if (pattern_ClassInnerClassMember_21_2_testcorematchandDECs_black_nac_3B(
											mInnerClass) == null) {
										if (pattern_ClassInnerClassMember_21_2_testcorematchandDECs_black_nac_4BB(
												mInnerClass, mDefinition) == null) {
											if (pattern_ClassInnerClassMember_21_2_testcorematchandDECs_black_nac_0BB(
													mInnerClass, eOuterClass) == null) {
												if (pattern_ClassInnerClassMember_21_2_testcorematchandDECs_black_nac_5BB(
														mInnerClass, eOuterClass) == null) {
													_result.add(new Object[] { mInnerClass, eOuterClass, mDefinition,
															_edge_mInnerTypes });
												}
											}
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

	public static final Object[] pattern_ClassInnerClassMember_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassInnerClassMember_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			ClassInnerClassMember _this, Match match, MClass mInnerClass, ClassDeclaration eOuterClass,
			MAbstractMethodDefinition mDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mInnerClass, eOuterClass, mDefinition);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassInnerClassMember_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassInnerClassMember _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassInnerClassMember_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_24_1_prepare_blackB(ClassInnerClassMember _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassInnerClassMember_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ClassInnerClassMember_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mInnerClass");
		EObject _localVariable_1 = targetMatch.getObject("typeGraph");
		EObject _localVariable_2 = sourceMatch.getObject("eOuterClass");
		EObject _localVariable_3 = targetMatch.getObject("tInnerPackage");
		EObject _localVariable_4 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_5 = targetMatch.getObject("tOuterClass");
		EObject _localVariable_6 = targetMatch.getObject("tInnerClass");
		EObject _localVariable_7 = targetMatch.getObject("tOuterPackage");
		EObject tmpMInnerClass = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpEOuterClass = _localVariable_2;
		EObject tmpTInnerPackage = _localVariable_3;
		EObject tmpMDefinition = _localVariable_4;
		EObject tmpTOuterClass = _localVariable_5;
		EObject tmpTInnerClass = _localVariable_6;
		EObject tmpTOuterPackage = _localVariable_7;
		if (tmpMInnerClass instanceof MClass) {
			MClass mInnerClass = (MClass) tmpMInnerClass;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpEOuterClass instanceof ClassDeclaration) {
					ClassDeclaration eOuterClass = (ClassDeclaration) tmpEOuterClass;
					if (tmpTInnerPackage instanceof TPackage) {
						TPackage tInnerPackage = (TPackage) tmpTInnerPackage;
						if (tmpMDefinition instanceof MAbstractMethodDefinition) {
							MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) tmpMDefinition;
							if (tmpTOuterClass instanceof TClass) {
								TClass tOuterClass = (TClass) tmpTOuterClass;
								if (tmpTInnerClass instanceof TClass) {
									TClass tInnerClass = (TClass) tmpTInnerClass;
									if (tmpTOuterPackage instanceof TPackage) {
										TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
										return new Object[] { mInnerClass, typeGraph, eOuterClass, tInnerPackage,
												mDefinition, tOuterClass, tInnerClass, tOuterPackage, sourceMatch,
												targetMatch };
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

	public static final Object[] pattern_ClassInnerClassMember_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
			MClass mInnerClass, TypeGraph typeGraph, ClassDeclaration eOuterClass, TPackage tInnerPackage,
			MAbstractMethodDefinition mDefinition, TClass tOuterClass, TClass tInnerClass, TPackage tOuterPackage,
			Match sourceMatch, Match targetMatch) {
		if (!eOuterClass.equals(mInnerClass)) {
			if (!tInnerPackage.equals(tOuterPackage)) {
				if (!tInnerClass.equals(tOuterClass)) {
					if (!sourceMatch.equals(targetMatch)) {
						return new Object[] { mInnerClass, typeGraph, eOuterClass, tInnerPackage, mDefinition,
								tOuterClass, tInnerClass, tOuterPackage, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ClassInnerClassMember_24_2_matchsrctrgcontext_binding = pattern_ClassInnerClassMember_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_ClassInnerClassMember_24_2_matchsrctrgcontext_binding != null) {
			MClass mInnerClass = (MClass) result_pattern_ClassInnerClassMember_24_2_matchsrctrgcontext_binding[0];
			TypeGraph typeGraph = (TypeGraph) result_pattern_ClassInnerClassMember_24_2_matchsrctrgcontext_binding[1];
			ClassDeclaration eOuterClass = (ClassDeclaration) result_pattern_ClassInnerClassMember_24_2_matchsrctrgcontext_binding[2];
			TPackage tInnerPackage = (TPackage) result_pattern_ClassInnerClassMember_24_2_matchsrctrgcontext_binding[3];
			MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) result_pattern_ClassInnerClassMember_24_2_matchsrctrgcontext_binding[4];
			TClass tOuterClass = (TClass) result_pattern_ClassInnerClassMember_24_2_matchsrctrgcontext_binding[5];
			TClass tInnerClass = (TClass) result_pattern_ClassInnerClassMember_24_2_matchsrctrgcontext_binding[6];
			TPackage tOuterPackage = (TPackage) result_pattern_ClassInnerClassMember_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_ClassInnerClassMember_24_2_matchsrctrgcontext_black = pattern_ClassInnerClassMember_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					mInnerClass, typeGraph, eOuterClass, tInnerPackage, mDefinition, tOuterClass, tInnerClass,
					tOuterPackage, sourceMatch, targetMatch);
			if (result_pattern_ClassInnerClassMember_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mInnerClass, typeGraph, eOuterClass, tInnerPackage, mDefinition, tOuterClass,
						tInnerClass, tOuterPackage, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_24_3_solvecsp_bindingFBBBBBBBBBBB(
			ClassInnerClassMember _this, MClass mInnerClass, TypeGraph typeGraph, ClassDeclaration eOuterClass,
			TPackage tInnerPackage, MAbstractMethodDefinition mDefinition, TClass tOuterClass, TClass tInnerClass,
			TPackage tOuterPackage, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(mInnerClass, typeGraph, eOuterClass, tInnerPackage,
				mDefinition, tOuterClass, tInnerClass, tOuterPackage, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, mInnerClass, typeGraph, eOuterClass, tInnerPackage, mDefinition,
					tOuterClass, tInnerClass, tOuterPackage, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerClassMember_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			ClassInnerClassMember _this, MClass mInnerClass, TypeGraph typeGraph, ClassDeclaration eOuterClass,
			TPackage tInnerPackage, MAbstractMethodDefinition mDefinition, TClass tOuterClass, TClass tInnerClass,
			TPackage tOuterPackage, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ClassInnerClassMember_24_3_solvecsp_binding = pattern_ClassInnerClassMember_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, mInnerClass, typeGraph, eOuterClass, tInnerPackage, mDefinition, tOuterClass, tInnerClass,
				tOuterPackage, sourceMatch, targetMatch);
		if (result_pattern_ClassInnerClassMember_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerClassMember_24_3_solvecsp_binding[0];

			Object[] result_pattern_ClassInnerClassMember_24_3_solvecsp_black = pattern_ClassInnerClassMember_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_ClassInnerClassMember_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mInnerClass, typeGraph, eOuterClass, tInnerPackage, mDefinition,
						tOuterClass, tInnerClass, tOuterPackage, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerClassMember_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassInnerClassMember_24_5_matchcorrcontext_blackBBFBB(
			ClassDeclaration eOuterClass, TClass tOuterClass, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType eOuterClassToTOuterClass : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eOuterClass, TypeToTAbstractType.class, "source")) {
				if (tOuterClass.equals(eOuterClassToTOuterClass.getTarget())) {
					_result.add(new Object[] { eOuterClass, tOuterClass, eOuterClassToTOuterClass, sourceMatch,
							targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_24_5_matchcorrcontext_greenBBBF(
			TypeToTAbstractType eOuterClassToTOuterClass, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ClassInnerClassMember";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(eOuterClassToTOuterClass);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { eOuterClassToTOuterClass, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ClassInnerClassMember_24_6_createcorrespondence_blackBBBBBBBBB(
			MClass mInnerClass, TypeGraph typeGraph, ClassDeclaration eOuterClass, TPackage tInnerPackage,
			MAbstractMethodDefinition mDefinition, TClass tOuterClass, TClass tInnerClass, TPackage tOuterPackage,
			CCMatch ccMatch) {
		if (!eOuterClass.equals(mInnerClass)) {
			if (!tInnerPackage.equals(tOuterPackage)) {
				if (!tInnerClass.equals(tOuterClass)) {
					return new Object[] { mInnerClass, typeGraph, eOuterClass, tInnerPackage, mDefinition, tOuterClass,
							tInnerClass, tOuterPackage, ccMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_24_6_createcorrespondence_greenFBBFB(MClass mInnerClass,
			TClass tInnerClass, CCMatch ccMatch) {
		TypeToTAbstractType tInnerTypeToTInnerAbstractType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		ClassDeclarationToTClass tInnerClassToTInnerClass = PmFactory.eINSTANCE.createClassDeclarationToTClass();
		tInnerTypeToTInnerAbstractType.setSource(mInnerClass);
		tInnerTypeToTInnerAbstractType.setTarget(tInnerClass);
		ccMatch.getCreateCorr().add(tInnerTypeToTInnerAbstractType);
		tInnerClassToTInnerClass.setTarget(tInnerClass);
		tInnerClassToTInnerClass.setSource(mInnerClass);
		ccMatch.getCreateCorr().add(tInnerClassToTInnerClass);
		return new Object[] { tInnerTypeToTInnerAbstractType, mInnerClass, tInnerClass, tInnerClassToTInnerClass,
				ccMatch };
	}

	public static final Object[] pattern_ClassInnerClassMember_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ClassInnerClassMember_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ClassInnerClassMember";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassInnerClassMember_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_27_1_matchtggpattern_black_nac_0BB(MClass mInnerClass,
			ClassDeclaration eOuterClass) {
		if (!eOuterClass.equals(mInnerClass)) {
			AbstractTypeDeclaration __DEC_mInnerClass_abstractTypeDeclaration_635681 = mInnerClass
					.getAbstractTypeDeclaration();
			if (__DEC_mInnerClass_abstractTypeDeclaration_635681 != null) {
				if (!mInnerClass.equals(__DEC_mInnerClass_abstractTypeDeclaration_635681)) {
					if (!eOuterClass.equals(__DEC_mInnerClass_abstractTypeDeclaration_635681)) {
						return new Object[] { mInnerClass, eOuterClass };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_27_1_matchtggpattern_black_nac_1B(MClass mInnerClass) {
		AnonymousClassDeclaration __DEC_mInnerClass_anonymousClassDeclarationOwner_94466 = mInnerClass
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mInnerClass_anonymousClassDeclarationOwner_94466 != null) {
			return new Object[] { mInnerClass };
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_27_1_matchtggpattern_black_nac_2B(MClass mInnerClass) {
		for (Model __DEC_mInnerClass_orphanTypes_707969 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mInnerClass, Model.class, "orphanTypes")) {
			return new Object[] { mInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_27_1_matchtggpattern_black_nac_3B(MClass mInnerClass) {
		org.eclipse.modisco.java.Package __DEC_mInnerClass_ownedElements_797544 = mInnerClass.getPackage();
		if (__DEC_mInnerClass_ownedElements_797544 != null) {
			return new Object[] { mInnerClass };
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_27_1_matchtggpattern_black_nac_4BB(MClass mInnerClass,
			MAbstractMethodDefinition mDefinition) {
		for (MAbstractMethodDefinition __DEC_mInnerClass_mInnerTypes_612796 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mInnerClass, MAbstractMethodDefinition.class, "mInnerTypes")) {
			if (!mDefinition.equals(__DEC_mInnerClass_mInnerTypes_612796)) {
				return new Object[] { mInnerClass, mDefinition };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_27_1_matchtggpattern_black_nac_5BB(MClass mInnerClass,
			ClassDeclaration eOuterClass) {
		if (eOuterClass.equals(mInnerClass.getAbstractTypeDeclaration())) {
			return new Object[] { mInnerClass, eOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_27_1_matchtggpattern_blackBBB(MClass mInnerClass,
			ClassDeclaration eOuterClass, MAbstractMethodDefinition mDefinition) {
		if (!eOuterClass.equals(mInnerClass)) {
			if (eOuterClass.getBodyDeclarations().contains(mDefinition)) {
				if (mDefinition.getMInnerTypes().contains(mInnerClass)) {
					if (pattern_ClassInnerClassMember_27_1_matchtggpattern_black_nac_0BB(mInnerClass,
							eOuterClass) == null) {
						if (pattern_ClassInnerClassMember_27_1_matchtggpattern_black_nac_1B(mInnerClass) == null) {
							if (pattern_ClassInnerClassMember_27_1_matchtggpattern_black_nac_2B(mInnerClass) == null) {
								if (pattern_ClassInnerClassMember_27_1_matchtggpattern_black_nac_3B(
										mInnerClass) == null) {
									if (pattern_ClassInnerClassMember_27_1_matchtggpattern_black_nac_4BB(mInnerClass,
											mDefinition) == null) {
										if (pattern_ClassInnerClassMember_27_1_matchtggpattern_black_nac_5BB(
												mInnerClass, eOuterClass) == null) {
											return new Object[] { mInnerClass, eOuterClass, mDefinition };
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

	public static final boolean pattern_ClassInnerClassMember_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassInnerClassMember_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_0BB(
			TPackage tInnerPackage, TypeGraph typeGraph) {
		TypeGraph __DEC_tInnerPackage_typeGraph_569718 = tInnerPackage.getTypeGraph();
		if (__DEC_tInnerPackage_typeGraph_569718 != null) {
			if (!typeGraph.equals(__DEC_tInnerPackage_typeGraph_569718)) {
				return new Object[] { tInnerPackage, typeGraph };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_1BB(
			TPackage tInnerPackage, TPackage tOuterPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			TPackage __DEC_tInnerPackage_subpackage_485426 = tInnerPackage.getParent();
			if (__DEC_tInnerPackage_subpackage_485426 != null) {
				if (!tInnerPackage.equals(__DEC_tInnerPackage_subpackage_485426)) {
					if (!tOuterPackage.equals(__DEC_tInnerPackage_subpackage_485426)) {
						return new Object[] { tInnerPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_2BB(
			TPackage tInnerPackage, TypeGraph typeGraph) {
		TypeGraph __DEC_tInnerPackage_packages_447557 = tInnerPackage.getPg();
		if (__DEC_tInnerPackage_packages_447557 != null) {
			if (!typeGraph.equals(__DEC_tInnerPackage_packages_447557)) {
				return new Object[] { tInnerPackage, typeGraph };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_3BBB(TClass tInnerClass,
			TPackage tInnerPackage, TPackage tOuterPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			for (TPackage __DEC_tInnerClass_classes_532767 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tInnerClass, TPackage.class, "classes")) {
				if (!tInnerPackage.equals(__DEC_tInnerClass_classes_532767)) {
					if (!tOuterPackage.equals(__DEC_tInnerClass_classes_532767)) {
						return new Object[] { tInnerClass, tInnerPackage, tOuterPackage };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_4BB(TClass tInnerClass,
			TypeGraph typeGraph) {
		for (TypeGraph __DEC_tInnerClass_classes_819858 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tInnerClass, TypeGraph.class, "classes")) {
			if (!typeGraph.equals(__DEC_tInnerClass_classes_819858)) {
				return new Object[] { tInnerClass, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_5BBB(TClass tInnerClass,
			TPackage tInnerPackage, TPackage tOuterPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			TPackage __DEC_tInnerClass_ownedTypes_693455 = tInnerClass.getPackage();
			if (__DEC_tInnerClass_ownedTypes_693455 != null) {
				if (!tInnerPackage.equals(__DEC_tInnerClass_ownedTypes_693455)) {
					if (!tOuterPackage.equals(__DEC_tInnerClass_ownedTypes_693455)) {
						return new Object[] { tInnerClass, tInnerPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_6BB(TClass tInnerClass,
			TClass tOuterClass) {
		if (!tInnerClass.equals(tOuterClass)) {
			TAbstractType __DEC_tInnerClass_innerTypes_5455 = tInnerClass.getOuterType();
			if (__DEC_tInnerClass_innerTypes_5455 != null) {
				if (!tInnerClass.equals(__DEC_tInnerClass_innerTypes_5455)) {
					if (!tOuterClass.equals(__DEC_tInnerClass_innerTypes_5455)) {
						return new Object[] { tInnerClass, tOuterClass };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_7BB(
			TPackage tInnerPackage, TypeGraph typeGraph) {
		if (typeGraph.equals(tInnerPackage.getTypeGraph())) {
			return new Object[] { tInnerPackage, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_8BB(TypeGraph typeGraph,
			TPackage tInnerPackage) {
		if (typeGraph.getPackages().contains(tInnerPackage)) {
			return new Object[] { typeGraph, tInnerPackage };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_9BB(
			TPackage tOuterPackage, TClass tInnerClass) {
		if (tOuterPackage.getClasses().contains(tInnerClass)) {
			return new Object[] { tOuterPackage, tInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_10BB(
			TPackage tOuterPackage, TClass tInnerClass) {
		if (tOuterPackage.getOwnedTypes().contains(tInnerClass)) {
			return new Object[] { tOuterPackage, tInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_28_1_matchtggpattern_blackBBBBB(TypeGraph typeGraph,
			TPackage tInnerPackage, TClass tOuterClass, TClass tInnerClass, TPackage tOuterPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			if (!tInnerClass.equals(tOuterClass)) {
				if (typeGraph.getClasses().contains(tInnerClass)) {
					if (tInnerPackage.getClasses().contains(tInnerClass)) {
						if (tOuterPackage.equals(tInnerPackage.getParent())) {
							if (tInnerPackage.getOwnedTypes().contains(tInnerClass)) {
								if (typeGraph.getOwnedTypes().contains(tInnerClass)) {
									if (tOuterClass.getInnerTypes().contains(tInnerClass)) {
										if (typeGraph.getOwnedTypes().contains(tOuterClass)) {
											if (tOuterPackage.equals(tOuterClass.getPackage())) {
												if (pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_0BB(
														tInnerPackage, typeGraph) == null) {
													if (pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_1BB(
															tInnerPackage, tOuterPackage) == null) {
														if (pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_2BB(
																tInnerPackage, typeGraph) == null) {
															if (pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_3BBB(
																	tInnerClass, tInnerPackage,
																	tOuterPackage) == null) {
																if (pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_4BB(
																		tInnerClass, typeGraph) == null) {
																	if (pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_5BBB(
																			tInnerClass, tInnerPackage,
																			tOuterPackage) == null) {
																		if (pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_6BB(
																				tInnerClass, tOuterClass) == null) {
																			if (pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_7BB(
																					tInnerPackage, typeGraph) == null) {
																				if (pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_8BB(
																						typeGraph,
																						tInnerPackage) == null) {
																					if (pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_9BB(
																							tOuterPackage,
																							tInnerClass) == null) {
																						if (pattern_ClassInnerClassMember_28_1_matchtggpattern_black_nac_10BB(
																								tOuterPackage,
																								tInnerClass) == null) {
																							return new Object[] {
																									typeGraph,
																									tInnerPackage,
																									tOuterClass,
																									tInnerClass,
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
		return null;
	}

	public static final boolean pattern_ClassInnerClassMember_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassInnerClassMember_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_29_1_createresult_blackB(ClassInnerClassMember _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassInnerClassMember_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ClassInnerClassMember_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph typeGraph) {
		if (ruleResult.getTargetObjects().contains(typeGraph)) {
			return new Object[] { ruleResult, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TClass tOuterClass) {
		if (ruleResult.getTargetObjects().contains(tOuterClass)) {
			return new Object[] { ruleResult, tOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TPackage tOuterPackage) {
		if (ruleResult.getTargetObjects().contains(tOuterPackage)) {
			return new Object[] { ruleResult, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eOuterClassToTOuterClass) {
		if (ruleResult.getCorrObjects().contains(eOuterClassToTOuterClass)) {
			return new Object[] { ruleResult, eOuterClassToTOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ClassDeclaration eOuterClass) {
		if (ruleResult.getSourceObjects().contains(eOuterClass)) {
			return new Object[] { ruleResult, eOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MAbstractMethodDefinition mDefinition) {
		if (ruleResult.getSourceObjects().contains(mDefinition)) {
			return new Object[] { ruleResult, mDefinition };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInnerClassMember_29_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eOuterClassToTOuterClassList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpEOuterClassToTOuterClass : eOuterClassToTOuterClassList.getEntryObjects()) {
				if (tmpEOuterClassToTOuterClass instanceof TypeToTAbstractType) {
					TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) tmpEOuterClassToTOuterClass;
					TAbstractType tmpTOuterClass = eOuterClassToTOuterClass.getTarget();
					if (tmpTOuterClass instanceof TClass) {
						TClass tOuterClass = (TClass) tmpTOuterClass;
						Type tmpEOuterClass = eOuterClassToTOuterClass.getSource();
						if (tmpEOuterClass instanceof ClassDeclaration) {
							ClassDeclaration eOuterClass = (ClassDeclaration) tmpEOuterClass;
							TypeGraph typeGraph = tOuterClass.getPg();
							if (typeGraph != null) {
								TPackage tOuterPackage = tOuterClass.getPackage();
								if (tOuterPackage != null) {
									if (pattern_ClassInnerClassMember_29_2_isapplicablecore_black_nac_3BB(ruleResult,
											eOuterClassToTOuterClass) == null) {
										if (pattern_ClassInnerClassMember_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, tOuterClass) == null) {
											if (pattern_ClassInnerClassMember_29_2_isapplicablecore_black_nac_4BB(
													ruleResult, eOuterClass) == null) {
												if (pattern_ClassInnerClassMember_29_2_isapplicablecore_black_nac_0BB(
														ruleResult, typeGraph) == null) {
													if (pattern_ClassInnerClassMember_29_2_isapplicablecore_black_nac_2BB(
															ruleResult, tOuterPackage) == null) {
														for (BodyDeclaration tmpMDefinition : eOuterClass
																.getBodyDeclarations()) {
															if (tmpMDefinition instanceof MAbstractMethodDefinition) {
																MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) tmpMDefinition;
																if (pattern_ClassInnerClassMember_29_2_isapplicablecore_black_nac_5BB(
																		ruleResult, mDefinition) == null) {
																	_result.add(new Object[] {
																			eOuterClassToTOuterClassList, typeGraph,
																			tOuterClass, tOuterPackage,
																			eOuterClassToTOuterClass, eOuterClass,
																			mDefinition, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_29_3_solveCSP_bindingFBBBBBBBBB(
			ClassInnerClassMember _this, IsApplicableMatch isApplicableMatch, TypeGraph typeGraph,
			ClassDeclaration eOuterClass, MAbstractMethodDefinition mDefinition, TClass tOuterClass,
			TypeToTAbstractType eOuterClassToTOuterClass, TPackage tOuterPackage, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, typeGraph, eOuterClass, mDefinition,
				tOuterClass, eOuterClassToTOuterClass, tOuterPackage, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, typeGraph, eOuterClass, mDefinition, tOuterClass,
					eOuterClassToTOuterClass, tOuterPackage, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerClassMember_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerClassMember_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			ClassInnerClassMember _this, IsApplicableMatch isApplicableMatch, TypeGraph typeGraph,
			ClassDeclaration eOuterClass, MAbstractMethodDefinition mDefinition, TClass tOuterClass,
			TypeToTAbstractType eOuterClassToTOuterClass, TPackage tOuterPackage, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ClassInnerClassMember_29_3_solveCSP_binding = pattern_ClassInnerClassMember_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, typeGraph, eOuterClass, mDefinition, tOuterClass, eOuterClassToTOuterClass,
				tOuterPackage, ruleResult);
		if (result_pattern_ClassInnerClassMember_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerClassMember_29_3_solveCSP_binding[0];

			Object[] result_pattern_ClassInnerClassMember_29_3_solveCSP_black = pattern_ClassInnerClassMember_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ClassInnerClassMember_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, typeGraph, eOuterClass, mDefinition, tOuterClass,
						eOuterClassToTOuterClass, tOuterPackage, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerClassMember_29_4_checkCSP_expressionFBB(ClassInnerClassMember _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerClassMember_29_5_checknacs_blackBBBBBB(TypeGraph typeGraph,
			ClassDeclaration eOuterClass, MAbstractMethodDefinition mDefinition, TClass tOuterClass,
			TypeToTAbstractType eOuterClassToTOuterClass, TPackage tOuterPackage) {
		return new Object[] { typeGraph, eOuterClass, mDefinition, tOuterClass, eOuterClassToTOuterClass,
				tOuterPackage };
	}

	public static final Object[] pattern_ClassInnerClassMember_29_6_perform_blackBBBBBBB(TypeGraph typeGraph,
			ClassDeclaration eOuterClass, MAbstractMethodDefinition mDefinition, TClass tOuterClass,
			TypeToTAbstractType eOuterClassToTOuterClass, TPackage tOuterPackage, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { typeGraph, eOuterClass, mDefinition, tOuterClass, eOuterClassToTOuterClass, tOuterPackage,
				ruleResult };
	}

	public static final Object[] pattern_ClassInnerClassMember_29_6_perform_greenFFBFBBFFBBB(TypeGraph typeGraph,
			MAbstractMethodDefinition mDefinition, TClass tOuterClass, TPackage tOuterPackage,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		TypeToTAbstractType tInnerTypeToTInnerAbstractType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		MClass mInnerClass = ModiscoFactory.eINSTANCE.createMClass();
		TPackage tInnerPackage = BasicFactory.eINSTANCE.createTPackage();
		TClass tInnerClass = BasicFactory.eINSTANCE.createTClass();
		ClassDeclarationToTClass tInnerClassToTInnerClass = PmFactory.eINSTANCE.createClassDeclarationToTClass();
		Object _localVariable_0 = csp.getValue("mInnerClass", "name");
		Object _localVariable_1 = csp.getValue("tInnerPackage", "tName");
		Object _localVariable_2 = csp.getValue("tInnerClass", "tName");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_3 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(tInnerTypeToTInnerAbstractType);
		tInnerTypeToTInnerAbstractType.setSource(mInnerClass);
		mDefinition.getMInnerTypes().add(mInnerClass);
		ruleResult.getSourceObjects().add(mInnerClass);
		tInnerPackage.setParent(tOuterPackage);
		ruleResult.getTargetObjects().add(tInnerPackage);
		typeGraph.getClasses().add(tInnerClass);
		tInnerPackage.getClasses().add(tInnerClass);
		tInnerTypeToTInnerAbstractType.setTarget(tInnerClass);
		tInnerPackage.getOwnedTypes().add(tInnerClass);
		typeGraph.getOwnedTypes().add(tInnerClass);
		tOuterClass.getInnerTypes().add(tInnerClass);
		ruleResult.getTargetObjects().add(tInnerClass);
		tInnerClassToTInnerClass.setTarget(tInnerClass);
		tInnerClassToTInnerClass.setSource(mInnerClass);
		ruleResult.getCorrObjects().add(tInnerClassToTInnerClass);
		String mInnerClass_name_prime = (String) _localVariable_0;
		String tInnerPackage_tName_prime = (String) _localVariable_1;
		String tInnerClass_tName_prime = (String) _localVariable_2;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_3);
		mInnerClass.setName(mInnerClass_name_prime);
		tInnerPackage.setTName(tInnerPackage_tName_prime);
		tInnerClass.setTName(tInnerClass_tName_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tInnerTypeToTInnerAbstractType, mInnerClass, typeGraph, tInnerPackage, mDefinition,
				tOuterClass, tInnerClass, tInnerClassToTInnerClass, tOuterPackage, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ClassInnerClassMember_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ClassInnerClassMemberImpl
