/**
 */
package org.gravity.hulk.detection.codesmells.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.hulk.HDetector;

import org.gravity.hulk.detection.HClassBasedCalculator;
import org.gravity.hulk.detection.HCodeSmellDetector;
import org.gravity.hulk.detection.HRelativeDetector;

import org.gravity.hulk.detection.codesmells.*;

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
 * @see org.gravity.hulk.detection.codesmells.CodesmellsPackage
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
		case CodesmellsPackage.HCONTOLLER_CLASS_DETECTOR: {
			HContollerClassDetector hContollerClassDetector = (HContollerClassDetector) theEObject;
			T result = caseHContollerClassDetector(hContollerClassDetector);
			if (result == null)
				result = caseHCodeSmellDetector(hContollerClassDetector);
			if (result == null)
				result = caseHClassBasedCalculator(hContollerClassDetector);
			if (result == null)
				result = caseHRelativeDetector(hContollerClassDetector);
			if (result == null)
				result = caseHDetector(hContollerClassDetector);
			if (result == null)
				result = caseNode(hContollerClassDetector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodesmellsPackage.HDATA_CLASS_DETECTOR: {
			HDataClassDetector hDataClassDetector = (HDataClassDetector) theEObject;
			T result = caseHDataClassDetector(hDataClassDetector);
			if (result == null)
				result = caseHCodeSmellDetector(hDataClassDetector);
			if (result == null)
				result = caseHClassBasedCalculator(hDataClassDetector);
			if (result == null)
				result = caseHRelativeDetector(hDataClassDetector);
			if (result == null)
				result = caseHDetector(hDataClassDetector);
			if (result == null)
				result = caseNode(hDataClassDetector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodesmellsPackage.HEMPTY_CLASS_DETECTOR: {
			HEmptyClassDetector hEmptyClassDetector = (HEmptyClassDetector) theEObject;
			T result = caseHEmptyClassDetector(hEmptyClassDetector);
			if (result == null)
				result = caseHClassBasedCalculator(hEmptyClassDetector);
			if (result == null)
				result = caseHCodeSmellDetector(hEmptyClassDetector);
			if (result == null)
				result = caseHDetector(hEmptyClassDetector);
			if (result == null)
				result = caseNode(hEmptyClassDetector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodesmellsPackage.HGETTER_SETTER_DETECTOR: {
			HGetterSetterDetector hGetterSetterDetector = (HGetterSetterDetector) theEObject;
			T result = caseHGetterSetterDetector(hGetterSetterDetector);
			if (result == null)
				result = caseHCodeSmellDetector(hGetterSetterDetector);
			if (result == null)
				result = caseHClassBasedCalculator(hGetterSetterDetector);
			if (result == null)
				result = caseHDetector(hGetterSetterDetector);
			if (result == null)
				result = caseNode(hGetterSetterDetector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodesmellsPackage.HLARGE_CLASS_LOW_COHESION_DETECTOR: {
			HLargeClassLowCohesionDetector hLargeClassLowCohesionDetector = (HLargeClassLowCohesionDetector) theEObject;
			T result = caseHLargeClassLowCohesionDetector(hLargeClassLowCohesionDetector);
			if (result == null)
				result = caseHClassBasedCalculator(hLargeClassLowCohesionDetector);
			if (result == null)
				result = caseHCodeSmellDetector(hLargeClassLowCohesionDetector);
			if (result == null)
				result = caseHDetector(hLargeClassLowCohesionDetector);
			if (result == null)
				result = caseNode(hLargeClassLowCohesionDetector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodesmellsPackage.HLARGE_CLASS_DETECTOR: {
			HLargeClassDetector hLargeClassDetector = (HLargeClassDetector) theEObject;
			T result = caseHLargeClassDetector(hLargeClassDetector);
			if (result == null)
				result = caseHClassBasedCalculator(hLargeClassDetector);
			if (result == null)
				result = caseHCodeSmellDetector(hLargeClassDetector);
			if (result == null)
				result = caseHRelativeDetector(hLargeClassDetector);
			if (result == null)
				result = caseHDetector(hLargeClassDetector);
			if (result == null)
				result = caseNode(hLargeClassDetector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodesmellsPackage.HLOW_COHESION_DETECTOR: {
			HLowCohesionDetector hLowCohesionDetector = (HLowCohesionDetector) theEObject;
			T result = caseHLowCohesionDetector(hLowCohesionDetector);
			if (result == null)
				result = caseHClassBasedCalculator(hLowCohesionDetector);
			if (result == null)
				result = caseHCodeSmellDetector(hLowCohesionDetector);
			if (result == null)
				result = caseHRelativeDetector(hLowCohesionDetector);
			if (result == null)
				result = caseHDetector(hLowCohesionDetector);
			if (result == null)
				result = caseNode(hLowCohesionDetector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodesmellsPackage.HDATA_CLASS_ACCESSOR_DETECTOR: {
			HDataClassAccessorDetector hDataClassAccessorDetector = (HDataClassAccessorDetector) theEObject;
			T result = caseHDataClassAccessorDetector(hDataClassAccessorDetector);
			if (result == null)
				result = caseHCodeSmellDetector(hDataClassAccessorDetector);
			if (result == null)
				result = caseHClassBasedCalculator(hDataClassAccessorDetector);
			if (result == null)
				result = caseHDetector(hDataClassAccessorDetector);
			if (result == null)
				result = caseNode(hDataClassAccessorDetector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodesmellsPackage.HMANY_PARAMETERS_DETECTOR: {
			HManyParametersDetector hManyParametersDetector = (HManyParametersDetector) theEObject;
			T result = caseHManyParametersDetector(hManyParametersDetector);
			if (result == null)
				result = caseHCodeSmellDetector(hManyParametersDetector);
			if (result == null)
				result = caseHClassBasedCalculator(hManyParametersDetector);
			if (result == null)
				result = caseHRelativeDetector(hManyParametersDetector);
			if (result == null)
				result = caseHDetector(hManyParametersDetector);
			if (result == null)
				result = caseNode(hManyParametersDetector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR: {
			HMuchOverloadingDetector hMuchOverloadingDetector = (HMuchOverloadingDetector) theEObject;
			T result = caseHMuchOverloadingDetector(hMuchOverloadingDetector);
			if (result == null)
				result = caseHCodeSmellDetector(hMuchOverloadingDetector);
			if (result == null)
				result = caseHClassBasedCalculator(hMuchOverloadingDetector);
			if (result == null)
				result = caseHRelativeDetector(hMuchOverloadingDetector);
			if (result == null)
				result = caseHDetector(hMuchOverloadingDetector);
			if (result == null)
				result = caseNode(hMuchOverloadingDetector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR: {
			HIntenseFieldUsageDetector hIntenseFieldUsageDetector = (HIntenseFieldUsageDetector) theEObject;
			T result = caseHIntenseFieldUsageDetector(hIntenseFieldUsageDetector);
			if (result == null)
				result = caseHCodeSmellDetector(hIntenseFieldUsageDetector);
			if (result == null)
				result = caseHClassBasedCalculator(hIntenseFieldUsageDetector);
			if (result == null)
				result = caseHRelativeDetector(hIntenseFieldUsageDetector);
			if (result == null)
				result = caseHDetector(hIntenseFieldUsageDetector);
			if (result == null)
				result = caseNode(hIntenseFieldUsageDetector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HContoller Class Detector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HContoller Class Detector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHContollerClassDetector(HContollerClassDetector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HData Class Detector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HData Class Detector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHDataClassDetector(HDataClassDetector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HEmpty Class Detector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HEmpty Class Detector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHEmptyClassDetector(HEmptyClassDetector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HGetter Setter Detector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HGetter Setter Detector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHGetterSetterDetector(HGetterSetterDetector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLarge Class Low Cohesion Detector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLarge Class Low Cohesion Detector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLargeClassLowCohesionDetector(HLargeClassLowCohesionDetector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLarge Class Detector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLarge Class Detector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLargeClassDetector(HLargeClassDetector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLow Cohesion Detector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLow Cohesion Detector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLowCohesionDetector(HLowCohesionDetector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HData Class Accessor Detector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HData Class Accessor Detector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHDataClassAccessorDetector(HDataClassAccessorDetector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMany Parameters Detector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMany Parameters Detector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHManyParametersDetector(HManyParametersDetector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMuch Overloading Detector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMuch Overloading Detector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMuchOverloadingDetector(HMuchOverloadingDetector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HIntense Field Usage Detector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HIntense Field Usage Detector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHIntenseFieldUsageDetector(HIntenseFieldUsageDetector object) {
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
