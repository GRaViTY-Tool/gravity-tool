/**
 */
package org.gravity.hulk.resolve.calculators.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.hulk.HDetector;

import org.gravity.hulk.detection.HMetricCalculator;

import org.gravity.hulk.resolve.HResolver;

import org.gravity.hulk.resolve.calculators.*;

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
 * @see org.gravity.hulk.resolve.calculators.CalculatorsPackage
 * @generated
 */
public class CalculatorsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CalculatorsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatorsSwitch() {
		if (modelPackage == null) {
			modelPackage = CalculatorsPackage.eINSTANCE;
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
		case CalculatorsPackage.HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR: {
			HMethodToDataClassAccessCalculator hMethodToDataClassAccessCalculator = (HMethodToDataClassAccessCalculator) theEObject;
			T result = caseHMethodToDataClassAccessCalculator(hMethodToDataClassAccessCalculator);
			if (result == null)
				result = caseHMetricCalculator(hMethodToDataClassAccessCalculator);
			if (result == null)
				result = caseHResolver(hMethodToDataClassAccessCalculator);
			if (result == null)
				result = caseHDetector(hMethodToDataClassAccessCalculator);
			if (result == null)
				result = caseNode(hMethodToDataClassAccessCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CalculatorsPackage.HIN_BLOB_ACCESS_CALCULATOR: {
			HInBlobAccessCalculator hInBlobAccessCalculator = (HInBlobAccessCalculator) theEObject;
			T result = caseHInBlobAccessCalculator(hInBlobAccessCalculator);
			if (result == null)
				result = caseHMetricCalculator(hInBlobAccessCalculator);
			if (result == null)
				result = caseHResolver(hInBlobAccessCalculator);
			if (result == null)
				result = caseHDetector(hInBlobAccessCalculator);
			if (result == null)
				result = caseNode(hInBlobAccessCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CalculatorsPackage.HCLUSTER_CALCULATOR: {
			HClusterCalculator hClusterCalculator = (HClusterCalculator) theEObject;
			T result = caseHClusterCalculator(hClusterCalculator);
			if (result == null)
				result = caseHResolver(hClusterCalculator);
			if (result == null)
				result = caseHDetector(hClusterCalculator);
			if (result == null)
				result = caseNode(hClusterCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CalculatorsPackage.HCLUSTER_ACCESS_CALCULATOR: {
			HClusterAccessCalculator hClusterAccessCalculator = (HClusterAccessCalculator) theEObject;
			T result = caseHClusterAccessCalculator(hClusterAccessCalculator);
			if (result == null)
				result = caseHResolver(hClusterAccessCalculator);
			if (result == null)
				result = caseHDetector(hClusterAccessCalculator);
			if (result == null)
				result = caseNode(hClusterAccessCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMethod To Data Class Access Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMethod To Data Class Access Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMethodToDataClassAccessCalculator(HMethodToDataClassAccessCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HIn Blob Access Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HIn Blob Access Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHInBlobAccessCalculator(HInBlobAccessCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HCluster Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HCluster Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHClusterCalculator(HClusterCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HCluster Access Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HCluster Access Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHClusterAccessCalculator(HClusterAccessCalculator object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>HResolver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HResolver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHResolver(HResolver object) {
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

} //CalculatorsSwitch
