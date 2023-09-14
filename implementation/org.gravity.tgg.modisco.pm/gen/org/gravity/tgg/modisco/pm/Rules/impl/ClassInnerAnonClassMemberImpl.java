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
import org.eclipse.modisco.java.Model;

import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MClass;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.AnonymousClassDeclarationToTClass;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.ClassInnerAnonClassMember;
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
 * An implementation of the model object '<em><b>Class Inner Anon Class Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ClassInnerAnonClassMemberImpl extends AbstractRuleImpl implements ClassInnerAnonClassMember {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassInnerAnonClassMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getClassInnerAnonClassMember();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MClass mInnerClass, AnonymousClassDeclaration eOuterClass,
			MAbstractMethodDefinition mDefinition) {

		Object[] result1_black = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_0_1_initialbindings_blackBBBBB(this, match, mInnerClass, eOuterClass,
						mDefinition);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mInnerClass] = " + mInnerClass + ", " + "[eOuterClass] = "
					+ eOuterClass + ", " + "[mDefinition] = " + mDefinition + ".");
		}

		Object[] result2_bindingAndBlack = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mInnerClass,
						eOuterClass, mDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mInnerClass] = " + mInnerClass + ", " + "[eOuterClass] = "
					+ eOuterClass + ", " + "[mDefinition] = " + mDefinition + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ClassInnerAnonClassMemberImpl
					.pattern_ClassInnerAnonClassMember_0_4_collectelementstobetranslated_blackBBBB(match, mInnerClass,
							eOuterClass, mDefinition);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mInnerClass] = " + mInnerClass + ", " + "[eOuterClass] = " + eOuterClass + ", "
						+ "[mDefinition] = " + mDefinition + ".");
			}
			ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_0_4_collectelementstobetranslated_greenBBBF(
					match, mInnerClass, mDefinition);
			//nothing EMoflonEdge mDefinition__mInnerClass____mInnerTypes = (EMoflonEdge) result4_green[3];

			Object[] result5_black = ClassInnerAnonClassMemberImpl
					.pattern_ClassInnerAnonClassMember_0_5_collectcontextelements_blackBBBB(match, mInnerClass,
							eOuterClass, mDefinition);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mInnerClass] = " + mInnerClass + ", " + "[eOuterClass] = " + eOuterClass + ", "
						+ "[mDefinition] = " + mDefinition + ".");
			}
			ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_0_5_collectcontextelements_greenBBBFF(match,
					eOuterClass, mDefinition);
			//nothing EMoflonEdge eOuterClass__mDefinition____bodyDeclarations = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge mDefinition__eOuterClass____anonymousClassDeclarationOwner = (EMoflonEdge) result5_green[4];

			// 
			ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_0_6_registerobjectstomatch_expressionBBBBB(
					this, match, mInnerClass, eOuterClass, mDefinition);
			return ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_0_7_expressionF();
		} else {
			return ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TPackage tPackage = (TPackage) result1_bindingAndBlack[0];
		MClass mInnerClass = (MClass) result1_bindingAndBlack[1];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[2];
		AnonymousClassDeclaration eOuterClass = (AnonymousClassDeclaration) result1_bindingAndBlack[3];
		TClass tOuterClass = (TClass) result1_bindingAndBlack[4];
		MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) result1_bindingAndBlack[5];
		AnonymousClassDeclarationToTClass eOuterClassToTOuterClass = (AnonymousClassDeclarationToTClass) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_1_1_performtransformation_greenFFBBBBFB(tPackage, mInnerClass,
						typeGraph, tOuterClass, csp);
		ASTNodeToTAnnotatable astNodeToAnnotatable = (ASTNodeToTAnnotatable) result1_green[0];
		TypeToTAbstractType tInnerTypeToTInnerAbstractType = (TypeToTAbstractType) result1_green[1];
		TClass tInnerClass = (TClass) result1_green[6];

		Object[] result2_black = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_1_2_collecttranslatedelements_blackBBBB(astNodeToAnnotatable,
						tInnerTypeToTInnerAbstractType, mInnerClass, tInnerClass);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[astNodeToAnnotatable] = " + astNodeToAnnotatable
							+ ", " + "[tInnerTypeToTInnerAbstractType] = " + tInnerTypeToTInnerAbstractType + ", "
							+ "[mInnerClass] = " + mInnerClass + ", " + "[tInnerClass] = " + tInnerClass + ".");
		}
		Object[] result2_green = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_1_2_collecttranslatedelements_greenFBBBB(astNodeToAnnotatable,
						tInnerTypeToTInnerAbstractType, mInnerClass, tInnerClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_1_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult,
						astNodeToAnnotatable, tInnerTypeToTInnerAbstractType, tPackage, mInnerClass, typeGraph,
						eOuterClass, tOuterClass, mDefinition, tInnerClass, eOuterClassToTOuterClass);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[astNodeToAnnotatable] = " + astNodeToAnnotatable + ", "
					+ "[tInnerTypeToTInnerAbstractType] = " + tInnerTypeToTInnerAbstractType + ", " + "[tPackage] = "
					+ tPackage + ", " + "[mInnerClass] = " + mInnerClass + ", " + "[typeGraph] = " + typeGraph + ", "
					+ "[eOuterClass] = " + eOuterClass + ", " + "[tOuterClass] = " + tOuterClass + ", "
					+ "[mDefinition] = " + mDefinition + ", " + "[tInnerClass] = " + tInnerClass + ", "
					+ "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ".");
		}
		ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFFF(ruleresult,
						astNodeToAnnotatable, tInnerTypeToTInnerAbstractType, tPackage, mInnerClass, typeGraph,
						tOuterClass, mDefinition, tInnerClass);
		//nothing EMoflonEdge astNodeToAnnotatable__tInnerClass____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge typeGraph__tInnerClass____classes = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tInnerTypeToTInnerAbstractType__mInnerClass____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge astNodeToAnnotatable__mInnerClass____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tInnerTypeToTInnerAbstractType__tInnerClass____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tPackage__tInnerClass____classes = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge typeGraph__tInnerClass____allTypes = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tInnerClass__typeGraph____model = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tOuterClass__tInnerClass____innerTypes = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tInnerClass__tOuterClass____outerType = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tPackage__tInnerClass____allTypes = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge tInnerClass__tPackage____package = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge mDefinition__mInnerClass____mInnerTypes = (EMoflonEdge) result3_green[21];

		// 
		// 
		ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_1_5_registerobjects_expressionBBBBBBBBBBBB(this,
				ruleresult, astNodeToAnnotatable, tInnerTypeToTInnerAbstractType, tPackage, mInnerClass, typeGraph,
				eOuterClass, tOuterClass, mDefinition, tInnerClass, eOuterClassToTOuterClass);
		return ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MClass mInnerClass = (MClass) result2_binding[0];
		AnonymousClassDeclaration eOuterClass = (AnonymousClassDeclaration) result2_binding[1];
		MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) result2_binding[2];
		for (Object[] result2_black : ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_2_2_corematch_blackBBFBFB(mInnerClass, eOuterClass, mDefinition,
						match)) {
			TClass tOuterClass = (TClass) result2_black[2];
			AnonymousClassDeclarationToTClass eOuterClassToTOuterClass = (AnonymousClassDeclarationToTClass) result2_black[4];
			// ForEach 
			for (Object[] result3_black : ClassInnerAnonClassMemberImpl
					.pattern_ClassInnerAnonClassMember_2_3_findcontext_blackFBFBBBB(mInnerClass, eOuterClass,
							tOuterClass, mDefinition, eOuterClassToTOuterClass)) {
				TPackage tPackage = (TPackage) result3_black[0];
				TypeGraph typeGraph = (TypeGraph) result3_black[2];
				Object[] result3_green = ClassInnerAnonClassMemberImpl
						.pattern_ClassInnerAnonClassMember_2_3_findcontext_greenBBBBBBBFFFFFFFFFF(tPackage, mInnerClass,
								typeGraph, eOuterClass, tOuterClass, mDefinition, eOuterClassToTOuterClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge tOuterClass__typeGraph____model = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge typeGraph__tOuterClass____allTypes = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge eOuterClassToTOuterClass__eOuterClass____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge eOuterClassToTOuterClass__tOuterClass____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tOuterClass__tPackage____package = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tPackage__tOuterClass____allTypes = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge eOuterClass__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mDefinition__eOuterClass____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mDefinition__mInnerClass____mInnerTypes = (EMoflonEdge) result3_green[16];

				Object[] result4_bindingAndBlack = ClassInnerAnonClassMemberImpl
						.pattern_ClassInnerAnonClassMember_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, tPackage, mInnerClass, typeGraph, eOuterClass, tOuterClass,
								mDefinition, eOuterClassToTOuterClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tPackage] = " + tPackage + ", "
							+ "[mInnerClass] = " + mInnerClass + ", " + "[typeGraph] = " + typeGraph + ", "
							+ "[eOuterClass] = " + eOuterClass + ", " + "[tOuterClass] = " + tOuterClass + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[eOuterClassToTOuterClass] = "
							+ eOuterClassToTOuterClass + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = ClassInnerAnonClassMemberImpl
							.pattern_ClassInnerAnonClassMember_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MClass mInnerClass, AnonymousClassDeclaration eOuterClass,
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
	public CSP isAppropriate_solveCsp_FWD(Match match, MClass mInnerClass, AnonymousClassDeclaration eOuterClass,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TPackage tPackage, MClass mInnerClass,
			TypeGraph typeGraph, AnonymousClassDeclaration eOuterClass, TClass tOuterClass,
			MAbstractMethodDefinition mDefinition, AnonymousClassDeclarationToTClass eOuterClassToTOuterClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_mInnerClass_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mInnerClass.proxy", true, csp);
		var_mInnerClass_proxy.setValue(mInnerClass.isProxy());
		var_mInnerClass_proxy.setType("Boolean");
		Variable var_tOuterClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterClass.tName", true, csp);
		var_tOuterClass_tName.setValue(tOuterClass.getTName());
		var_tOuterClass_tName.setType("String");
		Variable var_mInnerClass_name = CSPFactoryHelper.eINSTANCE.createVariable("mInnerClass.name", true, csp);
		var_mInnerClass_name.setValue(mInnerClass.getName());
		var_mInnerClass_name.setType("String");

		// Create unbound variables
		Variable var_tInnerClass_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass.tLib", csp);
		var_tInnerClass_tLib.setType("Boolean");
		Variable var_tInnerClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass.tName", csp);
		var_tInnerClass_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Concat concat = new Concat();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(concat);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mInnerClass_proxy, var_tInnerClass_tLib);
		concat.setRuleName("NoRuleName");
		concat.solve(literal0, var_tOuterClass_tName, var_mInnerClass_name, var_tInnerClass_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("mInnerClass", mInnerClass);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("eOuterClass", eOuterClass);
		isApplicableMatch.registerObject("tOuterClass", tOuterClass);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject astNodeToAnnotatable,
			EObject tInnerTypeToTInnerAbstractType, EObject tPackage, EObject mInnerClass, EObject typeGraph,
			EObject eOuterClass, EObject tOuterClass, EObject mDefinition, EObject tInnerClass,
			EObject eOuterClassToTOuterClass) {
		ruleresult.registerObject("astNodeToAnnotatable", astNodeToAnnotatable);
		ruleresult.registerObject("tInnerTypeToTInnerAbstractType", tInnerTypeToTInnerAbstractType);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("mInnerClass", mInnerClass);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("eOuterClass", eOuterClass);
		ruleresult.registerObject("tOuterClass", tOuterClass);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("tInnerClass", tInnerClass);
		ruleresult.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);

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
	public boolean isAppropriate_BWD(Match match, TPackage tPackage, TypeGraph typeGraph, TClass tOuterClass,
			TClass tInnerClass) {

		Object[] result1_black = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_10_1_initialbindings_blackBBBBBB(this, match, tPackage, typeGraph,
						tOuterClass, tInnerClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tPackage] = " + tPackage + ", " + "[typeGraph] = " + typeGraph
					+ ", " + "[tOuterClass] = " + tOuterClass + ", " + "[tInnerClass] = " + tInnerClass + ".");
		}

		Object[] result2_bindingAndBlack = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, tPackage,
						typeGraph, tOuterClass, tInnerClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tPackage] = " + tPackage + ", " + "[typeGraph] = " + typeGraph
					+ ", " + "[tOuterClass] = " + tOuterClass + ", " + "[tInnerClass] = " + tInnerClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ClassInnerAnonClassMemberImpl
					.pattern_ClassInnerAnonClassMember_10_4_collectelementstobetranslated_blackBBBBB(match, tPackage,
							typeGraph, tOuterClass, tInnerClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tPackage] = " + tPackage + ", " + "[typeGraph] = " + typeGraph + ", " + "[tOuterClass] = "
						+ tOuterClass + ", " + "[tInnerClass] = " + tInnerClass + ".");
			}
			ClassInnerAnonClassMemberImpl
					.pattern_ClassInnerAnonClassMember_10_4_collectelementstobetranslated_greenBBBBBFFFFFFFF(match,
							tPackage, typeGraph, tOuterClass, tInnerClass);
			//nothing EMoflonEdge typeGraph__tInnerClass____classes = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tPackage__tInnerClass____classes = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge typeGraph__tInnerClass____allTypes = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tInnerClass__typeGraph____model = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge tOuterClass__tInnerClass____innerTypes = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge tInnerClass__tOuterClass____outerType = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge tPackage__tInnerClass____allTypes = (EMoflonEdge) result4_green[11];
			//nothing EMoflonEdge tInnerClass__tPackage____package = (EMoflonEdge) result4_green[12];

			Object[] result5_black = ClassInnerAnonClassMemberImpl
					.pattern_ClassInnerAnonClassMember_10_5_collectcontextelements_blackBBBBB(match, tPackage,
							typeGraph, tOuterClass, tInnerClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tPackage] = " + tPackage + ", " + "[typeGraph] = " + typeGraph + ", " + "[tOuterClass] = "
						+ tOuterClass + ", " + "[tInnerClass] = " + tInnerClass + ".");
			}
			ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_10_5_collectcontextelements_greenBBBBFFFF(
					match, tPackage, typeGraph, tOuterClass);
			//nothing EMoflonEdge tOuterClass__typeGraph____model = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge typeGraph__tOuterClass____allTypes = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge tOuterClass__tPackage____package = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge tPackage__tOuterClass____allTypes = (EMoflonEdge) result5_green[7];

			// 
			ClassInnerAnonClassMemberImpl
					.pattern_ClassInnerAnonClassMember_10_6_registerobjectstomatch_expressionBBBBBB(this, match,
							tPackage, typeGraph, tOuterClass, tInnerClass);
			return ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_10_7_expressionF();
		} else {
			return ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TPackage tPackage = (TPackage) result1_bindingAndBlack[0];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[1];
		AnonymousClassDeclaration eOuterClass = (AnonymousClassDeclaration) result1_bindingAndBlack[2];
		TClass tOuterClass = (TClass) result1_bindingAndBlack[3];
		MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) result1_bindingAndBlack[4];
		TClass tInnerClass = (TClass) result1_bindingAndBlack[5];
		AnonymousClassDeclarationToTClass eOuterClassToTOuterClass = (AnonymousClassDeclarationToTClass) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_11_1_performtransformation_greenFFFBBB(mDefinition, tInnerClass,
						csp);
		ASTNodeToTAnnotatable astNodeToAnnotatable = (ASTNodeToTAnnotatable) result1_green[0];
		TypeToTAbstractType tInnerTypeToTInnerAbstractType = (TypeToTAbstractType) result1_green[1];
		MClass mInnerClass = (MClass) result1_green[2];

		Object[] result2_black = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_11_2_collecttranslatedelements_blackBBBB(astNodeToAnnotatable,
						tInnerTypeToTInnerAbstractType, mInnerClass, tInnerClass);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[astNodeToAnnotatable] = " + astNodeToAnnotatable
							+ ", " + "[tInnerTypeToTInnerAbstractType] = " + tInnerTypeToTInnerAbstractType + ", "
							+ "[mInnerClass] = " + mInnerClass + ", " + "[tInnerClass] = " + tInnerClass + ".");
		}
		Object[] result2_green = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_11_2_collecttranslatedelements_greenFBBBB(astNodeToAnnotatable,
						tInnerTypeToTInnerAbstractType, mInnerClass, tInnerClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_11_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult,
						astNodeToAnnotatable, tInnerTypeToTInnerAbstractType, tPackage, mInnerClass, typeGraph,
						eOuterClass, tOuterClass, mDefinition, tInnerClass, eOuterClassToTOuterClass);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[astNodeToAnnotatable] = " + astNodeToAnnotatable + ", "
					+ "[tInnerTypeToTInnerAbstractType] = " + tInnerTypeToTInnerAbstractType + ", " + "[tPackage] = "
					+ tPackage + ", " + "[mInnerClass] = " + mInnerClass + ", " + "[typeGraph] = " + typeGraph + ", "
					+ "[eOuterClass] = " + eOuterClass + ", " + "[tOuterClass] = " + tOuterClass + ", "
					+ "[mDefinition] = " + mDefinition + ", " + "[tInnerClass] = " + tInnerClass + ", "
					+ "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ".");
		}
		ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFFF(ruleresult,
						astNodeToAnnotatable, tInnerTypeToTInnerAbstractType, tPackage, mInnerClass, typeGraph,
						tOuterClass, mDefinition, tInnerClass);
		//nothing EMoflonEdge astNodeToAnnotatable__tInnerClass____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge typeGraph__tInnerClass____classes = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tInnerTypeToTInnerAbstractType__mInnerClass____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge astNodeToAnnotatable__mInnerClass____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tInnerTypeToTInnerAbstractType__tInnerClass____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tPackage__tInnerClass____classes = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge typeGraph__tInnerClass____allTypes = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tInnerClass__typeGraph____model = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tOuterClass__tInnerClass____innerTypes = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tInnerClass__tOuterClass____outerType = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tPackage__tInnerClass____allTypes = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge tInnerClass__tPackage____package = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge mDefinition__mInnerClass____mInnerTypes = (EMoflonEdge) result3_green[21];

		// 
		// 
		ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_11_5_registerobjects_expressionBBBBBBBBBBBB(
				this, ruleresult, astNodeToAnnotatable, tInnerTypeToTInnerAbstractType, tPackage, mInnerClass,
				typeGraph, eOuterClass, tOuterClass, mDefinition, tInnerClass, eOuterClassToTOuterClass);
		return ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TPackage tPackage = (TPackage) result2_binding[0];
		TypeGraph typeGraph = (TypeGraph) result2_binding[1];
		TClass tOuterClass = (TClass) result2_binding[2];
		TClass tInnerClass = (TClass) result2_binding[3];
		for (Object[] result2_black : ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_12_2_corematch_blackBBFBBFB(tPackage, typeGraph, tOuterClass,
						tInnerClass, match)) {
			AnonymousClassDeclaration eOuterClass = (AnonymousClassDeclaration) result2_black[2];
			AnonymousClassDeclarationToTClass eOuterClassToTOuterClass = (AnonymousClassDeclarationToTClass) result2_black[5];
			// ForEach 
			for (Object[] result3_black : ClassInnerAnonClassMemberImpl
					.pattern_ClassInnerAnonClassMember_12_3_findcontext_blackBBBBFBB(tPackage, typeGraph, eOuterClass,
							tOuterClass, tInnerClass, eOuterClassToTOuterClass)) {
				MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) result3_black[4];
				Object[] result3_green = ClassInnerAnonClassMemberImpl
						.pattern_ClassInnerAnonClassMember_12_3_findcontext_greenBBBBBBBFFFFFFFFFFFFFFFFF(tPackage,
								typeGraph, eOuterClass, tOuterClass, mDefinition, tInnerClass,
								eOuterClassToTOuterClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge tOuterClass__typeGraph____model = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge typeGraph__tOuterClass____allTypes = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge eOuterClassToTOuterClass__eOuterClass____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge typeGraph__tInnerClass____classes = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eOuterClassToTOuterClass__tOuterClass____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tPackage__tInnerClass____classes = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tOuterClass__tPackage____package = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tPackage__tOuterClass____allTypes = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge typeGraph__tInnerClass____allTypes = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge tInnerClass__typeGraph____model = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge eOuterClass__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mDefinition__eOuterClass____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge tOuterClass__tInnerClass____innerTypes = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge tInnerClass__tOuterClass____outerType = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge tPackage__tInnerClass____allTypes = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge tInnerClass__tPackage____package = (EMoflonEdge) result3_green[23];

				Object[] result4_bindingAndBlack = ClassInnerAnonClassMemberImpl
						.pattern_ClassInnerAnonClassMember_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, tPackage, typeGraph, eOuterClass, tOuterClass, mDefinition,
								tInnerClass, eOuterClassToTOuterClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tPackage] = " + tPackage + ", "
							+ "[typeGraph] = " + typeGraph + ", " + "[eOuterClass] = " + eOuterClass + ", "
							+ "[tOuterClass] = " + tOuterClass + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[tInnerClass] = " + tInnerClass + ", " + "[eOuterClassToTOuterClass] = "
							+ eOuterClassToTOuterClass + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = ClassInnerAnonClassMemberImpl
							.pattern_ClassInnerAnonClassMember_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TPackage tPackage, TypeGraph typeGraph, TClass tOuterClass,
			TClass tInnerClass) {
		match.registerObject("tPackage", tPackage);
		match.registerObject("typeGraph", typeGraph);
		match.registerObject("tOuterClass", tOuterClass);
		match.registerObject("tInnerClass", tInnerClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TPackage tPackage, TypeGraph typeGraph, TClass tOuterClass,
			TClass tInnerClass) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TPackage tPackage, TypeGraph typeGraph,
			AnonymousClassDeclaration eOuterClass, TClass tOuterClass, MAbstractMethodDefinition mDefinition,
			TClass tInnerClass, AnonymousClassDeclarationToTClass eOuterClassToTOuterClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_tInnerClass_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass.tLib", true, csp);
		var_tInnerClass_tLib.setValue(tInnerClass.isTLib());
		var_tInnerClass_tLib.setType("Boolean");
		Variable var_tOuterClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterClass.tName", true, csp);
		var_tOuterClass_tName.setValue(tOuterClass.getTName());
		var_tOuterClass_tName.setType("String");
		Variable var_tInnerClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass.tName", true, csp);
		var_tInnerClass_tName.setValue(tInnerClass.getTName());
		var_tInnerClass_tName.setType("String");

		// Create unbound variables
		Variable var_mInnerClass_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mInnerClass.proxy", csp);
		var_mInnerClass_proxy.setType("Boolean");
		Variable var_mInnerClass_name = CSPFactoryHelper.eINSTANCE.createVariable("mInnerClass.name", csp);
		var_mInnerClass_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Concat concat = new Concat();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(concat);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mInnerClass_proxy, var_tInnerClass_tLib);
		concat.setRuleName("NoRuleName");
		concat.solve(literal0, var_tOuterClass_tName, var_mInnerClass_name, var_tInnerClass_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("eOuterClass", eOuterClass);
		isApplicableMatch.registerObject("tOuterClass", tOuterClass);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tInnerClass", tInnerClass);
		isApplicableMatch.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject astNodeToAnnotatable,
			EObject tInnerTypeToTInnerAbstractType, EObject tPackage, EObject mInnerClass, EObject typeGraph,
			EObject eOuterClass, EObject tOuterClass, EObject mDefinition, EObject tInnerClass,
			EObject eOuterClassToTOuterClass) {
		ruleresult.registerObject("astNodeToAnnotatable", astNodeToAnnotatable);
		ruleresult.registerObject("tInnerTypeToTInnerAbstractType", tInnerTypeToTInnerAbstractType);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("mInnerClass", mInnerClass);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("eOuterClass", eOuterClass);
		ruleresult.registerObject("tOuterClass", tOuterClass);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("tInnerClass", tInnerClass);
		ruleresult.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tInnerClass").eClass())
				.equals("basic.TClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_28(EMoflonEdge _edge_classes) {

		Object[] result1_bindingAndBlack = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_20_2_testcorematchandDECs_blackFFFFB(_edge_classes)) {
			TPackage tPackage = (TPackage) result2_black[0];
			TypeGraph typeGraph = (TypeGraph) result2_black[1];
			TClass tOuterClass = (TClass) result2_black[2];
			TClass tInnerClass = (TClass) result2_black[3];
			Object[] result2_green = ClassInnerAnonClassMemberImpl
					.pattern_ClassInnerAnonClassMember_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ClassInnerAnonClassMemberImpl
					.pattern_ClassInnerAnonClassMember_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, tPackage, typeGraph, tOuterClass, tInnerClass)) {
				// 
				if (ClassInnerAnonClassMemberImpl
						.pattern_ClassInnerAnonClassMember_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ClassInnerAnonClassMemberImpl
							.pattern_ClassInnerAnonClassMember_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_30(EMoflonEdge _edge_mInnerTypes) {

		Object[] result1_bindingAndBlack = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_21_2_testcorematchandDECs_blackFFFB(_edge_mInnerTypes)) {
			MClass mInnerClass = (MClass) result2_black[0];
			AnonymousClassDeclaration eOuterClass = (AnonymousClassDeclaration) result2_black[1];
			MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) result2_black[2];
			Object[] result2_green = ClassInnerAnonClassMemberImpl
					.pattern_ClassInnerAnonClassMember_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ClassInnerAnonClassMemberImpl
					.pattern_ClassInnerAnonClassMember_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, mInnerClass, eOuterClass, mDefinition)) {
				// 
				if (ClassInnerAnonClassMemberImpl
						.pattern_ClassInnerAnonClassMember_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ClassInnerAnonClassMemberImpl
							.pattern_ClassInnerAnonClassMember_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ClassInnerAnonClassMember");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mInnerClass_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mInnerClass", true, csp);
		var_mInnerClass_proxy.setValue(__helper.getValue("mInnerClass", "proxy"));
		var_mInnerClass_proxy.setType("boolean");

		Variable var_tInnerClass_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass", true, csp);
		var_tInnerClass_tLib.setValue(__helper.getValue("tInnerClass", "tLib"));
		var_tInnerClass_tLib.setType("boolean");

		Variable var_mInnerClass_name = CSPFactoryHelper.eINSTANCE.createVariable("mInnerClass", true, csp);
		var_mInnerClass_name.setValue(__helper.getValue("mInnerClass", "name"));
		var_mInnerClass_name.setType("String");

		Variable var_tInnerClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass", true, csp);
		var_tInnerClass_tName.setValue(__helper.getValue("tInnerClass", "tName"));
		var_tInnerClass_tName.setType("String");

		Variable var_tOuterClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterClass", true, csp);
		var_tOuterClass_tName.setValue(__helper.getValue("tOuterClass", "tName"));
		var_tOuterClass_tName.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$");
		var_literal0.setType("");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Concat concat1 = new Concat();
		csp.getConstraints().add(concat1);

		eq0.setRuleName("ClassInnerAnonClassMember");
		eq0.solve(var_mInnerClass_proxy, var_tInnerClass_tLib);

		concat1.setRuleName("ClassInnerAnonClassMember");
		concat1.solve(var_literal0, var_tOuterClass_tName, var_mInnerClass_name, var_tInnerClass_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tInnerClass_tLib.setBound(false);
			var_tInnerClass_tName.setBound(false);
			eq0.solve(var_mInnerClass_proxy, var_tInnerClass_tLib);
			concat1.solve(var_literal0, var_tOuterClass_tName, var_mInnerClass_name, var_tInnerClass_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tInnerClass", "tLib", var_tInnerClass_tLib.getValue());
				__helper.setValue("tInnerClass", "tName", var_tInnerClass_tName.getValue());
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
		ruleResult.setRule("ClassInnerAnonClassMember");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mInnerClass_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mInnerClass", true, csp);
		var_mInnerClass_proxy.setValue(__helper.getValue("mInnerClass", "proxy"));
		var_mInnerClass_proxy.setType("boolean");

		Variable var_tInnerClass_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass", true, csp);
		var_tInnerClass_tLib.setValue(__helper.getValue("tInnerClass", "tLib"));
		var_tInnerClass_tLib.setType("boolean");

		Variable var_mInnerClass_name = CSPFactoryHelper.eINSTANCE.createVariable("mInnerClass", true, csp);
		var_mInnerClass_name.setValue(__helper.getValue("mInnerClass", "name"));
		var_mInnerClass_name.setType("String");

		Variable var_tInnerClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass", true, csp);
		var_tInnerClass_tName.setValue(__helper.getValue("tInnerClass", "tName"));
		var_tInnerClass_tName.setType("String");

		Variable var_tOuterClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterClass", true, csp);
		var_tOuterClass_tName.setValue(__helper.getValue("tOuterClass", "tName"));
		var_tOuterClass_tName.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$");
		var_literal0.setType("");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Concat concat1 = new Concat();
		csp.getConstraints().add(concat1);

		eq0.setRuleName("ClassInnerAnonClassMember");
		eq0.solve(var_mInnerClass_proxy, var_tInnerClass_tLib);

		concat1.setRuleName("ClassInnerAnonClassMember");
		concat1.solve(var_literal0, var_tOuterClass_tName, var_mInnerClass_name, var_tInnerClass_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mInnerClass_proxy.setBound(false);
			var_mInnerClass_name.setBound(false);
			eq0.solve(var_mInnerClass_proxy, var_tInnerClass_tLib);
			concat1.solve(var_literal0, var_tOuterClass_tName, var_mInnerClass_name, var_tInnerClass_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mInnerClass", "proxy", var_mInnerClass_proxy.getValue());
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

		Object[] result1_black = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TPackage tPackage = (TPackage) result2_bindingAndBlack[0];
		MClass mInnerClass = (MClass) result2_bindingAndBlack[1];
		TypeGraph typeGraph = (TypeGraph) result2_bindingAndBlack[2];
		AnonymousClassDeclaration eOuterClass = (AnonymousClassDeclaration) result2_bindingAndBlack[3];
		TClass tOuterClass = (TClass) result2_bindingAndBlack[4];
		MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) result2_bindingAndBlack[5];
		TClass tInnerClass = (TClass) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, tPackage, mInnerClass,
						typeGraph, eOuterClass, tOuterClass, mDefinition, tInnerClass, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tPackage] = " + tPackage + ", " + "[mInnerClass] = " + mInnerClass + ", " + "[typeGraph] = "
					+ typeGraph + ", " + "[eOuterClass] = " + eOuterClass + ", " + "[tOuterClass] = " + tOuterClass
					+ ", " + "[mDefinition] = " + mDefinition + ", " + "[tInnerClass] = " + tInnerClass + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ClassInnerAnonClassMemberImpl
					.pattern_ClassInnerAnonClassMember_24_5_matchcorrcontext_blackBBFBB(eOuterClass, tOuterClass,
							sourceMatch, targetMatch)) {
				AnonymousClassDeclarationToTClass eOuterClassToTOuterClass = (AnonymousClassDeclarationToTClass) result5_black[2];
				Object[] result5_green = ClassInnerAnonClassMemberImpl
						.pattern_ClassInnerAnonClassMember_24_5_matchcorrcontext_greenBBBF(eOuterClassToTOuterClass,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = ClassInnerAnonClassMemberImpl
						.pattern_ClassInnerAnonClassMember_24_6_createcorrespondence_blackBBBBBBBB(tPackage,
								mInnerClass, typeGraph, eOuterClass, tOuterClass, mDefinition, tInnerClass, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tPackage] = " + tPackage
							+ ", " + "[mInnerClass] = " + mInnerClass + ", " + "[typeGraph] = " + typeGraph + ", "
							+ "[eOuterClass] = " + eOuterClass + ", " + "[tOuterClass] = " + tOuterClass + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[tInnerClass] = " + tInnerClass + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_24_6_createcorrespondence_greenFFBBB(
						mInnerClass, tInnerClass, ccMatch);
				//nothing ASTNodeToTAnnotatable astNodeToAnnotatable = (ASTNodeToTAnnotatable) result6_green[0];
				//nothing TypeToTAbstractType tInnerTypeToTInnerAbstractType = (TypeToTAbstractType) result6_green[1];

				Object[] result7_black = ClassInnerAnonClassMemberImpl
						.pattern_ClassInnerAnonClassMember_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TPackage tPackage, MClass mInnerClass, TypeGraph typeGraph,
			AnonymousClassDeclaration eOuterClass, TClass tOuterClass, MAbstractMethodDefinition mDefinition,
			TClass tInnerClass, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_mInnerClass_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mInnerClass.proxy", true, csp);
		var_mInnerClass_proxy.setValue(mInnerClass.isProxy());
		var_mInnerClass_proxy.setType("Boolean");
		Variable var_tInnerClass_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass.tLib", true, csp);
		var_tInnerClass_tLib.setValue(tInnerClass.isTLib());
		var_tInnerClass_tLib.setType("Boolean");
		Variable var_tOuterClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterClass.tName", true, csp);
		var_tOuterClass_tName.setValue(tOuterClass.getTName());
		var_tOuterClass_tName.setType("String");
		Variable var_mInnerClass_name = CSPFactoryHelper.eINSTANCE.createVariable("mInnerClass.name", true, csp);
		var_mInnerClass_name.setValue(mInnerClass.getName());
		var_mInnerClass_name.setType("String");
		Variable var_tInnerClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass.tName", true, csp);
		var_tInnerClass_tName.setValue(tInnerClass.getTName());
		var_tInnerClass_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Concat concat = new Concat();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(concat);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mInnerClass_proxy, var_tInnerClass_tLib);
		concat.setRuleName("NoRuleName");
		concat.solve(literal0, var_tOuterClass_tName, var_mInnerClass_name, var_tInnerClass_tName);
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
	public boolean checkDEC_FWD(MClass mInnerClass, AnonymousClassDeclaration eOuterClass,
			MAbstractMethodDefinition mDefinition) {// 
		Object[] result1_black = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_27_1_matchtggpattern_blackBBB(mInnerClass, eOuterClass, mDefinition);
		if (result1_black != null) {
			return ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_27_2_expressionF();
		} else {
			return ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TPackage tPackage, TypeGraph typeGraph, TClass tOuterClass, TClass tInnerClass) {// 
		Object[] result1_black = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_28_1_matchtggpattern_blackBBBB(tPackage, typeGraph, tOuterClass,
						tInnerClass);
		if (result1_black != null) {
			return ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_28_2_expressionF();
		} else {
			return ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			AnonymousClassDeclarationToTClass eOuterClassToTOuterClassParameter) {

		Object[] result1_black = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ClassInnerAnonClassMemberImpl
				.pattern_ClassInnerAnonClassMember_29_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList eOuterClassToTOuterClassList = (RuleEntryList) result2_black[0];
			TPackage tPackage = (TPackage) result2_black[1];
			TClass tOuterClass = (TClass) result2_black[2];
			TypeGraph typeGraph = (TypeGraph) result2_black[3];
			AnonymousClassDeclarationToTClass eOuterClassToTOuterClass = (AnonymousClassDeclarationToTClass) result2_black[4];
			AnonymousClassDeclaration eOuterClass = (AnonymousClassDeclaration) result2_black[5];
			MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) result2_black[6];

			Object[] result3_bindingAndBlack = ClassInnerAnonClassMemberImpl
					.pattern_ClassInnerAnonClassMember_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							tPackage, typeGraph, eOuterClass, tOuterClass, mDefinition, eOuterClassToTOuterClass,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tPackage] = " + tPackage + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[eOuterClass] = " + eOuterClass + ", "
						+ "[tOuterClass] = " + tOuterClass + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = ClassInnerAnonClassMemberImpl
						.pattern_ClassInnerAnonClassMember_29_5_checknacs_blackBBBBBB(tPackage, typeGraph, eOuterClass,
								tOuterClass, mDefinition, eOuterClassToTOuterClass);
				if (result5_black != null) {

					Object[] result6_black = ClassInnerAnonClassMemberImpl
							.pattern_ClassInnerAnonClassMember_29_6_perform_blackBBBBBBB(tPackage, typeGraph,
									eOuterClass, tOuterClass, mDefinition, eOuterClassToTOuterClass, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tPackage] = "
								+ tPackage + ", " + "[typeGraph] = " + typeGraph + ", " + "[eOuterClass] = "
								+ eOuterClass + ", " + "[tOuterClass] = " + tOuterClass + ", " + "[mDefinition] = "
								+ mDefinition + ", " + "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_29_6_perform_greenFFBFBBBFBB(
							tPackage, typeGraph, tOuterClass, mDefinition, ruleResult, csp);
					//nothing ASTNodeToTAnnotatable astNodeToAnnotatable = (ASTNodeToTAnnotatable) result6_green[0];
					//nothing TypeToTAbstractType tInnerTypeToTInnerAbstractType = (TypeToTAbstractType) result6_green[1];
					//nothing MClass mInnerClass = (MClass) result6_green[3];
					//nothing TClass tInnerClass = (TClass) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return ClassInnerAnonClassMemberImpl.pattern_ClassInnerAnonClassMember_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TPackage tPackage, TypeGraph typeGraph,
			AnonymousClassDeclaration eOuterClass, TClass tOuterClass, MAbstractMethodDefinition mDefinition,
			AnonymousClassDeclarationToTClass eOuterClassToTOuterClass, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_tOuterClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterClass.tName", true, csp);
		var_tOuterClass_tName.setValue(tOuterClass.getTName());
		var_tOuterClass_tName.setType("String");

		// Create unbound variables
		Variable var_mInnerClass_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mInnerClass.proxy", csp);
		var_mInnerClass_proxy.setType("Boolean");
		Variable var_tInnerClass_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass.tLib", csp);
		var_tInnerClass_tLib.setType("Boolean");
		Variable var_mInnerClass_name = CSPFactoryHelper.eINSTANCE.createVariable("mInnerClass.name", csp);
		var_mInnerClass_name.setType("String");
		Variable var_tInnerClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass.tName", csp);
		var_tInnerClass_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Concat concat = new Concat();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(concat);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mInnerClass_proxy, var_tInnerClass_tLib);
		concat.setRuleName("NoRuleName");
		concat.solve(literal0, var_tOuterClass_tName, var_mInnerClass_name, var_tInnerClass_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("eOuterClass", eOuterClass);
		isApplicableMatch.registerObject("tOuterClass", tOuterClass);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
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
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___IS_APPROPRIATE_FWD__MATCH_MCLASS_ANONYMOUSCLASSDECLARATION_MABSTRACTMETHODDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (MClass) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2), (MAbstractMethodDefinition) arguments.get(3));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MCLASS_ANONYMOUSCLASSDECLARATION_MABSTRACTMETHODDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MClass) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2), (MAbstractMethodDefinition) arguments.get(3));
			return null;
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MCLASS_ANONYMOUSCLASSDECLARATION_MABSTRACTMETHODDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MClass) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2), (MAbstractMethodDefinition) arguments.get(3));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TPACKAGE_MCLASS_TYPEGRAPH_ANONYMOUSCLASSDECLARATION_TCLASS_MABSTRACTMETHODDEFINITION_ANONYMOUSCLASSDECLARATIONTOTCLASS:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TPackage) arguments.get(1),
					(MClass) arguments.get(2), (TypeGraph) arguments.get(3),
					(AnonymousClassDeclaration) arguments.get(4), (TClass) arguments.get(5),
					(MAbstractMethodDefinition) arguments.get(6), (AnonymousClassDeclarationToTClass) arguments.get(7));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___IS_APPROPRIATE_BWD__MATCH_TPACKAGE_TYPEGRAPH_TCLASS_TCLASS:
			return isAppropriate_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2), (TClass) arguments.get(3), (TClass) arguments.get(4));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPACKAGE_TYPEGRAPH_TCLASS_TCLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2), (TClass) arguments.get(3), (TClass) arguments.get(4));
			return null;
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPACKAGE_TYPEGRAPH_TCLASS_TCLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2), (TClass) arguments.get(3), (TClass) arguments.get(4));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TPACKAGE_TYPEGRAPH_ANONYMOUSCLASSDECLARATION_TCLASS_MABSTRACTMETHODDEFINITION_TCLASS_ANONYMOUSCLASSDECLARATIONTOTCLASS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2), (AnonymousClassDeclaration) arguments.get(3),
					(TClass) arguments.get(4), (MAbstractMethodDefinition) arguments.get(5), (TClass) arguments.get(6),
					(AnonymousClassDeclarationToTClass) arguments.get(7));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___IS_APPROPRIATE_BWD_EMOFLON_EDGE_28__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_28((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_30__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_30((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___IS_APPLICABLE_SOLVE_CSP_CC__TPACKAGE_MCLASS_TYPEGRAPH_ANONYMOUSCLASSDECLARATION_TCLASS_MABSTRACTMETHODDEFINITION_TCLASS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TPackage) arguments.get(0), (MClass) arguments.get(1),
					(TypeGraph) arguments.get(2), (AnonymousClassDeclaration) arguments.get(3),
					(TClass) arguments.get(4), (MAbstractMethodDefinition) arguments.get(5), (TClass) arguments.get(6),
					(Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___CHECK_DEC_FWD__MCLASS_ANONYMOUSCLASSDECLARATION_MABSTRACTMETHODDEFINITION:
			return checkDEC_FWD((MClass) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(MAbstractMethodDefinition) arguments.get(2));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___CHECK_DEC_BWD__TPACKAGE_TYPEGRAPH_TCLASS_TCLASS:
			return checkDEC_BWD((TPackage) arguments.get(0), (TypeGraph) arguments.get(1), (TClass) arguments.get(2),
					(TClass) arguments.get(3));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___GENERATE_MODEL__RULEENTRYCONTAINER_ANONYMOUSCLASSDECLARATIONTOTCLASS:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(AnonymousClassDeclarationToTClass) arguments.get(1));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TPACKAGE_TYPEGRAPH_ANONYMOUSCLASSDECLARATION_TCLASS_MABSTRACTMETHODDEFINITION_ANONYMOUSCLASSDECLARATIONTOTCLASS_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2), (AnonymousClassDeclaration) arguments.get(3),
					(TClass) arguments.get(4), (MAbstractMethodDefinition) arguments.get(5),
					(AnonymousClassDeclarationToTClass) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_0_1_initialbindings_blackBBBBB(
			ClassInnerAnonClassMember _this, Match match, MClass mInnerClass, AnonymousClassDeclaration eOuterClass,
			MAbstractMethodDefinition mDefinition) {
		return new Object[] { _this, match, mInnerClass, eOuterClass, mDefinition };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_0_2_SolveCSP_bindingFBBBBB(
			ClassInnerAnonClassMember _this, Match match, MClass mInnerClass, AnonymousClassDeclaration eOuterClass,
			MAbstractMethodDefinition mDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mInnerClass, eOuterClass, mDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mInnerClass, eOuterClass, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_0_2_SolveCSP_bindingAndBlackFBBBBB(
			ClassInnerAnonClassMember _this, Match match, MClass mInnerClass, AnonymousClassDeclaration eOuterClass,
			MAbstractMethodDefinition mDefinition) {
		Object[] result_pattern_ClassInnerAnonClassMember_0_2_SolveCSP_binding = pattern_ClassInnerAnonClassMember_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mInnerClass, eOuterClass, mDefinition);
		if (result_pattern_ClassInnerAnonClassMember_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerAnonClassMember_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassInnerAnonClassMember_0_2_SolveCSP_black = pattern_ClassInnerAnonClassMember_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassInnerAnonClassMember_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mInnerClass, eOuterClass, mDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerAnonClassMember_0_3_CheckCSP_expressionFBB(
			ClassInnerAnonClassMember _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_0_4_collectelementstobetranslated_blackBBBB(
			Match match, MClass mInnerClass, AnonymousClassDeclaration eOuterClass,
			MAbstractMethodDefinition mDefinition) {
		return new Object[] { match, mInnerClass, eOuterClass, mDefinition };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_0_4_collectelementstobetranslated_greenBBBF(
			Match match, MClass mInnerClass, MAbstractMethodDefinition mDefinition) {
		EMoflonEdge mDefinition__mInnerClass____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mInnerClass);
		String mDefinition__mInnerClass____mInnerTypes_name_prime = "mInnerTypes";
		mDefinition__mInnerClass____mInnerTypes.setSrc(mDefinition);
		mDefinition__mInnerClass____mInnerTypes.setTrg(mInnerClass);
		match.getToBeTranslatedEdges().add(mDefinition__mInnerClass____mInnerTypes);
		mDefinition__mInnerClass____mInnerTypes.setName(mDefinition__mInnerClass____mInnerTypes_name_prime);
		return new Object[] { match, mInnerClass, mDefinition, mDefinition__mInnerClass____mInnerTypes };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_0_5_collectcontextelements_blackBBBB(Match match,
			MClass mInnerClass, AnonymousClassDeclaration eOuterClass, MAbstractMethodDefinition mDefinition) {
		return new Object[] { match, mInnerClass, eOuterClass, mDefinition };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_0_5_collectcontextelements_greenBBBFF(Match match,
			AnonymousClassDeclaration eOuterClass, MAbstractMethodDefinition mDefinition) {
		EMoflonEdge eOuterClass__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__eOuterClass____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(eOuterClass);
		match.getContextNodes().add(mDefinition);
		String eOuterClass__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__eOuterClass____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		eOuterClass__mDefinition____bodyDeclarations.setSrc(eOuterClass);
		eOuterClass__mDefinition____bodyDeclarations.setTrg(mDefinition);
		match.getContextEdges().add(eOuterClass__mDefinition____bodyDeclarations);
		mDefinition__eOuterClass____anonymousClassDeclarationOwner.setSrc(mDefinition);
		mDefinition__eOuterClass____anonymousClassDeclarationOwner.setTrg(eOuterClass);
		match.getContextEdges().add(mDefinition__eOuterClass____anonymousClassDeclarationOwner);
		eOuterClass__mDefinition____bodyDeclarations.setName(eOuterClass__mDefinition____bodyDeclarations_name_prime);
		mDefinition__eOuterClass____anonymousClassDeclarationOwner
				.setName(mDefinition__eOuterClass____anonymousClassDeclarationOwner_name_prime);
		return new Object[] { match, eOuterClass, mDefinition, eOuterClass__mDefinition____bodyDeclarations,
				mDefinition__eOuterClass____anonymousClassDeclarationOwner };
	}

	public static final void pattern_ClassInnerAnonClassMember_0_6_registerobjectstomatch_expressionBBBBB(
			ClassInnerAnonClassMember _this, Match match, MClass mInnerClass, AnonymousClassDeclaration eOuterClass,
			MAbstractMethodDefinition mDefinition) {
		_this.registerObjectsToMatch_FWD(match, mInnerClass, eOuterClass, mDefinition);

	}

	public static final boolean pattern_ClassInnerAnonClassMember_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassInnerAnonClassMember_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("mInnerClass");
		EObject _localVariable_2 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_3 = isApplicableMatch.getObject("eOuterClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("tOuterClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_6 = isApplicableMatch.getObject("eOuterClassToTOuterClass");
		EObject tmpTPackage = _localVariable_0;
		EObject tmpMInnerClass = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpEOuterClass = _localVariable_3;
		EObject tmpTOuterClass = _localVariable_4;
		EObject tmpMDefinition = _localVariable_5;
		EObject tmpEOuterClassToTOuterClass = _localVariable_6;
		if (tmpTPackage instanceof TPackage) {
			TPackage tPackage = (TPackage) tmpTPackage;
			if (tmpMInnerClass instanceof MClass) {
				MClass mInnerClass = (MClass) tmpMInnerClass;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					if (tmpEOuterClass instanceof AnonymousClassDeclaration) {
						AnonymousClassDeclaration eOuterClass = (AnonymousClassDeclaration) tmpEOuterClass;
						if (tmpTOuterClass instanceof TClass) {
							TClass tOuterClass = (TClass) tmpTOuterClass;
							if (tmpMDefinition instanceof MAbstractMethodDefinition) {
								MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) tmpMDefinition;
								if (tmpEOuterClassToTOuterClass instanceof AnonymousClassDeclarationToTClass) {
									AnonymousClassDeclarationToTClass eOuterClassToTOuterClass = (AnonymousClassDeclarationToTClass) tmpEOuterClassToTOuterClass;
									return new Object[] { tPackage, mInnerClass, typeGraph, eOuterClass, tOuterClass,
											mDefinition, eOuterClassToTOuterClass, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_1_1_performtransformation_blackBBBBBBBFBB(
			TPackage tPackage, MClass mInnerClass, TypeGraph typeGraph, AnonymousClassDeclaration eOuterClass,
			TClass tOuterClass, MAbstractMethodDefinition mDefinition,
			AnonymousClassDeclarationToTClass eOuterClassToTOuterClass, ClassInnerAnonClassMember _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tPackage, mInnerClass, typeGraph, eOuterClass, tOuterClass, mDefinition,
						eOuterClassToTOuterClass, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			ClassInnerAnonClassMember _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassInnerAnonClassMember_1_1_performtransformation_binding = pattern_ClassInnerAnonClassMember_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ClassInnerAnonClassMember_1_1_performtransformation_binding != null) {
			TPackage tPackage = (TPackage) result_pattern_ClassInnerAnonClassMember_1_1_performtransformation_binding[0];
			MClass mInnerClass = (MClass) result_pattern_ClassInnerAnonClassMember_1_1_performtransformation_binding[1];
			TypeGraph typeGraph = (TypeGraph) result_pattern_ClassInnerAnonClassMember_1_1_performtransformation_binding[2];
			AnonymousClassDeclaration eOuterClass = (AnonymousClassDeclaration) result_pattern_ClassInnerAnonClassMember_1_1_performtransformation_binding[3];
			TClass tOuterClass = (TClass) result_pattern_ClassInnerAnonClassMember_1_1_performtransformation_binding[4];
			MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) result_pattern_ClassInnerAnonClassMember_1_1_performtransformation_binding[5];
			AnonymousClassDeclarationToTClass eOuterClassToTOuterClass = (AnonymousClassDeclarationToTClass) result_pattern_ClassInnerAnonClassMember_1_1_performtransformation_binding[6];

			Object[] result_pattern_ClassInnerAnonClassMember_1_1_performtransformation_black = pattern_ClassInnerAnonClassMember_1_1_performtransformation_blackBBBBBBBFBB(
					tPackage, mInnerClass, typeGraph, eOuterClass, tOuterClass, mDefinition, eOuterClassToTOuterClass,
					_this, isApplicableMatch);
			if (result_pattern_ClassInnerAnonClassMember_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassInnerAnonClassMember_1_1_performtransformation_black[7];

				return new Object[] { tPackage, mInnerClass, typeGraph, eOuterClass, tOuterClass, mDefinition,
						eOuterClassToTOuterClass, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_1_1_performtransformation_greenFFBBBBFB(
			TPackage tPackage, MClass mInnerClass, TypeGraph typeGraph, TClass tOuterClass, CSP csp) {
		ASTNodeToTAnnotatable astNodeToAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeToTAbstractType tInnerTypeToTInnerAbstractType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		TClass tInnerClass = BasicFactory.eINSTANCE.createTClass();
		Object _localVariable_0 = csp.getValue("tInnerClass", "tLib");
		Object _localVariable_1 = csp.getValue("tInnerClass", "tName");
		astNodeToAnnotatable.setSource(mInnerClass);
		tInnerTypeToTInnerAbstractType.setSource(mInnerClass);
		astNodeToAnnotatable.setTarget(tInnerClass);
		typeGraph.getClasses().add(tInnerClass);
		tInnerTypeToTInnerAbstractType.setTarget(tInnerClass);
		tPackage.getClasses().add(tInnerClass);
		typeGraph.getAllTypes().add(tInnerClass);
		tOuterClass.getInnerTypes().add(tInnerClass);
		tPackage.getAllTypes().add(tInnerClass);
		boolean tInnerClass_tLib_prime = (boolean) _localVariable_0;
		String tInnerClass_tName_prime = (String) _localVariable_1;
		tInnerClass.setTLib(Boolean.valueOf(tInnerClass_tLib_prime));
		tInnerClass.setTName(tInnerClass_tName_prime);
		return new Object[] { astNodeToAnnotatable, tInnerTypeToTInnerAbstractType, tPackage, mInnerClass, typeGraph,
				tOuterClass, tInnerClass, csp };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_1_2_collecttranslatedelements_blackBBBB(
			ASTNodeToTAnnotatable astNodeToAnnotatable, TypeToTAbstractType tInnerTypeToTInnerAbstractType,
			MClass mInnerClass, TClass tInnerClass) {
		return new Object[] { astNodeToAnnotatable, tInnerTypeToTInnerAbstractType, mInnerClass, tInnerClass };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_1_2_collecttranslatedelements_greenFBBBB(
			ASTNodeToTAnnotatable astNodeToAnnotatable, TypeToTAbstractType tInnerTypeToTInnerAbstractType,
			MClass mInnerClass, TClass tInnerClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(astNodeToAnnotatable);
		ruleresult.getCreatedLinkElements().add(tInnerTypeToTInnerAbstractType);
		ruleresult.getTranslatedElements().add(mInnerClass);
		ruleresult.getCreatedElements().add(tInnerClass);
		return new Object[] { ruleresult, astNodeToAnnotatable, tInnerTypeToTInnerAbstractType, mInnerClass,
				tInnerClass };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject astNodeToAnnotatable, EObject tInnerTypeToTInnerAbstractType,
			EObject tPackage, EObject mInnerClass, EObject typeGraph, EObject eOuterClass, EObject tOuterClass,
			EObject mDefinition, EObject tInnerClass, EObject eOuterClassToTOuterClass) {
		if (!astNodeToAnnotatable.equals(tInnerTypeToTInnerAbstractType)) {
			if (!astNodeToAnnotatable.equals(tPackage)) {
				if (!astNodeToAnnotatable.equals(mInnerClass)) {
					if (!astNodeToAnnotatable.equals(typeGraph)) {
						if (!astNodeToAnnotatable.equals(eOuterClass)) {
							if (!astNodeToAnnotatable.equals(tOuterClass)) {
								if (!astNodeToAnnotatable.equals(mDefinition)) {
									if (!astNodeToAnnotatable.equals(tInnerClass)) {
										if (!astNodeToAnnotatable.equals(eOuterClassToTOuterClass)) {
											if (!tInnerTypeToTInnerAbstractType.equals(tPackage)) {
												if (!tInnerTypeToTInnerAbstractType.equals(typeGraph)) {
													if (!tInnerTypeToTInnerAbstractType.equals(tOuterClass)) {
														if (!tPackage.equals(typeGraph)) {
															if (!mInnerClass.equals(tInnerTypeToTInnerAbstractType)) {
																if (!mInnerClass.equals(tPackage)) {
																	if (!mInnerClass.equals(typeGraph)) {
																		if (!mInnerClass.equals(tOuterClass)) {
																			if (!mInnerClass.equals(tInnerClass)) {
																				if (!eOuterClass.equals(
																						tInnerTypeToTInnerAbstractType)) {
																					if (!eOuterClass.equals(tPackage)) {
																						if (!eOuterClass
																								.equals(mInnerClass)) {
																							if (!eOuterClass.equals(
																									typeGraph)) {
																								if (!eOuterClass.equals(
																										tOuterClass)) {
																									if (!eOuterClass
																											.equals(mDefinition)) {
																										if (!eOuterClass
																												.equals(tInnerClass)) {
																											if (!eOuterClass
																													.equals(eOuterClassToTOuterClass)) {
																												if (!tOuterClass
																														.equals(tPackage)) {
																													if (!tOuterClass
																															.equals(typeGraph)) {
																														if (!mDefinition
																																.equals(tInnerTypeToTInnerAbstractType)) {
																															if (!mDefinition
																																	.equals(tPackage)) {
																																if (!mDefinition
																																		.equals(mInnerClass)) {
																																	if (!mDefinition
																																			.equals(typeGraph)) {
																																		if (!mDefinition
																																				.equals(tOuterClass)) {
																																			if (!mDefinition
																																					.equals(tInnerClass)) {
																																				if (!tInnerClass
																																						.equals(tInnerTypeToTInnerAbstractType)) {
																																					if (!tInnerClass
																																							.equals(tPackage)) {
																																						if (!tInnerClass
																																								.equals(typeGraph)) {
																																							if (!tInnerClass
																																									.equals(tOuterClass)) {
																																								if (!eOuterClassToTOuterClass
																																										.equals(tInnerTypeToTInnerAbstractType)) {
																																									if (!eOuterClassToTOuterClass
																																											.equals(tPackage)) {
																																										if (!eOuterClassToTOuterClass
																																												.equals(mInnerClass)) {
																																											if (!eOuterClassToTOuterClass
																																													.equals(typeGraph)) {
																																												if (!eOuterClassToTOuterClass
																																														.equals(tOuterClass)) {
																																													if (!eOuterClassToTOuterClass
																																															.equals(mDefinition)) {
																																														if (!eOuterClassToTOuterClass
																																																.equals(tInnerClass)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	astNodeToAnnotatable,
																																																	tInnerTypeToTInnerAbstractType,
																																																	tPackage,
																																																	mInnerClass,
																																																	typeGraph,
																																																	eOuterClass,
																																																	tOuterClass,
																																																	mDefinition,
																																																	tInnerClass,
																																																	eOuterClassToTOuterClass };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ClassInnerAnonClassMember_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject astNodeToAnnotatable, EObject tInnerTypeToTInnerAbstractType,
			EObject tPackage, EObject mInnerClass, EObject typeGraph, EObject tOuterClass, EObject mDefinition,
			EObject tInnerClass) {
		EMoflonEdge astNodeToAnnotatable__tInnerClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerTypeToTInnerAbstractType__mInnerClass____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge astNodeToAnnotatable__mInnerClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerTypeToTInnerAbstractType__tInnerClass____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tPackage__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tInnerClass____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tOuterClass____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tInnerClass____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mInnerClass____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassInnerAnonClassMember";
		String astNodeToAnnotatable__tInnerClass____target_name_prime = "target";
		String typeGraph__tInnerClass____classes_name_prime = "classes";
		String tInnerTypeToTInnerAbstractType__mInnerClass____source_name_prime = "source";
		String astNodeToAnnotatable__mInnerClass____source_name_prime = "source";
		String tInnerTypeToTInnerAbstractType__tInnerClass____target_name_prime = "target";
		String tPackage__tInnerClass____classes_name_prime = "classes";
		String typeGraph__tInnerClass____allTypes_name_prime = "allTypes";
		String tInnerClass__typeGraph____model_name_prime = "model";
		String tOuterClass__tInnerClass____innerTypes_name_prime = "innerTypes";
		String tInnerClass__tOuterClass____outerType_name_prime = "outerType";
		String tPackage__tInnerClass____allTypes_name_prime = "allTypes";
		String tInnerClass__tPackage____package_name_prime = "package";
		String mDefinition__mInnerClass____mInnerTypes_name_prime = "mInnerTypes";
		astNodeToAnnotatable__tInnerClass____target.setSrc(astNodeToAnnotatable);
		astNodeToAnnotatable__tInnerClass____target.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(astNodeToAnnotatable__tInnerClass____target);
		typeGraph__tInnerClass____classes.setSrc(typeGraph);
		typeGraph__tInnerClass____classes.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(typeGraph__tInnerClass____classes);
		tInnerTypeToTInnerAbstractType__mInnerClass____source.setSrc(tInnerTypeToTInnerAbstractType);
		tInnerTypeToTInnerAbstractType__mInnerClass____source.setTrg(mInnerClass);
		ruleresult.getCreatedEdges().add(tInnerTypeToTInnerAbstractType__mInnerClass____source);
		astNodeToAnnotatable__mInnerClass____source.setSrc(astNodeToAnnotatable);
		astNodeToAnnotatable__mInnerClass____source.setTrg(mInnerClass);
		ruleresult.getCreatedEdges().add(astNodeToAnnotatable__mInnerClass____source);
		tInnerTypeToTInnerAbstractType__tInnerClass____target.setSrc(tInnerTypeToTInnerAbstractType);
		tInnerTypeToTInnerAbstractType__tInnerClass____target.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(tInnerTypeToTInnerAbstractType__tInnerClass____target);
		tPackage__tInnerClass____classes.setSrc(tPackage);
		tPackage__tInnerClass____classes.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(tPackage__tInnerClass____classes);
		typeGraph__tInnerClass____allTypes.setSrc(typeGraph);
		typeGraph__tInnerClass____allTypes.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(typeGraph__tInnerClass____allTypes);
		tInnerClass__typeGraph____model.setSrc(tInnerClass);
		tInnerClass__typeGraph____model.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(tInnerClass__typeGraph____model);
		tOuterClass__tInnerClass____innerTypes.setSrc(tOuterClass);
		tOuterClass__tInnerClass____innerTypes.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(tOuterClass__tInnerClass____innerTypes);
		tInnerClass__tOuterClass____outerType.setSrc(tInnerClass);
		tInnerClass__tOuterClass____outerType.setTrg(tOuterClass);
		ruleresult.getCreatedEdges().add(tInnerClass__tOuterClass____outerType);
		tPackage__tInnerClass____allTypes.setSrc(tPackage);
		tPackage__tInnerClass____allTypes.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(tPackage__tInnerClass____allTypes);
		tInnerClass__tPackage____package.setSrc(tInnerClass);
		tInnerClass__tPackage____package.setTrg(tPackage);
		ruleresult.getCreatedEdges().add(tInnerClass__tPackage____package);
		mDefinition__mInnerClass____mInnerTypes.setSrc(mDefinition);
		mDefinition__mInnerClass____mInnerTypes.setTrg(mInnerClass);
		ruleresult.getTranslatedEdges().add(mDefinition__mInnerClass____mInnerTypes);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		astNodeToAnnotatable__tInnerClass____target.setName(astNodeToAnnotatable__tInnerClass____target_name_prime);
		typeGraph__tInnerClass____classes.setName(typeGraph__tInnerClass____classes_name_prime);
		tInnerTypeToTInnerAbstractType__mInnerClass____source
				.setName(tInnerTypeToTInnerAbstractType__mInnerClass____source_name_prime);
		astNodeToAnnotatable__mInnerClass____source.setName(astNodeToAnnotatable__mInnerClass____source_name_prime);
		tInnerTypeToTInnerAbstractType__tInnerClass____target
				.setName(tInnerTypeToTInnerAbstractType__tInnerClass____target_name_prime);
		tPackage__tInnerClass____classes.setName(tPackage__tInnerClass____classes_name_prime);
		typeGraph__tInnerClass____allTypes.setName(typeGraph__tInnerClass____allTypes_name_prime);
		tInnerClass__typeGraph____model.setName(tInnerClass__typeGraph____model_name_prime);
		tOuterClass__tInnerClass____innerTypes.setName(tOuterClass__tInnerClass____innerTypes_name_prime);
		tInnerClass__tOuterClass____outerType.setName(tInnerClass__tOuterClass____outerType_name_prime);
		tPackage__tInnerClass____allTypes.setName(tPackage__tInnerClass____allTypes_name_prime);
		tInnerClass__tPackage____package.setName(tInnerClass__tPackage____package_name_prime);
		mDefinition__mInnerClass____mInnerTypes.setName(mDefinition__mInnerClass____mInnerTypes_name_prime);
		return new Object[] { ruleresult, astNodeToAnnotatable, tInnerTypeToTInnerAbstractType, tPackage, mInnerClass,
				typeGraph, tOuterClass, mDefinition, tInnerClass, astNodeToAnnotatable__tInnerClass____target,
				typeGraph__tInnerClass____classes, tInnerTypeToTInnerAbstractType__mInnerClass____source,
				astNodeToAnnotatable__mInnerClass____source, tInnerTypeToTInnerAbstractType__tInnerClass____target,
				tPackage__tInnerClass____classes, typeGraph__tInnerClass____allTypes, tInnerClass__typeGraph____model,
				tOuterClass__tInnerClass____innerTypes, tInnerClass__tOuterClass____outerType,
				tPackage__tInnerClass____allTypes, tInnerClass__tPackage____package,
				mDefinition__mInnerClass____mInnerTypes };
	}

	public static final void pattern_ClassInnerAnonClassMember_1_5_registerobjects_expressionBBBBBBBBBBBB(
			ClassInnerAnonClassMember _this, PerformRuleResult ruleresult, EObject astNodeToAnnotatable,
			EObject tInnerTypeToTInnerAbstractType, EObject tPackage, EObject mInnerClass, EObject typeGraph,
			EObject eOuterClass, EObject tOuterClass, EObject mDefinition, EObject tInnerClass,
			EObject eOuterClassToTOuterClass) {
		_this.registerObjects_FWD(ruleresult, astNodeToAnnotatable, tInnerTypeToTInnerAbstractType, tPackage,
				mInnerClass, typeGraph, eOuterClass, tOuterClass, mDefinition, tInnerClass, eOuterClassToTOuterClass);

	}

	public static final PerformRuleResult pattern_ClassInnerAnonClassMember_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_2_1_preparereturnvalue_bindingFB(
			ClassInnerAnonClassMember _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ClassInnerAnonClassMember _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_2_1_preparereturnvalue_bindingAndBlackFFB(
			ClassInnerAnonClassMember _this) {
		Object[] result_pattern_ClassInnerAnonClassMember_2_1_preparereturnvalue_binding = pattern_ClassInnerAnonClassMember_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassInnerAnonClassMember_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassInnerAnonClassMember_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassInnerAnonClassMember_2_1_preparereturnvalue_black = pattern_ClassInnerAnonClassMember_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassInnerAnonClassMember_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassInnerAnonClassMember_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ClassInnerAnonClassMember";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mInnerClass");
		EObject _localVariable_1 = match.getObject("eOuterClass");
		EObject _localVariable_2 = match.getObject("mDefinition");
		EObject tmpMInnerClass = _localVariable_0;
		EObject tmpEOuterClass = _localVariable_1;
		EObject tmpMDefinition = _localVariable_2;
		if (tmpMInnerClass instanceof MClass) {
			MClass mInnerClass = (MClass) tmpMInnerClass;
			if (tmpEOuterClass instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration eOuterClass = (AnonymousClassDeclaration) tmpEOuterClass;
				if (tmpMDefinition instanceof MAbstractMethodDefinition) {
					MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) tmpMDefinition;
					return new Object[] { mInnerClass, eOuterClass, mDefinition, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInnerAnonClassMember_2_2_corematch_blackBBFBFB(
			MClass mInnerClass, AnonymousClassDeclaration eOuterClass, MAbstractMethodDefinition mDefinition,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (AnonymousClassDeclarationToTClass eOuterClassToTOuterClass : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eOuterClass, AnonymousClassDeclarationToTClass.class, "source")) {
			TClass tOuterClass = eOuterClassToTOuterClass.getTarget();
			if (tOuterClass != null) {
				_result.add(new Object[] { mInnerClass, eOuterClass, tOuterClass, mDefinition, eOuterClassToTOuterClass,
						match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassInnerAnonClassMember_2_3_findcontext_blackFBFBBBB(
			MClass mInnerClass, AnonymousClassDeclaration eOuterClass, TClass tOuterClass,
			MAbstractMethodDefinition mDefinition, AnonymousClassDeclarationToTClass eOuterClassToTOuterClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (eOuterClass.equals(eOuterClassToTOuterClass.getSource())) {
			if (tOuterClass.equals(eOuterClassToTOuterClass.getTarget())) {
				if (eOuterClass.getBodyDeclarations().contains(mDefinition)) {
					if (mDefinition.getMInnerTypes().contains(mInnerClass)) {
						TypeGraph typeGraph = tOuterClass.getModel();
						if (typeGraph != null) {
							TPackage tPackage = tOuterClass.getPackage();
							if (tPackage != null) {
								_result.add(new Object[] { tPackage, mInnerClass, typeGraph, eOuterClass, tOuterClass,
										mDefinition, eOuterClassToTOuterClass });
							}

						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_2_3_findcontext_greenBBBBBBBFFFFFFFFFF(
			TPackage tPackage, MClass mInnerClass, TypeGraph typeGraph, AnonymousClassDeclaration eOuterClass,
			TClass tOuterClass, MAbstractMethodDefinition mDefinition,
			AnonymousClassDeclarationToTClass eOuterClassToTOuterClass) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tOuterClass__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterClass____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClassToTOuterClass__eOuterClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClassToTOuterClass__tOuterClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tOuterClass____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClass__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__eOuterClass____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mDefinition__mInnerClass____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tOuterClass__typeGraph____model_name_prime = "model";
		String typeGraph__tOuterClass____allTypes_name_prime = "allTypes";
		String eOuterClassToTOuterClass__eOuterClass____source_name_prime = "source";
		String eOuterClassToTOuterClass__tOuterClass____target_name_prime = "target";
		String tOuterClass__tPackage____package_name_prime = "package";
		String tPackage__tOuterClass____allTypes_name_prime = "allTypes";
		String eOuterClass__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__eOuterClass____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		String mDefinition__mInnerClass____mInnerTypes_name_prime = "mInnerTypes";
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(mInnerClass);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(eOuterClass);
		isApplicableMatch.getAllContextElements().add(tOuterClass);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass);
		tOuterClass__typeGraph____model.setSrc(tOuterClass);
		tOuterClass__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterClass__typeGraph____model);
		typeGraph__tOuterClass____allTypes.setSrc(typeGraph);
		typeGraph__tOuterClass____allTypes.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tOuterClass____allTypes);
		eOuterClassToTOuterClass__eOuterClass____source.setSrc(eOuterClassToTOuterClass);
		eOuterClassToTOuterClass__eOuterClass____source.setTrg(eOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass__eOuterClass____source);
		eOuterClassToTOuterClass__tOuterClass____target.setSrc(eOuterClassToTOuterClass);
		eOuterClassToTOuterClass__tOuterClass____target.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass__tOuterClass____target);
		tOuterClass__tPackage____package.setSrc(tOuterClass);
		tOuterClass__tPackage____package.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(tOuterClass__tPackage____package);
		tPackage__tOuterClass____allTypes.setSrc(tPackage);
		tPackage__tOuterClass____allTypes.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(tPackage__tOuterClass____allTypes);
		eOuterClass__mDefinition____bodyDeclarations.setSrc(eOuterClass);
		eOuterClass__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(eOuterClass__mDefinition____bodyDeclarations);
		mDefinition__eOuterClass____anonymousClassDeclarationOwner.setSrc(mDefinition);
		mDefinition__eOuterClass____anonymousClassDeclarationOwner.setTrg(eOuterClass);
		isApplicableMatch.getAllContextElements().add(mDefinition__eOuterClass____anonymousClassDeclarationOwner);
		mDefinition__mInnerClass____mInnerTypes.setSrc(mDefinition);
		mDefinition__mInnerClass____mInnerTypes.setTrg(mInnerClass);
		isApplicableMatch.getAllContextElements().add(mDefinition__mInnerClass____mInnerTypes);
		tOuterClass__typeGraph____model.setName(tOuterClass__typeGraph____model_name_prime);
		typeGraph__tOuterClass____allTypes.setName(typeGraph__tOuterClass____allTypes_name_prime);
		eOuterClassToTOuterClass__eOuterClass____source
				.setName(eOuterClassToTOuterClass__eOuterClass____source_name_prime);
		eOuterClassToTOuterClass__tOuterClass____target
				.setName(eOuterClassToTOuterClass__tOuterClass____target_name_prime);
		tOuterClass__tPackage____package.setName(tOuterClass__tPackage____package_name_prime);
		tPackage__tOuterClass____allTypes.setName(tPackage__tOuterClass____allTypes_name_prime);
		eOuterClass__mDefinition____bodyDeclarations.setName(eOuterClass__mDefinition____bodyDeclarations_name_prime);
		mDefinition__eOuterClass____anonymousClassDeclarationOwner
				.setName(mDefinition__eOuterClass____anonymousClassDeclarationOwner_name_prime);
		mDefinition__mInnerClass____mInnerTypes.setName(mDefinition__mInnerClass____mInnerTypes_name_prime);
		return new Object[] { tPackage, mInnerClass, typeGraph, eOuterClass, tOuterClass, mDefinition,
				eOuterClassToTOuterClass, isApplicableMatch, tOuterClass__typeGraph____model,
				typeGraph__tOuterClass____allTypes, eOuterClassToTOuterClass__eOuterClass____source,
				eOuterClassToTOuterClass__tOuterClass____target, tOuterClass__tPackage____package,
				tPackage__tOuterClass____allTypes, eOuterClass__mDefinition____bodyDeclarations,
				mDefinition__eOuterClass____anonymousClassDeclarationOwner, mDefinition__mInnerClass____mInnerTypes };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_2_4_solveCSP_bindingFBBBBBBBBB(
			ClassInnerAnonClassMember _this, IsApplicableMatch isApplicableMatch, TPackage tPackage, MClass mInnerClass,
			TypeGraph typeGraph, AnonymousClassDeclaration eOuterClass, TClass tOuterClass,
			MAbstractMethodDefinition mDefinition, AnonymousClassDeclarationToTClass eOuterClassToTOuterClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tPackage, mInnerClass, typeGraph,
				eOuterClass, tOuterClass, mDefinition, eOuterClassToTOuterClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tPackage, mInnerClass, typeGraph, eOuterClass,
					tOuterClass, mDefinition, eOuterClassToTOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			ClassInnerAnonClassMember _this, IsApplicableMatch isApplicableMatch, TPackage tPackage, MClass mInnerClass,
			TypeGraph typeGraph, AnonymousClassDeclaration eOuterClass, TClass tOuterClass,
			MAbstractMethodDefinition mDefinition, AnonymousClassDeclarationToTClass eOuterClassToTOuterClass) {
		Object[] result_pattern_ClassInnerAnonClassMember_2_4_solveCSP_binding = pattern_ClassInnerAnonClassMember_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tPackage, mInnerClass, typeGraph, eOuterClass, tOuterClass, mDefinition,
				eOuterClassToTOuterClass);
		if (result_pattern_ClassInnerAnonClassMember_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerAnonClassMember_2_4_solveCSP_binding[0];

			Object[] result_pattern_ClassInnerAnonClassMember_2_4_solveCSP_black = pattern_ClassInnerAnonClassMember_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassInnerAnonClassMember_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tPackage, mInnerClass, typeGraph, eOuterClass,
						tOuterClass, mDefinition, eOuterClassToTOuterClass };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerAnonClassMember_2_5_checkCSP_expressionFBB(
			ClassInnerAnonClassMember _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassInnerAnonClassMember";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassInnerAnonClassMember_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_10_1_initialbindings_blackBBBBBB(
			ClassInnerAnonClassMember _this, Match match, TPackage tPackage, TypeGraph typeGraph, TClass tOuterClass,
			TClass tInnerClass) {
		if (!tInnerClass.equals(tOuterClass)) {
			return new Object[] { _this, match, tPackage, typeGraph, tOuterClass, tInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_10_2_SolveCSP_bindingFBBBBBB(
			ClassInnerAnonClassMember _this, Match match, TPackage tPackage, TypeGraph typeGraph, TClass tOuterClass,
			TClass tInnerClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tPackage, typeGraph, tOuterClass, tInnerClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tPackage, typeGraph, tOuterClass, tInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_10_2_SolveCSP_bindingAndBlackFBBBBBB(
			ClassInnerAnonClassMember _this, Match match, TPackage tPackage, TypeGraph typeGraph, TClass tOuterClass,
			TClass tInnerClass) {
		Object[] result_pattern_ClassInnerAnonClassMember_10_2_SolveCSP_binding = pattern_ClassInnerAnonClassMember_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, tPackage, typeGraph, tOuterClass, tInnerClass);
		if (result_pattern_ClassInnerAnonClassMember_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerAnonClassMember_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassInnerAnonClassMember_10_2_SolveCSP_black = pattern_ClassInnerAnonClassMember_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassInnerAnonClassMember_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tPackage, typeGraph, tOuterClass, tInnerClass };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerAnonClassMember_10_3_CheckCSP_expressionFBB(
			ClassInnerAnonClassMember _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_10_4_collectelementstobetranslated_blackBBBBB(
			Match match, TPackage tPackage, TypeGraph typeGraph, TClass tOuterClass, TClass tInnerClass) {
		if (!tInnerClass.equals(tOuterClass)) {
			return new Object[] { match, tPackage, typeGraph, tOuterClass, tInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_10_4_collectelementstobetranslated_greenBBBBBFFFFFFFF(
			Match match, TPackage tPackage, TypeGraph typeGraph, TClass tOuterClass, TClass tInnerClass) {
		EMoflonEdge typeGraph__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tInnerClass____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tOuterClass____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tInnerClass____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tInnerClass);
		String typeGraph__tInnerClass____classes_name_prime = "classes";
		String tPackage__tInnerClass____classes_name_prime = "classes";
		String typeGraph__tInnerClass____allTypes_name_prime = "allTypes";
		String tInnerClass__typeGraph____model_name_prime = "model";
		String tOuterClass__tInnerClass____innerTypes_name_prime = "innerTypes";
		String tInnerClass__tOuterClass____outerType_name_prime = "outerType";
		String tPackage__tInnerClass____allTypes_name_prime = "allTypes";
		String tInnerClass__tPackage____package_name_prime = "package";
		typeGraph__tInnerClass____classes.setSrc(typeGraph);
		typeGraph__tInnerClass____classes.setTrg(tInnerClass);
		match.getToBeTranslatedEdges().add(typeGraph__tInnerClass____classes);
		tPackage__tInnerClass____classes.setSrc(tPackage);
		tPackage__tInnerClass____classes.setTrg(tInnerClass);
		match.getToBeTranslatedEdges().add(tPackage__tInnerClass____classes);
		typeGraph__tInnerClass____allTypes.setSrc(typeGraph);
		typeGraph__tInnerClass____allTypes.setTrg(tInnerClass);
		match.getToBeTranslatedEdges().add(typeGraph__tInnerClass____allTypes);
		tInnerClass__typeGraph____model.setSrc(tInnerClass);
		tInnerClass__typeGraph____model.setTrg(typeGraph);
		match.getToBeTranslatedEdges().add(tInnerClass__typeGraph____model);
		tOuterClass__tInnerClass____innerTypes.setSrc(tOuterClass);
		tOuterClass__tInnerClass____innerTypes.setTrg(tInnerClass);
		match.getToBeTranslatedEdges().add(tOuterClass__tInnerClass____innerTypes);
		tInnerClass__tOuterClass____outerType.setSrc(tInnerClass);
		tInnerClass__tOuterClass____outerType.setTrg(tOuterClass);
		match.getToBeTranslatedEdges().add(tInnerClass__tOuterClass____outerType);
		tPackage__tInnerClass____allTypes.setSrc(tPackage);
		tPackage__tInnerClass____allTypes.setTrg(tInnerClass);
		match.getToBeTranslatedEdges().add(tPackage__tInnerClass____allTypes);
		tInnerClass__tPackage____package.setSrc(tInnerClass);
		tInnerClass__tPackage____package.setTrg(tPackage);
		match.getToBeTranslatedEdges().add(tInnerClass__tPackage____package);
		typeGraph__tInnerClass____classes.setName(typeGraph__tInnerClass____classes_name_prime);
		tPackage__tInnerClass____classes.setName(tPackage__tInnerClass____classes_name_prime);
		typeGraph__tInnerClass____allTypes.setName(typeGraph__tInnerClass____allTypes_name_prime);
		tInnerClass__typeGraph____model.setName(tInnerClass__typeGraph____model_name_prime);
		tOuterClass__tInnerClass____innerTypes.setName(tOuterClass__tInnerClass____innerTypes_name_prime);
		tInnerClass__tOuterClass____outerType.setName(tInnerClass__tOuterClass____outerType_name_prime);
		tPackage__tInnerClass____allTypes.setName(tPackage__tInnerClass____allTypes_name_prime);
		tInnerClass__tPackage____package.setName(tInnerClass__tPackage____package_name_prime);
		return new Object[] { match, tPackage, typeGraph, tOuterClass, tInnerClass, typeGraph__tInnerClass____classes,
				tPackage__tInnerClass____classes, typeGraph__tInnerClass____allTypes, tInnerClass__typeGraph____model,
				tOuterClass__tInnerClass____innerTypes, tInnerClass__tOuterClass____outerType,
				tPackage__tInnerClass____allTypes, tInnerClass__tPackage____package };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_10_5_collectcontextelements_blackBBBBB(Match match,
			TPackage tPackage, TypeGraph typeGraph, TClass tOuterClass, TClass tInnerClass) {
		if (!tInnerClass.equals(tOuterClass)) {
			return new Object[] { match, tPackage, typeGraph, tOuterClass, tInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_10_5_collectcontextelements_greenBBBBFFFF(
			Match match, TPackage tPackage, TypeGraph typeGraph, TClass tOuterClass) {
		EMoflonEdge tOuterClass__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterClass____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tOuterClass____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tPackage);
		match.getContextNodes().add(typeGraph);
		match.getContextNodes().add(tOuterClass);
		String tOuterClass__typeGraph____model_name_prime = "model";
		String typeGraph__tOuterClass____allTypes_name_prime = "allTypes";
		String tOuterClass__tPackage____package_name_prime = "package";
		String tPackage__tOuterClass____allTypes_name_prime = "allTypes";
		tOuterClass__typeGraph____model.setSrc(tOuterClass);
		tOuterClass__typeGraph____model.setTrg(typeGraph);
		match.getContextEdges().add(tOuterClass__typeGraph____model);
		typeGraph__tOuterClass____allTypes.setSrc(typeGraph);
		typeGraph__tOuterClass____allTypes.setTrg(tOuterClass);
		match.getContextEdges().add(typeGraph__tOuterClass____allTypes);
		tOuterClass__tPackage____package.setSrc(tOuterClass);
		tOuterClass__tPackage____package.setTrg(tPackage);
		match.getContextEdges().add(tOuterClass__tPackage____package);
		tPackage__tOuterClass____allTypes.setSrc(tPackage);
		tPackage__tOuterClass____allTypes.setTrg(tOuterClass);
		match.getContextEdges().add(tPackage__tOuterClass____allTypes);
		tOuterClass__typeGraph____model.setName(tOuterClass__typeGraph____model_name_prime);
		typeGraph__tOuterClass____allTypes.setName(typeGraph__tOuterClass____allTypes_name_prime);
		tOuterClass__tPackage____package.setName(tOuterClass__tPackage____package_name_prime);
		tPackage__tOuterClass____allTypes.setName(tPackage__tOuterClass____allTypes_name_prime);
		return new Object[] { match, tPackage, typeGraph, tOuterClass, tOuterClass__typeGraph____model,
				typeGraph__tOuterClass____allTypes, tOuterClass__tPackage____package,
				tPackage__tOuterClass____allTypes };
	}

	public static final void pattern_ClassInnerAnonClassMember_10_6_registerobjectstomatch_expressionBBBBBB(
			ClassInnerAnonClassMember _this, Match match, TPackage tPackage, TypeGraph typeGraph, TClass tOuterClass,
			TClass tInnerClass) {
		_this.registerObjectsToMatch_BWD(match, tPackage, typeGraph, tOuterClass, tInnerClass);

	}

	public static final boolean pattern_ClassInnerAnonClassMember_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassInnerAnonClassMember_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_2 = isApplicableMatch.getObject("eOuterClass");
		EObject _localVariable_3 = isApplicableMatch.getObject("tOuterClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_5 = isApplicableMatch.getObject("tInnerClass");
		EObject _localVariable_6 = isApplicableMatch.getObject("eOuterClassToTOuterClass");
		EObject tmpTPackage = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpEOuterClass = _localVariable_2;
		EObject tmpTOuterClass = _localVariable_3;
		EObject tmpMDefinition = _localVariable_4;
		EObject tmpTInnerClass = _localVariable_5;
		EObject tmpEOuterClassToTOuterClass = _localVariable_6;
		if (tmpTPackage instanceof TPackage) {
			TPackage tPackage = (TPackage) tmpTPackage;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpEOuterClass instanceof AnonymousClassDeclaration) {
					AnonymousClassDeclaration eOuterClass = (AnonymousClassDeclaration) tmpEOuterClass;
					if (tmpTOuterClass instanceof TClass) {
						TClass tOuterClass = (TClass) tmpTOuterClass;
						if (tmpMDefinition instanceof MAbstractMethodDefinition) {
							MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) tmpMDefinition;
							if (tmpTInnerClass instanceof TClass) {
								TClass tInnerClass = (TClass) tmpTInnerClass;
								if (tmpEOuterClassToTOuterClass instanceof AnonymousClassDeclarationToTClass) {
									AnonymousClassDeclarationToTClass eOuterClassToTOuterClass = (AnonymousClassDeclarationToTClass) tmpEOuterClassToTOuterClass;
									return new Object[] { tPackage, typeGraph, eOuterClass, tOuterClass, mDefinition,
											tInnerClass, eOuterClassToTOuterClass, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_11_1_performtransformation_blackBBBBBBBFBB(
			TPackage tPackage, TypeGraph typeGraph, AnonymousClassDeclaration eOuterClass, TClass tOuterClass,
			MAbstractMethodDefinition mDefinition, TClass tInnerClass,
			AnonymousClassDeclarationToTClass eOuterClassToTOuterClass, ClassInnerAnonClassMember _this,
			IsApplicableMatch isApplicableMatch) {
		if (!tInnerClass.equals(tOuterClass)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { tPackage, typeGraph, eOuterClass, tOuterClass, mDefinition, tInnerClass,
							eOuterClassToTOuterClass, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			ClassInnerAnonClassMember _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassInnerAnonClassMember_11_1_performtransformation_binding = pattern_ClassInnerAnonClassMember_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ClassInnerAnonClassMember_11_1_performtransformation_binding != null) {
			TPackage tPackage = (TPackage) result_pattern_ClassInnerAnonClassMember_11_1_performtransformation_binding[0];
			TypeGraph typeGraph = (TypeGraph) result_pattern_ClassInnerAnonClassMember_11_1_performtransformation_binding[1];
			AnonymousClassDeclaration eOuterClass = (AnonymousClassDeclaration) result_pattern_ClassInnerAnonClassMember_11_1_performtransformation_binding[2];
			TClass tOuterClass = (TClass) result_pattern_ClassInnerAnonClassMember_11_1_performtransformation_binding[3];
			MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) result_pattern_ClassInnerAnonClassMember_11_1_performtransformation_binding[4];
			TClass tInnerClass = (TClass) result_pattern_ClassInnerAnonClassMember_11_1_performtransformation_binding[5];
			AnonymousClassDeclarationToTClass eOuterClassToTOuterClass = (AnonymousClassDeclarationToTClass) result_pattern_ClassInnerAnonClassMember_11_1_performtransformation_binding[6];

			Object[] result_pattern_ClassInnerAnonClassMember_11_1_performtransformation_black = pattern_ClassInnerAnonClassMember_11_1_performtransformation_blackBBBBBBBFBB(
					tPackage, typeGraph, eOuterClass, tOuterClass, mDefinition, tInnerClass, eOuterClassToTOuterClass,
					_this, isApplicableMatch);
			if (result_pattern_ClassInnerAnonClassMember_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassInnerAnonClassMember_11_1_performtransformation_black[7];

				return new Object[] { tPackage, typeGraph, eOuterClass, tOuterClass, mDefinition, tInnerClass,
						eOuterClassToTOuterClass, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_11_1_performtransformation_greenFFFBBB(
			MAbstractMethodDefinition mDefinition, TClass tInnerClass, CSP csp) {
		ASTNodeToTAnnotatable astNodeToAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeToTAbstractType tInnerTypeToTInnerAbstractType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		MClass mInnerClass = ModiscoFactory.eINSTANCE.createMClass();
		Object _localVariable_0 = csp.getValue("mInnerClass", "proxy");
		Object _localVariable_1 = csp.getValue("mInnerClass", "name");
		astNodeToAnnotatable.setTarget(tInnerClass);
		tInnerTypeToTInnerAbstractType.setTarget(tInnerClass);
		tInnerTypeToTInnerAbstractType.setSource(mInnerClass);
		astNodeToAnnotatable.setSource(mInnerClass);
		mDefinition.getMInnerTypes().add(mInnerClass);
		boolean mInnerClass_proxy_prime = (boolean) _localVariable_0;
		String mInnerClass_name_prime = (String) _localVariable_1;
		mInnerClass.setProxy(Boolean.valueOf(mInnerClass_proxy_prime));
		mInnerClass.setName(mInnerClass_name_prime);
		return new Object[] { astNodeToAnnotatable, tInnerTypeToTInnerAbstractType, mInnerClass, mDefinition,
				tInnerClass, csp };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_11_2_collecttranslatedelements_blackBBBB(
			ASTNodeToTAnnotatable astNodeToAnnotatable, TypeToTAbstractType tInnerTypeToTInnerAbstractType,
			MClass mInnerClass, TClass tInnerClass) {
		return new Object[] { astNodeToAnnotatable, tInnerTypeToTInnerAbstractType, mInnerClass, tInnerClass };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_11_2_collecttranslatedelements_greenFBBBB(
			ASTNodeToTAnnotatable astNodeToAnnotatable, TypeToTAbstractType tInnerTypeToTInnerAbstractType,
			MClass mInnerClass, TClass tInnerClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(astNodeToAnnotatable);
		ruleresult.getCreatedLinkElements().add(tInnerTypeToTInnerAbstractType);
		ruleresult.getCreatedElements().add(mInnerClass);
		ruleresult.getTranslatedElements().add(tInnerClass);
		return new Object[] { ruleresult, astNodeToAnnotatable, tInnerTypeToTInnerAbstractType, mInnerClass,
				tInnerClass };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject astNodeToAnnotatable, EObject tInnerTypeToTInnerAbstractType,
			EObject tPackage, EObject mInnerClass, EObject typeGraph, EObject eOuterClass, EObject tOuterClass,
			EObject mDefinition, EObject tInnerClass, EObject eOuterClassToTOuterClass) {
		if (!astNodeToAnnotatable.equals(tInnerTypeToTInnerAbstractType)) {
			if (!astNodeToAnnotatable.equals(tPackage)) {
				if (!astNodeToAnnotatable.equals(mInnerClass)) {
					if (!astNodeToAnnotatable.equals(typeGraph)) {
						if (!astNodeToAnnotatable.equals(eOuterClass)) {
							if (!astNodeToAnnotatable.equals(tOuterClass)) {
								if (!astNodeToAnnotatable.equals(mDefinition)) {
									if (!astNodeToAnnotatable.equals(tInnerClass)) {
										if (!astNodeToAnnotatable.equals(eOuterClassToTOuterClass)) {
											if (!tInnerTypeToTInnerAbstractType.equals(tPackage)) {
												if (!tInnerTypeToTInnerAbstractType.equals(typeGraph)) {
													if (!tInnerTypeToTInnerAbstractType.equals(tOuterClass)) {
														if (!tPackage.equals(typeGraph)) {
															if (!mInnerClass.equals(tInnerTypeToTInnerAbstractType)) {
																if (!mInnerClass.equals(tPackage)) {
																	if (!mInnerClass.equals(typeGraph)) {
																		if (!mInnerClass.equals(tOuterClass)) {
																			if (!mInnerClass.equals(tInnerClass)) {
																				if (!eOuterClass.equals(
																						tInnerTypeToTInnerAbstractType)) {
																					if (!eOuterClass.equals(tPackage)) {
																						if (!eOuterClass
																								.equals(mInnerClass)) {
																							if (!eOuterClass.equals(
																									typeGraph)) {
																								if (!eOuterClass.equals(
																										tOuterClass)) {
																									if (!eOuterClass
																											.equals(mDefinition)) {
																										if (!eOuterClass
																												.equals(tInnerClass)) {
																											if (!eOuterClass
																													.equals(eOuterClassToTOuterClass)) {
																												if (!tOuterClass
																														.equals(tPackage)) {
																													if (!tOuterClass
																															.equals(typeGraph)) {
																														if (!mDefinition
																																.equals(tInnerTypeToTInnerAbstractType)) {
																															if (!mDefinition
																																	.equals(tPackage)) {
																																if (!mDefinition
																																		.equals(mInnerClass)) {
																																	if (!mDefinition
																																			.equals(typeGraph)) {
																																		if (!mDefinition
																																				.equals(tOuterClass)) {
																																			if (!mDefinition
																																					.equals(tInnerClass)) {
																																				if (!tInnerClass
																																						.equals(tInnerTypeToTInnerAbstractType)) {
																																					if (!tInnerClass
																																							.equals(tPackage)) {
																																						if (!tInnerClass
																																								.equals(typeGraph)) {
																																							if (!tInnerClass
																																									.equals(tOuterClass)) {
																																								if (!eOuterClassToTOuterClass
																																										.equals(tInnerTypeToTInnerAbstractType)) {
																																									if (!eOuterClassToTOuterClass
																																											.equals(tPackage)) {
																																										if (!eOuterClassToTOuterClass
																																												.equals(mInnerClass)) {
																																											if (!eOuterClassToTOuterClass
																																													.equals(typeGraph)) {
																																												if (!eOuterClassToTOuterClass
																																														.equals(tOuterClass)) {
																																													if (!eOuterClassToTOuterClass
																																															.equals(mDefinition)) {
																																														if (!eOuterClassToTOuterClass
																																																.equals(tInnerClass)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	astNodeToAnnotatable,
																																																	tInnerTypeToTInnerAbstractType,
																																																	tPackage,
																																																	mInnerClass,
																																																	typeGraph,
																																																	eOuterClass,
																																																	tOuterClass,
																																																	mDefinition,
																																																	tInnerClass,
																																																	eOuterClassToTOuterClass };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ClassInnerAnonClassMember_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject astNodeToAnnotatable, EObject tInnerTypeToTInnerAbstractType,
			EObject tPackage, EObject mInnerClass, EObject typeGraph, EObject tOuterClass, EObject mDefinition,
			EObject tInnerClass) {
		EMoflonEdge astNodeToAnnotatable__tInnerClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerTypeToTInnerAbstractType__mInnerClass____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge astNodeToAnnotatable__mInnerClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerTypeToTInnerAbstractType__tInnerClass____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tPackage__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tInnerClass____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tOuterClass____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tInnerClass____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mInnerClass____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassInnerAnonClassMember";
		String astNodeToAnnotatable__tInnerClass____target_name_prime = "target";
		String typeGraph__tInnerClass____classes_name_prime = "classes";
		String tInnerTypeToTInnerAbstractType__mInnerClass____source_name_prime = "source";
		String astNodeToAnnotatable__mInnerClass____source_name_prime = "source";
		String tInnerTypeToTInnerAbstractType__tInnerClass____target_name_prime = "target";
		String tPackage__tInnerClass____classes_name_prime = "classes";
		String typeGraph__tInnerClass____allTypes_name_prime = "allTypes";
		String tInnerClass__typeGraph____model_name_prime = "model";
		String tOuterClass__tInnerClass____innerTypes_name_prime = "innerTypes";
		String tInnerClass__tOuterClass____outerType_name_prime = "outerType";
		String tPackage__tInnerClass____allTypes_name_prime = "allTypes";
		String tInnerClass__tPackage____package_name_prime = "package";
		String mDefinition__mInnerClass____mInnerTypes_name_prime = "mInnerTypes";
		astNodeToAnnotatable__tInnerClass____target.setSrc(astNodeToAnnotatable);
		astNodeToAnnotatable__tInnerClass____target.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(astNodeToAnnotatable__tInnerClass____target);
		typeGraph__tInnerClass____classes.setSrc(typeGraph);
		typeGraph__tInnerClass____classes.setTrg(tInnerClass);
		ruleresult.getTranslatedEdges().add(typeGraph__tInnerClass____classes);
		tInnerTypeToTInnerAbstractType__mInnerClass____source.setSrc(tInnerTypeToTInnerAbstractType);
		tInnerTypeToTInnerAbstractType__mInnerClass____source.setTrg(mInnerClass);
		ruleresult.getCreatedEdges().add(tInnerTypeToTInnerAbstractType__mInnerClass____source);
		astNodeToAnnotatable__mInnerClass____source.setSrc(astNodeToAnnotatable);
		astNodeToAnnotatable__mInnerClass____source.setTrg(mInnerClass);
		ruleresult.getCreatedEdges().add(astNodeToAnnotatable__mInnerClass____source);
		tInnerTypeToTInnerAbstractType__tInnerClass____target.setSrc(tInnerTypeToTInnerAbstractType);
		tInnerTypeToTInnerAbstractType__tInnerClass____target.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(tInnerTypeToTInnerAbstractType__tInnerClass____target);
		tPackage__tInnerClass____classes.setSrc(tPackage);
		tPackage__tInnerClass____classes.setTrg(tInnerClass);
		ruleresult.getTranslatedEdges().add(tPackage__tInnerClass____classes);
		typeGraph__tInnerClass____allTypes.setSrc(typeGraph);
		typeGraph__tInnerClass____allTypes.setTrg(tInnerClass);
		ruleresult.getTranslatedEdges().add(typeGraph__tInnerClass____allTypes);
		tInnerClass__typeGraph____model.setSrc(tInnerClass);
		tInnerClass__typeGraph____model.setTrg(typeGraph);
		ruleresult.getTranslatedEdges().add(tInnerClass__typeGraph____model);
		tOuterClass__tInnerClass____innerTypes.setSrc(tOuterClass);
		tOuterClass__tInnerClass____innerTypes.setTrg(tInnerClass);
		ruleresult.getTranslatedEdges().add(tOuterClass__tInnerClass____innerTypes);
		tInnerClass__tOuterClass____outerType.setSrc(tInnerClass);
		tInnerClass__tOuterClass____outerType.setTrg(tOuterClass);
		ruleresult.getTranslatedEdges().add(tInnerClass__tOuterClass____outerType);
		tPackage__tInnerClass____allTypes.setSrc(tPackage);
		tPackage__tInnerClass____allTypes.setTrg(tInnerClass);
		ruleresult.getTranslatedEdges().add(tPackage__tInnerClass____allTypes);
		tInnerClass__tPackage____package.setSrc(tInnerClass);
		tInnerClass__tPackage____package.setTrg(tPackage);
		ruleresult.getTranslatedEdges().add(tInnerClass__tPackage____package);
		mDefinition__mInnerClass____mInnerTypes.setSrc(mDefinition);
		mDefinition__mInnerClass____mInnerTypes.setTrg(mInnerClass);
		ruleresult.getCreatedEdges().add(mDefinition__mInnerClass____mInnerTypes);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		astNodeToAnnotatable__tInnerClass____target.setName(astNodeToAnnotatable__tInnerClass____target_name_prime);
		typeGraph__tInnerClass____classes.setName(typeGraph__tInnerClass____classes_name_prime);
		tInnerTypeToTInnerAbstractType__mInnerClass____source
				.setName(tInnerTypeToTInnerAbstractType__mInnerClass____source_name_prime);
		astNodeToAnnotatable__mInnerClass____source.setName(astNodeToAnnotatable__mInnerClass____source_name_prime);
		tInnerTypeToTInnerAbstractType__tInnerClass____target
				.setName(tInnerTypeToTInnerAbstractType__tInnerClass____target_name_prime);
		tPackage__tInnerClass____classes.setName(tPackage__tInnerClass____classes_name_prime);
		typeGraph__tInnerClass____allTypes.setName(typeGraph__tInnerClass____allTypes_name_prime);
		tInnerClass__typeGraph____model.setName(tInnerClass__typeGraph____model_name_prime);
		tOuterClass__tInnerClass____innerTypes.setName(tOuterClass__tInnerClass____innerTypes_name_prime);
		tInnerClass__tOuterClass____outerType.setName(tInnerClass__tOuterClass____outerType_name_prime);
		tPackage__tInnerClass____allTypes.setName(tPackage__tInnerClass____allTypes_name_prime);
		tInnerClass__tPackage____package.setName(tInnerClass__tPackage____package_name_prime);
		mDefinition__mInnerClass____mInnerTypes.setName(mDefinition__mInnerClass____mInnerTypes_name_prime);
		return new Object[] { ruleresult, astNodeToAnnotatable, tInnerTypeToTInnerAbstractType, tPackage, mInnerClass,
				typeGraph, tOuterClass, mDefinition, tInnerClass, astNodeToAnnotatable__tInnerClass____target,
				typeGraph__tInnerClass____classes, tInnerTypeToTInnerAbstractType__mInnerClass____source,
				astNodeToAnnotatable__mInnerClass____source, tInnerTypeToTInnerAbstractType__tInnerClass____target,
				tPackage__tInnerClass____classes, typeGraph__tInnerClass____allTypes, tInnerClass__typeGraph____model,
				tOuterClass__tInnerClass____innerTypes, tInnerClass__tOuterClass____outerType,
				tPackage__tInnerClass____allTypes, tInnerClass__tPackage____package,
				mDefinition__mInnerClass____mInnerTypes };
	}

	public static final void pattern_ClassInnerAnonClassMember_11_5_registerobjects_expressionBBBBBBBBBBBB(
			ClassInnerAnonClassMember _this, PerformRuleResult ruleresult, EObject astNodeToAnnotatable,
			EObject tInnerTypeToTInnerAbstractType, EObject tPackage, EObject mInnerClass, EObject typeGraph,
			EObject eOuterClass, EObject tOuterClass, EObject mDefinition, EObject tInnerClass,
			EObject eOuterClassToTOuterClass) {
		_this.registerObjects_BWD(ruleresult, astNodeToAnnotatable, tInnerTypeToTInnerAbstractType, tPackage,
				mInnerClass, typeGraph, eOuterClass, tOuterClass, mDefinition, tInnerClass, eOuterClassToTOuterClass);

	}

	public static final PerformRuleResult pattern_ClassInnerAnonClassMember_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_12_1_preparereturnvalue_bindingFB(
			ClassInnerAnonClassMember _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_12_1_preparereturnvalue_blackFBB(EClass eClass,
			ClassInnerAnonClassMember _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_12_1_preparereturnvalue_bindingAndBlackFFB(
			ClassInnerAnonClassMember _this) {
		Object[] result_pattern_ClassInnerAnonClassMember_12_1_preparereturnvalue_binding = pattern_ClassInnerAnonClassMember_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassInnerAnonClassMember_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassInnerAnonClassMember_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassInnerAnonClassMember_12_1_preparereturnvalue_black = pattern_ClassInnerAnonClassMember_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassInnerAnonClassMember_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassInnerAnonClassMember_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ClassInnerAnonClassMember";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tPackage");
		EObject _localVariable_1 = match.getObject("typeGraph");
		EObject _localVariable_2 = match.getObject("tOuterClass");
		EObject _localVariable_3 = match.getObject("tInnerClass");
		EObject tmpTPackage = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpTOuterClass = _localVariable_2;
		EObject tmpTInnerClass = _localVariable_3;
		if (tmpTPackage instanceof TPackage) {
			TPackage tPackage = (TPackage) tmpTPackage;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpTOuterClass instanceof TClass) {
					TClass tOuterClass = (TClass) tmpTOuterClass;
					if (tmpTInnerClass instanceof TClass) {
						TClass tInnerClass = (TClass) tmpTInnerClass;
						return new Object[] { tPackage, typeGraph, tOuterClass, tInnerClass, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInnerAnonClassMember_12_2_corematch_blackBBFBBFB(
			TPackage tPackage, TypeGraph typeGraph, TClass tOuterClass, TClass tInnerClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tInnerClass.equals(tOuterClass)) {
			for (AnonymousClassDeclarationToTClass eOuterClassToTOuterClass : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tOuterClass, AnonymousClassDeclarationToTClass.class, "target")) {
				AnonymousClassDeclaration eOuterClass = eOuterClassToTOuterClass.getSource();
				if (eOuterClass != null) {
					_result.add(new Object[] { tPackage, typeGraph, eOuterClass, tOuterClass, tInnerClass,
							eOuterClassToTOuterClass, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassInnerAnonClassMember_12_3_findcontext_blackBBBBFBB(
			TPackage tPackage, TypeGraph typeGraph, AnonymousClassDeclaration eOuterClass, TClass tOuterClass,
			TClass tInnerClass, AnonymousClassDeclarationToTClass eOuterClassToTOuterClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tInnerClass.equals(tOuterClass)) {
			if (typeGraph.equals(tOuterClass.getModel())) {
				if (eOuterClass.equals(eOuterClassToTOuterClass.getSource())) {
					if (typeGraph.getClasses().contains(tInnerClass)) {
						if (tOuterClass.equals(eOuterClassToTOuterClass.getTarget())) {
							if (tPackage.getClasses().contains(tInnerClass)) {
								if (tPackage.equals(tOuterClass.getPackage())) {
									if (typeGraph.getAllTypes().contains(tInnerClass)) {
										if (tOuterClass.getInnerTypes().contains(tInnerClass)) {
											if (tPackage.getAllTypes().contains(tInnerClass)) {
												for (BodyDeclaration tmpMDefinition : eOuterClass
														.getBodyDeclarations()) {
													if (tmpMDefinition instanceof MAbstractMethodDefinition) {
														MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) tmpMDefinition;
														_result.add(new Object[] { tPackage, typeGraph, eOuterClass,
																tOuterClass, mDefinition, tInnerClass,
																eOuterClassToTOuterClass });
													}
												}
											}
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

	public static final Object[] pattern_ClassInnerAnonClassMember_12_3_findcontext_greenBBBBBBBFFFFFFFFFFFFFFFFF(
			TPackage tPackage, TypeGraph typeGraph, AnonymousClassDeclaration eOuterClass, TClass tOuterClass,
			MAbstractMethodDefinition mDefinition, TClass tInnerClass,
			AnonymousClassDeclarationToTClass eOuterClassToTOuterClass) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tOuterClass__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterClass____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClassToTOuterClass__eOuterClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClassToTOuterClass__tOuterClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tOuterClass____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClass__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__eOuterClass____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tOuterClass__tInnerClass____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tOuterClass____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tInnerClass____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tOuterClass__typeGraph____model_name_prime = "model";
		String typeGraph__tOuterClass____allTypes_name_prime = "allTypes";
		String eOuterClassToTOuterClass__eOuterClass____source_name_prime = "source";
		String typeGraph__tInnerClass____classes_name_prime = "classes";
		String eOuterClassToTOuterClass__tOuterClass____target_name_prime = "target";
		String tPackage__tInnerClass____classes_name_prime = "classes";
		String tOuterClass__tPackage____package_name_prime = "package";
		String tPackage__tOuterClass____allTypes_name_prime = "allTypes";
		String typeGraph__tInnerClass____allTypes_name_prime = "allTypes";
		String tInnerClass__typeGraph____model_name_prime = "model";
		String eOuterClass__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__eOuterClass____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		String tOuterClass__tInnerClass____innerTypes_name_prime = "innerTypes";
		String tInnerClass__tOuterClass____outerType_name_prime = "outerType";
		String tPackage__tInnerClass____allTypes_name_prime = "allTypes";
		String tInnerClass__tPackage____package_name_prime = "package";
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(eOuterClass);
		isApplicableMatch.getAllContextElements().add(tOuterClass);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(tInnerClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass);
		tOuterClass__typeGraph____model.setSrc(tOuterClass);
		tOuterClass__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterClass__typeGraph____model);
		typeGraph__tOuterClass____allTypes.setSrc(typeGraph);
		typeGraph__tOuterClass____allTypes.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tOuterClass____allTypes);
		eOuterClassToTOuterClass__eOuterClass____source.setSrc(eOuterClassToTOuterClass);
		eOuterClassToTOuterClass__eOuterClass____source.setTrg(eOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass__eOuterClass____source);
		typeGraph__tInnerClass____classes.setSrc(typeGraph);
		typeGraph__tInnerClass____classes.setTrg(tInnerClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tInnerClass____classes);
		eOuterClassToTOuterClass__tOuterClass____target.setSrc(eOuterClassToTOuterClass);
		eOuterClassToTOuterClass__tOuterClass____target.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass__tOuterClass____target);
		tPackage__tInnerClass____classes.setSrc(tPackage);
		tPackage__tInnerClass____classes.setTrg(tInnerClass);
		isApplicableMatch.getAllContextElements().add(tPackage__tInnerClass____classes);
		tOuterClass__tPackage____package.setSrc(tOuterClass);
		tOuterClass__tPackage____package.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(tOuterClass__tPackage____package);
		tPackage__tOuterClass____allTypes.setSrc(tPackage);
		tPackage__tOuterClass____allTypes.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(tPackage__tOuterClass____allTypes);
		typeGraph__tInnerClass____allTypes.setSrc(typeGraph);
		typeGraph__tInnerClass____allTypes.setTrg(tInnerClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tInnerClass____allTypes);
		tInnerClass__typeGraph____model.setSrc(tInnerClass);
		tInnerClass__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tInnerClass__typeGraph____model);
		eOuterClass__mDefinition____bodyDeclarations.setSrc(eOuterClass);
		eOuterClass__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(eOuterClass__mDefinition____bodyDeclarations);
		mDefinition__eOuterClass____anonymousClassDeclarationOwner.setSrc(mDefinition);
		mDefinition__eOuterClass____anonymousClassDeclarationOwner.setTrg(eOuterClass);
		isApplicableMatch.getAllContextElements().add(mDefinition__eOuterClass____anonymousClassDeclarationOwner);
		tOuterClass__tInnerClass____innerTypes.setSrc(tOuterClass);
		tOuterClass__tInnerClass____innerTypes.setTrg(tInnerClass);
		isApplicableMatch.getAllContextElements().add(tOuterClass__tInnerClass____innerTypes);
		tInnerClass__tOuterClass____outerType.setSrc(tInnerClass);
		tInnerClass__tOuterClass____outerType.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(tInnerClass__tOuterClass____outerType);
		tPackage__tInnerClass____allTypes.setSrc(tPackage);
		tPackage__tInnerClass____allTypes.setTrg(tInnerClass);
		isApplicableMatch.getAllContextElements().add(tPackage__tInnerClass____allTypes);
		tInnerClass__tPackage____package.setSrc(tInnerClass);
		tInnerClass__tPackage____package.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(tInnerClass__tPackage____package);
		tOuterClass__typeGraph____model.setName(tOuterClass__typeGraph____model_name_prime);
		typeGraph__tOuterClass____allTypes.setName(typeGraph__tOuterClass____allTypes_name_prime);
		eOuterClassToTOuterClass__eOuterClass____source
				.setName(eOuterClassToTOuterClass__eOuterClass____source_name_prime);
		typeGraph__tInnerClass____classes.setName(typeGraph__tInnerClass____classes_name_prime);
		eOuterClassToTOuterClass__tOuterClass____target
				.setName(eOuterClassToTOuterClass__tOuterClass____target_name_prime);
		tPackage__tInnerClass____classes.setName(tPackage__tInnerClass____classes_name_prime);
		tOuterClass__tPackage____package.setName(tOuterClass__tPackage____package_name_prime);
		tPackage__tOuterClass____allTypes.setName(tPackage__tOuterClass____allTypes_name_prime);
		typeGraph__tInnerClass____allTypes.setName(typeGraph__tInnerClass____allTypes_name_prime);
		tInnerClass__typeGraph____model.setName(tInnerClass__typeGraph____model_name_prime);
		eOuterClass__mDefinition____bodyDeclarations.setName(eOuterClass__mDefinition____bodyDeclarations_name_prime);
		mDefinition__eOuterClass____anonymousClassDeclarationOwner
				.setName(mDefinition__eOuterClass____anonymousClassDeclarationOwner_name_prime);
		tOuterClass__tInnerClass____innerTypes.setName(tOuterClass__tInnerClass____innerTypes_name_prime);
		tInnerClass__tOuterClass____outerType.setName(tInnerClass__tOuterClass____outerType_name_prime);
		tPackage__tInnerClass____allTypes.setName(tPackage__tInnerClass____allTypes_name_prime);
		tInnerClass__tPackage____package.setName(tInnerClass__tPackage____package_name_prime);
		return new Object[] { tPackage, typeGraph, eOuterClass, tOuterClass, mDefinition, tInnerClass,
				eOuterClassToTOuterClass, isApplicableMatch, tOuterClass__typeGraph____model,
				typeGraph__tOuterClass____allTypes, eOuterClassToTOuterClass__eOuterClass____source,
				typeGraph__tInnerClass____classes, eOuterClassToTOuterClass__tOuterClass____target,
				tPackage__tInnerClass____classes, tOuterClass__tPackage____package, tPackage__tOuterClass____allTypes,
				typeGraph__tInnerClass____allTypes, tInnerClass__typeGraph____model,
				eOuterClass__mDefinition____bodyDeclarations,
				mDefinition__eOuterClass____anonymousClassDeclarationOwner, tOuterClass__tInnerClass____innerTypes,
				tInnerClass__tOuterClass____outerType, tPackage__tInnerClass____allTypes,
				tInnerClass__tPackage____package };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_12_4_solveCSP_bindingFBBBBBBBBB(
			ClassInnerAnonClassMember _this, IsApplicableMatch isApplicableMatch, TPackage tPackage,
			TypeGraph typeGraph, AnonymousClassDeclaration eOuterClass, TClass tOuterClass,
			MAbstractMethodDefinition mDefinition, TClass tInnerClass,
			AnonymousClassDeclarationToTClass eOuterClassToTOuterClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tPackage, typeGraph, eOuterClass,
				tOuterClass, mDefinition, tInnerClass, eOuterClassToTOuterClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tPackage, typeGraph, eOuterClass, tOuterClass,
					mDefinition, tInnerClass, eOuterClassToTOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			ClassInnerAnonClassMember _this, IsApplicableMatch isApplicableMatch, TPackage tPackage,
			TypeGraph typeGraph, AnonymousClassDeclaration eOuterClass, TClass tOuterClass,
			MAbstractMethodDefinition mDefinition, TClass tInnerClass,
			AnonymousClassDeclarationToTClass eOuterClassToTOuterClass) {
		Object[] result_pattern_ClassInnerAnonClassMember_12_4_solveCSP_binding = pattern_ClassInnerAnonClassMember_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tPackage, typeGraph, eOuterClass, tOuterClass, mDefinition, tInnerClass,
				eOuterClassToTOuterClass);
		if (result_pattern_ClassInnerAnonClassMember_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerAnonClassMember_12_4_solveCSP_binding[0];

			Object[] result_pattern_ClassInnerAnonClassMember_12_4_solveCSP_black = pattern_ClassInnerAnonClassMember_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassInnerAnonClassMember_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tPackage, typeGraph, eOuterClass, tOuterClass,
						mDefinition, tInnerClass, eOuterClassToTOuterClass };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerAnonClassMember_12_5_checkCSP_expressionFBB(
			ClassInnerAnonClassMember _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassInnerAnonClassMember";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassInnerAnonClassMember_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_20_1_preparereturnvalue_bindingFB(
			ClassInnerAnonClassMember _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ClassInnerAnonClassMember _this) {
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

	public static final Object[] pattern_ClassInnerAnonClassMember_20_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassInnerAnonClassMember _this) {
		Object[] result_pattern_ClassInnerAnonClassMember_20_1_preparereturnvalue_binding = pattern_ClassInnerAnonClassMember_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassInnerAnonClassMember_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassInnerAnonClassMember_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassInnerAnonClassMember_20_1_preparereturnvalue_black = pattern_ClassInnerAnonClassMember_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassInnerAnonClassMember_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassInnerAnonClassMember_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassInnerAnonClassMember_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_20_2_testcorematchandDECs_black_nac_0BB(
			TClass tInnerClass, TPackage tPackage) {
		for (TPackage __DEC_tInnerClass_classes_166118 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tInnerClass, TPackage.class, "classes")) {
			if (!tPackage.equals(__DEC_tInnerClass_classes_166118)) {
				return new Object[] { tInnerClass, tPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_20_2_testcorematchandDECs_black_nac_1BB(
			TClass tInnerClass, TypeGraph typeGraph) {
		for (TypeGraph __DEC_tInnerClass_classes_18547 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tInnerClass, TypeGraph.class, "classes")) {
			if (!typeGraph.equals(__DEC_tInnerClass_classes_18547)) {
				return new Object[] { tInnerClass, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_20_2_testcorematchandDECs_black_nac_2BB(
			TClass tInnerClass, TPackage tPackage) {
		TPackage __DEC_tInnerClass_allTypes_438579 = tInnerClass.getPackage();
		if (__DEC_tInnerClass_allTypes_438579 != null) {
			if (!tPackage.equals(__DEC_tInnerClass_allTypes_438579)) {
				return new Object[] { tInnerClass, tPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_20_2_testcorematchandDECs_black_nac_3BB(
			TClass tInnerClass, TClass tOuterClass) {
		if (!tInnerClass.equals(tOuterClass)) {
			TAbstractType __DEC_tInnerClass_innerTypes_24655 = tInnerClass.getOuterType();
			if (__DEC_tInnerClass_innerTypes_24655 != null) {
				if (!tInnerClass.equals(__DEC_tInnerClass_innerTypes_24655)) {
					if (!tOuterClass.equals(__DEC_tInnerClass_innerTypes_24655)) {
						return new Object[] { tInnerClass, tOuterClass };
					}
				}
			}

		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInnerAnonClassMember_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_classes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTypeGraph = _edge_classes.getSrc();
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			EObject tmpTInnerClass = _edge_classes.getTrg();
			if (tmpTInnerClass instanceof TClass) {
				TClass tInnerClass = (TClass) tmpTInnerClass;
				if (typeGraph.getClasses().contains(tInnerClass)) {
					if (typeGraph.getAllTypes().contains(tInnerClass)) {
						TAbstractType tmpTOuterClass = tInnerClass.getOuterType();
						if (tmpTOuterClass instanceof TClass) {
							TClass tOuterClass = (TClass) tmpTOuterClass;
							if (!tInnerClass.equals(tOuterClass)) {
								if (typeGraph.equals(tOuterClass.getModel())) {
									TPackage tPackage = tInnerClass.getPackage();
									if (tPackage != null) {
										if (tPackage.getClasses().contains(tInnerClass)) {
											if (tPackage.equals(tOuterClass.getPackage())) {
												if (pattern_ClassInnerAnonClassMember_20_2_testcorematchandDECs_black_nac_1BB(
														tInnerClass, typeGraph) == null) {
													if (pattern_ClassInnerAnonClassMember_20_2_testcorematchandDECs_black_nac_3BB(
															tInnerClass, tOuterClass) == null) {
														if (pattern_ClassInnerAnonClassMember_20_2_testcorematchandDECs_black_nac_0BB(
																tInnerClass, tPackage) == null) {
															if (pattern_ClassInnerAnonClassMember_20_2_testcorematchandDECs_black_nac_2BB(
																	tInnerClass, tPackage) == null) {
																_result.add(new Object[] { tPackage, typeGraph,
																		tOuterClass, tInnerClass, _edge_classes });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ClassInnerAnonClassMember_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassInnerAnonClassMember_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			ClassInnerAnonClassMember _this, Match match, TPackage tPackage, TypeGraph typeGraph, TClass tOuterClass,
			TClass tInnerClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tPackage, typeGraph, tOuterClass, tInnerClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassInnerAnonClassMember_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassInnerAnonClassMember _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassInnerAnonClassMember_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_21_1_preparereturnvalue_bindingFB(
			ClassInnerAnonClassMember _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ClassInnerAnonClassMember _this) {
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

	public static final Object[] pattern_ClassInnerAnonClassMember_21_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassInnerAnonClassMember _this) {
		Object[] result_pattern_ClassInnerAnonClassMember_21_1_preparereturnvalue_binding = pattern_ClassInnerAnonClassMember_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassInnerAnonClassMember_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassInnerAnonClassMember_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassInnerAnonClassMember_21_1_preparereturnvalue_black = pattern_ClassInnerAnonClassMember_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassInnerAnonClassMember_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassInnerAnonClassMember_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassInnerAnonClassMember_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_21_2_testcorematchandDECs_black_nac_0B(
			MClass mInnerClass) {
		AbstractTypeDeclaration __DEC_mInnerClass_abstractTypeDeclaration_54843 = mInnerClass
				.getAbstractTypeDeclaration();
		if (__DEC_mInnerClass_abstractTypeDeclaration_54843 != null) {
			if (!mInnerClass.equals(__DEC_mInnerClass_abstractTypeDeclaration_54843)) {
				return new Object[] { mInnerClass };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_21_2_testcorematchandDECs_black_nac_1BB(
			MClass mInnerClass, AnonymousClassDeclaration eOuterClass) {
		AnonymousClassDeclaration __DEC_mInnerClass_anonymousClassDeclarationOwner_847546 = mInnerClass
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mInnerClass_anonymousClassDeclarationOwner_847546 != null) {
			if (!eOuterClass.equals(__DEC_mInnerClass_anonymousClassDeclarationOwner_847546)) {
				return new Object[] { mInnerClass, eOuterClass };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_21_2_testcorematchandDECs_black_nac_2B(
			MClass mInnerClass) {
		for (Model __DEC_mInnerClass_orphanTypes_767376 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mInnerClass, Model.class, "orphanTypes")) {
			return new Object[] { mInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_21_2_testcorematchandDECs_black_nac_3B(
			MClass mInnerClass) {
		org.eclipse.modisco.java.Package __DEC_mInnerClass_ownedElements_864611 = mInnerClass.getPackage();
		if (__DEC_mInnerClass_ownedElements_864611 != null) {
			return new Object[] { mInnerClass };
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_21_2_testcorematchandDECs_black_nac_4BB(
			MClass mInnerClass, MAbstractMethodDefinition mDefinition) {
		for (MAbstractMethodDefinition __DEC_mInnerClass_mInnerTypes_684387 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mInnerClass, MAbstractMethodDefinition.class, "mInnerTypes")) {
			if (!mDefinition.equals(__DEC_mInnerClass_mInnerTypes_684387)) {
				return new Object[] { mInnerClass, mDefinition };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_21_2_testcorematchandDECs_black_nac_5BB(
			MClass mInnerClass, AnonymousClassDeclaration eOuterClass) {
		if (eOuterClass.equals(mInnerClass.getAnonymousClassDeclarationOwner())) {
			return new Object[] { mInnerClass, eOuterClass };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInnerAnonClassMember_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_mInnerTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMDefinition = _edge_mInnerTypes.getSrc();
		if (tmpMDefinition instanceof MAbstractMethodDefinition) {
			MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) tmpMDefinition;
			EObject tmpMInnerClass = _edge_mInnerTypes.getTrg();
			if (tmpMInnerClass instanceof MClass) {
				MClass mInnerClass = (MClass) tmpMInnerClass;
				if (mDefinition.getMInnerTypes().contains(mInnerClass)) {
					AnonymousClassDeclaration eOuterClass = mDefinition.getAnonymousClassDeclarationOwner();
					if (eOuterClass != null) {
						if (pattern_ClassInnerAnonClassMember_21_2_testcorematchandDECs_black_nac_0B(
								mInnerClass) == null) {
							if (pattern_ClassInnerAnonClassMember_21_2_testcorematchandDECs_black_nac_2B(
									mInnerClass) == null) {
								if (pattern_ClassInnerAnonClassMember_21_2_testcorematchandDECs_black_nac_3B(
										mInnerClass) == null) {
									if (pattern_ClassInnerAnonClassMember_21_2_testcorematchandDECs_black_nac_4BB(
											mInnerClass, mDefinition) == null) {
										if (pattern_ClassInnerAnonClassMember_21_2_testcorematchandDECs_black_nac_1BB(
												mInnerClass, eOuterClass) == null) {
											if (pattern_ClassInnerAnonClassMember_21_2_testcorematchandDECs_black_nac_5BB(
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

		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassInnerAnonClassMember_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			ClassInnerAnonClassMember _this, Match match, MClass mInnerClass, AnonymousClassDeclaration eOuterClass,
			MAbstractMethodDefinition mDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mInnerClass, eOuterClass, mDefinition);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassInnerAnonClassMember_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassInnerAnonClassMember _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassInnerAnonClassMember_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_24_1_prepare_blackB(
			ClassInnerAnonClassMember _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tPackage");
		EObject _localVariable_1 = sourceMatch.getObject("mInnerClass");
		EObject _localVariable_2 = targetMatch.getObject("typeGraph");
		EObject _localVariable_3 = sourceMatch.getObject("eOuterClass");
		EObject _localVariable_4 = targetMatch.getObject("tOuterClass");
		EObject _localVariable_5 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_6 = targetMatch.getObject("tInnerClass");
		EObject tmpTPackage = _localVariable_0;
		EObject tmpMInnerClass = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpEOuterClass = _localVariable_3;
		EObject tmpTOuterClass = _localVariable_4;
		EObject tmpMDefinition = _localVariable_5;
		EObject tmpTInnerClass = _localVariable_6;
		if (tmpTPackage instanceof TPackage) {
			TPackage tPackage = (TPackage) tmpTPackage;
			if (tmpMInnerClass instanceof MClass) {
				MClass mInnerClass = (MClass) tmpMInnerClass;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					if (tmpEOuterClass instanceof AnonymousClassDeclaration) {
						AnonymousClassDeclaration eOuterClass = (AnonymousClassDeclaration) tmpEOuterClass;
						if (tmpTOuterClass instanceof TClass) {
							TClass tOuterClass = (TClass) tmpTOuterClass;
							if (tmpMDefinition instanceof MAbstractMethodDefinition) {
								MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) tmpMDefinition;
								if (tmpTInnerClass instanceof TClass) {
									TClass tInnerClass = (TClass) tmpTInnerClass;
									return new Object[] { tPackage, mInnerClass, typeGraph, eOuterClass, tOuterClass,
											mDefinition, tInnerClass, targetMatch, sourceMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_24_2_matchsrctrgcontext_blackBBBBBBBBB(
			TPackage tPackage, MClass mInnerClass, TypeGraph typeGraph, AnonymousClassDeclaration eOuterClass,
			TClass tOuterClass, MAbstractMethodDefinition mDefinition, TClass tInnerClass, Match sourceMatch,
			Match targetMatch) {
		if (!tInnerClass.equals(tOuterClass)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { tPackage, mInnerClass, typeGraph, eOuterClass, tOuterClass, mDefinition,
						tInnerClass, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ClassInnerAnonClassMember_24_2_matchsrctrgcontext_binding = pattern_ClassInnerAnonClassMember_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_ClassInnerAnonClassMember_24_2_matchsrctrgcontext_binding != null) {
			TPackage tPackage = (TPackage) result_pattern_ClassInnerAnonClassMember_24_2_matchsrctrgcontext_binding[0];
			MClass mInnerClass = (MClass) result_pattern_ClassInnerAnonClassMember_24_2_matchsrctrgcontext_binding[1];
			TypeGraph typeGraph = (TypeGraph) result_pattern_ClassInnerAnonClassMember_24_2_matchsrctrgcontext_binding[2];
			AnonymousClassDeclaration eOuterClass = (AnonymousClassDeclaration) result_pattern_ClassInnerAnonClassMember_24_2_matchsrctrgcontext_binding[3];
			TClass tOuterClass = (TClass) result_pattern_ClassInnerAnonClassMember_24_2_matchsrctrgcontext_binding[4];
			MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) result_pattern_ClassInnerAnonClassMember_24_2_matchsrctrgcontext_binding[5];
			TClass tInnerClass = (TClass) result_pattern_ClassInnerAnonClassMember_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_ClassInnerAnonClassMember_24_2_matchsrctrgcontext_black = pattern_ClassInnerAnonClassMember_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					tPackage, mInnerClass, typeGraph, eOuterClass, tOuterClass, mDefinition, tInnerClass, sourceMatch,
					targetMatch);
			if (result_pattern_ClassInnerAnonClassMember_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tPackage, mInnerClass, typeGraph, eOuterClass, tOuterClass, mDefinition,
						tInnerClass, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_24_3_solvecsp_bindingFBBBBBBBBBB(
			ClassInnerAnonClassMember _this, TPackage tPackage, MClass mInnerClass, TypeGraph typeGraph,
			AnonymousClassDeclaration eOuterClass, TClass tOuterClass, MAbstractMethodDefinition mDefinition,
			TClass tInnerClass, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(tPackage, mInnerClass, typeGraph, eOuterClass,
				tOuterClass, mDefinition, tInnerClass, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, tPackage, mInnerClass, typeGraph, eOuterClass, tOuterClass, mDefinition,
					tInnerClass, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			ClassInnerAnonClassMember _this, TPackage tPackage, MClass mInnerClass, TypeGraph typeGraph,
			AnonymousClassDeclaration eOuterClass, TClass tOuterClass, MAbstractMethodDefinition mDefinition,
			TClass tInnerClass, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ClassInnerAnonClassMember_24_3_solvecsp_binding = pattern_ClassInnerAnonClassMember_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, tPackage, mInnerClass, typeGraph, eOuterClass, tOuterClass, mDefinition, tInnerClass,
				sourceMatch, targetMatch);
		if (result_pattern_ClassInnerAnonClassMember_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerAnonClassMember_24_3_solvecsp_binding[0];

			Object[] result_pattern_ClassInnerAnonClassMember_24_3_solvecsp_black = pattern_ClassInnerAnonClassMember_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_ClassInnerAnonClassMember_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tPackage, mInnerClass, typeGraph, eOuterClass, tOuterClass,
						mDefinition, tInnerClass, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerAnonClassMember_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassInnerAnonClassMember_24_5_matchcorrcontext_blackBBFBB(
			AnonymousClassDeclaration eOuterClass, TClass tOuterClass, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (AnonymousClassDeclarationToTClass eOuterClassToTOuterClass : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eOuterClass, AnonymousClassDeclarationToTClass.class, "source")) {
				if (tOuterClass.equals(eOuterClassToTOuterClass.getTarget())) {
					_result.add(new Object[] { eOuterClass, tOuterClass, eOuterClassToTOuterClass, sourceMatch,
							targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_24_5_matchcorrcontext_greenBBBF(
			AnonymousClassDeclarationToTClass eOuterClassToTOuterClass, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ClassInnerAnonClassMember";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(eOuterClassToTOuterClass);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { eOuterClassToTOuterClass, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_24_6_createcorrespondence_blackBBBBBBBB(
			TPackage tPackage, MClass mInnerClass, TypeGraph typeGraph, AnonymousClassDeclaration eOuterClass,
			TClass tOuterClass, MAbstractMethodDefinition mDefinition, TClass tInnerClass, CCMatch ccMatch) {
		if (!tInnerClass.equals(tOuterClass)) {
			return new Object[] { tPackage, mInnerClass, typeGraph, eOuterClass, tOuterClass, mDefinition, tInnerClass,
					ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_24_6_createcorrespondence_greenFFBBB(
			MClass mInnerClass, TClass tInnerClass, CCMatch ccMatch) {
		ASTNodeToTAnnotatable astNodeToAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeToTAbstractType tInnerTypeToTInnerAbstractType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		astNodeToAnnotatable.setTarget(tInnerClass);
		astNodeToAnnotatable.setSource(mInnerClass);
		ccMatch.getCreateCorr().add(astNodeToAnnotatable);
		tInnerTypeToTInnerAbstractType.setSource(mInnerClass);
		tInnerTypeToTInnerAbstractType.setTarget(tInnerClass);
		ccMatch.getCreateCorr().add(tInnerTypeToTInnerAbstractType);
		return new Object[] { astNodeToAnnotatable, tInnerTypeToTInnerAbstractType, mInnerClass, tInnerClass, ccMatch };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ClassInnerAnonClassMember";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassInnerAnonClassMember_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_27_1_matchtggpattern_black_nac_0B(
			MClass mInnerClass) {
		AbstractTypeDeclaration __DEC_mInnerClass_abstractTypeDeclaration_270442 = mInnerClass
				.getAbstractTypeDeclaration();
		if (__DEC_mInnerClass_abstractTypeDeclaration_270442 != null) {
			if (!mInnerClass.equals(__DEC_mInnerClass_abstractTypeDeclaration_270442)) {
				return new Object[] { mInnerClass };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_27_1_matchtggpattern_black_nac_1BB(
			MClass mInnerClass, AnonymousClassDeclaration eOuterClass) {
		AnonymousClassDeclaration __DEC_mInnerClass_anonymousClassDeclarationOwner_530809 = mInnerClass
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mInnerClass_anonymousClassDeclarationOwner_530809 != null) {
			if (!eOuterClass.equals(__DEC_mInnerClass_anonymousClassDeclarationOwner_530809)) {
				return new Object[] { mInnerClass, eOuterClass };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_27_1_matchtggpattern_black_nac_2B(
			MClass mInnerClass) {
		for (Model __DEC_mInnerClass_orphanTypes_27099 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mInnerClass, Model.class, "orphanTypes")) {
			return new Object[] { mInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_27_1_matchtggpattern_black_nac_3B(
			MClass mInnerClass) {
		org.eclipse.modisco.java.Package __DEC_mInnerClass_ownedElements_264073 = mInnerClass.getPackage();
		if (__DEC_mInnerClass_ownedElements_264073 != null) {
			return new Object[] { mInnerClass };
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_27_1_matchtggpattern_black_nac_4BB(
			MClass mInnerClass, MAbstractMethodDefinition mDefinition) {
		for (MAbstractMethodDefinition __DEC_mInnerClass_mInnerTypes_729819 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mInnerClass, MAbstractMethodDefinition.class, "mInnerTypes")) {
			if (!mDefinition.equals(__DEC_mInnerClass_mInnerTypes_729819)) {
				return new Object[] { mInnerClass, mDefinition };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_27_1_matchtggpattern_black_nac_5BB(
			MClass mInnerClass, AnonymousClassDeclaration eOuterClass) {
		if (eOuterClass.equals(mInnerClass.getAnonymousClassDeclarationOwner())) {
			return new Object[] { mInnerClass, eOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_27_1_matchtggpattern_blackBBB(MClass mInnerClass,
			AnonymousClassDeclaration eOuterClass, MAbstractMethodDefinition mDefinition) {
		if (eOuterClass.getBodyDeclarations().contains(mDefinition)) {
			if (mDefinition.getMInnerTypes().contains(mInnerClass)) {
				if (pattern_ClassInnerAnonClassMember_27_1_matchtggpattern_black_nac_0B(mInnerClass) == null) {
					if (pattern_ClassInnerAnonClassMember_27_1_matchtggpattern_black_nac_1BB(mInnerClass,
							eOuterClass) == null) {
						if (pattern_ClassInnerAnonClassMember_27_1_matchtggpattern_black_nac_2B(mInnerClass) == null) {
							if (pattern_ClassInnerAnonClassMember_27_1_matchtggpattern_black_nac_3B(
									mInnerClass) == null) {
								if (pattern_ClassInnerAnonClassMember_27_1_matchtggpattern_black_nac_4BB(mInnerClass,
										mDefinition) == null) {
									if (pattern_ClassInnerAnonClassMember_27_1_matchtggpattern_black_nac_5BB(
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
		return null;
	}

	public static final boolean pattern_ClassInnerAnonClassMember_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassInnerAnonClassMember_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_28_1_matchtggpattern_black_nac_0BB(
			TClass tInnerClass, TPackage tPackage) {
		for (TPackage __DEC_tInnerClass_classes_633686 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tInnerClass, TPackage.class, "classes")) {
			if (!tPackage.equals(__DEC_tInnerClass_classes_633686)) {
				return new Object[] { tInnerClass, tPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_28_1_matchtggpattern_black_nac_1BB(
			TClass tInnerClass, TypeGraph typeGraph) {
		for (TypeGraph __DEC_tInnerClass_classes_598578 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tInnerClass, TypeGraph.class, "classes")) {
			if (!typeGraph.equals(__DEC_tInnerClass_classes_598578)) {
				return new Object[] { tInnerClass, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_28_1_matchtggpattern_black_nac_2BB(
			TClass tInnerClass, TPackage tPackage) {
		TPackage __DEC_tInnerClass_allTypes_707040 = tInnerClass.getPackage();
		if (__DEC_tInnerClass_allTypes_707040 != null) {
			if (!tPackage.equals(__DEC_tInnerClass_allTypes_707040)) {
				return new Object[] { tInnerClass, tPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_28_1_matchtggpattern_black_nac_3BB(
			TClass tInnerClass, TClass tOuterClass) {
		if (!tInnerClass.equals(tOuterClass)) {
			TAbstractType __DEC_tInnerClass_innerTypes_969961 = tInnerClass.getOuterType();
			if (__DEC_tInnerClass_innerTypes_969961 != null) {
				if (!tInnerClass.equals(__DEC_tInnerClass_innerTypes_969961)) {
					if (!tOuterClass.equals(__DEC_tInnerClass_innerTypes_969961)) {
						return new Object[] { tInnerClass, tOuterClass };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_28_1_matchtggpattern_blackBBBB(TPackage tPackage,
			TypeGraph typeGraph, TClass tOuterClass, TClass tInnerClass) {
		if (!tInnerClass.equals(tOuterClass)) {
			if (typeGraph.equals(tOuterClass.getModel())) {
				if (typeGraph.getClasses().contains(tInnerClass)) {
					if (tPackage.getClasses().contains(tInnerClass)) {
						if (tPackage.equals(tOuterClass.getPackage())) {
							if (typeGraph.getAllTypes().contains(tInnerClass)) {
								if (tOuterClass.getInnerTypes().contains(tInnerClass)) {
									if (tPackage.getAllTypes().contains(tInnerClass)) {
										if (pattern_ClassInnerAnonClassMember_28_1_matchtggpattern_black_nac_0BB(
												tInnerClass, tPackage) == null) {
											if (pattern_ClassInnerAnonClassMember_28_1_matchtggpattern_black_nac_1BB(
													tInnerClass, typeGraph) == null) {
												if (pattern_ClassInnerAnonClassMember_28_1_matchtggpattern_black_nac_2BB(
														tInnerClass, tPackage) == null) {
													if (pattern_ClassInnerAnonClassMember_28_1_matchtggpattern_black_nac_3BB(
															tInnerClass, tOuterClass) == null) {
														return new Object[] { tPackage, typeGraph, tOuterClass,
																tInnerClass };
													}
												}
											}
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

	public static final boolean pattern_ClassInnerAnonClassMember_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassInnerAnonClassMember_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_29_1_createresult_blackB(
			ClassInnerAnonClassMember _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TPackage tPackage) {
		if (ruleResult.getTargetObjects().contains(tPackage)) {
			return new Object[] { ruleResult, tPackage };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TClass tOuterClass) {
		if (ruleResult.getTargetObjects().contains(tOuterClass)) {
			return new Object[] { ruleResult, tOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph typeGraph) {
		if (ruleResult.getTargetObjects().contains(typeGraph)) {
			return new Object[] { ruleResult, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, AnonymousClassDeclarationToTClass eOuterClassToTOuterClass) {
		if (ruleResult.getCorrObjects().contains(eOuterClassToTOuterClass)) {
			return new Object[] { ruleResult, eOuterClassToTOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, AnonymousClassDeclaration eOuterClass) {
		if (ruleResult.getSourceObjects().contains(eOuterClass)) {
			return new Object[] { ruleResult, eOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MAbstractMethodDefinition mDefinition) {
		if (ruleResult.getSourceObjects().contains(mDefinition)) {
			return new Object[] { ruleResult, mDefinition };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInnerAnonClassMember_29_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eOuterClassToTOuterClassList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpEOuterClassToTOuterClass : eOuterClassToTOuterClassList.getEntryObjects()) {
				if (tmpEOuterClassToTOuterClass instanceof AnonymousClassDeclarationToTClass) {
					AnonymousClassDeclarationToTClass eOuterClassToTOuterClass = (AnonymousClassDeclarationToTClass) tmpEOuterClassToTOuterClass;
					TClass tOuterClass = eOuterClassToTOuterClass.getTarget();
					if (tOuterClass != null) {
						AnonymousClassDeclaration eOuterClass = eOuterClassToTOuterClass.getSource();
						if (eOuterClass != null) {
							TPackage tPackage = tOuterClass.getPackage();
							if (tPackage != null) {
								TypeGraph typeGraph = tOuterClass.getModel();
								if (typeGraph != null) {
									if (pattern_ClassInnerAnonClassMember_29_2_isapplicablecore_black_nac_3BB(
											ruleResult, eOuterClassToTOuterClass) == null) {
										if (pattern_ClassInnerAnonClassMember_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, tOuterClass) == null) {
											if (pattern_ClassInnerAnonClassMember_29_2_isapplicablecore_black_nac_4BB(
													ruleResult, eOuterClass) == null) {
												if (pattern_ClassInnerAnonClassMember_29_2_isapplicablecore_black_nac_0BB(
														ruleResult, tPackage) == null) {
													if (pattern_ClassInnerAnonClassMember_29_2_isapplicablecore_black_nac_2BB(
															ruleResult, typeGraph) == null) {
														for (BodyDeclaration tmpMDefinition : eOuterClass
																.getBodyDeclarations()) {
															if (tmpMDefinition instanceof MAbstractMethodDefinition) {
																MAbstractMethodDefinition mDefinition = (MAbstractMethodDefinition) tmpMDefinition;
																if (pattern_ClassInnerAnonClassMember_29_2_isapplicablecore_black_nac_5BB(
																		ruleResult, mDefinition) == null) {
																	_result.add(
																			new Object[] { eOuterClassToTOuterClassList,
																					tPackage, tOuterClass, typeGraph,
																					eOuterClassToTOuterClass,
																					eOuterClass, mDefinition,
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
		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_29_3_solveCSP_bindingFBBBBBBBBB(
			ClassInnerAnonClassMember _this, IsApplicableMatch isApplicableMatch, TPackage tPackage,
			TypeGraph typeGraph, AnonymousClassDeclaration eOuterClass, TClass tOuterClass,
			MAbstractMethodDefinition mDefinition, AnonymousClassDeclarationToTClass eOuterClassToTOuterClass,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tPackage, typeGraph, eOuterClass,
				tOuterClass, mDefinition, eOuterClassToTOuterClass, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tPackage, typeGraph, eOuterClass, tOuterClass,
					mDefinition, eOuterClassToTOuterClass, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			ClassInnerAnonClassMember _this, IsApplicableMatch isApplicableMatch, TPackage tPackage,
			TypeGraph typeGraph, AnonymousClassDeclaration eOuterClass, TClass tOuterClass,
			MAbstractMethodDefinition mDefinition, AnonymousClassDeclarationToTClass eOuterClassToTOuterClass,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ClassInnerAnonClassMember_29_3_solveCSP_binding = pattern_ClassInnerAnonClassMember_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tPackage, typeGraph, eOuterClass, tOuterClass, mDefinition,
				eOuterClassToTOuterClass, ruleResult);
		if (result_pattern_ClassInnerAnonClassMember_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerAnonClassMember_29_3_solveCSP_binding[0];

			Object[] result_pattern_ClassInnerAnonClassMember_29_3_solveCSP_black = pattern_ClassInnerAnonClassMember_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ClassInnerAnonClassMember_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tPackage, typeGraph, eOuterClass, tOuterClass,
						mDefinition, eOuterClassToTOuterClass, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerAnonClassMember_29_4_checkCSP_expressionFBB(
			ClassInnerAnonClassMember _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_29_5_checknacs_blackBBBBBB(TPackage tPackage,
			TypeGraph typeGraph, AnonymousClassDeclaration eOuterClass, TClass tOuterClass,
			MAbstractMethodDefinition mDefinition, AnonymousClassDeclarationToTClass eOuterClassToTOuterClass) {
		return new Object[] { tPackage, typeGraph, eOuterClass, tOuterClass, mDefinition, eOuterClassToTOuterClass };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_29_6_perform_blackBBBBBBB(TPackage tPackage,
			TypeGraph typeGraph, AnonymousClassDeclaration eOuterClass, TClass tOuterClass,
			MAbstractMethodDefinition mDefinition, AnonymousClassDeclarationToTClass eOuterClassToTOuterClass,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tPackage, typeGraph, eOuterClass, tOuterClass, mDefinition, eOuterClassToTOuterClass,
				ruleResult };
	}

	public static final Object[] pattern_ClassInnerAnonClassMember_29_6_perform_greenFFBFBBBFBB(TPackage tPackage,
			TypeGraph typeGraph, TClass tOuterClass, MAbstractMethodDefinition mDefinition,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		ASTNodeToTAnnotatable astNodeToAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeToTAbstractType tInnerTypeToTInnerAbstractType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		MClass mInnerClass = ModiscoFactory.eINSTANCE.createMClass();
		TClass tInnerClass = BasicFactory.eINSTANCE.createTClass();
		Object _localVariable_0 = csp.getValue("mInnerClass", "proxy");
		Object _localVariable_1 = csp.getValue("mInnerClass", "name");
		Object _localVariable_2 = csp.getValue("tInnerClass", "tLib");
		Object _localVariable_3 = csp.getValue("tInnerClass", "tName");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(astNodeToAnnotatable);
		ruleResult.getCorrObjects().add(tInnerTypeToTInnerAbstractType);
		tInnerTypeToTInnerAbstractType.setSource(mInnerClass);
		astNodeToAnnotatable.setSource(mInnerClass);
		mDefinition.getMInnerTypes().add(mInnerClass);
		ruleResult.getSourceObjects().add(mInnerClass);
		astNodeToAnnotatable.setTarget(tInnerClass);
		typeGraph.getClasses().add(tInnerClass);
		tInnerTypeToTInnerAbstractType.setTarget(tInnerClass);
		tPackage.getClasses().add(tInnerClass);
		typeGraph.getAllTypes().add(tInnerClass);
		tOuterClass.getInnerTypes().add(tInnerClass);
		tPackage.getAllTypes().add(tInnerClass);
		ruleResult.getTargetObjects().add(tInnerClass);
		boolean mInnerClass_proxy_prime = (boolean) _localVariable_0;
		String mInnerClass_name_prime = (String) _localVariable_1;
		boolean tInnerClass_tLib_prime = (boolean) _localVariable_2;
		String tInnerClass_tName_prime = (String) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		mInnerClass.setProxy(Boolean.valueOf(mInnerClass_proxy_prime));
		mInnerClass.setName(mInnerClass_name_prime);
		tInnerClass.setTLib(Boolean.valueOf(tInnerClass_tLib_prime));
		tInnerClass.setTName(tInnerClass_tName_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { astNodeToAnnotatable, tInnerTypeToTInnerAbstractType, tPackage, mInnerClass, typeGraph,
				tOuterClass, mDefinition, tInnerClass, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ClassInnerAnonClassMember_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ClassInnerAnonClassMemberImpl
