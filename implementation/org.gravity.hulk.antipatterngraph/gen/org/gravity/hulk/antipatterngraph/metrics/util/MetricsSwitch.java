/**
 */
package org.gravity.hulk.antipatterngraph.metrics.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.*;

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
 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage
 * @generated
 */
public class MetricsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetricsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsSwitch() {
		if (modelPackage == null) {
			modelPackage = MetricsPackage.eINSTANCE;
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
		case MetricsPackage.HNACC_METRIC: {
			HNACCMetric hnaccMetric = (HNACCMetric) theEObject;
			T result = caseHNACCMetric(hnaccMetric);
			if (result == null)
				result = caseHMetric(hnaccMetric);
			if (result == null)
				result = caseHAnnotation(hnaccMetric);
			if (result == null)
				result = caseTAnnotation(hnaccMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HNUMBER_OF_MEMBERS_METRIC: {
			HNumberOfMembersMetric hNumberOfMembersMetric = (HNumberOfMembersMetric) theEObject;
			T result = caseHNumberOfMembersMetric(hNumberOfMembersMetric);
			if (result == null)
				result = caseHMetric(hNumberOfMembersMetric);
			if (result == null)
				result = caseHAnnotation(hNumberOfMembersMetric);
			if (result == null)
				result = caseTAnnotation(hNumberOfMembersMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HLOCAL_ACCESS_RELATION_METRIC: {
			HLocalAccessRelationMetric hLocalAccessRelationMetric = (HLocalAccessRelationMetric) theEObject;
			T result = caseHLocalAccessRelationMetric(hLocalAccessRelationMetric);
			if (result == null)
				result = caseHMetric(hLocalAccessRelationMetric);
			if (result == null)
				result = caseHAnnotation(hLocalAccessRelationMetric);
			if (result == null)
				result = caseTAnnotation(hLocalAccessRelationMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HINVOCATION_RELATION: {
			HInvocationRelation hInvocationRelation = (HInvocationRelation) theEObject;
			T result = caseHInvocationRelation(hInvocationRelation);
			if (result == null)
				result = caseHMetric(hInvocationRelation);
			if (result == null)
				result = caseHAnnotation(hInvocationRelation);
			if (result == null)
				result = caseTAnnotation(hInvocationRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HNUMBER_OF_CHILD_METRIC: {
			HNumberOfChildMetric hNumberOfChildMetric = (HNumberOfChildMetric) theEObject;
			T result = caseHNumberOfChildMetric(hNumberOfChildMetric);
			if (result == null)
				result = caseHMetric(hNumberOfChildMetric);
			if (result == null)
				result = caseHAnnotation(hNumberOfChildMetric);
			if (result == null)
				result = caseTAnnotation(hNumberOfChildMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HIGAM_METRIC: {
			HIGAMMetric higamMetric = (HIGAMMetric) theEObject;
			T result = caseHIGAMMetric(higamMetric);
			if (result == null)
				result = caseHMetric(higamMetric);
			if (result == null)
				result = caseHAnnotation(higamMetric);
			if (result == null)
				result = caseTAnnotation(higamMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HIGAT_METRIC: {
			HIGATMetric higatMetric = (HIGATMetric) theEObject;
			T result = caseHIGATMetric(higatMetric);
			if (result == null)
				result = caseHMetric(higatMetric);
			if (result == null)
				result = caseHAnnotation(higatMetric);
			if (result == null)
				result = caseTAnnotation(higatMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HNUMBER_OF_METHODS_METRIC: {
			HNumberOfMethodsMetric hNumberOfMethodsMetric = (HNumberOfMethodsMetric) theEObject;
			T result = caseHNumberOfMethodsMetric(hNumberOfMethodsMetric);
			if (result == null)
				result = caseHMetric(hNumberOfMethodsMetric);
			if (result == null)
				result = caseHAnnotation(hNumberOfMethodsMetric);
			if (result == null)
				result = caseTAnnotation(hNumberOfMethodsMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HAVERAGE_OVERLOADING_IN_CLASS_METRIC: {
			HAverageOverloadingInClassMetric hAverageOverloadingInClassMetric = (HAverageOverloadingInClassMetric) theEObject;
			T result = caseHAverageOverloadingInClassMetric(hAverageOverloadingInClassMetric);
			if (result == null)
				result = caseHMetric(hAverageOverloadingInClassMetric);
			if (result == null)
				result = caseHAnnotation(hAverageOverloadingInClassMetric);
			if (result == null)
				result = caseTAnnotation(hAverageOverloadingInClassMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HAVERAGE_PARAMETERS_METRIC: {
			HAverageParametersMetric hAverageParametersMetric = (HAverageParametersMetric) theEObject;
			T result = caseHAverageParametersMetric(hAverageParametersMetric);
			if (result == null)
				result = caseHMetric(hAverageParametersMetric);
			if (result == null)
				result = caseHAnnotation(hAverageParametersMetric);
			if (result == null)
				result = caseTAnnotation(hAverageParametersMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HLOCAL_METHOD_ACCESSES_METRIC: {
			HLocalMethodAccessesMetric hLocalMethodAccessesMetric = (HLocalMethodAccessesMetric) theEObject;
			T result = caseHLocalMethodAccessesMetric(hLocalMethodAccessesMetric);
			if (result == null)
				result = caseHMetric(hLocalMethodAccessesMetric);
			if (result == null)
				result = caseHAnnotation(hLocalMethodAccessesMetric);
			if (result == null)
				result = caseTAnnotation(hLocalMethodAccessesMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HLOCAL_FIELD_ACCESSES_METRIC: {
			HLocalFieldAccessesMetric hLocalFieldAccessesMetric = (HLocalFieldAccessesMetric) theEObject;
			T result = caseHLocalFieldAccessesMetric(hLocalFieldAccessesMetric);
			if (result == null)
				result = caseHMetric(hLocalFieldAccessesMetric);
			if (result == null)
				result = caseHAnnotation(hLocalFieldAccessesMetric);
			if (result == null)
				result = caseTAnnotation(hLocalFieldAccessesMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HTOTAL_VISIBILITY_METRIC: {
			HTotalVisibilityMetric hTotalVisibilityMetric = (HTotalVisibilityMetric) theEObject;
			T result = caseHTotalVisibilityMetric(hTotalVisibilityMetric);
			if (result == null)
				result = caseHMetric(hTotalVisibilityMetric);
			if (result == null)
				result = caseHAnnotation(hTotalVisibilityMetric);
			if (result == null)
				result = caseTAnnotation(hTotalVisibilityMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HTOTAL_COUPLING_METRIC: {
			HTotalCouplingMetric hTotalCouplingMetric = (HTotalCouplingMetric) theEObject;
			T result = caseHTotalCouplingMetric(hTotalCouplingMetric);
			if (result == null)
				result = caseHMetric(hTotalCouplingMetric);
			if (result == null)
				result = caseHAnnotation(hTotalCouplingMetric);
			if (result == null)
				result = caseTAnnotation(hTotalCouplingMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HNUMBER_OF_FIELDS_METRIC: {
			HNumberOfFieldsMetric hNumberOfFieldsMetric = (HNumberOfFieldsMetric) theEObject;
			T result = caseHNumberOfFieldsMetric(hNumberOfFieldsMetric);
			if (result == null)
				result = caseHMetric(hNumberOfFieldsMetric);
			if (result == null)
				result = caseHAnnotation(hNumberOfFieldsMetric);
			if (result == null)
				result = caseTAnnotation(hNumberOfFieldsMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HLCOM5_METRIC: {
			HLCOM5Metric hlcom5Metric = (HLCOM5Metric) theEObject;
			T result = caseHLCOM5Metric(hlcom5Metric);
			if (result == null)
				result = caseHMetric(hlcom5Metric);
			if (result == null)
				result = caseHAnnotation(hlcom5Metric);
			if (result == null)
				result = caseTAnnotation(hlcom5Metric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HEFFERENT_COUPLING_METRIC: {
			HEfferentCouplingMetric hEfferentCouplingMetric = (HEfferentCouplingMetric) theEObject;
			T result = caseHEfferentCouplingMetric(hEfferentCouplingMetric);
			if (result == null)
				result = caseHMetric(hEfferentCouplingMetric);
			if (result == null)
				result = caseHAnnotation(hEfferentCouplingMetric);
			if (result == null)
				result = caseTAnnotation(hEfferentCouplingMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HAFFERENT_COUPLING_METRIC: {
			HAfferentCouplingMetric hAfferentCouplingMetric = (HAfferentCouplingMetric) theEObject;
			T result = caseHAfferentCouplingMetric(hAfferentCouplingMetric);
			if (result == null)
				result = caseHMetric(hAfferentCouplingMetric);
			if (result == null)
				result = caseHAnnotation(hAfferentCouplingMetric);
			if (result == null)
				result = caseTAnnotation(hAfferentCouplingMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HLOCAL_FIELD_UNIQUE_ACCESS_METRIC: {
			HLocalFieldUniqueAccessMetric hLocalFieldUniqueAccessMetric = (HLocalFieldUniqueAccessMetric) theEObject;
			T result = caseHLocalFieldUniqueAccessMetric(hLocalFieldUniqueAccessMetric);
			if (result == null)
				result = caseHMetric(hLocalFieldUniqueAccessMetric);
			if (result == null)
				result = caseHAnnotation(hLocalFieldUniqueAccessMetric);
			if (result == null)
				result = caseTAnnotation(hLocalFieldUniqueAccessMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HINCOMMING_INVOCATION_METRIC: {
			HIncommingInvocationMetric hIncommingInvocationMetric = (HIncommingInvocationMetric) theEObject;
			T result = caseHIncommingInvocationMetric(hIncommingInvocationMetric);
			if (result == null)
				result = caseHMetric(hIncommingInvocationMetric);
			if (result == null)
				result = caseHAnnotation(hIncommingInvocationMetric);
			if (result == null)
				result = caseTAnnotation(hIncommingInvocationMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HOUTGOING_INVOCATION_METRIC: {
			HOutgoingInvocationMetric hOutgoingInvocationMetric = (HOutgoingInvocationMetric) theEObject;
			T result = caseHOutgoingInvocationMetric(hOutgoingInvocationMetric);
			if (result == null)
				result = caseHMetric(hOutgoingInvocationMetric);
			if (result == null)
				result = caseHAnnotation(hOutgoingInvocationMetric);
			if (result == null)
				result = caseTAnnotation(hOutgoingInvocationMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HDEPTH_OF_INHERITANCE_METRIC: {
			HDepthOfInheritanceMetric hDepthOfInheritanceMetric = (HDepthOfInheritanceMetric) theEObject;
			T result = caseHDepthOfInheritanceMetric(hDepthOfInheritanceMetric);
			if (result == null)
				result = caseHMetric(hDepthOfInheritanceMetric);
			if (result == null)
				result = caseHAnnotation(hDepthOfInheritanceMetric);
			if (result == null)
				result = caseTAnnotation(hDepthOfInheritanceMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HGETTER_METRIC: {
			HGetterMetric hGetterMetric = (HGetterMetric) theEObject;
			T result = caseHGetterMetric(hGetterMetric);
			if (result == null)
				result = caseHMetric(hGetterMetric);
			if (result == null)
				result = caseHAnnotation(hGetterMetric);
			if (result == null)
				result = caseTAnnotation(hGetterMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HSETTER_METRIC: {
			HSetterMetric hSetterMetric = (HSetterMetric) theEObject;
			T result = caseHSetterMetric(hSetterMetric);
			if (result == null)
				result = caseHMetric(hSetterMetric);
			if (result == null)
				result = caseHAnnotation(hSetterMetric);
			if (result == null)
				result = caseTAnnotation(hSetterMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HNACC Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HNACC Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHNACCMetric(HNACCMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HNumber Of Members Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HNumber Of Members Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHNumberOfMembersMetric(HNumberOfMembersMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLocal Access Relation Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLocal Access Relation Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLocalAccessRelationMetric(HLocalAccessRelationMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HInvocation Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HInvocation Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHInvocationRelation(HInvocationRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HNumber Of Child Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HNumber Of Child Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHNumberOfChildMetric(HNumberOfChildMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HIGAM Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HIGAM Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHIGAMMetric(HIGAMMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HIGAT Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HIGAT Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHIGATMetric(HIGATMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HNumber Of Methods Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HNumber Of Methods Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHNumberOfMethodsMetric(HNumberOfMethodsMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HAverage Overloading In Class Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HAverage Overloading In Class Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHAverageOverloadingInClassMetric(HAverageOverloadingInClassMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HAverage Parameters Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HAverage Parameters Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHAverageParametersMetric(HAverageParametersMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLocal Method Accesses Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLocal Method Accesses Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLocalMethodAccessesMetric(HLocalMethodAccessesMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLocal Field Accesses Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLocal Field Accesses Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLocalFieldAccessesMetric(HLocalFieldAccessesMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTotal Visibility Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTotal Visibility Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTotalVisibilityMetric(HTotalVisibilityMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTotal Coupling Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTotal Coupling Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTotalCouplingMetric(HTotalCouplingMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HNumber Of Fields Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HNumber Of Fields Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHNumberOfFieldsMetric(HNumberOfFieldsMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLCOM5 Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLCOM5 Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLCOM5Metric(HLCOM5Metric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HEfferent Coupling Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HEfferent Coupling Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHEfferentCouplingMetric(HEfferentCouplingMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HAfferent Coupling Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HAfferent Coupling Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHAfferentCouplingMetric(HAfferentCouplingMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLocal Field Unique Access Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLocal Field Unique Access Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLocalFieldUniqueAccessMetric(HLocalFieldUniqueAccessMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HIncomming Invocation Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HIncomming Invocation Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHIncommingInvocationMetric(HIncommingInvocationMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HOutgoing Invocation Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HOutgoing Invocation Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHOutgoingInvocationMetric(HOutgoingInvocationMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HDepth Of Inheritance Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HDepth Of Inheritance Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHDepthOfInheritanceMetric(HDepthOfInheritanceMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HGetter Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HGetter Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHGetterMetric(HGetterMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HSetter Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HSetter Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHSetterMetric(HSetterMetric object) {
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

} //MetricsSwitch
