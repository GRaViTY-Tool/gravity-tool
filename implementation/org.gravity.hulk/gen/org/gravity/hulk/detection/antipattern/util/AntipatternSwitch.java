/**
 */
package org.gravity.hulk.detection.antipattern.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.hulk.HDetector;

import org.gravity.hulk.detection.HAntiPatternDetector;
import org.gravity.hulk.detection.HClassBasedCalculator;

import org.gravity.hulk.detection.antipattern.*;

import org.moflon.core.dfs.Node;

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
 * @see org.gravity.hulk.detection.antipattern.AntipatternPackage
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
		case AntipatternPackage.HBLOB_DETECTOR: {
			HBlobDetector hBlobDetector = (HBlobDetector) theEObject;
			T result = caseHBlobDetector(hBlobDetector);
			if (result == null)
				result = caseHAntiPatternDetector(hBlobDetector);
			if (result == null)
				result = caseHClassBasedCalculator(hBlobDetector);
			if (result == null)
				result = caseHDetector(hBlobDetector);
			if (result == null)
				result = caseNode(hBlobDetector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AntipatternPackage.HGOD_CLASS_DETECTOR: {
			HGodClassDetector hGodClassDetector = (HGodClassDetector) theEObject;
			T result = caseHGodClassDetector(hGodClassDetector);
			if (result == null)
				result = caseHAntiPatternDetector(hGodClassDetector);
			if (result == null)
				result = caseHClassBasedCalculator(hGodClassDetector);
			if (result == null)
				result = caseHDetector(hGodClassDetector);
			if (result == null)
				result = caseNode(hGodClassDetector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AntipatternPackage.HSWISS_ARMY_KNIFE_DETECTOR: {
			HSwissArmyKnifeDetector hSwissArmyKnifeDetector = (HSwissArmyKnifeDetector) theEObject;
			T result = caseHSwissArmyKnifeDetector(hSwissArmyKnifeDetector);
			if (result == null)
				result = caseHAntiPatternDetector(hSwissArmyKnifeDetector);
			if (result == null)
				result = caseHClassBasedCalculator(hSwissArmyKnifeDetector);
			if (result == null)
				result = caseHDetector(hSwissArmyKnifeDetector);
			if (result == null)
				result = caseNode(hSwissArmyKnifeDetector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AntipatternPackage.HSPAGHETTI_CODE_DETECTOR: {
			HSpaghettiCodeDetector hSpaghettiCodeDetector = (HSpaghettiCodeDetector) theEObject;
			T result = caseHSpaghettiCodeDetector(hSpaghettiCodeDetector);
			if (result == null)
				result = caseHClassBasedCalculator(hSpaghettiCodeDetector);
			if (result == null)
				result = caseHAntiPatternDetector(hSpaghettiCodeDetector);
			if (result == null)
				result = caseHDetector(hSpaghettiCodeDetector);
			if (result == null)
				result = caseNode(hSpaghettiCodeDetector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HBlob Detector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HBlob Detector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHBlobDetector(HBlobDetector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HGod Class Detector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HGod Class Detector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHGodClassDetector(HGodClassDetector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HSwiss Army Knife Detector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HSwiss Army Knife Detector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHSwissArmyKnifeDetector(HSwissArmyKnifeDetector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HSpaghetti Code Detector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HSpaghetti Code Detector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHSpaghettiCodeDetector(HSpaghettiCodeDetector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HDetector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HDetector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHDetector(HDetector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HAnti Pattern Detector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HAnti Pattern Detector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHAntiPatternDetector(HAntiPatternDetector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HClass Based Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HClass Based Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHClassBasedCalculator(HClassBasedCalculator object) {
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
