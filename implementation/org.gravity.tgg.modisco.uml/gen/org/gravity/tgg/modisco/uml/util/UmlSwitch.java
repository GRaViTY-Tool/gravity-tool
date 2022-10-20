/**
 */
package org.gravity.tgg.modisco.uml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.tgg.modisco.uml.*;

import org.moflon.tgg.runtime.AbstractCorrespondence;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.gravity.tgg.modisco.uml.UmlPackage
 * @generated
 */
public class UmlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UmlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlSwitch() {
		if (modelPackage == null) {
			modelPackage = UmlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case UmlPackage.JAVA_MODEL2_UML_PACKAGE: {
			JavaModel2UMLPackage javaModel2UMLPackage = (JavaModel2UMLPackage) theEObject;
			T result = caseJavaModel2UMLPackage(javaModel2UMLPackage);
			if (result == null)
				result = caseAbstractCorrespondence(javaModel2UMLPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.AST_NODE2_ELEMENT: {
			ASTNode2Element astNode2Element = (ASTNode2Element) theEObject;
			T result = caseASTNode2Element(astNode2Element);
			if (result == null)
				result = caseAbstractCorrespondence(astNode2Element);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.TYPE_ACCESS2_PROPERTY: {
			TypeAccess2Property typeAccess2Property = (TypeAccess2Property) theEObject;
			T result = caseTypeAccess2Property(typeAccess2Property);
			if (result == null)
				result = caseAbstractCorrespondence(typeAccess2Property);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.PARAMETERIZED_TYPE2_REDEFINABLE_TEMPLATE_SIGNATURE: {
			ParameterizedType2RedefinableTemplateSignature parameterizedType2RedefinableTemplateSignature = (ParameterizedType2RedefinableTemplateSignature) theEObject;
			T result = caseParameterizedType2RedefinableTemplateSignature(
					parameterizedType2RedefinableTemplateSignature);
			if (result == null)
				result = caseAbstractCorrespondence(parameterizedType2RedefinableTemplateSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.TYPE_ACCESS2_GENERALIZATION: {
			TypeAccess2Generalization typeAccess2Generalization = (TypeAccess2Generalization) theEObject;
			T result = caseTypeAccess2Generalization(typeAccess2Generalization);
			if (result == null)
				result = caseAbstractCorrespondence(typeAccess2Generalization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.TYPE_ACCESS2_TEMPLATE_BINDING: {
			TypeAccess2TemplateBinding typeAccess2TemplateBinding = (TypeAccess2TemplateBinding) theEObject;
			T result = caseTypeAccess2TemplateBinding(typeAccess2TemplateBinding);
			if (result == null)
				result = caseAbstractCorrespondence(typeAccess2TemplateBinding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.MODIFIER2_NAMED_ELEMENT: {
			Modifier2NamedElement modifier2NamedElement = (Modifier2NamedElement) theEObject;
			T result = caseModifier2NamedElement(modifier2NamedElement);
			if (result == null)
				result = caseAbstractCorrespondence(modifier2NamedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.TYPE_ACCESS2_INTERFACE_REALIZATION: {
			TypeAccess2InterfaceRealization typeAccess2InterfaceRealization = (TypeAccess2InterfaceRealization) theEObject;
			T result = caseTypeAccess2InterfaceRealization(typeAccess2InterfaceRealization);
			if (result == null)
				result = caseAbstractCorrespondence(typeAccess2InterfaceRealization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.JAVA_PACKAGE2_UML_PACKAGE: {
			JavaPackage2UmlPackage javaPackage2UmlPackage = (JavaPackage2UmlPackage) theEObject;
			T result = caseJavaPackage2UmlPackage(javaPackage2UmlPackage);
			if (result == null)
				result = caseAbstractCorrespondence(javaPackage2UmlPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.TYPE_ACCESS2_PARAMETER: {
			TypeAccess2Parameter typeAccess2Parameter = (TypeAccess2Parameter) theEObject;
			T result = caseTypeAccess2Parameter(typeAccess2Parameter);
			if (result == null)
				result = caseAbstractCorrespondence(typeAccess2Parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.COMPILATION_UNIT2_ARTIFACT: {
			CompilationUnit2Artifact compilationUnit2Artifact = (CompilationUnit2Artifact) theEObject;
			T result = caseCompilationUnit2Artifact(compilationUnit2Artifact);
			if (result == null)
				result = caseAbstractCorrespondence(compilationUnit2Artifact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.EXPRESSION2_COMMENT: {
			Expression2Comment expression2Comment = (Expression2Comment) theEObject;
			T result = caseExpression2Comment(expression2Comment);
			if (result == null)
				result = caseAbstractCorrespondence(expression2Comment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Model2 UML Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Model2 UML Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaModel2UMLPackage(JavaModel2UMLPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AST Node2 Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AST Node2 Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASTNode2Element(ASTNode2Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Access2 Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Access2 Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAccess2Property(TypeAccess2Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Type2 Redefinable Template Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Type2 Redefinable Template Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedType2RedefinableTemplateSignature(ParameterizedType2RedefinableTemplateSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Access2 Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Access2 Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAccess2Generalization(TypeAccess2Generalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Access2 Template Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Access2 Template Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAccess2TemplateBinding(TypeAccess2TemplateBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier2 Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier2 Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier2NamedElement(Modifier2NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Access2 Interface Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Access2 Interface Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAccess2InterfaceRealization(TypeAccess2InterfaceRealization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Package2 Uml Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Package2 Uml Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaPackage2UmlPackage(JavaPackage2UmlPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Access2 Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Access2 Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAccess2Parameter(TypeAccess2Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit2 Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit2 Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationUnit2Artifact(CompilationUnit2Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression2 Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression2 Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression2Comment(Expression2Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCorrespondence(AbstractCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UmlSwitch
