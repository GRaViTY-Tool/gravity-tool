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
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.Modifier;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.VisibilityKind;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MDefinition;

import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.MModifierToTModifier;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.MemberInAnnotationVisibility;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TVisibility;

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
 * An implementation of the model object '<em><b>Member In Annotation Visibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MemberInAnnotationVisibilityImpl extends AbstractRuleImpl implements MemberInAnnotationVisibility {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberInAnnotationVisibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMemberInAnnotationVisibility();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, AnnotationTypeDeclaration Annotation, Modifier mModifier,
			MDefinition mDefinition) {

		Object[] result1_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_0_1_initialbindings_blackBBBBB(this, match, Annotation, mModifier,
						mDefinition);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[Annotation] = " + Annotation + ", " + "[mModifier] = " + mModifier
					+ ", " + "[mDefinition] = " + mDefinition + ".");
		}

		Object[] result2_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, Annotation,
						mModifier, mDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[Annotation] = " + Annotation + ", " + "[mModifier] = " + mModifier
					+ ", " + "[mDefinition] = " + mDefinition + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_0_4_collectelementstobetranslated_blackBBBB(match, Annotation,
							mModifier, mDefinition);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[Annotation] = " + Annotation + ", " + "[mModifier] = " + mModifier + ", "
						+ "[mDefinition] = " + mDefinition + ".");
			}
			MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_0_4_collectelementstobetranslated_greenBBBFF(match, mModifier,
							mDefinition);
			//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_0_5_collectcontextelements_blackBBBB(match, Annotation,
							mModifier, mDefinition);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[Annotation] = " + Annotation + ", " + "[mModifier] = " + mModifier + ", "
						+ "[mDefinition] = " + mDefinition + ".");
			}
			MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_0_5_collectcontextelements_greenBBBFF(
					match, Annotation, mDefinition);
			//nothing EMoflonEdge Annotation__mDefinition____bodyDeclarations = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge mDefinition__Annotation____abstractTypeDeclaration = (EMoflonEdge) result5_green[4];

			// 
			MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_0_6_registerobjectstomatch_expressionBBBBB(this, match,
							Annotation, mModifier, mDefinition);
			return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_0_7_expressionF();
		} else {
			return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TMember tMember = (TMember) result1_bindingAndBlack[0];
		AnnotationTypeDeclaration Annotation = (AnnotationTypeDeclaration) result1_bindingAndBlack[1];
		MDefinitionToTMember defToMember = (MDefinitionToTMember) result1_bindingAndBlack[2];
		TAnnotationType tAnnotation = (TAnnotationType) result1_bindingAndBlack[3];
		Modifier mModifier = (Modifier) result1_bindingAndBlack[4];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[5];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_1_1_performtransformation_greenFBBFB(tMember, mModifier, csp);
		MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result1_green[0];
		TModifier tModifier = (TModifier) result1_green[3];

		Object[] result2_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_1_2_collecttranslatedelements_blackBBB(mModifierToTModifier,
						mModifier, tModifier);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[mModifierToTModifier] = " + mModifierToTModifier
							+ ", " + "[mModifier] = " + mModifier + ", " + "[tModifier] = " + tModifier + ".");
		}
		Object[] result2_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_1_2_collecttranslatedelements_greenFBBB(mModifierToTModifier,
						mModifier, tModifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						mModifierToTModifier, tMember, Annotation, defToMember, tAnnotation, mModifier, mTypeToTType,
						tModifier, mDefinition);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mModifierToTModifier] = " + mModifierToTModifier + ", " + "[tMember] = " + tMember + ", "
					+ "[Annotation] = " + Annotation + ", " + "[defToMember] = " + defToMember + ", "
					+ "[tAnnotation] = " + tAnnotation + ", " + "[mModifier] = " + mModifier + ", "
					+ "[mTypeToTType] = " + mTypeToTType + ", " + "[tModifier] = " + tModifier + ", "
					+ "[mDefinition] = " + mDefinition + ".");
		}
		MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, mModifierToTModifier, tMember, mModifier, tModifier, mDefinition);
		//nothing EMoflonEdge mModifierToTModifier__mModifier____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mModifierToTModifier__tModifier____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[10];

		// 
		// 
		MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_1_5_registerobjects_expressionBBBBBBBBBBB(
				this, ruleresult, mModifierToTModifier, tMember, Annotation, defToMember, tAnnotation, mModifier,
				mTypeToTType, tModifier, mDefinition);
		return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		AnnotationTypeDeclaration Annotation = (AnnotationTypeDeclaration) result2_binding[0];
		Modifier mModifier = (Modifier) result2_binding[1];
		MDefinition mDefinition = (MDefinition) result2_binding[2];
		for (Object[] result2_black : MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_2_2_corematch_blackFBFFBFBB(Annotation, mModifier, mDefinition,
						match)) {
			TMember tMember = (TMember) result2_black[0];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[2];
			TAnnotationType tAnnotation = (TAnnotationType) result2_black[3];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[5];
			// ForEach 
			for (Object[] result3_black : MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_2_3_findcontext_blackBBBBBBB(tMember, Annotation, defToMember,
							tAnnotation, mModifier, mTypeToTType, mDefinition)) {
				Object[] result3_green = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_2_3_findcontext_greenBBBBBBBFFFFFFFFFFF(tMember,
								Annotation, defToMember, tAnnotation, mModifier, mTypeToTType, mDefinition);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge Annotation__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mDefinition__Annotation____abstractTypeDeclaration = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge defToMember__tMember____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mTypeToTType__tAnnotation____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mTypeToTType__Annotation____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tAnnotation__tMember____defines = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tMember__tAnnotation____definedBy = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge defToMember__mDefinition____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[17];

				Object[] result4_bindingAndBlack = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, tMember, Annotation, defToMember, tAnnotation, mModifier,
								mTypeToTType, mDefinition);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tMember] = " + tMember + ", "
							+ "[Annotation] = " + Annotation + ", " + "[defToMember] = " + defToMember + ", "
							+ "[tAnnotation] = " + tAnnotation + ", " + "[mModifier] = " + mModifier + ", "
							+ "[mTypeToTType] = " + mTypeToTType + ", " + "[mDefinition] = " + mDefinition + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MemberInAnnotationVisibilityImpl
							.pattern_MemberInAnnotationVisibility_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MemberInAnnotationVisibilityImpl
							.pattern_MemberInAnnotationVisibility_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, AnnotationTypeDeclaration Annotation, Modifier mModifier,
			MDefinition mDefinition) {
		match.registerObject("Annotation", Annotation);
		match.registerObject("mModifier", mModifier);
		match.registerObject("mDefinition", mDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, AnnotationTypeDeclaration Annotation, Modifier mModifier,
			MDefinition mDefinition) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TMember tMember,
			AnnotationTypeDeclaration Annotation, MDefinitionToTMember defToMember, TAnnotationType tAnnotation,
			Modifier mModifier, TypeToTAbstractType mTypeToTType, MDefinition mDefinition) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.static", true, csp);
		var_mModifier_static.setValue(mModifier.isStatic());
		var_mModifier_static.setType("Boolean");
		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.visibility", true,
				csp);
		var_mModifier_visibility.setValue(mModifier.getVisibility());
		var_mModifier_visibility.setType("java.VisibilityKind");

		// Create unbound variables
		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.isStatic", csp);
		var_tModifier_isStatic.setType("Boolean");
		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.tVisibility", csp);
		var_tModifier_tVisibility.setType("basic.TVisibility");

		// Create constraints
		Eq eq = new Eq();
		DefaultVisibility defaultVisibility = new DefaultVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(defaultVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);
		defaultVisibility.setRuleName("NoRuleName");
		defaultVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("Annotation", Annotation);
		isApplicableMatch.registerObject("defToMember", defToMember);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("mModifier", mModifier);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mModifierToTModifier, EObject tMember,
			EObject Annotation, EObject defToMember, EObject tAnnotation, EObject mModifier, EObject mTypeToTType,
			EObject tModifier, EObject mDefinition) {
		ruleresult.registerObject("mModifierToTModifier", mModifierToTModifier);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("Annotation", Annotation);
		ruleresult.registerObject("defToMember", defToMember);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("mModifier", mModifier);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tModifier", tModifier);
		ruleresult.registerObject("mDefinition", mDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mModifier").eClass())
				.equals("java.Modifier.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TMember tMember, TAnnotationType tAnnotation, TModifier tModifier) {

		Object[] result1_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_10_1_initialbindings_blackBBBBB(this, match, tMember, tAnnotation,
						tModifier);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tMember] = " + tMember + ", " + "[tAnnotation] = " + tAnnotation
					+ ", " + "[tModifier] = " + tModifier + ".");
		}

		Object[] result2_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tMember,
						tAnnotation, tModifier);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tMember] = " + tMember + ", " + "[tAnnotation] = " + tAnnotation
					+ ", " + "[tModifier] = " + tModifier + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_10_4_collectelementstobetranslated_blackBBBB(match, tMember,
							tAnnotation, tModifier);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tMember] = " + tMember + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tModifier] = "
						+ tModifier + ".");
			}
			MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_10_4_collectelementstobetranslated_greenBBBF(match, tMember,
							tModifier);
			//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result4_green[3];

			Object[] result5_black = MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_10_5_collectcontextelements_blackBBBB(match, tMember,
							tAnnotation, tModifier);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tMember] = " + tMember + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tModifier] = "
						+ tModifier + ".");
			}
			MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_10_5_collectcontextelements_greenBBBFF(match, tMember,
							tAnnotation);
			//nothing EMoflonEdge tAnnotation__tMember____defines = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge tMember__tAnnotation____definedBy = (EMoflonEdge) result5_green[4];

			// 
			MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_10_6_registerobjectstomatch_expressionBBBBB(this, match,
							tMember, tAnnotation, tModifier);
			return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_10_7_expressionF();
		} else {
			return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TMember tMember = (TMember) result1_bindingAndBlack[0];
		AnnotationTypeDeclaration Annotation = (AnnotationTypeDeclaration) result1_bindingAndBlack[1];
		MDefinitionToTMember defToMember = (MDefinitionToTMember) result1_bindingAndBlack[2];
		TAnnotationType tAnnotation = (TAnnotationType) result1_bindingAndBlack[3];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[4];
		TModifier tModifier = (TModifier) result1_bindingAndBlack[5];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_11_1_performtransformation_greenFFBBB(tModifier, mDefinition,
						csp);
		MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result1_green[0];
		Modifier mModifier = (Modifier) result1_green[1];

		Object[] result2_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_11_2_collecttranslatedelements_blackBBB(mModifierToTModifier,
						mModifier, tModifier);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[mModifierToTModifier] = " + mModifierToTModifier
							+ ", " + "[mModifier] = " + mModifier + ", " + "[tModifier] = " + tModifier + ".");
		}
		Object[] result2_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_11_2_collecttranslatedelements_greenFBBB(mModifierToTModifier,
						mModifier, tModifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						mModifierToTModifier, tMember, Annotation, defToMember, tAnnotation, mModifier, mTypeToTType,
						tModifier, mDefinition);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mModifierToTModifier] = " + mModifierToTModifier + ", " + "[tMember] = " + tMember + ", "
					+ "[Annotation] = " + Annotation + ", " + "[defToMember] = " + defToMember + ", "
					+ "[tAnnotation] = " + tAnnotation + ", " + "[mModifier] = " + mModifier + ", "
					+ "[mTypeToTType] = " + mTypeToTType + ", " + "[tModifier] = " + tModifier + ", "
					+ "[mDefinition] = " + mDefinition + ".");
		}
		MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, mModifierToTModifier, tMember, mModifier, tModifier, mDefinition);
		//nothing EMoflonEdge mModifierToTModifier__mModifier____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mModifierToTModifier__tModifier____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[10];

		// 
		// 
		MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
						mModifierToTModifier, tMember, Annotation, defToMember, tAnnotation, mModifier, mTypeToTType,
						tModifier, mDefinition);
		return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMember tMember = (TMember) result2_binding[0];
		TAnnotationType tAnnotation = (TAnnotationType) result2_binding[1];
		TModifier tModifier = (TModifier) result2_binding[2];
		for (Object[] result2_black : MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_12_2_corematch_blackBFFBFBFB(tMember, tAnnotation, tModifier,
						match)) {
			AnnotationTypeDeclaration Annotation = (AnnotationTypeDeclaration) result2_black[1];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[2];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[4];
			MDefinition mDefinition = (MDefinition) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_12_3_findcontext_blackBBBBBBB(tMember, Annotation,
							defToMember, tAnnotation, mTypeToTType, tModifier, mDefinition)) {
				Object[] result3_green = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_12_3_findcontext_greenBBBBBBBFFFFFFFFFF(tMember,
								Annotation, defToMember, tAnnotation, mTypeToTType, tModifier, mDefinition);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge Annotation__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mDefinition__Annotation____abstractTypeDeclaration = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge defToMember__tMember____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mTypeToTType__tAnnotation____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mTypeToTType__Annotation____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tAnnotation__tMember____defines = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tMember__tAnnotation____definedBy = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge defToMember__mDefinition____source = (EMoflonEdge) result3_green[16];

				Object[] result4_bindingAndBlack = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, tMember, Annotation, defToMember, tAnnotation, mTypeToTType,
								tModifier, mDefinition);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tMember] = " + tMember + ", "
							+ "[Annotation] = " + Annotation + ", " + "[defToMember] = " + defToMember + ", "
							+ "[tAnnotation] = " + tAnnotation + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
							+ "[tModifier] = " + tModifier + ", " + "[mDefinition] = " + mDefinition + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MemberInAnnotationVisibilityImpl
							.pattern_MemberInAnnotationVisibility_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MemberInAnnotationVisibilityImpl
							.pattern_MemberInAnnotationVisibility_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TMember tMember, TAnnotationType tAnnotation,
			TModifier tModifier) {
		match.registerObject("tMember", tMember);
		match.registerObject("tAnnotation", tAnnotation);
		match.registerObject("tModifier", tModifier);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMember tMember, TAnnotationType tAnnotation,
			TModifier tModifier) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TMember tMember,
			AnnotationTypeDeclaration Annotation, MDefinitionToTMember defToMember, TAnnotationType tAnnotation,
			TypeToTAbstractType mTypeToTType, TModifier tModifier, MDefinition mDefinition) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.isStatic", true, csp);
		var_tModifier_isStatic.setValue(tModifier.isIsStatic());
		var_tModifier_isStatic.setType("Boolean");
		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.tVisibility", true,
				csp);
		var_tModifier_tVisibility.setValue(tModifier.getTVisibility());
		var_tModifier_tVisibility.setType("basic.TVisibility");

		// Create unbound variables
		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.static", csp);
		var_mModifier_static.setType("Boolean");
		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.visibility", csp);
		var_mModifier_visibility.setType("java.VisibilityKind");

		// Create constraints
		Eq eq = new Eq();
		DefaultVisibility defaultVisibility = new DefaultVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(defaultVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);
		defaultVisibility.setRuleName("NoRuleName");
		defaultVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("Annotation", Annotation);
		isApplicableMatch.registerObject("defToMember", defToMember);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tModifier", tModifier);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mModifierToTModifier, EObject tMember,
			EObject Annotation, EObject defToMember, EObject tAnnotation, EObject mModifier, EObject mTypeToTType,
			EObject tModifier, EObject mDefinition) {
		ruleresult.registerObject("mModifierToTModifier", mModifierToTModifier);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("Annotation", Annotation);
		ruleresult.registerObject("defToMember", defToMember);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("mModifier", mModifier);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tModifier", tModifier);
		ruleresult.registerObject("mDefinition", mDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tModifier").eClass())
				.equals("basic.TModifier.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_50(EMoflonEdge _edge_tModifier) {

		Object[] result1_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_20_2_testcorematchandDECs_blackFFFB(_edge_tModifier)) {
			TMember tMember = (TMember) result2_black[0];
			TAnnotationType tAnnotation = (TAnnotationType) result2_black[1];
			TModifier tModifier = (TModifier) result2_black[2];
			Object[] result2_green = MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tMember, tAnnotation, tModifier)) {
				// 
				if (MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MemberInAnnotationVisibilityImpl
							.pattern_MemberInAnnotationVisibility_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MemberInAnnotationVisibilityImpl
							.pattern_MemberInAnnotationVisibility_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_53(EMoflonEdge _edge_modifier) {

		Object[] result1_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_21_2_testcorematchandDECs_blackFFFB(_edge_modifier)) {
			AnnotationTypeDeclaration Annotation = (AnnotationTypeDeclaration) result2_black[0];
			Modifier mModifier = (Modifier) result2_black[1];
			MDefinition mDefinition = (MDefinition) result2_black[2];
			Object[] result2_green = MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, Annotation, mModifier, mDefinition)) {
				// 
				if (MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MemberInAnnotationVisibilityImpl
							.pattern_MemberInAnnotationVisibility_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MemberInAnnotationVisibilityImpl
							.pattern_MemberInAnnotationVisibility_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MemberInAnnotationVisibility");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_static.setValue(__helper.getValue("mModifier", "static"));
		var_mModifier_static.setType("boolean");

		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_isStatic.setValue(__helper.getValue("tModifier", "isStatic"));
		var_tModifier_isStatic.setType("boolean");

		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_visibility.setValue(__helper.getValue("mModifier", "visibility"));
		var_mModifier_visibility.setType("java.VisibilityKind");

		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_tVisibility.setValue(__helper.getValue("tModifier", "tVisibility"));
		var_tModifier_tVisibility.setType("basic.TVisibility");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		DefaultVisibility defaultVisibility1 = new DefaultVisibility();
		csp.getConstraints().add(defaultVisibility1);

		eq0.setRuleName("MemberInAnnotationVisibility");
		eq0.solve(var_mModifier_static, var_tModifier_isStatic);

		defaultVisibility1.setRuleName("MemberInAnnotationVisibility");
		defaultVisibility1.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tModifier_isStatic.setBound(false);
			var_tModifier_tVisibility.setBound(false);
			eq0.solve(var_mModifier_static, var_tModifier_isStatic);
			defaultVisibility1.solve(var_mModifier_visibility, var_tModifier_tVisibility);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tModifier", "isStatic", var_tModifier_isStatic.getValue());
				__helper.setValue("tModifier", "tVisibility", var_tModifier_tVisibility.getValue());
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
		ruleResult.setRule("MemberInAnnotationVisibility");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_static.setValue(__helper.getValue("mModifier", "static"));
		var_mModifier_static.setType("boolean");

		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_isStatic.setValue(__helper.getValue("tModifier", "isStatic"));
		var_tModifier_isStatic.setType("boolean");

		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_visibility.setValue(__helper.getValue("mModifier", "visibility"));
		var_mModifier_visibility.setType("java.VisibilityKind");

		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_tVisibility.setValue(__helper.getValue("tModifier", "tVisibility"));
		var_tModifier_tVisibility.setType("basic.TVisibility");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		DefaultVisibility defaultVisibility1 = new DefaultVisibility();
		csp.getConstraints().add(defaultVisibility1);

		eq0.setRuleName("MemberInAnnotationVisibility");
		eq0.solve(var_mModifier_static, var_tModifier_isStatic);

		defaultVisibility1.setRuleName("MemberInAnnotationVisibility");
		defaultVisibility1.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mModifier_static.setBound(false);
			var_mModifier_visibility.setBound(false);
			eq0.solve(var_mModifier_static, var_tModifier_isStatic);
			defaultVisibility1.solve(var_mModifier_visibility, var_tModifier_tVisibility);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mModifier", "static", var_mModifier_static.getValue());
				__helper.setValue("mModifier", "visibility", var_mModifier_visibility.getValue());
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

		Object[] result1_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TMember tMember = (TMember) result2_bindingAndBlack[0];
		AnnotationTypeDeclaration Annotation = (AnnotationTypeDeclaration) result2_bindingAndBlack[1];
		TAnnotationType tAnnotation = (TAnnotationType) result2_bindingAndBlack[2];
		Modifier mModifier = (Modifier) result2_bindingAndBlack[3];
		TModifier tModifier = (TModifier) result2_bindingAndBlack[4];
		MDefinition mDefinition = (MDefinition) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, tMember, Annotation,
						tAnnotation, mModifier, tModifier, mDefinition, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tMember] = " + tMember + ", " + "[Annotation] = " + Annotation + ", " + "[tAnnotation] = "
					+ tAnnotation + ", " + "[mModifier] = " + mModifier + ", " + "[tModifier] = " + tModifier + ", "
					+ "[mDefinition] = " + mDefinition + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_24_5_matchcorrcontext_blackBBFBFBBB(tMember, Annotation,
							tAnnotation, mDefinition, sourceMatch, targetMatch)) {
				MDefinitionToTMember defToMember = (MDefinitionToTMember) result5_black[2];
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[4];
				Object[] result5_green = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_24_5_matchcorrcontext_greenBBBBF(defToMember,
								mTypeToTType, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_24_6_createcorrespondence_blackBBBBBBB(tMember,
								Annotation, tAnnotation, mModifier, tModifier, mDefinition, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tMember] = " + tMember
							+ ", " + "[Annotation] = " + Annotation + ", " + "[tAnnotation] = " + tAnnotation + ", "
							+ "[mModifier] = " + mModifier + ", " + "[tModifier] = " + tModifier + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_24_6_createcorrespondence_greenFBBB(mModifier, tModifier,
								ccMatch);
				//nothing MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result6_green[0];

				Object[] result7_black = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TMember tMember, AnnotationTypeDeclaration Annotation,
			TAnnotationType tAnnotation, Modifier mModifier, TModifier tModifier, MDefinition mDefinition,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.static", true, csp);
		var_mModifier_static.setValue(mModifier.isStatic());
		var_mModifier_static.setType("Boolean");
		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.isStatic", true, csp);
		var_tModifier_isStatic.setValue(tModifier.isIsStatic());
		var_tModifier_isStatic.setType("Boolean");
		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.visibility", true,
				csp);
		var_mModifier_visibility.setValue(mModifier.getVisibility());
		var_mModifier_visibility.setType("java.VisibilityKind");
		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.tVisibility", true,
				csp);
		var_tModifier_tVisibility.setValue(tModifier.getTVisibility());
		var_tModifier_tVisibility.setType("basic.TVisibility");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		DefaultVisibility defaultVisibility = new DefaultVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(defaultVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);
		defaultVisibility.setRuleName("NoRuleName");
		defaultVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);
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
	public boolean checkDEC_FWD(AnnotationTypeDeclaration Annotation, Modifier mModifier, MDefinition mDefinition) {// 
		Object[] result1_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_27_1_matchtggpattern_blackBBB(Annotation, mModifier, mDefinition);
		if (result1_black != null) {
			return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_27_2_expressionF();
		} else {
			return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMember tMember, TAnnotationType tAnnotation, TModifier tModifier) {// 
		Object[] result1_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_28_1_matchtggpattern_blackBBB(tMember, tAnnotation, tModifier);
		if (result1_black != null) {
			return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_28_2_expressionF();
		} else {
			return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MDefinitionToTMember defToMemberParameter) {

		Object[] result1_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList defToMemberList = (RuleEntryList) result2_black[0];
			TMember tMember = (TMember) result2_black[1];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[2];
			MDefinition mDefinition = (MDefinition) result2_black[3];
			AnnotationTypeDeclaration Annotation = (AnnotationTypeDeclaration) result2_black[4];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[5];
			TAnnotationType tAnnotation = (TAnnotationType) result2_black[6];

			Object[] result3_bindingAndBlack = MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this,
							isApplicableMatch, tMember, Annotation, defToMember, tAnnotation, mTypeToTType, mDefinition,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tMember] = " + tMember + ", "
						+ "[Annotation] = " + Annotation + ", " + "[defToMember] = " + defToMember + ", "
						+ "[tAnnotation] = " + tAnnotation + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_29_5_checknacs_blackBBBBBB(tMember, Annotation,
								defToMember, tAnnotation, mTypeToTType, mDefinition);
				if (result5_black != null) {

					Object[] result6_black = MemberInAnnotationVisibilityImpl
							.pattern_MemberInAnnotationVisibility_29_6_perform_blackBBBBBBB(tMember, Annotation,
									defToMember, tAnnotation, mTypeToTType, mDefinition, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tMember] = "
								+ tMember + ", " + "[Annotation] = " + Annotation + ", " + "[defToMember] = "
								+ defToMember + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[mTypeToTType] = "
								+ mTypeToTType + ", " + "[mDefinition] = " + mDefinition + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_29_6_perform_greenFBFFBBB(
							tMember, mDefinition, ruleResult, csp);
					//nothing MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result6_green[0];
					//nothing Modifier mModifier = (Modifier) result6_green[2];
					//nothing TModifier tModifier = (TModifier) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TMember tMember,
			AnnotationTypeDeclaration Annotation, MDefinitionToTMember defToMember, TAnnotationType tAnnotation,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.static", csp);
		var_mModifier_static.setType("Boolean");
		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.isStatic", csp);
		var_tModifier_isStatic.setType("Boolean");
		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.visibility", csp);
		var_mModifier_visibility.setType("java.VisibilityKind");
		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.tVisibility", csp);
		var_tModifier_tVisibility.setType("basic.TVisibility");

		// Create constraints
		Eq eq = new Eq();
		DefaultVisibility defaultVisibility = new DefaultVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(defaultVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);
		defaultVisibility.setRuleName("NoRuleName");
		defaultVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("Annotation", Annotation);
		isApplicableMatch.registerObject("defToMember", defToMember);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
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
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_FWD__MATCH_ANNOTATIONTYPEDECLARATION_MODIFIER_MDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (AnnotationTypeDeclaration) arguments.get(1),
					(Modifier) arguments.get(2), (MDefinition) arguments.get(3));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ANNOTATIONTYPEDECLARATION_MODIFIER_MDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (AnnotationTypeDeclaration) arguments.get(1),
					(Modifier) arguments.get(2), (MDefinition) arguments.get(3));
			return null;
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ANNOTATIONTYPEDECLARATION_MODIFIER_MDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (AnnotationTypeDeclaration) arguments.get(1),
					(Modifier) arguments.get(2), (MDefinition) arguments.get(3));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TMEMBER_ANNOTATIONTYPEDECLARATION_MDEFINITIONTOTMEMBER_TANNOTATIONTYPE_MODIFIER_TYPETOTABSTRACTTYPE_MDEFINITION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TMember) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2), (MDefinitionToTMember) arguments.get(3),
					(TAnnotationType) arguments.get(4), (Modifier) arguments.get(5),
					(TypeToTAbstractType) arguments.get(6), (MDefinition) arguments.get(7));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_BWD__MATCH_TMEMBER_TANNOTATIONTYPE_TMODIFIER:
			return isAppropriate_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TAnnotationType) arguments.get(2), (TModifier) arguments.get(3));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMEMBER_TANNOTATIONTYPE_TMODIFIER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TAnnotationType) arguments.get(2), (TModifier) arguments.get(3));
			return null;
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMEMBER_TANNOTATIONTYPE_TMODIFIER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TAnnotationType) arguments.get(2), (TModifier) arguments.get(3));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMEMBER_ANNOTATIONTYPEDECLARATION_MDEFINITIONTOTMEMBER_TANNOTATIONTYPE_TYPETOTABSTRACTTYPE_TMODIFIER_MDEFINITION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TMember) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2), (MDefinitionToTMember) arguments.get(3),
					(TAnnotationType) arguments.get(4), (TypeToTAbstractType) arguments.get(5),
					(TModifier) arguments.get(6), (MDefinition) arguments.get(7));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_BWD_EMOFLON_EDGE_50__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_50((EMoflonEdge) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_FWD_EMOFLON_EDGE_53__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_53((EMoflonEdge) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_SOLVE_CSP_CC__TMEMBER_ANNOTATIONTYPEDECLARATION_TANNOTATIONTYPE_MODIFIER_TMODIFIER_MDEFINITION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TMember) arguments.get(0), (AnnotationTypeDeclaration) arguments.get(1),
					(TAnnotationType) arguments.get(2), (Modifier) arguments.get(3), (TModifier) arguments.get(4),
					(MDefinition) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___CHECK_DEC_FWD__ANNOTATIONTYPEDECLARATION_MODIFIER_MDEFINITION:
			return checkDEC_FWD((AnnotationTypeDeclaration) arguments.get(0), (Modifier) arguments.get(1),
					(MDefinition) arguments.get(2));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___CHECK_DEC_BWD__TMEMBER_TANNOTATIONTYPE_TMODIFIER:
			return checkDEC_BWD((TMember) arguments.get(0), (TAnnotationType) arguments.get(1),
					(TModifier) arguments.get(2));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMEMBER_ANNOTATIONTYPEDECLARATION_MDEFINITIONTOTMEMBER_TANNOTATIONTYPE_TYPETOTABSTRACTTYPE_MDEFINITION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TMember) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2), (MDefinitionToTMember) arguments.get(3),
					(TAnnotationType) arguments.get(4), (TypeToTAbstractType) arguments.get(5),
					(MDefinition) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_0_1_initialbindings_blackBBBBB(
			MemberInAnnotationVisibility _this, Match match, AnnotationTypeDeclaration annotation, Modifier mModifier,
			MDefinition mDefinition) {
		return new Object[] { _this, match, annotation, mModifier, mDefinition };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_0_2_SolveCSP_bindingFBBBBB(
			MemberInAnnotationVisibility _this, Match match, AnnotationTypeDeclaration annotation, Modifier mModifier,
			MDefinition mDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, annotation, mModifier, mDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, annotation, mModifier, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_0_2_SolveCSP_bindingAndBlackFBBBBB(
			MemberInAnnotationVisibility _this, Match match, AnnotationTypeDeclaration annotation, Modifier mModifier,
			MDefinition mDefinition) {
		Object[] result_pattern_MemberInAnnotationVisibility_0_2_SolveCSP_binding = pattern_MemberInAnnotationVisibility_0_2_SolveCSP_bindingFBBBBB(
				_this, match, annotation, mModifier, mDefinition);
		if (result_pattern_MemberInAnnotationVisibility_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_0_2_SolveCSP_black = pattern_MemberInAnnotationVisibility_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MemberInAnnotationVisibility_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, annotation, mModifier, mDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_0_3_CheckCSP_expressionFBB(
			MemberInAnnotationVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_0_4_collectelementstobetranslated_blackBBBB(
			Match match, AnnotationTypeDeclaration annotation, Modifier mModifier, MDefinition mDefinition) {
		return new Object[] { match, annotation, mModifier, mDefinition };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, Modifier mModifier, MDefinition mDefinition) {
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mModifier);
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		match.getToBeTranslatedEdges().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		match.getToBeTranslatedEdges().add(mModifier__mDefinition____bodyDeclaration);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		return new Object[] { match, mModifier, mDefinition, mDefinition__mModifier____modifier,
				mModifier__mDefinition____bodyDeclaration };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_0_5_collectcontextelements_blackBBBB(Match match,
			AnnotationTypeDeclaration annotation, Modifier mModifier, MDefinition mDefinition) {
		return new Object[] { match, annotation, mModifier, mDefinition };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_0_5_collectcontextelements_greenBBBFF(Match match,
			AnnotationTypeDeclaration annotation, MDefinition mDefinition) {
		EMoflonEdge annotation__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__Annotation____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(annotation);
		match.getContextNodes().add(mDefinition);
		String annotation__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__Annotation____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		annotation__mDefinition____bodyDeclarations.setSrc(annotation);
		annotation__mDefinition____bodyDeclarations.setTrg(mDefinition);
		match.getContextEdges().add(annotation__mDefinition____bodyDeclarations);
		mDefinition__Annotation____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__Annotation____abstractTypeDeclaration.setTrg(annotation);
		match.getContextEdges().add(mDefinition__Annotation____abstractTypeDeclaration);
		annotation__mDefinition____bodyDeclarations.setName(annotation__mDefinition____bodyDeclarations_name_prime);
		mDefinition__Annotation____abstractTypeDeclaration
				.setName(mDefinition__Annotation____abstractTypeDeclaration_name_prime);
		return new Object[] { match, annotation, mDefinition, annotation__mDefinition____bodyDeclarations,
				mDefinition__Annotation____abstractTypeDeclaration };
	}

	public static final void pattern_MemberInAnnotationVisibility_0_6_registerobjectstomatch_expressionBBBBB(
			MemberInAnnotationVisibility _this, Match match, AnnotationTypeDeclaration annotation, Modifier mModifier,
			MDefinition mDefinition) {
		_this.registerObjectsToMatch_FWD(match, annotation, mModifier, mDefinition);

	}

	public static final boolean pattern_MemberInAnnotationVisibility_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_1 = isApplicableMatch.getObject("Annotation");
		EObject _localVariable_2 = isApplicableMatch.getObject("defToMember");
		EObject _localVariable_3 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_4 = isApplicableMatch.getObject("mModifier");
		EObject _localVariable_5 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_6 = isApplicableMatch.getObject("mDefinition");
		EObject tmpTMember = _localVariable_0;
		EObject tmpAnnotation = _localVariable_1;
		EObject tmpDefToMember = _localVariable_2;
		EObject tmpTAnnotation = _localVariable_3;
		EObject tmpMModifier = _localVariable_4;
		EObject tmpMTypeToTType = _localVariable_5;
		EObject tmpMDefinition = _localVariable_6;
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			if (tmpAnnotation instanceof AnnotationTypeDeclaration) {
				AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) tmpAnnotation;
				if (tmpDefToMember instanceof MDefinitionToTMember) {
					MDefinitionToTMember defToMember = (MDefinitionToTMember) tmpDefToMember;
					if (tmpTAnnotation instanceof TAnnotationType) {
						TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
						if (tmpMModifier instanceof Modifier) {
							Modifier mModifier = (Modifier) tmpMModifier;
							if (tmpMTypeToTType instanceof TypeToTAbstractType) {
								TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
								if (tmpMDefinition instanceof MDefinition) {
									MDefinition mDefinition = (MDefinition) tmpMDefinition;
									return new Object[] { tMember, annotation, defToMember, tAnnotation, mModifier,
											mTypeToTType, mDefinition, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_1_1_performtransformation_blackBBBBBBBFBB(
			TMember tMember, AnnotationTypeDeclaration annotation, MDefinitionToTMember defToMember,
			TAnnotationType tAnnotation, Modifier mModifier, TypeToTAbstractType mTypeToTType, MDefinition mDefinition,
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tMember, annotation, defToMember, tAnnotation, mModifier, mTypeToTType,
						mDefinition, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding = pattern_MemberInAnnotationVisibility_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding != null) {
			TMember tMember = (TMember) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding[0];
			AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding[1];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding[2];
			TAnnotationType tAnnotation = (TAnnotationType) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding[3];
			Modifier mModifier = (Modifier) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding[4];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding[5];
			MDefinition mDefinition = (MDefinition) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding[6];

			Object[] result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_black = pattern_MemberInAnnotationVisibility_1_1_performtransformation_blackBBBBBBBFBB(
					tMember, annotation, defToMember, tAnnotation, mModifier, mTypeToTType, mDefinition, _this,
					isApplicableMatch);
			if (result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_black[7];

				return new Object[] { tMember, annotation, defToMember, tAnnotation, mModifier, mTypeToTType,
						mDefinition, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_1_1_performtransformation_greenFBBFB(
			TMember tMember, Modifier mModifier, CSP csp) {
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		TModifier tModifier = BasicFactory.eINSTANCE.createTModifier();
		Object _localVariable_0 = csp.getValue("tModifier", "isStatic");
		Object _localVariable_1 = csp.getValue("tModifier", "tVisibility");
		mModifierToTModifier.setSource(mModifier);
		mModifierToTModifier.setTarget(tModifier);
		tMember.setTModifier(tModifier);
		boolean tModifier_isStatic_prime = (boolean) _localVariable_0;
		TVisibility tModifier_tVisibility_prime = (TVisibility) _localVariable_1;
		tModifier.setIsStatic(Boolean.valueOf(tModifier_isStatic_prime));
		tModifier.setTVisibility(tModifier_tVisibility_prime);
		return new Object[] { mModifierToTModifier, tMember, mModifier, tModifier, csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_1_2_collecttranslatedelements_blackBBB(
			MModifierToTModifier mModifierToTModifier, Modifier mModifier, TModifier tModifier) {
		return new Object[] { mModifierToTModifier, mModifier, tModifier };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_1_2_collecttranslatedelements_greenFBBB(
			MModifierToTModifier mModifierToTModifier, Modifier mModifier, TModifier tModifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mModifierToTModifier);
		ruleresult.getTranslatedElements().add(mModifier);
		ruleresult.getCreatedElements().add(tModifier);
		return new Object[] { ruleresult, mModifierToTModifier, mModifier, tModifier };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mModifierToTModifier, EObject tMember, EObject annotation,
			EObject defToMember, EObject tAnnotation, EObject mModifier, EObject mTypeToTType, EObject tModifier,
			EObject mDefinition) {
		if (!mModifierToTModifier.equals(tMember)) {
			if (!mModifierToTModifier.equals(tAnnotation)) {
				if (!mModifierToTModifier.equals(mTypeToTType)) {
					if (!mModifierToTModifier.equals(tModifier)) {
						if (!tMember.equals(tModifier)) {
							if (!annotation.equals(mModifierToTModifier)) {
								if (!annotation.equals(tMember)) {
									if (!annotation.equals(defToMember)) {
										if (!annotation.equals(tAnnotation)) {
											if (!annotation.equals(mModifier)) {
												if (!annotation.equals(mTypeToTType)) {
													if (!annotation.equals(tModifier)) {
														if (!annotation.equals(mDefinition)) {
															if (!defToMember.equals(mModifierToTModifier)) {
																if (!defToMember.equals(tMember)) {
																	if (!defToMember.equals(tAnnotation)) {
																		if (!defToMember.equals(mModifier)) {
																			if (!defToMember.equals(mTypeToTType)) {
																				if (!defToMember.equals(tModifier)) {
																					if (!defToMember
																							.equals(mDefinition)) {
																						if (!tAnnotation
																								.equals(tMember)) {
																							if (!tAnnotation.equals(
																									tModifier)) {
																								if (!mModifier.equals(
																										mModifierToTModifier)) {
																									if (!mModifier
																											.equals(tMember)) {
																										if (!mModifier
																												.equals(tAnnotation)) {
																											if (!mModifier
																													.equals(mTypeToTType)) {
																												if (!mModifier
																														.equals(tModifier)) {
																													if (!mTypeToTType
																															.equals(tMember)) {
																														if (!mTypeToTType
																																.equals(tAnnotation)) {
																															if (!mTypeToTType
																																	.equals(tModifier)) {
																																if (!mDefinition
																																		.equals(mModifierToTModifier)) {
																																	if (!mDefinition
																																			.equals(tMember)) {
																																		if (!mDefinition
																																				.equals(tAnnotation)) {
																																			if (!mDefinition
																																					.equals(mModifier)) {
																																				if (!mDefinition
																																						.equals(mTypeToTType)) {
																																					if (!mDefinition
																																							.equals(tModifier)) {
																																						return new Object[] {
																																								ruleresult,
																																								mModifierToTModifier,
																																								tMember,
																																								annotation,
																																								defToMember,
																																								tAnnotation,
																																								mModifier,
																																								mTypeToTType,
																																								tModifier,
																																								mDefinition };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MemberInAnnotationVisibility_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject mModifierToTModifier, EObject tMember, EObject mModifier,
			EObject tModifier, EObject mDefinition) {
		EMoflonEdge mModifierToTModifier__mModifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__tModifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MemberInAnnotationVisibility";
		String mModifierToTModifier__mModifier____source_name_prime = "source";
		String mModifierToTModifier__tModifier____target_name_prime = "target";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		mModifierToTModifier__mModifier____source.setSrc(mModifierToTModifier);
		mModifierToTModifier__mModifier____source.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__mModifier____source);
		mModifierToTModifier__tModifier____target.setSrc(mModifierToTModifier);
		mModifierToTModifier__tModifier____target.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__tModifier____target);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(tMember__tModifier____tModifier);
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		ruleresult.getTranslatedEdges().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(mModifier__mDefinition____bodyDeclaration);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mModifierToTModifier__mModifier____source.setName(mModifierToTModifier__mModifier____source_name_prime);
		mModifierToTModifier__tModifier____target.setName(mModifierToTModifier__tModifier____target_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		return new Object[] { ruleresult, mModifierToTModifier, tMember, mModifier, tModifier, mDefinition,
				mModifierToTModifier__mModifier____source, mModifierToTModifier__tModifier____target,
				tMember__tModifier____tModifier, mDefinition__mModifier____modifier,
				mModifier__mDefinition____bodyDeclaration };
	}

	public static final void pattern_MemberInAnnotationVisibility_1_5_registerobjects_expressionBBBBBBBBBBB(
			MemberInAnnotationVisibility _this, PerformRuleResult ruleresult, EObject mModifierToTModifier,
			EObject tMember, EObject annotation, EObject defToMember, EObject tAnnotation, EObject mModifier,
			EObject mTypeToTType, EObject tModifier, EObject mDefinition) {
		_this.registerObjects_FWD(ruleresult, mModifierToTModifier, tMember, annotation, defToMember, tAnnotation,
				mModifier, mTypeToTType, tModifier, mDefinition);

	}

	public static final PerformRuleResult pattern_MemberInAnnotationVisibility_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_bindingFB(
			MemberInAnnotationVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MemberInAnnotationVisibility _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_bindingAndBlackFFB(
			MemberInAnnotationVisibility _this) {
		Object[] result_pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_binding = pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_black = pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MemberInAnnotationVisibility";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("Annotation");
		EObject _localVariable_1 = match.getObject("mModifier");
		EObject _localVariable_2 = match.getObject("mDefinition");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpMModifier = _localVariable_1;
		EObject tmpMDefinition = _localVariable_2;
		if (tmpAnnotation instanceof AnnotationTypeDeclaration) {
			AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) tmpAnnotation;
			if (tmpMModifier instanceof Modifier) {
				Modifier mModifier = (Modifier) tmpMModifier;
				if (tmpMDefinition instanceof MDefinition) {
					MDefinition mDefinition = (MDefinition) tmpMDefinition;
					return new Object[] { annotation, mModifier, mDefinition, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInAnnotationVisibility_2_2_corematch_blackFBFFBFBB(
			AnnotationTypeDeclaration annotation, Modifier mModifier, MDefinition mDefinition, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(annotation, TypeToTAbstractType.class, "source")) {
			TAbstractType tmpTAnnotation = mTypeToTType.getTarget();
			if (tmpTAnnotation instanceof TAnnotationType) {
				TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
				for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
					TMember tMember = defToMember.getTarget();
					if (tMember != null) {
						_result.add(new Object[] { tMember, annotation, defToMember, tAnnotation, mModifier,
								mTypeToTType, mDefinition, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MemberInAnnotationVisibility_2_3_findcontext_blackBBBBBBB(
			TMember tMember, AnnotationTypeDeclaration annotation, MDefinitionToTMember defToMember,
			TAnnotationType tAnnotation, Modifier mModifier, TypeToTAbstractType mTypeToTType,
			MDefinition mDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (annotation.getBodyDeclarations().contains(mDefinition)) {
			if (tMember.equals(defToMember.getTarget())) {
				if (tAnnotation.equals(mTypeToTType.getTarget())) {
					if (annotation.equals(mTypeToTType.getSource())) {
						if (tAnnotation.getDefines().contains(tMember)) {
							if (mDefinition.equals(defToMember.getSource())) {
								if (mModifier.equals(mDefinition.getModifier())) {
									_result.add(new Object[] { tMember, annotation, defToMember, tAnnotation, mModifier,
											mTypeToTType, mDefinition });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_3_findcontext_greenBBBBBBBFFFFFFFFFFF(
			TMember tMember, AnnotationTypeDeclaration annotation, MDefinitionToTMember defToMember,
			TAnnotationType tAnnotation, Modifier mModifier, TypeToTAbstractType mTypeToTType,
			MDefinition mDefinition) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge annotation__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__Annotation____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__Annotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAnnotation____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String annotation__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__Annotation____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String defToMember__tMember____target_name_prime = "target";
		String mTypeToTType__tAnnotation____target_name_prime = "target";
		String mTypeToTType__Annotation____source_name_prime = "source";
		String tAnnotation__tMember____defines_name_prime = "defines";
		String tMember__tAnnotation____definedBy_name_prime = "definedBy";
		String defToMember__mDefinition____source_name_prime = "source";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(annotation);
		isApplicableMatch.getAllContextElements().add(defToMember);
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mModifier);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		annotation__mDefinition____bodyDeclarations.setSrc(annotation);
		annotation__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(annotation__mDefinition____bodyDeclarations);
		mDefinition__Annotation____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__Annotation____abstractTypeDeclaration.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(mDefinition__Annotation____abstractTypeDeclaration);
		defToMember__tMember____target.setSrc(defToMember);
		defToMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(defToMember__tMember____target);
		mTypeToTType__tAnnotation____target.setSrc(mTypeToTType);
		mTypeToTType__tAnnotation____target.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tAnnotation____target);
		mTypeToTType__Annotation____source.setSrc(mTypeToTType);
		mTypeToTType__Annotation____source.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__Annotation____source);
		tAnnotation__tMember____defines.setSrc(tAnnotation);
		tAnnotation__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tMember____defines);
		tMember__tAnnotation____definedBy.setSrc(tMember);
		tMember__tAnnotation____definedBy.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tMember__tAnnotation____definedBy);
		defToMember__mDefinition____source.setSrc(defToMember);
		defToMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(defToMember__mDefinition____source);
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		isApplicableMatch.getAllContextElements().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mModifier__mDefinition____bodyDeclaration);
		annotation__mDefinition____bodyDeclarations.setName(annotation__mDefinition____bodyDeclarations_name_prime);
		mDefinition__Annotation____abstractTypeDeclaration
				.setName(mDefinition__Annotation____abstractTypeDeclaration_name_prime);
		defToMember__tMember____target.setName(defToMember__tMember____target_name_prime);
		mTypeToTType__tAnnotation____target.setName(mTypeToTType__tAnnotation____target_name_prime);
		mTypeToTType__Annotation____source.setName(mTypeToTType__Annotation____source_name_prime);
		tAnnotation__tMember____defines.setName(tAnnotation__tMember____defines_name_prime);
		tMember__tAnnotation____definedBy.setName(tMember__tAnnotation____definedBy_name_prime);
		defToMember__mDefinition____source.setName(defToMember__mDefinition____source_name_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		return new Object[] { tMember, annotation, defToMember, tAnnotation, mModifier, mTypeToTType, mDefinition,
				isApplicableMatch, annotation__mDefinition____bodyDeclarations,
				mDefinition__Annotation____abstractTypeDeclaration, defToMember__tMember____target,
				mTypeToTType__tAnnotation____target, mTypeToTType__Annotation____source,
				tAnnotation__tMember____defines, tMember__tAnnotation____definedBy, defToMember__mDefinition____source,
				mDefinition__mModifier____modifier, mModifier__mDefinition____bodyDeclaration };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_4_solveCSP_bindingFBBBBBBBBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch, TMember tMember,
			AnnotationTypeDeclaration annotation, MDefinitionToTMember defToMember, TAnnotationType tAnnotation,
			Modifier mModifier, TypeToTAbstractType mTypeToTType, MDefinition mDefinition) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tMember, annotation, defToMember,
				tAnnotation, mModifier, mTypeToTType, mDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tMember, annotation, defToMember, tAnnotation,
					mModifier, mTypeToTType, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch, TMember tMember,
			AnnotationTypeDeclaration annotation, MDefinitionToTMember defToMember, TAnnotationType tAnnotation,
			Modifier mModifier, TypeToTAbstractType mTypeToTType, MDefinition mDefinition) {
		Object[] result_pattern_MemberInAnnotationVisibility_2_4_solveCSP_binding = pattern_MemberInAnnotationVisibility_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tMember, annotation, defToMember, tAnnotation, mModifier, mTypeToTType,
				mDefinition);
		if (result_pattern_MemberInAnnotationVisibility_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_2_4_solveCSP_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_2_4_solveCSP_black = pattern_MemberInAnnotationVisibility_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MemberInAnnotationVisibility_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tMember, annotation, defToMember, tAnnotation,
						mModifier, mTypeToTType, mDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_2_5_checkCSP_expressionFBB(
			MemberInAnnotationVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MemberInAnnotationVisibility";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MemberInAnnotationVisibility_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_1_initialbindings_blackBBBBB(
			MemberInAnnotationVisibility _this, Match match, TMember tMember, TAnnotationType tAnnotation,
			TModifier tModifier) {
		return new Object[] { _this, match, tMember, tAnnotation, tModifier };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_2_SolveCSP_bindingFBBBBB(
			MemberInAnnotationVisibility _this, Match match, TMember tMember, TAnnotationType tAnnotation,
			TModifier tModifier) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tMember, tAnnotation, tModifier);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tMember, tAnnotation, tModifier };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_2_SolveCSP_bindingAndBlackFBBBBB(
			MemberInAnnotationVisibility _this, Match match, TMember tMember, TAnnotationType tAnnotation,
			TModifier tModifier) {
		Object[] result_pattern_MemberInAnnotationVisibility_10_2_SolveCSP_binding = pattern_MemberInAnnotationVisibility_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tMember, tAnnotation, tModifier);
		if (result_pattern_MemberInAnnotationVisibility_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_10_2_SolveCSP_black = pattern_MemberInAnnotationVisibility_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MemberInAnnotationVisibility_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tMember, tAnnotation, tModifier };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_10_3_CheckCSP_expressionFBB(
			MemberInAnnotationVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_4_collectelementstobetranslated_blackBBBB(
			Match match, TMember tMember, TAnnotationType tAnnotation, TModifier tModifier) {
		return new Object[] { match, tMember, tAnnotation, tModifier };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_4_collectelementstobetranslated_greenBBBF(
			Match match, TMember tMember, TModifier tModifier) {
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tModifier);
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		match.getToBeTranslatedEdges().add(tMember__tModifier____tModifier);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		return new Object[] { match, tMember, tModifier, tMember__tModifier____tModifier };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_5_collectcontextelements_blackBBBB(Match match,
			TMember tMember, TAnnotationType tAnnotation, TModifier tModifier) {
		return new Object[] { match, tMember, tAnnotation, tModifier };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_5_collectcontextelements_greenBBBFF(
			Match match, TMember tMember, TAnnotationType tAnnotation) {
		EMoflonEdge tAnnotation__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAnnotation____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tMember);
		match.getContextNodes().add(tAnnotation);
		String tAnnotation__tMember____defines_name_prime = "defines";
		String tMember__tAnnotation____definedBy_name_prime = "definedBy";
		tAnnotation__tMember____defines.setSrc(tAnnotation);
		tAnnotation__tMember____defines.setTrg(tMember);
		match.getContextEdges().add(tAnnotation__tMember____defines);
		tMember__tAnnotation____definedBy.setSrc(tMember);
		tMember__tAnnotation____definedBy.setTrg(tAnnotation);
		match.getContextEdges().add(tMember__tAnnotation____definedBy);
		tAnnotation__tMember____defines.setName(tAnnotation__tMember____defines_name_prime);
		tMember__tAnnotation____definedBy.setName(tMember__tAnnotation____definedBy_name_prime);
		return new Object[] { match, tMember, tAnnotation, tAnnotation__tMember____defines,
				tMember__tAnnotation____definedBy };
	}

	public static final void pattern_MemberInAnnotationVisibility_10_6_registerobjectstomatch_expressionBBBBB(
			MemberInAnnotationVisibility _this, Match match, TMember tMember, TAnnotationType tAnnotation,
			TModifier tModifier) {
		_this.registerObjectsToMatch_BWD(match, tMember, tAnnotation, tModifier);

	}

	public static final boolean pattern_MemberInAnnotationVisibility_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_1 = isApplicableMatch.getObject("Annotation");
		EObject _localVariable_2 = isApplicableMatch.getObject("defToMember");
		EObject _localVariable_3 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_4 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_5 = isApplicableMatch.getObject("tModifier");
		EObject _localVariable_6 = isApplicableMatch.getObject("mDefinition");
		EObject tmpTMember = _localVariable_0;
		EObject tmpAnnotation = _localVariable_1;
		EObject tmpDefToMember = _localVariable_2;
		EObject tmpTAnnotation = _localVariable_3;
		EObject tmpMTypeToTType = _localVariable_4;
		EObject tmpTModifier = _localVariable_5;
		EObject tmpMDefinition = _localVariable_6;
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			if (tmpAnnotation instanceof AnnotationTypeDeclaration) {
				AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) tmpAnnotation;
				if (tmpDefToMember instanceof MDefinitionToTMember) {
					MDefinitionToTMember defToMember = (MDefinitionToTMember) tmpDefToMember;
					if (tmpTAnnotation instanceof TAnnotationType) {
						TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
						if (tmpMTypeToTType instanceof TypeToTAbstractType) {
							TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
							if (tmpTModifier instanceof TModifier) {
								TModifier tModifier = (TModifier) tmpTModifier;
								if (tmpMDefinition instanceof MDefinition) {
									MDefinition mDefinition = (MDefinition) tmpMDefinition;
									return new Object[] { tMember, annotation, defToMember, tAnnotation, mTypeToTType,
											tModifier, mDefinition, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_11_1_performtransformation_blackBBBBBBBFBB(
			TMember tMember, AnnotationTypeDeclaration annotation, MDefinitionToTMember defToMember,
			TAnnotationType tAnnotation, TypeToTAbstractType mTypeToTType, TModifier tModifier, MDefinition mDefinition,
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tMember, annotation, defToMember, tAnnotation, mTypeToTType, tModifier,
						mDefinition, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding = pattern_MemberInAnnotationVisibility_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding != null) {
			TMember tMember = (TMember) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding[0];
			AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding[1];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding[2];
			TAnnotationType tAnnotation = (TAnnotationType) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding[3];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding[4];
			TModifier tModifier = (TModifier) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding[5];
			MDefinition mDefinition = (MDefinition) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding[6];

			Object[] result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_black = pattern_MemberInAnnotationVisibility_11_1_performtransformation_blackBBBBBBBFBB(
					tMember, annotation, defToMember, tAnnotation, mTypeToTType, tModifier, mDefinition, _this,
					isApplicableMatch);
			if (result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_black[7];

				return new Object[] { tMember, annotation, defToMember, tAnnotation, mTypeToTType, tModifier,
						mDefinition, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_11_1_performtransformation_greenFFBBB(
			TModifier tModifier, MDefinition mDefinition, CSP csp) {
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		Modifier mModifier = JavaFactory.eINSTANCE.createModifier();
		Object _localVariable_0 = csp.getValue("mModifier", "static");
		Object _localVariable_1 = csp.getValue("mModifier", "visibility");
		mModifierToTModifier.setTarget(tModifier);
		mModifierToTModifier.setSource(mModifier);
		mDefinition.setModifier(mModifier);
		boolean mModifier_static_prime = (boolean) _localVariable_0;
		VisibilityKind mModifier_visibility_prime = (VisibilityKind) _localVariable_1;
		mModifier.setStatic(Boolean.valueOf(mModifier_static_prime));
		mModifier.setVisibility(mModifier_visibility_prime);
		return new Object[] { mModifierToTModifier, mModifier, tModifier, mDefinition, csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_11_2_collecttranslatedelements_blackBBB(
			MModifierToTModifier mModifierToTModifier, Modifier mModifier, TModifier tModifier) {
		return new Object[] { mModifierToTModifier, mModifier, tModifier };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_11_2_collecttranslatedelements_greenFBBB(
			MModifierToTModifier mModifierToTModifier, Modifier mModifier, TModifier tModifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mModifierToTModifier);
		ruleresult.getCreatedElements().add(mModifier);
		ruleresult.getTranslatedElements().add(tModifier);
		return new Object[] { ruleresult, mModifierToTModifier, mModifier, tModifier };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mModifierToTModifier, EObject tMember, EObject annotation,
			EObject defToMember, EObject tAnnotation, EObject mModifier, EObject mTypeToTType, EObject tModifier,
			EObject mDefinition) {
		if (!mModifierToTModifier.equals(tMember)) {
			if (!mModifierToTModifier.equals(tAnnotation)) {
				if (!mModifierToTModifier.equals(mTypeToTType)) {
					if (!mModifierToTModifier.equals(tModifier)) {
						if (!tMember.equals(tModifier)) {
							if (!annotation.equals(mModifierToTModifier)) {
								if (!annotation.equals(tMember)) {
									if (!annotation.equals(defToMember)) {
										if (!annotation.equals(tAnnotation)) {
											if (!annotation.equals(mModifier)) {
												if (!annotation.equals(mTypeToTType)) {
													if (!annotation.equals(tModifier)) {
														if (!annotation.equals(mDefinition)) {
															if (!defToMember.equals(mModifierToTModifier)) {
																if (!defToMember.equals(tMember)) {
																	if (!defToMember.equals(tAnnotation)) {
																		if (!defToMember.equals(mModifier)) {
																			if (!defToMember.equals(mTypeToTType)) {
																				if (!defToMember.equals(tModifier)) {
																					if (!defToMember
																							.equals(mDefinition)) {
																						if (!tAnnotation
																								.equals(tMember)) {
																							if (!tAnnotation.equals(
																									tModifier)) {
																								if (!mModifier.equals(
																										mModifierToTModifier)) {
																									if (!mModifier
																											.equals(tMember)) {
																										if (!mModifier
																												.equals(tAnnotation)) {
																											if (!mModifier
																													.equals(mTypeToTType)) {
																												if (!mModifier
																														.equals(tModifier)) {
																													if (!mTypeToTType
																															.equals(tMember)) {
																														if (!mTypeToTType
																																.equals(tAnnotation)) {
																															if (!mTypeToTType
																																	.equals(tModifier)) {
																																if (!mDefinition
																																		.equals(mModifierToTModifier)) {
																																	if (!mDefinition
																																			.equals(tMember)) {
																																		if (!mDefinition
																																				.equals(tAnnotation)) {
																																			if (!mDefinition
																																					.equals(mModifier)) {
																																				if (!mDefinition
																																						.equals(mTypeToTType)) {
																																					if (!mDefinition
																																							.equals(tModifier)) {
																																						return new Object[] {
																																								ruleresult,
																																								mModifierToTModifier,
																																								tMember,
																																								annotation,
																																								defToMember,
																																								tAnnotation,
																																								mModifier,
																																								mTypeToTType,
																																								tModifier,
																																								mDefinition };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MemberInAnnotationVisibility_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject mModifierToTModifier, EObject tMember, EObject mModifier,
			EObject tModifier, EObject mDefinition) {
		EMoflonEdge mModifierToTModifier__mModifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__tModifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MemberInAnnotationVisibility";
		String mModifierToTModifier__mModifier____source_name_prime = "source";
		String mModifierToTModifier__tModifier____target_name_prime = "target";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		mModifierToTModifier__mModifier____source.setSrc(mModifierToTModifier);
		mModifierToTModifier__mModifier____source.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__mModifier____source);
		mModifierToTModifier__tModifier____target.setSrc(mModifierToTModifier);
		mModifierToTModifier__tModifier____target.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__tModifier____target);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		ruleresult.getTranslatedEdges().add(tMember__tModifier____tModifier);
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mModifier__mDefinition____bodyDeclaration);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mModifierToTModifier__mModifier____source.setName(mModifierToTModifier__mModifier____source_name_prime);
		mModifierToTModifier__tModifier____target.setName(mModifierToTModifier__tModifier____target_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		return new Object[] { ruleresult, mModifierToTModifier, tMember, mModifier, tModifier, mDefinition,
				mModifierToTModifier__mModifier____source, mModifierToTModifier__tModifier____target,
				tMember__tModifier____tModifier, mDefinition__mModifier____modifier,
				mModifier__mDefinition____bodyDeclaration };
	}

	public static final void pattern_MemberInAnnotationVisibility_11_5_registerobjects_expressionBBBBBBBBBBB(
			MemberInAnnotationVisibility _this, PerformRuleResult ruleresult, EObject mModifierToTModifier,
			EObject tMember, EObject annotation, EObject defToMember, EObject tAnnotation, EObject mModifier,
			EObject mTypeToTType, EObject tModifier, EObject mDefinition) {
		_this.registerObjects_BWD(ruleresult, mModifierToTModifier, tMember, annotation, defToMember, tAnnotation,
				mModifier, mTypeToTType, tModifier, mDefinition);

	}

	public static final PerformRuleResult pattern_MemberInAnnotationVisibility_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_bindingFB(
			MemberInAnnotationVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MemberInAnnotationVisibility _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_bindingAndBlackFFB(
			MemberInAnnotationVisibility _this) {
		Object[] result_pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_binding = pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_black = pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MemberInAnnotationVisibility";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tMember");
		EObject _localVariable_1 = match.getObject("tAnnotation");
		EObject _localVariable_2 = match.getObject("tModifier");
		EObject tmpTMember = _localVariable_0;
		EObject tmpTAnnotation = _localVariable_1;
		EObject tmpTModifier = _localVariable_2;
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			if (tmpTAnnotation instanceof TAnnotationType) {
				TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
				if (tmpTModifier instanceof TModifier) {
					TModifier tModifier = (TModifier) tmpTModifier;
					return new Object[] { tMember, tAnnotation, tModifier, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInAnnotationVisibility_12_2_corematch_blackBFFBFBFB(
			TMember tMember, TAnnotationType tAnnotation, TModifier tModifier, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
			BodyDeclaration tmpMDefinition = defToMember.getSource();
			if (tmpMDefinition instanceof MDefinition) {
				MDefinition mDefinition = (MDefinition) tmpMDefinition;
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tAnnotation, TypeToTAbstractType.class, "target")) {
					Type tmpAnnotation = mTypeToTType.getSource();
					if (tmpAnnotation instanceof AnnotationTypeDeclaration) {
						AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) tmpAnnotation;
						_result.add(new Object[] { tMember, annotation, defToMember, tAnnotation, mTypeToTType,
								tModifier, mDefinition, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MemberInAnnotationVisibility_12_3_findcontext_blackBBBBBBB(
			TMember tMember, AnnotationTypeDeclaration annotation, MDefinitionToTMember defToMember,
			TAnnotationType tAnnotation, TypeToTAbstractType mTypeToTType, TModifier tModifier,
			MDefinition mDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (annotation.getBodyDeclarations().contains(mDefinition)) {
			if (tMember.equals(defToMember.getTarget())) {
				if (tAnnotation.equals(mTypeToTType.getTarget())) {
					if (annotation.equals(mTypeToTType.getSource())) {
						if (tAnnotation.getDefines().contains(tMember)) {
							if (tModifier.equals(tMember.getTModifier())) {
								if (mDefinition.equals(defToMember.getSource())) {
									_result.add(new Object[] { tMember, annotation, defToMember, tAnnotation,
											mTypeToTType, tModifier, mDefinition });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_3_findcontext_greenBBBBBBBFFFFFFFFFF(
			TMember tMember, AnnotationTypeDeclaration annotation, MDefinitionToTMember defToMember,
			TAnnotationType tAnnotation, TypeToTAbstractType mTypeToTType, TModifier tModifier,
			MDefinition mDefinition) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge annotation__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__Annotation____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__Annotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAnnotation____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String annotation__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__Annotation____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String defToMember__tMember____target_name_prime = "target";
		String mTypeToTType__tAnnotation____target_name_prime = "target";
		String mTypeToTType__Annotation____source_name_prime = "source";
		String tAnnotation__tMember____defines_name_prime = "defines";
		String tMember__tAnnotation____definedBy_name_prime = "definedBy";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		String defToMember__mDefinition____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(annotation);
		isApplicableMatch.getAllContextElements().add(defToMember);
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tModifier);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		annotation__mDefinition____bodyDeclarations.setSrc(annotation);
		annotation__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(annotation__mDefinition____bodyDeclarations);
		mDefinition__Annotation____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__Annotation____abstractTypeDeclaration.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(mDefinition__Annotation____abstractTypeDeclaration);
		defToMember__tMember____target.setSrc(defToMember);
		defToMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(defToMember__tMember____target);
		mTypeToTType__tAnnotation____target.setSrc(mTypeToTType);
		mTypeToTType__tAnnotation____target.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tAnnotation____target);
		mTypeToTType__Annotation____source.setSrc(mTypeToTType);
		mTypeToTType__Annotation____source.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__Annotation____source);
		tAnnotation__tMember____defines.setSrc(tAnnotation);
		tAnnotation__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tMember____defines);
		tMember__tAnnotation____definedBy.setSrc(tMember);
		tMember__tAnnotation____definedBy.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tMember__tAnnotation____definedBy);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		isApplicableMatch.getAllContextElements().add(tMember__tModifier____tModifier);
		defToMember__mDefinition____source.setSrc(defToMember);
		defToMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(defToMember__mDefinition____source);
		annotation__mDefinition____bodyDeclarations.setName(annotation__mDefinition____bodyDeclarations_name_prime);
		mDefinition__Annotation____abstractTypeDeclaration
				.setName(mDefinition__Annotation____abstractTypeDeclaration_name_prime);
		defToMember__tMember____target.setName(defToMember__tMember____target_name_prime);
		mTypeToTType__tAnnotation____target.setName(mTypeToTType__tAnnotation____target_name_prime);
		mTypeToTType__Annotation____source.setName(mTypeToTType__Annotation____source_name_prime);
		tAnnotation__tMember____defines.setName(tAnnotation__tMember____defines_name_prime);
		tMember__tAnnotation____definedBy.setName(tMember__tAnnotation____definedBy_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		defToMember__mDefinition____source.setName(defToMember__mDefinition____source_name_prime);
		return new Object[] { tMember, annotation, defToMember, tAnnotation, mTypeToTType, tModifier, mDefinition,
				isApplicableMatch, annotation__mDefinition____bodyDeclarations,
				mDefinition__Annotation____abstractTypeDeclaration, defToMember__tMember____target,
				mTypeToTType__tAnnotation____target, mTypeToTType__Annotation____source,
				tAnnotation__tMember____defines, tMember__tAnnotation____definedBy, tMember__tModifier____tModifier,
				defToMember__mDefinition____source };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_4_solveCSP_bindingFBBBBBBBBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch, TMember tMember,
			AnnotationTypeDeclaration annotation, MDefinitionToTMember defToMember, TAnnotationType tAnnotation,
			TypeToTAbstractType mTypeToTType, TModifier tModifier, MDefinition mDefinition) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tMember, annotation, defToMember,
				tAnnotation, mTypeToTType, tModifier, mDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tMember, annotation, defToMember, tAnnotation,
					mTypeToTType, tModifier, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch, TMember tMember,
			AnnotationTypeDeclaration annotation, MDefinitionToTMember defToMember, TAnnotationType tAnnotation,
			TypeToTAbstractType mTypeToTType, TModifier tModifier, MDefinition mDefinition) {
		Object[] result_pattern_MemberInAnnotationVisibility_12_4_solveCSP_binding = pattern_MemberInAnnotationVisibility_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tMember, annotation, defToMember, tAnnotation, mTypeToTType, tModifier,
				mDefinition);
		if (result_pattern_MemberInAnnotationVisibility_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_12_4_solveCSP_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_12_4_solveCSP_black = pattern_MemberInAnnotationVisibility_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MemberInAnnotationVisibility_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tMember, annotation, defToMember, tAnnotation,
						mTypeToTType, tModifier, mDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_12_5_checkCSP_expressionFBB(
			MemberInAnnotationVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MemberInAnnotationVisibility";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MemberInAnnotationVisibility_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_bindingFB(
			MemberInAnnotationVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MemberInAnnotationVisibility _this) {
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

	public static final Object[] pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MemberInAnnotationVisibility _this) {
		Object[] result_pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_binding = pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_black = pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_20_2_testcorematchandDECs_black_nac_0BB(
			TModifier tModifier, TAnnotationType tAnnotation) {
		for (TAbstractType __DEC_tModifier_tModifier_816405 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tModifier, TAbstractType.class, "tModifier")) {
			if (!tAnnotation.equals(__DEC_tModifier_tModifier_816405)) {
				return new Object[] { tModifier, tAnnotation };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_20_2_testcorematchandDECs_black_nac_1BB(
			TAnnotationType tAnnotation, TModifier tModifier) {
		if (tModifier.equals(tAnnotation.getTModifier())) {
			return new Object[] { tAnnotation, tModifier };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInAnnotationVisibility_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_tModifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMember = _edge_tModifier.getSrc();
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			EObject tmpTModifier = _edge_tModifier.getTrg();
			if (tmpTModifier instanceof TModifier) {
				TModifier tModifier = (TModifier) tmpTModifier;
				if (tModifier.equals(tMember.getTModifier())) {
					TAbstractType tmpTAnnotation = tMember.getDefinedBy();
					if (tmpTAnnotation instanceof TAnnotationType) {
						TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
						if (pattern_MemberInAnnotationVisibility_20_2_testcorematchandDECs_black_nac_0BB(tModifier,
								tAnnotation) == null) {
							if (pattern_MemberInAnnotationVisibility_20_2_testcorematchandDECs_black_nac_1BB(
									tAnnotation, tModifier) == null) {
								_result.add(new Object[] { tMember, tAnnotation, tModifier, _edge_tModifier });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MemberInAnnotationVisibility_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MemberInAnnotationVisibility _this, Match match, TMember tMember, TAnnotationType tAnnotation,
			TModifier tModifier) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tMember, tAnnotation, tModifier);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MemberInAnnotationVisibility _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MemberInAnnotationVisibility_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_bindingFB(
			MemberInAnnotationVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MemberInAnnotationVisibility _this) {
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

	public static final Object[] pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MemberInAnnotationVisibility _this) {
		Object[] result_pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_binding = pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_black = pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MemberInAnnotationVisibility_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_modifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMDefinition = _edge_modifier.getSrc();
		if (tmpMDefinition instanceof MDefinition) {
			MDefinition mDefinition = (MDefinition) tmpMDefinition;
			EObject tmpMModifier = _edge_modifier.getTrg();
			if (tmpMModifier instanceof Modifier) {
				Modifier mModifier = (Modifier) tmpMModifier;
				if (mModifier.equals(mDefinition.getModifier())) {
					AbstractTypeDeclaration tmpAnnotation = mDefinition.getAbstractTypeDeclaration();
					if (tmpAnnotation instanceof AnnotationTypeDeclaration) {
						AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) tmpAnnotation;
						_result.add(new Object[] { annotation, mModifier, mDefinition, _edge_modifier });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MemberInAnnotationVisibility_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MemberInAnnotationVisibility _this, Match match, AnnotationTypeDeclaration annotation, Modifier mModifier,
			MDefinition mDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, annotation, mModifier, mDefinition);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MemberInAnnotationVisibility _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MemberInAnnotationVisibility_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_1_prepare_blackB(
			MemberInAnnotationVisibility _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tMember");
		EObject _localVariable_1 = sourceMatch.getObject("Annotation");
		EObject _localVariable_2 = targetMatch.getObject("tAnnotation");
		EObject _localVariable_3 = sourceMatch.getObject("mModifier");
		EObject _localVariable_4 = targetMatch.getObject("tModifier");
		EObject _localVariable_5 = sourceMatch.getObject("mDefinition");
		EObject tmpTMember = _localVariable_0;
		EObject tmpAnnotation = _localVariable_1;
		EObject tmpTAnnotation = _localVariable_2;
		EObject tmpMModifier = _localVariable_3;
		EObject tmpTModifier = _localVariable_4;
		EObject tmpMDefinition = _localVariable_5;
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			if (tmpAnnotation instanceof AnnotationTypeDeclaration) {
				AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) tmpAnnotation;
				if (tmpTAnnotation instanceof TAnnotationType) {
					TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
					if (tmpMModifier instanceof Modifier) {
						Modifier mModifier = (Modifier) tmpMModifier;
						if (tmpTModifier instanceof TModifier) {
							TModifier tModifier = (TModifier) tmpTModifier;
							if (tmpMDefinition instanceof MDefinition) {
								MDefinition mDefinition = (MDefinition) tmpMDefinition;
								return new Object[] { tMember, annotation, tAnnotation, mModifier, tModifier,
										mDefinition, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_blackBBBBBBBB(
			TMember tMember, AnnotationTypeDeclaration annotation, TAnnotationType tAnnotation, Modifier mModifier,
			TModifier tModifier, MDefinition mDefinition, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tMember, annotation, tAnnotation, mModifier, tModifier, mDefinition, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding = pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding != null) {
			TMember tMember = (TMember) result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding[0];
			AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding[1];
			TAnnotationType tAnnotation = (TAnnotationType) result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding[2];
			Modifier mModifier = (Modifier) result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding[3];
			TModifier tModifier = (TModifier) result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding[4];
			MDefinition mDefinition = (MDefinition) result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_black = pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_blackBBBBBBBB(
					tMember, annotation, tAnnotation, mModifier, tModifier, mDefinition, sourceMatch, targetMatch);
			if (result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tMember, annotation, tAnnotation, mModifier, tModifier, mDefinition, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_3_solvecsp_bindingFBBBBBBBBB(
			MemberInAnnotationVisibility _this, TMember tMember, AnnotationTypeDeclaration annotation,
			TAnnotationType tAnnotation, Modifier mModifier, TModifier tModifier, MDefinition mDefinition,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(tMember, annotation, tAnnotation, mModifier, tModifier,
				mDefinition, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, tMember, annotation, tAnnotation, mModifier, tModifier, mDefinition,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			MemberInAnnotationVisibility _this, TMember tMember, AnnotationTypeDeclaration annotation,
			TAnnotationType tAnnotation, Modifier mModifier, TModifier tModifier, MDefinition mDefinition,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MemberInAnnotationVisibility_24_3_solvecsp_binding = pattern_MemberInAnnotationVisibility_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, tMember, annotation, tAnnotation, mModifier, tModifier, mDefinition, sourceMatch, targetMatch);
		if (result_pattern_MemberInAnnotationVisibility_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_24_3_solvecsp_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_24_3_solvecsp_black = pattern_MemberInAnnotationVisibility_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MemberInAnnotationVisibility_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tMember, annotation, tAnnotation, mModifier, tModifier, mDefinition,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MemberInAnnotationVisibility_24_5_matchcorrcontext_blackBBFBFBBB(
			TMember tMember, AnnotationTypeDeclaration annotation, TAnnotationType tAnnotation, MDefinition mDefinition,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
				if (mDefinition.equals(defToMember.getSource())) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tAnnotation, TypeToTAbstractType.class, "target")) {
						if (annotation.equals(mTypeToTType.getSource())) {
							_result.add(new Object[] { tMember, annotation, defToMember, tAnnotation, mTypeToTType,
									mDefinition, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_5_matchcorrcontext_greenBBBBF(
			MDefinitionToTMember defToMember, TypeToTAbstractType mTypeToTType, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MemberInAnnotationVisibility";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(defToMember);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { defToMember, mTypeToTType, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_6_createcorrespondence_blackBBBBBBB(
			TMember tMember, AnnotationTypeDeclaration annotation, TAnnotationType tAnnotation, Modifier mModifier,
			TModifier tModifier, MDefinition mDefinition, CCMatch ccMatch) {
		return new Object[] { tMember, annotation, tAnnotation, mModifier, tModifier, mDefinition, ccMatch };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_6_createcorrespondence_greenFBBB(
			Modifier mModifier, TModifier tModifier, CCMatch ccMatch) {
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		mModifierToTModifier.setSource(mModifier);
		mModifierToTModifier.setTarget(tModifier);
		ccMatch.getCreateCorr().add(mModifierToTModifier);
		return new Object[] { mModifierToTModifier, mModifier, tModifier, ccMatch };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MemberInAnnotationVisibility";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MemberInAnnotationVisibility_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_27_1_matchtggpattern_blackBBB(
			AnnotationTypeDeclaration annotation, Modifier mModifier, MDefinition mDefinition) {
		if (annotation.getBodyDeclarations().contains(mDefinition)) {
			if (mModifier.equals(mDefinition.getModifier())) {
				return new Object[] { annotation, mModifier, mDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_28_1_matchtggpattern_black_nac_0BB(
			TModifier tModifier, TAnnotationType tAnnotation) {
		for (TAbstractType __DEC_tModifier_tModifier_179636 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tModifier, TAbstractType.class, "tModifier")) {
			if (!tAnnotation.equals(__DEC_tModifier_tModifier_179636)) {
				return new Object[] { tModifier, tAnnotation };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_28_1_matchtggpattern_black_nac_1BB(
			TAnnotationType tAnnotation, TModifier tModifier) {
		if (tModifier.equals(tAnnotation.getTModifier())) {
			return new Object[] { tAnnotation, tModifier };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_28_1_matchtggpattern_blackBBB(TMember tMember,
			TAnnotationType tAnnotation, TModifier tModifier) {
		if (tAnnotation.getDefines().contains(tMember)) {
			if (tModifier.equals(tMember.getTModifier())) {
				if (pattern_MemberInAnnotationVisibility_28_1_matchtggpattern_black_nac_0BB(tModifier,
						tAnnotation) == null) {
					if (pattern_MemberInAnnotationVisibility_28_1_matchtggpattern_black_nac_1BB(tAnnotation,
							tModifier) == null) {
						return new Object[] { tMember, tAnnotation, tModifier };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_1_createresult_blackB(
			MemberInAnnotationVisibility _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TMember tMember) {
		if (ruleResult.getTargetObjects().contains(tMember)) {
			return new Object[] { ruleResult, tMember };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember defToMember) {
		if (ruleResult.getCorrObjects().contains(defToMember)) {
			return new Object[] { ruleResult, defToMember };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mDefinition) {
		if (ruleResult.getSourceObjects().contains(mDefinition)) {
			return new Object[] { ruleResult, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, AnnotationTypeDeclaration annotation) {
		if (ruleResult.getSourceObjects().contains(annotation)) {
			return new Object[] { ruleResult, annotation };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TAnnotationType tAnnotation) {
		if (ruleResult.getTargetObjects().contains(tAnnotation)) {
			return new Object[] { ruleResult, tAnnotation };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList defToMemberList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpDefToMember : defToMemberList.getEntryObjects()) {
				if (tmpDefToMember instanceof MDefinitionToTMember) {
					MDefinitionToTMember defToMember = (MDefinitionToTMember) tmpDefToMember;
					TMember tMember = defToMember.getTarget();
					if (tMember != null) {
						BodyDeclaration tmpMDefinition = defToMember.getSource();
						if (tmpMDefinition instanceof MDefinition) {
							MDefinition mDefinition = (MDefinition) tmpMDefinition;
							TAbstractType tmpTAnnotation = tMember.getDefinedBy();
							if (tmpTAnnotation instanceof TAnnotationType) {
								TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
								AbstractTypeDeclaration tmpAnnotation = mDefinition.getAbstractTypeDeclaration();
								if (tmpAnnotation instanceof AnnotationTypeDeclaration) {
									AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) tmpAnnotation;
									if (pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, defToMember) == null) {
										if (pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, tMember) == null) {
											if (pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, mDefinition) == null) {
												if (pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_5BB(
														ruleResult, tAnnotation) == null) {
													if (pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_3BB(
															ruleResult, annotation) == null) {
														for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(tAnnotation,
																		TypeToTAbstractType.class, "target")) {
															if (annotation.equals(mTypeToTType.getSource())) {
																if (pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult, mTypeToTType) == null) {
																	_result.add(new Object[] { defToMemberList, tMember,
																			defToMember, mDefinition, annotation,
																			mTypeToTType, tAnnotation,
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

	public static final Object[] pattern_MemberInAnnotationVisibility_29_3_solveCSP_bindingFBBBBBBBBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch, TMember tMember,
			AnnotationTypeDeclaration annotation, MDefinitionToTMember defToMember, TAnnotationType tAnnotation,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tMember, annotation, defToMember,
				tAnnotation, mTypeToTType, mDefinition, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tMember, annotation, defToMember, tAnnotation,
					mTypeToTType, mDefinition, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch, TMember tMember,
			AnnotationTypeDeclaration annotation, MDefinitionToTMember defToMember, TAnnotationType tAnnotation,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MemberInAnnotationVisibility_29_3_solveCSP_binding = pattern_MemberInAnnotationVisibility_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tMember, annotation, defToMember, tAnnotation, mTypeToTType, mDefinition,
				ruleResult);
		if (result_pattern_MemberInAnnotationVisibility_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_29_3_solveCSP_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_29_3_solveCSP_black = pattern_MemberInAnnotationVisibility_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MemberInAnnotationVisibility_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tMember, annotation, defToMember, tAnnotation,
						mTypeToTType, mDefinition, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_29_4_checkCSP_expressionFBB(
			MemberInAnnotationVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_5_checknacs_blackBBBBBB(TMember tMember,
			AnnotationTypeDeclaration annotation, MDefinitionToTMember defToMember, TAnnotationType tAnnotation,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition) {
		return new Object[] { tMember, annotation, defToMember, tAnnotation, mTypeToTType, mDefinition };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_6_perform_blackBBBBBBB(TMember tMember,
			AnnotationTypeDeclaration annotation, MDefinitionToTMember defToMember, TAnnotationType tAnnotation,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tMember, annotation, defToMember, tAnnotation, mTypeToTType, mDefinition, ruleResult };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_6_perform_greenFBFFBBB(TMember tMember,
			MDefinition mDefinition, ModelgeneratorRuleResult ruleResult, CSP csp) {
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		Modifier mModifier = JavaFactory.eINSTANCE.createModifier();
		TModifier tModifier = BasicFactory.eINSTANCE.createTModifier();
		Object _localVariable_0 = csp.getValue("mModifier", "static");
		Object _localVariable_1 = csp.getValue("mModifier", "visibility");
		Object _localVariable_2 = csp.getValue("tModifier", "isStatic");
		Object _localVariable_3 = csp.getValue("tModifier", "tVisibility");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(mModifierToTModifier);
		mModifierToTModifier.setSource(mModifier);
		mDefinition.setModifier(mModifier);
		ruleResult.getSourceObjects().add(mModifier);
		mModifierToTModifier.setTarget(tModifier);
		tMember.setTModifier(tModifier);
		ruleResult.getTargetObjects().add(tModifier);
		boolean mModifier_static_prime = (boolean) _localVariable_0;
		VisibilityKind mModifier_visibility_prime = (VisibilityKind) _localVariable_1;
		boolean tModifier_isStatic_prime = (boolean) _localVariable_2;
		TVisibility tModifier_tVisibility_prime = (TVisibility) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		mModifier.setStatic(Boolean.valueOf(mModifier_static_prime));
		mModifier.setVisibility(mModifier_visibility_prime);
		tModifier.setIsStatic(Boolean.valueOf(tModifier_isStatic_prime));
		tModifier.setTVisibility(tModifier_tVisibility_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mModifierToTModifier, tMember, mModifier, tModifier, mDefinition, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_MemberInAnnotationVisibility_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MemberInAnnotationVisibilityImpl
