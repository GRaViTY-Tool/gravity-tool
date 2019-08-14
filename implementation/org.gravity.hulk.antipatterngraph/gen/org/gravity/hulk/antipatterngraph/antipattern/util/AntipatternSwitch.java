/**
 */
package org.gravity.hulk.antipatterngraph.antipattern.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPattern;

import org.gravity.hulk.antipatterngraph.antipattern.*;

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
 * @see org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage
 * @generated
 */
public class AntipatternSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AntipatternPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AntipatternSwitch() {
		if (modelPackage == null) {
			modelPackage = AntipatternPackage.eINSTANCE;
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
		case AntipatternPackage.HBLOB_ANTI_PATTERN: {
			HBlobAntiPattern hBlobAntiPattern = (HBlobAntiPattern) theEObject;
			T result = caseHBlobAntiPattern(hBlobAntiPattern);
			if (result == null)
				result = caseHAntiPattern(hBlobAntiPattern);
			if (result == null)
				result = caseHAnnotation(hBlobAntiPattern);
			if (result == null)
				result = caseTAnnotation(hBlobAntiPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AntipatternPackage.HGOD_CLASS_ANTI_PATTERN: {
			HGodClassAntiPattern hGodClassAntiPattern = (HGodClassAntiPattern) theEObject;
			T result = caseHGodClassAntiPattern(hGodClassAntiPattern);
			if (result == null)
				result = caseHAntiPattern(hGodClassAntiPattern);
			if (result == null)
				result = caseHAnnotation(hGodClassAntiPattern);
			if (result == null)
				result = caseTAnnotation(hGodClassAntiPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AntipatternPackage.HSWISS_ARMY_KNIFE_ANTI_PATTERN: {
			HSwissArmyKnifeAntiPattern hSwissArmyKnifeAntiPattern = (HSwissArmyKnifeAntiPattern) theEObject;
			T result = caseHSwissArmyKnifeAntiPattern(hSwissArmyKnifeAntiPattern);
			if (result == null)
				result = caseHAntiPattern(hSwissArmyKnifeAntiPattern);
			if (result == null)
				result = caseHAnnotation(hSwissArmyKnifeAntiPattern);
			if (result == null)
				result = caseTAnnotation(hSwissArmyKnifeAntiPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN: {
			HSpaghettiCodeAntiPattern hSpaghettiCodeAntiPattern = (HSpaghettiCodeAntiPattern) theEObject;
			T result = caseHSpaghettiCodeAntiPattern(hSpaghettiCodeAntiPattern);
			if (result == null)
				result = caseHAntiPattern(hSpaghettiCodeAntiPattern);
			if (result == null)
				result = caseHAnnotation(hSpaghettiCodeAntiPattern);
			if (result == null)
				result = caseTAnnotation(hSpaghettiCodeAntiPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HBlob Anti Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HBlob Anti Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHBlobAntiPattern(HBlobAntiPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HGod Class Anti Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HGod Class Anti Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHGodClassAntiPattern(HGodClassAntiPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HSwiss Army Knife Anti Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HSwiss Army Knife Anti Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHSwissArmyKnifeAntiPattern(HSwissArmyKnifeAntiPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HSpaghetti Code Anti Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HSpaghetti Code Anti Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHSpaghettiCodeAntiPattern(HSpaghettiCodeAntiPattern object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>HAnti Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HAnti Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHAntiPattern(HAntiPattern object) {
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

} //AntipatternSwitch
