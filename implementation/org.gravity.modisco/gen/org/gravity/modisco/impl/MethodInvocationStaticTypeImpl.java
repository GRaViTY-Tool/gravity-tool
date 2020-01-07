/**
 */
package org.gravity.modisco.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.modisco.java.AbstractMethodInvocation;
import org.eclipse.modisco.java.Type;

import org.gravity.modisco.MethodInvocationStaticType;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Invocation Static Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MethodInvocationStaticTypeImpl#getMethodInvoc <em>Method Invoc</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MethodInvocationStaticTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodInvocationStaticTypeImpl extends MinimalEObjectImpl.Container implements MethodInvocationStaticType {
	/**
	 * The cached value of the '{@link #getMethodInvoc() <em>Method Invoc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodInvoc()
	 * @generated
	 * @ordered
	 */
	protected AbstractMethodInvocation methodInvoc;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodInvocationStaticTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.METHOD_INVOCATION_STATIC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMethodInvocation getMethodInvoc() {
		if (methodInvoc != null && methodInvoc.eIsProxy()) {
			InternalEObject oldMethodInvoc = (InternalEObject)methodInvoc;
			methodInvoc = (AbstractMethodInvocation)eResolveProxy(oldMethodInvoc);
			if (methodInvoc != oldMethodInvoc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.METHOD_INVOCATION_STATIC_TYPE__METHOD_INVOC, oldMethodInvoc, methodInvoc));
			}
		}
		return methodInvoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMethodInvocation basicGetMethodInvoc() {
		return methodInvoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodInvoc(AbstractMethodInvocation newMethodInvoc) {
		AbstractMethodInvocation oldMethodInvoc = methodInvoc;
		methodInvoc = newMethodInvoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.METHOD_INVOCATION_STATIC_TYPE__METHOD_INVOC, oldMethodInvoc, methodInvoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.METHOD_INVOCATION_STATIC_TYPE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.METHOD_INVOCATION_STATIC_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModiscoPackage.METHOD_INVOCATION_STATIC_TYPE__METHOD_INVOC:
				if (resolve) return getMethodInvoc();
				return basicGetMethodInvoc();
			case ModiscoPackage.METHOD_INVOCATION_STATIC_TYPE__TYPE:
				if (resolve) return getType();
				return basicGetType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModiscoPackage.METHOD_INVOCATION_STATIC_TYPE__METHOD_INVOC:
				setMethodInvoc((AbstractMethodInvocation)newValue);
				return;
			case ModiscoPackage.METHOD_INVOCATION_STATIC_TYPE__TYPE:
				setType((Type)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModiscoPackage.METHOD_INVOCATION_STATIC_TYPE__METHOD_INVOC:
				setMethodInvoc((AbstractMethodInvocation)null);
				return;
			case ModiscoPackage.METHOD_INVOCATION_STATIC_TYPE__TYPE:
				setType((Type)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModiscoPackage.METHOD_INVOCATION_STATIC_TYPE__METHOD_INVOC:
				return methodInvoc != null;
			case ModiscoPackage.METHOD_INVOCATION_STATIC_TYPE__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

} //MethodInvocationStaticTypeImpl
