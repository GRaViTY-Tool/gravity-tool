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
import org.eclipse.modisco.java.AnnotationTypeDeclaration;
import org.eclipse.modisco.java.AnnotationTypeMemberDeclaration;
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeLiteral;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.AnnotationTypeMember;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TModule;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TypeGraph;

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
 * An implementation of the model object '<em><b>Annotation Type Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnnotationTypeMemberImpl extends AbstractRuleImpl implements AnnotationTypeMember {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationTypeMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnnotationTypeMember();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, TypeAccess access, AnnotationTypeDeclaration mAnnotation, Type mType,
			AnnotationTypeMemberDeclaration mMember) {

		Object[] result1_black = AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_0_1_initialbindings_blackBBBBBB(
				this, match, access, mAnnotation, mType, mMember);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[access] = " + access + ", " + "[mAnnotation] = " + mAnnotation
					+ ", " + "[mType] = " + mType + ", " + "[mMember] = " + mMember + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, access, mAnnotation,
						mType, mMember);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[access] = " + access + ", " + "[mAnnotation] = " + mAnnotation
					+ ", " + "[mType] = " + mType + ", " + "[mMember] = " + mMember + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_0_4_collectelementstobetranslated_blackBBBBB(match, access,
							mAnnotation, mType, mMember);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[access] = " + access + ", " + "[mAnnotation] = " + mAnnotation + ", " + "[mType] = " + mType
						+ ", " + "[mMember] = " + mMember + ".");
			}
			AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_0_4_collectelementstobetranslated_greenBBBBBFFFFF(
					match, access, mAnnotation, mType, mMember);
			//nothing EMoflonEdge mAnnotation__mMember____bodyDeclarations = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge access__mType____type = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge mType__access____usagesInTypeAccess = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge mMember__access____type = (EMoflonEdge) result4_green[9];

			Object[] result5_black = AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_0_5_collectcontextelements_blackBBBBB(match, access, mAnnotation,
							mType, mMember);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[access] = " + access + ", " + "[mAnnotation] = " + mAnnotation + ", " + "[mType] = " + mType
						+ ", " + "[mMember] = " + mMember + ".");
			}
			AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_0_5_collectcontextelements_greenBBB(match,
					mAnnotation, mType);

			// 
			AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_0_6_registerobjectstomatch_expressionBBBBBB(this,
					match, access, mAnnotation, mType, mMember);
			return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_0_7_expressionF();
		} else {
			return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeAccess access = (TypeAccess) result1_bindingAndBlack[0];
		TypeGraph pm = (TypeGraph) result1_bindingAndBlack[1];
		TAnnotationType tAnnotation = (TAnnotationType) result1_bindingAndBlack[2];
		AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result1_bindingAndBlack[3];
		TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result1_bindingAndBlack[4];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[5];
		Type mType = (Type) result1_bindingAndBlack[6];
		TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result1_bindingAndBlack[7];
		AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_1_1_performtransformation_greenBBFFBFFFBB(pm, tAnnotation, tType, mMember,
						csp);
		ASTNodeToTAnnotatable anntotatableToTannotatable = (ASTNodeToTAnnotatable) result1_green[2];
		MDefinitionToTMember memberToMember = (MDefinitionToTMember) result1_green[3];
		TFieldSignature tSignature = (TFieldSignature) result1_green[5];
		TFieldDefinition tMember = (TFieldDefinition) result1_green[6];
		TField tName = (TField) result1_green[7];

		Object[] result2_black = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_1_2_collecttranslatedelements_blackBBBBBBB(access,
						anntotatableToTannotatable, memberToMember, tSignature, tMember, tName, mMember);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[access] = " + access + ", "
					+ "[anntotatableToTannotatable] = " + anntotatableToTannotatable + ", " + "[memberToMember] = "
					+ memberToMember + ", " + "[tSignature] = " + tSignature + ", " + "[tMember] = " + tMember + ", "
					+ "[tName] = " + tName + ", " + "[mMember] = " + mMember + ".");
		}
		Object[] result2_green = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_1_2_collecttranslatedelements_greenFBBBBBBB(access,
						anntotatableToTannotatable, memberToMember, tSignature, tMember, tName, mMember);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(ruleresult, access, pm,
						tAnnotation, mAnnotation, anntotatableToTannotatable, mTypeToType, memberToMember, tType,
						tSignature, mType, mAnnotationToAnnotation, tMember, tName, mMember);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[access] = " + access + ", " + "[pm] = " + pm + ", " + "[tAnnotation] = " + tAnnotation
					+ ", " + "[mAnnotation] = " + mAnnotation + ", " + "[anntotatableToTannotatable] = "
					+ anntotatableToTannotatable + ", " + "[mTypeToType] = " + mTypeToType + ", "
					+ "[memberToMember] = " + memberToMember + ", " + "[tType] = " + tType + ", " + "[tSignature] = "
					+ tSignature + ", " + "[mType] = " + mType + ", " + "[mAnnotationToAnnotation] = "
					+ mAnnotationToAnnotation + ", " + "[tMember] = " + tMember + ", " + "[tName] = " + tName + ", "
					+ "[mMember] = " + mMember + ".");
		}
		AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(ruleresult,
						access, pm, tAnnotation, mAnnotation, anntotatableToTannotatable, memberToMember, tType,
						tSignature, mType, tMember, tName, mMember);
		//nothing EMoflonEdge mAnnotation__mMember____bodyDeclarations = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge access__mType____type = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mType__access____usagesInTypeAccess = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tAnnotation__tMember____defines = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tMember__tAnnotation____definedBy = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tSignature__tMember____definitions = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge tMember__tSignature____signature = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge tSignature__tType____type = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge tAnnotation__tSignature____signature = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge memberToMember__tMember____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge anntotatableToTannotatable__tMember____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge tName__pm____model = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge pm__tName____fields = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge mMember__access____type = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge anntotatableToTannotatable__mMember____source = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge memberToMember__mMember____source = (EMoflonEdge) result3_green[31];

		// 
		// 
		AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_1_5_registerobjects_expressionBBBBBBBBBBBBBBBB(this,
				ruleresult, access, pm, tAnnotation, mAnnotation, anntotatableToTannotatable, mTypeToType,
				memberToMember, tType, tSignature, mType, mAnnotationToAnnotation, tMember, tName, mMember);
		return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeAccess access = (TypeAccess) result2_binding[0];
		AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result2_binding[1];
		Type mType = (Type) result2_binding[2];
		AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result2_binding[3];
		for (Object[] result2_black : AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_2_2_corematch_blackBFBFFBFBB(access, mAnnotation, mType, mMember,
						match)) {
			TAnnotationType tAnnotation = (TAnnotationType) result2_black[1];
			TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result2_black[3];
			TAbstractType tType = (TAbstractType) result2_black[4];
			TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result2_black[6];
			// ForEach 
			for (Object[] result3_black : AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_2_3_findcontext_blackBFBBBBBBB(access, tAnnotation, mAnnotation,
							mTypeToType, tType, mType, mAnnotationToAnnotation, mMember)) {
				TypeGraph pm = (TypeGraph) result3_black[1];
				Object[] result3_green = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFF(access, pm,
								tAnnotation, mAnnotation, mTypeToType, tType, mType, mAnnotationToAnnotation, mMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge mAnnotation__mMember____bodyDeclarations = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge access__mType____type = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mType__access____usagesInTypeAccess = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mTypeToType__tType____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mAnnotationToAnnotation__mAnnotation____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mAnnotationToAnnotation__tAnnotation____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mTypeToType__mType____source = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge tAnnotation__pm____model = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge pm__tAnnotation____allTypes = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge mMember__access____type = (EMoflonEdge) result3_green[20];

				Object[] result4_bindingAndBlack = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch,
								access, pm, tAnnotation, mAnnotation, mTypeToType, tType, mType,
								mAnnotationToAnnotation, mMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[access] = " + access + ", "
							+ "[pm] = " + pm + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[mAnnotation] = "
							+ mAnnotation + ", " + "[mTypeToType] = " + mTypeToType + ", " + "[tType] = " + tType + ", "
							+ "[mType] = " + mType + ", " + "[mAnnotationToAnnotation] = " + mAnnotationToAnnotation
							+ ", " + "[mMember] = " + mMember + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationTypeMemberImpl
							.pattern_AnnotationTypeMember_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, TypeAccess access, AnnotationTypeDeclaration mAnnotation,
			Type mType, AnnotationTypeMemberDeclaration mMember) {
		match.registerObject("access", access);
		match.registerObject("mAnnotation", mAnnotation);
		match.registerObject("mType", mType);
		match.registerObject("mMember", mMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, TypeAccess access, AnnotationTypeDeclaration mAnnotation,
			Type mType, AnnotationTypeMemberDeclaration mMember) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TypeAccess access, TypeGraph pm,
			TAnnotationType tAnnotation, AnnotationTypeDeclaration mAnnotation, TypeToTAbstractType mTypeToType,
			TAbstractType tType, Type mType, TypeToTAbstractType mAnnotationToAnnotation,
			AnnotationTypeMemberDeclaration mMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mMember_name = CSPFactoryHelper.eINSTANCE.createVariable("mMember.name", true, csp);
		var_mMember_name.setValue(mMember.getName());
		var_mMember_name.setType("String");

		// Create unbound variables
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", csp);
		var_tName_tName.setType("String");
		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.upperBound", csp);
		var_tSignature_upperBound.setType("int");

		// Create constraints
		Eq eq = new Eq();
		UpperBound upperBound = new UpperBound();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(upperBound);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mMember_name, var_tName_tName);
		upperBound.setRuleName("NoRuleName");
		upperBound.solve(var_mMember_name, var_tSignature_upperBound);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("access", access);
		isApplicableMatch.registerObject("pm", pm);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("mAnnotation", mAnnotation);
		isApplicableMatch.registerObject("mTypeToType", mTypeToType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mAnnotationToAnnotation", mAnnotationToAnnotation);
		isApplicableMatch.registerObject("mMember", mMember);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject access, EObject pm, EObject tAnnotation,
			EObject mAnnotation, EObject anntotatableToTannotatable, EObject mTypeToType, EObject memberToMember,
			EObject tType, EObject tSignature, EObject mType, EObject mAnnotationToAnnotation, EObject tMember,
			EObject tName, EObject mMember) {
		ruleresult.registerObject("access", access);
		ruleresult.registerObject("pm", pm);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("mAnnotation", mAnnotation);
		ruleresult.registerObject("anntotatableToTannotatable", anntotatableToTannotatable);
		ruleresult.registerObject("mTypeToType", mTypeToType);
		ruleresult.registerObject("memberToMember", memberToMember);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("mAnnotationToAnnotation", mAnnotationToAnnotation);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mMember", mMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("access").eClass()).equals("java.TypeAccess.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mMember").eClass())
						.equals("java.AnnotationTypeMemberDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TypeGraph pm, TAnnotationType tAnnotation, TAbstractType tType,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName) {

		Object[] result1_black = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_10_1_initialbindings_blackBBBBBBBB(this, match, pm, tAnnotation, tType,
						tSignature, tMember, tName);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pm] = " + pm + ", " + "[tAnnotation] = " + tAnnotation + ", "
					+ "[tType] = " + tType + ", " + "[tSignature] = " + tSignature + ", " + "[tMember] = " + tMember
					+ ", " + "[tName] = " + tName + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_10_2_SolveCSP_bindingAndBlackFBBBBBBBB(this, match, pm, tAnnotation,
						tType, tSignature, tMember, tName);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pm] = " + pm + ", " + "[tAnnotation] = " + tAnnotation + ", "
					+ "[tType] = " + tType + ", " + "[tSignature] = " + tSignature + ", " + "[tMember] = " + tMember
					+ ", " + "[tName] = " + tName + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_10_4_collectelementstobetranslated_blackBBBBBBB(match, pm,
							tAnnotation, tType, tSignature, tMember, tName);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[pm] = " + pm + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tType] = " + tType + ", "
						+ "[tSignature] = " + tSignature + ", " + "[tMember] = " + tMember + ", " + "[tName] = " + tName
						+ ".");
			}
			AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_10_4_collectelementstobetranslated_greenBBBBBBBFFFFFFFFFF(match, pm,
							tAnnotation, tType, tSignature, tMember, tName);
			//nothing EMoflonEdge tAnnotation__tMember____defines = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tMember__tAnnotation____definedBy = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge tSignature__tMember____definitions = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge tMember__tSignature____signature = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge tSignature__tType____type = (EMoflonEdge) result4_green[11];
			//nothing EMoflonEdge tAnnotation__tSignature____signature = (EMoflonEdge) result4_green[12];
			//nothing EMoflonEdge tName__pm____model = (EMoflonEdge) result4_green[13];
			//nothing EMoflonEdge pm__tName____fields = (EMoflonEdge) result4_green[14];
			//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result4_green[15];
			//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result4_green[16];

			Object[] result5_black = AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_10_5_collectcontextelements_blackBBBBBBB(match, pm, tAnnotation,
							tType, tSignature, tMember, tName);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[pm] = " + pm + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tType] = " + tType + ", "
						+ "[tSignature] = " + tSignature + ", " + "[tMember] = " + tMember + ", " + "[tName] = " + tName
						+ ".");
			}
			AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_10_5_collectcontextelements_greenBBBBFF(match, pm,
					tAnnotation, tType);
			//nothing EMoflonEdge tAnnotation__pm____model = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge pm__tAnnotation____allTypes = (EMoflonEdge) result5_green[5];

			// 
			AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_10_6_registerobjectstomatch_expressionBBBBBBBB(this,
					match, pm, tAnnotation, tType, tSignature, tMember, tName);
			return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_10_7_expressionF();
		} else {
			return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeGraph pm = (TypeGraph) result1_bindingAndBlack[0];
		TAnnotationType tAnnotation = (TAnnotationType) result1_bindingAndBlack[1];
		AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result1_bindingAndBlack[2];
		TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result1_bindingAndBlack[3];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[4];
		TFieldSignature tSignature = (TFieldSignature) result1_bindingAndBlack[5];
		Type mType = (Type) result1_bindingAndBlack[6];
		TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result1_bindingAndBlack[7];
		TFieldDefinition tMember = (TFieldDefinition) result1_bindingAndBlack[8];
		TField tName = (TField) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_11_1_performtransformation_greenFBFFBBFB(mAnnotation, mType, tMember,
						csp);
		TypeAccess access = (TypeAccess) result1_green[0];
		ASTNodeToTAnnotatable anntotatableToTannotatable = (ASTNodeToTAnnotatable) result1_green[2];
		MDefinitionToTMember memberToMember = (MDefinitionToTMember) result1_green[3];
		AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result1_green[6];

		Object[] result2_black = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_11_2_collecttranslatedelements_blackBBBBBBB(access,
						anntotatableToTannotatable, memberToMember, tSignature, tMember, tName, mMember);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[access] = " + access + ", "
					+ "[anntotatableToTannotatable] = " + anntotatableToTannotatable + ", " + "[memberToMember] = "
					+ memberToMember + ", " + "[tSignature] = " + tSignature + ", " + "[tMember] = " + tMember + ", "
					+ "[tName] = " + tName + ", " + "[mMember] = " + mMember + ".");
		}
		Object[] result2_green = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_11_2_collecttranslatedelements_greenFBBBBBBB(access,
						anntotatableToTannotatable, memberToMember, tSignature, tMember, tName, mMember);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(ruleresult, access, pm,
						tAnnotation, mAnnotation, anntotatableToTannotatable, mTypeToType, memberToMember, tType,
						tSignature, mType, mAnnotationToAnnotation, tMember, tName, mMember);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[access] = " + access + ", " + "[pm] = " + pm + ", " + "[tAnnotation] = " + tAnnotation
					+ ", " + "[mAnnotation] = " + mAnnotation + ", " + "[anntotatableToTannotatable] = "
					+ anntotatableToTannotatable + ", " + "[mTypeToType] = " + mTypeToType + ", "
					+ "[memberToMember] = " + memberToMember + ", " + "[tType] = " + tType + ", " + "[tSignature] = "
					+ tSignature + ", " + "[mType] = " + mType + ", " + "[mAnnotationToAnnotation] = "
					+ mAnnotationToAnnotation + ", " + "[tMember] = " + tMember + ", " + "[tName] = " + tName + ", "
					+ "[mMember] = " + mMember + ".");
		}
		AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(ruleresult,
						access, pm, tAnnotation, mAnnotation, anntotatableToTannotatable, memberToMember, tType,
						tSignature, mType, tMember, tName, mMember);
		//nothing EMoflonEdge mAnnotation__mMember____bodyDeclarations = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge access__mType____type = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mType__access____usagesInTypeAccess = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tAnnotation__tMember____defines = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tMember__tAnnotation____definedBy = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tSignature__tMember____definitions = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge tMember__tSignature____signature = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge tSignature__tType____type = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge tAnnotation__tSignature____signature = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge memberToMember__tMember____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge anntotatableToTannotatable__tMember____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge tName__pm____model = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge pm__tName____fields = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge mMember__access____type = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge anntotatableToTannotatable__mMember____source = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge memberToMember__mMember____source = (EMoflonEdge) result3_green[31];

		// 
		// 
		AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_11_5_registerobjects_expressionBBBBBBBBBBBBBBBB(this,
				ruleresult, access, pm, tAnnotation, mAnnotation, anntotatableToTannotatable, mTypeToType,
				memberToMember, tType, tSignature, mType, mAnnotationToAnnotation, tMember, tName, mMember);
		return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_12_2_corematch_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeGraph pm = (TypeGraph) result2_binding[0];
		TAnnotationType tAnnotation = (TAnnotationType) result2_binding[1];
		TAbstractType tType = (TAbstractType) result2_binding[2];
		TFieldSignature tSignature = (TFieldSignature) result2_binding[3];
		TFieldDefinition tMember = (TFieldDefinition) result2_binding[4];
		TField tName = (TField) result2_binding[5];
		for (Object[] result2_black : AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_12_2_corematch_blackBBFFBBFFBBB(pm, tAnnotation, tType, tSignature,
						tMember, tName, match)) {
			AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result2_black[2];
			TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result2_black[3];
			Type mType = (Type) result2_black[6];
			TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result2_black[7];
			// ForEach 
			for (Object[] result3_black : AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_12_3_findcontext_blackBBBBBBBBBB(pm, tAnnotation, mAnnotation,
							mTypeToType, tType, tSignature, mType, mAnnotationToAnnotation, tMember, tName)) {
				Object[] result3_green = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_12_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFFFF(pm, tAnnotation,
								mAnnotation, mTypeToType, tType, tSignature, mType, mAnnotationToAnnotation, tMember,
								tName);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				//nothing EMoflonEdge tAnnotation__tMember____defines = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tMember__tAnnotation____definedBy = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tSignature__tMember____definitions = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tMember__tSignature____signature = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tSignature__tType____type = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tAnnotation__tSignature____signature = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mTypeToType__tType____target = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mAnnotationToAnnotation__mAnnotation____source = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mAnnotationToAnnotation__tAnnotation____target = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge mTypeToType__mType____source = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge tAnnotation__pm____model = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge pm__tAnnotation____allTypes = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge tName__pm____model = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge pm__tName____fields = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[25];
				//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result3_green[26];

				Object[] result4_bindingAndBlack = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this,
								isApplicableMatch, pm, tAnnotation, mAnnotation, mTypeToType, tType, tSignature, mType,
								mAnnotationToAnnotation, tMember, tName);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[pm] = " + pm + ", "
							+ "[tAnnotation] = " + tAnnotation + ", " + "[mAnnotation] = " + mAnnotation + ", "
							+ "[mTypeToType] = " + mTypeToType + ", " + "[tType] = " + tType + ", " + "[tSignature] = "
							+ tSignature + ", " + "[mType] = " + mType + ", " + "[mAnnotationToAnnotation] = "
							+ mAnnotationToAnnotation + ", " + "[tMember] = " + tMember + ", " + "[tName] = " + tName
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationTypeMemberImpl
							.pattern_AnnotationTypeMember_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TypeGraph pm, TAnnotationType tAnnotation, TAbstractType tType,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName) {
		match.registerObject("pm", pm);
		match.registerObject("tAnnotation", tAnnotation);
		match.registerObject("tType", tType);
		match.registerObject("tSignature", tSignature);
		match.registerObject("tMember", tMember);
		match.registerObject("tName", tName);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph pm, TAnnotationType tAnnotation, TAbstractType tType,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeGraph pm, TAnnotationType tAnnotation,
			AnnotationTypeDeclaration mAnnotation, TypeToTAbstractType mTypeToType, TAbstractType tType,
			TFieldSignature tSignature, Type mType, TypeToTAbstractType mAnnotationToAnnotation,
			TFieldDefinition tMember, TField tName) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", true, csp);
		var_tName_tName.setValue(tName.getTName());
		var_tName_tName.setType("String");
		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.upperBound", true,
				csp);
		var_tSignature_upperBound.setValue(tSignature.getUpperBound());
		var_tSignature_upperBound.setType("int");

		// Create unbound variables
		Variable var_mMember_name = CSPFactoryHelper.eINSTANCE.createVariable("mMember.name", csp);
		var_mMember_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		UpperBound upperBound = new UpperBound();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(upperBound);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mMember_name, var_tName_tName);
		upperBound.setRuleName("NoRuleName");
		upperBound.solve(var_mMember_name, var_tSignature_upperBound);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("pm", pm);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("mAnnotation", mAnnotation);
		isApplicableMatch.registerObject("mTypeToType", mTypeToType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mAnnotationToAnnotation", mAnnotationToAnnotation);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("tName", tName);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject access, EObject pm, EObject tAnnotation,
			EObject mAnnotation, EObject anntotatableToTannotatable, EObject mTypeToType, EObject memberToMember,
			EObject tType, EObject tSignature, EObject mType, EObject mAnnotationToAnnotation, EObject tMember,
			EObject tName, EObject mMember) {
		ruleresult.registerObject("access", access);
		ruleresult.registerObject("pm", pm);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("mAnnotation", mAnnotation);
		ruleresult.registerObject("anntotatableToTannotatable", anntotatableToTannotatable);
		ruleresult.registerObject("mTypeToType", mTypeToType);
		ruleresult.registerObject("memberToMember", memberToMember);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("mAnnotationToAnnotation", mAnnotationToAnnotation);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mMember", mMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tSignature").eClass())
						.equals("basic.TFieldSignature.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tMember").eClass())
						.equals("basic.TFieldDefinition.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tName").eClass()).equals("basic.TField.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_63(EMoflonEdge _edge_defines) {

		Object[] result1_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_20_2_testcorematchandDECs_blackFFFFFFB(_edge_defines)) {
			TypeGraph pm = (TypeGraph) result2_black[0];
			TAnnotationType tAnnotation = (TAnnotationType) result2_black[1];
			TAbstractType tType = (TAbstractType) result2_black[2];
			TFieldSignature tSignature = (TFieldSignature) result2_black[3];
			TFieldDefinition tMember = (TFieldDefinition) result2_black[4];
			TField tName = (TField) result2_black[5];
			Object[] result2_green = AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
							this, match, pm, tAnnotation, tType, tSignature, tMember, tName)) {
				// 
				if (AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationTypeMemberImpl
							.pattern_AnnotationTypeMember_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_66(EMoflonEdge _edge_bodyDeclarations) {

		Object[] result1_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_21_2_testcorematchandDECs_blackFFFFB(_edge_bodyDeclarations)) {
			TypeAccess access = (TypeAccess) result2_black[0];
			AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result2_black[1];
			Type mType = (Type) result2_black[2];
			AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result2_black[3];
			Object[] result2_green = AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, access, mAnnotation, mType, mMember)) {
				// 
				if (AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationTypeMemberImpl
							.pattern_AnnotationTypeMember_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnnotationTypeMember");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tSignature", "lowerBound", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_mMember_name = CSPFactoryHelper.eINSTANCE.createVariable("mMember", true, csp);
		var_mMember_name.setValue(__helper.getValue("mMember", "name"));
		var_mMember_name.setType("String");

		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName", true, csp);
		var_tName_tName.setValue(__helper.getValue("tName", "tName"));
		var_tName_tName.setType("String");

		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature", true, csp);
		var_tSignature_upperBound.setValue(__helper.getValue("tSignature", "upperBound"));
		var_tSignature_upperBound.setType("int");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		UpperBound upperBound1 = new UpperBound();
		csp.getConstraints().add(upperBound1);

		eq0.setRuleName("AnnotationTypeMember");
		eq0.solve(var_mMember_name, var_tName_tName);

		upperBound1.setRuleName("AnnotationTypeMember");
		upperBound1.solve(var_mMember_name, var_tSignature_upperBound);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tName_tName.setBound(false);
			var_tSignature_upperBound.setBound(false);
			eq0.solve(var_mMember_name, var_tName_tName);
			upperBound1.solve(var_mMember_name, var_tSignature_upperBound);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tName", "tName", var_tName_tName.getValue());
				__helper.setValue("tSignature", "upperBound", var_tSignature_upperBound.getValue());
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
		ruleResult.setRule("AnnotationTypeMember");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tSignature", "lowerBound", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_mMember_name = CSPFactoryHelper.eINSTANCE.createVariable("mMember", true, csp);
		var_mMember_name.setValue(__helper.getValue("mMember", "name"));
		var_mMember_name.setType("String");

		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName", true, csp);
		var_tName_tName.setValue(__helper.getValue("tName", "tName"));
		var_tName_tName.setType("String");

		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature", true, csp);
		var_tSignature_upperBound.setValue(__helper.getValue("tSignature", "upperBound"));
		var_tSignature_upperBound.setType("int");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		UpperBound upperBound1 = new UpperBound();
		csp.getConstraints().add(upperBound1);

		eq0.setRuleName("AnnotationTypeMember");
		eq0.solve(var_mMember_name, var_tName_tName);

		upperBound1.setRuleName("AnnotationTypeMember");
		upperBound1.solve(var_mMember_name, var_tSignature_upperBound);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mMember_name.setBound(false);
			var_mMember_name.setBound(false);
			eq0.solve(var_mMember_name, var_tName_tName);
			upperBound1.solve(var_mMember_name, var_tSignature_upperBound);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mMember", "name", var_mMember_name.getValue());
				__helper.setValue("mMember", "name", var_mMember_name.getValue());
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

		Object[] result1_black = AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TypeAccess access = (TypeAccess) result2_bindingAndBlack[0];
		TypeGraph pm = (TypeGraph) result2_bindingAndBlack[1];
		TAnnotationType tAnnotation = (TAnnotationType) result2_bindingAndBlack[2];
		AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result2_bindingAndBlack[3];
		TAbstractType tType = (TAbstractType) result2_bindingAndBlack[4];
		TFieldSignature tSignature = (TFieldSignature) result2_bindingAndBlack[5];
		Type mType = (Type) result2_bindingAndBlack[6];
		TFieldDefinition tMember = (TFieldDefinition) result2_bindingAndBlack[7];
		TField tName = (TField) result2_bindingAndBlack[8];
		AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, access, pm, tAnnotation,
						mAnnotation, tType, tSignature, mType, tMember, tName, mMember, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[access] = " + access + ", " + "[pm] = " + pm + ", " + "[tAnnotation] = " + tAnnotation + ", "
					+ "[mAnnotation] = " + mAnnotation + ", " + "[tType] = " + tType + ", " + "[tSignature] = "
					+ tSignature + ", " + "[mType] = " + mType + ", " + "[tMember] = " + tMember + ", " + "[tName] = "
					+ tName + ", " + "[mMember] = " + mMember + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_24_5_matchcorrcontext_blackBBFBBFBB(tAnnotation, mAnnotation, tType,
							mType, sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result5_black[2];
				TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result5_black[5];
				Object[] result5_green = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_24_5_matchcorrcontext_greenBBBBF(mTypeToType,
								mAnnotationToAnnotation, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_24_6_createcorrespondence_blackBBBBBBBBBBB(access, pm,
								tAnnotation, mAnnotation, tType, tSignature, mType, tMember, tName, mMember, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[access] = " + access + ", " + "[pm] = " + pm
									+ ", " + "[tAnnotation] = " + tAnnotation + ", " + "[mAnnotation] = " + mAnnotation
									+ ", " + "[tType] = " + tType + ", " + "[tSignature] = " + tSignature + ", "
									+ "[mType] = " + mType + ", " + "[tMember] = " + tMember + ", " + "[tName] = "
									+ tName + ", " + "[mMember] = " + mMember + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_24_6_createcorrespondence_greenFFBBB(tMember,
						mMember, ccMatch);
				//nothing ASTNodeToTAnnotatable anntotatableToTannotatable = (ASTNodeToTAnnotatable) result6_green[0];
				//nothing MDefinitionToTMember memberToMember = (MDefinitionToTMember) result6_green[1];

				Object[] result7_black = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TypeAccess access, TypeGraph pm, TAnnotationType tAnnotation,
			AnnotationTypeDeclaration mAnnotation, TAbstractType tType, TFieldSignature tSignature, Type mType,
			TFieldDefinition tMember, TField tName, AnnotationTypeMemberDeclaration mMember, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mMember_name = CSPFactoryHelper.eINSTANCE.createVariable("mMember.name", true, csp);
		var_mMember_name.setValue(mMember.getName());
		var_mMember_name.setType("String");
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", true, csp);
		var_tName_tName.setValue(tName.getTName());
		var_tName_tName.setType("String");
		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.upperBound", true,
				csp);
		var_tSignature_upperBound.setValue(tSignature.getUpperBound());
		var_tSignature_upperBound.setType("int");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		UpperBound upperBound = new UpperBound();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(upperBound);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mMember_name, var_tName_tName);
		upperBound.setRuleName("NoRuleName");
		upperBound.solve(var_mMember_name, var_tSignature_upperBound);
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
	public boolean checkDEC_FWD(TypeAccess access, AnnotationTypeDeclaration mAnnotation, Type mType,
			AnnotationTypeMemberDeclaration mMember) {// 
		Object[] result1_black = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_27_1_matchtggpattern_blackBBBB(access, mAnnotation, mType, mMember);
		if (result1_black != null) {
			return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_27_2_expressionF();
		} else {
			return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TypeGraph pm, TAnnotationType tAnnotation, TAbstractType tType,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName) {// 
		Object[] result1_black = AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_28_1_matchtggpattern_blackBBBBBB(
				pm, tAnnotation, tType, tSignature, tMember, tName);
		if (result1_black != null) {
			AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_28_1_matchtggpattern_greenB(tSignature);

			return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_28_2_expressionF();
		} else {
			return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mAnnotationToAnnotationParameter, TypeToTAbstractType mTypeToTypeParameter) {

		Object[] result1_black = AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_29_2_isapplicablecore_blackFFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mAnnotationToAnnotationList = (RuleEntryList) result2_black[0];
			TypeGraph pm = (TypeGraph) result2_black[1];
			TAnnotationType tAnnotation = (TAnnotationType) result2_black[2];
			TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result2_black[3];
			AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result2_black[4];
			//nothing RuleEntryList mTypeToTypeList = (RuleEntryList) result2_black[5];
			TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result2_black[6];
			TAbstractType tType = (TAbstractType) result2_black[7];
			Type mType = (Type) result2_black[8];

			Object[] result3_bindingAndBlack = AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch, pm,
							tAnnotation, mAnnotation, mTypeToType, tType, mType, mAnnotationToAnnotation, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[pm] = " + pm + ", "
						+ "[tAnnotation] = " + tAnnotation + ", " + "[mAnnotation] = " + mAnnotation + ", "
						+ "[mTypeToType] = " + mTypeToType + ", " + "[tType] = " + tType + ", " + "[mType] = " + mType
						+ ", " + "[mAnnotationToAnnotation] = " + mAnnotationToAnnotation + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_29_5_checknacs_blackBBBBBBB(pm, tAnnotation, mAnnotation,
								mTypeToType, tType, mType, mAnnotationToAnnotation);
				if (result5_black != null) {

					Object[] result6_black = AnnotationTypeMemberImpl
							.pattern_AnnotationTypeMember_29_6_perform_blackBBBBBBBB(pm, tAnnotation, mAnnotation,
									mTypeToType, tType, mType, mAnnotationToAnnotation, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[pm] = " + pm + ", "
								+ "[tAnnotation] = " + tAnnotation + ", " + "[mAnnotation] = " + mAnnotation + ", "
								+ "[mTypeToType] = " + mTypeToType + ", " + "[tType] = " + tType + ", " + "[mType] = "
								+ mType + ", " + "[mAnnotationToAnnotation] = " + mAnnotationToAnnotation + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_29_6_perform_greenFBBBFFBFBFFFBB(pm,
							tAnnotation, mAnnotation, tType, mType, ruleResult, csp);
					//nothing TypeAccess access = (TypeAccess) result6_green[0];
					//nothing ASTNodeToTAnnotatable anntotatableToTannotatable = (ASTNodeToTAnnotatable) result6_green[4];
					//nothing MDefinitionToTMember memberToMember = (MDefinitionToTMember) result6_green[5];
					//nothing TFieldSignature tSignature = (TFieldSignature) result6_green[7];
					//nothing TFieldDefinition tMember = (TFieldDefinition) result6_green[9];
					//nothing TField tName = (TField) result6_green[10];
					//nothing AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result6_green[11];

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeGraph pm,
			TAnnotationType tAnnotation, AnnotationTypeDeclaration mAnnotation, TypeToTAbstractType mTypeToType,
			TAbstractType tType, Type mType, TypeToTAbstractType mAnnotationToAnnotation,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mMember_name = CSPFactoryHelper.eINSTANCE.createVariable("mMember.name", csp);
		var_mMember_name.setType("String");
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", csp);
		var_tName_tName.setType("String");
		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.upperBound", csp);
		var_tSignature_upperBound.setType("int");

		// Create constraints
		Eq eq = new Eq();
		UpperBound upperBound = new UpperBound();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(upperBound);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mMember_name, var_tName_tName);
		upperBound.setRuleName("NoRuleName");
		upperBound.solve(var_mMember_name, var_tSignature_upperBound);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("pm", pm);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("mAnnotation", mAnnotation);
		isApplicableMatch.registerObject("mTypeToType", mTypeToType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mAnnotationToAnnotation", mAnnotationToAnnotation);
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
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_FWD__MATCH_TYPEACCESS_ANNOTATIONTYPEDECLARATION_TYPE_ANNOTATIONTYPEMEMBERDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2), (Type) arguments.get(3),
					(AnnotationTypeMemberDeclaration) arguments.get(4));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPEACCESS_ANNOTATIONTYPEDECLARATION_TYPE_ANNOTATIONTYPEMEMBERDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2), (Type) arguments.get(3),
					(AnnotationTypeMemberDeclaration) arguments.get(4));
			return null;
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPEACCESS_ANNOTATIONTYPEDECLARATION_TYPE_ANNOTATIONTYPEMEMBERDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2), (Type) arguments.get(3),
					(AnnotationTypeMemberDeclaration) arguments.get(4));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPEACCESS_TYPEGRAPH_TANNOTATIONTYPE_ANNOTATIONTYPEDECLARATION_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_TYPE_TYPETOTABSTRACTTYPE_ANNOTATIONTYPEMEMBERDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TypeAccess) arguments.get(1),
					(TypeGraph) arguments.get(2), (TAnnotationType) arguments.get(3),
					(AnnotationTypeDeclaration) arguments.get(4), (TypeToTAbstractType) arguments.get(5),
					(TAbstractType) arguments.get(6), (Type) arguments.get(7), (TypeToTAbstractType) arguments.get(8),
					(AnnotationTypeMemberDeclaration) arguments.get(9));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14));
			return null;
		case RulesPackage.ANNOTATION_TYPE_MEMBER___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TANNOTATIONTYPE_TABSTRACTTYPE_TFIELDSIGNATURE_TFIELDDEFINITION_TFIELD:
			return isAppropriate_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAnnotationType) arguments.get(2), (TAbstractType) arguments.get(3),
					(TFieldSignature) arguments.get(4), (TFieldDefinition) arguments.get(5), (TField) arguments.get(6));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TANNOTATIONTYPE_TABSTRACTTYPE_TFIELDSIGNATURE_TFIELDDEFINITION_TFIELD:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAnnotationType) arguments.get(2), (TAbstractType) arguments.get(3),
					(TFieldSignature) arguments.get(4), (TFieldDefinition) arguments.get(5), (TField) arguments.get(6));
			return null;
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TANNOTATIONTYPE_TABSTRACTTYPE_TFIELDSIGNATURE_TFIELDDEFINITION_TFIELD:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAnnotationType) arguments.get(2), (TAbstractType) arguments.get(3),
					(TFieldSignature) arguments.get(4), (TFieldDefinition) arguments.get(5), (TField) arguments.get(6));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_TANNOTATIONTYPE_ANNOTATIONTYPEDECLARATION_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_TFIELDSIGNATURE_TYPE_TYPETOTABSTRACTTYPE_TFIELDDEFINITION_TFIELD:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAnnotationType) arguments.get(2), (AnnotationTypeDeclaration) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (TAbstractType) arguments.get(5),
					(TFieldSignature) arguments.get(6), (Type) arguments.get(7), (TypeToTAbstractType) arguments.get(8),
					(TFieldDefinition) arguments.get(9), (TField) arguments.get(10));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14));
			return null;
		case RulesPackage.ANNOTATION_TYPE_MEMBER___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_BWD_EMOFLON_EDGE_63__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_63((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_66__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_66((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_SOLVE_CSP_CC__TYPEACCESS_TYPEGRAPH_TANNOTATIONTYPE_ANNOTATIONTYPEDECLARATION_TABSTRACTTYPE_TFIELDSIGNATURE_TYPE_TFIELDDEFINITION_TFIELD_ANNOTATIONTYPEMEMBERDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TypeAccess) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAnnotationType) arguments.get(2), (AnnotationTypeDeclaration) arguments.get(3),
					(TAbstractType) arguments.get(4), (TFieldSignature) arguments.get(5), (Type) arguments.get(6),
					(TFieldDefinition) arguments.get(7), (TField) arguments.get(8),
					(AnnotationTypeMemberDeclaration) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___CHECK_DEC_FWD__TYPEACCESS_ANNOTATIONTYPEDECLARATION_TYPE_ANNOTATIONTYPEMEMBERDECLARATION:
			return checkDEC_FWD((TypeAccess) arguments.get(0), (AnnotationTypeDeclaration) arguments.get(1),
					(Type) arguments.get(2), (AnnotationTypeMemberDeclaration) arguments.get(3));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___CHECK_DEC_BWD__TYPEGRAPH_TANNOTATIONTYPE_TABSTRACTTYPE_TFIELDSIGNATURE_TFIELDDEFINITION_TFIELD:
			return checkDEC_BWD((TypeGraph) arguments.get(0), (TAnnotationType) arguments.get(1),
					(TAbstractType) arguments.get(2), (TFieldSignature) arguments.get(3),
					(TFieldDefinition) arguments.get(4), (TField) arguments.get(5));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_TANNOTATIONTYPE_ANNOTATIONTYPEDECLARATION_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_TYPE_TYPETOTABSTRACTTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAnnotationType) arguments.get(2), (AnnotationTypeDeclaration) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (TAbstractType) arguments.get(5), (Type) arguments.get(6),
					(TypeToTAbstractType) arguments.get(7), (ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnnotationTypeMember_0_1_initialbindings_blackBBBBBB(
			AnnotationTypeMember _this, Match match, TypeAccess access, AnnotationTypeDeclaration mAnnotation,
			Type mType, AnnotationTypeMemberDeclaration mMember) {
		if (!mAnnotation.equals(mType)) {
			return new Object[] { _this, match, access, mAnnotation, mType, mMember };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_0_2_SolveCSP_bindingFBBBBBB(AnnotationTypeMember _this,
			Match match, TypeAccess access, AnnotationTypeDeclaration mAnnotation, Type mType,
			AnnotationTypeMemberDeclaration mMember) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, access, mAnnotation, mType, mMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, access, mAnnotation, mType, mMember };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			AnnotationTypeMember _this, Match match, TypeAccess access, AnnotationTypeDeclaration mAnnotation,
			Type mType, AnnotationTypeMemberDeclaration mMember) {
		Object[] result_pattern_AnnotationTypeMember_0_2_SolveCSP_binding = pattern_AnnotationTypeMember_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, access, mAnnotation, mType, mMember);
		if (result_pattern_AnnotationTypeMember_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeMember_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeMember_0_2_SolveCSP_black = pattern_AnnotationTypeMember_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeMember_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, access, mAnnotation, mType, mMember };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeMember_0_3_CheckCSP_expressionFBB(AnnotationTypeMember _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			TypeAccess access, AnnotationTypeDeclaration mAnnotation, Type mType,
			AnnotationTypeMemberDeclaration mMember) {
		if (!mAnnotation.equals(mType)) {
			return new Object[] { match, access, mAnnotation, mType, mMember };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_0_4_collectelementstobetranslated_greenBBBBBFFFFF(
			Match match, TypeAccess access, AnnotationTypeDeclaration mAnnotation, Type mType,
			AnnotationTypeMemberDeclaration mMember) {
		EMoflonEdge mAnnotation__mMember____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge access__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__access____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__access____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(access);
		match.getToBeTranslatedNodes().add(mMember);
		String mAnnotation__mMember____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMember__mAnnotation____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String access__mType____type_name_prime = "type";
		String mType__access____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mMember__access____type_name_prime = "type";
		mAnnotation__mMember____bodyDeclarations.setSrc(mAnnotation);
		mAnnotation__mMember____bodyDeclarations.setTrg(mMember);
		match.getToBeTranslatedEdges().add(mAnnotation__mMember____bodyDeclarations);
		mMember__mAnnotation____abstractTypeDeclaration.setSrc(mMember);
		mMember__mAnnotation____abstractTypeDeclaration.setTrg(mAnnotation);
		match.getToBeTranslatedEdges().add(mMember__mAnnotation____abstractTypeDeclaration);
		access__mType____type.setSrc(access);
		access__mType____type.setTrg(mType);
		match.getToBeTranslatedEdges().add(access__mType____type);
		mType__access____usagesInTypeAccess.setSrc(mType);
		mType__access____usagesInTypeAccess.setTrg(access);
		match.getToBeTranslatedEdges().add(mType__access____usagesInTypeAccess);
		mMember__access____type.setSrc(mMember);
		mMember__access____type.setTrg(access);
		match.getToBeTranslatedEdges().add(mMember__access____type);
		mAnnotation__mMember____bodyDeclarations.setName(mAnnotation__mMember____bodyDeclarations_name_prime);
		mMember__mAnnotation____abstractTypeDeclaration
				.setName(mMember__mAnnotation____abstractTypeDeclaration_name_prime);
		access__mType____type.setName(access__mType____type_name_prime);
		mType__access____usagesInTypeAccess.setName(mType__access____usagesInTypeAccess_name_prime);
		mMember__access____type.setName(mMember__access____type_name_prime);
		return new Object[] { match, access, mAnnotation, mType, mMember, mAnnotation__mMember____bodyDeclarations,
				mMember__mAnnotation____abstractTypeDeclaration, access__mType____type,
				mType__access____usagesInTypeAccess, mMember__access____type };
	}

	public static final Object[] pattern_AnnotationTypeMember_0_5_collectcontextelements_blackBBBBB(Match match,
			TypeAccess access, AnnotationTypeDeclaration mAnnotation, Type mType,
			AnnotationTypeMemberDeclaration mMember) {
		if (!mAnnotation.equals(mType)) {
			return new Object[] { match, access, mAnnotation, mType, mMember };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_0_5_collectcontextelements_greenBBB(Match match,
			AnnotationTypeDeclaration mAnnotation, Type mType) {
		match.getContextNodes().add(mAnnotation);
		match.getContextNodes().add(mType);
		return new Object[] { match, mAnnotation, mType };
	}

	public static final void pattern_AnnotationTypeMember_0_6_registerobjectstomatch_expressionBBBBBB(
			AnnotationTypeMember _this, Match match, TypeAccess access, AnnotationTypeDeclaration mAnnotation,
			Type mType, AnnotationTypeMemberDeclaration mMember) {
		_this.registerObjectsToMatch_FWD(match, access, mAnnotation, mType, mMember);

	}

	public static final boolean pattern_AnnotationTypeMember_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeMember_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_1_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("access");
		EObject _localVariable_1 = isApplicableMatch.getObject("pm");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_3 = isApplicableMatch.getObject("mAnnotation");
		EObject _localVariable_4 = isApplicableMatch.getObject("mTypeToType");
		EObject _localVariable_5 = isApplicableMatch.getObject("tType");
		EObject _localVariable_6 = isApplicableMatch.getObject("mType");
		EObject _localVariable_7 = isApplicableMatch.getObject("mAnnotationToAnnotation");
		EObject _localVariable_8 = isApplicableMatch.getObject("mMember");
		EObject tmpAccess = _localVariable_0;
		EObject tmpPm = _localVariable_1;
		EObject tmpTAnnotation = _localVariable_2;
		EObject tmpMAnnotation = _localVariable_3;
		EObject tmpMTypeToType = _localVariable_4;
		EObject tmpTType = _localVariable_5;
		EObject tmpMType = _localVariable_6;
		EObject tmpMAnnotationToAnnotation = _localVariable_7;
		EObject tmpMMember = _localVariable_8;
		if (tmpAccess instanceof TypeAccess) {
			TypeAccess access = (TypeAccess) tmpAccess;
			if (tmpPm instanceof TypeGraph) {
				TypeGraph pm = (TypeGraph) tmpPm;
				if (tmpTAnnotation instanceof TAnnotationType) {
					TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
					if (tmpMAnnotation instanceof AnnotationTypeDeclaration) {
						AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) tmpMAnnotation;
						if (tmpMTypeToType instanceof TypeToTAbstractType) {
							TypeToTAbstractType mTypeToType = (TypeToTAbstractType) tmpMTypeToType;
							if (tmpTType instanceof TAbstractType) {
								TAbstractType tType = (TAbstractType) tmpTType;
								if (tmpMType instanceof Type) {
									Type mType = (Type) tmpMType;
									if (tmpMAnnotationToAnnotation instanceof TypeToTAbstractType) {
										TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) tmpMAnnotationToAnnotation;
										if (tmpMMember instanceof AnnotationTypeMemberDeclaration) {
											AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) tmpMMember;
											return new Object[] { access, pm, tAnnotation, mAnnotation, mTypeToType,
													tType, mType, mAnnotationToAnnotation, mMember, isApplicableMatch };
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

	public static final Object[] pattern_AnnotationTypeMember_1_1_performtransformation_blackBBBBBBBBBFBB(
			TypeAccess access, TypeGraph pm, TAnnotationType tAnnotation, AnnotationTypeDeclaration mAnnotation,
			TypeToTAbstractType mTypeToType, TAbstractType tType, Type mType,
			TypeToTAbstractType mAnnotationToAnnotation, AnnotationTypeMemberDeclaration mMember,
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch) {
		if (!tAnnotation.equals(tType)) {
			if (!mAnnotation.equals(mType)) {
				if (!mAnnotationToAnnotation.equals(mTypeToType)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { access, pm, tAnnotation, mAnnotation, mTypeToType, tType, mType,
									mAnnotationToAnnotation, mMember, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationTypeMember_1_1_performtransformation_binding = pattern_AnnotationTypeMember_1_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationTypeMember_1_1_performtransformation_binding != null) {
			TypeAccess access = (TypeAccess) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[0];
			TypeGraph pm = (TypeGraph) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[1];
			TAnnotationType tAnnotation = (TAnnotationType) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[2];
			AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[3];
			TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[4];
			TAbstractType tType = (TAbstractType) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[5];
			Type mType = (Type) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[6];
			TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[7];
			AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[8];

			Object[] result_pattern_AnnotationTypeMember_1_1_performtransformation_black = pattern_AnnotationTypeMember_1_1_performtransformation_blackBBBBBBBBBFBB(
					access, pm, tAnnotation, mAnnotation, mTypeToType, tType, mType, mAnnotationToAnnotation, mMember,
					_this, isApplicableMatch);
			if (result_pattern_AnnotationTypeMember_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationTypeMember_1_1_performtransformation_black[9];

				return new Object[] { access, pm, tAnnotation, mAnnotation, mTypeToType, tType, mType,
						mAnnotationToAnnotation, mMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_1_1_performtransformation_greenBBFFBFFFBB(TypeGraph pm,
			TAnnotationType tAnnotation, TAbstractType tType, AnnotationTypeMemberDeclaration mMember, CSP csp) {
		ASTNodeToTAnnotatable anntotatableToTannotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MDefinitionToTMember memberToMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		TFieldDefinition tMember = BasicFactory.eINSTANCE.createTFieldDefinition();
		TField tName = BasicFactory.eINSTANCE.createTField();
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		Object _localVariable_0 = csp.getValue("tSignature", "upperBound");
		Object _localVariable_1 = csp.getValue("tName", "tName");
		anntotatableToTannotatable.setSource(mMember);
		memberToMember.setSource(mMember);
		tSignature.setType(tType);
		tAnnotation.getSignature().add(tSignature);
		tAnnotation.getDefines().add(tMember);
		tSignature.getDefinitions().add(tMember);
		memberToMember.setTarget(tMember);
		anntotatableToTannotatable.setTarget(tMember);
		tName.setModel(pm);
		tName.getSignatures().add(tSignature);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		int tSignature_upperBound_prime = (int) _localVariable_0;
		String tName_tName_prime = (String) _localVariable_1;
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		tName.setTName(tName_tName_prime);
		return new Object[] { pm, tAnnotation, anntotatableToTannotatable, memberToMember, tType, tSignature, tMember,
				tName, mMember, csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_1_2_collecttranslatedelements_blackBBBBBBB(
			TypeAccess access, ASTNodeToTAnnotatable anntotatableToTannotatable, MDefinitionToTMember memberToMember,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName,
			AnnotationTypeMemberDeclaration mMember) {
		return new Object[] { access, anntotatableToTannotatable, memberToMember, tSignature, tMember, tName, mMember };
	}

	public static final Object[] pattern_AnnotationTypeMember_1_2_collecttranslatedelements_greenFBBBBBBB(
			TypeAccess access, ASTNodeToTAnnotatable anntotatableToTannotatable, MDefinitionToTMember memberToMember,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName,
			AnnotationTypeMemberDeclaration mMember) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(access);
		ruleresult.getCreatedLinkElements().add(anntotatableToTannotatable);
		ruleresult.getCreatedLinkElements().add(memberToMember);
		ruleresult.getCreatedElements().add(tSignature);
		ruleresult.getCreatedElements().add(tMember);
		ruleresult.getCreatedElements().add(tName);
		ruleresult.getTranslatedElements().add(mMember);
		return new Object[] { ruleresult, access, anntotatableToTannotatable, memberToMember, tSignature, tMember,
				tName, mMember };
	}

	public static final Object[] pattern_AnnotationTypeMember_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject access, EObject pm, EObject tAnnotation, EObject mAnnotation,
			EObject anntotatableToTannotatable, EObject mTypeToType, EObject memberToMember, EObject tType,
			EObject tSignature, EObject mType, EObject mAnnotationToAnnotation, EObject tMember, EObject tName,
			EObject mMember) {
		if (!access.equals(pm)) {
			if (!access.equals(tAnnotation)) {
				if (!access.equals(mAnnotation)) {
					if (!access.equals(anntotatableToTannotatable)) {
						if (!access.equals(mTypeToType)) {
							if (!access.equals(memberToMember)) {
								if (!access.equals(tType)) {
									if (!access.equals(tSignature)) {
										if (!access.equals(mType)) {
											if (!access.equals(mAnnotationToAnnotation)) {
												if (!access.equals(tMember)) {
													if (!access.equals(tName)) {
														if (!access.equals(mMember)) {
															if (!pm.equals(tAnnotation)) {
																if (!pm.equals(tType)) {
																	if (!pm.equals(tSignature)) {
																		if (!pm.equals(tMember)) {
																			if (!pm.equals(tName)) {
																				if (!tAnnotation.equals(tType)) {
																					if (!tAnnotation
																							.equals(tSignature)) {
																						if (!tAnnotation
																								.equals(tMember)) {
																							if (!tAnnotation
																									.equals(tName)) {
																								if (!mAnnotation
																										.equals(pm)) {
																									if (!mAnnotation
																											.equals(tAnnotation)) {
																										if (!mAnnotation
																												.equals(mTypeToType)) {
																											if (!mAnnotation
																													.equals(memberToMember)) {
																												if (!mAnnotation
																														.equals(tType)) {
																													if (!mAnnotation
																															.equals(tSignature)) {
																														if (!mAnnotation
																																.equals(mType)) {
																															if (!mAnnotation
																																	.equals(mAnnotationToAnnotation)) {
																																if (!mAnnotation
																																		.equals(tMember)) {
																																	if (!mAnnotation
																																			.equals(tName)) {
																																		if (!mAnnotation
																																				.equals(mMember)) {
																																			if (!anntotatableToTannotatable
																																					.equals(pm)) {
																																				if (!anntotatableToTannotatable
																																						.equals(tAnnotation)) {
																																					if (!anntotatableToTannotatable
																																							.equals(mAnnotation)) {
																																						if (!anntotatableToTannotatable
																																								.equals(mTypeToType)) {
																																							if (!anntotatableToTannotatable
																																									.equals(memberToMember)) {
																																								if (!anntotatableToTannotatable
																																										.equals(tType)) {
																																									if (!anntotatableToTannotatable
																																											.equals(tSignature)) {
																																										if (!anntotatableToTannotatable
																																												.equals(mType)) {
																																											if (!anntotatableToTannotatable
																																													.equals(mAnnotationToAnnotation)) {
																																												if (!anntotatableToTannotatable
																																														.equals(tMember)) {
																																													if (!anntotatableToTannotatable
																																															.equals(tName)) {
																																														if (!anntotatableToTannotatable
																																																.equals(mMember)) {
																																															if (!mTypeToType
																																																	.equals(pm)) {
																																																if (!mTypeToType
																																																		.equals(tAnnotation)) {
																																																	if (!mTypeToType
																																																			.equals(memberToMember)) {
																																																		if (!mTypeToType
																																																				.equals(tType)) {
																																																			if (!mTypeToType
																																																					.equals(tSignature)) {
																																																				if (!mTypeToType
																																																						.equals(tMember)) {
																																																					if (!mTypeToType
																																																							.equals(tName)) {
																																																						if (!memberToMember
																																																								.equals(pm)) {
																																																							if (!memberToMember
																																																									.equals(tAnnotation)) {
																																																								if (!memberToMember
																																																										.equals(tType)) {
																																																									if (!memberToMember
																																																											.equals(tSignature)) {
																																																										if (!memberToMember
																																																												.equals(tMember)) {
																																																											if (!memberToMember
																																																													.equals(tName)) {
																																																												if (!tSignature
																																																														.equals(tType)) {
																																																													if (!mType
																																																															.equals(pm)) {
																																																														if (!mType
																																																																.equals(tAnnotation)) {
																																																															if (!mType
																																																																	.equals(mTypeToType)) {
																																																																if (!mType
																																																																		.equals(memberToMember)) {
																																																																	if (!mType
																																																																			.equals(tType)) {
																																																																		if (!mType
																																																																				.equals(tSignature)) {
																																																																			if (!mType
																																																																					.equals(tMember)) {
																																																																				if (!mType
																																																																						.equals(tName)) {
																																																																					if (!mAnnotationToAnnotation
																																																																							.equals(pm)) {
																																																																						if (!mAnnotationToAnnotation
																																																																								.equals(tAnnotation)) {
																																																																							if (!mAnnotationToAnnotation
																																																																									.equals(mTypeToType)) {
																																																																								if (!mAnnotationToAnnotation
																																																																										.equals(memberToMember)) {
																																																																									if (!mAnnotationToAnnotation
																																																																											.equals(tType)) {
																																																																										if (!mAnnotationToAnnotation
																																																																												.equals(tSignature)) {
																																																																											if (!mAnnotationToAnnotation
																																																																													.equals(mType)) {
																																																																												if (!mAnnotationToAnnotation
																																																																														.equals(tMember)) {
																																																																													if (!mAnnotationToAnnotation
																																																																															.equals(tName)) {
																																																																														if (!mAnnotationToAnnotation
																																																																																.equals(mMember)) {
																																																																															if (!tMember
																																																																																	.equals(tType)) {
																																																																																if (!tMember
																																																																																		.equals(tSignature)) {
																																																																																	if (!tMember
																																																																																			.equals(tName)) {
																																																																																		if (!tName
																																																																																				.equals(tType)) {
																																																																																			if (!tName
																																																																																					.equals(tSignature)) {
																																																																																				if (!mMember
																																																																																						.equals(pm)) {
																																																																																					if (!mMember
																																																																																							.equals(tAnnotation)) {
																																																																																						if (!mMember
																																																																																								.equals(mTypeToType)) {
																																																																																							if (!mMember
																																																																																									.equals(memberToMember)) {
																																																																																								if (!mMember
																																																																																										.equals(tType)) {
																																																																																									if (!mMember
																																																																																											.equals(tSignature)) {
																																																																																										if (!mMember
																																																																																												.equals(mType)) {
																																																																																											if (!mMember
																																																																																													.equals(tMember)) {
																																																																																												if (!mMember
																																																																																														.equals(tName)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															access,
																																																																																															pm,
																																																																																															tAnnotation,
																																																																																															mAnnotation,
																																																																																															anntotatableToTannotatable,
																																																																																															mTypeToType,
																																																																																															memberToMember,
																																																																																															tType,
																																																																																															tSignature,
																																																																																															mType,
																																																																																															mAnnotationToAnnotation,
																																																																																															tMember,
																																																																																															tName,
																																																																																															mMember };
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationTypeMember_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject access, EObject pm, EObject tAnnotation, EObject mAnnotation,
			EObject anntotatableToTannotatable, EObject memberToMember, EObject tType, EObject tSignature,
			EObject mType, EObject tMember, EObject tName, EObject mMember) {
		EMoflonEdge mAnnotation__mMember____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge access__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__access____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAnnotation____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tMember____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge memberToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge anntotatableToTannotatable__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__pm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__access____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge anntotatableToTannotatable__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge memberToMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationTypeMember";
		String mAnnotation__mMember____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMember__mAnnotation____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String access__mType____type_name_prime = "type";
		String mType__access____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String tAnnotation__tMember____defines_name_prime = "defines";
		String tMember__tAnnotation____definedBy_name_prime = "definedBy";
		String tSignature__tMember____definitions_name_prime = "definitions";
		String tMember__tSignature____signature_name_prime = "signature";
		String tSignature__tType____type_name_prime = "type";
		String tAnnotation__tSignature____signature_name_prime = "signature";
		String memberToMember__tMember____target_name_prime = "target";
		String anntotatableToTannotatable__tMember____target_name_prime = "target";
		String tName__pm____model_name_prime = "model";
		String pm__tName____fields_name_prime = "fields";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____field_name_prime = "field";
		String mMember__access____type_name_prime = "type";
		String anntotatableToTannotatable__mMember____source_name_prime = "source";
		String memberToMember__mMember____source_name_prime = "source";
		mAnnotation__mMember____bodyDeclarations.setSrc(mAnnotation);
		mAnnotation__mMember____bodyDeclarations.setTrg(mMember);
		ruleresult.getTranslatedEdges().add(mAnnotation__mMember____bodyDeclarations);
		mMember__mAnnotation____abstractTypeDeclaration.setSrc(mMember);
		mMember__mAnnotation____abstractTypeDeclaration.setTrg(mAnnotation);
		ruleresult.getTranslatedEdges().add(mMember__mAnnotation____abstractTypeDeclaration);
		access__mType____type.setSrc(access);
		access__mType____type.setTrg(mType);
		ruleresult.getTranslatedEdges().add(access__mType____type);
		mType__access____usagesInTypeAccess.setSrc(mType);
		mType__access____usagesInTypeAccess.setTrg(access);
		ruleresult.getTranslatedEdges().add(mType__access____usagesInTypeAccess);
		tAnnotation__tMember____defines.setSrc(tAnnotation);
		tAnnotation__tMember____defines.setTrg(tMember);
		ruleresult.getCreatedEdges().add(tAnnotation__tMember____defines);
		tMember__tAnnotation____definedBy.setSrc(tMember);
		tMember__tAnnotation____definedBy.setTrg(tAnnotation);
		ruleresult.getCreatedEdges().add(tMember__tAnnotation____definedBy);
		tSignature__tMember____definitions.setSrc(tSignature);
		tSignature__tMember____definitions.setTrg(tMember);
		ruleresult.getCreatedEdges().add(tSignature__tMember____definitions);
		tMember__tSignature____signature.setSrc(tMember);
		tMember__tSignature____signature.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tMember__tSignature____signature);
		tSignature__tType____type.setSrc(tSignature);
		tSignature__tType____type.setTrg(tType);
		ruleresult.getCreatedEdges().add(tSignature__tType____type);
		tAnnotation__tSignature____signature.setSrc(tAnnotation);
		tAnnotation__tSignature____signature.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tAnnotation__tSignature____signature);
		memberToMember__tMember____target.setSrc(memberToMember);
		memberToMember__tMember____target.setTrg(tMember);
		ruleresult.getCreatedEdges().add(memberToMember__tMember____target);
		anntotatableToTannotatable__tMember____target.setSrc(anntotatableToTannotatable);
		anntotatableToTannotatable__tMember____target.setTrg(tMember);
		ruleresult.getCreatedEdges().add(anntotatableToTannotatable__tMember____target);
		tName__pm____model.setSrc(tName);
		tName__pm____model.setTrg(pm);
		ruleresult.getCreatedEdges().add(tName__pm____model);
		pm__tName____fields.setSrc(pm);
		pm__tName____fields.setTrg(tName);
		ruleresult.getCreatedEdges().add(pm__tName____fields);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tName__tSignature____signatures);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		ruleresult.getCreatedEdges().add(tSignature__tName____field);
		mMember__access____type.setSrc(mMember);
		mMember__access____type.setTrg(access);
		ruleresult.getTranslatedEdges().add(mMember__access____type);
		anntotatableToTannotatable__mMember____source.setSrc(anntotatableToTannotatable);
		anntotatableToTannotatable__mMember____source.setTrg(mMember);
		ruleresult.getCreatedEdges().add(anntotatableToTannotatable__mMember____source);
		memberToMember__mMember____source.setSrc(memberToMember);
		memberToMember__mMember____source.setTrg(mMember);
		ruleresult.getCreatedEdges().add(memberToMember__mMember____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mAnnotation__mMember____bodyDeclarations.setName(mAnnotation__mMember____bodyDeclarations_name_prime);
		mMember__mAnnotation____abstractTypeDeclaration
				.setName(mMember__mAnnotation____abstractTypeDeclaration_name_prime);
		access__mType____type.setName(access__mType____type_name_prime);
		mType__access____usagesInTypeAccess.setName(mType__access____usagesInTypeAccess_name_prime);
		tAnnotation__tMember____defines.setName(tAnnotation__tMember____defines_name_prime);
		tMember__tAnnotation____definedBy.setName(tMember__tAnnotation____definedBy_name_prime);
		tSignature__tMember____definitions.setName(tSignature__tMember____definitions_name_prime);
		tMember__tSignature____signature.setName(tMember__tSignature____signature_name_prime);
		tSignature__tType____type.setName(tSignature__tType____type_name_prime);
		tAnnotation__tSignature____signature.setName(tAnnotation__tSignature____signature_name_prime);
		memberToMember__tMember____target.setName(memberToMember__tMember____target_name_prime);
		anntotatableToTannotatable__tMember____target.setName(anntotatableToTannotatable__tMember____target_name_prime);
		tName__pm____model.setName(tName__pm____model_name_prime);
		pm__tName____fields.setName(pm__tName____fields_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		mMember__access____type.setName(mMember__access____type_name_prime);
		anntotatableToTannotatable__mMember____source.setName(anntotatableToTannotatable__mMember____source_name_prime);
		memberToMember__mMember____source.setName(memberToMember__mMember____source_name_prime);
		return new Object[] { ruleresult, access, pm, tAnnotation, mAnnotation, anntotatableToTannotatable,
				memberToMember, tType, tSignature, mType, tMember, tName, mMember,
				mAnnotation__mMember____bodyDeclarations, mMember__mAnnotation____abstractTypeDeclaration,
				access__mType____type, mType__access____usagesInTypeAccess, tAnnotation__tMember____defines,
				tMember__tAnnotation____definedBy, tSignature__tMember____definitions, tMember__tSignature____signature,
				tSignature__tType____type, tAnnotation__tSignature____signature, memberToMember__tMember____target,
				anntotatableToTannotatable__tMember____target, tName__pm____model, pm__tName____fields,
				tName__tSignature____signatures, tSignature__tName____field, mMember__access____type,
				anntotatableToTannotatable__mMember____source, memberToMember__mMember____source };
	}

	public static final void pattern_AnnotationTypeMember_1_5_registerobjects_expressionBBBBBBBBBBBBBBBB(
			AnnotationTypeMember _this, PerformRuleResult ruleresult, EObject access, EObject pm, EObject tAnnotation,
			EObject mAnnotation, EObject anntotatableToTannotatable, EObject mTypeToType, EObject memberToMember,
			EObject tType, EObject tSignature, EObject mType, EObject mAnnotationToAnnotation, EObject tMember,
			EObject tName, EObject mMember) {
		_this.registerObjects_FWD(ruleresult, access, pm, tAnnotation, mAnnotation, anntotatableToTannotatable,
				mTypeToType, memberToMember, tType, tSignature, mType, mAnnotationToAnnotation, tMember, tName,
				mMember);

	}

	public static final PerformRuleResult pattern_AnnotationTypeMember_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_2_1_preparereturnvalue_bindingFB(
			AnnotationTypeMember _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationTypeMember _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationTypeMember _this) {
		Object[] result_pattern_AnnotationTypeMember_2_1_preparereturnvalue_binding = pattern_AnnotationTypeMember_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeMember_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationTypeMember_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeMember_2_1_preparereturnvalue_black = pattern_AnnotationTypeMember_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationTypeMember_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationTypeMember_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationTypeMember";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationTypeMember_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("access");
		EObject _localVariable_1 = match.getObject("mAnnotation");
		EObject _localVariable_2 = match.getObject("mType");
		EObject _localVariable_3 = match.getObject("mMember");
		EObject tmpAccess = _localVariable_0;
		EObject tmpMAnnotation = _localVariable_1;
		EObject tmpMType = _localVariable_2;
		EObject tmpMMember = _localVariable_3;
		if (tmpAccess instanceof TypeAccess) {
			TypeAccess access = (TypeAccess) tmpAccess;
			if (tmpMAnnotation instanceof AnnotationTypeDeclaration) {
				AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) tmpMAnnotation;
				if (tmpMType instanceof Type) {
					Type mType = (Type) tmpMType;
					if (tmpMMember instanceof AnnotationTypeMemberDeclaration) {
						AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) tmpMMember;
						return new Object[] { access, mAnnotation, mType, mMember, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeMember_2_2_corematch_blackBFBFFBFBB(TypeAccess access,
			AnnotationTypeDeclaration mAnnotation, Type mType, AnnotationTypeMemberDeclaration mMember, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mAnnotation.equals(mType)) {
			for (TypeToTAbstractType mAnnotationToAnnotation : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mAnnotation, TypeToTAbstractType.class, "source")) {
				TAbstractType tmpTAnnotation = mAnnotationToAnnotation.getTarget();
				if (tmpTAnnotation instanceof TAnnotationType) {
					TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
					for (TypeToTAbstractType mTypeToType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
						if (!mAnnotationToAnnotation.equals(mTypeToType)) {
							TAbstractType tType = mTypeToType.getTarget();
							if (tType != null) {
								if (!tAnnotation.equals(tType)) {
									_result.add(new Object[] { access, tAnnotation, mAnnotation, mTypeToType, tType,
											mType, mAnnotationToAnnotation, mMember, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeMember_2_3_findcontext_blackBFBBBBBBB(
			TypeAccess access, TAnnotationType tAnnotation, AnnotationTypeDeclaration mAnnotation,
			TypeToTAbstractType mTypeToType, TAbstractType tType, Type mType,
			TypeToTAbstractType mAnnotationToAnnotation, AnnotationTypeMemberDeclaration mMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tAnnotation.equals(tType)) {
			if (!mAnnotation.equals(mType)) {
				if (!mAnnotationToAnnotation.equals(mTypeToType)) {
					if (mAnnotation.getBodyDeclarations().contains(mMember)) {
						if (mType.equals(access.getType())) {
							if (tType.equals(mTypeToType.getTarget())) {
								if (mAnnotation.equals(mAnnotationToAnnotation.getSource())) {
									if (tAnnotation.equals(mAnnotationToAnnotation.getTarget())) {
										if (mType.equals(mTypeToType.getSource())) {
											if (access.equals(mMember.getType())) {
												TypeGraph pm = tAnnotation.getModel();
												if (pm != null) {
													_result.add(new Object[] { access, pm, tAnnotation, mAnnotation,
															mTypeToType, tType, mType, mAnnotationToAnnotation,
															mMember });
												}

											}
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

	public static final Object[] pattern_AnnotationTypeMember_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFF(
			TypeAccess access, TypeGraph pm, TAnnotationType tAnnotation, AnnotationTypeDeclaration mAnnotation,
			TypeToTAbstractType mTypeToType, TAbstractType tType, Type mType,
			TypeToTAbstractType mAnnotationToAnnotation, AnnotationTypeMemberDeclaration mMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mAnnotation__mMember____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge access__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__access____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationToAnnotation__mAnnotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationToAnnotation__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__pm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__tAnnotation____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__access____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mAnnotation__mMember____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMember__mAnnotation____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String access__mType____type_name_prime = "type";
		String mType__access____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mTypeToType__tType____target_name_prime = "target";
		String mAnnotationToAnnotation__mAnnotation____source_name_prime = "source";
		String mAnnotationToAnnotation__tAnnotation____target_name_prime = "target";
		String mTypeToType__mType____source_name_prime = "source";
		String tAnnotation__pm____model_name_prime = "model";
		String pm__tAnnotation____allTypes_name_prime = "allTypes";
		String mMember__access____type_name_prime = "type";
		isApplicableMatch.getAllContextElements().add(access);
		isApplicableMatch.getAllContextElements().add(pm);
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mAnnotation);
		isApplicableMatch.getAllContextElements().add(mTypeToType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mAnnotationToAnnotation);
		isApplicableMatch.getAllContextElements().add(mMember);
		mAnnotation__mMember____bodyDeclarations.setSrc(mAnnotation);
		mAnnotation__mMember____bodyDeclarations.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mAnnotation__mMember____bodyDeclarations);
		mMember__mAnnotation____abstractTypeDeclaration.setSrc(mMember);
		mMember__mAnnotation____abstractTypeDeclaration.setTrg(mAnnotation);
		isApplicableMatch.getAllContextElements().add(mMember__mAnnotation____abstractTypeDeclaration);
		access__mType____type.setSrc(access);
		access__mType____type.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(access__mType____type);
		mType__access____usagesInTypeAccess.setSrc(mType);
		mType__access____usagesInTypeAccess.setTrg(access);
		isApplicableMatch.getAllContextElements().add(mType__access____usagesInTypeAccess);
		mTypeToType__tType____target.setSrc(mTypeToType);
		mTypeToType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToType__tType____target);
		mAnnotationToAnnotation__mAnnotation____source.setSrc(mAnnotationToAnnotation);
		mAnnotationToAnnotation__mAnnotation____source.setTrg(mAnnotation);
		isApplicableMatch.getAllContextElements().add(mAnnotationToAnnotation__mAnnotation____source);
		mAnnotationToAnnotation__tAnnotation____target.setSrc(mAnnotationToAnnotation);
		mAnnotationToAnnotation__tAnnotation____target.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mAnnotationToAnnotation__tAnnotation____target);
		mTypeToType__mType____source.setSrc(mTypeToType);
		mTypeToType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToType__mType____source);
		tAnnotation__pm____model.setSrc(tAnnotation);
		tAnnotation__pm____model.setTrg(pm);
		isApplicableMatch.getAllContextElements().add(tAnnotation__pm____model);
		pm__tAnnotation____allTypes.setSrc(pm);
		pm__tAnnotation____allTypes.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(pm__tAnnotation____allTypes);
		mMember__access____type.setSrc(mMember);
		mMember__access____type.setTrg(access);
		isApplicableMatch.getAllContextElements().add(mMember__access____type);
		mAnnotation__mMember____bodyDeclarations.setName(mAnnotation__mMember____bodyDeclarations_name_prime);
		mMember__mAnnotation____abstractTypeDeclaration
				.setName(mMember__mAnnotation____abstractTypeDeclaration_name_prime);
		access__mType____type.setName(access__mType____type_name_prime);
		mType__access____usagesInTypeAccess.setName(mType__access____usagesInTypeAccess_name_prime);
		mTypeToType__tType____target.setName(mTypeToType__tType____target_name_prime);
		mAnnotationToAnnotation__mAnnotation____source
				.setName(mAnnotationToAnnotation__mAnnotation____source_name_prime);
		mAnnotationToAnnotation__tAnnotation____target
				.setName(mAnnotationToAnnotation__tAnnotation____target_name_prime);
		mTypeToType__mType____source.setName(mTypeToType__mType____source_name_prime);
		tAnnotation__pm____model.setName(tAnnotation__pm____model_name_prime);
		pm__tAnnotation____allTypes.setName(pm__tAnnotation____allTypes_name_prime);
		mMember__access____type.setName(mMember__access____type_name_prime);
		return new Object[] { access, pm, tAnnotation, mAnnotation, mTypeToType, tType, mType, mAnnotationToAnnotation,
				mMember, isApplicableMatch, mAnnotation__mMember____bodyDeclarations,
				mMember__mAnnotation____abstractTypeDeclaration, access__mType____type,
				mType__access____usagesInTypeAccess, mTypeToType__tType____target,
				mAnnotationToAnnotation__mAnnotation____source, mAnnotationToAnnotation__tAnnotation____target,
				mTypeToType__mType____source, tAnnotation__pm____model, pm__tAnnotation____allTypes,
				mMember__access____type };
	}

	public static final Object[] pattern_AnnotationTypeMember_2_4_solveCSP_bindingFBBBBBBBBBBB(
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch, TypeAccess access, TypeGraph pm,
			TAnnotationType tAnnotation, AnnotationTypeDeclaration mAnnotation, TypeToTAbstractType mTypeToType,
			TAbstractType tType, Type mType, TypeToTAbstractType mAnnotationToAnnotation,
			AnnotationTypeMemberDeclaration mMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, access, pm, tAnnotation, mAnnotation,
				mTypeToType, tType, mType, mAnnotationToAnnotation, mMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, access, pm, tAnnotation, mAnnotation, mTypeToType,
					tType, mType, mAnnotationToAnnotation, mMember };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch, TypeAccess access, TypeGraph pm,
			TAnnotationType tAnnotation, AnnotationTypeDeclaration mAnnotation, TypeToTAbstractType mTypeToType,
			TAbstractType tType, Type mType, TypeToTAbstractType mAnnotationToAnnotation,
			AnnotationTypeMemberDeclaration mMember) {
		Object[] result_pattern_AnnotationTypeMember_2_4_solveCSP_binding = pattern_AnnotationTypeMember_2_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, access, pm, tAnnotation, mAnnotation, mTypeToType, tType, mType,
				mAnnotationToAnnotation, mMember);
		if (result_pattern_AnnotationTypeMember_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeMember_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeMember_2_4_solveCSP_black = pattern_AnnotationTypeMember_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeMember_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, access, pm, tAnnotation, mAnnotation, mTypeToType,
						tType, mType, mAnnotationToAnnotation, mMember };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeMember_2_5_checkCSP_expressionFBB(AnnotationTypeMember _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationTypeMember_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationTypeMember";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationTypeMember_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_10_1_initialbindings_blackBBBBBBBB(
			AnnotationTypeMember _this, Match match, TypeGraph pm, TAnnotationType tAnnotation, TAbstractType tType,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName) {
		if (!tAnnotation.equals(tType)) {
			return new Object[] { _this, match, pm, tAnnotation, tType, tSignature, tMember, tName };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_10_2_SolveCSP_bindingFBBBBBBBB(AnnotationTypeMember _this,
			Match match, TypeGraph pm, TAnnotationType tAnnotation, TAbstractType tType, TFieldSignature tSignature,
			TFieldDefinition tMember, TField tName) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, pm, tAnnotation, tType, tSignature, tMember,
				tName);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, pm, tAnnotation, tType, tSignature, tMember, tName };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_10_2_SolveCSP_bindingAndBlackFBBBBBBBB(
			AnnotationTypeMember _this, Match match, TypeGraph pm, TAnnotationType tAnnotation, TAbstractType tType,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName) {
		Object[] result_pattern_AnnotationTypeMember_10_2_SolveCSP_binding = pattern_AnnotationTypeMember_10_2_SolveCSP_bindingFBBBBBBBB(
				_this, match, pm, tAnnotation, tType, tSignature, tMember, tName);
		if (result_pattern_AnnotationTypeMember_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeMember_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeMember_10_2_SolveCSP_black = pattern_AnnotationTypeMember_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeMember_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, pm, tAnnotation, tType, tSignature, tMember, tName };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeMember_10_3_CheckCSP_expressionFBB(AnnotationTypeMember _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_10_4_collectelementstobetranslated_blackBBBBBBB(
			Match match, TypeGraph pm, TAnnotationType tAnnotation, TAbstractType tType, TFieldSignature tSignature,
			TFieldDefinition tMember, TField tName) {
		if (!tAnnotation.equals(tType)) {
			return new Object[] { match, pm, tAnnotation, tType, tSignature, tMember, tName };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_10_4_collectelementstobetranslated_greenBBBBBBBFFFFFFFFFF(
			Match match, TypeGraph pm, TAnnotationType tAnnotation, TAbstractType tType, TFieldSignature tSignature,
			TFieldDefinition tMember, TField tName) {
		EMoflonEdge tAnnotation__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAnnotation____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tMember____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__pm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tSignature);
		match.getToBeTranslatedNodes().add(tMember);
		match.getToBeTranslatedNodes().add(tName);
		String tAnnotation__tMember____defines_name_prime = "defines";
		String tMember__tAnnotation____definedBy_name_prime = "definedBy";
		String tSignature__tMember____definitions_name_prime = "definitions";
		String tMember__tSignature____signature_name_prime = "signature";
		String tSignature__tType____type_name_prime = "type";
		String tAnnotation__tSignature____signature_name_prime = "signature";
		String tName__pm____model_name_prime = "model";
		String pm__tName____fields_name_prime = "fields";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____field_name_prime = "field";
		tAnnotation__tMember____defines.setSrc(tAnnotation);
		tAnnotation__tMember____defines.setTrg(tMember);
		match.getToBeTranslatedEdges().add(tAnnotation__tMember____defines);
		tMember__tAnnotation____definedBy.setSrc(tMember);
		tMember__tAnnotation____definedBy.setTrg(tAnnotation);
		match.getToBeTranslatedEdges().add(tMember__tAnnotation____definedBy);
		tSignature__tMember____definitions.setSrc(tSignature);
		tSignature__tMember____definitions.setTrg(tMember);
		match.getToBeTranslatedEdges().add(tSignature__tMember____definitions);
		tMember__tSignature____signature.setSrc(tMember);
		tMember__tSignature____signature.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tMember__tSignature____signature);
		tSignature__tType____type.setSrc(tSignature);
		tSignature__tType____type.setTrg(tType);
		match.getToBeTranslatedEdges().add(tSignature__tType____type);
		tAnnotation__tSignature____signature.setSrc(tAnnotation);
		tAnnotation__tSignature____signature.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tAnnotation__tSignature____signature);
		tName__pm____model.setSrc(tName);
		tName__pm____model.setTrg(pm);
		match.getToBeTranslatedEdges().add(tName__pm____model);
		pm__tName____fields.setSrc(pm);
		pm__tName____fields.setTrg(tName);
		match.getToBeTranslatedEdges().add(pm__tName____fields);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tName__tSignature____signatures);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		match.getToBeTranslatedEdges().add(tSignature__tName____field);
		tAnnotation__tMember____defines.setName(tAnnotation__tMember____defines_name_prime);
		tMember__tAnnotation____definedBy.setName(tMember__tAnnotation____definedBy_name_prime);
		tSignature__tMember____definitions.setName(tSignature__tMember____definitions_name_prime);
		tMember__tSignature____signature.setName(tMember__tSignature____signature_name_prime);
		tSignature__tType____type.setName(tSignature__tType____type_name_prime);
		tAnnotation__tSignature____signature.setName(tAnnotation__tSignature____signature_name_prime);
		tName__pm____model.setName(tName__pm____model_name_prime);
		pm__tName____fields.setName(pm__tName____fields_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		return new Object[] { match, pm, tAnnotation, tType, tSignature, tMember, tName,
				tAnnotation__tMember____defines, tMember__tAnnotation____definedBy, tSignature__tMember____definitions,
				tMember__tSignature____signature, tSignature__tType____type, tAnnotation__tSignature____signature,
				tName__pm____model, pm__tName____fields, tName__tSignature____signatures, tSignature__tName____field };
	}

	public static final Object[] pattern_AnnotationTypeMember_10_5_collectcontextelements_blackBBBBBBB(Match match,
			TypeGraph pm, TAnnotationType tAnnotation, TAbstractType tType, TFieldSignature tSignature,
			TFieldDefinition tMember, TField tName) {
		if (!tAnnotation.equals(tType)) {
			return new Object[] { match, pm, tAnnotation, tType, tSignature, tMember, tName };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_10_5_collectcontextelements_greenBBBBFF(Match match,
			TypeGraph pm, TAnnotationType tAnnotation, TAbstractType tType) {
		EMoflonEdge tAnnotation__pm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__tAnnotation____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(pm);
		match.getContextNodes().add(tAnnotation);
		match.getContextNodes().add(tType);
		String tAnnotation__pm____model_name_prime = "model";
		String pm__tAnnotation____allTypes_name_prime = "allTypes";
		tAnnotation__pm____model.setSrc(tAnnotation);
		tAnnotation__pm____model.setTrg(pm);
		match.getContextEdges().add(tAnnotation__pm____model);
		pm__tAnnotation____allTypes.setSrc(pm);
		pm__tAnnotation____allTypes.setTrg(tAnnotation);
		match.getContextEdges().add(pm__tAnnotation____allTypes);
		tAnnotation__pm____model.setName(tAnnotation__pm____model_name_prime);
		pm__tAnnotation____allTypes.setName(pm__tAnnotation____allTypes_name_prime);
		return new Object[] { match, pm, tAnnotation, tType, tAnnotation__pm____model, pm__tAnnotation____allTypes };
	}

	public static final void pattern_AnnotationTypeMember_10_6_registerobjectstomatch_expressionBBBBBBBB(
			AnnotationTypeMember _this, Match match, TypeGraph pm, TAnnotationType tAnnotation, TAbstractType tType,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName) {
		_this.registerObjectsToMatch_BWD(match, pm, tAnnotation, tType, tSignature, tMember, tName);

	}

	public static final boolean pattern_AnnotationTypeMember_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeMember_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_11_1_performtransformation_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("pm");
		EObject _localVariable_1 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_2 = isApplicableMatch.getObject("mAnnotation");
		EObject _localVariable_3 = isApplicableMatch.getObject("mTypeToType");
		EObject _localVariable_4 = isApplicableMatch.getObject("tType");
		EObject _localVariable_5 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_6 = isApplicableMatch.getObject("mType");
		EObject _localVariable_7 = isApplicableMatch.getObject("mAnnotationToAnnotation");
		EObject _localVariable_8 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_9 = isApplicableMatch.getObject("tName");
		EObject tmpPm = _localVariable_0;
		EObject tmpTAnnotation = _localVariable_1;
		EObject tmpMAnnotation = _localVariable_2;
		EObject tmpMTypeToType = _localVariable_3;
		EObject tmpTType = _localVariable_4;
		EObject tmpTSignature = _localVariable_5;
		EObject tmpMType = _localVariable_6;
		EObject tmpMAnnotationToAnnotation = _localVariable_7;
		EObject tmpTMember = _localVariable_8;
		EObject tmpTName = _localVariable_9;
		if (tmpPm instanceof TypeGraph) {
			TypeGraph pm = (TypeGraph) tmpPm;
			if (tmpTAnnotation instanceof TAnnotationType) {
				TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
				if (tmpMAnnotation instanceof AnnotationTypeDeclaration) {
					AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) tmpMAnnotation;
					if (tmpMTypeToType instanceof TypeToTAbstractType) {
						TypeToTAbstractType mTypeToType = (TypeToTAbstractType) tmpMTypeToType;
						if (tmpTType instanceof TAbstractType) {
							TAbstractType tType = (TAbstractType) tmpTType;
							if (tmpTSignature instanceof TFieldSignature) {
								TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
								if (tmpMType instanceof Type) {
									Type mType = (Type) tmpMType;
									if (tmpMAnnotationToAnnotation instanceof TypeToTAbstractType) {
										TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) tmpMAnnotationToAnnotation;
										if (tmpTMember instanceof TFieldDefinition) {
											TFieldDefinition tMember = (TFieldDefinition) tmpTMember;
											if (tmpTName instanceof TField) {
												TField tName = (TField) tmpTName;
												return new Object[] { pm, tAnnotation, mAnnotation, mTypeToType, tType,
														tSignature, mType, mAnnotationToAnnotation, tMember, tName,
														isApplicableMatch };
											}
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

	public static final Object[] pattern_AnnotationTypeMember_11_1_performtransformation_blackBBBBBBBBBBFBB(
			TypeGraph pm, TAnnotationType tAnnotation, AnnotationTypeDeclaration mAnnotation,
			TypeToTAbstractType mTypeToType, TAbstractType tType, TFieldSignature tSignature, Type mType,
			TypeToTAbstractType mAnnotationToAnnotation, TFieldDefinition tMember, TField tName,
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch) {
		if (!tAnnotation.equals(tType)) {
			if (!mAnnotation.equals(mType)) {
				if (!mAnnotationToAnnotation.equals(mTypeToType)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { pm, tAnnotation, mAnnotation, mTypeToType, tType, tSignature, mType,
									mAnnotationToAnnotation, tMember, tName, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationTypeMember_11_1_performtransformation_binding = pattern_AnnotationTypeMember_11_1_performtransformation_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationTypeMember_11_1_performtransformation_binding != null) {
			TypeGraph pm = (TypeGraph) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[0];
			TAnnotationType tAnnotation = (TAnnotationType) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[1];
			AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[2];
			TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[3];
			TAbstractType tType = (TAbstractType) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[4];
			TFieldSignature tSignature = (TFieldSignature) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[5];
			Type mType = (Type) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[6];
			TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[7];
			TFieldDefinition tMember = (TFieldDefinition) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[8];
			TField tName = (TField) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[9];

			Object[] result_pattern_AnnotationTypeMember_11_1_performtransformation_black = pattern_AnnotationTypeMember_11_1_performtransformation_blackBBBBBBBBBBFBB(
					pm, tAnnotation, mAnnotation, mTypeToType, tType, tSignature, mType, mAnnotationToAnnotation,
					tMember, tName, _this, isApplicableMatch);
			if (result_pattern_AnnotationTypeMember_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationTypeMember_11_1_performtransformation_black[10];

				return new Object[] { pm, tAnnotation, mAnnotation, mTypeToType, tType, tSignature, mType,
						mAnnotationToAnnotation, tMember, tName, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_11_1_performtransformation_greenFBFFBBFB(
			AnnotationTypeDeclaration mAnnotation, Type mType, TFieldDefinition tMember, CSP csp) {
		TypeAccess access = JavaFactory.eINSTANCE.createTypeAccess();
		ASTNodeToTAnnotatable anntotatableToTannotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MDefinitionToTMember memberToMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		AnnotationTypeMemberDeclaration mMember = JavaFactory.eINSTANCE.createAnnotationTypeMemberDeclaration();
		Object _localVariable_0 = csp.getValue("mMember", "name");
		access.setType(mType);
		anntotatableToTannotatable.setTarget(tMember);
		memberToMember.setTarget(tMember);
		mAnnotation.getBodyDeclarations().add(mMember);
		mMember.setType(access);
		anntotatableToTannotatable.setSource(mMember);
		memberToMember.setSource(mMember);
		String mMember_name_prime = (String) _localVariable_0;
		mMember.setName(mMember_name_prime);
		return new Object[] { access, mAnnotation, anntotatableToTannotatable, memberToMember, mType, tMember, mMember,
				csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_11_2_collecttranslatedelements_blackBBBBBBB(
			TypeAccess access, ASTNodeToTAnnotatable anntotatableToTannotatable, MDefinitionToTMember memberToMember,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName,
			AnnotationTypeMemberDeclaration mMember) {
		return new Object[] { access, anntotatableToTannotatable, memberToMember, tSignature, tMember, tName, mMember };
	}

	public static final Object[] pattern_AnnotationTypeMember_11_2_collecttranslatedelements_greenFBBBBBBB(
			TypeAccess access, ASTNodeToTAnnotatable anntotatableToTannotatable, MDefinitionToTMember memberToMember,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName,
			AnnotationTypeMemberDeclaration mMember) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(access);
		ruleresult.getCreatedLinkElements().add(anntotatableToTannotatable);
		ruleresult.getCreatedLinkElements().add(memberToMember);
		ruleresult.getTranslatedElements().add(tSignature);
		ruleresult.getTranslatedElements().add(tMember);
		ruleresult.getTranslatedElements().add(tName);
		ruleresult.getCreatedElements().add(mMember);
		return new Object[] { ruleresult, access, anntotatableToTannotatable, memberToMember, tSignature, tMember,
				tName, mMember };
	}

	public static final Object[] pattern_AnnotationTypeMember_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject access, EObject pm, EObject tAnnotation, EObject mAnnotation,
			EObject anntotatableToTannotatable, EObject mTypeToType, EObject memberToMember, EObject tType,
			EObject tSignature, EObject mType, EObject mAnnotationToAnnotation, EObject tMember, EObject tName,
			EObject mMember) {
		if (!access.equals(pm)) {
			if (!access.equals(tAnnotation)) {
				if (!access.equals(mAnnotation)) {
					if (!access.equals(anntotatableToTannotatable)) {
						if (!access.equals(mTypeToType)) {
							if (!access.equals(memberToMember)) {
								if (!access.equals(tType)) {
									if (!access.equals(tSignature)) {
										if (!access.equals(mType)) {
											if (!access.equals(mAnnotationToAnnotation)) {
												if (!access.equals(tMember)) {
													if (!access.equals(tName)) {
														if (!access.equals(mMember)) {
															if (!pm.equals(tAnnotation)) {
																if (!pm.equals(tType)) {
																	if (!pm.equals(tSignature)) {
																		if (!pm.equals(tMember)) {
																			if (!pm.equals(tName)) {
																				if (!tAnnotation.equals(tType)) {
																					if (!tAnnotation
																							.equals(tSignature)) {
																						if (!tAnnotation
																								.equals(tMember)) {
																							if (!tAnnotation
																									.equals(tName)) {
																								if (!mAnnotation
																										.equals(pm)) {
																									if (!mAnnotation
																											.equals(tAnnotation)) {
																										if (!mAnnotation
																												.equals(mTypeToType)) {
																											if (!mAnnotation
																													.equals(memberToMember)) {
																												if (!mAnnotation
																														.equals(tType)) {
																													if (!mAnnotation
																															.equals(tSignature)) {
																														if (!mAnnotation
																																.equals(mType)) {
																															if (!mAnnotation
																																	.equals(mAnnotationToAnnotation)) {
																																if (!mAnnotation
																																		.equals(tMember)) {
																																	if (!mAnnotation
																																			.equals(tName)) {
																																		if (!mAnnotation
																																				.equals(mMember)) {
																																			if (!anntotatableToTannotatable
																																					.equals(pm)) {
																																				if (!anntotatableToTannotatable
																																						.equals(tAnnotation)) {
																																					if (!anntotatableToTannotatable
																																							.equals(mAnnotation)) {
																																						if (!anntotatableToTannotatable
																																								.equals(mTypeToType)) {
																																							if (!anntotatableToTannotatable
																																									.equals(memberToMember)) {
																																								if (!anntotatableToTannotatable
																																										.equals(tType)) {
																																									if (!anntotatableToTannotatable
																																											.equals(tSignature)) {
																																										if (!anntotatableToTannotatable
																																												.equals(mType)) {
																																											if (!anntotatableToTannotatable
																																													.equals(mAnnotationToAnnotation)) {
																																												if (!anntotatableToTannotatable
																																														.equals(tMember)) {
																																													if (!anntotatableToTannotatable
																																															.equals(tName)) {
																																														if (!anntotatableToTannotatable
																																																.equals(mMember)) {
																																															if (!mTypeToType
																																																	.equals(pm)) {
																																																if (!mTypeToType
																																																		.equals(tAnnotation)) {
																																																	if (!mTypeToType
																																																			.equals(memberToMember)) {
																																																		if (!mTypeToType
																																																				.equals(tType)) {
																																																			if (!mTypeToType
																																																					.equals(tSignature)) {
																																																				if (!mTypeToType
																																																						.equals(tMember)) {
																																																					if (!mTypeToType
																																																							.equals(tName)) {
																																																						if (!memberToMember
																																																								.equals(pm)) {
																																																							if (!memberToMember
																																																									.equals(tAnnotation)) {
																																																								if (!memberToMember
																																																										.equals(tType)) {
																																																									if (!memberToMember
																																																											.equals(tSignature)) {
																																																										if (!memberToMember
																																																												.equals(tMember)) {
																																																											if (!memberToMember
																																																													.equals(tName)) {
																																																												if (!tSignature
																																																														.equals(tType)) {
																																																													if (!mType
																																																															.equals(pm)) {
																																																														if (!mType
																																																																.equals(tAnnotation)) {
																																																															if (!mType
																																																																	.equals(mTypeToType)) {
																																																																if (!mType
																																																																		.equals(memberToMember)) {
																																																																	if (!mType
																																																																			.equals(tType)) {
																																																																		if (!mType
																																																																				.equals(tSignature)) {
																																																																			if (!mType
																																																																					.equals(tMember)) {
																																																																				if (!mType
																																																																						.equals(tName)) {
																																																																					if (!mAnnotationToAnnotation
																																																																							.equals(pm)) {
																																																																						if (!mAnnotationToAnnotation
																																																																								.equals(tAnnotation)) {
																																																																							if (!mAnnotationToAnnotation
																																																																									.equals(mTypeToType)) {
																																																																								if (!mAnnotationToAnnotation
																																																																										.equals(memberToMember)) {
																																																																									if (!mAnnotationToAnnotation
																																																																											.equals(tType)) {
																																																																										if (!mAnnotationToAnnotation
																																																																												.equals(tSignature)) {
																																																																											if (!mAnnotationToAnnotation
																																																																													.equals(mType)) {
																																																																												if (!mAnnotationToAnnotation
																																																																														.equals(tMember)) {
																																																																													if (!mAnnotationToAnnotation
																																																																															.equals(tName)) {
																																																																														if (!mAnnotationToAnnotation
																																																																																.equals(mMember)) {
																																																																															if (!tMember
																																																																																	.equals(tType)) {
																																																																																if (!tMember
																																																																																		.equals(tSignature)) {
																																																																																	if (!tMember
																																																																																			.equals(tName)) {
																																																																																		if (!tName
																																																																																				.equals(tType)) {
																																																																																			if (!tName
																																																																																					.equals(tSignature)) {
																																																																																				if (!mMember
																																																																																						.equals(pm)) {
																																																																																					if (!mMember
																																																																																							.equals(tAnnotation)) {
																																																																																						if (!mMember
																																																																																								.equals(mTypeToType)) {
																																																																																							if (!mMember
																																																																																									.equals(memberToMember)) {
																																																																																								if (!mMember
																																																																																										.equals(tType)) {
																																																																																									if (!mMember
																																																																																											.equals(tSignature)) {
																																																																																										if (!mMember
																																																																																												.equals(mType)) {
																																																																																											if (!mMember
																																																																																													.equals(tMember)) {
																																																																																												if (!mMember
																																																																																														.equals(tName)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															access,
																																																																																															pm,
																																																																																															tAnnotation,
																																																																																															mAnnotation,
																																																																																															anntotatableToTannotatable,
																																																																																															mTypeToType,
																																																																																															memberToMember,
																																																																																															tType,
																																																																																															tSignature,
																																																																																															mType,
																																																																																															mAnnotationToAnnotation,
																																																																																															tMember,
																																																																																															tName,
																																																																																															mMember };
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationTypeMember_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject access, EObject pm, EObject tAnnotation, EObject mAnnotation,
			EObject anntotatableToTannotatable, EObject memberToMember, EObject tType, EObject tSignature,
			EObject mType, EObject tMember, EObject tName, EObject mMember) {
		EMoflonEdge mAnnotation__mMember____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge access__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__access____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAnnotation____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tMember____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge memberToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge anntotatableToTannotatable__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__pm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__access____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge anntotatableToTannotatable__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge memberToMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationTypeMember";
		String mAnnotation__mMember____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMember__mAnnotation____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String access__mType____type_name_prime = "type";
		String mType__access____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String tAnnotation__tMember____defines_name_prime = "defines";
		String tMember__tAnnotation____definedBy_name_prime = "definedBy";
		String tSignature__tMember____definitions_name_prime = "definitions";
		String tMember__tSignature____signature_name_prime = "signature";
		String tSignature__tType____type_name_prime = "type";
		String tAnnotation__tSignature____signature_name_prime = "signature";
		String memberToMember__tMember____target_name_prime = "target";
		String anntotatableToTannotatable__tMember____target_name_prime = "target";
		String tName__pm____model_name_prime = "model";
		String pm__tName____fields_name_prime = "fields";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____field_name_prime = "field";
		String mMember__access____type_name_prime = "type";
		String anntotatableToTannotatable__mMember____source_name_prime = "source";
		String memberToMember__mMember____source_name_prime = "source";
		mAnnotation__mMember____bodyDeclarations.setSrc(mAnnotation);
		mAnnotation__mMember____bodyDeclarations.setTrg(mMember);
		ruleresult.getCreatedEdges().add(mAnnotation__mMember____bodyDeclarations);
		mMember__mAnnotation____abstractTypeDeclaration.setSrc(mMember);
		mMember__mAnnotation____abstractTypeDeclaration.setTrg(mAnnotation);
		ruleresult.getCreatedEdges().add(mMember__mAnnotation____abstractTypeDeclaration);
		access__mType____type.setSrc(access);
		access__mType____type.setTrg(mType);
		ruleresult.getCreatedEdges().add(access__mType____type);
		mType__access____usagesInTypeAccess.setSrc(mType);
		mType__access____usagesInTypeAccess.setTrg(access);
		ruleresult.getCreatedEdges().add(mType__access____usagesInTypeAccess);
		tAnnotation__tMember____defines.setSrc(tAnnotation);
		tAnnotation__tMember____defines.setTrg(tMember);
		ruleresult.getTranslatedEdges().add(tAnnotation__tMember____defines);
		tMember__tAnnotation____definedBy.setSrc(tMember);
		tMember__tAnnotation____definedBy.setTrg(tAnnotation);
		ruleresult.getTranslatedEdges().add(tMember__tAnnotation____definedBy);
		tSignature__tMember____definitions.setSrc(tSignature);
		tSignature__tMember____definitions.setTrg(tMember);
		ruleresult.getTranslatedEdges().add(tSignature__tMember____definitions);
		tMember__tSignature____signature.setSrc(tMember);
		tMember__tSignature____signature.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tMember__tSignature____signature);
		tSignature__tType____type.setSrc(tSignature);
		tSignature__tType____type.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tSignature__tType____type);
		tAnnotation__tSignature____signature.setSrc(tAnnotation);
		tAnnotation__tSignature____signature.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tAnnotation__tSignature____signature);
		memberToMember__tMember____target.setSrc(memberToMember);
		memberToMember__tMember____target.setTrg(tMember);
		ruleresult.getCreatedEdges().add(memberToMember__tMember____target);
		anntotatableToTannotatable__tMember____target.setSrc(anntotatableToTannotatable);
		anntotatableToTannotatable__tMember____target.setTrg(tMember);
		ruleresult.getCreatedEdges().add(anntotatableToTannotatable__tMember____target);
		tName__pm____model.setSrc(tName);
		tName__pm____model.setTrg(pm);
		ruleresult.getTranslatedEdges().add(tName__pm____model);
		pm__tName____fields.setSrc(pm);
		pm__tName____fields.setTrg(tName);
		ruleresult.getTranslatedEdges().add(pm__tName____fields);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tName__tSignature____signatures);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		ruleresult.getTranslatedEdges().add(tSignature__tName____field);
		mMember__access____type.setSrc(mMember);
		mMember__access____type.setTrg(access);
		ruleresult.getCreatedEdges().add(mMember__access____type);
		anntotatableToTannotatable__mMember____source.setSrc(anntotatableToTannotatable);
		anntotatableToTannotatable__mMember____source.setTrg(mMember);
		ruleresult.getCreatedEdges().add(anntotatableToTannotatable__mMember____source);
		memberToMember__mMember____source.setSrc(memberToMember);
		memberToMember__mMember____source.setTrg(mMember);
		ruleresult.getCreatedEdges().add(memberToMember__mMember____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mAnnotation__mMember____bodyDeclarations.setName(mAnnotation__mMember____bodyDeclarations_name_prime);
		mMember__mAnnotation____abstractTypeDeclaration
				.setName(mMember__mAnnotation____abstractTypeDeclaration_name_prime);
		access__mType____type.setName(access__mType____type_name_prime);
		mType__access____usagesInTypeAccess.setName(mType__access____usagesInTypeAccess_name_prime);
		tAnnotation__tMember____defines.setName(tAnnotation__tMember____defines_name_prime);
		tMember__tAnnotation____definedBy.setName(tMember__tAnnotation____definedBy_name_prime);
		tSignature__tMember____definitions.setName(tSignature__tMember____definitions_name_prime);
		tMember__tSignature____signature.setName(tMember__tSignature____signature_name_prime);
		tSignature__tType____type.setName(tSignature__tType____type_name_prime);
		tAnnotation__tSignature____signature.setName(tAnnotation__tSignature____signature_name_prime);
		memberToMember__tMember____target.setName(memberToMember__tMember____target_name_prime);
		anntotatableToTannotatable__tMember____target.setName(anntotatableToTannotatable__tMember____target_name_prime);
		tName__pm____model.setName(tName__pm____model_name_prime);
		pm__tName____fields.setName(pm__tName____fields_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		mMember__access____type.setName(mMember__access____type_name_prime);
		anntotatableToTannotatable__mMember____source.setName(anntotatableToTannotatable__mMember____source_name_prime);
		memberToMember__mMember____source.setName(memberToMember__mMember____source_name_prime);
		return new Object[] { ruleresult, access, pm, tAnnotation, mAnnotation, anntotatableToTannotatable,
				memberToMember, tType, tSignature, mType, tMember, tName, mMember,
				mAnnotation__mMember____bodyDeclarations, mMember__mAnnotation____abstractTypeDeclaration,
				access__mType____type, mType__access____usagesInTypeAccess, tAnnotation__tMember____defines,
				tMember__tAnnotation____definedBy, tSignature__tMember____definitions, tMember__tSignature____signature,
				tSignature__tType____type, tAnnotation__tSignature____signature, memberToMember__tMember____target,
				anntotatableToTannotatable__tMember____target, tName__pm____model, pm__tName____fields,
				tName__tSignature____signatures, tSignature__tName____field, mMember__access____type,
				anntotatableToTannotatable__mMember____source, memberToMember__mMember____source };
	}

	public static final void pattern_AnnotationTypeMember_11_5_registerobjects_expressionBBBBBBBBBBBBBBBB(
			AnnotationTypeMember _this, PerformRuleResult ruleresult, EObject access, EObject pm, EObject tAnnotation,
			EObject mAnnotation, EObject anntotatableToTannotatable, EObject mTypeToType, EObject memberToMember,
			EObject tType, EObject tSignature, EObject mType, EObject mAnnotationToAnnotation, EObject tMember,
			EObject tName, EObject mMember) {
		_this.registerObjects_BWD(ruleresult, access, pm, tAnnotation, mAnnotation, anntotatableToTannotatable,
				mTypeToType, memberToMember, tType, tSignature, mType, mAnnotationToAnnotation, tMember, tName,
				mMember);

	}

	public static final PerformRuleResult pattern_AnnotationTypeMember_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_12_1_preparereturnvalue_bindingFB(
			AnnotationTypeMember _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_12_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationTypeMember _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationTypeMember _this) {
		Object[] result_pattern_AnnotationTypeMember_12_1_preparereturnvalue_binding = pattern_AnnotationTypeMember_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeMember_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationTypeMember_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeMember_12_1_preparereturnvalue_black = pattern_AnnotationTypeMember_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationTypeMember_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationTypeMember_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationTypeMember";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationTypeMember_12_2_corematch_bindingFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("pm");
		EObject _localVariable_1 = match.getObject("tAnnotation");
		EObject _localVariable_2 = match.getObject("tType");
		EObject _localVariable_3 = match.getObject("tSignature");
		EObject _localVariable_4 = match.getObject("tMember");
		EObject _localVariable_5 = match.getObject("tName");
		EObject tmpPm = _localVariable_0;
		EObject tmpTAnnotation = _localVariable_1;
		EObject tmpTType = _localVariable_2;
		EObject tmpTSignature = _localVariable_3;
		EObject tmpTMember = _localVariable_4;
		EObject tmpTName = _localVariable_5;
		if (tmpPm instanceof TypeGraph) {
			TypeGraph pm = (TypeGraph) tmpPm;
			if (tmpTAnnotation instanceof TAnnotationType) {
				TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
				if (tmpTType instanceof TAbstractType) {
					TAbstractType tType = (TAbstractType) tmpTType;
					if (tmpTSignature instanceof TFieldSignature) {
						TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
						if (tmpTMember instanceof TFieldDefinition) {
							TFieldDefinition tMember = (TFieldDefinition) tmpTMember;
							if (tmpTName instanceof TField) {
								TField tName = (TField) tmpTName;
								return new Object[] { pm, tAnnotation, tType, tSignature, tMember, tName, match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeMember_12_2_corematch_blackBBFFBBFFBBB(TypeGraph pm,
			TAnnotationType tAnnotation, TAbstractType tType, TFieldSignature tSignature, TFieldDefinition tMember,
			TField tName, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tAnnotation.equals(tType)) {
			int tSignature_lowerBound = tSignature.getLowerBound();
			if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
				for (TypeToTAbstractType mTypeToType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
					Type mType = mTypeToType.getSource();
					if (mType != null) {
						for (TypeToTAbstractType mAnnotationToAnnotation : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tAnnotation, TypeToTAbstractType.class, "target")) {
							if (!mAnnotationToAnnotation.equals(mTypeToType)) {
								Type tmpMAnnotation = mAnnotationToAnnotation.getSource();
								if (tmpMAnnotation instanceof AnnotationTypeDeclaration) {
									AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) tmpMAnnotation;
									if (!mAnnotation.equals(mType)) {
										_result.add(new Object[] { pm, tAnnotation, mAnnotation, mTypeToType, tType,
												tSignature, mType, mAnnotationToAnnotation, tMember, tName, match });
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

	public static final Iterable<Object[]> pattern_AnnotationTypeMember_12_3_findcontext_blackBBBBBBBBBB(TypeGraph pm,
			TAnnotationType tAnnotation, AnnotationTypeDeclaration mAnnotation, TypeToTAbstractType mTypeToType,
			TAbstractType tType, TFieldSignature tSignature, Type mType, TypeToTAbstractType mAnnotationToAnnotation,
			TFieldDefinition tMember, TField tName) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tAnnotation.equals(tType)) {
			if (!mAnnotation.equals(mType)) {
				if (!mAnnotationToAnnotation.equals(mTypeToType)) {
					if (tAnnotation.getDefines().contains(tMember)) {
						if (tSignature.getDefinitions().contains(tMember)) {
							if (tType.equals(tSignature.getType())) {
								if (tAnnotation.getSignature().contains(tSignature)) {
									if (tType.equals(mTypeToType.getTarget())) {
										if (mAnnotation.equals(mAnnotationToAnnotation.getSource())) {
											if (tAnnotation.equals(mAnnotationToAnnotation.getTarget())) {
												if (mType.equals(mTypeToType.getSource())) {
													if (pm.equals(tAnnotation.getModel())) {
														if (pm.equals(tName.getModel())) {
															if (tName.getSignatures().contains(tSignature)) {
																int tSignature_lowerBound = tSignature.getLowerBound();
																if (Integer.valueOf(tSignature_lowerBound)
																		.equals(Integer.valueOf(0))) {
																	_result.add(new Object[] { pm, tAnnotation,
																			mAnnotation, mTypeToType, tType, tSignature,
																			mType, mAnnotationToAnnotation, tMember,
																			tName });
																}

															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationTypeMember_12_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFFFF(
			TypeGraph pm, TAnnotationType tAnnotation, AnnotationTypeDeclaration mAnnotation,
			TypeToTAbstractType mTypeToType, TAbstractType tType, TFieldSignature tSignature, Type mType,
			TypeToTAbstractType mAnnotationToAnnotation, TFieldDefinition tMember, TField tName) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tAnnotation__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAnnotation____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tMember____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationToAnnotation__mAnnotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationToAnnotation__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__pm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__tAnnotation____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__pm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tAnnotation__tMember____defines_name_prime = "defines";
		String tMember__tAnnotation____definedBy_name_prime = "definedBy";
		String tSignature__tMember____definitions_name_prime = "definitions";
		String tMember__tSignature____signature_name_prime = "signature";
		String tSignature__tType____type_name_prime = "type";
		String tAnnotation__tSignature____signature_name_prime = "signature";
		String mTypeToType__tType____target_name_prime = "target";
		String mAnnotationToAnnotation__mAnnotation____source_name_prime = "source";
		String mAnnotationToAnnotation__tAnnotation____target_name_prime = "target";
		String mTypeToType__mType____source_name_prime = "source";
		String tAnnotation__pm____model_name_prime = "model";
		String pm__tAnnotation____allTypes_name_prime = "allTypes";
		String tName__pm____model_name_prime = "model";
		String pm__tName____fields_name_prime = "fields";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____field_name_prime = "field";
		isApplicableMatch.getAllContextElements().add(pm);
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mAnnotation);
		isApplicableMatch.getAllContextElements().add(mTypeToType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mAnnotationToAnnotation);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(tName);
		tAnnotation__tMember____defines.setSrc(tAnnotation);
		tAnnotation__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tMember____defines);
		tMember__tAnnotation____definedBy.setSrc(tMember);
		tMember__tAnnotation____definedBy.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tMember__tAnnotation____definedBy);
		tSignature__tMember____definitions.setSrc(tSignature);
		tSignature__tMember____definitions.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tSignature__tMember____definitions);
		tMember__tSignature____signature.setSrc(tMember);
		tMember__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tMember__tSignature____signature);
		tSignature__tType____type.setSrc(tSignature);
		tSignature__tType____type.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tSignature__tType____type);
		tAnnotation__tSignature____signature.setSrc(tAnnotation);
		tAnnotation__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tSignature____signature);
		mTypeToType__tType____target.setSrc(mTypeToType);
		mTypeToType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToType__tType____target);
		mAnnotationToAnnotation__mAnnotation____source.setSrc(mAnnotationToAnnotation);
		mAnnotationToAnnotation__mAnnotation____source.setTrg(mAnnotation);
		isApplicableMatch.getAllContextElements().add(mAnnotationToAnnotation__mAnnotation____source);
		mAnnotationToAnnotation__tAnnotation____target.setSrc(mAnnotationToAnnotation);
		mAnnotationToAnnotation__tAnnotation____target.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mAnnotationToAnnotation__tAnnotation____target);
		mTypeToType__mType____source.setSrc(mTypeToType);
		mTypeToType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToType__mType____source);
		tAnnotation__pm____model.setSrc(tAnnotation);
		tAnnotation__pm____model.setTrg(pm);
		isApplicableMatch.getAllContextElements().add(tAnnotation__pm____model);
		pm__tAnnotation____allTypes.setSrc(pm);
		pm__tAnnotation____allTypes.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(pm__tAnnotation____allTypes);
		tName__pm____model.setSrc(tName);
		tName__pm____model.setTrg(pm);
		isApplicableMatch.getAllContextElements().add(tName__pm____model);
		pm__tName____fields.setSrc(pm);
		pm__tName____fields.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(pm__tName____fields);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tName__tSignature____signatures);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(tSignature__tName____field);
		tAnnotation__tMember____defines.setName(tAnnotation__tMember____defines_name_prime);
		tMember__tAnnotation____definedBy.setName(tMember__tAnnotation____definedBy_name_prime);
		tSignature__tMember____definitions.setName(tSignature__tMember____definitions_name_prime);
		tMember__tSignature____signature.setName(tMember__tSignature____signature_name_prime);
		tSignature__tType____type.setName(tSignature__tType____type_name_prime);
		tAnnotation__tSignature____signature.setName(tAnnotation__tSignature____signature_name_prime);
		mTypeToType__tType____target.setName(mTypeToType__tType____target_name_prime);
		mAnnotationToAnnotation__mAnnotation____source
				.setName(mAnnotationToAnnotation__mAnnotation____source_name_prime);
		mAnnotationToAnnotation__tAnnotation____target
				.setName(mAnnotationToAnnotation__tAnnotation____target_name_prime);
		mTypeToType__mType____source.setName(mTypeToType__mType____source_name_prime);
		tAnnotation__pm____model.setName(tAnnotation__pm____model_name_prime);
		pm__tAnnotation____allTypes.setName(pm__tAnnotation____allTypes_name_prime);
		tName__pm____model.setName(tName__pm____model_name_prime);
		pm__tName____fields.setName(pm__tName____fields_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		return new Object[] { pm, tAnnotation, mAnnotation, mTypeToType, tType, tSignature, mType,
				mAnnotationToAnnotation, tMember, tName, isApplicableMatch, tAnnotation__tMember____defines,
				tMember__tAnnotation____definedBy, tSignature__tMember____definitions, tMember__tSignature____signature,
				tSignature__tType____type, tAnnotation__tSignature____signature, mTypeToType__tType____target,
				mAnnotationToAnnotation__mAnnotation____source, mAnnotationToAnnotation__tAnnotation____target,
				mTypeToType__mType____source, tAnnotation__pm____model, pm__tAnnotation____allTypes, tName__pm____model,
				pm__tName____fields, tName__tSignature____signatures, tSignature__tName____field };
	}

	public static final Object[] pattern_AnnotationTypeMember_12_4_solveCSP_bindingFBBBBBBBBBBBB(
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch, TypeGraph pm, TAnnotationType tAnnotation,
			AnnotationTypeDeclaration mAnnotation, TypeToTAbstractType mTypeToType, TAbstractType tType,
			TFieldSignature tSignature, Type mType, TypeToTAbstractType mAnnotationToAnnotation,
			TFieldDefinition tMember, TField tName) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, pm, tAnnotation, mAnnotation,
				mTypeToType, tType, tSignature, mType, mAnnotationToAnnotation, tMember, tName);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pm, tAnnotation, mAnnotation, mTypeToType, tType,
					tSignature, mType, mAnnotationToAnnotation, tMember, tName };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch, TypeGraph pm, TAnnotationType tAnnotation,
			AnnotationTypeDeclaration mAnnotation, TypeToTAbstractType mTypeToType, TAbstractType tType,
			TFieldSignature tSignature, Type mType, TypeToTAbstractType mAnnotationToAnnotation,
			TFieldDefinition tMember, TField tName) {
		Object[] result_pattern_AnnotationTypeMember_12_4_solveCSP_binding = pattern_AnnotationTypeMember_12_4_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, pm, tAnnotation, mAnnotation, mTypeToType, tType, tSignature, mType,
				mAnnotationToAnnotation, tMember, tName);
		if (result_pattern_AnnotationTypeMember_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeMember_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeMember_12_4_solveCSP_black = pattern_AnnotationTypeMember_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeMember_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pm, tAnnotation, mAnnotation, mTypeToType, tType,
						tSignature, mType, mAnnotationToAnnotation, tMember, tName };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeMember_12_5_checkCSP_expressionFBB(AnnotationTypeMember _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationTypeMember_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationTypeMember";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationTypeMember_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_20_1_preparereturnvalue_bindingFB(
			AnnotationTypeMember _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnnotationTypeMember _this) {
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

	public static final Object[] pattern_AnnotationTypeMember_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationTypeMember _this) {
		Object[] result_pattern_AnnotationTypeMember_20_1_preparereturnvalue_binding = pattern_AnnotationTypeMember_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeMember_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationTypeMember_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeMember_20_1_preparereturnvalue_black = pattern_AnnotationTypeMember_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationTypeMember_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationTypeMember_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationTypeMember_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_0BB(
			TFieldSignature tSignature, TField tName) {
		TField __DEC_tSignature_field_95833 = tSignature.getField();
		if (__DEC_tSignature_field_95833 != null) {
			if (!tName.equals(__DEC_tSignature_field_95833)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_1BB(
			TFieldDefinition tMember, TFieldSignature tSignature) {
		TSignature __DEC_tMember_signature_609792 = tMember.getSignature();
		if (__DEC_tMember_signature_609792 != null) {
			if (!tSignature.equals(__DEC_tMember_signature_609792)) {
				return new Object[] { tMember, tSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_2B(
			TFieldDefinition tMember) {
		TModule __DEC_tMember_contains_875133 = tMember.getModule();
		if (__DEC_tMember_contains_875133 != null) {
			return new Object[] { tMember };
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_3BB(
			TFieldDefinition tMember, TFieldSignature tSignature) {
		TSignature __DEC_tMember_definitions_814345 = tMember.getSignature();
		if (__DEC_tMember_definitions_814345 != null) {
			if (!tSignature.equals(__DEC_tMember_definitions_814345)) {
				return new Object[] { tMember, tSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_4BB(TField tName,
			TypeGraph pm) {
		TypeGraph __DEC_tName_fields_907866 = tName.getModel();
		if (__DEC_tName_fields_907866 != null) {
			if (!pm.equals(__DEC_tName_fields_907866)) {
				return new Object[] { tName, pm };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeMember_20_2_testcorematchandDECs_blackFFFFFFB(
			EMoflonEdge _edge_defines) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTAnnotation = _edge_defines.getSrc();
		if (tmpTAnnotation instanceof TAnnotationType) {
			TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
			EObject tmpTMember = _edge_defines.getTrg();
			if (tmpTMember instanceof TFieldDefinition) {
				TFieldDefinition tMember = (TFieldDefinition) tmpTMember;
				if (tAnnotation.getDefines().contains(tMember)) {
					TypeGraph pm = tAnnotation.getModel();
					if (pm != null) {
						TSignature tmpTSignature = tMember.getSignature();
						if (tmpTSignature instanceof TFieldSignature) {
							TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
							if (tAnnotation.getSignature().contains(tSignature)) {
								TAbstractType tType = tSignature.getType();
								if (tType != null) {
									if (!tAnnotation.equals(tType)) {
										TField tName = tSignature.getField();
										if (tName != null) {
											if (pm.equals(tName.getModel())) {
												int tSignature_lowerBound = tSignature.getLowerBound();
												if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
													if (pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_2B(
															tMember) == null) {
														if (pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_1BB(
																tMember, tSignature) == null) {
															if (pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_3BB(
																	tMember, tSignature) == null) {
																if (pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_0BB(
																		tSignature, tName) == null) {
																	if (pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_4BB(
																			tName, pm) == null) {
																		_result.add(new Object[] { pm, tAnnotation,
																				tType, tSignature, tMember, tName,
																				_edge_defines });
																	}
																}
															}
														}
													}
												}

											}
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

	public static final Object[] pattern_AnnotationTypeMember_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationTypeMember_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
			AnnotationTypeMember _this, Match match, TypeGraph pm, TAnnotationType tAnnotation, TAbstractType tType,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, pm, tAnnotation, tType, tSignature, tMember, tName);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeMember_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationTypeMember _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationTypeMember_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_1_preparereturnvalue_bindingFB(
			AnnotationTypeMember _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnnotationTypeMember _this) {
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

	public static final Object[] pattern_AnnotationTypeMember_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationTypeMember _this) {
		Object[] result_pattern_AnnotationTypeMember_21_1_preparereturnvalue_binding = pattern_AnnotationTypeMember_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeMember_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationTypeMember_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeMember_21_1_preparereturnvalue_black = pattern_AnnotationTypeMember_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationTypeMember_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationTypeMember_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationTypeMember_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_0BBB(
			TypeAccess access, AnnotationTypeDeclaration mAnnotation, Type mType) {
		if (!mAnnotation.equals(mType)) {
			for (AbstractTypeDeclaration __DEC_access_superInterfaces_353305 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(access, AbstractTypeDeclaration.class, "superInterfaces")) {
				if (!mAnnotation.equals(__DEC_access_superInterfaces_353305)) {
					if (!mType.equals(__DEC_access_superInterfaces_353305)) {
						return new Object[] { access, mAnnotation, mType };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess access) {
		for (Annotation __DEC_access_type_400803 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, Annotation.class, "type")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_2BB(TypeAccess access,
			Type mType) {
		for (ArrayType __DEC_access_elementType_169478 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ArrayType.class, "elementType")) {
			if (!mType.equals(__DEC_access_elementType_169478)) {
				return new Object[] { access, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_3B(
			TypeAccess access) {
		for (ClassInstanceCreation __DEC_access_type_738362 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ClassInstanceCreation.class, "type")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_4BB(TypeAccess access,
			Type mType) {
		for (ClassDeclaration __DEC_access_superClass_729123 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ClassDeclaration.class, "superClass")) {
			if (!mType.equals(__DEC_access_superClass_729123)) {
				return new Object[] { access, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess access) {
		for (MethodDeclaration __DEC_access_returnType_492342 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, MethodDeclaration.class, "returnType")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_6BB(TypeAccess access,
			Type mType) {
		for (ParameterizedType __DEC_access_type_57803 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ParameterizedType.class, "type")) {
			if (!mType.equals(__DEC_access_type_57803)) {
				return new Object[] { access, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_7B(
			TypeAccess access) {
		for (TypeLiteral __DEC_access_type_194601 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, TypeLiteral.class, "type")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_8B(
			TypeAccess access) {
		for (AnnotationMemberValuePair __DEC_access_value_465339 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_9BBB(
			AnnotationTypeMemberDeclaration mMember, AnnotationTypeDeclaration mAnnotation, Type mType) {
		if (!mAnnotation.equals(mType)) {
			AbstractTypeDeclaration __DEC_mMember_abstractTypeDeclaration_909470 = mMember.getAbstractTypeDeclaration();
			if (__DEC_mMember_abstractTypeDeclaration_909470 != null) {
				if (!mAnnotation.equals(__DEC_mMember_abstractTypeDeclaration_909470)) {
					if (!mType.equals(__DEC_mMember_abstractTypeDeclaration_909470)) {
						return new Object[] { mMember, mAnnotation, mType };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_10B(
			AnnotationTypeMemberDeclaration mMember) {
		AnonymousClassDeclaration __DEC_mMember_anonymousClassDeclarationOwner_318035 = mMember
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mMember_anonymousClassDeclarationOwner_318035 != null) {
			return new Object[] { mMember };
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_11BB(
			AnnotationTypeDeclaration mAnnotation, TypeAccess access) {
		if (mAnnotation.getSuperInterfaces().contains(access)) {
			return new Object[] { mAnnotation, access };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeMember_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMAnnotation = _edge_bodyDeclarations.getSrc();
		if (tmpMAnnotation instanceof AnnotationTypeDeclaration) {
			AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) tmpMAnnotation;
			EObject tmpMMember = _edge_bodyDeclarations.getTrg();
			if (tmpMMember instanceof AnnotationTypeMemberDeclaration) {
				AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) tmpMMember;
				if (mAnnotation.getBodyDeclarations().contains(mMember)) {
					TypeAccess access = mMember.getType();
					if (access != null) {
						Type mType = access.getType();
						if (mType != null) {
							if (!mAnnotation.equals(mType)) {
								if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_10B(
										mMember) == null) {
									if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_1B(
											access) == null) {
										if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_3B(
												access) == null) {
											if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_5B(
													access) == null) {
												if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_7B(
														access) == null) {
													if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_8B(
															access) == null) {
														if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_11BB(
																mAnnotation, access) == null) {
															if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_0BBB(
																	access, mAnnotation, mType) == null) {
																if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_2BB(
																		access, mType) == null) {
																	if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_4BB(
																			access, mType) == null) {
																		if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_6BB(
																				access, mType) == null) {
																			if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_9BBB(
																					mMember, mAnnotation,
																					mType) == null) {
																				_result.add(new Object[] { access,
																						mAnnotation, mType, mMember,
																						_edge_bodyDeclarations });
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationTypeMember_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			AnnotationTypeMember _this, Match match, TypeAccess access, AnnotationTypeDeclaration mAnnotation,
			Type mType, AnnotationTypeMemberDeclaration mMember) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, access, mAnnotation, mType, mMember);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeMember_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationTypeMember _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationTypeMember_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_24_1_prepare_blackB(AnnotationTypeMember _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationTypeMember_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("access");
		EObject _localVariable_1 = targetMatch.getObject("pm");
		EObject _localVariable_2 = targetMatch.getObject("tAnnotation");
		EObject _localVariable_3 = sourceMatch.getObject("mAnnotation");
		EObject _localVariable_4 = targetMatch.getObject("tType");
		EObject _localVariable_5 = targetMatch.getObject("tSignature");
		EObject _localVariable_6 = sourceMatch.getObject("mType");
		EObject _localVariable_7 = targetMatch.getObject("tMember");
		EObject _localVariable_8 = targetMatch.getObject("tName");
		EObject _localVariable_9 = sourceMatch.getObject("mMember");
		EObject tmpAccess = _localVariable_0;
		EObject tmpPm = _localVariable_1;
		EObject tmpTAnnotation = _localVariable_2;
		EObject tmpMAnnotation = _localVariable_3;
		EObject tmpTType = _localVariable_4;
		EObject tmpTSignature = _localVariable_5;
		EObject tmpMType = _localVariable_6;
		EObject tmpTMember = _localVariable_7;
		EObject tmpTName = _localVariable_8;
		EObject tmpMMember = _localVariable_9;
		if (tmpAccess instanceof TypeAccess) {
			TypeAccess access = (TypeAccess) tmpAccess;
			if (tmpPm instanceof TypeGraph) {
				TypeGraph pm = (TypeGraph) tmpPm;
				if (tmpTAnnotation instanceof TAnnotationType) {
					TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
					if (tmpMAnnotation instanceof AnnotationTypeDeclaration) {
						AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) tmpMAnnotation;
						if (tmpTType instanceof TAbstractType) {
							TAbstractType tType = (TAbstractType) tmpTType;
							if (tmpTSignature instanceof TFieldSignature) {
								TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
								if (tmpMType instanceof Type) {
									Type mType = (Type) tmpMType;
									if (tmpTMember instanceof TFieldDefinition) {
										TFieldDefinition tMember = (TFieldDefinition) tmpTMember;
										if (tmpTName instanceof TField) {
											TField tName = (TField) tmpTName;
											if (tmpMMember instanceof AnnotationTypeMemberDeclaration) {
												AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) tmpMMember;
												return new Object[] { access, pm, tAnnotation, mAnnotation, tType,
														tSignature, mType, tMember, tName, mMember, sourceMatch,
														targetMatch };
											}
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

	public static final Object[] pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
			TypeAccess access, TypeGraph pm, TAnnotationType tAnnotation, AnnotationTypeDeclaration mAnnotation,
			TAbstractType tType, TFieldSignature tSignature, Type mType, TFieldDefinition tMember, TField tName,
			AnnotationTypeMemberDeclaration mMember, Match sourceMatch, Match targetMatch) {
		if (!tAnnotation.equals(tType)) {
			if (!mAnnotation.equals(mType)) {
				if (!sourceMatch.equals(targetMatch)) {
					int tSignature_lowerBound = tSignature.getLowerBound();
					if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
						return new Object[] { access, pm, tAnnotation, mAnnotation, tType, tSignature, mType, tMember,
								tName, mMember, sourceMatch, targetMatch };
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding = pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding != null) {
			TypeAccess access = (TypeAccess) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[0];
			TypeGraph pm = (TypeGraph) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[1];
			TAnnotationType tAnnotation = (TAnnotationType) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[2];
			AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[3];
			TAbstractType tType = (TAbstractType) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[4];
			TFieldSignature tSignature = (TFieldSignature) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[5];
			Type mType = (Type) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[6];
			TFieldDefinition tMember = (TFieldDefinition) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[7];
			TField tName = (TField) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[8];
			AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_black = pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					access, pm, tAnnotation, mAnnotation, tType, tSignature, mType, tMember, tName, mMember,
					sourceMatch, targetMatch);
			if (result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { access, pm, tAnnotation, mAnnotation, tType, tSignature, mType, tMember, tName,
						mMember, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
			AnnotationTypeMember _this, TypeAccess access, TypeGraph pm, TAnnotationType tAnnotation,
			AnnotationTypeDeclaration mAnnotation, TAbstractType tType, TFieldSignature tSignature, Type mType,
			TFieldDefinition tMember, TField tName, AnnotationTypeMemberDeclaration mMember, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(access, pm, tAnnotation, mAnnotation, tType, tSignature,
				mType, tMember, tName, mMember, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, access, pm, tAnnotation, mAnnotation, tType, tSignature, mType, tMember,
					tName, mMember, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			AnnotationTypeMember _this, TypeAccess access, TypeGraph pm, TAnnotationType tAnnotation,
			AnnotationTypeDeclaration mAnnotation, TAbstractType tType, TFieldSignature tSignature, Type mType,
			TFieldDefinition tMember, TField tName, AnnotationTypeMemberDeclaration mMember, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_AnnotationTypeMember_24_3_solvecsp_binding = pattern_AnnotationTypeMember_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, access, pm, tAnnotation, mAnnotation, tType, tSignature, mType, tMember, tName, mMember,
				sourceMatch, targetMatch);
		if (result_pattern_AnnotationTypeMember_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeMember_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnnotationTypeMember_24_3_solvecsp_black = pattern_AnnotationTypeMember_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnnotationTypeMember_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, access, pm, tAnnotation, mAnnotation, tType, tSignature, mType,
						tMember, tName, mMember, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeMember_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeMember_24_5_matchcorrcontext_blackBBFBBFBB(
			TAnnotationType tAnnotation, AnnotationTypeDeclaration mAnnotation, TAbstractType tType, Type mType,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tAnnotation.equals(tType)) {
			if (!mAnnotation.equals(mType)) {
				if (!sourceMatch.equals(targetMatch)) {
					for (TypeToTAbstractType mTypeToType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
						if (mType.equals(mTypeToType.getSource())) {
							for (TypeToTAbstractType mAnnotationToAnnotation : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(mAnnotation, TypeToTAbstractType.class, "source")) {
								if (!mAnnotationToAnnotation.equals(mTypeToType)) {
									if (tAnnotation.equals(mAnnotationToAnnotation.getTarget())) {
										_result.add(new Object[] { tAnnotation, mAnnotation, mTypeToType, tType, mType,
												mAnnotationToAnnotation, sourceMatch, targetMatch });
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

	public static final Object[] pattern_AnnotationTypeMember_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType mTypeToType, TypeToTAbstractType mAnnotationToAnnotation, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnnotationTypeMember";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mTypeToType);
		ccMatch.getAllContextElements().add(mAnnotationToAnnotation);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mTypeToType, mAnnotationToAnnotation, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_AnnotationTypeMember_24_6_createcorrespondence_blackBBBBBBBBBBB(
			TypeAccess access, TypeGraph pm, TAnnotationType tAnnotation, AnnotationTypeDeclaration mAnnotation,
			TAbstractType tType, TFieldSignature tSignature, Type mType, TFieldDefinition tMember, TField tName,
			AnnotationTypeMemberDeclaration mMember, CCMatch ccMatch) {
		if (!tAnnotation.equals(tType)) {
			if (!mAnnotation.equals(mType)) {
				return new Object[] { access, pm, tAnnotation, mAnnotation, tType, tSignature, mType, tMember, tName,
						mMember, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_24_6_createcorrespondence_greenFFBBB(
			TFieldDefinition tMember, AnnotationTypeMemberDeclaration mMember, CCMatch ccMatch) {
		ASTNodeToTAnnotatable anntotatableToTannotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MDefinitionToTMember memberToMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		anntotatableToTannotatable.setTarget(tMember);
		anntotatableToTannotatable.setSource(mMember);
		ccMatch.getCreateCorr().add(anntotatableToTannotatable);
		memberToMember.setTarget(tMember);
		memberToMember.setSource(mMember);
		ccMatch.getCreateCorr().add(memberToMember);
		return new Object[] { anntotatableToTannotatable, memberToMember, tMember, mMember, ccMatch };
	}

	public static final Object[] pattern_AnnotationTypeMember_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AnnotationTypeMember_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AnnotationTypeMember";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationTypeMember_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_0BBB(TypeAccess access,
			AnnotationTypeDeclaration mAnnotation, Type mType) {
		if (!mAnnotation.equals(mType)) {
			for (AbstractTypeDeclaration __DEC_access_superInterfaces_682482 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(access, AbstractTypeDeclaration.class, "superInterfaces")) {
				if (!mAnnotation.equals(__DEC_access_superInterfaces_682482)) {
					if (!mType.equals(__DEC_access_superInterfaces_682482)) {
						return new Object[] { access, mAnnotation, mType };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_1B(TypeAccess access) {
		for (Annotation __DEC_access_type_838164 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, Annotation.class, "type")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_2BB(TypeAccess access,
			Type mType) {
		for (ArrayType __DEC_access_elementType_561207 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ArrayType.class, "elementType")) {
			if (!mType.equals(__DEC_access_elementType_561207)) {
				return new Object[] { access, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_3B(TypeAccess access) {
		for (ClassInstanceCreation __DEC_access_type_851695 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ClassInstanceCreation.class, "type")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_4BB(TypeAccess access,
			Type mType) {
		for (ClassDeclaration __DEC_access_superClass_192537 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ClassDeclaration.class, "superClass")) {
			if (!mType.equals(__DEC_access_superClass_192537)) {
				return new Object[] { access, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_5B(TypeAccess access) {
		for (MethodDeclaration __DEC_access_returnType_270483 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, MethodDeclaration.class, "returnType")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_6BB(TypeAccess access,
			Type mType) {
		for (ParameterizedType __DEC_access_type_363732 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ParameterizedType.class, "type")) {
			if (!mType.equals(__DEC_access_type_363732)) {
				return new Object[] { access, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_7B(TypeAccess access) {
		for (TypeLiteral __DEC_access_type_367482 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, TypeLiteral.class, "type")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_8B(TypeAccess access) {
		for (AnnotationMemberValuePair __DEC_access_value_130002 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_9BBB(
			AnnotationTypeMemberDeclaration mMember, AnnotationTypeDeclaration mAnnotation, Type mType) {
		if (!mAnnotation.equals(mType)) {
			AbstractTypeDeclaration __DEC_mMember_abstractTypeDeclaration_672016 = mMember.getAbstractTypeDeclaration();
			if (__DEC_mMember_abstractTypeDeclaration_672016 != null) {
				if (!mAnnotation.equals(__DEC_mMember_abstractTypeDeclaration_672016)) {
					if (!mType.equals(__DEC_mMember_abstractTypeDeclaration_672016)) {
						return new Object[] { mMember, mAnnotation, mType };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_10B(
			AnnotationTypeMemberDeclaration mMember) {
		AnonymousClassDeclaration __DEC_mMember_anonymousClassDeclarationOwner_500380 = mMember
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mMember_anonymousClassDeclarationOwner_500380 != null) {
			return new Object[] { mMember };
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_11BB(
			AnnotationTypeDeclaration mAnnotation, TypeAccess access) {
		if (mAnnotation.getSuperInterfaces().contains(access)) {
			return new Object[] { mAnnotation, access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_blackBBBB(TypeAccess access,
			AnnotationTypeDeclaration mAnnotation, Type mType, AnnotationTypeMemberDeclaration mMember) {
		if (!mAnnotation.equals(mType)) {
			if (mAnnotation.getBodyDeclarations().contains(mMember)) {
				if (mType.equals(access.getType())) {
					if (access.equals(mMember.getType())) {
						if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_0BBB(access, mAnnotation,
								mType) == null) {
							if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_1B(access) == null) {
								if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_2BB(access,
										mType) == null) {
									if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_3B(
											access) == null) {
										if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_4BB(access,
												mType) == null) {
											if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_5B(
													access) == null) {
												if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_6BB(
														access, mType) == null) {
													if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_7B(
															access) == null) {
														if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_8B(
																access) == null) {
															if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_9BBB(
																	mMember, mAnnotation, mType) == null) {
																if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_10B(
																		mMember) == null) {
																	if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_11BB(
																			mAnnotation, access) == null) {
																		return new Object[] { access, mAnnotation,
																				mType, mMember };
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_AnnotationTypeMember_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeMember_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_0BB(
			TFieldSignature tSignature, TField tName) {
		TField __DEC_tSignature_field_603978 = tSignature.getField();
		if (__DEC_tSignature_field_603978 != null) {
			if (!tName.equals(__DEC_tSignature_field_603978)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_1BB(
			TFieldDefinition tMember, TFieldSignature tSignature) {
		TSignature __DEC_tMember_signature_393283 = tMember.getSignature();
		if (__DEC_tMember_signature_393283 != null) {
			if (!tSignature.equals(__DEC_tMember_signature_393283)) {
				return new Object[] { tMember, tSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_2B(
			TFieldDefinition tMember) {
		TModule __DEC_tMember_contains_792659 = tMember.getModule();
		if (__DEC_tMember_contains_792659 != null) {
			return new Object[] { tMember };
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_3BB(
			TFieldDefinition tMember, TFieldSignature tSignature) {
		TSignature __DEC_tMember_definitions_867228 = tMember.getSignature();
		if (__DEC_tMember_definitions_867228 != null) {
			if (!tSignature.equals(__DEC_tMember_definitions_867228)) {
				return new Object[] { tMember, tSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_4BB(TField tName,
			TypeGraph pm) {
		TypeGraph __DEC_tName_fields_141347 = tName.getModel();
		if (__DEC_tName_fields_141347 != null) {
			if (!pm.equals(__DEC_tName_fields_141347)) {
				return new Object[] { tName, pm };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_28_1_matchtggpattern_blackBBBBBB(TypeGraph pm,
			TAnnotationType tAnnotation, TAbstractType tType, TFieldSignature tSignature, TFieldDefinition tMember,
			TField tName) {
		if (!tAnnotation.equals(tType)) {
			if (tAnnotation.getDefines().contains(tMember)) {
				if (tSignature.getDefinitions().contains(tMember)) {
					if (tType.equals(tSignature.getType())) {
						if (tAnnotation.getSignature().contains(tSignature)) {
							if (pm.equals(tAnnotation.getModel())) {
								if (pm.equals(tName.getModel())) {
									if (tName.getSignatures().contains(tSignature)) {
										if (pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_0BB(tSignature,
												tName) == null) {
											if (pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_1BB(tMember,
													tSignature) == null) {
												if (pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_2B(
														tMember) == null) {
													if (pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_3BB(
															tMember, tSignature) == null) {
														if (pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_4BB(
																tName, pm) == null) {
															return new Object[] { pm, tAnnotation, tType, tSignature,
																	tMember, tName };
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationTypeMember_28_1_matchtggpattern_greenB(TFieldSignature tSignature) {
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		return new Object[] { tSignature };
	}

	public static final boolean pattern_AnnotationTypeMember_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeMember_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_1_createresult_blackB(AnnotationTypeMember _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationTypeMember_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pm) {
		if (ruleResult.getTargetObjects().contains(pm)) {
			return new Object[] { ruleResult, pm };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TAnnotationType tAnnotation) {
		if (ruleResult.getTargetObjects().contains(tAnnotation)) {
			return new Object[] { ruleResult, tAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mAnnotationToAnnotation) {
		if (ruleResult.getCorrObjects().contains(mAnnotationToAnnotation)) {
			return new Object[] { ruleResult, mAnnotationToAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, AnnotationTypeDeclaration mAnnotation) {
		if (ruleResult.getSourceObjects().contains(mAnnotation)) {
			return new Object[] { ruleResult, mAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToType) {
		if (ruleResult.getCorrObjects().contains(mTypeToType)) {
			return new Object[] { ruleResult, mTypeToType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, Type mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeMember_29_2_isapplicablecore_blackFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mAnnotationToAnnotationList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mTypeToTypeList : ruleEntryContainer.getRuleEntryList()) {
				if (!mAnnotationToAnnotationList.equals(mTypeToTypeList)) {
					for (EObject tmpMAnnotationToAnnotation : mAnnotationToAnnotationList.getEntryObjects()) {
						if (tmpMAnnotationToAnnotation instanceof TypeToTAbstractType) {
							TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) tmpMAnnotationToAnnotation;
							TAbstractType tmpTAnnotation = mAnnotationToAnnotation.getTarget();
							if (tmpTAnnotation instanceof TAnnotationType) {
								TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
								Type tmpMAnnotation = mAnnotationToAnnotation.getSource();
								if (tmpMAnnotation instanceof AnnotationTypeDeclaration) {
									AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) tmpMAnnotation;
									TypeGraph pm = tAnnotation.getModel();
									if (pm != null) {
										if (pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_2BB(ruleResult,
												mAnnotationToAnnotation) == null) {
											if (pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_1BB(
													ruleResult, tAnnotation) == null) {
												if (pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_3BB(
														ruleResult, mAnnotation) == null) {
													if (pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_0BB(
															ruleResult, pm) == null) {
														for (EObject tmpMTypeToType : mTypeToTypeList
																.getEntryObjects()) {
															if (tmpMTypeToType instanceof TypeToTAbstractType) {
																TypeToTAbstractType mTypeToType = (TypeToTAbstractType) tmpMTypeToType;
																if (!mAnnotationToAnnotation.equals(mTypeToType)) {
																	TAbstractType tType = mTypeToType.getTarget();
																	if (tType != null) {
																		if (!tAnnotation.equals(tType)) {
																			Type mType = mTypeToType.getSource();
																			if (mType != null) {
																				if (!mAnnotation.equals(mType)) {
																					if (pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_4BB(
																							ruleResult,
																							mTypeToType) == null) {
																						if (pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_5BB(
																								ruleResult,
																								tType) == null) {
																							if (pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_6BB(
																									ruleResult,
																									mType) == null) {
																								_result.add(
																										new Object[] {
																												mAnnotationToAnnotationList,
																												pm,
																												tAnnotation,
																												mAnnotationToAnnotation,
																												mAnnotation,
																												mTypeToTypeList,
																												mTypeToType,
																												tType,
																												mType,
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
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_3_solveCSP_bindingFBBBBBBBBBB(
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch, TypeGraph pm, TAnnotationType tAnnotation,
			AnnotationTypeDeclaration mAnnotation, TypeToTAbstractType mTypeToType, TAbstractType tType, Type mType,
			TypeToTAbstractType mAnnotationToAnnotation, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, pm, tAnnotation, mAnnotation,
				mTypeToType, tType, mType, mAnnotationToAnnotation, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pm, tAnnotation, mAnnotation, mTypeToType, tType,
					mType, mAnnotationToAnnotation, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch, TypeGraph pm, TAnnotationType tAnnotation,
			AnnotationTypeDeclaration mAnnotation, TypeToTAbstractType mTypeToType, TAbstractType tType, Type mType,
			TypeToTAbstractType mAnnotationToAnnotation, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnnotationTypeMember_29_3_solveCSP_binding = pattern_AnnotationTypeMember_29_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, pm, tAnnotation, mAnnotation, mTypeToType, tType, mType,
				mAnnotationToAnnotation, ruleResult);
		if (result_pattern_AnnotationTypeMember_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeMember_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeMember_29_3_solveCSP_black = pattern_AnnotationTypeMember_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeMember_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pm, tAnnotation, mAnnotation, mTypeToType, tType,
						mType, mAnnotationToAnnotation, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeMember_29_4_checkCSP_expressionFBB(AnnotationTypeMember _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_5_checknacs_blackBBBBBBB(TypeGraph pm,
			TAnnotationType tAnnotation, AnnotationTypeDeclaration mAnnotation, TypeToTAbstractType mTypeToType,
			TAbstractType tType, Type mType, TypeToTAbstractType mAnnotationToAnnotation) {
		if (!tAnnotation.equals(tType)) {
			if (!mAnnotation.equals(mType)) {
				if (!mAnnotationToAnnotation.equals(mTypeToType)) {
					return new Object[] { pm, tAnnotation, mAnnotation, mTypeToType, tType, mType,
							mAnnotationToAnnotation };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_6_perform_blackBBBBBBBB(TypeGraph pm,
			TAnnotationType tAnnotation, AnnotationTypeDeclaration mAnnotation, TypeToTAbstractType mTypeToType,
			TAbstractType tType, Type mType, TypeToTAbstractType mAnnotationToAnnotation,
			ModelgeneratorRuleResult ruleResult) {
		if (!tAnnotation.equals(tType)) {
			if (!mAnnotation.equals(mType)) {
				if (!mAnnotationToAnnotation.equals(mTypeToType)) {
					return new Object[] { pm, tAnnotation, mAnnotation, mTypeToType, tType, mType,
							mAnnotationToAnnotation, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_6_perform_greenFBBBFFBFBFFFBB(TypeGraph pm,
			TAnnotationType tAnnotation, AnnotationTypeDeclaration mAnnotation, TAbstractType tType, Type mType,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		TypeAccess access = JavaFactory.eINSTANCE.createTypeAccess();
		ASTNodeToTAnnotatable anntotatableToTannotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MDefinitionToTMember memberToMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		TFieldDefinition tMember = BasicFactory.eINSTANCE.createTFieldDefinition();
		TField tName = BasicFactory.eINSTANCE.createTField();
		AnnotationTypeMemberDeclaration mMember = JavaFactory.eINSTANCE.createAnnotationTypeMemberDeclaration();
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		Object _localVariable_0 = csp.getValue("tSignature", "upperBound");
		Object _localVariable_1 = csp.getValue("tName", "tName");
		Object _localVariable_2 = csp.getValue("mMember", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_3 = ruleResult.getIncrementedPerformCount();
		access.setType(mType);
		ruleResult.getSourceObjects().add(access);
		ruleResult.getCorrObjects().add(anntotatableToTannotatable);
		ruleResult.getCorrObjects().add(memberToMember);
		tSignature.setType(tType);
		tAnnotation.getSignature().add(tSignature);
		ruleResult.getTargetObjects().add(tSignature);
		tAnnotation.getDefines().add(tMember);
		tSignature.getDefinitions().add(tMember);
		memberToMember.setTarget(tMember);
		anntotatableToTannotatable.setTarget(tMember);
		ruleResult.getTargetObjects().add(tMember);
		tName.setModel(pm);
		tName.getSignatures().add(tSignature);
		ruleResult.getTargetObjects().add(tName);
		mAnnotation.getBodyDeclarations().add(mMember);
		mMember.setType(access);
		anntotatableToTannotatable.setSource(mMember);
		memberToMember.setSource(mMember);
		ruleResult.getSourceObjects().add(mMember);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		int tSignature_upperBound_prime = (int) _localVariable_0;
		String tName_tName_prime = (String) _localVariable_1;
		String mMember_name_prime = (String) _localVariable_2;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_3);
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		tName.setTName(tName_tName_prime);
		mMember.setName(mMember_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { access, pm, tAnnotation, mAnnotation, anntotatableToTannotatable, memberToMember, tType,
				tSignature, mType, tMember, tName, mMember, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_AnnotationTypeMember_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnnotationTypeMemberImpl
