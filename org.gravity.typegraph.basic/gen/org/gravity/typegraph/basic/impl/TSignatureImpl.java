/**
 */
package org.gravity.typegraph.basic.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TSignature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSignature</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TSignatureImpl extends TAnnotatableImpl implements TSignature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TSIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignatureString() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case BasicPackage.TSIGNATURE___GET_SIGNATURE_STRING:
			return getSignatureString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TSignatureImpl
