/**
 */
package org.gravity.hulk.refactoringgraph.refactorings.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.refactoringgraph.refactorings.*;

import org.gravity.typegraph.basic.annotations.TAnnotation;

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
 * @see org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage
 * @generated
 */
public class RefactoringsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RefactoringsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringsSwitch() {
		if (modelPackage == null) {
			modelPackage = RefactoringsPackage.eINSTANCE;
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
		case RefactoringsPackage.HREFACTORING: {
			HRefactoring hRefactoring = (HRefactoring) theEObject;
			T result = caseHRefactoring(hRefactoring);
			if (result == null)
				result = caseHMetric(hRefactoring);
			if (result == null)
				result = caseHAnnotation(hRefactoring);
			if (result == null)
				result = caseTAnnotation(hRefactoring);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RefactoringsPackage.HMOVE_METHOD: {
			HMoveMethod hMoveMethod = (HMoveMethod) theEObject;
			T result = caseHMoveMethod(hMoveMethod);
			if (result == null)
				result = caseHMoveMember(hMoveMethod);
			if (result == null)
				result = caseHRefactoring(hMoveMethod);
			if (result == null)
				result = caseHMetric(hMoveMethod);
			if (result == null)
				result = caseHAnnotation(hMoveMethod);
			if (result == null)
				result = caseTAnnotation(hMoveMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RefactoringsPackage.HEXTRACT_CLASS: {
			HExtractClass hExtractClass = (HExtractClass) theEObject;
			T result = caseHExtractClass(hExtractClass);
			if (result == null)
				result = caseHRefactoring(hExtractClass);
			if (result == null)
				result = caseHMetric(hExtractClass);
			if (result == null)
				result = caseHAnnotation(hExtractClass);
			if (result == null)
				result = caseTAnnotation(hExtractClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RefactoringsPackage.HMOVE_MEMBER: {
			HMoveMember hMoveMember = (HMoveMember) theEObject;
			T result = caseHMoveMember(hMoveMember);
			if (result == null)
				result = caseHRefactoring(hMoveMember);
			if (result == null)
				result = caseHMetric(hMoveMember);
			if (result == null)
				result = caseHAnnotation(hMoveMember);
			if (result == null)
				result = caseTAnnotation(hMoveMember);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RefactoringsPackage.HMOVE_FIELD: {
			HMoveField hMoveField = (HMoveField) theEObject;
			T result = caseHMoveField(hMoveField);
			if (result == null)
				result = caseHMoveMember(hMoveField);
			if (result == null)
				result = caseHRefactoring(hMoveField);
			if (result == null)
				result = caseHMetric(hMoveField);
			if (result == null)
				result = caseHAnnotation(hMoveField);
			if (result == null)
				result = caseTAnnotation(hMoveField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RefactoringsPackage.HMOVE_MEMBERS: {
			HMoveMembers hMoveMembers = (HMoveMembers) theEObject;
			T result = caseHMoveMembers(hMoveMembers);
			if (result == null)
				result = caseHRefactoring(hMoveMembers);
			if (result == null)
				result = caseHMetric(hMoveMembers);
			if (result == null)
				result = caseHAnnotation(hMoveMembers);
			if (result == null)
				result = caseTAnnotation(hMoveMembers);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HRefactoring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HRefactoring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHRefactoring(HRefactoring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMove Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMove Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMoveMethod(HMoveMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HExtract Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HExtract Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHExtractClass(HExtractClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMove Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMove Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMoveMember(HMoveMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMove Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMove Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMoveField(HMoveField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMove Members</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMove Members</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMoveMembers(HMoveMembers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAnnotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAnnotation(TAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HAnnotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHAnnotation(HAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMetric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMetric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMetric(HMetric object) {
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

} //RefactoringsSwitch
