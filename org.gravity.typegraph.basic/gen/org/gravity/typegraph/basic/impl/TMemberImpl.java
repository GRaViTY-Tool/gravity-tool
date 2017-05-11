/**
 */
package org.gravity.typegraph.basic.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TSignature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMember</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMemberImpl#getDefinedBy <em>Defined By</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMemberImpl#getAccessedBy <em>Accessed By</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMemberImpl#getTAccessing <em>TAccessing</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TMemberImpl extends TAnnotatableImpl implements TMember {
	/**
	 * The cached value of the '{@link #getDefinedBy() <em>Defined By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedBy()
	 * @generated
	 * @ordered
	 */
	protected TAbstractType definedBy;

	/**
	 * The cached value of the '{@link #getAccessedBy() <em>Accessed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<TAccess> accessedBy;

	/**
	 * The cached value of the '{@link #getTAccessing() <em>TAccessing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTAccessing()
	 * @generated
	 * @ordered
	 */
	protected EList<TAccess> tAccessing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TMEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType getDefinedBy() {
		if (definedBy != null && definedBy.eIsProxy()) {
			InternalEObject oldDefinedBy = (InternalEObject) definedBy;
			definedBy = (TAbstractType) eResolveProxy(oldDefinedBy);
			if (definedBy != oldDefinedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TMEMBER__DEFINED_BY,
							oldDefinedBy, definedBy));
			}
		}
		return definedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType basicGetDefinedBy() {
		return definedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinedBy(TAbstractType newDefinedBy, NotificationChain msgs) {
		TAbstractType oldDefinedBy = definedBy;
		definedBy = newDefinedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BasicPackage.TMEMBER__DEFINED_BY, oldDefinedBy, newDefinedBy);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedBy(TAbstractType newDefinedBy) {
		if (newDefinedBy != definedBy) {
			NotificationChain msgs = null;
			if (definedBy != null)
				msgs = ((InternalEObject) definedBy).eInverseRemove(this, BasicPackage.TABSTRACT_TYPE__DEFINES,
						TAbstractType.class, msgs);
			if (newDefinedBy != null)
				msgs = ((InternalEObject) newDefinedBy).eInverseAdd(this, BasicPackage.TABSTRACT_TYPE__DEFINES,
						TAbstractType.class, msgs);
			msgs = basicSetDefinedBy(newDefinedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TMEMBER__DEFINED_BY, newDefinedBy,
					newDefinedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TAccess> getAccessedBy() {
		if (accessedBy == null) {
			accessedBy = new EObjectWithInverseResolvingEList<TAccess>(TAccess.class, this,
					BasicPackage.TMEMBER__ACCESSED_BY, BasicPackage.TACCESS__TTARGET);
		}
		return accessedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TAccess> getTAccessing() {
		if (tAccessing == null) {
			tAccessing = new EObjectContainmentWithInverseEList<TAccess>(TAccess.class, this,
					BasicPackage.TMEMBER__TACCESSING, BasicPackage.TACCESS__TSOURCE);
		}
		return tAccessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSignature getSignature() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicPackage.TMEMBER__DEFINED_BY:
			if (definedBy != null)
				msgs = ((InternalEObject) definedBy).eInverseRemove(this, BasicPackage.TABSTRACT_TYPE__DEFINES,
						TAbstractType.class, msgs);
			return basicSetDefinedBy((TAbstractType) otherEnd, msgs);
		case BasicPackage.TMEMBER__ACCESSED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAccessedBy()).basicAdd(otherEnd, msgs);
		case BasicPackage.TMEMBER__TACCESSING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTAccessing()).basicAdd(otherEnd, msgs);
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
		case BasicPackage.TMEMBER__DEFINED_BY:
			return basicSetDefinedBy(null, msgs);
		case BasicPackage.TMEMBER__ACCESSED_BY:
			return ((InternalEList<?>) getAccessedBy()).basicRemove(otherEnd, msgs);
		case BasicPackage.TMEMBER__TACCESSING:
			return ((InternalEList<?>) getTAccessing()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BasicPackage.TMEMBER__DEFINED_BY:
			if (resolve)
				return getDefinedBy();
			return basicGetDefinedBy();
		case BasicPackage.TMEMBER__ACCESSED_BY:
			return getAccessedBy();
		case BasicPackage.TMEMBER__TACCESSING:
			return getTAccessing();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BasicPackage.TMEMBER__DEFINED_BY:
			setDefinedBy((TAbstractType) newValue);
			return;
		case BasicPackage.TMEMBER__ACCESSED_BY:
			getAccessedBy().clear();
			getAccessedBy().addAll((Collection<? extends TAccess>) newValue);
			return;
		case BasicPackage.TMEMBER__TACCESSING:
			getTAccessing().clear();
			getTAccessing().addAll((Collection<? extends TAccess>) newValue);
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
		case BasicPackage.TMEMBER__DEFINED_BY:
			setDefinedBy((TAbstractType) null);
			return;
		case BasicPackage.TMEMBER__ACCESSED_BY:
			getAccessedBy().clear();
			return;
		case BasicPackage.TMEMBER__TACCESSING:
			getTAccessing().clear();
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
		case BasicPackage.TMEMBER__DEFINED_BY:
			return definedBy != null;
		case BasicPackage.TMEMBER__ACCESSED_BY:
			return accessedBy != null && !accessedBy.isEmpty();
		case BasicPackage.TMEMBER__TACCESSING:
			return tAccessing != null && !tAccessing.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case BasicPackage.TMEMBER___GET_SIGNATURE:
			return getSignature();
		case BasicPackage.TMEMBER___GET_SIGNATURE_STRING:
			return getSignatureString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TMemberImpl
