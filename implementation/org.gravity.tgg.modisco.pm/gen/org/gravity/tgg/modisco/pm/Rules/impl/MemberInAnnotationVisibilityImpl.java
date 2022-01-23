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
	public boolean isAppropriate_FWD(Match match, Modifier mModifier, AnnotationTypeDeclaration Annotation,
			MDefinition mDefinition) {

		Object[] result1_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_0_1_initialbindings_blackBBBBB(this, match, mModifier, Annotation,
						mDefinition);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mModifier] = " + mModifier + ", " + "[Annotation] = " + Annotation
					+ ", " + "[mDefinition] = " + mDefinition + ".");
		}

		Object[] result2_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mModifier,
						Annotation, mDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mModifier] = " + mModifier + ", " + "[Annotation] = " + Annotation
					+ ", " + "[mDefinition] = " + mDefinition + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_0_4_collectelementstobetranslated_blackBBBB(match, mModifier,
							Annotation, mDefinition);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mModifier] = " + mModifier + ", " + "[Annotation] = " + Annotation + ", "
						+ "[mDefinition] = " + mDefinition + ".");
			}
			MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_0_4_collectelementstobetranslated_greenBBBFF(match, mModifier,
							mDefinition);
			//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_0_5_collectcontextelements_blackBBBB(match, mModifier,
							Annotation, mDefinition);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mModifier] = " + mModifier + ", " + "[Annotation] = " + Annotation + ", "
						+ "[mDefinition] = " + mDefinition + ".");
			}
			MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_0_5_collectcontextelements_greenBBBFF(
					match, Annotation, mDefinition);
			//nothing EMoflonEdge Annotation__mDefinition____bodyDeclarations = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge mDefinition__Annotation____abstractTypeDeclaration = (EMoflonEdge) result5_green[4];

			// 
			MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_0_6_registerobjectstomatch_expressionBBBBB(this, match,
							mModifier, Annotation, mDefinition);
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
		Modifier mModifier = (Modifier) result1_bindingAndBlack[0];
		TAnnotationType tAnnotation = (TAnnotationType) result1_bindingAndBlack[1];
		AnnotationTypeDeclaration Annotation = (AnnotationTypeDeclaration) result1_bindingAndBlack[2];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[3];
		MDefinitionToTMember defToMember = (MDefinitionToTMember) result1_bindingAndBlack[4];
		TMember tMember = (TMember) result1_bindingAndBlack[5];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_1_1_performtransformation_greenBFFBB(mModifier, tMember, csp);
		MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result1_green[1];
		TModifier tModifier = (TModifier) result1_green[2];

		Object[] result2_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_1_2_collecttranslatedelements_blackBBB(mModifier,
						mModifierToTModifier, tModifier);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mModifier] = " + mModifier + ", "
					+ "[mModifierToTModifier] = " + mModifierToTModifier + ", " + "[tModifier] = " + tModifier + ".");
		}
		Object[] result2_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_1_2_collecttranslatedelements_greenFBBB(mModifier,
						mModifierToTModifier, tModifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, mModifier,
						mModifierToTModifier, tAnnotation, tModifier, Annotation, mDefinition, defToMember, tMember,
						mTypeToTType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mModifier] = " + mModifier + ", " + "[mModifierToTModifier] = " + mModifierToTModifier
					+ ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tModifier] = " + tModifier + ", "
					+ "[Annotation] = " + Annotation + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[defToMember] = " + defToMember + ", " + "[tMember] = " + tMember + ", " + "[mTypeToTType] = "
					+ mTypeToTType + ".");
		}
		MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, mModifier, mModifierToTModifier, tModifier, mDefinition, tMember);
		//nothing EMoflonEdge mModifierToTModifier__mModifier____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mModifierToTModifier__tModifier____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[10];

		// 
		// 
		MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_1_5_registerobjects_expressionBBBBBBBBBBB(
				this, ruleresult, mModifier, mModifierToTModifier, tAnnotation, tModifier, Annotation, mDefinition,
				defToMember, tMember, mTypeToTType);
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
		Modifier mModifier = (Modifier) result2_binding[0];
		AnnotationTypeDeclaration Annotation = (AnnotationTypeDeclaration) result2_binding[1];
		MDefinition mDefinition = (MDefinition) result2_binding[2];
		for (Object[] result2_black : MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_2_2_corematch_blackBFBBFFFB(mModifier, Annotation, mDefinition,
						match)) {
			TAnnotationType tAnnotation = (TAnnotationType) result2_black[1];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[4];
			TMember tMember = (TMember) result2_black[5];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_2_3_findcontext_blackBBBBBBB(mModifier, tAnnotation,
							Annotation, mDefinition, defToMember, tMember, mTypeToTType)) {
				Object[] result3_green = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_2_3_findcontext_greenBBBBBBBFFFFFFFFFFF(mModifier,
								tAnnotation, Annotation, mDefinition, defToMember, tMember, mTypeToTType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge tAnnotation__tMember____defines = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tMember__tAnnotation____definedBy = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge Annotation__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mDefinition__Annotation____abstractTypeDeclaration = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge defToMember__tMember____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge defToMember__mDefinition____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mTypeToTType__Annotation____source = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mTypeToTType__tAnnotation____target = (EMoflonEdge) result3_green[17];

				Object[] result4_bindingAndBlack = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, mModifier, tAnnotation, Annotation, mDefinition, defToMember,
								tMember, mTypeToTType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mModifier] = " + mModifier + ", "
							+ "[tAnnotation] = " + tAnnotation + ", " + "[Annotation] = " + Annotation + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[defToMember] = " + defToMember + ", "
							+ "[tMember] = " + tMember + ", " + "[mTypeToTType] = " + mTypeToTType + ".");
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
	public void registerObjectsToMatch_FWD(Match match, Modifier mModifier, AnnotationTypeDeclaration Annotation,
			MDefinition mDefinition) {
		match.registerObject("mModifier", mModifier);
		match.registerObject("Annotation", Annotation);
		match.registerObject("mDefinition", mDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Modifier mModifier, AnnotationTypeDeclaration Annotation,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Modifier mModifier,
			TAnnotationType tAnnotation, AnnotationTypeDeclaration Annotation, MDefinition mDefinition,
			MDefinitionToTMember defToMember, TMember tMember, TypeToTAbstractType mTypeToTType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.visibility", true,
				csp);
		var_mModifier_visibility.setValue(mModifier.getVisibility());
		var_mModifier_visibility.setType("java.VisibilityKind");
		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.static", true, csp);
		var_mModifier_static.setValue(mModifier.isStatic());
		var_mModifier_static.setType("Boolean");

		// Create unbound variables
		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.tVisibility", csp);
		var_tModifier_tVisibility.setType("basic.TVisibility");
		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.isStatic", csp);
		var_tModifier_isStatic.setType("Boolean");

		// Create constraints
		DefaultVisibility defaultVisibility = new DefaultVisibility();
		Eq eq = new Eq();

		csp.getConstraints().add(defaultVisibility);
		csp.getConstraints().add(eq);

		// Solve CSP
		defaultVisibility.setRuleName("NoRuleName");
		defaultVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mModifier", mModifier);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("Annotation", Annotation);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("defToMember", defToMember);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mModifier, EObject mModifierToTModifier,
			EObject tAnnotation, EObject tModifier, EObject Annotation, EObject mDefinition, EObject defToMember,
			EObject tMember, EObject mTypeToTType) {
		ruleresult.registerObject("mModifier", mModifier);
		ruleresult.registerObject("mModifierToTModifier", mModifierToTModifier);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("tModifier", tModifier);
		ruleresult.registerObject("Annotation", Annotation);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("defToMember", defToMember);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);

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
	public boolean isAppropriate_BWD(Match match, TAnnotationType tAnnotation, TModifier tModifier, TMember tMember) {

		Object[] result1_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_10_1_initialbindings_blackBBBBB(this, match, tAnnotation,
						tModifier, tMember);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tModifier] = "
					+ tModifier + ", " + "[tMember] = " + tMember + ".");
		}

		Object[] result2_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tAnnotation,
						tModifier, tMember);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tModifier] = "
					+ tModifier + ", " + "[tMember] = " + tMember + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_10_4_collectelementstobetranslated_blackBBBB(match,
							tAnnotation, tModifier, tMember);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnnotation] = " + tAnnotation + ", " + "[tModifier] = " + tModifier + ", " + "[tMember] = "
						+ tMember + ".");
			}
			MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_10_4_collectelementstobetranslated_greenBBBF(match, tModifier,
							tMember);
			//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result4_green[3];

			Object[] result5_black = MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_10_5_collectcontextelements_blackBBBB(match, tAnnotation,
							tModifier, tMember);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnnotation] = " + tAnnotation + ", " + "[tModifier] = " + tModifier + ", " + "[tMember] = "
						+ tMember + ".");
			}
			MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_10_5_collectcontextelements_greenBBBFF(match, tAnnotation,
							tMember);
			//nothing EMoflonEdge tAnnotation__tMember____defines = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge tMember__tAnnotation____definedBy = (EMoflonEdge) result5_green[4];

			// 
			MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_10_6_registerobjectstomatch_expressionBBBBB(this, match,
							tAnnotation, tModifier, tMember);
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
		TAnnotationType tAnnotation = (TAnnotationType) result1_bindingAndBlack[0];
		TModifier tModifier = (TModifier) result1_bindingAndBlack[1];
		AnnotationTypeDeclaration Annotation = (AnnotationTypeDeclaration) result1_bindingAndBlack[2];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[3];
		MDefinitionToTMember defToMember = (MDefinitionToTMember) result1_bindingAndBlack[4];
		TMember tMember = (TMember) result1_bindingAndBlack[5];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_11_1_performtransformation_greenFFBBB(tModifier, mDefinition,
						csp);
		Modifier mModifier = (Modifier) result1_green[0];
		MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result1_green[1];

		Object[] result2_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_11_2_collecttranslatedelements_blackBBB(mModifier,
						mModifierToTModifier, tModifier);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mModifier] = " + mModifier + ", "
					+ "[mModifierToTModifier] = " + mModifierToTModifier + ", " + "[tModifier] = " + tModifier + ".");
		}
		Object[] result2_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_11_2_collecttranslatedelements_greenFBBB(mModifier,
						mModifierToTModifier, tModifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, mModifier,
						mModifierToTModifier, tAnnotation, tModifier, Annotation, mDefinition, defToMember, tMember,
						mTypeToTType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mModifier] = " + mModifier + ", " + "[mModifierToTModifier] = " + mModifierToTModifier
					+ ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tModifier] = " + tModifier + ", "
					+ "[Annotation] = " + Annotation + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[defToMember] = " + defToMember + ", " + "[tMember] = " + tMember + ", " + "[mTypeToTType] = "
					+ mTypeToTType + ".");
		}
		MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, mModifier, mModifierToTModifier, tModifier, mDefinition, tMember);
		//nothing EMoflonEdge mModifierToTModifier__mModifier____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mModifierToTModifier__tModifier____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[10];

		// 
		// 
		MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
						mModifier, mModifierToTModifier, tAnnotation, tModifier, Annotation, mDefinition, defToMember,
						tMember, mTypeToTType);
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
		TAnnotationType tAnnotation = (TAnnotationType) result2_binding[0];
		TModifier tModifier = (TModifier) result2_binding[1];
		TMember tMember = (TMember) result2_binding[2];
		for (Object[] result2_black : MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_12_2_corematch_blackBBFFFBFB(tAnnotation, tModifier, tMember,
						match)) {
			AnnotationTypeDeclaration Annotation = (AnnotationTypeDeclaration) result2_black[2];
			MDefinition mDefinition = (MDefinition) result2_black[3];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[4];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_12_3_findcontext_blackBBBBBBB(tAnnotation, tModifier,
							Annotation, mDefinition, defToMember, tMember, mTypeToTType)) {
				Object[] result3_green = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_12_3_findcontext_greenBBBBBBBFFFFFFFFFF(tAnnotation,
								tModifier, Annotation, mDefinition, defToMember, tMember, mTypeToTType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge tAnnotation__tMember____defines = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tMember__tAnnotation____definedBy = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge Annotation__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mDefinition__Annotation____abstractTypeDeclaration = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge defToMember__tMember____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge defToMember__mDefinition____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mTypeToTType__Annotation____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mTypeToTType__tAnnotation____target = (EMoflonEdge) result3_green[16];

				Object[] result4_bindingAndBlack = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, tAnnotation, tModifier, Annotation, mDefinition, defToMember,
								tMember, mTypeToTType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tAnnotation] = " + tAnnotation
							+ ", " + "[tModifier] = " + tModifier + ", " + "[Annotation] = " + Annotation + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[defToMember] = " + defToMember + ", "
							+ "[tMember] = " + tMember + ", " + "[mTypeToTType] = " + mTypeToTType + ".");
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
	public void registerObjectsToMatch_BWD(Match match, TAnnotationType tAnnotation, TModifier tModifier,
			TMember tMember) {
		match.registerObject("tAnnotation", tAnnotation);
		match.registerObject("tModifier", tModifier);
		match.registerObject("tMember", tMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAnnotationType tAnnotation, TModifier tModifier,
			TMember tMember) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TAnnotationType tAnnotation,
			TModifier tModifier, AnnotationTypeDeclaration Annotation, MDefinition mDefinition,
			MDefinitionToTMember defToMember, TMember tMember, TypeToTAbstractType mTypeToTType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.tVisibility", true,
				csp);
		var_tModifier_tVisibility.setValue(tModifier.getTVisibility());
		var_tModifier_tVisibility.setType("basic.TVisibility");
		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.isStatic", true, csp);
		var_tModifier_isStatic.setValue(tModifier.isIsStatic());
		var_tModifier_isStatic.setType("Boolean");

		// Create unbound variables
		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.visibility", csp);
		var_mModifier_visibility.setType("java.VisibilityKind");
		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.static", csp);
		var_mModifier_static.setType("Boolean");

		// Create constraints
		DefaultVisibility defaultVisibility = new DefaultVisibility();
		Eq eq = new Eq();

		csp.getConstraints().add(defaultVisibility);
		csp.getConstraints().add(eq);

		// Solve CSP
		defaultVisibility.setRuleName("NoRuleName");
		defaultVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("tModifier", tModifier);
		isApplicableMatch.registerObject("Annotation", Annotation);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("defToMember", defToMember);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mModifier, EObject mModifierToTModifier,
			EObject tAnnotation, EObject tModifier, EObject Annotation, EObject mDefinition, EObject defToMember,
			EObject tMember, EObject mTypeToTType) {
		ruleresult.registerObject("mModifier", mModifier);
		ruleresult.registerObject("mModifierToTModifier", mModifierToTModifier);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("tModifier", tModifier);
		ruleresult.registerObject("Annotation", Annotation);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("defToMember", defToMember);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_263(EMoflonEdge _edge_tModifier) {

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
			TAnnotationType tAnnotation = (TAnnotationType) result2_black[0];
			TModifier tModifier = (TModifier) result2_black[1];
			TMember tMember = (TMember) result2_black[2];
			Object[] result2_green = MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tAnnotation, tModifier, tMember)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_273(EMoflonEdge _edge_modifier) {

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
			Modifier mModifier = (Modifier) result2_black[0];
			AnnotationTypeDeclaration Annotation = (AnnotationTypeDeclaration) result2_black[1];
			MDefinition mDefinition = (MDefinition) result2_black[2];
			Object[] result2_green = MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, mModifier, Annotation, mDefinition)) {
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

		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_tVisibility.setValue(__helper.getValue("tModifier", "tVisibility"));
		var_tModifier_tVisibility.setType("basic.TVisibility");

		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_visibility.setValue(__helper.getValue("mModifier", "visibility"));
		var_mModifier_visibility.setType("java.VisibilityKind");

		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_static.setValue(__helper.getValue("mModifier", "static"));
		var_mModifier_static.setType("boolean");

		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_isStatic.setValue(__helper.getValue("tModifier", "isStatic"));
		var_tModifier_isStatic.setType("boolean");

		DefaultVisibility defaultVisibility0 = new DefaultVisibility();
		csp.getConstraints().add(defaultVisibility0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		defaultVisibility0.setRuleName("MemberInAnnotationVisibility");
		defaultVisibility0.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		eq1.setRuleName("MemberInAnnotationVisibility");
		eq1.solve(var_mModifier_static, var_tModifier_isStatic);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tModifier_tVisibility.setBound(false);
			var_tModifier_isStatic.setBound(false);
			defaultVisibility0.solve(var_mModifier_visibility, var_tModifier_tVisibility);
			eq1.solve(var_mModifier_static, var_tModifier_isStatic);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tModifier", "tVisibility", var_tModifier_tVisibility.getValue());
				__helper.setValue("tModifier", "isStatic", var_tModifier_isStatic.getValue());
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

		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_tVisibility.setValue(__helper.getValue("tModifier", "tVisibility"));
		var_tModifier_tVisibility.setType("basic.TVisibility");

		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_visibility.setValue(__helper.getValue("mModifier", "visibility"));
		var_mModifier_visibility.setType("java.VisibilityKind");

		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_static.setValue(__helper.getValue("mModifier", "static"));
		var_mModifier_static.setType("boolean");

		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_isStatic.setValue(__helper.getValue("tModifier", "isStatic"));
		var_tModifier_isStatic.setType("boolean");

		DefaultVisibility defaultVisibility0 = new DefaultVisibility();
		csp.getConstraints().add(defaultVisibility0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		defaultVisibility0.setRuleName("MemberInAnnotationVisibility");
		defaultVisibility0.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		eq1.setRuleName("MemberInAnnotationVisibility");
		eq1.solve(var_mModifier_static, var_tModifier_isStatic);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mModifier_visibility.setBound(false);
			var_mModifier_static.setBound(false);
			defaultVisibility0.solve(var_mModifier_visibility, var_tModifier_tVisibility);
			eq1.solve(var_mModifier_static, var_tModifier_isStatic);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mModifier", "visibility", var_mModifier_visibility.getValue());
				__helper.setValue("mModifier", "static", var_mModifier_static.getValue());
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
		Modifier mModifier = (Modifier) result2_bindingAndBlack[0];
		TAnnotationType tAnnotation = (TAnnotationType) result2_bindingAndBlack[1];
		TModifier tModifier = (TModifier) result2_bindingAndBlack[2];
		AnnotationTypeDeclaration Annotation = (AnnotationTypeDeclaration) result2_bindingAndBlack[3];
		MDefinition mDefinition = (MDefinition) result2_bindingAndBlack[4];
		TMember tMember = (TMember) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, mModifier,
						tAnnotation, tModifier, Annotation, mDefinition, tMember, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mModifier] = " + mModifier + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tModifier] = "
					+ tModifier + ", " + "[Annotation] = " + Annotation + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[tMember] = " + tMember + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_24_5_matchcorrcontext_blackBBBFBFBB(tAnnotation, Annotation,
							mDefinition, tMember, sourceMatch, targetMatch)) {
				MDefinitionToTMember defToMember = (MDefinitionToTMember) result5_black[3];
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[5];
				Object[] result5_green = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_24_5_matchcorrcontext_greenBBBBF(defToMember,
								mTypeToTType, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_24_6_createcorrespondence_blackBBBBBBB(mModifier,
								tAnnotation, tModifier, Annotation, mDefinition, tMember, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mModifier] = "
							+ mModifier + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tModifier] = " + tModifier
							+ ", " + "[Annotation] = " + Annotation + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[tMember] = " + tMember + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_24_6_createcorrespondence_greenBFBB(mModifier, tModifier,
								ccMatch);
				//nothing MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result6_green[1];

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
	public CSP isApplicable_solveCsp_CC(Modifier mModifier, TAnnotationType tAnnotation, TModifier tModifier,
			AnnotationTypeDeclaration Annotation, MDefinition mDefinition, TMember tMember, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.visibility", true,
				csp);
		var_mModifier_visibility.setValue(mModifier.getVisibility());
		var_mModifier_visibility.setType("java.VisibilityKind");
		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.tVisibility", true,
				csp);
		var_tModifier_tVisibility.setValue(tModifier.getTVisibility());
		var_tModifier_tVisibility.setType("basic.TVisibility");
		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.static", true, csp);
		var_mModifier_static.setValue(mModifier.isStatic());
		var_mModifier_static.setType("Boolean");
		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.isStatic", true, csp);
		var_tModifier_isStatic.setValue(tModifier.isIsStatic());
		var_tModifier_isStatic.setType("Boolean");

		// Create unbound variables

		// Create constraints
		DefaultVisibility defaultVisibility = new DefaultVisibility();
		Eq eq = new Eq();

		csp.getConstraints().add(defaultVisibility);
		csp.getConstraints().add(eq);

		// Solve CSP
		defaultVisibility.setRuleName("NoRuleName");
		defaultVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);
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
	public boolean checkDEC_FWD(Modifier mModifier, AnnotationTypeDeclaration Annotation, MDefinition mDefinition) {// 
		Object[] result1_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_27_1_matchtggpattern_blackBBB(mModifier, Annotation, mDefinition);
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
	public boolean checkDEC_BWD(TAnnotationType tAnnotation, TModifier tModifier, TMember tMember) {// 
		Object[] result1_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_28_1_matchtggpattern_blackBBB(tAnnotation, tModifier, tMember);
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
			TAnnotationType tAnnotation = (TAnnotationType) result2_black[1];
			TMember tMember = (TMember) result2_black[2];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[3];
			MDefinition mDefinition = (MDefinition) result2_black[4];
			AnnotationTypeDeclaration Annotation = (AnnotationTypeDeclaration) result2_black[5];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[6];

			Object[] result3_bindingAndBlack = MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this,
							isApplicableMatch, tAnnotation, Annotation, mDefinition, defToMember, tMember, mTypeToTType,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tAnnotation] = " + tAnnotation + ", "
						+ "[Annotation] = " + Annotation + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[defToMember] = " + defToMember + ", " + "[tMember] = " + tMember + ", "
						+ "[mTypeToTType] = " + mTypeToTType + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_29_5_checknacs_blackBBBBBB(tAnnotation, Annotation,
								mDefinition, defToMember, tMember, mTypeToTType);
				if (result5_black != null) {

					Object[] result6_black = MemberInAnnotationVisibilityImpl
							.pattern_MemberInAnnotationVisibility_29_6_perform_blackBBBBBBB(tAnnotation, Annotation,
									mDefinition, defToMember, tMember, mTypeToTType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAnnotation] = "
								+ tAnnotation + ", " + "[Annotation] = " + Annotation + ", " + "[mDefinition] = "
								+ mDefinition + ", " + "[defToMember] = " + defToMember + ", " + "[tMember] = "
								+ tMember + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_29_6_perform_greenFFFBBBB(
							mDefinition, tMember, ruleResult, csp);
					//nothing Modifier mModifier = (Modifier) result6_green[0];
					//nothing MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result6_green[1];
					//nothing TModifier tModifier = (TModifier) result6_green[2];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TAnnotationType tAnnotation,
			AnnotationTypeDeclaration Annotation, MDefinition mDefinition, MDefinitionToTMember defToMember,
			TMember tMember, TypeToTAbstractType mTypeToTType, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.visibility", csp);
		var_mModifier_visibility.setType("java.VisibilityKind");
		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.tVisibility", csp);
		var_tModifier_tVisibility.setType("basic.TVisibility");
		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.static", csp);
		var_mModifier_static.setType("Boolean");
		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.isStatic", csp);
		var_tModifier_isStatic.setType("Boolean");

		// Create constraints
		DefaultVisibility defaultVisibility = new DefaultVisibility();
		Eq eq = new Eq();

		csp.getConstraints().add(defaultVisibility);
		csp.getConstraints().add(eq);

		// Solve CSP
		defaultVisibility.setRuleName("NoRuleName");
		defaultVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("Annotation", Annotation);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("defToMember", defToMember);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
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
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_FWD__MATCH_MODIFIER_ANNOTATIONTYPEDECLARATION_MDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (Modifier) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2), (MDefinition) arguments.get(3));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODIFIER_ANNOTATIONTYPEDECLARATION_MDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Modifier) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2), (MDefinition) arguments.get(3));
			return null;
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODIFIER_ANNOTATIONTYPEDECLARATION_MDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Modifier) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2), (MDefinition) arguments.get(3));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODIFIER_TANNOTATIONTYPE_ANNOTATIONTYPEDECLARATION_MDEFINITION_MDEFINITIONTOTMEMBER_TMEMBER_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Modifier) arguments.get(1),
					(TAnnotationType) arguments.get(2), (AnnotationTypeDeclaration) arguments.get(3),
					(MDefinition) arguments.get(4), (MDefinitionToTMember) arguments.get(5), (TMember) arguments.get(6),
					(TypeToTAbstractType) arguments.get(7));
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
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_BWD__MATCH_TANNOTATIONTYPE_TMODIFIER_TMEMBER:
			return isAppropriate_BWD((Match) arguments.get(0), (TAnnotationType) arguments.get(1),
					(TModifier) arguments.get(2), (TMember) arguments.get(3));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TANNOTATIONTYPE_TMODIFIER_TMEMBER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAnnotationType) arguments.get(1),
					(TModifier) arguments.get(2), (TMember) arguments.get(3));
			return null;
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TANNOTATIONTYPE_TMODIFIER_TMEMBER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAnnotationType) arguments.get(1),
					(TModifier) arguments.get(2), (TMember) arguments.get(3));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TANNOTATIONTYPE_TMODIFIER_ANNOTATIONTYPEDECLARATION_MDEFINITION_MDEFINITIONTOTMEMBER_TMEMBER_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TAnnotationType) arguments.get(1),
					(TModifier) arguments.get(2), (AnnotationTypeDeclaration) arguments.get(3),
					(MDefinition) arguments.get(4), (MDefinitionToTMember) arguments.get(5), (TMember) arguments.get(6),
					(TypeToTAbstractType) arguments.get(7));
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
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_BWD_EMOFLON_EDGE_263__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_263((EMoflonEdge) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_FWD_EMOFLON_EDGE_273__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_273((EMoflonEdge) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_SOLVE_CSP_CC__MODIFIER_TANNOTATIONTYPE_TMODIFIER_ANNOTATIONTYPEDECLARATION_MDEFINITION_TMEMBER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Modifier) arguments.get(0), (TAnnotationType) arguments.get(1),
					(TModifier) arguments.get(2), (AnnotationTypeDeclaration) arguments.get(3),
					(MDefinition) arguments.get(4), (TMember) arguments.get(5), (Match) arguments.get(6),
					(Match) arguments.get(7));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___CHECK_DEC_FWD__MODIFIER_ANNOTATIONTYPEDECLARATION_MDEFINITION:
			return checkDEC_FWD((Modifier) arguments.get(0), (AnnotationTypeDeclaration) arguments.get(1),
					(MDefinition) arguments.get(2));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___CHECK_DEC_BWD__TANNOTATIONTYPE_TMODIFIER_TMEMBER:
			return checkDEC_BWD((TAnnotationType) arguments.get(0), (TModifier) arguments.get(1),
					(TMember) arguments.get(2));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TANNOTATIONTYPE_ANNOTATIONTYPEDECLARATION_MDEFINITION_MDEFINITIONTOTMEMBER_TMEMBER_TYPETOTABSTRACTTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TAnnotationType) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2), (MDefinition) arguments.get(3),
					(MDefinitionToTMember) arguments.get(4), (TMember) arguments.get(5),
					(TypeToTAbstractType) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_0_1_initialbindings_blackBBBBB(
			MemberInAnnotationVisibility _this, Match match, Modifier mModifier, AnnotationTypeDeclaration annotation,
			MDefinition mDefinition) {
		return new Object[] { _this, match, mModifier, annotation, mDefinition };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_0_2_SolveCSP_bindingFBBBBB(
			MemberInAnnotationVisibility _this, Match match, Modifier mModifier, AnnotationTypeDeclaration annotation,
			MDefinition mDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mModifier, annotation, mDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mModifier, annotation, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_0_2_SolveCSP_bindingAndBlackFBBBBB(
			MemberInAnnotationVisibility _this, Match match, Modifier mModifier, AnnotationTypeDeclaration annotation,
			MDefinition mDefinition) {
		Object[] result_pattern_MemberInAnnotationVisibility_0_2_SolveCSP_binding = pattern_MemberInAnnotationVisibility_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mModifier, annotation, mDefinition);
		if (result_pattern_MemberInAnnotationVisibility_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_0_2_SolveCSP_black = pattern_MemberInAnnotationVisibility_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MemberInAnnotationVisibility_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mModifier, annotation, mDefinition };
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
			Match match, Modifier mModifier, AnnotationTypeDeclaration annotation, MDefinition mDefinition) {
		return new Object[] { match, mModifier, annotation, mDefinition };
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
			Modifier mModifier, AnnotationTypeDeclaration annotation, MDefinition mDefinition) {
		return new Object[] { match, mModifier, annotation, mDefinition };
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
			MemberInAnnotationVisibility _this, Match match, Modifier mModifier, AnnotationTypeDeclaration annotation,
			MDefinition mDefinition) {
		_this.registerObjectsToMatch_FWD(match, mModifier, annotation, mDefinition);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("mModifier");
		EObject _localVariable_1 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_2 = isApplicableMatch.getObject("Annotation");
		EObject _localVariable_3 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_4 = isApplicableMatch.getObject("defToMember");
		EObject _localVariable_5 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_6 = isApplicableMatch.getObject("mTypeToTType");
		EObject tmpMModifier = _localVariable_0;
		EObject tmpTAnnotation = _localVariable_1;
		EObject tmpAnnotation = _localVariable_2;
		EObject tmpMDefinition = _localVariable_3;
		EObject tmpDefToMember = _localVariable_4;
		EObject tmpTMember = _localVariable_5;
		EObject tmpMTypeToTType = _localVariable_6;
		if (tmpMModifier instanceof Modifier) {
			Modifier mModifier = (Modifier) tmpMModifier;
			if (tmpTAnnotation instanceof TAnnotationType) {
				TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
				if (tmpAnnotation instanceof AnnotationTypeDeclaration) {
					AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) tmpAnnotation;
					if (tmpMDefinition instanceof MDefinition) {
						MDefinition mDefinition = (MDefinition) tmpMDefinition;
						if (tmpDefToMember instanceof MDefinitionToTMember) {
							MDefinitionToTMember defToMember = (MDefinitionToTMember) tmpDefToMember;
							if (tmpTMember instanceof TMember) {
								TMember tMember = (TMember) tmpTMember;
								if (tmpMTypeToTType instanceof TypeToTAbstractType) {
									TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
									return new Object[] { mModifier, tAnnotation, annotation, mDefinition, defToMember,
											tMember, mTypeToTType, isApplicableMatch };
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
			Modifier mModifier, TAnnotationType tAnnotation, AnnotationTypeDeclaration annotation,
			MDefinition mDefinition, MDefinitionToTMember defToMember, TMember tMember,
			TypeToTAbstractType mTypeToTType, MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mModifier, tAnnotation, annotation, mDefinition, defToMember, tMember,
						mTypeToTType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding = pattern_MemberInAnnotationVisibility_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding != null) {
			Modifier mModifier = (Modifier) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding[0];
			TAnnotationType tAnnotation = (TAnnotationType) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding[1];
			AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding[2];
			MDefinition mDefinition = (MDefinition) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding[3];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding[4];
			TMember tMember = (TMember) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding[5];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding[6];

			Object[] result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_black = pattern_MemberInAnnotationVisibility_1_1_performtransformation_blackBBBBBBBFBB(
					mModifier, tAnnotation, annotation, mDefinition, defToMember, tMember, mTypeToTType, _this,
					isApplicableMatch);
			if (result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_black[7];

				return new Object[] { mModifier, tAnnotation, annotation, mDefinition, defToMember, tMember,
						mTypeToTType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_1_1_performtransformation_greenBFFBB(
			Modifier mModifier, TMember tMember, CSP csp) {
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		TModifier tModifier = BasicFactory.eINSTANCE.createTModifier();
		Object _localVariable_0 = csp.getValue("tModifier", "tVisibility");
		Object _localVariable_1 = csp.getValue("tModifier", "isStatic");
		mModifierToTModifier.setSource(mModifier);
		mModifierToTModifier.setTarget(tModifier);
		tMember.setTModifier(tModifier);
		TVisibility tModifier_tVisibility_prime = (TVisibility) _localVariable_0;
		boolean tModifier_isStatic_prime = (boolean) _localVariable_1;
		tModifier.setTVisibility(tModifier_tVisibility_prime);
		tModifier.setIsStatic(Boolean.valueOf(tModifier_isStatic_prime));
		return new Object[] { mModifier, mModifierToTModifier, tModifier, tMember, csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_1_2_collecttranslatedelements_blackBBB(
			Modifier mModifier, MModifierToTModifier mModifierToTModifier, TModifier tModifier) {
		return new Object[] { mModifier, mModifierToTModifier, tModifier };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_1_2_collecttranslatedelements_greenFBBB(
			Modifier mModifier, MModifierToTModifier mModifierToTModifier, TModifier tModifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mModifier);
		ruleresult.getCreatedLinkElements().add(mModifierToTModifier);
		ruleresult.getCreatedElements().add(tModifier);
		return new Object[] { ruleresult, mModifier, mModifierToTModifier, tModifier };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mModifier, EObject mModifierToTModifier, EObject tAnnotation,
			EObject tModifier, EObject annotation, EObject mDefinition, EObject defToMember, EObject tMember,
			EObject mTypeToTType) {
		if (!mModifier.equals(mModifierToTModifier)) {
			if (!mModifier.equals(tAnnotation)) {
				if (!mModifier.equals(tModifier)) {
					if (!mModifier.equals(tMember)) {
						if (!mModifier.equals(mTypeToTType)) {
							if (!mModifierToTModifier.equals(tAnnotation)) {
								if (!mModifierToTModifier.equals(tModifier)) {
									if (!mModifierToTModifier.equals(tMember)) {
										if (!mModifierToTModifier.equals(mTypeToTType)) {
											if (!tAnnotation.equals(tModifier)) {
												if (!tAnnotation.equals(tMember)) {
													if (!annotation.equals(mModifier)) {
														if (!annotation.equals(mModifierToTModifier)) {
															if (!annotation.equals(tAnnotation)) {
																if (!annotation.equals(tModifier)) {
																	if (!annotation.equals(mDefinition)) {
																		if (!annotation.equals(defToMember)) {
																			if (!annotation.equals(tMember)) {
																				if (!annotation.equals(mTypeToTType)) {
																					if (!mDefinition
																							.equals(mModifier)) {
																						if (!mDefinition.equals(
																								mModifierToTModifier)) {
																							if (!mDefinition.equals(
																									tAnnotation)) {
																								if (!mDefinition.equals(
																										tModifier)) {
																									if (!mDefinition
																											.equals(tMember)) {
																										if (!mDefinition
																												.equals(mTypeToTType)) {
																											if (!defToMember
																													.equals(mModifier)) {
																												if (!defToMember
																														.equals(mModifierToTModifier)) {
																													if (!defToMember
																															.equals(tAnnotation)) {
																														if (!defToMember
																																.equals(tModifier)) {
																															if (!defToMember
																																	.equals(mDefinition)) {
																																if (!defToMember
																																		.equals(tMember)) {
																																	if (!defToMember
																																			.equals(mTypeToTType)) {
																																		if (!tMember
																																				.equals(tModifier)) {
																																			if (!mTypeToTType
																																					.equals(tAnnotation)) {
																																				if (!mTypeToTType
																																						.equals(tModifier)) {
																																					if (!mTypeToTType
																																							.equals(tMember)) {
																																						return new Object[] {
																																								ruleresult,
																																								mModifier,
																																								mModifierToTModifier,
																																								tAnnotation,
																																								tModifier,
																																								annotation,
																																								mDefinition,
																																								defToMember,
																																								tMember,
																																								mTypeToTType };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject mModifier, EObject mModifierToTModifier, EObject tModifier,
			EObject mDefinition, EObject tMember) {
		EMoflonEdge mModifierToTModifier__mModifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__tModifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MemberInAnnotationVisibility";
		String mModifierToTModifier__mModifier____source_name_prime = "source";
		String mModifierToTModifier__tModifier____target_name_prime = "target";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		mModifierToTModifier__mModifier____source.setSrc(mModifierToTModifier);
		mModifierToTModifier__mModifier____source.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__mModifier____source);
		mModifierToTModifier__tModifier____target.setSrc(mModifierToTModifier);
		mModifierToTModifier__tModifier____target.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__tModifier____target);
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		ruleresult.getTranslatedEdges().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(mModifier__mDefinition____bodyDeclaration);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(tMember__tModifier____tModifier);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mModifierToTModifier__mModifier____source.setName(mModifierToTModifier__mModifier____source_name_prime);
		mModifierToTModifier__tModifier____target.setName(mModifierToTModifier__tModifier____target_name_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		return new Object[] { ruleresult, mModifier, mModifierToTModifier, tModifier, mDefinition, tMember,
				mModifierToTModifier__mModifier____source, mModifierToTModifier__tModifier____target,
				mDefinition__mModifier____modifier, mModifier__mDefinition____bodyDeclaration,
				tMember__tModifier____tModifier };
	}

	public static final void pattern_MemberInAnnotationVisibility_1_5_registerobjects_expressionBBBBBBBBBBB(
			MemberInAnnotationVisibility _this, PerformRuleResult ruleresult, EObject mModifier,
			EObject mModifierToTModifier, EObject tAnnotation, EObject tModifier, EObject annotation,
			EObject mDefinition, EObject defToMember, EObject tMember, EObject mTypeToTType) {
		_this.registerObjects_FWD(ruleresult, mModifier, mModifierToTModifier, tAnnotation, tModifier, annotation,
				mDefinition, defToMember, tMember, mTypeToTType);

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
		EObject _localVariable_0 = match.getObject("mModifier");
		EObject _localVariable_1 = match.getObject("Annotation");
		EObject _localVariable_2 = match.getObject("mDefinition");
		EObject tmpMModifier = _localVariable_0;
		EObject tmpAnnotation = _localVariable_1;
		EObject tmpMDefinition = _localVariable_2;
		if (tmpMModifier instanceof Modifier) {
			Modifier mModifier = (Modifier) tmpMModifier;
			if (tmpAnnotation instanceof AnnotationTypeDeclaration) {
				AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) tmpAnnotation;
				if (tmpMDefinition instanceof MDefinition) {
					MDefinition mDefinition = (MDefinition) tmpMDefinition;
					return new Object[] { mModifier, annotation, mDefinition, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInAnnotationVisibility_2_2_corematch_blackBFBBFFFB(
			Modifier mModifier, AnnotationTypeDeclaration annotation, MDefinition mDefinition, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
			TMember tMember = defToMember.getTarget();
			if (tMember != null) {
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(annotation, TypeToTAbstractType.class, "source")) {
					TAbstractType tmpTAnnotation = mTypeToTType.getTarget();
					if (tmpTAnnotation instanceof TAnnotationType) {
						TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
						_result.add(new Object[] { mModifier, tAnnotation, annotation, mDefinition, defToMember,
								tMember, mTypeToTType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MemberInAnnotationVisibility_2_3_findcontext_blackBBBBBBB(
			Modifier mModifier, TAnnotationType tAnnotation, AnnotationTypeDeclaration annotation,
			MDefinition mDefinition, MDefinitionToTMember defToMember, TMember tMember,
			TypeToTAbstractType mTypeToTType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tAnnotation.getDefines().contains(tMember)) {
			if (annotation.getBodyDeclarations().contains(mDefinition)) {
				if (mModifier.equals(mDefinition.getModifier())) {
					if (tMember.equals(defToMember.getTarget())) {
						if (mDefinition.equals(defToMember.getSource())) {
							if (annotation.equals(mTypeToTType.getSource())) {
								if (tAnnotation.equals(mTypeToTType.getTarget())) {
									_result.add(new Object[] { mModifier, tAnnotation, annotation, mDefinition,
											defToMember, tMember, mTypeToTType });
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
			Modifier mModifier, TAnnotationType tAnnotation, AnnotationTypeDeclaration annotation,
			MDefinition mDefinition, MDefinitionToTMember defToMember, TMember tMember,
			TypeToTAbstractType mTypeToTType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tAnnotation__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAnnotation____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__Annotation____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__Annotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tAnnotation__tMember____defines_name_prime = "defines";
		String tMember__tAnnotation____definedBy_name_prime = "definedBy";
		String annotation__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__Annotation____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		String defToMember__tMember____target_name_prime = "target";
		String defToMember__mDefinition____source_name_prime = "source";
		String mTypeToTType__Annotation____source_name_prime = "source";
		String mTypeToTType__tAnnotation____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mModifier);
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(annotation);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(defToMember);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		tAnnotation__tMember____defines.setSrc(tAnnotation);
		tAnnotation__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tMember____defines);
		tMember__tAnnotation____definedBy.setSrc(tMember);
		tMember__tAnnotation____definedBy.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tMember__tAnnotation____definedBy);
		annotation__mDefinition____bodyDeclarations.setSrc(annotation);
		annotation__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(annotation__mDefinition____bodyDeclarations);
		mDefinition__Annotation____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__Annotation____abstractTypeDeclaration.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(mDefinition__Annotation____abstractTypeDeclaration);
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		isApplicableMatch.getAllContextElements().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mModifier__mDefinition____bodyDeclaration);
		defToMember__tMember____target.setSrc(defToMember);
		defToMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(defToMember__tMember____target);
		defToMember__mDefinition____source.setSrc(defToMember);
		defToMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(defToMember__mDefinition____source);
		mTypeToTType__Annotation____source.setSrc(mTypeToTType);
		mTypeToTType__Annotation____source.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__Annotation____source);
		mTypeToTType__tAnnotation____target.setSrc(mTypeToTType);
		mTypeToTType__tAnnotation____target.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tAnnotation____target);
		tAnnotation__tMember____defines.setName(tAnnotation__tMember____defines_name_prime);
		tMember__tAnnotation____definedBy.setName(tMember__tAnnotation____definedBy_name_prime);
		annotation__mDefinition____bodyDeclarations.setName(annotation__mDefinition____bodyDeclarations_name_prime);
		mDefinition__Annotation____abstractTypeDeclaration
				.setName(mDefinition__Annotation____abstractTypeDeclaration_name_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		defToMember__tMember____target.setName(defToMember__tMember____target_name_prime);
		defToMember__mDefinition____source.setName(defToMember__mDefinition____source_name_prime);
		mTypeToTType__Annotation____source.setName(mTypeToTType__Annotation____source_name_prime);
		mTypeToTType__tAnnotation____target.setName(mTypeToTType__tAnnotation____target_name_prime);
		return new Object[] { mModifier, tAnnotation, annotation, mDefinition, defToMember, tMember, mTypeToTType,
				isApplicableMatch, tAnnotation__tMember____defines, tMember__tAnnotation____definedBy,
				annotation__mDefinition____bodyDeclarations, mDefinition__Annotation____abstractTypeDeclaration,
				mDefinition__mModifier____modifier, mModifier__mDefinition____bodyDeclaration,
				defToMember__tMember____target, defToMember__mDefinition____source, mTypeToTType__Annotation____source,
				mTypeToTType__tAnnotation____target };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_4_solveCSP_bindingFBBBBBBBBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch, Modifier mModifier,
			TAnnotationType tAnnotation, AnnotationTypeDeclaration annotation, MDefinition mDefinition,
			MDefinitionToTMember defToMember, TMember tMember, TypeToTAbstractType mTypeToTType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mModifier, tAnnotation, annotation,
				mDefinition, defToMember, tMember, mTypeToTType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mModifier, tAnnotation, annotation, mDefinition,
					defToMember, tMember, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch, Modifier mModifier,
			TAnnotationType tAnnotation, AnnotationTypeDeclaration annotation, MDefinition mDefinition,
			MDefinitionToTMember defToMember, TMember tMember, TypeToTAbstractType mTypeToTType) {
		Object[] result_pattern_MemberInAnnotationVisibility_2_4_solveCSP_binding = pattern_MemberInAnnotationVisibility_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mModifier, tAnnotation, annotation, mDefinition, defToMember, tMember,
				mTypeToTType);
		if (result_pattern_MemberInAnnotationVisibility_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_2_4_solveCSP_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_2_4_solveCSP_black = pattern_MemberInAnnotationVisibility_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MemberInAnnotationVisibility_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mModifier, tAnnotation, annotation, mDefinition,
						defToMember, tMember, mTypeToTType };
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
			MemberInAnnotationVisibility _this, Match match, TAnnotationType tAnnotation, TModifier tModifier,
			TMember tMember) {
		return new Object[] { _this, match, tAnnotation, tModifier, tMember };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_2_SolveCSP_bindingFBBBBB(
			MemberInAnnotationVisibility _this, Match match, TAnnotationType tAnnotation, TModifier tModifier,
			TMember tMember) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAnnotation, tModifier, tMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAnnotation, tModifier, tMember };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_2_SolveCSP_bindingAndBlackFBBBBB(
			MemberInAnnotationVisibility _this, Match match, TAnnotationType tAnnotation, TModifier tModifier,
			TMember tMember) {
		Object[] result_pattern_MemberInAnnotationVisibility_10_2_SolveCSP_binding = pattern_MemberInAnnotationVisibility_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tAnnotation, tModifier, tMember);
		if (result_pattern_MemberInAnnotationVisibility_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_10_2_SolveCSP_black = pattern_MemberInAnnotationVisibility_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MemberInAnnotationVisibility_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAnnotation, tModifier, tMember };
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
			Match match, TAnnotationType tAnnotation, TModifier tModifier, TMember tMember) {
		return new Object[] { match, tAnnotation, tModifier, tMember };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_4_collectelementstobetranslated_greenBBBF(
			Match match, TModifier tModifier, TMember tMember) {
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tModifier);
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		match.getToBeTranslatedEdges().add(tMember__tModifier____tModifier);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		return new Object[] { match, tModifier, tMember, tMember__tModifier____tModifier };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_5_collectcontextelements_blackBBBB(Match match,
			TAnnotationType tAnnotation, TModifier tModifier, TMember tMember) {
		return new Object[] { match, tAnnotation, tModifier, tMember };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_5_collectcontextelements_greenBBBFF(
			Match match, TAnnotationType tAnnotation, TMember tMember) {
		EMoflonEdge tAnnotation__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAnnotation____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tAnnotation);
		match.getContextNodes().add(tMember);
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
		return new Object[] { match, tAnnotation, tMember, tAnnotation__tMember____defines,
				tMember__tAnnotation____definedBy };
	}

	public static final void pattern_MemberInAnnotationVisibility_10_6_registerobjectstomatch_expressionBBBBB(
			MemberInAnnotationVisibility _this, Match match, TAnnotationType tAnnotation, TModifier tModifier,
			TMember tMember) {
		_this.registerObjectsToMatch_BWD(match, tAnnotation, tModifier, tMember);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_1 = isApplicableMatch.getObject("tModifier");
		EObject _localVariable_2 = isApplicableMatch.getObject("Annotation");
		EObject _localVariable_3 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_4 = isApplicableMatch.getObject("defToMember");
		EObject _localVariable_5 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_6 = isApplicableMatch.getObject("mTypeToTType");
		EObject tmpTAnnotation = _localVariable_0;
		EObject tmpTModifier = _localVariable_1;
		EObject tmpAnnotation = _localVariable_2;
		EObject tmpMDefinition = _localVariable_3;
		EObject tmpDefToMember = _localVariable_4;
		EObject tmpTMember = _localVariable_5;
		EObject tmpMTypeToTType = _localVariable_6;
		if (tmpTAnnotation instanceof TAnnotationType) {
			TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
			if (tmpTModifier instanceof TModifier) {
				TModifier tModifier = (TModifier) tmpTModifier;
				if (tmpAnnotation instanceof AnnotationTypeDeclaration) {
					AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) tmpAnnotation;
					if (tmpMDefinition instanceof MDefinition) {
						MDefinition mDefinition = (MDefinition) tmpMDefinition;
						if (tmpDefToMember instanceof MDefinitionToTMember) {
							MDefinitionToTMember defToMember = (MDefinitionToTMember) tmpDefToMember;
							if (tmpTMember instanceof TMember) {
								TMember tMember = (TMember) tmpTMember;
								if (tmpMTypeToTType instanceof TypeToTAbstractType) {
									TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
									return new Object[] { tAnnotation, tModifier, annotation, mDefinition, defToMember,
											tMember, mTypeToTType, isApplicableMatch };
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
			TAnnotationType tAnnotation, TModifier tModifier, AnnotationTypeDeclaration annotation,
			MDefinition mDefinition, MDefinitionToTMember defToMember, TMember tMember,
			TypeToTAbstractType mTypeToTType, MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tAnnotation, tModifier, annotation, mDefinition, defToMember, tMember,
						mTypeToTType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding = pattern_MemberInAnnotationVisibility_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding != null) {
			TAnnotationType tAnnotation = (TAnnotationType) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding[0];
			TModifier tModifier = (TModifier) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding[1];
			AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding[2];
			MDefinition mDefinition = (MDefinition) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding[3];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding[4];
			TMember tMember = (TMember) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding[5];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding[6];

			Object[] result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_black = pattern_MemberInAnnotationVisibility_11_1_performtransformation_blackBBBBBBBFBB(
					tAnnotation, tModifier, annotation, mDefinition, defToMember, tMember, mTypeToTType, _this,
					isApplicableMatch);
			if (result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_black[7];

				return new Object[] { tAnnotation, tModifier, annotation, mDefinition, defToMember, tMember,
						mTypeToTType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_11_1_performtransformation_greenFFBBB(
			TModifier tModifier, MDefinition mDefinition, CSP csp) {
		Modifier mModifier = JavaFactory.eINSTANCE.createModifier();
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		Object _localVariable_0 = csp.getValue("mModifier", "visibility");
		Object _localVariable_1 = csp.getValue("mModifier", "static");
		mDefinition.setModifier(mModifier);
		mModifierToTModifier.setSource(mModifier);
		mModifierToTModifier.setTarget(tModifier);
		VisibilityKind mModifier_visibility_prime = (VisibilityKind) _localVariable_0;
		boolean mModifier_static_prime = (boolean) _localVariable_1;
		mModifier.setVisibility(mModifier_visibility_prime);
		mModifier.setStatic(Boolean.valueOf(mModifier_static_prime));
		return new Object[] { mModifier, mModifierToTModifier, tModifier, mDefinition, csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_11_2_collecttranslatedelements_blackBBB(
			Modifier mModifier, MModifierToTModifier mModifierToTModifier, TModifier tModifier) {
		return new Object[] { mModifier, mModifierToTModifier, tModifier };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_11_2_collecttranslatedelements_greenFBBB(
			Modifier mModifier, MModifierToTModifier mModifierToTModifier, TModifier tModifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mModifier);
		ruleresult.getCreatedLinkElements().add(mModifierToTModifier);
		ruleresult.getTranslatedElements().add(tModifier);
		return new Object[] { ruleresult, mModifier, mModifierToTModifier, tModifier };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mModifier, EObject mModifierToTModifier, EObject tAnnotation,
			EObject tModifier, EObject annotation, EObject mDefinition, EObject defToMember, EObject tMember,
			EObject mTypeToTType) {
		if (!mModifier.equals(mModifierToTModifier)) {
			if (!mModifier.equals(tAnnotation)) {
				if (!mModifier.equals(tModifier)) {
					if (!mModifier.equals(tMember)) {
						if (!mModifier.equals(mTypeToTType)) {
							if (!mModifierToTModifier.equals(tAnnotation)) {
								if (!mModifierToTModifier.equals(tModifier)) {
									if (!mModifierToTModifier.equals(tMember)) {
										if (!mModifierToTModifier.equals(mTypeToTType)) {
											if (!tAnnotation.equals(tModifier)) {
												if (!tAnnotation.equals(tMember)) {
													if (!annotation.equals(mModifier)) {
														if (!annotation.equals(mModifierToTModifier)) {
															if (!annotation.equals(tAnnotation)) {
																if (!annotation.equals(tModifier)) {
																	if (!annotation.equals(mDefinition)) {
																		if (!annotation.equals(defToMember)) {
																			if (!annotation.equals(tMember)) {
																				if (!annotation.equals(mTypeToTType)) {
																					if (!mDefinition
																							.equals(mModifier)) {
																						if (!mDefinition.equals(
																								mModifierToTModifier)) {
																							if (!mDefinition.equals(
																									tAnnotation)) {
																								if (!mDefinition.equals(
																										tModifier)) {
																									if (!mDefinition
																											.equals(tMember)) {
																										if (!mDefinition
																												.equals(mTypeToTType)) {
																											if (!defToMember
																													.equals(mModifier)) {
																												if (!defToMember
																														.equals(mModifierToTModifier)) {
																													if (!defToMember
																															.equals(tAnnotation)) {
																														if (!defToMember
																																.equals(tModifier)) {
																															if (!defToMember
																																	.equals(mDefinition)) {
																																if (!defToMember
																																		.equals(tMember)) {
																																	if (!defToMember
																																			.equals(mTypeToTType)) {
																																		if (!tMember
																																				.equals(tModifier)) {
																																			if (!mTypeToTType
																																					.equals(tAnnotation)) {
																																				if (!mTypeToTType
																																						.equals(tModifier)) {
																																					if (!mTypeToTType
																																							.equals(tMember)) {
																																						return new Object[] {
																																								ruleresult,
																																								mModifier,
																																								mModifierToTModifier,
																																								tAnnotation,
																																								tModifier,
																																								annotation,
																																								mDefinition,
																																								defToMember,
																																								tMember,
																																								mTypeToTType };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject mModifier, EObject mModifierToTModifier, EObject tModifier,
			EObject mDefinition, EObject tMember) {
		EMoflonEdge mModifierToTModifier__mModifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__tModifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MemberInAnnotationVisibility";
		String mModifierToTModifier__mModifier____source_name_prime = "source";
		String mModifierToTModifier__tModifier____target_name_prime = "target";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		mModifierToTModifier__mModifier____source.setSrc(mModifierToTModifier);
		mModifierToTModifier__mModifier____source.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__mModifier____source);
		mModifierToTModifier__tModifier____target.setSrc(mModifierToTModifier);
		mModifierToTModifier__tModifier____target.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__tModifier____target);
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mModifier__mDefinition____bodyDeclaration);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		ruleresult.getTranslatedEdges().add(tMember__tModifier____tModifier);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mModifierToTModifier__mModifier____source.setName(mModifierToTModifier__mModifier____source_name_prime);
		mModifierToTModifier__tModifier____target.setName(mModifierToTModifier__tModifier____target_name_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		return new Object[] { ruleresult, mModifier, mModifierToTModifier, tModifier, mDefinition, tMember,
				mModifierToTModifier__mModifier____source, mModifierToTModifier__tModifier____target,
				mDefinition__mModifier____modifier, mModifier__mDefinition____bodyDeclaration,
				tMember__tModifier____tModifier };
	}

	public static final void pattern_MemberInAnnotationVisibility_11_5_registerobjects_expressionBBBBBBBBBBB(
			MemberInAnnotationVisibility _this, PerformRuleResult ruleresult, EObject mModifier,
			EObject mModifierToTModifier, EObject tAnnotation, EObject tModifier, EObject annotation,
			EObject mDefinition, EObject defToMember, EObject tMember, EObject mTypeToTType) {
		_this.registerObjects_BWD(ruleresult, mModifier, mModifierToTModifier, tAnnotation, tModifier, annotation,
				mDefinition, defToMember, tMember, mTypeToTType);

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
		EObject _localVariable_0 = match.getObject("tAnnotation");
		EObject _localVariable_1 = match.getObject("tModifier");
		EObject _localVariable_2 = match.getObject("tMember");
		EObject tmpTAnnotation = _localVariable_0;
		EObject tmpTModifier = _localVariable_1;
		EObject tmpTMember = _localVariable_2;
		if (tmpTAnnotation instanceof TAnnotationType) {
			TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
			if (tmpTModifier instanceof TModifier) {
				TModifier tModifier = (TModifier) tmpTModifier;
				if (tmpTMember instanceof TMember) {
					TMember tMember = (TMember) tmpTMember;
					return new Object[] { tAnnotation, tModifier, tMember, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInAnnotationVisibility_12_2_corematch_blackBBFFFBFB(
			TAnnotationType tAnnotation, TModifier tModifier, TMember tMember, Match match) {
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
						_result.add(new Object[] { tAnnotation, tModifier, annotation, mDefinition, defToMember,
								tMember, mTypeToTType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MemberInAnnotationVisibility_12_3_findcontext_blackBBBBBBB(
			TAnnotationType tAnnotation, TModifier tModifier, AnnotationTypeDeclaration annotation,
			MDefinition mDefinition, MDefinitionToTMember defToMember, TMember tMember,
			TypeToTAbstractType mTypeToTType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tAnnotation.getDefines().contains(tMember)) {
			if (annotation.getBodyDeclarations().contains(mDefinition)) {
				if (tModifier.equals(tMember.getTModifier())) {
					if (tMember.equals(defToMember.getTarget())) {
						if (mDefinition.equals(defToMember.getSource())) {
							if (annotation.equals(mTypeToTType.getSource())) {
								if (tAnnotation.equals(mTypeToTType.getTarget())) {
									_result.add(new Object[] { tAnnotation, tModifier, annotation, mDefinition,
											defToMember, tMember, mTypeToTType });
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
			TAnnotationType tAnnotation, TModifier tModifier, AnnotationTypeDeclaration annotation,
			MDefinition mDefinition, MDefinitionToTMember defToMember, TMember tMember,
			TypeToTAbstractType mTypeToTType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tAnnotation__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAnnotation____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__Annotation____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__Annotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tAnnotation__tMember____defines_name_prime = "defines";
		String tMember__tAnnotation____definedBy_name_prime = "definedBy";
		String annotation__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__Annotation____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		String defToMember__tMember____target_name_prime = "target";
		String defToMember__mDefinition____source_name_prime = "source";
		String mTypeToTType__Annotation____source_name_prime = "source";
		String mTypeToTType__tAnnotation____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tModifier);
		isApplicableMatch.getAllContextElements().add(annotation);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(defToMember);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		tAnnotation__tMember____defines.setSrc(tAnnotation);
		tAnnotation__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tMember____defines);
		tMember__tAnnotation____definedBy.setSrc(tMember);
		tMember__tAnnotation____definedBy.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tMember__tAnnotation____definedBy);
		annotation__mDefinition____bodyDeclarations.setSrc(annotation);
		annotation__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(annotation__mDefinition____bodyDeclarations);
		mDefinition__Annotation____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__Annotation____abstractTypeDeclaration.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(mDefinition__Annotation____abstractTypeDeclaration);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		isApplicableMatch.getAllContextElements().add(tMember__tModifier____tModifier);
		defToMember__tMember____target.setSrc(defToMember);
		defToMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(defToMember__tMember____target);
		defToMember__mDefinition____source.setSrc(defToMember);
		defToMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(defToMember__mDefinition____source);
		mTypeToTType__Annotation____source.setSrc(mTypeToTType);
		mTypeToTType__Annotation____source.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__Annotation____source);
		mTypeToTType__tAnnotation____target.setSrc(mTypeToTType);
		mTypeToTType__tAnnotation____target.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tAnnotation____target);
		tAnnotation__tMember____defines.setName(tAnnotation__tMember____defines_name_prime);
		tMember__tAnnotation____definedBy.setName(tMember__tAnnotation____definedBy_name_prime);
		annotation__mDefinition____bodyDeclarations.setName(annotation__mDefinition____bodyDeclarations_name_prime);
		mDefinition__Annotation____abstractTypeDeclaration
				.setName(mDefinition__Annotation____abstractTypeDeclaration_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		defToMember__tMember____target.setName(defToMember__tMember____target_name_prime);
		defToMember__mDefinition____source.setName(defToMember__mDefinition____source_name_prime);
		mTypeToTType__Annotation____source.setName(mTypeToTType__Annotation____source_name_prime);
		mTypeToTType__tAnnotation____target.setName(mTypeToTType__tAnnotation____target_name_prime);
		return new Object[] { tAnnotation, tModifier, annotation, mDefinition, defToMember, tMember, mTypeToTType,
				isApplicableMatch, tAnnotation__tMember____defines, tMember__tAnnotation____definedBy,
				annotation__mDefinition____bodyDeclarations, mDefinition__Annotation____abstractTypeDeclaration,
				tMember__tModifier____tModifier, defToMember__tMember____target, defToMember__mDefinition____source,
				mTypeToTType__Annotation____source, mTypeToTType__tAnnotation____target };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_4_solveCSP_bindingFBBBBBBBBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch, TAnnotationType tAnnotation,
			TModifier tModifier, AnnotationTypeDeclaration annotation, MDefinition mDefinition,
			MDefinitionToTMember defToMember, TMember tMember, TypeToTAbstractType mTypeToTType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tAnnotation, tModifier, annotation,
				mDefinition, defToMember, tMember, mTypeToTType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAnnotation, tModifier, annotation, mDefinition,
					defToMember, tMember, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch, TAnnotationType tAnnotation,
			TModifier tModifier, AnnotationTypeDeclaration annotation, MDefinition mDefinition,
			MDefinitionToTMember defToMember, TMember tMember, TypeToTAbstractType mTypeToTType) {
		Object[] result_pattern_MemberInAnnotationVisibility_12_4_solveCSP_binding = pattern_MemberInAnnotationVisibility_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tAnnotation, tModifier, annotation, mDefinition, defToMember, tMember,
				mTypeToTType);
		if (result_pattern_MemberInAnnotationVisibility_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_12_4_solveCSP_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_12_4_solveCSP_black = pattern_MemberInAnnotationVisibility_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MemberInAnnotationVisibility_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAnnotation, tModifier, annotation, mDefinition,
						defToMember, tMember, mTypeToTType };
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
		for (TAbstractType __DEC_tModifier_tModifier_120676 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tModifier, TAbstractType.class, "tModifier")) {
			if (!tAnnotation.equals(__DEC_tModifier_tModifier_120676)) {
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
								_result.add(new Object[] { tAnnotation, tModifier, tMember, _edge_tModifier });
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
			MemberInAnnotationVisibility _this, Match match, TAnnotationType tAnnotation, TModifier tModifier,
			TMember tMember) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAnnotation, tModifier, tMember);
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
						_result.add(new Object[] { mModifier, annotation, mDefinition, _edge_modifier });
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
			MemberInAnnotationVisibility _this, Match match, Modifier mModifier, AnnotationTypeDeclaration annotation,
			MDefinition mDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mModifier, annotation, mDefinition);
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
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mModifier");
		EObject _localVariable_1 = targetMatch.getObject("tAnnotation");
		EObject _localVariable_2 = targetMatch.getObject("tModifier");
		EObject _localVariable_3 = sourceMatch.getObject("Annotation");
		EObject _localVariable_4 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_5 = targetMatch.getObject("tMember");
		EObject tmpMModifier = _localVariable_0;
		EObject tmpTAnnotation = _localVariable_1;
		EObject tmpTModifier = _localVariable_2;
		EObject tmpAnnotation = _localVariable_3;
		EObject tmpMDefinition = _localVariable_4;
		EObject tmpTMember = _localVariable_5;
		if (tmpMModifier instanceof Modifier) {
			Modifier mModifier = (Modifier) tmpMModifier;
			if (tmpTAnnotation instanceof TAnnotationType) {
				TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
				if (tmpTModifier instanceof TModifier) {
					TModifier tModifier = (TModifier) tmpTModifier;
					if (tmpAnnotation instanceof AnnotationTypeDeclaration) {
						AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) tmpAnnotation;
						if (tmpMDefinition instanceof MDefinition) {
							MDefinition mDefinition = (MDefinition) tmpMDefinition;
							if (tmpTMember instanceof TMember) {
								TMember tMember = (TMember) tmpTMember;
								return new Object[] { mModifier, tAnnotation, tModifier, annotation, mDefinition,
										tMember, sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_blackBBBBBBBB(
			Modifier mModifier, TAnnotationType tAnnotation, TModifier tModifier, AnnotationTypeDeclaration annotation,
			MDefinition mDefinition, TMember tMember, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { mModifier, tAnnotation, tModifier, annotation, mDefinition, tMember, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding = pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding != null) {
			Modifier mModifier = (Modifier) result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding[0];
			TAnnotationType tAnnotation = (TAnnotationType) result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding[1];
			TModifier tModifier = (TModifier) result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding[2];
			AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding[3];
			MDefinition mDefinition = (MDefinition) result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding[4];
			TMember tMember = (TMember) result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_black = pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_blackBBBBBBBB(
					mModifier, tAnnotation, tModifier, annotation, mDefinition, tMember, sourceMatch, targetMatch);
			if (result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mModifier, tAnnotation, tModifier, annotation, mDefinition, tMember, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_3_solvecsp_bindingFBBBBBBBBB(
			MemberInAnnotationVisibility _this, Modifier mModifier, TAnnotationType tAnnotation, TModifier tModifier,
			AnnotationTypeDeclaration annotation, MDefinition mDefinition, TMember tMember, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(mModifier, tAnnotation, tModifier, annotation,
				mDefinition, tMember, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, mModifier, tAnnotation, tModifier, annotation, mDefinition, tMember,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			MemberInAnnotationVisibility _this, Modifier mModifier, TAnnotationType tAnnotation, TModifier tModifier,
			AnnotationTypeDeclaration annotation, MDefinition mDefinition, TMember tMember, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_MemberInAnnotationVisibility_24_3_solvecsp_binding = pattern_MemberInAnnotationVisibility_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, mModifier, tAnnotation, tModifier, annotation, mDefinition, tMember, sourceMatch, targetMatch);
		if (result_pattern_MemberInAnnotationVisibility_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_24_3_solvecsp_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_24_3_solvecsp_black = pattern_MemberInAnnotationVisibility_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MemberInAnnotationVisibility_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mModifier, tAnnotation, tModifier, annotation, mDefinition, tMember,
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

	public static final Iterable<Object[]> pattern_MemberInAnnotationVisibility_24_5_matchcorrcontext_blackBBBFBFBB(
			TAnnotationType tAnnotation, AnnotationTypeDeclaration annotation, MDefinition mDefinition, TMember tMember,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
				if (mDefinition.equals(defToMember.getSource())) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(annotation, TypeToTAbstractType.class, "source")) {
						if (tAnnotation.equals(mTypeToTType.getTarget())) {
							_result.add(new Object[] { tAnnotation, annotation, mDefinition, defToMember, tMember,
									mTypeToTType, sourceMatch, targetMatch });
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
			Modifier mModifier, TAnnotationType tAnnotation, TModifier tModifier, AnnotationTypeDeclaration annotation,
			MDefinition mDefinition, TMember tMember, CCMatch ccMatch) {
		return new Object[] { mModifier, tAnnotation, tModifier, annotation, mDefinition, tMember, ccMatch };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_6_createcorrespondence_greenBFBB(
			Modifier mModifier, TModifier tModifier, CCMatch ccMatch) {
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		mModifierToTModifier.setSource(mModifier);
		mModifierToTModifier.setTarget(tModifier);
		ccMatch.getCreateCorr().add(mModifierToTModifier);
		return new Object[] { mModifier, mModifierToTModifier, tModifier, ccMatch };
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

	public static final Object[] pattern_MemberInAnnotationVisibility_27_1_matchtggpattern_blackBBB(Modifier mModifier,
			AnnotationTypeDeclaration annotation, MDefinition mDefinition) {
		if (annotation.getBodyDeclarations().contains(mDefinition)) {
			if (mModifier.equals(mDefinition.getModifier())) {
				return new Object[] { mModifier, annotation, mDefinition };
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
		for (TAbstractType __DEC_tModifier_tModifier_922995 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tModifier, TAbstractType.class, "tModifier")) {
			if (!tAnnotation.equals(__DEC_tModifier_tModifier_922995)) {
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

	public static final Object[] pattern_MemberInAnnotationVisibility_28_1_matchtggpattern_blackBBB(
			TAnnotationType tAnnotation, TModifier tModifier, TMember tMember) {
		if (tAnnotation.getDefines().contains(tMember)) {
			if (tModifier.equals(tMember.getTModifier())) {
				if (pattern_MemberInAnnotationVisibility_28_1_matchtggpattern_black_nac_0BB(tModifier,
						tAnnotation) == null) {
					if (pattern_MemberInAnnotationVisibility_28_1_matchtggpattern_black_nac_1BB(tAnnotation,
							tModifier) == null) {
						return new Object[] { tAnnotation, tModifier, tMember };
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
			ModelgeneratorRuleResult ruleResult, TAnnotationType tAnnotation) {
		if (ruleResult.getTargetObjects().contains(tAnnotation)) {
			return new Object[] { ruleResult, tAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TMember tMember) {
		if (ruleResult.getTargetObjects().contains(tMember)) {
			return new Object[] { ruleResult, tMember };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember defToMember) {
		if (ruleResult.getCorrObjects().contains(defToMember)) {
			return new Object[] { ruleResult, defToMember };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mDefinition) {
		if (ruleResult.getSourceObjects().contains(mDefinition)) {
			return new Object[] { ruleResult, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, AnnotationTypeDeclaration annotation) {
		if (ruleResult.getSourceObjects().contains(annotation)) {
			return new Object[] { ruleResult, annotation };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
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
									if (pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, defToMember) == null) {
										if (pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, tMember) == null) {
											if (pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_3BB(
													ruleResult, mDefinition) == null) {
												if (pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_0BB(
														ruleResult, tAnnotation) == null) {
													if (pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_4BB(
															ruleResult, annotation) == null) {
														for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(tAnnotation,
																		TypeToTAbstractType.class, "target")) {
															if (annotation.equals(mTypeToTType.getSource())) {
																if (pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_5BB(
																		ruleResult, mTypeToTType) == null) {
																	_result.add(new Object[] { defToMemberList,
																			tAnnotation, tMember, defToMember,
																			mDefinition, annotation, mTypeToTType,
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
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch, TAnnotationType tAnnotation,
			AnnotationTypeDeclaration annotation, MDefinition mDefinition, MDefinitionToTMember defToMember,
			TMember tMember, TypeToTAbstractType mTypeToTType, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tAnnotation, annotation, mDefinition,
				defToMember, tMember, mTypeToTType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAnnotation, annotation, mDefinition, defToMember,
					tMember, mTypeToTType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch, TAnnotationType tAnnotation,
			AnnotationTypeDeclaration annotation, MDefinition mDefinition, MDefinitionToTMember defToMember,
			TMember tMember, TypeToTAbstractType mTypeToTType, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MemberInAnnotationVisibility_29_3_solveCSP_binding = pattern_MemberInAnnotationVisibility_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tAnnotation, annotation, mDefinition, defToMember, tMember, mTypeToTType,
				ruleResult);
		if (result_pattern_MemberInAnnotationVisibility_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_29_3_solveCSP_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_29_3_solveCSP_black = pattern_MemberInAnnotationVisibility_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MemberInAnnotationVisibility_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAnnotation, annotation, mDefinition, defToMember,
						tMember, mTypeToTType, ruleResult };
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

	public static final Object[] pattern_MemberInAnnotationVisibility_29_5_checknacs_blackBBBBBB(
			TAnnotationType tAnnotation, AnnotationTypeDeclaration annotation, MDefinition mDefinition,
			MDefinitionToTMember defToMember, TMember tMember, TypeToTAbstractType mTypeToTType) {
		return new Object[] { tAnnotation, annotation, mDefinition, defToMember, tMember, mTypeToTType };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_6_perform_blackBBBBBBB(
			TAnnotationType tAnnotation, AnnotationTypeDeclaration annotation, MDefinition mDefinition,
			MDefinitionToTMember defToMember, TMember tMember, TypeToTAbstractType mTypeToTType,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tAnnotation, annotation, mDefinition, defToMember, tMember, mTypeToTType, ruleResult };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_6_perform_greenFFFBBBB(MDefinition mDefinition,
			TMember tMember, ModelgeneratorRuleResult ruleResult, CSP csp) {
		Modifier mModifier = JavaFactory.eINSTANCE.createModifier();
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		TModifier tModifier = BasicFactory.eINSTANCE.createTModifier();
		Object _localVariable_0 = csp.getValue("mModifier", "visibility");
		Object _localVariable_1 = csp.getValue("mModifier", "static");
		Object _localVariable_2 = csp.getValue("tModifier", "tVisibility");
		Object _localVariable_3 = csp.getValue("tModifier", "isStatic");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		mDefinition.setModifier(mModifier);
		ruleResult.getSourceObjects().add(mModifier);
		mModifierToTModifier.setSource(mModifier);
		ruleResult.getCorrObjects().add(mModifierToTModifier);
		mModifierToTModifier.setTarget(tModifier);
		tMember.setTModifier(tModifier);
		ruleResult.getTargetObjects().add(tModifier);
		VisibilityKind mModifier_visibility_prime = (VisibilityKind) _localVariable_0;
		boolean mModifier_static_prime = (boolean) _localVariable_1;
		TVisibility tModifier_tVisibility_prime = (TVisibility) _localVariable_2;
		boolean tModifier_isStatic_prime = (boolean) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		mModifier.setVisibility(mModifier_visibility_prime);
		mModifier.setStatic(Boolean.valueOf(mModifier_static_prime));
		tModifier.setTVisibility(tModifier_tVisibility_prime);
		tModifier.setIsStatic(Boolean.valueOf(tModifier_isStatic_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mModifier, mModifierToTModifier, tModifier, mDefinition, tMember, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_MemberInAnnotationVisibility_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MemberInAnnotationVisibilityImpl
