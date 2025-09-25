/**
 */
package org.gravity.hulk.detection.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.hulk.HDetector;

import org.gravity.hulk.detection.*;

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
 * @see org.gravity.hulk.detection.DetectionPackage
 * @generated
 */
public class DetectionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DetectionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectionSwitch() {
		if (modelPackage == null) {
			modelPackage = DetectionPackage.eINSTANCE;
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
		case DetectionPackage.HCODE_SMELL_DETECTOR: {
			HCodeSmellDetector hCodeSmellDetector = (HCodeSmellDetector) theEObject;
			T result = caseHCodeSmellDetector(hCodeSmellDetector);
			if (result == null)
				result = caseHDetector(hCodeSmellDetector);
			if (result == null)
				result = caseNode(hCodeSmellDetector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DetectionPackage.HMETRIC_CALCULATOR: {
			HMetricCalculator hMetricCalculator = (HMetricCalculator) theEObject;
			T result = caseHMetricCalculator(hMetricCalculator);
			if (result == null)
				result = caseHDetector(hMetricCalculator);
			if (result == null)
				result = caseNode(hMetricCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DetectionPackage.HANTI_PATTERN_DETECTOR: {
			HAntiPatternDetector hAntiPatternDetector = (HAntiPatternDetector) theEObject;
			T result = caseHAntiPatternDetector(hAntiPatternDetector);
			if (result == null)
				result = caseHDetector(hAntiPatternDetector);
			if (result == null)
				result = caseNode(hAntiPatternDetector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DetectionPackage.HCLASS_BASED_CALCULATOR: {
			HClassBasedCalculator hClassBasedCalculator = (HClassBasedCalculator) theEObject;
			T result = caseHClassBasedCalculator(hClassBasedCalculator);
			if (result == null)
				result = caseHDetector(hClassBasedCalculator);
			if (result == null)
				result = caseNode(hClassBasedCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR: {
			HClassBasedMetricCalculator hClassBasedMetricCalculator = (HClassBasedMetricCalculator) theEObject;
			T result = caseHClassBasedMetricCalculator(hClassBasedMetricCalculator);
			if (result == null)
				result = caseHClassBasedCalculator(hClassBasedMetricCalculator);
			if (result == null)
				result = caseHMetricCalculator(hClassBasedMetricCalculator);
			if (result == null)
				result = caseHDetector(hClassBasedMetricCalculator);
			if (result == null)
				result = caseNode(hClassBasedMetricCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DetectionPackage.HRELATIVE_DETECTOR: {
			HRelativeDetector hRelativeDetector = (HRelativeDetector) theEObject;
			T result = caseHRelativeDetector(hRelativeDetector);
			if (result == null)
				result = caseHDetector(hRelativeDetector);
			if (result == null)
				result = caseNode(hRelativeDetector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HCode Smell Detector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HCode Smell Detector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHCodeSmellDetector(HCodeSmellDetector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMetric Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMetric Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMetricCalculator(HMetricCalculator object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>HClass Based Metric Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HClass Based Metric Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHClassBasedMetricCalculator(HClassBasedMetricCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HRelative Detector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HRelative Detector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHRelativeDetector(HRelativeDetector object) {
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

} //DetectionSwitch
