/**
 */
package org.gravity.hulk.refactoringgraph.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.refactoringgraph.*;

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
 * @see org.gravity.hulk.refactoringgraph.RefactoringgraphPackage
 * @generated
 */
public class RefactoringgraphSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RefactoringgraphPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringgraphSwitch() {
		if (modelPackage == null) {
			modelPackage = RefactoringgraphPackage.eINSTANCE;
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
		case RefactoringgraphPackage.HMETHOD_TO_DATA_CLASS_ACCESS: {
			HMethodToDataClassAccess hMethodToDataClassAccess = (HMethodToDataClassAccess) theEObject;
			T result = caseHMethodToDataClassAccess(hMethodToDataClassAccess);
			if (result == null)
				result = caseHMetric(hMethodToDataClassAccess);
			if (result == null)
				result = caseHAnnotation(hMethodToDataClassAccess);
			if (result == null)
				result = caseTAnnotation(hMethodToDataClassAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RefactoringgraphPackage.HIN_BLOB_ACCESS: {
			HInBlobAccess hInBlobAccess = (HInBlobAccess) theEObject;
			T result = caseHInBlobAccess(hInBlobAccess);
			if (result == null)
				result = caseHMetric(hInBlobAccess);
			if (result == null)
				result = caseHAnnotation(hInBlobAccess);
			if (result == null)
				result = caseTAnnotation(hInBlobAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RefactoringgraphPackage.HBLOB_RESOLVE_ANNOTATION: {
			HBlobResolveAnnotation hBlobResolveAnnotation = (HBlobResolveAnnotation) theEObject;
			T result = caseHBlobResolveAnnotation(hBlobResolveAnnotation);
			if (result == null)
				result = caseHAnnotation(hBlobResolveAnnotation);
			if (result == null)
				result = caseTAnnotation(hBlobResolveAnnotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RefactoringgraphPackage.HCLUSTER: {
			HCluster hCluster = (HCluster) theEObject;
			T result = caseHCluster(hCluster);
			if (result == null)
				result = caseHMetric(hCluster);
			if (result == null)
				result = caseHAnnotation(hCluster);
			if (result == null)
				result = caseTAnnotation(hCluster);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RefactoringgraphPackage.HIN_BLOB_CLUSTER_ACCESS: {
			HInBlobClusterAccess hInBlobClusterAccess = (HInBlobClusterAccess) theEObject;
			T result = caseHInBlobClusterAccess(hInBlobClusterAccess);
			if (result == null)
				result = caseHMetric(hInBlobClusterAccess);
			if (result == null)
				result = caseHAnnotation(hInBlobClusterAccess);
			if (result == null)
				result = caseTAnnotation(hInBlobClusterAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMethod To Data Class Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMethod To Data Class Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMethodToDataClassAccess(HMethodToDataClassAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HIn Blob Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HIn Blob Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHInBlobAccess(HInBlobAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HBlob Resolve Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HBlob Resolve Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHBlobResolveAnnotation(HBlobResolveAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HCluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HCluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHCluster(HCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HIn Blob Cluster Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HIn Blob Cluster Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHInBlobClusterAccess(HInBlobClusterAccess object) {
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

} //RefactoringgraphSwitch
