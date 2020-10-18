/**
 */
package org.gravity.hulk.antipatterngraph.codesmells.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HCodeSmell;
import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.codesmells.*;

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
 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage
 * @generated
 */
public class CodesmellsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CodesmellsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodesmellsSwitch() {
		if (modelPackage == null) {
			modelPackage = CodesmellsPackage.eINSTANCE;
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
		case CodesmellsPackage.HCONTROLLER_CLASS_SMELL: {
			HControllerClassSmell hControllerClassSmell = (HControllerClassSmell) theEObject;
			T result = caseHControllerClassSmell(hControllerClassSmell);
			if (result == null)
				result = caseHCodeSmell(hControllerClassSmell);
			if (result == null)
				result = caseHAnnotation(hControllerClassSmell);
			if (result == null)
				result = caseTAnnotation(hControllerClassSmell);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodesmellsPackage.HDATA_CLASS_SMELL: {
			HDataClassSmell hDataClassSmell = (HDataClassSmell) theEObject;
			T result = caseHDataClassSmell(hDataClassSmell);
			if (result == null)
				result = caseHCodeSmell(hDataClassSmell);
			if (result == null)
				result = caseHAnnotation(hDataClassSmell);
			if (result == null)
				result = caseTAnnotation(hDataClassSmell);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodesmellsPackage.HEMPTY_CLASS_SMELL: {
			HEmptyClassSmell hEmptyClassSmell = (HEmptyClassSmell) theEObject;
			T result = caseHEmptyClassSmell(hEmptyClassSmell);
			if (result == null)
				result = caseHCodeSmell(hEmptyClassSmell);
			if (result == null)
				result = caseHAnnotation(hEmptyClassSmell);
			if (result == null)
				result = caseTAnnotation(hEmptyClassSmell);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodesmellsPackage.HGETTER_SETTER_SMELL: {
			HGetterSetterSmell hGetterSetterSmell = (HGetterSetterSmell) theEObject;
			T result = caseHGetterSetterSmell(hGetterSetterSmell);
			if (result == null)
				result = caseHCodeSmell(hGetterSetterSmell);
			if (result == null)
				result = caseHAnnotation(hGetterSetterSmell);
			if (result == null)
				result = caseTAnnotation(hGetterSetterSmell);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodesmellsPackage.HLARGE_CLASS_LOW_COHESION_SMELL: {
			HLargeClassLowCohesionSmell hLargeClassLowCohesionSmell = (HLargeClassLowCohesionSmell) theEObject;
			T result = caseHLargeClassLowCohesionSmell(hLargeClassLowCohesionSmell);
			if (result == null)
				result = caseHCodeSmell(hLargeClassLowCohesionSmell);
			if (result == null)
				result = caseHAnnotation(hLargeClassLowCohesionSmell);
			if (result == null)
				result = caseTAnnotation(hLargeClassLowCohesionSmell);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodesmellsPackage.HLARGE_CLASS_SMELL: {
			HLargeClassSmell hLargeClassSmell = (HLargeClassSmell) theEObject;
			T result = caseHLargeClassSmell(hLargeClassSmell);
			if (result == null)
				result = caseHCodeSmell(hLargeClassSmell);
			if (result == null)
				result = caseHAnnotation(hLargeClassSmell);
			if (result == null)
				result = caseTAnnotation(hLargeClassSmell);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodesmellsPackage.HLOW_COHESION_SMELL: {
			HLowCohesionSmell hLowCohesionSmell = (HLowCohesionSmell) theEObject;
			T result = caseHLowCohesionSmell(hLowCohesionSmell);
			if (result == null)
				result = caseHCodeSmell(hLowCohesionSmell);
			if (result == null)
				result = caseHAnnotation(hLowCohesionSmell);
			if (result == null)
				result = caseTAnnotation(hLowCohesionSmell);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodesmellsPackage.HDATA_CLASS_ACCESSOR: {
			HDataClassAccessor hDataClassAccessor = (HDataClassAccessor) theEObject;
			T result = caseHDataClassAccessor(hDataClassAccessor);
			if (result == null)
				result = caseHCodeSmell(hDataClassAccessor);
			if (result == null)
				result = caseHMetric(hDataClassAccessor);
			if (result == null)
				result = caseHAnnotation(hDataClassAccessor);
			if (result == null)
				result = caseTAnnotation(hDataClassAccessor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodesmellsPackage.HMUCH_OVERLOADING_CODE_SMELL: {
			HMuchOverloadingCodeSmell hMuchOverloadingCodeSmell = (HMuchOverloadingCodeSmell) theEObject;
			T result = caseHMuchOverloadingCodeSmell(hMuchOverloadingCodeSmell);
			if (result == null)
				result = caseHCodeSmell(hMuchOverloadingCodeSmell);
			if (result == null)
				result = caseHAnnotation(hMuchOverloadingCodeSmell);
			if (result == null)
				result = caseTAnnotation(hMuchOverloadingCodeSmell);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodesmellsPackage.HMANY_PARAMETERS_CODE_SMELL: {
			HManyParametersCodeSmell hManyParametersCodeSmell = (HManyParametersCodeSmell) theEObject;
			T result = caseHManyParametersCodeSmell(hManyParametersCodeSmell);
			if (result == null)
				result = caseHCodeSmell(hManyParametersCodeSmell);
			if (result == null)
				result = caseHAnnotation(hManyParametersCodeSmell);
			if (result == null)
				result = caseTAnnotation(hManyParametersCodeSmell);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodesmellsPackage.HINTENSE_FIELD_USAGE_CODE_SMELL: {
			HIntenseFieldUsageCodeSmell hIntenseFieldUsageCodeSmell = (HIntenseFieldUsageCodeSmell) theEObject;
			T result = caseHIntenseFieldUsageCodeSmell(hIntenseFieldUsageCodeSmell);
			if (result == null)
				result = caseHCodeSmell(hIntenseFieldUsageCodeSmell);
			if (result == null)
				result = caseHAnnotation(hIntenseFieldUsageCodeSmell);
			if (result == null)
				result = caseTAnnotation(hIntenseFieldUsageCodeSmell);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodesmellsPackage.HNO_INHERITANCE_CODE_SMELL: {
			HNoInheritanceCodeSmell hNoInheritanceCodeSmell = (HNoInheritanceCodeSmell) theEObject;
			T result = caseHNoInheritanceCodeSmell(hNoInheritanceCodeSmell);
			if (result == null)
				result = caseHCodeSmell(hNoInheritanceCodeSmell);
			if (result == null)
				result = caseHAnnotation(hNoInheritanceCodeSmell);
			if (result == null)
				result = caseTAnnotation(hNoInheritanceCodeSmell);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HController Class Smell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HController Class Smell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHControllerClassSmell(HControllerClassSmell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HData Class Smell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HData Class Smell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHDataClassSmell(HDataClassSmell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HEmpty Class Smell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HEmpty Class Smell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHEmptyClassSmell(HEmptyClassSmell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HGetter Setter Smell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HGetter Setter Smell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHGetterSetterSmell(HGetterSetterSmell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLarge Class Low Cohesion Smell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLarge Class Low Cohesion Smell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLargeClassLowCohesionSmell(HLargeClassLowCohesionSmell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLarge Class Smell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLarge Class Smell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLargeClassSmell(HLargeClassSmell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLow Cohesion Smell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLow Cohesion Smell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLowCohesionSmell(HLowCohesionSmell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HData Class Accessor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HData Class Accessor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHDataClassAccessor(HDataClassAccessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMuch Overloading Code Smell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMuch Overloading Code Smell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMuchOverloadingCodeSmell(HMuchOverloadingCodeSmell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMany Parameters Code Smell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMany Parameters Code Smell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHManyParametersCodeSmell(HManyParametersCodeSmell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HIntense Field Usage Code Smell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HIntense Field Usage Code Smell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHIntenseFieldUsageCodeSmell(HIntenseFieldUsageCodeSmell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HNo Inheritance Code Smell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HNo Inheritance Code Smell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHNoInheritanceCodeSmell(HNoInheritanceCodeSmell object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>HCode Smell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HCode Smell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHCodeSmell(HCodeSmell object) {
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

} //CodesmellsSwitch
