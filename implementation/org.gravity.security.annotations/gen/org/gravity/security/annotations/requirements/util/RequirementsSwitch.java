/**
 */
package org.gravity.security.annotations.requirements.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.security.annotations.requirements.*;

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
 * @see org.gravity.security.annotations.requirements.RequirementsPackage
 * @generated
 */
public class RequirementsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RequirementsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsSwitch() {
		if (modelPackage == null) {
			modelPackage = RequirementsPackage.eINSTANCE;
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
		case RequirementsPackage.TSECRECY: {
			TSecrecy tSecrecy = (TSecrecy) theEObject;
			T result = caseTSecrecy(tSecrecy);
			if (result == null)
				result = caseTAnnotationWithCounterMeasure(tSecrecy);
			if (result == null)
				result = caseTAbstractCriticalElement(tSecrecy);
			if (result == null)
				result = caseTAnnotation(tSecrecy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RequirementsPackage.TINTEGRITY: {
			TIntegrity tIntegrity = (TIntegrity) theEObject;
			T result = caseTIntegrity(tIntegrity);
			if (result == null)
				result = caseTAnnotationWithCounterMeasure(tIntegrity);
			if (result == null)
				result = caseTAbstractCriticalElement(tIntegrity);
			if (result == null)
				result = caseTAnnotation(tIntegrity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RequirementsPackage.THIGH: {
			THigh tHigh = (THigh) theEObject;
			T result = caseTHigh(tHigh);
			if (result == null)
				result = caseTAnnotationWithCounterMeasure(tHigh);
			if (result == null)
				result = caseTAnnotation(tHigh);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RequirementsPackage.TCRITICAL: {
			TCritical tCritical = (TCritical) theEObject;
			T result = caseTCritical(tCritical);
			if (result == null)
				result = caseTAbstractCriticalElement(tCritical);
			if (result == null)
				result = caseTAnnotation(tCritical);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RequirementsPackage.TANNOTATION_WITH_COUNTER_MEASURE: {
			TAnnotationWithCounterMeasure tAnnotationWithCounterMeasure = (TAnnotationWithCounterMeasure) theEObject;
			T result = caseTAnnotationWithCounterMeasure(tAnnotationWithCounterMeasure);
			if (result == null)
				result = caseTAnnotation(tAnnotationWithCounterMeasure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RequirementsPackage.TABSTRACT_CRITICAL_ELEMENT: {
			TAbstractCriticalElement tAbstractCriticalElement = (TAbstractCriticalElement) theEObject;
			T result = caseTAbstractCriticalElement(tAbstractCriticalElement);
			if (result == null)
				result = caseTAnnotation(tAbstractCriticalElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSecrecy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSecrecy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSecrecy(TSecrecy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TIntegrity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TIntegrity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTIntegrity(TIntegrity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>THigh</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>THigh</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTHigh(THigh object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCritical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCritical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCritical(TCritical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAnnotation With Counter Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAnnotation With Counter Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAnnotationWithCounterMeasure(TAnnotationWithCounterMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAbstract Critical Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAbstract Critical Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAbstractCriticalElement(TAbstractCriticalElement object) {
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

} //RequirementsSwitch
