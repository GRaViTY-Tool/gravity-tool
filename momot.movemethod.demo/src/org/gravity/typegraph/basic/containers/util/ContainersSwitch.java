/**
 */
package org.gravity.typegraph.basic.containers.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.typegraph.basic.containers.*;

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
 * @see org.gravity.typegraph.basic.containers.ContainersPackage
 * @generated
 */
public class ContainersSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContainersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainersSwitch() {
		if (modelPackage == null) {
			modelPackage = ContainersPackage.eINSTANCE;
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
			case ContainersPackage.TTYPE_CONTAINER: {
				TTypeContainer tTypeContainer = (TTypeContainer)theEObject;
				T result = caseTTypeContainer(tTypeContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContainersPackage.TACCESS_CONTAINER: {
				TAccessContainer tAccessContainer = (TAccessContainer)theEObject;
				T result = caseTAccessContainer(tAccessContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContainersPackage.TMEMBER_CONTAINER: {
				TMemberContainer tMemberContainer = (TMemberContainer)theEObject;
				T result = caseTMemberContainer(tMemberContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContainersPackage.TCLASS_CONTAINER: {
				TClassContainer tClassContainer = (TClassContainer)theEObject;
				T result = caseTClassContainer(tClassContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContainersPackage.TFIELD_CONTAINER: {
				TFieldContainer tFieldContainer = (TFieldContainer)theEObject;
				T result = caseTFieldContainer(tFieldContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContainersPackage.TFIELD_DEFINITION_CONTAINER: {
				TFieldDefinitionContainer tFieldDefinitionContainer = (TFieldDefinitionContainer)theEObject;
				T result = caseTFieldDefinitionContainer(tFieldDefinitionContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContainersPackage.TFIELD_SIGNATURE_CONTAINER: {
				TFieldSignatureContainer tFieldSignatureContainer = (TFieldSignatureContainer)theEObject;
				T result = caseTFieldSignatureContainer(tFieldSignatureContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContainersPackage.TSIGNATURE_CONTAINER: {
				TSignatureContainer tSignatureContainer = (TSignatureContainer)theEObject;
				T result = caseTSignatureContainer(tSignatureContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContainersPackage.TMETHOD_DEFINITION_CONTAINER: {
				TMethodDefinitionContainer tMethodDefinitionContainer = (TMethodDefinitionContainer)theEObject;
				T result = caseTMethodDefinitionContainer(tMethodDefinitionContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TType Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TType Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTypeContainer(TTypeContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAccess Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAccess Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAccessContainer(TAccessContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMember Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMember Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMemberContainer(TMemberContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TClass Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TClass Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTClassContainer(TClassContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TField Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TField Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTFieldContainer(TFieldContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TField Definition Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TField Definition Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTFieldDefinitionContainer(TFieldDefinitionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TField Signature Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TField Signature Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTFieldSignatureContainer(TFieldSignatureContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSignature Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSignature Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSignatureContainer(TSignatureContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMethod Definition Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMethod Definition Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMethodDefinitionContainer(TMethodDefinitionContainer object) {
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

} //ContainersSwitch
