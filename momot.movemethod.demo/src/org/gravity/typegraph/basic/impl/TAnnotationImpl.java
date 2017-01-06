/**
 */
package org.gravity.typegraph.basic.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAnnotatable;
import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TAnnotationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAnnotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAnnotationImpl#getTAnnotated <em>TAnnotated</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAnnotationImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TAnnotationImpl extends TElementWithIdImpl implements TAnnotation {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TAnnotationType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAnnotatable getTAnnotated() {
		if (eContainerFeatureID() != BasicPackage.TANNOTATION__TANNOTATED) return null;
		return (TAnnotatable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTAnnotated(TAnnotatable newTAnnotated, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTAnnotated, BasicPackage.TANNOTATION__TANNOTATED, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTAnnotated(TAnnotatable newTAnnotated) {
		if (newTAnnotated != eInternalContainer() || (eContainerFeatureID() != BasicPackage.TANNOTATION__TANNOTATED && newTAnnotated != null)) {
			if (EcoreUtil.isAncestor(this, newTAnnotated))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTAnnotated != null)
				msgs = ((InternalEObject)newTAnnotated).eInverseAdd(this, BasicPackage.TANNOTATABLE__TANNOTATION, TAnnotatable.class, msgs);
			msgs = basicSetTAnnotated(newTAnnotated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TANNOTATION__TANNOTATED, newTAnnotated, newTAnnotated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAnnotationType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (TAnnotationType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TANNOTATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAnnotationType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TAnnotationType newType, NotificationChain msgs) {
		TAnnotationType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicPackage.TANNOTATION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TAnnotationType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, BasicPackage.TANNOTATION_TYPE__ANNOTATIONS, TAnnotationType.class, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, BasicPackage.TANNOTATION_TYPE__ANNOTATIONS, TAnnotationType.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TANNOTATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicPackage.TANNOTATION__TANNOTATED:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTAnnotated((TAnnotatable)otherEnd, msgs);
			case BasicPackage.TANNOTATION__TYPE:
				if (type != null)
					msgs = ((InternalEObject)type).eInverseRemove(this, BasicPackage.TANNOTATION_TYPE__ANNOTATIONS, TAnnotationType.class, msgs);
				return basicSetType((TAnnotationType)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicPackage.TANNOTATION__TANNOTATED:
				return basicSetTAnnotated(null, msgs);
			case BasicPackage.TANNOTATION__TYPE:
				return basicSetType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case BasicPackage.TANNOTATION__TANNOTATED:
				return eInternalContainer().eInverseRemove(this, BasicPackage.TANNOTATABLE__TANNOTATION, TAnnotatable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicPackage.TANNOTATION__TANNOTATED:
				return getTAnnotated();
			case BasicPackage.TANNOTATION__TYPE:
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
			case BasicPackage.TANNOTATION__TANNOTATED:
				setTAnnotated((TAnnotatable)newValue);
				return;
			case BasicPackage.TANNOTATION__TYPE:
				setType((TAnnotationType)newValue);
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
			case BasicPackage.TANNOTATION__TANNOTATED:
				setTAnnotated((TAnnotatable)null);
				return;
			case BasicPackage.TANNOTATION__TYPE:
				setType((TAnnotationType)null);
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
			case BasicPackage.TANNOTATION__TANNOTATED:
				return getTAnnotated() != null;
			case BasicPackage.TANNOTATION__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

} //TAnnotationImpl
