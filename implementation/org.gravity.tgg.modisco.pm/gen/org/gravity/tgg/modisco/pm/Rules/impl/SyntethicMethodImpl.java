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
import org.eclipse.modisco.java.Type;

import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MSyntheticMethodDefinition;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.MSyntethicMethodToTSyntethicMethod;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.RulesPackage;
import org.gravity.tgg.modisco.pm.Rules.SyntethicMethod;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TSyntethicMethod;

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
 * An implementation of the model object '<em><b>Syntethic Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SyntethicMethodImpl extends AbstractRuleImpl implements SyntethicMethod {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SyntethicMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSyntethicMethod();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ClassDeclaration mClass, MSyntheticMethodDefinition mSyntethic,
			MMethodDefinition mDef) {

		Object[] result1_black = SyntethicMethodImpl.pattern_SyntethicMethod_0_1_initialbindings_blackBBBBB(this, match,
				mClass, mSyntethic, mDef);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mClass] = " + mClass + ", " + "[mSyntethic] = " + mSyntethic
					+ ", " + "[mDef] = " + mDef + ".");
		}

		Object[] result2_bindingAndBlack = SyntethicMethodImpl
				.pattern_SyntethicMethod_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mClass, mSyntethic, mDef);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mClass] = " + mClass + ", " + "[mSyntethic] = " + mSyntethic
					+ ", " + "[mDef] = " + mDef + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SyntethicMethodImpl.pattern_SyntethicMethod_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SyntethicMethodImpl
					.pattern_SyntethicMethod_0_4_collectelementstobetranslated_blackBBBB(match, mClass, mSyntethic,
							mDef);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[mClass] = "
								+ mClass + ", " + "[mSyntethic] = " + mSyntethic + ", " + "[mDef] = " + mDef + ".");
			}
			SyntethicMethodImpl.pattern_SyntethicMethod_0_4_collectelementstobetranslated_greenBBBBFFFF(match, mClass,
					mSyntethic, mDef);
			//nothing EMoflonEdge mClass__mSyntethic____bodyDeclarations = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mSyntethic__mClass____abstractTypeDeclaration = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge mDef__mSyntethic____syntheticMethodDefinitions = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge mSyntethic__mDef____originalMethodDefinition = (EMoflonEdge) result4_green[7];

			Object[] result5_black = SyntethicMethodImpl
					.pattern_SyntethicMethod_0_5_collectcontextelements_blackBBBB(match, mClass, mSyntethic, mDef);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[mClass] = "
								+ mClass + ", " + "[mSyntethic] = " + mSyntethic + ", " + "[mDef] = " + mDef + ".");
			}
			SyntethicMethodImpl.pattern_SyntethicMethod_0_5_collectcontextelements_greenBBB(match, mClass, mDef);

			// 
			SyntethicMethodImpl.pattern_SyntethicMethod_0_6_registerobjectstomatch_expressionBBBBB(this, match, mClass,
					mSyntethic, mDef);
			return SyntethicMethodImpl.pattern_SyntethicMethod_0_7_expressionF();
		} else {
			return SyntethicMethodImpl.pattern_SyntethicMethod_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = SyntethicMethodImpl
				.pattern_SyntethicMethod_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType mClassDeclarationToTClass = (TypeToTAbstractType) result1_bindingAndBlack[0];
		TClass tClass = (TClass) result1_bindingAndBlack[1];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_bindingAndBlack[2];
		ClassDeclaration mClass = (ClassDeclaration) result1_bindingAndBlack[3];
		TMethodDefinition tDef = (TMethodDefinition) result1_bindingAndBlack[4];
		MSyntheticMethodDefinition mSyntethic = (MSyntheticMethodDefinition) result1_bindingAndBlack[5];
		MMethodDefinition mDef = (MMethodDefinition) result1_bindingAndBlack[6];
		TMethodSignature tSig = (TMethodSignature) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = SyntethicMethodImpl
				.pattern_SyntethicMethod_1_1_performtransformation_greenBFFBBB(tClass, tDef, mSyntethic, tSig);
		TSyntethicMethod tSyntethic = (TSyntethicMethod) result1_green[1];
		MSyntethicMethodToTSyntethicMethod mSyntToTSynt = (MSyntethicMethodToTSyntethicMethod) result1_green[2];

		Object[] result2_black = SyntethicMethodImpl
				.pattern_SyntethicMethod_1_2_collecttranslatedelements_blackBBB(tSyntethic, mSyntToTSynt, mSyntethic);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSyntethic] = " + tSyntethic
					+ ", " + "[mSyntToTSynt] = " + mSyntToTSynt + ", " + "[mSyntethic] = " + mSyntethic + ".");
		}
		Object[] result2_green = SyntethicMethodImpl
				.pattern_SyntethicMethod_1_2_collecttranslatedelements_greenFBBB(tSyntethic, mSyntToTSynt, mSyntethic);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SyntethicMethodImpl.pattern_SyntethicMethod_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, mClassDeclarationToTClass, tClass, tSyntethic, mDefinitionToTMember, mSyntToTSynt, mClass,
				tDef, mSyntethic, mDef, tSig);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mClassDeclarationToTClass] = " + mClassDeclarationToTClass + ", " + "[tClass] = "
					+ tClass + ", " + "[tSyntethic] = " + tSyntethic + ", " + "[mDefinitionToTMember] = "
					+ mDefinitionToTMember + ", " + "[mSyntToTSynt] = " + mSyntToTSynt + ", " + "[mClass] = " + mClass
					+ ", " + "[tDef] = " + tDef + ", " + "[mSyntethic] = " + mSyntethic + ", " + "[mDef] = " + mDef
					+ ", " + "[tSig] = " + tSig + ".");
		}
		SyntethicMethodImpl.pattern_SyntethicMethod_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(ruleresult,
				tClass, tSyntethic, mSyntToTSynt, mClass, tDef, mSyntethic, mDef, tSig);
		//nothing EMoflonEdge tClass__tSyntethic____defines = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tSyntethic__tClass____definedBy = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tSyntethic__tSig____signature = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tSig__tSyntethic____definitions = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mSyntToTSynt__tSyntethic____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mClass__mSyntethic____bodyDeclarations = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mSyntethic__mClass____abstractTypeDeclaration = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tDef__tSyntethic____syntethicMethods = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tSyntethic__tDef____originalMethodDefinition = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge mSyntToTSynt__mSyntethic____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge mDef__mSyntethic____syntheticMethodDefinitions = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge mSyntethic__mDef____originalMethodDefinition = (EMoflonEdge) result3_green[20];

		// 
		// 
		SyntethicMethodImpl.pattern_SyntethicMethod_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				mClassDeclarationToTClass, tClass, tSyntethic, mDefinitionToTMember, mSyntToTSynt, mClass, tDef,
				mSyntethic, mDef, tSig);
		return SyntethicMethodImpl.pattern_SyntethicMethod_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = SyntethicMethodImpl
				.pattern_SyntethicMethod_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SyntethicMethodImpl
				.pattern_SyntethicMethod_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = SyntethicMethodImpl.pattern_SyntethicMethod_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ClassDeclaration mClass = (ClassDeclaration) result2_binding[0];
		MSyntheticMethodDefinition mSyntethic = (MSyntheticMethodDefinition) result2_binding[1];
		MMethodDefinition mDef = (MMethodDefinition) result2_binding[2];
		for (Object[] result2_black : SyntethicMethodImpl.pattern_SyntethicMethod_2_2_corematch_blackFFFBFBBB(mClass,
				mSyntethic, mDef, match)) {
			TypeToTAbstractType mClassDeclarationToTClass = (TypeToTAbstractType) result2_black[0];
			TClass tClass = (TClass) result2_black[1];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result2_black[2];
			TMethodDefinition tDef = (TMethodDefinition) result2_black[4];
			// ForEach 
			for (Object[] result3_black : SyntethicMethodImpl.pattern_SyntethicMethod_2_3_findcontext_blackBBBBBBBF(
					mClassDeclarationToTClass, tClass, mDefinitionToTMember, mClass, tDef, mSyntethic, mDef)) {
				TMethodSignature tSig = (TMethodSignature) result3_black[7];
				Object[] result3_green = SyntethicMethodImpl
						.pattern_SyntethicMethod_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(mClassDeclarationToTClass,
								tClass, mDefinitionToTMember, mClass, tDef, mSyntethic, mDef, tSig);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge mClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mClass__mSyntethic____bodyDeclarations = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mSyntethic__mClass____abstractTypeDeclaration = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mDefinitionToTMember__tDef____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tDef__tSig____signature = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tSig__tDef____definitions = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mClassDeclarationToTClass__mClass____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mDef__mSyntethic____syntheticMethodDefinitions = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mSyntethic__mDef____originalMethodDefinition = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mDefinitionToTMember__mDef____source = (EMoflonEdge) result3_green[18];

				Object[] result4_bindingAndBlack = SyntethicMethodImpl
						.pattern_SyntethicMethod_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								mClassDeclarationToTClass, tClass, mDefinitionToTMember, mClass, tDef, mSyntethic, mDef,
								tSig);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mClassDeclarationToTClass] = "
							+ mClassDeclarationToTClass + ", " + "[tClass] = " + tClass + ", "
							+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[mClass] = " + mClass + ", "
							+ "[tDef] = " + tDef + ", " + "[mSyntethic] = " + mSyntethic + ", " + "[mDef] = " + mDef
							+ ", " + "[tSig] = " + tSig + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (SyntethicMethodImpl.pattern_SyntethicMethod_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = SyntethicMethodImpl
							.pattern_SyntethicMethod_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					SyntethicMethodImpl.pattern_SyntethicMethod_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return SyntethicMethodImpl.pattern_SyntethicMethod_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ClassDeclaration mClass, MSyntheticMethodDefinition mSyntethic,
			MMethodDefinition mDef) {
		match.registerObject("mClass", mClass);
		match.registerObject("mSyntethic", mSyntethic);
		match.registerObject("mDef", mDef);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ClassDeclaration mClass, MSyntheticMethodDefinition mSyntethic,
			MMethodDefinition mDef) {// Create CSP
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
			TypeToTAbstractType mClassDeclarationToTClass, TClass tClass, MDefinitionToTMember mDefinitionToTMember,
			ClassDeclaration mClass, TMethodDefinition tDef, MSyntheticMethodDefinition mSyntethic,
			MMethodDefinition mDef, TMethodSignature tSig) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mClassDeclarationToTClass", mClassDeclarationToTClass);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		isApplicableMatch.registerObject("mClass", mClass);
		isApplicableMatch.registerObject("tDef", tDef);
		isApplicableMatch.registerObject("mSyntethic", mSyntethic);
		isApplicableMatch.registerObject("mDef", mDef);
		isApplicableMatch.registerObject("tSig", tSig);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mClassDeclarationToTClass, EObject tClass,
			EObject tSyntethic, EObject mDefinitionToTMember, EObject mSyntToTSynt, EObject mClass, EObject tDef,
			EObject mSyntethic, EObject mDef, EObject tSig) {
		ruleresult.registerObject("mClassDeclarationToTClass", mClassDeclarationToTClass);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("tSyntethic", tSyntethic);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mSyntToTSynt", mSyntToTSynt);
		ruleresult.registerObject("mClass", mClass);
		ruleresult.registerObject("tDef", tDef);
		ruleresult.registerObject("mSyntethic", mSyntethic);
		ruleresult.registerObject("mDef", mDef);
		ruleresult.registerObject("tSig", tSig);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mSyntethic").eClass())
				.equals("modisco.MSyntheticMethodDefinition.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TClass tClass, TSyntethicMethod tSyntethic, TMethodDefinition tDef,
			TMethodSignature tSig) {

		Object[] result1_black = SyntethicMethodImpl.pattern_SyntethicMethod_10_1_initialbindings_blackBBBBBB(this,
				match, tClass, tSyntethic, tDef, tSig);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tClass] = " + tClass + ", " + "[tSyntethic] = " + tSyntethic
					+ ", " + "[tDef] = " + tDef + ", " + "[tSig] = " + tSig + ".");
		}

		Object[] result2_bindingAndBlack = SyntethicMethodImpl
				.pattern_SyntethicMethod_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, tClass, tSyntethic, tDef,
						tSig);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tClass] = " + tClass + ", " + "[tSyntethic] = " + tSyntethic
					+ ", " + "[tDef] = " + tDef + ", " + "[tSig] = " + tSig + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SyntethicMethodImpl.pattern_SyntethicMethod_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SyntethicMethodImpl
					.pattern_SyntethicMethod_10_4_collectelementstobetranslated_blackBBBBB(match, tClass, tSyntethic,
							tDef, tSig);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tClass] = " + tClass + ", " + "[tSyntethic] = " + tSyntethic + ", " + "[tDef] = " + tDef
						+ ", " + "[tSig] = " + tSig + ".");
			}
			SyntethicMethodImpl.pattern_SyntethicMethod_10_4_collectelementstobetranslated_greenBBBBBFFFFFF(match,
					tClass, tSyntethic, tDef, tSig);
			//nothing EMoflonEdge tClass__tSyntethic____defines = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tSyntethic__tClass____definedBy = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge tSyntethic__tSig____signature = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tSig__tSyntethic____definitions = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge tDef__tSyntethic____syntethicMethods = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge tSyntethic__tDef____originalMethodDefinition = (EMoflonEdge) result4_green[10];

			Object[] result5_black = SyntethicMethodImpl.pattern_SyntethicMethod_10_5_collectcontextelements_blackBBBBB(
					match, tClass, tSyntethic, tDef, tSig);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tClass] = " + tClass + ", " + "[tSyntethic] = " + tSyntethic + ", " + "[tDef] = " + tDef
						+ ", " + "[tSig] = " + tSig + ".");
			}
			SyntethicMethodImpl.pattern_SyntethicMethod_10_5_collectcontextelements_greenBBBBFF(match, tClass, tDef,
					tSig);
			//nothing EMoflonEdge tDef__tSig____signature = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge tSig__tDef____definitions = (EMoflonEdge) result5_green[5];

			// 
			SyntethicMethodImpl.pattern_SyntethicMethod_10_6_registerobjectstomatch_expressionBBBBBB(this, match,
					tClass, tSyntethic, tDef, tSig);
			return SyntethicMethodImpl.pattern_SyntethicMethod_10_7_expressionF();
		} else {
			return SyntethicMethodImpl.pattern_SyntethicMethod_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = SyntethicMethodImpl
				.pattern_SyntethicMethod_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType mClassDeclarationToTClass = (TypeToTAbstractType) result1_bindingAndBlack[0];
		TClass tClass = (TClass) result1_bindingAndBlack[1];
		TSyntethicMethod tSyntethic = (TSyntethicMethod) result1_bindingAndBlack[2];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_bindingAndBlack[3];
		ClassDeclaration mClass = (ClassDeclaration) result1_bindingAndBlack[4];
		TMethodDefinition tDef = (TMethodDefinition) result1_bindingAndBlack[5];
		MMethodDefinition mDef = (MMethodDefinition) result1_bindingAndBlack[6];
		TMethodSignature tSig = (TMethodSignature) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = SyntethicMethodImpl
				.pattern_SyntethicMethod_11_1_performtransformation_greenBFBFB(tSyntethic, mClass, mDef);
		MSyntethicMethodToTSyntethicMethod mSyntToTSynt = (MSyntethicMethodToTSyntethicMethod) result1_green[1];
		MSyntheticMethodDefinition mSyntethic = (MSyntheticMethodDefinition) result1_green[3];

		Object[] result2_black = SyntethicMethodImpl
				.pattern_SyntethicMethod_11_2_collecttranslatedelements_blackBBB(tSyntethic, mSyntToTSynt, mSyntethic);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSyntethic] = " + tSyntethic
					+ ", " + "[mSyntToTSynt] = " + mSyntToTSynt + ", " + "[mSyntethic] = " + mSyntethic + ".");
		}
		Object[] result2_green = SyntethicMethodImpl
				.pattern_SyntethicMethod_11_2_collecttranslatedelements_greenFBBB(tSyntethic, mSyntToTSynt, mSyntethic);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SyntethicMethodImpl.pattern_SyntethicMethod_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, mClassDeclarationToTClass, tClass, tSyntethic, mDefinitionToTMember, mSyntToTSynt, mClass,
				tDef, mSyntethic, mDef, tSig);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mClassDeclarationToTClass] = " + mClassDeclarationToTClass + ", " + "[tClass] = "
					+ tClass + ", " + "[tSyntethic] = " + tSyntethic + ", " + "[mDefinitionToTMember] = "
					+ mDefinitionToTMember + ", " + "[mSyntToTSynt] = " + mSyntToTSynt + ", " + "[mClass] = " + mClass
					+ ", " + "[tDef] = " + tDef + ", " + "[mSyntethic] = " + mSyntethic + ", " + "[mDef] = " + mDef
					+ ", " + "[tSig] = " + tSig + ".");
		}
		SyntethicMethodImpl.pattern_SyntethicMethod_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(ruleresult,
				tClass, tSyntethic, mSyntToTSynt, mClass, tDef, mSyntethic, mDef, tSig);
		//nothing EMoflonEdge tClass__tSyntethic____defines = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tSyntethic__tClass____definedBy = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tSyntethic__tSig____signature = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tSig__tSyntethic____definitions = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mSyntToTSynt__tSyntethic____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mClass__mSyntethic____bodyDeclarations = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mSyntethic__mClass____abstractTypeDeclaration = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tDef__tSyntethic____syntethicMethods = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tSyntethic__tDef____originalMethodDefinition = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge mSyntToTSynt__mSyntethic____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge mDef__mSyntethic____syntheticMethodDefinitions = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge mSyntethic__mDef____originalMethodDefinition = (EMoflonEdge) result3_green[20];

		// 
		// 
		SyntethicMethodImpl.pattern_SyntethicMethod_11_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				mClassDeclarationToTClass, tClass, tSyntethic, mDefinitionToTMember, mSyntToTSynt, mClass, tDef,
				mSyntethic, mDef, tSig);
		return SyntethicMethodImpl.pattern_SyntethicMethod_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = SyntethicMethodImpl
				.pattern_SyntethicMethod_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SyntethicMethodImpl
				.pattern_SyntethicMethod_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = SyntethicMethodImpl.pattern_SyntethicMethod_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TClass tClass = (TClass) result2_binding[0];
		TSyntethicMethod tSyntethic = (TSyntethicMethod) result2_binding[1];
		TMethodDefinition tDef = (TMethodDefinition) result2_binding[2];
		TMethodSignature tSig = (TMethodSignature) result2_binding[3];
		for (Object[] result2_black : SyntethicMethodImpl.pattern_SyntethicMethod_12_2_corematch_blackFBBFFBFBB(tClass,
				tSyntethic, tDef, tSig, match)) {
			TypeToTAbstractType mClassDeclarationToTClass = (TypeToTAbstractType) result2_black[0];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result2_black[3];
			ClassDeclaration mClass = (ClassDeclaration) result2_black[4];
			MMethodDefinition mDef = (MMethodDefinition) result2_black[6];
			// ForEach 
			for (Object[] result3_black : SyntethicMethodImpl.pattern_SyntethicMethod_12_3_findcontext_blackBBBBBBBB(
					mClassDeclarationToTClass, tClass, tSyntethic, mDefinitionToTMember, mClass, tDef, mDef, tSig)) {
				Object[] result3_green = SyntethicMethodImpl
						.pattern_SyntethicMethod_12_3_findcontext_greenBBBBBBBBFFFFFFFFFFFFF(mClassDeclarationToTClass,
								tClass, tSyntethic, mDefinitionToTMember, mClass, tDef, mDef, tSig);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge tClass__tSyntethic____defines = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tSyntethic__tClass____definedBy = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tSyntethic__tSig____signature = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tSig__tSyntethic____definitions = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mDefinitionToTMember__tDef____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tDef__tSig____signature = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tSig__tDef____definitions = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge tDef__tSyntethic____syntethicMethods = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge tSyntethic__tDef____originalMethodDefinition = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mClassDeclarationToTClass__mClass____source = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge mDefinitionToTMember__mDef____source = (EMoflonEdge) result3_green[20];

				Object[] result4_bindingAndBlack = SyntethicMethodImpl
						.pattern_SyntethicMethod_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								mClassDeclarationToTClass, tClass, tSyntethic, mDefinitionToTMember, mClass, tDef, mDef,
								tSig);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mClassDeclarationToTClass] = "
							+ mClassDeclarationToTClass + ", " + "[tClass] = " + tClass + ", " + "[tSyntethic] = "
							+ tSyntethic + ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", "
							+ "[mClass] = " + mClass + ", " + "[tDef] = " + tDef + ", " + "[mDef] = " + mDef + ", "
							+ "[tSig] = " + tSig + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (SyntethicMethodImpl.pattern_SyntethicMethod_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = SyntethicMethodImpl
							.pattern_SyntethicMethod_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					SyntethicMethodImpl.pattern_SyntethicMethod_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return SyntethicMethodImpl.pattern_SyntethicMethod_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TClass tClass, TSyntethicMethod tSyntethic,
			TMethodDefinition tDef, TMethodSignature tSig) {
		match.registerObject("tClass", tClass);
		match.registerObject("tSyntethic", tSyntethic);
		match.registerObject("tDef", tDef);
		match.registerObject("tSig", tSig);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TClass tClass, TSyntethicMethod tSyntethic,
			TMethodDefinition tDef, TMethodSignature tSig) {// Create CSP
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
			TypeToTAbstractType mClassDeclarationToTClass, TClass tClass, TSyntethicMethod tSyntethic,
			MDefinitionToTMember mDefinitionToTMember, ClassDeclaration mClass, TMethodDefinition tDef,
			MMethodDefinition mDef, TMethodSignature tSig) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mClassDeclarationToTClass", mClassDeclarationToTClass);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("tSyntethic", tSyntethic);
		isApplicableMatch.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		isApplicableMatch.registerObject("mClass", mClass);
		isApplicableMatch.registerObject("tDef", tDef);
		isApplicableMatch.registerObject("mDef", mDef);
		isApplicableMatch.registerObject("tSig", tSig);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mClassDeclarationToTClass, EObject tClass,
			EObject tSyntethic, EObject mDefinitionToTMember, EObject mSyntToTSynt, EObject mClass, EObject tDef,
			EObject mSyntethic, EObject mDef, EObject tSig) {
		ruleresult.registerObject("mClassDeclarationToTClass", mClassDeclarationToTClass);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("tSyntethic", tSyntethic);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mSyntToTSynt", mSyntToTSynt);
		ruleresult.registerObject("mClass", mClass);
		ruleresult.registerObject("tDef", tDef);
		ruleresult.registerObject("mSyntethic", mSyntethic);
		ruleresult.registerObject("mDef", mDef);
		ruleresult.registerObject("tSig", tSig);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tSyntethic").eClass())
				.equals("basic.TSyntethicMethod.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_55(EMoflonEdge _edge_defines) {

		Object[] result1_bindingAndBlack = SyntethicMethodImpl
				.pattern_SyntethicMethod_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SyntethicMethodImpl.pattern_SyntethicMethod_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : SyntethicMethodImpl
				.pattern_SyntethicMethod_20_2_testcorematchandDECs_blackFFFFB(_edge_defines)) {
			TClass tClass = (TClass) result2_black[0];
			TSyntethicMethod tSyntethic = (TSyntethicMethod) result2_black[1];
			TMethodDefinition tDef = (TMethodDefinition) result2_black[2];
			TMethodSignature tSig = (TMethodSignature) result2_black[3];
			Object[] result2_green = SyntethicMethodImpl
					.pattern_SyntethicMethod_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SyntethicMethodImpl
					.pattern_SyntethicMethod_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, tClass, tSyntethic, tDef, tSig)) {
				// 
				if (SyntethicMethodImpl
						.pattern_SyntethicMethod_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = SyntethicMethodImpl
							.pattern_SyntethicMethod_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					SyntethicMethodImpl.pattern_SyntethicMethod_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SyntethicMethodImpl.pattern_SyntethicMethod_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_58(EMoflonEdge _edge_bodyDeclarations) {

		Object[] result1_bindingAndBlack = SyntethicMethodImpl
				.pattern_SyntethicMethod_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SyntethicMethodImpl.pattern_SyntethicMethod_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : SyntethicMethodImpl
				.pattern_SyntethicMethod_21_2_testcorematchandDECs_blackFFFB(_edge_bodyDeclarations)) {
			ClassDeclaration mClass = (ClassDeclaration) result2_black[0];
			MSyntheticMethodDefinition mSyntethic = (MSyntheticMethodDefinition) result2_black[1];
			MMethodDefinition mDef = (MMethodDefinition) result2_black[2];
			Object[] result2_green = SyntethicMethodImpl
					.pattern_SyntethicMethod_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SyntethicMethodImpl
					.pattern_SyntethicMethod_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, mClass, mSyntethic, mDef)) {
				// 
				if (SyntethicMethodImpl
						.pattern_SyntethicMethod_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = SyntethicMethodImpl
							.pattern_SyntethicMethod_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					SyntethicMethodImpl.pattern_SyntethicMethod_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SyntethicMethodImpl.pattern_SyntethicMethod_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SyntethicMethod");
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
		ruleResult.setRule("SyntethicMethod");
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

		Object[] result1_black = SyntethicMethodImpl.pattern_SyntethicMethod_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SyntethicMethodImpl.pattern_SyntethicMethod_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = SyntethicMethodImpl
				.pattern_SyntethicMethod_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TClass tClass = (TClass) result2_bindingAndBlack[0];
		TSyntethicMethod tSyntethic = (TSyntethicMethod) result2_bindingAndBlack[1];
		ClassDeclaration mClass = (ClassDeclaration) result2_bindingAndBlack[2];
		TMethodDefinition tDef = (TMethodDefinition) result2_bindingAndBlack[3];
		MSyntheticMethodDefinition mSyntethic = (MSyntheticMethodDefinition) result2_bindingAndBlack[4];
		MMethodDefinition mDef = (MMethodDefinition) result2_bindingAndBlack[5];
		TMethodSignature tSig = (TMethodSignature) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = SyntethicMethodImpl
				.pattern_SyntethicMethod_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, tClass, tSyntethic, mClass,
						tDef, mSyntethic, mDef, tSig, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ", " + "[tSyntethic] = " + tSyntethic + ", " + "[mClass] = " + mClass
					+ ", " + "[tDef] = " + tDef + ", " + "[mSyntethic] = " + mSyntethic + ", " + "[mDef] = " + mDef
					+ ", " + "[tSig] = " + tSig + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (SyntethicMethodImpl.pattern_SyntethicMethod_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : SyntethicMethodImpl
					.pattern_SyntethicMethod_24_5_matchcorrcontext_blackFBFBBBBB(tClass, mClass, tDef, mDef,
							sourceMatch, targetMatch)) {
				TypeToTAbstractType mClassDeclarationToTClass = (TypeToTAbstractType) result5_black[0];
				MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result5_black[2];
				Object[] result5_green = SyntethicMethodImpl.pattern_SyntethicMethod_24_5_matchcorrcontext_greenBBBBF(
						mClassDeclarationToTClass, mDefinitionToTMember, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = SyntethicMethodImpl
						.pattern_SyntethicMethod_24_6_createcorrespondence_blackBBBBBBBB(tClass, tSyntethic, mClass,
								tDef, mSyntethic, mDef, tSig, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass
							+ ", " + "[tSyntethic] = " + tSyntethic + ", " + "[mClass] = " + mClass + ", " + "[tDef] = "
							+ tDef + ", " + "[mSyntethic] = " + mSyntethic + ", " + "[mDef] = " + mDef + ", "
							+ "[tSig] = " + tSig + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				SyntethicMethodImpl.pattern_SyntethicMethod_24_6_createcorrespondence_greenBFBB(tSyntethic, mSyntethic,
						ccMatch);
				//nothing MSyntethicMethodToTSyntethicMethod mSyntToTSynt = (MSyntethicMethodToTSyntethicMethod) result6_green[1];

				Object[] result7_black = SyntethicMethodImpl
						.pattern_SyntethicMethod_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				SyntethicMethodImpl.pattern_SyntethicMethod_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return SyntethicMethodImpl.pattern_SyntethicMethod_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TClass tClass, TSyntethicMethod tSyntethic, ClassDeclaration mClass,
			TMethodDefinition tDef, MSyntheticMethodDefinition mSyntethic, MMethodDefinition mDef,
			TMethodSignature tSig, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(ClassDeclaration mClass, MSyntheticMethodDefinition mSyntethic,
			MMethodDefinition mDef) {// 
		Object[] result1_black = SyntethicMethodImpl.pattern_SyntethicMethod_27_1_matchtggpattern_blackBBB(mClass,
				mSyntethic, mDef);
		if (result1_black != null) {
			return SyntethicMethodImpl.pattern_SyntethicMethod_27_2_expressionF();
		} else {
			return SyntethicMethodImpl.pattern_SyntethicMethod_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TClass tClass, TSyntethicMethod tSyntethic, TMethodDefinition tDef,
			TMethodSignature tSig) {// 
		Object[] result1_black = SyntethicMethodImpl.pattern_SyntethicMethod_28_1_matchtggpattern_blackBBBB(tClass,
				tSyntethic, tDef, tSig);
		if (result1_black != null) {
			return SyntethicMethodImpl.pattern_SyntethicMethod_28_2_expressionF();
		} else {
			return SyntethicMethodImpl.pattern_SyntethicMethod_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mClassDeclarationToTClassParameter,
			MDefinitionToTMember mDefinitionToTMemberParameter) {

		Object[] result1_black = SyntethicMethodImpl.pattern_SyntethicMethod_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SyntethicMethodImpl.pattern_SyntethicMethod_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : SyntethicMethodImpl
				.pattern_SyntethicMethod_29_2_isapplicablecore_blackFFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mClassDeclarationToTClassList = (RuleEntryList) result2_black[0];
			TypeToTAbstractType mClassDeclarationToTClass = (TypeToTAbstractType) result2_black[1];
			TClass tClass = (TClass) result2_black[2];
			ClassDeclaration mClass = (ClassDeclaration) result2_black[3];
			//nothing RuleEntryList mDefinitionToTMemberList = (RuleEntryList) result2_black[4];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result2_black[5];
			TMethodDefinition tDef = (TMethodDefinition) result2_black[6];
			TMethodSignature tSig = (TMethodSignature) result2_black[7];
			MMethodDefinition mDef = (MMethodDefinition) result2_black[8];

			Object[] result3_bindingAndBlack = SyntethicMethodImpl
					.pattern_SyntethicMethod_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							mClassDeclarationToTClass, tClass, mDefinitionToTMember, mClass, tDef, mDef, tSig,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mClassDeclarationToTClass] = "
						+ mClassDeclarationToTClass + ", " + "[tClass] = " + tClass + ", " + "[mDefinitionToTMember] = "
						+ mDefinitionToTMember + ", " + "[mClass] = " + mClass + ", " + "[tDef] = " + tDef + ", "
						+ "[mDef] = " + mDef + ", " + "[tSig] = " + tSig + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (SyntethicMethodImpl.pattern_SyntethicMethod_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = SyntethicMethodImpl.pattern_SyntethicMethod_29_5_checknacs_blackBBBBBBB(
						mClassDeclarationToTClass, tClass, mDefinitionToTMember, mClass, tDef, mDef, tSig);
				if (result5_black != null) {

					Object[] result6_black = SyntethicMethodImpl.pattern_SyntethicMethod_29_6_perform_blackBBBBBBBB(
							mClassDeclarationToTClass, tClass, mDefinitionToTMember, mClass, tDef, mDef, tSig,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[mClassDeclarationToTClass] = " + mClassDeclarationToTClass + ", " + "[tClass] = "
								+ tClass + ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", "
								+ "[mClass] = " + mClass + ", " + "[tDef] = " + tDef + ", " + "[mDef] = " + mDef + ", "
								+ "[tSig] = " + tSig + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					SyntethicMethodImpl.pattern_SyntethicMethod_29_6_perform_greenBFFBBFBBB(tClass, mClass, tDef, mDef,
							tSig, ruleResult);
					//nothing TSyntethicMethod tSyntethic = (TSyntethicMethod) result6_green[1];
					//nothing MSyntethicMethodToTSyntethicMethod mSyntToTSynt = (MSyntethicMethodToTSyntethicMethod) result6_green[2];
					//nothing MSyntheticMethodDefinition mSyntethic = (MSyntheticMethodDefinition) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return SyntethicMethodImpl.pattern_SyntethicMethod_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType mClassDeclarationToTClass, TClass tClass, MDefinitionToTMember mDefinitionToTMember,
			ClassDeclaration mClass, TMethodDefinition tDef, MMethodDefinition mDef, TMethodSignature tSig,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mClassDeclarationToTClass", mClassDeclarationToTClass);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		isApplicableMatch.registerObject("mClass", mClass);
		isApplicableMatch.registerObject("tDef", tDef);
		isApplicableMatch.registerObject("mDef", mDef);
		isApplicableMatch.registerObject("tSig", tSig);
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
		case RulesPackage.SYNTETHIC_METHOD___IS_APPROPRIATE_FWD__MATCH_CLASSDECLARATION_MSYNTHETICMETHODDEFINITION_MMETHODDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(MSyntheticMethodDefinition) arguments.get(2), (MMethodDefinition) arguments.get(3));
		case RulesPackage.SYNTETHIC_METHOD___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SYNTETHIC_METHOD___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SYNTETHIC_METHOD___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSDECLARATION_MSYNTHETICMETHODDEFINITION_MMETHODDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(MSyntheticMethodDefinition) arguments.get(2), (MMethodDefinition) arguments.get(3));
			return null;
		case RulesPackage.SYNTETHIC_METHOD___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSDECLARATION_MSYNTHETICMETHODDEFINITION_MMETHODDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(MSyntheticMethodDefinition) arguments.get(2), (MMethodDefinition) arguments.get(3));
		case RulesPackage.SYNTETHIC_METHOD___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SYNTETHIC_METHOD___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TCLASS_MDEFINITIONTOTMEMBER_CLASSDECLARATION_TMETHODDEFINITION_MSYNTHETICMETHODDEFINITION_MMETHODDEFINITION_TMETHODSIGNATURE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TClass) arguments.get(2),
					(MDefinitionToTMember) arguments.get(3), (ClassDeclaration) arguments.get(4),
					(TMethodDefinition) arguments.get(5), (MSyntheticMethodDefinition) arguments.get(6),
					(MMethodDefinition) arguments.get(7), (TMethodSignature) arguments.get(8));
		case RulesPackage.SYNTETHIC_METHOD___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SYNTETHIC_METHOD___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.SYNTETHIC_METHOD___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SYNTETHIC_METHOD___IS_APPROPRIATE_BWD__MATCH_TCLASS_TSYNTETHICMETHOD_TMETHODDEFINITION_TMETHODSIGNATURE:
			return isAppropriate_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TSyntethicMethod) arguments.get(2), (TMethodDefinition) arguments.get(3),
					(TMethodSignature) arguments.get(4));
		case RulesPackage.SYNTETHIC_METHOD___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SYNTETHIC_METHOD___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SYNTETHIC_METHOD___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TSYNTETHICMETHOD_TMETHODDEFINITION_TMETHODSIGNATURE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TSyntethicMethod) arguments.get(2), (TMethodDefinition) arguments.get(3),
					(TMethodSignature) arguments.get(4));
			return null;
		case RulesPackage.SYNTETHIC_METHOD___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TSYNTETHICMETHOD_TMETHODDEFINITION_TMETHODSIGNATURE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TSyntethicMethod) arguments.get(2), (TMethodDefinition) arguments.get(3),
					(TMethodSignature) arguments.get(4));
		case RulesPackage.SYNTETHIC_METHOD___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SYNTETHIC_METHOD___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TCLASS_TSYNTETHICMETHOD_MDEFINITIONTOTMEMBER_CLASSDECLARATION_TMETHODDEFINITION_MMETHODDEFINITION_TMETHODSIGNATURE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TClass) arguments.get(2),
					(TSyntethicMethod) arguments.get(3), (MDefinitionToTMember) arguments.get(4),
					(ClassDeclaration) arguments.get(5), (TMethodDefinition) arguments.get(6),
					(MMethodDefinition) arguments.get(7), (TMethodSignature) arguments.get(8));
		case RulesPackage.SYNTETHIC_METHOD___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SYNTETHIC_METHOD___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.SYNTETHIC_METHOD___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SYNTETHIC_METHOD___IS_APPROPRIATE_BWD_EMOFLON_EDGE_55__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_55((EMoflonEdge) arguments.get(0));
		case RulesPackage.SYNTETHIC_METHOD___IS_APPROPRIATE_FWD_EMOFLON_EDGE_58__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_58((EMoflonEdge) arguments.get(0));
		case RulesPackage.SYNTETHIC_METHOD___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SYNTETHIC_METHOD___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SYNTETHIC_METHOD___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SYNTETHIC_METHOD___IS_APPLICABLE_SOLVE_CSP_CC__TCLASS_TSYNTETHICMETHOD_CLASSDECLARATION_TMETHODDEFINITION_MSYNTHETICMETHODDEFINITION_MMETHODDEFINITION_TMETHODSIGNATURE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TClass) arguments.get(0), (TSyntethicMethod) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (TMethodDefinition) arguments.get(3),
					(MSyntheticMethodDefinition) arguments.get(4), (MMethodDefinition) arguments.get(5),
					(TMethodSignature) arguments.get(6), (Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.SYNTETHIC_METHOD___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.SYNTETHIC_METHOD___CHECK_DEC_FWD__CLASSDECLARATION_MSYNTHETICMETHODDEFINITION_MMETHODDEFINITION:
			return checkDEC_FWD((ClassDeclaration) arguments.get(0), (MSyntheticMethodDefinition) arguments.get(1),
					(MMethodDefinition) arguments.get(2));
		case RulesPackage.SYNTETHIC_METHOD___CHECK_DEC_BWD__TCLASS_TSYNTETHICMETHOD_TMETHODDEFINITION_TMETHODSIGNATURE:
			return checkDEC_BWD((TClass) arguments.get(0), (TSyntethicMethod) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (TMethodSignature) arguments.get(3));
		case RulesPackage.SYNTETHIC_METHOD___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(MDefinitionToTMember) arguments.get(2));
		case RulesPackage.SYNTETHIC_METHOD___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TCLASS_MDEFINITIONTOTMEMBER_CLASSDECLARATION_TMETHODDEFINITION_MMETHODDEFINITION_TMETHODSIGNATURE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TClass) arguments.get(2),
					(MDefinitionToTMember) arguments.get(3), (ClassDeclaration) arguments.get(4),
					(TMethodDefinition) arguments.get(5), (MMethodDefinition) arguments.get(6),
					(TMethodSignature) arguments.get(7), (ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.SYNTETHIC_METHOD___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SyntethicMethod_0_1_initialbindings_blackBBBBB(SyntethicMethod _this,
			Match match, ClassDeclaration mClass, MSyntheticMethodDefinition mSyntethic, MMethodDefinition mDef) {
		return new Object[] { _this, match, mClass, mSyntethic, mDef };
	}

	public static final Object[] pattern_SyntethicMethod_0_2_SolveCSP_bindingFBBBBB(SyntethicMethod _this, Match match,
			ClassDeclaration mClass, MSyntheticMethodDefinition mSyntethic, MMethodDefinition mDef) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mClass, mSyntethic, mDef);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mClass, mSyntethic, mDef };
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SyntethicMethod_0_2_SolveCSP_bindingAndBlackFBBBBB(SyntethicMethod _this,
			Match match, ClassDeclaration mClass, MSyntheticMethodDefinition mSyntethic, MMethodDefinition mDef) {
		Object[] result_pattern_SyntethicMethod_0_2_SolveCSP_binding = pattern_SyntethicMethod_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mClass, mSyntethic, mDef);
		if (result_pattern_SyntethicMethod_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SyntethicMethod_0_2_SolveCSP_binding[0];

			Object[] result_pattern_SyntethicMethod_0_2_SolveCSP_black = pattern_SyntethicMethod_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SyntethicMethod_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mClass, mSyntethic, mDef };
			}
		}
		return null;
	}

	public static final boolean pattern_SyntethicMethod_0_3_CheckCSP_expressionFBB(SyntethicMethod _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_0_4_collectelementstobetranslated_blackBBBB(Match match,
			ClassDeclaration mClass, MSyntheticMethodDefinition mSyntethic, MMethodDefinition mDef) {
		return new Object[] { match, mClass, mSyntethic, mDef };
	}

	public static final Object[] pattern_SyntethicMethod_0_4_collectelementstobetranslated_greenBBBBFFFF(Match match,
			ClassDeclaration mClass, MSyntheticMethodDefinition mSyntethic, MMethodDefinition mDef) {
		EMoflonEdge mClass__mSyntethic____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSyntethic__mClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDef__mSyntethic____syntheticMethodDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSyntethic__mDef____originalMethodDefinition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mSyntethic);
		String mClass__mSyntethic____bodyDeclarations_name_prime = "bodyDeclarations";
		String mSyntethic__mClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mDef__mSyntethic____syntheticMethodDefinitions_name_prime = "syntheticMethodDefinitions";
		String mSyntethic__mDef____originalMethodDefinition_name_prime = "originalMethodDefinition";
		mClass__mSyntethic____bodyDeclarations.setSrc(mClass);
		mClass__mSyntethic____bodyDeclarations.setTrg(mSyntethic);
		match.getToBeTranslatedEdges().add(mClass__mSyntethic____bodyDeclarations);
		mSyntethic__mClass____abstractTypeDeclaration.setSrc(mSyntethic);
		mSyntethic__mClass____abstractTypeDeclaration.setTrg(mClass);
		match.getToBeTranslatedEdges().add(mSyntethic__mClass____abstractTypeDeclaration);
		mDef__mSyntethic____syntheticMethodDefinitions.setSrc(mDef);
		mDef__mSyntethic____syntheticMethodDefinitions.setTrg(mSyntethic);
		match.getToBeTranslatedEdges().add(mDef__mSyntethic____syntheticMethodDefinitions);
		mSyntethic__mDef____originalMethodDefinition.setSrc(mSyntethic);
		mSyntethic__mDef____originalMethodDefinition.setTrg(mDef);
		match.getToBeTranslatedEdges().add(mSyntethic__mDef____originalMethodDefinition);
		mClass__mSyntethic____bodyDeclarations.setName(mClass__mSyntethic____bodyDeclarations_name_prime);
		mSyntethic__mClass____abstractTypeDeclaration.setName(mSyntethic__mClass____abstractTypeDeclaration_name_prime);
		mDef__mSyntethic____syntheticMethodDefinitions
				.setName(mDef__mSyntethic____syntheticMethodDefinitions_name_prime);
		mSyntethic__mDef____originalMethodDefinition.setName(mSyntethic__mDef____originalMethodDefinition_name_prime);
		return new Object[] { match, mClass, mSyntethic, mDef, mClass__mSyntethic____bodyDeclarations,
				mSyntethic__mClass____abstractTypeDeclaration, mDef__mSyntethic____syntheticMethodDefinitions,
				mSyntethic__mDef____originalMethodDefinition };
	}

	public static final Object[] pattern_SyntethicMethod_0_5_collectcontextelements_blackBBBB(Match match,
			ClassDeclaration mClass, MSyntheticMethodDefinition mSyntethic, MMethodDefinition mDef) {
		return new Object[] { match, mClass, mSyntethic, mDef };
	}

	public static final Object[] pattern_SyntethicMethod_0_5_collectcontextelements_greenBBB(Match match,
			ClassDeclaration mClass, MMethodDefinition mDef) {
		match.getContextNodes().add(mClass);
		match.getContextNodes().add(mDef);
		return new Object[] { match, mClass, mDef };
	}

	public static final void pattern_SyntethicMethod_0_6_registerobjectstomatch_expressionBBBBB(SyntethicMethod _this,
			Match match, ClassDeclaration mClass, MSyntheticMethodDefinition mSyntethic, MMethodDefinition mDef) {
		_this.registerObjectsToMatch_FWD(match, mClass, mSyntethic, mDef);

	}

	public static final boolean pattern_SyntethicMethod_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SyntethicMethod_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mClassDeclarationToTClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_2 = isApplicableMatch.getObject("mDefinitionToTMember");
		EObject _localVariable_3 = isApplicableMatch.getObject("mClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("tDef");
		EObject _localVariable_5 = isApplicableMatch.getObject("mSyntethic");
		EObject _localVariable_6 = isApplicableMatch.getObject("mDef");
		EObject _localVariable_7 = isApplicableMatch.getObject("tSig");
		EObject tmpMClassDeclarationToTClass = _localVariable_0;
		EObject tmpTClass = _localVariable_1;
		EObject tmpMDefinitionToTMember = _localVariable_2;
		EObject tmpMClass = _localVariable_3;
		EObject tmpTDef = _localVariable_4;
		EObject tmpMSyntethic = _localVariable_5;
		EObject tmpMDef = _localVariable_6;
		EObject tmpTSig = _localVariable_7;
		if (tmpMClassDeclarationToTClass instanceof TypeToTAbstractType) {
			TypeToTAbstractType mClassDeclarationToTClass = (TypeToTAbstractType) tmpMClassDeclarationToTClass;
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				if (tmpMDefinitionToTMember instanceof MDefinitionToTMember) {
					MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) tmpMDefinitionToTMember;
					if (tmpMClass instanceof ClassDeclaration) {
						ClassDeclaration mClass = (ClassDeclaration) tmpMClass;
						if (tmpTDef instanceof TMethodDefinition) {
							TMethodDefinition tDef = (TMethodDefinition) tmpTDef;
							if (tmpMSyntethic instanceof MSyntheticMethodDefinition) {
								MSyntheticMethodDefinition mSyntethic = (MSyntheticMethodDefinition) tmpMSyntethic;
								if (tmpMDef instanceof MMethodDefinition) {
									MMethodDefinition mDef = (MMethodDefinition) tmpMDef;
									if (tmpTSig instanceof TMethodSignature) {
										TMethodSignature tSig = (TMethodSignature) tmpTSig;
										return new Object[] { mClassDeclarationToTClass, tClass, mDefinitionToTMember,
												mClass, tDef, mSyntethic, mDef, tSig, isApplicableMatch };
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

	public static final Object[] pattern_SyntethicMethod_1_1_performtransformation_blackBBBBBBBBFBB(
			TypeToTAbstractType mClassDeclarationToTClass, TClass tClass, MDefinitionToTMember mDefinitionToTMember,
			ClassDeclaration mClass, TMethodDefinition tDef, MSyntheticMethodDefinition mSyntethic,
			MMethodDefinition mDef, TMethodSignature tSig, SyntethicMethod _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mClassDeclarationToTClass, tClass, mDefinitionToTMember, mClass, tDef, mSyntethic,
						mDef, tSig, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			SyntethicMethod _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SyntethicMethod_1_1_performtransformation_binding = pattern_SyntethicMethod_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_SyntethicMethod_1_1_performtransformation_binding != null) {
			TypeToTAbstractType mClassDeclarationToTClass = (TypeToTAbstractType) result_pattern_SyntethicMethod_1_1_performtransformation_binding[0];
			TClass tClass = (TClass) result_pattern_SyntethicMethod_1_1_performtransformation_binding[1];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result_pattern_SyntethicMethod_1_1_performtransformation_binding[2];
			ClassDeclaration mClass = (ClassDeclaration) result_pattern_SyntethicMethod_1_1_performtransformation_binding[3];
			TMethodDefinition tDef = (TMethodDefinition) result_pattern_SyntethicMethod_1_1_performtransformation_binding[4];
			MSyntheticMethodDefinition mSyntethic = (MSyntheticMethodDefinition) result_pattern_SyntethicMethod_1_1_performtransformation_binding[5];
			MMethodDefinition mDef = (MMethodDefinition) result_pattern_SyntethicMethod_1_1_performtransformation_binding[6];
			TMethodSignature tSig = (TMethodSignature) result_pattern_SyntethicMethod_1_1_performtransformation_binding[7];

			Object[] result_pattern_SyntethicMethod_1_1_performtransformation_black = pattern_SyntethicMethod_1_1_performtransformation_blackBBBBBBBBFBB(
					mClassDeclarationToTClass, tClass, mDefinitionToTMember, mClass, tDef, mSyntethic, mDef, tSig,
					_this, isApplicableMatch);
			if (result_pattern_SyntethicMethod_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SyntethicMethod_1_1_performtransformation_black[8];

				return new Object[] { mClassDeclarationToTClass, tClass, mDefinitionToTMember, mClass, tDef, mSyntethic,
						mDef, tSig, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_1_1_performtransformation_greenBFFBBB(TClass tClass,
			TMethodDefinition tDef, MSyntheticMethodDefinition mSyntethic, TMethodSignature tSig) {
		TSyntethicMethod tSyntethic = BasicFactory.eINSTANCE.createTSyntethicMethod();
		MSyntethicMethodToTSyntethicMethod mSyntToTSynt = PmFactory.eINSTANCE
				.createMSyntethicMethodToTSyntethicMethod();
		tClass.getDefines().add(tSyntethic);
		tSyntethic.setSignature(tSig);
		tDef.getSyntethicMethods().add(tSyntethic);
		mSyntToTSynt.setTarget(tSyntethic);
		mSyntToTSynt.setSource(mSyntethic);
		return new Object[] { tClass, tSyntethic, mSyntToTSynt, tDef, mSyntethic, tSig };
	}

	public static final Object[] pattern_SyntethicMethod_1_2_collecttranslatedelements_blackBBB(
			TSyntethicMethod tSyntethic, MSyntethicMethodToTSyntethicMethod mSyntToTSynt,
			MSyntheticMethodDefinition mSyntethic) {
		return new Object[] { tSyntethic, mSyntToTSynt, mSyntethic };
	}

	public static final Object[] pattern_SyntethicMethod_1_2_collecttranslatedelements_greenFBBB(
			TSyntethicMethod tSyntethic, MSyntethicMethodToTSyntethicMethod mSyntToTSynt,
			MSyntheticMethodDefinition mSyntethic) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tSyntethic);
		ruleresult.getCreatedLinkElements().add(mSyntToTSynt);
		ruleresult.getTranslatedElements().add(mSyntethic);
		return new Object[] { ruleresult, tSyntethic, mSyntToTSynt, mSyntethic };
	}

	public static final Object[] pattern_SyntethicMethod_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mClassDeclarationToTClass, EObject tClass, EObject tSyntethic,
			EObject mDefinitionToTMember, EObject mSyntToTSynt, EObject mClass, EObject tDef, EObject mSyntethic,
			EObject mDef, EObject tSig) {
		if (!mClassDeclarationToTClass.equals(tClass)) {
			if (!mClassDeclarationToTClass.equals(tSyntethic)) {
				if (!mClassDeclarationToTClass.equals(mDefinitionToTMember)) {
					if (!mClassDeclarationToTClass.equals(mSyntToTSynt)) {
						if (!mClassDeclarationToTClass.equals(tDef)) {
							if (!mClassDeclarationToTClass.equals(mSyntethic)) {
								if (!mClassDeclarationToTClass.equals(mDef)) {
									if (!mClassDeclarationToTClass.equals(tSig)) {
										if (!tClass.equals(tSyntethic)) {
											if (!tClass.equals(tDef)) {
												if (!tClass.equals(tSig)) {
													if (!mDefinitionToTMember.equals(tClass)) {
														if (!mDefinitionToTMember.equals(tSyntethic)) {
															if (!mDefinitionToTMember.equals(mSyntToTSynt)) {
																if (!mDefinitionToTMember.equals(tDef)) {
																	if (!mDefinitionToTMember.equals(mSyntethic)) {
																		if (!mDefinitionToTMember.equals(tSig)) {
																			if (!mSyntToTSynt.equals(tClass)) {
																				if (!mSyntToTSynt.equals(tSyntethic)) {
																					if (!mSyntToTSynt.equals(tDef)) {
																						if (!mSyntToTSynt
																								.equals(mSyntethic)) {
																							if (!mSyntToTSynt
																									.equals(tSig)) {
																								if (!mClass.equals(
																										mClassDeclarationToTClass)) {
																									if (!mClass.equals(
																											tClass)) {
																										if (!mClass
																												.equals(tSyntethic)) {
																											if (!mClass
																													.equals(mDefinitionToTMember)) {
																												if (!mClass
																														.equals(mSyntToTSynt)) {
																													if (!mClass
																															.equals(tDef)) {
																														if (!mClass
																																.equals(mSyntethic)) {
																															if (!mClass
																																	.equals(mDef)) {
																																if (!mClass
																																		.equals(tSig)) {
																																	if (!tDef
																																			.equals(tSyntethic)) {
																																		if (!tDef
																																				.equals(tSig)) {
																																			if (!mSyntethic
																																					.equals(tClass)) {
																																				if (!mSyntethic
																																						.equals(tSyntethic)) {
																																					if (!mSyntethic
																																							.equals(tDef)) {
																																						if (!mSyntethic
																																								.equals(tSig)) {
																																							if (!mDef
																																									.equals(tClass)) {
																																								if (!mDef
																																										.equals(tSyntethic)) {
																																									if (!mDef
																																											.equals(mDefinitionToTMember)) {
																																										if (!mDef
																																												.equals(mSyntToTSynt)) {
																																											if (!mDef
																																													.equals(tDef)) {
																																												if (!mDef
																																														.equals(mSyntethic)) {
																																													if (!mDef
																																															.equals(tSig)) {
																																														if (!tSig
																																																.equals(tSyntethic)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mClassDeclarationToTClass,
																																																	tClass,
																																																	tSyntethic,
																																																	mDefinitionToTMember,
																																																	mSyntToTSynt,
																																																	mClass,
																																																	tDef,
																																																	mSyntethic,
																																																	mDef,
																																																	tSig };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SyntethicMethod_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tClass, EObject tSyntethic, EObject mSyntToTSynt, EObject mClass,
			EObject tDef, EObject mSyntethic, EObject mDef, EObject tSig) {
		EMoflonEdge tClass__tSyntethic____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSyntethic__tClass____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSyntethic__tSig____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSig__tSyntethic____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSyntToTSynt__tSyntethic____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mClass__mSyntethic____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSyntethic__mClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDef__tSyntethic____syntethicMethods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSyntethic__tDef____originalMethodDefinition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSyntToTSynt__mSyntethic____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDef__mSyntethic____syntheticMethodDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSyntethic__mDef____originalMethodDefinition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SyntethicMethod";
		String tClass__tSyntethic____defines_name_prime = "defines";
		String tSyntethic__tClass____definedBy_name_prime = "definedBy";
		String tSyntethic__tSig____signature_name_prime = "signature";
		String tSig__tSyntethic____definitions_name_prime = "definitions";
		String mSyntToTSynt__tSyntethic____target_name_prime = "target";
		String mClass__mSyntethic____bodyDeclarations_name_prime = "bodyDeclarations";
		String mSyntethic__mClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String tDef__tSyntethic____syntethicMethods_name_prime = "syntethicMethods";
		String tSyntethic__tDef____originalMethodDefinition_name_prime = "originalMethodDefinition";
		String mSyntToTSynt__mSyntethic____source_name_prime = "source";
		String mDef__mSyntethic____syntheticMethodDefinitions_name_prime = "syntheticMethodDefinitions";
		String mSyntethic__mDef____originalMethodDefinition_name_prime = "originalMethodDefinition";
		tClass__tSyntethic____defines.setSrc(tClass);
		tClass__tSyntethic____defines.setTrg(tSyntethic);
		ruleresult.getCreatedEdges().add(tClass__tSyntethic____defines);
		tSyntethic__tClass____definedBy.setSrc(tSyntethic);
		tSyntethic__tClass____definedBy.setTrg(tClass);
		ruleresult.getCreatedEdges().add(tSyntethic__tClass____definedBy);
		tSyntethic__tSig____signature.setSrc(tSyntethic);
		tSyntethic__tSig____signature.setTrg(tSig);
		ruleresult.getCreatedEdges().add(tSyntethic__tSig____signature);
		tSig__tSyntethic____definitions.setSrc(tSig);
		tSig__tSyntethic____definitions.setTrg(tSyntethic);
		ruleresult.getCreatedEdges().add(tSig__tSyntethic____definitions);
		mSyntToTSynt__tSyntethic____target.setSrc(mSyntToTSynt);
		mSyntToTSynt__tSyntethic____target.setTrg(tSyntethic);
		ruleresult.getCreatedEdges().add(mSyntToTSynt__tSyntethic____target);
		mClass__mSyntethic____bodyDeclarations.setSrc(mClass);
		mClass__mSyntethic____bodyDeclarations.setTrg(mSyntethic);
		ruleresult.getTranslatedEdges().add(mClass__mSyntethic____bodyDeclarations);
		mSyntethic__mClass____abstractTypeDeclaration.setSrc(mSyntethic);
		mSyntethic__mClass____abstractTypeDeclaration.setTrg(mClass);
		ruleresult.getTranslatedEdges().add(mSyntethic__mClass____abstractTypeDeclaration);
		tDef__tSyntethic____syntethicMethods.setSrc(tDef);
		tDef__tSyntethic____syntethicMethods.setTrg(tSyntethic);
		ruleresult.getCreatedEdges().add(tDef__tSyntethic____syntethicMethods);
		tSyntethic__tDef____originalMethodDefinition.setSrc(tSyntethic);
		tSyntethic__tDef____originalMethodDefinition.setTrg(tDef);
		ruleresult.getCreatedEdges().add(tSyntethic__tDef____originalMethodDefinition);
		mSyntToTSynt__mSyntethic____source.setSrc(mSyntToTSynt);
		mSyntToTSynt__mSyntethic____source.setTrg(mSyntethic);
		ruleresult.getCreatedEdges().add(mSyntToTSynt__mSyntethic____source);
		mDef__mSyntethic____syntheticMethodDefinitions.setSrc(mDef);
		mDef__mSyntethic____syntheticMethodDefinitions.setTrg(mSyntethic);
		ruleresult.getTranslatedEdges().add(mDef__mSyntethic____syntheticMethodDefinitions);
		mSyntethic__mDef____originalMethodDefinition.setSrc(mSyntethic);
		mSyntethic__mDef____originalMethodDefinition.setTrg(mDef);
		ruleresult.getTranslatedEdges().add(mSyntethic__mDef____originalMethodDefinition);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tClass__tSyntethic____defines.setName(tClass__tSyntethic____defines_name_prime);
		tSyntethic__tClass____definedBy.setName(tSyntethic__tClass____definedBy_name_prime);
		tSyntethic__tSig____signature.setName(tSyntethic__tSig____signature_name_prime);
		tSig__tSyntethic____definitions.setName(tSig__tSyntethic____definitions_name_prime);
		mSyntToTSynt__tSyntethic____target.setName(mSyntToTSynt__tSyntethic____target_name_prime);
		mClass__mSyntethic____bodyDeclarations.setName(mClass__mSyntethic____bodyDeclarations_name_prime);
		mSyntethic__mClass____abstractTypeDeclaration.setName(mSyntethic__mClass____abstractTypeDeclaration_name_prime);
		tDef__tSyntethic____syntethicMethods.setName(tDef__tSyntethic____syntethicMethods_name_prime);
		tSyntethic__tDef____originalMethodDefinition.setName(tSyntethic__tDef____originalMethodDefinition_name_prime);
		mSyntToTSynt__mSyntethic____source.setName(mSyntToTSynt__mSyntethic____source_name_prime);
		mDef__mSyntethic____syntheticMethodDefinitions
				.setName(mDef__mSyntethic____syntheticMethodDefinitions_name_prime);
		mSyntethic__mDef____originalMethodDefinition.setName(mSyntethic__mDef____originalMethodDefinition_name_prime);
		return new Object[] { ruleresult, tClass, tSyntethic, mSyntToTSynt, mClass, tDef, mSyntethic, mDef, tSig,
				tClass__tSyntethic____defines, tSyntethic__tClass____definedBy, tSyntethic__tSig____signature,
				tSig__tSyntethic____definitions, mSyntToTSynt__tSyntethic____target,
				mClass__mSyntethic____bodyDeclarations, mSyntethic__mClass____abstractTypeDeclaration,
				tDef__tSyntethic____syntethicMethods, tSyntethic__tDef____originalMethodDefinition,
				mSyntToTSynt__mSyntethic____source, mDef__mSyntethic____syntheticMethodDefinitions,
				mSyntethic__mDef____originalMethodDefinition };
	}

	public static final void pattern_SyntethicMethod_1_5_registerobjects_expressionBBBBBBBBBBBB(SyntethicMethod _this,
			PerformRuleResult ruleresult, EObject mClassDeclarationToTClass, EObject tClass, EObject tSyntethic,
			EObject mDefinitionToTMember, EObject mSyntToTSynt, EObject mClass, EObject tDef, EObject mSyntethic,
			EObject mDef, EObject tSig) {
		_this.registerObjects_FWD(ruleresult, mClassDeclarationToTClass, tClass, tSyntethic, mDefinitionToTMember,
				mSyntToTSynt, mClass, tDef, mSyntethic, mDef, tSig);

	}

	public static final PerformRuleResult pattern_SyntethicMethod_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_2_1_preparereturnvalue_bindingFB(SyntethicMethod _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_2_1_preparereturnvalue_blackFBB(EClass eClass,
			SyntethicMethod _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_2_1_preparereturnvalue_bindingAndBlackFFB(
			SyntethicMethod _this) {
		Object[] result_pattern_SyntethicMethod_2_1_preparereturnvalue_binding = pattern_SyntethicMethod_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SyntethicMethod_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SyntethicMethod_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SyntethicMethod_2_1_preparereturnvalue_black = pattern_SyntethicMethod_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SyntethicMethod_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SyntethicMethod_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "SyntethicMethod";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SyntethicMethod_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mClass");
		EObject _localVariable_1 = match.getObject("mSyntethic");
		EObject _localVariable_2 = match.getObject("mDef");
		EObject tmpMClass = _localVariable_0;
		EObject tmpMSyntethic = _localVariable_1;
		EObject tmpMDef = _localVariable_2;
		if (tmpMClass instanceof ClassDeclaration) {
			ClassDeclaration mClass = (ClassDeclaration) tmpMClass;
			if (tmpMSyntethic instanceof MSyntheticMethodDefinition) {
				MSyntheticMethodDefinition mSyntethic = (MSyntheticMethodDefinition) tmpMSyntethic;
				if (tmpMDef instanceof MMethodDefinition) {
					MMethodDefinition mDef = (MMethodDefinition) tmpMDef;
					return new Object[] { mClass, mSyntethic, mDef, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SyntethicMethod_2_2_corematch_blackFFFBFBBB(ClassDeclaration mClass,
			MSyntheticMethodDefinition mSyntethic, MMethodDefinition mDef, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mClass, TypeToTAbstractType.class, "source")) {
			TAbstractType tmpTClass = mClassDeclarationToTClass.getTarget();
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				for (MDefinitionToTMember mDefinitionToTMember : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mDef, MDefinitionToTMember.class, "source")) {
					TMember tmpTDef = mDefinitionToTMember.getTarget();
					if (tmpTDef instanceof TMethodDefinition) {
						TMethodDefinition tDef = (TMethodDefinition) tmpTDef;
						_result.add(new Object[] { mClassDeclarationToTClass, tClass, mDefinitionToTMember, mClass,
								tDef, mSyntethic, mDef, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SyntethicMethod_2_3_findcontext_blackBBBBBBBF(
			TypeToTAbstractType mClassDeclarationToTClass, TClass tClass, MDefinitionToTMember mDefinitionToTMember,
			ClassDeclaration mClass, TMethodDefinition tDef, MSyntheticMethodDefinition mSyntethic,
			MMethodDefinition mDef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tClass.equals(mClassDeclarationToTClass.getTarget())) {
			if (mClass.getBodyDeclarations().contains(mSyntethic)) {
				if (tDef.equals(mDefinitionToTMember.getTarget())) {
					if (mClass.equals(mClassDeclarationToTClass.getSource())) {
						if (mDef.getSyntheticMethodDefinitions().contains(mSyntethic)) {
							if (mDef.equals(mDefinitionToTMember.getSource())) {
								TSignature tmpTSig = tDef.getSignature();
								if (tmpTSig instanceof TMethodSignature) {
									TMethodSignature tSig = (TMethodSignature) tmpTSig;
									_result.add(new Object[] { mClassDeclarationToTClass, tClass, mDefinitionToTMember,
											mClass, tDef, mSyntethic, mDef, tSig });
								}

							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(
			TypeToTAbstractType mClassDeclarationToTClass, TClass tClass, MDefinitionToTMember mDefinitionToTMember,
			ClassDeclaration mClass, TMethodDefinition tDef, MSyntheticMethodDefinition mSyntethic,
			MMethodDefinition mDef, TMethodSignature tSig) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mClass__mSyntethic____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSyntethic__mClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDef____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDef__tSig____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSig__tDef____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mClassDeclarationToTClass__mClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDef__mSyntethic____syntheticMethodDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSyntethic__mDef____originalMethodDefinition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDef____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mClassDeclarationToTClass__tClass____target_name_prime = "target";
		String mClass__mSyntethic____bodyDeclarations_name_prime = "bodyDeclarations";
		String mSyntethic__mClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mDefinitionToTMember__tDef____target_name_prime = "target";
		String tDef__tSig____signature_name_prime = "signature";
		String tSig__tDef____definitions_name_prime = "definitions";
		String mClassDeclarationToTClass__mClass____source_name_prime = "source";
		String mDef__mSyntethic____syntheticMethodDefinitions_name_prime = "syntheticMethodDefinitions";
		String mSyntethic__mDef____originalMethodDefinition_name_prime = "originalMethodDefinition";
		String mDefinitionToTMember__mDef____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mClassDeclarationToTClass);
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember);
		isApplicableMatch.getAllContextElements().add(mClass);
		isApplicableMatch.getAllContextElements().add(tDef);
		isApplicableMatch.getAllContextElements().add(mSyntethic);
		isApplicableMatch.getAllContextElements().add(mDef);
		isApplicableMatch.getAllContextElements().add(tSig);
		mClassDeclarationToTClass__tClass____target.setSrc(mClassDeclarationToTClass);
		mClassDeclarationToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(mClassDeclarationToTClass__tClass____target);
		mClass__mSyntethic____bodyDeclarations.setSrc(mClass);
		mClass__mSyntethic____bodyDeclarations.setTrg(mSyntethic);
		isApplicableMatch.getAllContextElements().add(mClass__mSyntethic____bodyDeclarations);
		mSyntethic__mClass____abstractTypeDeclaration.setSrc(mSyntethic);
		mSyntethic__mClass____abstractTypeDeclaration.setTrg(mClass);
		isApplicableMatch.getAllContextElements().add(mSyntethic__mClass____abstractTypeDeclaration);
		mDefinitionToTMember__tDef____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDef____target.setTrg(tDef);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__tDef____target);
		tDef__tSig____signature.setSrc(tDef);
		tDef__tSig____signature.setTrg(tSig);
		isApplicableMatch.getAllContextElements().add(tDef__tSig____signature);
		tSig__tDef____definitions.setSrc(tSig);
		tSig__tDef____definitions.setTrg(tDef);
		isApplicableMatch.getAllContextElements().add(tSig__tDef____definitions);
		mClassDeclarationToTClass__mClass____source.setSrc(mClassDeclarationToTClass);
		mClassDeclarationToTClass__mClass____source.setTrg(mClass);
		isApplicableMatch.getAllContextElements().add(mClassDeclarationToTClass__mClass____source);
		mDef__mSyntethic____syntheticMethodDefinitions.setSrc(mDef);
		mDef__mSyntethic____syntheticMethodDefinitions.setTrg(mSyntethic);
		isApplicableMatch.getAllContextElements().add(mDef__mSyntethic____syntheticMethodDefinitions);
		mSyntethic__mDef____originalMethodDefinition.setSrc(mSyntethic);
		mSyntethic__mDef____originalMethodDefinition.setTrg(mDef);
		isApplicableMatch.getAllContextElements().add(mSyntethic__mDef____originalMethodDefinition);
		mDefinitionToTMember__mDef____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDef____source.setTrg(mDef);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__mDef____source);
		mClassDeclarationToTClass__tClass____target.setName(mClassDeclarationToTClass__tClass____target_name_prime);
		mClass__mSyntethic____bodyDeclarations.setName(mClass__mSyntethic____bodyDeclarations_name_prime);
		mSyntethic__mClass____abstractTypeDeclaration.setName(mSyntethic__mClass____abstractTypeDeclaration_name_prime);
		mDefinitionToTMember__tDef____target.setName(mDefinitionToTMember__tDef____target_name_prime);
		tDef__tSig____signature.setName(tDef__tSig____signature_name_prime);
		tSig__tDef____definitions.setName(tSig__tDef____definitions_name_prime);
		mClassDeclarationToTClass__mClass____source.setName(mClassDeclarationToTClass__mClass____source_name_prime);
		mDef__mSyntethic____syntheticMethodDefinitions
				.setName(mDef__mSyntethic____syntheticMethodDefinitions_name_prime);
		mSyntethic__mDef____originalMethodDefinition.setName(mSyntethic__mDef____originalMethodDefinition_name_prime);
		mDefinitionToTMember__mDef____source.setName(mDefinitionToTMember__mDef____source_name_prime);
		return new Object[] { mClassDeclarationToTClass, tClass, mDefinitionToTMember, mClass, tDef, mSyntethic, mDef,
				tSig, isApplicableMatch, mClassDeclarationToTClass__tClass____target,
				mClass__mSyntethic____bodyDeclarations, mSyntethic__mClass____abstractTypeDeclaration,
				mDefinitionToTMember__tDef____target, tDef__tSig____signature, tSig__tDef____definitions,
				mClassDeclarationToTClass__mClass____source, mDef__mSyntethic____syntheticMethodDefinitions,
				mSyntethic__mDef____originalMethodDefinition, mDefinitionToTMember__mDef____source };
	}

	public static final Object[] pattern_SyntethicMethod_2_4_solveCSP_bindingFBBBBBBBBBB(SyntethicMethod _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mClassDeclarationToTClass, TClass tClass,
			MDefinitionToTMember mDefinitionToTMember, ClassDeclaration mClass, TMethodDefinition tDef,
			MSyntheticMethodDefinition mSyntethic, MMethodDefinition mDef, TMethodSignature tSig) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mClassDeclarationToTClass, tClass,
				mDefinitionToTMember, mClass, tDef, mSyntethic, mDef, tSig);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mClassDeclarationToTClass, tClass,
					mDefinitionToTMember, mClass, tDef, mSyntethic, mDef, tSig };
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SyntethicMethod_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(SyntethicMethod _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mClassDeclarationToTClass, TClass tClass,
			MDefinitionToTMember mDefinitionToTMember, ClassDeclaration mClass, TMethodDefinition tDef,
			MSyntheticMethodDefinition mSyntethic, MMethodDefinition mDef, TMethodSignature tSig) {
		Object[] result_pattern_SyntethicMethod_2_4_solveCSP_binding = pattern_SyntethicMethod_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, mClassDeclarationToTClass, tClass, mDefinitionToTMember, mClass, tDef,
				mSyntethic, mDef, tSig);
		if (result_pattern_SyntethicMethod_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SyntethicMethod_2_4_solveCSP_binding[0];

			Object[] result_pattern_SyntethicMethod_2_4_solveCSP_black = pattern_SyntethicMethod_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_SyntethicMethod_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mClassDeclarationToTClass, tClass,
						mDefinitionToTMember, mClass, tDef, mSyntethic, mDef, tSig };
			}
		}
		return null;
	}

	public static final boolean pattern_SyntethicMethod_2_5_checkCSP_expressionFBB(SyntethicMethod _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SyntethicMethod_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SyntethicMethod";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SyntethicMethod_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_10_1_initialbindings_blackBBBBBB(SyntethicMethod _this,
			Match match, TClass tClass, TSyntethicMethod tSyntethic, TMethodDefinition tDef, TMethodSignature tSig) {
		return new Object[] { _this, match, tClass, tSyntethic, tDef, tSig };
	}

	public static final Object[] pattern_SyntethicMethod_10_2_SolveCSP_bindingFBBBBBB(SyntethicMethod _this,
			Match match, TClass tClass, TSyntethicMethod tSyntethic, TMethodDefinition tDef, TMethodSignature tSig) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tClass, tSyntethic, tDef, tSig);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tClass, tSyntethic, tDef, tSig };
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SyntethicMethod_10_2_SolveCSP_bindingAndBlackFBBBBBB(SyntethicMethod _this,
			Match match, TClass tClass, TSyntethicMethod tSyntethic, TMethodDefinition tDef, TMethodSignature tSig) {
		Object[] result_pattern_SyntethicMethod_10_2_SolveCSP_binding = pattern_SyntethicMethod_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, tClass, tSyntethic, tDef, tSig);
		if (result_pattern_SyntethicMethod_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SyntethicMethod_10_2_SolveCSP_binding[0];

			Object[] result_pattern_SyntethicMethod_10_2_SolveCSP_black = pattern_SyntethicMethod_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SyntethicMethod_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tClass, tSyntethic, tDef, tSig };
			}
		}
		return null;
	}

	public static final boolean pattern_SyntethicMethod_10_3_CheckCSP_expressionFBB(SyntethicMethod _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_10_4_collectelementstobetranslated_blackBBBBB(Match match,
			TClass tClass, TSyntethicMethod tSyntethic, TMethodDefinition tDef, TMethodSignature tSig) {
		return new Object[] { match, tClass, tSyntethic, tDef, tSig };
	}

	public static final Object[] pattern_SyntethicMethod_10_4_collectelementstobetranslated_greenBBBBBFFFFFF(
			Match match, TClass tClass, TSyntethicMethod tSyntethic, TMethodDefinition tDef, TMethodSignature tSig) {
		EMoflonEdge tClass__tSyntethic____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSyntethic__tClass____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSyntethic__tSig____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSig__tSyntethic____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDef__tSyntethic____syntethicMethods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSyntethic__tDef____originalMethodDefinition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tSyntethic);
		String tClass__tSyntethic____defines_name_prime = "defines";
		String tSyntethic__tClass____definedBy_name_prime = "definedBy";
		String tSyntethic__tSig____signature_name_prime = "signature";
		String tSig__tSyntethic____definitions_name_prime = "definitions";
		String tDef__tSyntethic____syntethicMethods_name_prime = "syntethicMethods";
		String tSyntethic__tDef____originalMethodDefinition_name_prime = "originalMethodDefinition";
		tClass__tSyntethic____defines.setSrc(tClass);
		tClass__tSyntethic____defines.setTrg(tSyntethic);
		match.getToBeTranslatedEdges().add(tClass__tSyntethic____defines);
		tSyntethic__tClass____definedBy.setSrc(tSyntethic);
		tSyntethic__tClass____definedBy.setTrg(tClass);
		match.getToBeTranslatedEdges().add(tSyntethic__tClass____definedBy);
		tSyntethic__tSig____signature.setSrc(tSyntethic);
		tSyntethic__tSig____signature.setTrg(tSig);
		match.getToBeTranslatedEdges().add(tSyntethic__tSig____signature);
		tSig__tSyntethic____definitions.setSrc(tSig);
		tSig__tSyntethic____definitions.setTrg(tSyntethic);
		match.getToBeTranslatedEdges().add(tSig__tSyntethic____definitions);
		tDef__tSyntethic____syntethicMethods.setSrc(tDef);
		tDef__tSyntethic____syntethicMethods.setTrg(tSyntethic);
		match.getToBeTranslatedEdges().add(tDef__tSyntethic____syntethicMethods);
		tSyntethic__tDef____originalMethodDefinition.setSrc(tSyntethic);
		tSyntethic__tDef____originalMethodDefinition.setTrg(tDef);
		match.getToBeTranslatedEdges().add(tSyntethic__tDef____originalMethodDefinition);
		tClass__tSyntethic____defines.setName(tClass__tSyntethic____defines_name_prime);
		tSyntethic__tClass____definedBy.setName(tSyntethic__tClass____definedBy_name_prime);
		tSyntethic__tSig____signature.setName(tSyntethic__tSig____signature_name_prime);
		tSig__tSyntethic____definitions.setName(tSig__tSyntethic____definitions_name_prime);
		tDef__tSyntethic____syntethicMethods.setName(tDef__tSyntethic____syntethicMethods_name_prime);
		tSyntethic__tDef____originalMethodDefinition.setName(tSyntethic__tDef____originalMethodDefinition_name_prime);
		return new Object[] { match, tClass, tSyntethic, tDef, tSig, tClass__tSyntethic____defines,
				tSyntethic__tClass____definedBy, tSyntethic__tSig____signature, tSig__tSyntethic____definitions,
				tDef__tSyntethic____syntethicMethods, tSyntethic__tDef____originalMethodDefinition };
	}

	public static final Object[] pattern_SyntethicMethod_10_5_collectcontextelements_blackBBBBB(Match match,
			TClass tClass, TSyntethicMethod tSyntethic, TMethodDefinition tDef, TMethodSignature tSig) {
		return new Object[] { match, tClass, tSyntethic, tDef, tSig };
	}

	public static final Object[] pattern_SyntethicMethod_10_5_collectcontextelements_greenBBBBFF(Match match,
			TClass tClass, TMethodDefinition tDef, TMethodSignature tSig) {
		EMoflonEdge tDef__tSig____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSig__tDef____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tClass);
		match.getContextNodes().add(tDef);
		match.getContextNodes().add(tSig);
		String tDef__tSig____signature_name_prime = "signature";
		String tSig__tDef____definitions_name_prime = "definitions";
		tDef__tSig____signature.setSrc(tDef);
		tDef__tSig____signature.setTrg(tSig);
		match.getContextEdges().add(tDef__tSig____signature);
		tSig__tDef____definitions.setSrc(tSig);
		tSig__tDef____definitions.setTrg(tDef);
		match.getContextEdges().add(tSig__tDef____definitions);
		tDef__tSig____signature.setName(tDef__tSig____signature_name_prime);
		tSig__tDef____definitions.setName(tSig__tDef____definitions_name_prime);
		return new Object[] { match, tClass, tDef, tSig, tDef__tSig____signature, tSig__tDef____definitions };
	}

	public static final void pattern_SyntethicMethod_10_6_registerobjectstomatch_expressionBBBBBB(SyntethicMethod _this,
			Match match, TClass tClass, TSyntethicMethod tSyntethic, TMethodDefinition tDef, TMethodSignature tSig) {
		_this.registerObjectsToMatch_BWD(match, tClass, tSyntethic, tDef, tSig);

	}

	public static final boolean pattern_SyntethicMethod_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SyntethicMethod_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_11_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mClassDeclarationToTClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_2 = isApplicableMatch.getObject("tSyntethic");
		EObject _localVariable_3 = isApplicableMatch.getObject("mDefinitionToTMember");
		EObject _localVariable_4 = isApplicableMatch.getObject("mClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("tDef");
		EObject _localVariable_6 = isApplicableMatch.getObject("mDef");
		EObject _localVariable_7 = isApplicableMatch.getObject("tSig");
		EObject tmpMClassDeclarationToTClass = _localVariable_0;
		EObject tmpTClass = _localVariable_1;
		EObject tmpTSyntethic = _localVariable_2;
		EObject tmpMDefinitionToTMember = _localVariable_3;
		EObject tmpMClass = _localVariable_4;
		EObject tmpTDef = _localVariable_5;
		EObject tmpMDef = _localVariable_6;
		EObject tmpTSig = _localVariable_7;
		if (tmpMClassDeclarationToTClass instanceof TypeToTAbstractType) {
			TypeToTAbstractType mClassDeclarationToTClass = (TypeToTAbstractType) tmpMClassDeclarationToTClass;
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				if (tmpTSyntethic instanceof TSyntethicMethod) {
					TSyntethicMethod tSyntethic = (TSyntethicMethod) tmpTSyntethic;
					if (tmpMDefinitionToTMember instanceof MDefinitionToTMember) {
						MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) tmpMDefinitionToTMember;
						if (tmpMClass instanceof ClassDeclaration) {
							ClassDeclaration mClass = (ClassDeclaration) tmpMClass;
							if (tmpTDef instanceof TMethodDefinition) {
								TMethodDefinition tDef = (TMethodDefinition) tmpTDef;
								if (tmpMDef instanceof MMethodDefinition) {
									MMethodDefinition mDef = (MMethodDefinition) tmpMDef;
									if (tmpTSig instanceof TMethodSignature) {
										TMethodSignature tSig = (TMethodSignature) tmpTSig;
										return new Object[] { mClassDeclarationToTClass, tClass, tSyntethic,
												mDefinitionToTMember, mClass, tDef, mDef, tSig, isApplicableMatch };
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

	public static final Object[] pattern_SyntethicMethod_11_1_performtransformation_blackBBBBBBBBFBB(
			TypeToTAbstractType mClassDeclarationToTClass, TClass tClass, TSyntethicMethod tSyntethic,
			MDefinitionToTMember mDefinitionToTMember, ClassDeclaration mClass, TMethodDefinition tDef,
			MMethodDefinition mDef, TMethodSignature tSig, SyntethicMethod _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mClassDeclarationToTClass, tClass, tSyntethic, mDefinitionToTMember, mClass, tDef,
						mDef, tSig, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			SyntethicMethod _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SyntethicMethod_11_1_performtransformation_binding = pattern_SyntethicMethod_11_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_SyntethicMethod_11_1_performtransformation_binding != null) {
			TypeToTAbstractType mClassDeclarationToTClass = (TypeToTAbstractType) result_pattern_SyntethicMethod_11_1_performtransformation_binding[0];
			TClass tClass = (TClass) result_pattern_SyntethicMethod_11_1_performtransformation_binding[1];
			TSyntethicMethod tSyntethic = (TSyntethicMethod) result_pattern_SyntethicMethod_11_1_performtransformation_binding[2];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result_pattern_SyntethicMethod_11_1_performtransformation_binding[3];
			ClassDeclaration mClass = (ClassDeclaration) result_pattern_SyntethicMethod_11_1_performtransformation_binding[4];
			TMethodDefinition tDef = (TMethodDefinition) result_pattern_SyntethicMethod_11_1_performtransformation_binding[5];
			MMethodDefinition mDef = (MMethodDefinition) result_pattern_SyntethicMethod_11_1_performtransformation_binding[6];
			TMethodSignature tSig = (TMethodSignature) result_pattern_SyntethicMethod_11_1_performtransformation_binding[7];

			Object[] result_pattern_SyntethicMethod_11_1_performtransformation_black = pattern_SyntethicMethod_11_1_performtransformation_blackBBBBBBBBFBB(
					mClassDeclarationToTClass, tClass, tSyntethic, mDefinitionToTMember, mClass, tDef, mDef, tSig,
					_this, isApplicableMatch);
			if (result_pattern_SyntethicMethod_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SyntethicMethod_11_1_performtransformation_black[8];

				return new Object[] { mClassDeclarationToTClass, tClass, tSyntethic, mDefinitionToTMember, mClass, tDef,
						mDef, tSig, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_11_1_performtransformation_greenBFBFB(
			TSyntethicMethod tSyntethic, ClassDeclaration mClass, MMethodDefinition mDef) {
		MSyntethicMethodToTSyntethicMethod mSyntToTSynt = PmFactory.eINSTANCE
				.createMSyntethicMethodToTSyntethicMethod();
		MSyntheticMethodDefinition mSyntethic = ModiscoFactory.eINSTANCE.createMSyntheticMethodDefinition();
		mSyntToTSynt.setTarget(tSyntethic);
		mClass.getBodyDeclarations().add(mSyntethic);
		mSyntToTSynt.setSource(mSyntethic);
		mDef.getSyntheticMethodDefinitions().add(mSyntethic);
		return new Object[] { tSyntethic, mSyntToTSynt, mClass, mSyntethic, mDef };
	}

	public static final Object[] pattern_SyntethicMethod_11_2_collecttranslatedelements_blackBBB(
			TSyntethicMethod tSyntethic, MSyntethicMethodToTSyntethicMethod mSyntToTSynt,
			MSyntheticMethodDefinition mSyntethic) {
		return new Object[] { tSyntethic, mSyntToTSynt, mSyntethic };
	}

	public static final Object[] pattern_SyntethicMethod_11_2_collecttranslatedelements_greenFBBB(
			TSyntethicMethod tSyntethic, MSyntethicMethodToTSyntethicMethod mSyntToTSynt,
			MSyntheticMethodDefinition mSyntethic) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tSyntethic);
		ruleresult.getCreatedLinkElements().add(mSyntToTSynt);
		ruleresult.getCreatedElements().add(mSyntethic);
		return new Object[] { ruleresult, tSyntethic, mSyntToTSynt, mSyntethic };
	}

	public static final Object[] pattern_SyntethicMethod_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mClassDeclarationToTClass, EObject tClass, EObject tSyntethic,
			EObject mDefinitionToTMember, EObject mSyntToTSynt, EObject mClass, EObject tDef, EObject mSyntethic,
			EObject mDef, EObject tSig) {
		if (!mClassDeclarationToTClass.equals(tClass)) {
			if (!mClassDeclarationToTClass.equals(tSyntethic)) {
				if (!mClassDeclarationToTClass.equals(mDefinitionToTMember)) {
					if (!mClassDeclarationToTClass.equals(mSyntToTSynt)) {
						if (!mClassDeclarationToTClass.equals(tDef)) {
							if (!mClassDeclarationToTClass.equals(mSyntethic)) {
								if (!mClassDeclarationToTClass.equals(mDef)) {
									if (!mClassDeclarationToTClass.equals(tSig)) {
										if (!tClass.equals(tSyntethic)) {
											if (!tClass.equals(tDef)) {
												if (!tClass.equals(tSig)) {
													if (!mDefinitionToTMember.equals(tClass)) {
														if (!mDefinitionToTMember.equals(tSyntethic)) {
															if (!mDefinitionToTMember.equals(mSyntToTSynt)) {
																if (!mDefinitionToTMember.equals(tDef)) {
																	if (!mDefinitionToTMember.equals(mSyntethic)) {
																		if (!mDefinitionToTMember.equals(tSig)) {
																			if (!mSyntToTSynt.equals(tClass)) {
																				if (!mSyntToTSynt.equals(tSyntethic)) {
																					if (!mSyntToTSynt.equals(tDef)) {
																						if (!mSyntToTSynt
																								.equals(mSyntethic)) {
																							if (!mSyntToTSynt
																									.equals(tSig)) {
																								if (!mClass.equals(
																										mClassDeclarationToTClass)) {
																									if (!mClass.equals(
																											tClass)) {
																										if (!mClass
																												.equals(tSyntethic)) {
																											if (!mClass
																													.equals(mDefinitionToTMember)) {
																												if (!mClass
																														.equals(mSyntToTSynt)) {
																													if (!mClass
																															.equals(tDef)) {
																														if (!mClass
																																.equals(mSyntethic)) {
																															if (!mClass
																																	.equals(mDef)) {
																																if (!mClass
																																		.equals(tSig)) {
																																	if (!tDef
																																			.equals(tSyntethic)) {
																																		if (!tDef
																																				.equals(tSig)) {
																																			if (!mSyntethic
																																					.equals(tClass)) {
																																				if (!mSyntethic
																																						.equals(tSyntethic)) {
																																					if (!mSyntethic
																																							.equals(tDef)) {
																																						if (!mSyntethic
																																								.equals(tSig)) {
																																							if (!mDef
																																									.equals(tClass)) {
																																								if (!mDef
																																										.equals(tSyntethic)) {
																																									if (!mDef
																																											.equals(mDefinitionToTMember)) {
																																										if (!mDef
																																												.equals(mSyntToTSynt)) {
																																											if (!mDef
																																													.equals(tDef)) {
																																												if (!mDef
																																														.equals(mSyntethic)) {
																																													if (!mDef
																																															.equals(tSig)) {
																																														if (!tSig
																																																.equals(tSyntethic)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mClassDeclarationToTClass,
																																																	tClass,
																																																	tSyntethic,
																																																	mDefinitionToTMember,
																																																	mSyntToTSynt,
																																																	mClass,
																																																	tDef,
																																																	mSyntethic,
																																																	mDef,
																																																	tSig };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SyntethicMethod_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tClass, EObject tSyntethic, EObject mSyntToTSynt, EObject mClass,
			EObject tDef, EObject mSyntethic, EObject mDef, EObject tSig) {
		EMoflonEdge tClass__tSyntethic____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSyntethic__tClass____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSyntethic__tSig____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSig__tSyntethic____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSyntToTSynt__tSyntethic____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mClass__mSyntethic____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSyntethic__mClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDef__tSyntethic____syntethicMethods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSyntethic__tDef____originalMethodDefinition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSyntToTSynt__mSyntethic____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDef__mSyntethic____syntheticMethodDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSyntethic__mDef____originalMethodDefinition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SyntethicMethod";
		String tClass__tSyntethic____defines_name_prime = "defines";
		String tSyntethic__tClass____definedBy_name_prime = "definedBy";
		String tSyntethic__tSig____signature_name_prime = "signature";
		String tSig__tSyntethic____definitions_name_prime = "definitions";
		String mSyntToTSynt__tSyntethic____target_name_prime = "target";
		String mClass__mSyntethic____bodyDeclarations_name_prime = "bodyDeclarations";
		String mSyntethic__mClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String tDef__tSyntethic____syntethicMethods_name_prime = "syntethicMethods";
		String tSyntethic__tDef____originalMethodDefinition_name_prime = "originalMethodDefinition";
		String mSyntToTSynt__mSyntethic____source_name_prime = "source";
		String mDef__mSyntethic____syntheticMethodDefinitions_name_prime = "syntheticMethodDefinitions";
		String mSyntethic__mDef____originalMethodDefinition_name_prime = "originalMethodDefinition";
		tClass__tSyntethic____defines.setSrc(tClass);
		tClass__tSyntethic____defines.setTrg(tSyntethic);
		ruleresult.getTranslatedEdges().add(tClass__tSyntethic____defines);
		tSyntethic__tClass____definedBy.setSrc(tSyntethic);
		tSyntethic__tClass____definedBy.setTrg(tClass);
		ruleresult.getTranslatedEdges().add(tSyntethic__tClass____definedBy);
		tSyntethic__tSig____signature.setSrc(tSyntethic);
		tSyntethic__tSig____signature.setTrg(tSig);
		ruleresult.getTranslatedEdges().add(tSyntethic__tSig____signature);
		tSig__tSyntethic____definitions.setSrc(tSig);
		tSig__tSyntethic____definitions.setTrg(tSyntethic);
		ruleresult.getTranslatedEdges().add(tSig__tSyntethic____definitions);
		mSyntToTSynt__tSyntethic____target.setSrc(mSyntToTSynt);
		mSyntToTSynt__tSyntethic____target.setTrg(tSyntethic);
		ruleresult.getCreatedEdges().add(mSyntToTSynt__tSyntethic____target);
		mClass__mSyntethic____bodyDeclarations.setSrc(mClass);
		mClass__mSyntethic____bodyDeclarations.setTrg(mSyntethic);
		ruleresult.getCreatedEdges().add(mClass__mSyntethic____bodyDeclarations);
		mSyntethic__mClass____abstractTypeDeclaration.setSrc(mSyntethic);
		mSyntethic__mClass____abstractTypeDeclaration.setTrg(mClass);
		ruleresult.getCreatedEdges().add(mSyntethic__mClass____abstractTypeDeclaration);
		tDef__tSyntethic____syntethicMethods.setSrc(tDef);
		tDef__tSyntethic____syntethicMethods.setTrg(tSyntethic);
		ruleresult.getTranslatedEdges().add(tDef__tSyntethic____syntethicMethods);
		tSyntethic__tDef____originalMethodDefinition.setSrc(tSyntethic);
		tSyntethic__tDef____originalMethodDefinition.setTrg(tDef);
		ruleresult.getTranslatedEdges().add(tSyntethic__tDef____originalMethodDefinition);
		mSyntToTSynt__mSyntethic____source.setSrc(mSyntToTSynt);
		mSyntToTSynt__mSyntethic____source.setTrg(mSyntethic);
		ruleresult.getCreatedEdges().add(mSyntToTSynt__mSyntethic____source);
		mDef__mSyntethic____syntheticMethodDefinitions.setSrc(mDef);
		mDef__mSyntethic____syntheticMethodDefinitions.setTrg(mSyntethic);
		ruleresult.getCreatedEdges().add(mDef__mSyntethic____syntheticMethodDefinitions);
		mSyntethic__mDef____originalMethodDefinition.setSrc(mSyntethic);
		mSyntethic__mDef____originalMethodDefinition.setTrg(mDef);
		ruleresult.getCreatedEdges().add(mSyntethic__mDef____originalMethodDefinition);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tClass__tSyntethic____defines.setName(tClass__tSyntethic____defines_name_prime);
		tSyntethic__tClass____definedBy.setName(tSyntethic__tClass____definedBy_name_prime);
		tSyntethic__tSig____signature.setName(tSyntethic__tSig____signature_name_prime);
		tSig__tSyntethic____definitions.setName(tSig__tSyntethic____definitions_name_prime);
		mSyntToTSynt__tSyntethic____target.setName(mSyntToTSynt__tSyntethic____target_name_prime);
		mClass__mSyntethic____bodyDeclarations.setName(mClass__mSyntethic____bodyDeclarations_name_prime);
		mSyntethic__mClass____abstractTypeDeclaration.setName(mSyntethic__mClass____abstractTypeDeclaration_name_prime);
		tDef__tSyntethic____syntethicMethods.setName(tDef__tSyntethic____syntethicMethods_name_prime);
		tSyntethic__tDef____originalMethodDefinition.setName(tSyntethic__tDef____originalMethodDefinition_name_prime);
		mSyntToTSynt__mSyntethic____source.setName(mSyntToTSynt__mSyntethic____source_name_prime);
		mDef__mSyntethic____syntheticMethodDefinitions
				.setName(mDef__mSyntethic____syntheticMethodDefinitions_name_prime);
		mSyntethic__mDef____originalMethodDefinition.setName(mSyntethic__mDef____originalMethodDefinition_name_prime);
		return new Object[] { ruleresult, tClass, tSyntethic, mSyntToTSynt, mClass, tDef, mSyntethic, mDef, tSig,
				tClass__tSyntethic____defines, tSyntethic__tClass____definedBy, tSyntethic__tSig____signature,
				tSig__tSyntethic____definitions, mSyntToTSynt__tSyntethic____target,
				mClass__mSyntethic____bodyDeclarations, mSyntethic__mClass____abstractTypeDeclaration,
				tDef__tSyntethic____syntethicMethods, tSyntethic__tDef____originalMethodDefinition,
				mSyntToTSynt__mSyntethic____source, mDef__mSyntethic____syntheticMethodDefinitions,
				mSyntethic__mDef____originalMethodDefinition };
	}

	public static final void pattern_SyntethicMethod_11_5_registerobjects_expressionBBBBBBBBBBBB(SyntethicMethod _this,
			PerformRuleResult ruleresult, EObject mClassDeclarationToTClass, EObject tClass, EObject tSyntethic,
			EObject mDefinitionToTMember, EObject mSyntToTSynt, EObject mClass, EObject tDef, EObject mSyntethic,
			EObject mDef, EObject tSig) {
		_this.registerObjects_BWD(ruleresult, mClassDeclarationToTClass, tClass, tSyntethic, mDefinitionToTMember,
				mSyntToTSynt, mClass, tDef, mSyntethic, mDef, tSig);

	}

	public static final PerformRuleResult pattern_SyntethicMethod_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_12_1_preparereturnvalue_bindingFB(SyntethicMethod _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_12_1_preparereturnvalue_blackFBB(EClass eClass,
			SyntethicMethod _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_12_1_preparereturnvalue_bindingAndBlackFFB(
			SyntethicMethod _this) {
		Object[] result_pattern_SyntethicMethod_12_1_preparereturnvalue_binding = pattern_SyntethicMethod_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SyntethicMethod_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SyntethicMethod_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SyntethicMethod_12_1_preparereturnvalue_black = pattern_SyntethicMethod_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SyntethicMethod_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SyntethicMethod_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "SyntethicMethod";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SyntethicMethod_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tClass");
		EObject _localVariable_1 = match.getObject("tSyntethic");
		EObject _localVariable_2 = match.getObject("tDef");
		EObject _localVariable_3 = match.getObject("tSig");
		EObject tmpTClass = _localVariable_0;
		EObject tmpTSyntethic = _localVariable_1;
		EObject tmpTDef = _localVariable_2;
		EObject tmpTSig = _localVariable_3;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpTSyntethic instanceof TSyntethicMethod) {
				TSyntethicMethod tSyntethic = (TSyntethicMethod) tmpTSyntethic;
				if (tmpTDef instanceof TMethodDefinition) {
					TMethodDefinition tDef = (TMethodDefinition) tmpTDef;
					if (tmpTSig instanceof TMethodSignature) {
						TMethodSignature tSig = (TMethodSignature) tmpTSig;
						return new Object[] { tClass, tSyntethic, tDef, tSig, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SyntethicMethod_12_2_corematch_blackFBBFFBFBB(TClass tClass,
			TSyntethicMethod tSyntethic, TMethodDefinition tDef, TMethodSignature tSig, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeToTAbstractType.class, "target")) {
			Type tmpMClass = mClassDeclarationToTClass.getSource();
			if (tmpMClass instanceof ClassDeclaration) {
				ClassDeclaration mClass = (ClassDeclaration) tmpMClass;
				for (MDefinitionToTMember mDefinitionToTMember : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tDef, MDefinitionToTMember.class, "target")) {
					BodyDeclaration tmpMDef = mDefinitionToTMember.getSource();
					if (tmpMDef instanceof MMethodDefinition) {
						MMethodDefinition mDef = (MMethodDefinition) tmpMDef;
						_result.add(new Object[] { mClassDeclarationToTClass, tClass, tSyntethic, mDefinitionToTMember,
								mClass, tDef, mDef, tSig, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SyntethicMethod_12_3_findcontext_blackBBBBBBBB(
			TypeToTAbstractType mClassDeclarationToTClass, TClass tClass, TSyntethicMethod tSyntethic,
			MDefinitionToTMember mDefinitionToTMember, ClassDeclaration mClass, TMethodDefinition tDef,
			MMethodDefinition mDef, TMethodSignature tSig) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tClass.getDefines().contains(tSyntethic)) {
			if (tClass.equals(mClassDeclarationToTClass.getTarget())) {
				if (tSig.equals(tSyntethic.getSignature())) {
					if (tDef.equals(mDefinitionToTMember.getTarget())) {
						if (tSig.equals(tDef.getSignature())) {
							if (tDef.getSyntethicMethods().contains(tSyntethic)) {
								if (mClass.equals(mClassDeclarationToTClass.getSource())) {
									if (mDef.equals(mDefinitionToTMember.getSource())) {
										_result.add(new Object[] { mClassDeclarationToTClass, tClass, tSyntethic,
												mDefinitionToTMember, mClass, tDef, mDef, tSig });
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

	public static final Object[] pattern_SyntethicMethod_12_3_findcontext_greenBBBBBBBBFFFFFFFFFFFFF(
			TypeToTAbstractType mClassDeclarationToTClass, TClass tClass, TSyntethicMethod tSyntethic,
			MDefinitionToTMember mDefinitionToTMember, ClassDeclaration mClass, TMethodDefinition tDef,
			MMethodDefinition mDef, TMethodSignature tSig) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tClass__tSyntethic____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSyntethic__tClass____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSyntethic__tSig____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSig__tSyntethic____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDef____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDef__tSig____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSig__tDef____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDef__tSyntethic____syntethicMethods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSyntethic__tDef____originalMethodDefinition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mClassDeclarationToTClass__mClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDef____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tClass__tSyntethic____defines_name_prime = "defines";
		String tSyntethic__tClass____definedBy_name_prime = "definedBy";
		String mClassDeclarationToTClass__tClass____target_name_prime = "target";
		String tSyntethic__tSig____signature_name_prime = "signature";
		String tSig__tSyntethic____definitions_name_prime = "definitions";
		String mDefinitionToTMember__tDef____target_name_prime = "target";
		String tDef__tSig____signature_name_prime = "signature";
		String tSig__tDef____definitions_name_prime = "definitions";
		String tDef__tSyntethic____syntethicMethods_name_prime = "syntethicMethods";
		String tSyntethic__tDef____originalMethodDefinition_name_prime = "originalMethodDefinition";
		String mClassDeclarationToTClass__mClass____source_name_prime = "source";
		String mDefinitionToTMember__mDef____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mClassDeclarationToTClass);
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(tSyntethic);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember);
		isApplicableMatch.getAllContextElements().add(mClass);
		isApplicableMatch.getAllContextElements().add(tDef);
		isApplicableMatch.getAllContextElements().add(mDef);
		isApplicableMatch.getAllContextElements().add(tSig);
		tClass__tSyntethic____defines.setSrc(tClass);
		tClass__tSyntethic____defines.setTrg(tSyntethic);
		isApplicableMatch.getAllContextElements().add(tClass__tSyntethic____defines);
		tSyntethic__tClass____definedBy.setSrc(tSyntethic);
		tSyntethic__tClass____definedBy.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(tSyntethic__tClass____definedBy);
		mClassDeclarationToTClass__tClass____target.setSrc(mClassDeclarationToTClass);
		mClassDeclarationToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(mClassDeclarationToTClass__tClass____target);
		tSyntethic__tSig____signature.setSrc(tSyntethic);
		tSyntethic__tSig____signature.setTrg(tSig);
		isApplicableMatch.getAllContextElements().add(tSyntethic__tSig____signature);
		tSig__tSyntethic____definitions.setSrc(tSig);
		tSig__tSyntethic____definitions.setTrg(tSyntethic);
		isApplicableMatch.getAllContextElements().add(tSig__tSyntethic____definitions);
		mDefinitionToTMember__tDef____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDef____target.setTrg(tDef);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__tDef____target);
		tDef__tSig____signature.setSrc(tDef);
		tDef__tSig____signature.setTrg(tSig);
		isApplicableMatch.getAllContextElements().add(tDef__tSig____signature);
		tSig__tDef____definitions.setSrc(tSig);
		tSig__tDef____definitions.setTrg(tDef);
		isApplicableMatch.getAllContextElements().add(tSig__tDef____definitions);
		tDef__tSyntethic____syntethicMethods.setSrc(tDef);
		tDef__tSyntethic____syntethicMethods.setTrg(tSyntethic);
		isApplicableMatch.getAllContextElements().add(tDef__tSyntethic____syntethicMethods);
		tSyntethic__tDef____originalMethodDefinition.setSrc(tSyntethic);
		tSyntethic__tDef____originalMethodDefinition.setTrg(tDef);
		isApplicableMatch.getAllContextElements().add(tSyntethic__tDef____originalMethodDefinition);
		mClassDeclarationToTClass__mClass____source.setSrc(mClassDeclarationToTClass);
		mClassDeclarationToTClass__mClass____source.setTrg(mClass);
		isApplicableMatch.getAllContextElements().add(mClassDeclarationToTClass__mClass____source);
		mDefinitionToTMember__mDef____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDef____source.setTrg(mDef);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__mDef____source);
		tClass__tSyntethic____defines.setName(tClass__tSyntethic____defines_name_prime);
		tSyntethic__tClass____definedBy.setName(tSyntethic__tClass____definedBy_name_prime);
		mClassDeclarationToTClass__tClass____target.setName(mClassDeclarationToTClass__tClass____target_name_prime);
		tSyntethic__tSig____signature.setName(tSyntethic__tSig____signature_name_prime);
		tSig__tSyntethic____definitions.setName(tSig__tSyntethic____definitions_name_prime);
		mDefinitionToTMember__tDef____target.setName(mDefinitionToTMember__tDef____target_name_prime);
		tDef__tSig____signature.setName(tDef__tSig____signature_name_prime);
		tSig__tDef____definitions.setName(tSig__tDef____definitions_name_prime);
		tDef__tSyntethic____syntethicMethods.setName(tDef__tSyntethic____syntethicMethods_name_prime);
		tSyntethic__tDef____originalMethodDefinition.setName(tSyntethic__tDef____originalMethodDefinition_name_prime);
		mClassDeclarationToTClass__mClass____source.setName(mClassDeclarationToTClass__mClass____source_name_prime);
		mDefinitionToTMember__mDef____source.setName(mDefinitionToTMember__mDef____source_name_prime);
		return new Object[] { mClassDeclarationToTClass, tClass, tSyntethic, mDefinitionToTMember, mClass, tDef, mDef,
				tSig, isApplicableMatch, tClass__tSyntethic____defines, tSyntethic__tClass____definedBy,
				mClassDeclarationToTClass__tClass____target, tSyntethic__tSig____signature,
				tSig__tSyntethic____definitions, mDefinitionToTMember__tDef____target, tDef__tSig____signature,
				tSig__tDef____definitions, tDef__tSyntethic____syntethicMethods,
				tSyntethic__tDef____originalMethodDefinition, mClassDeclarationToTClass__mClass____source,
				mDefinitionToTMember__mDef____source };
	}

	public static final Object[] pattern_SyntethicMethod_12_4_solveCSP_bindingFBBBBBBBBBB(SyntethicMethod _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mClassDeclarationToTClass, TClass tClass,
			TSyntethicMethod tSyntethic, MDefinitionToTMember mDefinitionToTMember, ClassDeclaration mClass,
			TMethodDefinition tDef, MMethodDefinition mDef, TMethodSignature tSig) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mClassDeclarationToTClass, tClass,
				tSyntethic, mDefinitionToTMember, mClass, tDef, mDef, tSig);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mClassDeclarationToTClass, tClass, tSyntethic,
					mDefinitionToTMember, mClass, tDef, mDef, tSig };
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SyntethicMethod_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(SyntethicMethod _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mClassDeclarationToTClass, TClass tClass,
			TSyntethicMethod tSyntethic, MDefinitionToTMember mDefinitionToTMember, ClassDeclaration mClass,
			TMethodDefinition tDef, MMethodDefinition mDef, TMethodSignature tSig) {
		Object[] result_pattern_SyntethicMethod_12_4_solveCSP_binding = pattern_SyntethicMethod_12_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, mClassDeclarationToTClass, tClass, tSyntethic, mDefinitionToTMember, mClass,
				tDef, mDef, tSig);
		if (result_pattern_SyntethicMethod_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SyntethicMethod_12_4_solveCSP_binding[0];

			Object[] result_pattern_SyntethicMethod_12_4_solveCSP_black = pattern_SyntethicMethod_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_SyntethicMethod_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mClassDeclarationToTClass, tClass, tSyntethic,
						mDefinitionToTMember, mClass, tDef, mDef, tSig };
			}
		}
		return null;
	}

	public static final boolean pattern_SyntethicMethod_12_5_checkCSP_expressionFBB(SyntethicMethod _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SyntethicMethod_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SyntethicMethod";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SyntethicMethod_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_20_1_preparereturnvalue_bindingFB(SyntethicMethod _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SyntethicMethod _this) {
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

	public static final Object[] pattern_SyntethicMethod_20_1_preparereturnvalue_bindingAndBlackFFBF(
			SyntethicMethod _this) {
		Object[] result_pattern_SyntethicMethod_20_1_preparereturnvalue_binding = pattern_SyntethicMethod_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SyntethicMethod_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SyntethicMethod_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SyntethicMethod_20_1_preparereturnvalue_black = pattern_SyntethicMethod_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SyntethicMethod_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SyntethicMethod_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SyntethicMethod_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SyntethicMethod_20_2_testcorematchandDECs_black_nac_0BB(
			TSyntethicMethod tSyntethic, TMethodDefinition tDef) {
		TMethodDefinition __DEC_tSyntethic_syntethicMethods_734130 = tSyntethic.getOriginalMethodDefinition();
		if (__DEC_tSyntethic_syntethicMethods_734130 != null) {
			if (!tDef.equals(__DEC_tSyntethic_syntethicMethods_734130)) {
				return new Object[] { tSyntethic, tDef };
			}
		}

		return null;
	}

	public static final Object[] pattern_SyntethicMethod_20_2_testcorematchandDECs_black_nac_1BB(
			TSyntethicMethod tSyntethic, TMethodSignature tSig) {
		TSignature __DEC_tSyntethic_definitions_97926 = tSyntethic.getSignature();
		if (__DEC_tSyntethic_definitions_97926 != null) {
			if (!tSig.equals(__DEC_tSyntethic_definitions_97926)) {
				return new Object[] { tSyntethic, tSig };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_SyntethicMethod_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_defines) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTClass = _edge_defines.getSrc();
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			EObject tmpTSyntethic = _edge_defines.getTrg();
			if (tmpTSyntethic instanceof TSyntethicMethod) {
				TSyntethicMethod tSyntethic = (TSyntethicMethod) tmpTSyntethic;
				if (tClass.getDefines().contains(tSyntethic)) {
					TSignature tmpTSig = tSyntethic.getSignature();
					if (tmpTSig instanceof TMethodSignature) {
						TMethodSignature tSig = (TMethodSignature) tmpTSig;
						TMethodDefinition tDef = tSyntethic.getOriginalMethodDefinition();
						if (tDef != null) {
							if (tSig.equals(tDef.getSignature())) {
								if (pattern_SyntethicMethod_20_2_testcorematchandDECs_black_nac_1BB(tSyntethic,
										tSig) == null) {
									if (pattern_SyntethicMethod_20_2_testcorematchandDECs_black_nac_0BB(tSyntethic,
											tDef) == null) {
										_result.add(new Object[] { tClass, tSyntethic, tDef, tSig, _edge_defines });
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

	public static final Object[] pattern_SyntethicMethod_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SyntethicMethod_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			SyntethicMethod _this, Match match, TClass tClass, TSyntethicMethod tSyntethic, TMethodDefinition tDef,
			TMethodSignature tSig) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tClass, tSyntethic, tDef, tSig);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SyntethicMethod_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SyntethicMethod _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SyntethicMethod_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_21_1_preparereturnvalue_bindingFB(SyntethicMethod _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SyntethicMethod _this) {
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

	public static final Object[] pattern_SyntethicMethod_21_1_preparereturnvalue_bindingAndBlackFFBF(
			SyntethicMethod _this) {
		Object[] result_pattern_SyntethicMethod_21_1_preparereturnvalue_binding = pattern_SyntethicMethod_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SyntethicMethod_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SyntethicMethod_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SyntethicMethod_21_1_preparereturnvalue_black = pattern_SyntethicMethod_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SyntethicMethod_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SyntethicMethod_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SyntethicMethod_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SyntethicMethod_21_2_testcorematchandDECs_black_nac_0BB(
			MSyntheticMethodDefinition mSyntethic, ClassDeclaration mClass) {
		AbstractTypeDeclaration __DEC_mSyntethic_abstractTypeDeclaration_818584 = mSyntethic
				.getAbstractTypeDeclaration();
		if (__DEC_mSyntethic_abstractTypeDeclaration_818584 != null) {
			if (!mClass.equals(__DEC_mSyntethic_abstractTypeDeclaration_818584)) {
				return new Object[] { mSyntethic, mClass };
			}
		}

		return null;
	}

	public static final Object[] pattern_SyntethicMethod_21_2_testcorematchandDECs_black_nac_1B(
			MSyntheticMethodDefinition mSyntethic) {
		AnonymousClassDeclaration __DEC_mSyntethic_anonymousClassDeclarationOwner_345849 = mSyntethic
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mSyntethic_anonymousClassDeclarationOwner_345849 != null) {
			return new Object[] { mSyntethic };
		}

		return null;
	}

	public static final Object[] pattern_SyntethicMethod_21_2_testcorematchandDECs_black_nac_2BB(
			MSyntheticMethodDefinition mSyntethic, MMethodDefinition mDef) {
		MMethodDefinition __DEC_mSyntethic_syntheticMethodDefinitions_6918 = mSyntethic.getOriginalMethodDefinition();
		if (__DEC_mSyntethic_syntheticMethodDefinitions_6918 != null) {
			if (!mDef.equals(__DEC_mSyntethic_syntheticMethodDefinitions_6918)) {
				return new Object[] { mSyntethic, mDef };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_SyntethicMethod_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMClass = _edge_bodyDeclarations.getSrc();
		if (tmpMClass instanceof ClassDeclaration) {
			ClassDeclaration mClass = (ClassDeclaration) tmpMClass;
			EObject tmpMSyntethic = _edge_bodyDeclarations.getTrg();
			if (tmpMSyntethic instanceof MSyntheticMethodDefinition) {
				MSyntheticMethodDefinition mSyntethic = (MSyntheticMethodDefinition) tmpMSyntethic;
				if (mClass.getBodyDeclarations().contains(mSyntethic)) {
					MMethodDefinition mDef = mSyntethic.getOriginalMethodDefinition();
					if (mDef != null) {
						if (pattern_SyntethicMethod_21_2_testcorematchandDECs_black_nac_0BB(mSyntethic,
								mClass) == null) {
							if (pattern_SyntethicMethod_21_2_testcorematchandDECs_black_nac_1B(mSyntethic) == null) {
								if (pattern_SyntethicMethod_21_2_testcorematchandDECs_black_nac_2BB(mSyntethic,
										mDef) == null) {
									_result.add(new Object[] { mClass, mSyntethic, mDef, _edge_bodyDeclarations });
								}
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SyntethicMethod_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			SyntethicMethod _this, Match match, ClassDeclaration mClass, MSyntheticMethodDefinition mSyntethic,
			MMethodDefinition mDef) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mClass, mSyntethic, mDef);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SyntethicMethod_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SyntethicMethod _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SyntethicMethod_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_24_1_prepare_blackB(SyntethicMethod _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SyntethicMethod_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_SyntethicMethod_24_2_matchsrctrgcontext_bindingFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tClass");
		EObject _localVariable_1 = targetMatch.getObject("tSyntethic");
		EObject _localVariable_2 = sourceMatch.getObject("mClass");
		EObject _localVariable_3 = targetMatch.getObject("tDef");
		EObject _localVariable_4 = sourceMatch.getObject("mSyntethic");
		EObject _localVariable_5 = sourceMatch.getObject("mDef");
		EObject _localVariable_6 = targetMatch.getObject("tSig");
		EObject tmpTClass = _localVariable_0;
		EObject tmpTSyntethic = _localVariable_1;
		EObject tmpMClass = _localVariable_2;
		EObject tmpTDef = _localVariable_3;
		EObject tmpMSyntethic = _localVariable_4;
		EObject tmpMDef = _localVariable_5;
		EObject tmpTSig = _localVariable_6;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpTSyntethic instanceof TSyntethicMethod) {
				TSyntethicMethod tSyntethic = (TSyntethicMethod) tmpTSyntethic;
				if (tmpMClass instanceof ClassDeclaration) {
					ClassDeclaration mClass = (ClassDeclaration) tmpMClass;
					if (tmpTDef instanceof TMethodDefinition) {
						TMethodDefinition tDef = (TMethodDefinition) tmpTDef;
						if (tmpMSyntethic instanceof MSyntheticMethodDefinition) {
							MSyntheticMethodDefinition mSyntethic = (MSyntheticMethodDefinition) tmpMSyntethic;
							if (tmpMDef instanceof MMethodDefinition) {
								MMethodDefinition mDef = (MMethodDefinition) tmpMDef;
								if (tmpTSig instanceof TMethodSignature) {
									TMethodSignature tSig = (TMethodSignature) tmpTSig;
									return new Object[] { tClass, tSyntethic, mClass, tDef, mSyntethic, mDef, tSig,
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

	public static final Object[] pattern_SyntethicMethod_24_2_matchsrctrgcontext_blackBBBBBBBBB(TClass tClass,
			TSyntethicMethod tSyntethic, ClassDeclaration mClass, TMethodDefinition tDef,
			MSyntheticMethodDefinition mSyntethic, MMethodDefinition mDef, TMethodSignature tSig, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tClass, tSyntethic, mClass, tDef, mSyntethic, mDef, tSig, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_SyntethicMethod_24_2_matchsrctrgcontext_binding = pattern_SyntethicMethod_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_SyntethicMethod_24_2_matchsrctrgcontext_binding != null) {
			TClass tClass = (TClass) result_pattern_SyntethicMethod_24_2_matchsrctrgcontext_binding[0];
			TSyntethicMethod tSyntethic = (TSyntethicMethod) result_pattern_SyntethicMethod_24_2_matchsrctrgcontext_binding[1];
			ClassDeclaration mClass = (ClassDeclaration) result_pattern_SyntethicMethod_24_2_matchsrctrgcontext_binding[2];
			TMethodDefinition tDef = (TMethodDefinition) result_pattern_SyntethicMethod_24_2_matchsrctrgcontext_binding[3];
			MSyntheticMethodDefinition mSyntethic = (MSyntheticMethodDefinition) result_pattern_SyntethicMethod_24_2_matchsrctrgcontext_binding[4];
			MMethodDefinition mDef = (MMethodDefinition) result_pattern_SyntethicMethod_24_2_matchsrctrgcontext_binding[5];
			TMethodSignature tSig = (TMethodSignature) result_pattern_SyntethicMethod_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_SyntethicMethod_24_2_matchsrctrgcontext_black = pattern_SyntethicMethod_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					tClass, tSyntethic, mClass, tDef, mSyntethic, mDef, tSig, sourceMatch, targetMatch);
			if (result_pattern_SyntethicMethod_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tClass, tSyntethic, mClass, tDef, mSyntethic, mDef, tSig, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_24_3_solvecsp_bindingFBBBBBBBBBB(SyntethicMethod _this,
			TClass tClass, TSyntethicMethod tSyntethic, ClassDeclaration mClass, TMethodDefinition tDef,
			MSyntheticMethodDefinition mSyntethic, MMethodDefinition mDef, TMethodSignature tSig, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(tClass, tSyntethic, mClass, tDef, mSyntethic, mDef, tSig,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, tClass, tSyntethic, mClass, tDef, mSyntethic, mDef, tSig, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SyntethicMethod_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(SyntethicMethod _this,
			TClass tClass, TSyntethicMethod tSyntethic, ClassDeclaration mClass, TMethodDefinition tDef,
			MSyntheticMethodDefinition mSyntethic, MMethodDefinition mDef, TMethodSignature tSig, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_SyntethicMethod_24_3_solvecsp_binding = pattern_SyntethicMethod_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, tClass, tSyntethic, mClass, tDef, mSyntethic, mDef, tSig, sourceMatch, targetMatch);
		if (result_pattern_SyntethicMethod_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_SyntethicMethod_24_3_solvecsp_binding[0];

			Object[] result_pattern_SyntethicMethod_24_3_solvecsp_black = pattern_SyntethicMethod_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_SyntethicMethod_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tClass, tSyntethic, mClass, tDef, mSyntethic, mDef, tSig, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_SyntethicMethod_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_SyntethicMethod_24_5_matchcorrcontext_blackFBFBBBBB(TClass tClass,
			ClassDeclaration mClass, TMethodDefinition tDef, MMethodDefinition mDef, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType mClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tClass, TypeToTAbstractType.class, "target")) {
				if (mClass.equals(mClassDeclarationToTClass.getSource())) {
					for (MDefinitionToTMember mDefinitionToTMember : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tDef, MDefinitionToTMember.class, "target")) {
						if (mDef.equals(mDefinitionToTMember.getSource())) {
							_result.add(new Object[] { mClassDeclarationToTClass, tClass, mDefinitionToTMember, mClass,
									tDef, mDef, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType mClassDeclarationToTClass, MDefinitionToTMember mDefinitionToTMember, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "SyntethicMethod";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mClassDeclarationToTClass);
		ccMatch.getAllContextElements().add(mDefinitionToTMember);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mClassDeclarationToTClass, mDefinitionToTMember, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_SyntethicMethod_24_6_createcorrespondence_blackBBBBBBBB(TClass tClass,
			TSyntethicMethod tSyntethic, ClassDeclaration mClass, TMethodDefinition tDef,
			MSyntheticMethodDefinition mSyntethic, MMethodDefinition mDef, TMethodSignature tSig, CCMatch ccMatch) {
		return new Object[] { tClass, tSyntethic, mClass, tDef, mSyntethic, mDef, tSig, ccMatch };
	}

	public static final Object[] pattern_SyntethicMethod_24_6_createcorrespondence_greenBFBB(
			TSyntethicMethod tSyntethic, MSyntheticMethodDefinition mSyntethic, CCMatch ccMatch) {
		MSyntethicMethodToTSyntethicMethod mSyntToTSynt = PmFactory.eINSTANCE
				.createMSyntethicMethodToTSyntethicMethod();
		mSyntToTSynt.setTarget(tSyntethic);
		mSyntToTSynt.setSource(mSyntethic);
		ccMatch.getCreateCorr().add(mSyntToTSynt);
		return new Object[] { tSyntethic, mSyntToTSynt, mSyntethic, ccMatch };
	}

	public static final Object[] pattern_SyntethicMethod_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_SyntethicMethod_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "SyntethicMethod";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_SyntethicMethod_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_27_1_matchtggpattern_black_nac_0BB(
			MSyntheticMethodDefinition mSyntethic, ClassDeclaration mClass) {
		AbstractTypeDeclaration __DEC_mSyntethic_abstractTypeDeclaration_873196 = mSyntethic
				.getAbstractTypeDeclaration();
		if (__DEC_mSyntethic_abstractTypeDeclaration_873196 != null) {
			if (!mClass.equals(__DEC_mSyntethic_abstractTypeDeclaration_873196)) {
				return new Object[] { mSyntethic, mClass };
			}
		}

		return null;
	}

	public static final Object[] pattern_SyntethicMethod_27_1_matchtggpattern_black_nac_1B(
			MSyntheticMethodDefinition mSyntethic) {
		AnonymousClassDeclaration __DEC_mSyntethic_anonymousClassDeclarationOwner_38432 = mSyntethic
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mSyntethic_anonymousClassDeclarationOwner_38432 != null) {
			return new Object[] { mSyntethic };
		}

		return null;
	}

	public static final Object[] pattern_SyntethicMethod_27_1_matchtggpattern_black_nac_2BB(
			MSyntheticMethodDefinition mSyntethic, MMethodDefinition mDef) {
		MMethodDefinition __DEC_mSyntethic_syntheticMethodDefinitions_398745 = mSyntethic.getOriginalMethodDefinition();
		if (__DEC_mSyntethic_syntheticMethodDefinitions_398745 != null) {
			if (!mDef.equals(__DEC_mSyntethic_syntheticMethodDefinitions_398745)) {
				return new Object[] { mSyntethic, mDef };
			}
		}

		return null;
	}

	public static final Object[] pattern_SyntethicMethod_27_1_matchtggpattern_blackBBB(ClassDeclaration mClass,
			MSyntheticMethodDefinition mSyntethic, MMethodDefinition mDef) {
		if (mClass.getBodyDeclarations().contains(mSyntethic)) {
			if (mDef.getSyntheticMethodDefinitions().contains(mSyntethic)) {
				if (pattern_SyntethicMethod_27_1_matchtggpattern_black_nac_0BB(mSyntethic, mClass) == null) {
					if (pattern_SyntethicMethod_27_1_matchtggpattern_black_nac_1B(mSyntethic) == null) {
						if (pattern_SyntethicMethod_27_1_matchtggpattern_black_nac_2BB(mSyntethic, mDef) == null) {
							return new Object[] { mClass, mSyntethic, mDef };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_SyntethicMethod_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SyntethicMethod_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_28_1_matchtggpattern_black_nac_0BB(TSyntethicMethod tSyntethic,
			TMethodDefinition tDef) {
		TMethodDefinition __DEC_tSyntethic_syntethicMethods_275309 = tSyntethic.getOriginalMethodDefinition();
		if (__DEC_tSyntethic_syntethicMethods_275309 != null) {
			if (!tDef.equals(__DEC_tSyntethic_syntethicMethods_275309)) {
				return new Object[] { tSyntethic, tDef };
			}
		}

		return null;
	}

	public static final Object[] pattern_SyntethicMethod_28_1_matchtggpattern_black_nac_1BB(TSyntethicMethod tSyntethic,
			TMethodSignature tSig) {
		TSignature __DEC_tSyntethic_definitions_590276 = tSyntethic.getSignature();
		if (__DEC_tSyntethic_definitions_590276 != null) {
			if (!tSig.equals(__DEC_tSyntethic_definitions_590276)) {
				return new Object[] { tSyntethic, tSig };
			}
		}

		return null;
	}

	public static final Object[] pattern_SyntethicMethod_28_1_matchtggpattern_blackBBBB(TClass tClass,
			TSyntethicMethod tSyntethic, TMethodDefinition tDef, TMethodSignature tSig) {
		if (tClass.getDefines().contains(tSyntethic)) {
			if (tSig.equals(tSyntethic.getSignature())) {
				if (tSig.equals(tDef.getSignature())) {
					if (tDef.getSyntethicMethods().contains(tSyntethic)) {
						if (pattern_SyntethicMethod_28_1_matchtggpattern_black_nac_0BB(tSyntethic, tDef) == null) {
							if (pattern_SyntethicMethod_28_1_matchtggpattern_black_nac_1BB(tSyntethic, tSig) == null) {
								return new Object[] { tClass, tSyntethic, tDef, tSig };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_SyntethicMethod_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SyntethicMethod_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_29_1_createresult_blackB(SyntethicMethod _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SyntethicMethod_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_SyntethicMethod_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mClassDeclarationToTClass) {
		if (ruleResult.getCorrObjects().contains(mClassDeclarationToTClass)) {
			return new Object[] { ruleResult, mClassDeclarationToTClass };
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TClass tClass) {
		if (ruleResult.getTargetObjects().contains(tClass)) {
			return new Object[] { ruleResult, tClass };
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, ClassDeclaration mClass) {
		if (ruleResult.getSourceObjects().contains(mClass)) {
			return new Object[] { ruleResult, mClass };
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mDefinitionToTMember) {
		if (ruleResult.getCorrObjects().contains(mDefinitionToTMember)) {
			return new Object[] { ruleResult, mDefinitionToTMember };
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TMethodDefinition tDef) {
		if (ruleResult.getTargetObjects().contains(tDef)) {
			return new Object[] { ruleResult, tDef };
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TMethodSignature tSig) {
		if (ruleResult.getTargetObjects().contains(tSig)) {
			return new Object[] { ruleResult, tSig };
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, MMethodDefinition mDef) {
		if (ruleResult.getSourceObjects().contains(mDef)) {
			return new Object[] { ruleResult, mDef };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SyntethicMethod_29_2_isapplicablecore_blackFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mClassDeclarationToTClassList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mDefinitionToTMemberList : ruleEntryContainer.getRuleEntryList()) {
				if (!mClassDeclarationToTClassList.equals(mDefinitionToTMemberList)) {
					for (EObject tmpMClassDeclarationToTClass : mClassDeclarationToTClassList.getEntryObjects()) {
						if (tmpMClassDeclarationToTClass instanceof TypeToTAbstractType) {
							TypeToTAbstractType mClassDeclarationToTClass = (TypeToTAbstractType) tmpMClassDeclarationToTClass;
							TAbstractType tmpTClass = mClassDeclarationToTClass.getTarget();
							if (tmpTClass instanceof TClass) {
								TClass tClass = (TClass) tmpTClass;
								Type tmpMClass = mClassDeclarationToTClass.getSource();
								if (tmpMClass instanceof ClassDeclaration) {
									ClassDeclaration mClass = (ClassDeclaration) tmpMClass;
									if (pattern_SyntethicMethod_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											mClassDeclarationToTClass) == null) {
										if (pattern_SyntethicMethod_29_2_isapplicablecore_black_nac_1BB(ruleResult,
												tClass) == null) {
											if (pattern_SyntethicMethod_29_2_isapplicablecore_black_nac_2BB(ruleResult,
													mClass) == null) {
												for (EObject tmpMDefinitionToTMember : mDefinitionToTMemberList
														.getEntryObjects()) {
													if (tmpMDefinitionToTMember instanceof MDefinitionToTMember) {
														MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) tmpMDefinitionToTMember;
														TMember tmpTDef = mDefinitionToTMember.getTarget();
														if (tmpTDef instanceof TMethodDefinition) {
															TMethodDefinition tDef = (TMethodDefinition) tmpTDef;
															BodyDeclaration tmpMDef = mDefinitionToTMember.getSource();
															if (tmpMDef instanceof MMethodDefinition) {
																MMethodDefinition mDef = (MMethodDefinition) tmpMDef;
																TSignature tmpTSig = tDef.getSignature();
																if (tmpTSig instanceof TMethodSignature) {
																	TMethodSignature tSig = (TMethodSignature) tmpTSig;
																	if (pattern_SyntethicMethod_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, mDefinitionToTMember) == null) {
																		if (pattern_SyntethicMethod_29_2_isapplicablecore_black_nac_4BB(
																				ruleResult, tDef) == null) {
																			if (pattern_SyntethicMethod_29_2_isapplicablecore_black_nac_6BB(
																					ruleResult, mDef) == null) {
																				if (pattern_SyntethicMethod_29_2_isapplicablecore_black_nac_5BB(
																						ruleResult, tSig) == null) {
																					_result.add(new Object[] {
																							mClassDeclarationToTClassList,
																							mClassDeclarationToTClass,
																							tClass, mClass,
																							mDefinitionToTMemberList,
																							mDefinitionToTMember, tDef,
																							tSig, mDef,
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
		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_29_3_solveCSP_bindingFBBBBBBBBBB(SyntethicMethod _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mClassDeclarationToTClass, TClass tClass,
			MDefinitionToTMember mDefinitionToTMember, ClassDeclaration mClass, TMethodDefinition tDef,
			MMethodDefinition mDef, TMethodSignature tSig, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mClassDeclarationToTClass, tClass,
				mDefinitionToTMember, mClass, tDef, mDef, tSig, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mClassDeclarationToTClass, tClass,
					mDefinitionToTMember, mClass, tDef, mDef, tSig, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_SyntethicMethod_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SyntethicMethod_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(SyntethicMethod _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mClassDeclarationToTClass, TClass tClass,
			MDefinitionToTMember mDefinitionToTMember, ClassDeclaration mClass, TMethodDefinition tDef,
			MMethodDefinition mDef, TMethodSignature tSig, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_SyntethicMethod_29_3_solveCSP_binding = pattern_SyntethicMethod_29_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, mClassDeclarationToTClass, tClass, mDefinitionToTMember, mClass, tDef, mDef,
				tSig, ruleResult);
		if (result_pattern_SyntethicMethod_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SyntethicMethod_29_3_solveCSP_binding[0];

			Object[] result_pattern_SyntethicMethod_29_3_solveCSP_black = pattern_SyntethicMethod_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_SyntethicMethod_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mClassDeclarationToTClass, tClass,
						mDefinitionToTMember, mClass, tDef, mDef, tSig, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_SyntethicMethod_29_4_checkCSP_expressionFBB(SyntethicMethod _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SyntethicMethod_29_5_checknacs_blackBBBBBBB(
			TypeToTAbstractType mClassDeclarationToTClass, TClass tClass, MDefinitionToTMember mDefinitionToTMember,
			ClassDeclaration mClass, TMethodDefinition tDef, MMethodDefinition mDef, TMethodSignature tSig) {
		return new Object[] { mClassDeclarationToTClass, tClass, mDefinitionToTMember, mClass, tDef, mDef, tSig };
	}

	public static final Object[] pattern_SyntethicMethod_29_6_perform_blackBBBBBBBB(
			TypeToTAbstractType mClassDeclarationToTClass, TClass tClass, MDefinitionToTMember mDefinitionToTMember,
			ClassDeclaration mClass, TMethodDefinition tDef, MMethodDefinition mDef, TMethodSignature tSig,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mClassDeclarationToTClass, tClass, mDefinitionToTMember, mClass, tDef, mDef, tSig,
				ruleResult };
	}

	public static final Object[] pattern_SyntethicMethod_29_6_perform_greenBFFBBFBBB(TClass tClass,
			ClassDeclaration mClass, TMethodDefinition tDef, MMethodDefinition mDef, TMethodSignature tSig,
			ModelgeneratorRuleResult ruleResult) {
		TSyntethicMethod tSyntethic = BasicFactory.eINSTANCE.createTSyntethicMethod();
		MSyntethicMethodToTSyntethicMethod mSyntToTSynt = PmFactory.eINSTANCE
				.createMSyntethicMethodToTSyntethicMethod();
		MSyntheticMethodDefinition mSyntethic = ModiscoFactory.eINSTANCE.createMSyntheticMethodDefinition();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		tClass.getDefines().add(tSyntethic);
		tSyntethic.setSignature(tSig);
		tDef.getSyntethicMethods().add(tSyntethic);
		ruleResult.getTargetObjects().add(tSyntethic);
		mSyntToTSynt.setTarget(tSyntethic);
		ruleResult.getCorrObjects().add(mSyntToTSynt);
		mClass.getBodyDeclarations().add(mSyntethic);
		mSyntToTSynt.setSource(mSyntethic);
		mDef.getSyntheticMethodDefinitions().add(mSyntethic);
		ruleResult.getSourceObjects().add(mSyntethic);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tClass, tSyntethic, mSyntToTSynt, mClass, tDef, mSyntethic, mDef, tSig, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_SyntethicMethod_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SyntethicMethodImpl
