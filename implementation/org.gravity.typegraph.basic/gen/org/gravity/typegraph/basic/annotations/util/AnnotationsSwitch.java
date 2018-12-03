/**
 */
package org.gravity.typegraph.basic.annotations.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.typegraph.basic.TAbstractType;

import org.gravity.typegraph.basic.annotations.*;

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
 * @see org.gravity.typegraph.basic.annotations.AnnotationsPackage
 * @generated
 */
public class AnnotationsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnnotationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsSwitch() {
		if (modelPackage == null) {
			modelPackage = AnnotationsPackage.eINSTANCE;
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
			case AnnotationsPackage.TANNOTATION_VALUE: {
				TAnnotationValue tAnnotationValue = (TAnnotationValue)theEObject;
				T result = caseTAnnotationValue(tAnnotationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.TTEXT_ANNOTATION: {
				TTextAnnotation tTextAnnotation = (TTextAnnotation)theEObject;
				T result = caseTTextAnnotation(tTextAnnotation);
				if (result == null) result = caseTAnnotation(tTextAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.TANNOTATION: {
				TAnnotation tAnnotation = (TAnnotation)theEObject;
				T result = caseTAnnotation(tAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.TANNOTATION_TYPE: {
				TAnnotationType tAnnotationType = (TAnnotationType)theEObject;
				T result = caseTAnnotationType(tAnnotationType);
				if (result == null) result = caseTAbstractType(tAnnotationType);
				if (result == null) result = caseTAnnotatable(tAnnotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.TANNOTATABLE: {
				TAnnotatable tAnnotatable = (TAnnotatable)theEObject;
				T result = caseTAnnotatable(tAnnotatable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.TTEXT_NODE: {
				TTextNode tTextNode = (TTextNode)theEObject;
				T result = caseTTextNode(tTextNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.TNUMBER_NODE: {
				TNumberNode tNumberNode = (TNumberNode)theEObject;
				T result = caseTNumberNode(tNumberNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.TBOOL_NODE: {
				TBoolNode tBoolNode = (TBoolNode)theEObject;
				T result = caseTBoolNode(tBoolNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.TCLASS_NODE: {
				TClassNode tClassNode = (TClassNode)theEObject;
				T result = caseTClassNode(tClassNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAnnotation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAnnotation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAnnotationValue(TAnnotationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TText Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TText Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTextAnnotation(TTextAnnotation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>TAnnotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAnnotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAnnotationType(TAnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAnnotatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAnnotatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAnnotatable(TAnnotatable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TText Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TText Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTextNode(TTextNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TNumber Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TNumber Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTNumberNode(TNumberNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TBool Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TBool Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTBoolNode(TBoolNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TClass Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TClass Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTClassNode(TClassNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAbstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAbstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAbstractType(TAbstractType object) {
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

} //AnnotationsSwitch
