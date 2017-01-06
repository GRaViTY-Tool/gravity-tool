/**
 */
package org.gravity.typegraph.basic.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TField Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TFieldDefinitionImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TFieldDefinitionImpl#getHiding <em>Hiding</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TFieldDefinitionImpl#getHiddenBy <em>Hidden By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TFieldDefinitionImpl extends TMemberImpl implements TFieldDefinition {
	/**
	 * The cached value of the '{@link #getHiding() <em>Hiding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiding()
	 * @generated
	 * @ordered
	 */
	protected TFieldDefinition hiding;

	/**
	 * The cached value of the '{@link #getHiddenBy() <em>Hidden By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiddenBy()
	 * @generated
	 * @ordered
	 */
	protected EList<TFieldDefinition> hiddenBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFieldDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TFIELD_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldSignature getSignature() {
		if (eContainerFeatureID() != BasicPackage.TFIELD_DEFINITION__SIGNATURE) return null;
		return (TFieldSignature)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignature(TFieldSignature newSignature, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSignature, BasicPackage.TFIELD_DEFINITION__SIGNATURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(TFieldSignature newSignature) {
		if (newSignature != eInternalContainer() || (eContainerFeatureID() != BasicPackage.TFIELD_DEFINITION__SIGNATURE && newSignature != null)) {
			if (EcoreUtil.isAncestor(this, newSignature))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSignature != null)
				msgs = ((InternalEObject)newSignature).eInverseAdd(this, BasicPackage.TFIELD_SIGNATURE__DEFINITIONS, TFieldSignature.class, msgs);
			msgs = basicSetSignature(newSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TFIELD_DEFINITION__SIGNATURE, newSignature, newSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldDefinition getHiding() {
		if (hiding != null && hiding.eIsProxy()) {
			InternalEObject oldHiding = (InternalEObject)hiding;
			hiding = (TFieldDefinition)eResolveProxy(oldHiding);
			if (hiding != oldHiding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TFIELD_DEFINITION__HIDING, oldHiding, hiding));
			}
		}
		return hiding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldDefinition basicGetHiding() {
		return hiding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHiding(TFieldDefinition newHiding, NotificationChain msgs) {
		TFieldDefinition oldHiding = hiding;
		hiding = newHiding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicPackage.TFIELD_DEFINITION__HIDING, oldHiding, newHiding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHiding(TFieldDefinition newHiding) {
		if (newHiding != hiding) {
			NotificationChain msgs = null;
			if (hiding != null)
				msgs = ((InternalEObject)hiding).eInverseRemove(this, BasicPackage.TFIELD_DEFINITION__HIDDEN_BY, TFieldDefinition.class, msgs);
			if (newHiding != null)
				msgs = ((InternalEObject)newHiding).eInverseAdd(this, BasicPackage.TFIELD_DEFINITION__HIDDEN_BY, TFieldDefinition.class, msgs);
			msgs = basicSetHiding(newHiding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TFIELD_DEFINITION__HIDING, newHiding, newHiding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TFieldDefinition> getHiddenBy() {
		if (hiddenBy == null) {
			hiddenBy = new EObjectWithInverseResolvingEList<TFieldDefinition>(TFieldDefinition.class, this, BasicPackage.TFIELD_DEFINITION__HIDDEN_BY, BasicPackage.TFIELD_DEFINITION__HIDING);
		}
		return hiddenBy;
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
			case BasicPackage.TFIELD_DEFINITION__SIGNATURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSignature((TFieldSignature)otherEnd, msgs);
			case BasicPackage.TFIELD_DEFINITION__HIDING:
				if (hiding != null)
					msgs = ((InternalEObject)hiding).eInverseRemove(this, BasicPackage.TFIELD_DEFINITION__HIDDEN_BY, TFieldDefinition.class, msgs);
				return basicSetHiding((TFieldDefinition)otherEnd, msgs);
			case BasicPackage.TFIELD_DEFINITION__HIDDEN_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHiddenBy()).basicAdd(otherEnd, msgs);
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
			case BasicPackage.TFIELD_DEFINITION__SIGNATURE:
				return basicSetSignature(null, msgs);
			case BasicPackage.TFIELD_DEFINITION__HIDING:
				return basicSetHiding(null, msgs);
			case BasicPackage.TFIELD_DEFINITION__HIDDEN_BY:
				return ((InternalEList<?>)getHiddenBy()).basicRemove(otherEnd, msgs);
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
			case BasicPackage.TFIELD_DEFINITION__SIGNATURE:
				return eInternalContainer().eInverseRemove(this, BasicPackage.TFIELD_SIGNATURE__DEFINITIONS, TFieldSignature.class, msgs);
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
			case BasicPackage.TFIELD_DEFINITION__SIGNATURE:
				return getSignature();
			case BasicPackage.TFIELD_DEFINITION__HIDING:
				if (resolve) return getHiding();
				return basicGetHiding();
			case BasicPackage.TFIELD_DEFINITION__HIDDEN_BY:
				return getHiddenBy();
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
			case BasicPackage.TFIELD_DEFINITION__SIGNATURE:
				setSignature((TFieldSignature)newValue);
				return;
			case BasicPackage.TFIELD_DEFINITION__HIDING:
				setHiding((TFieldDefinition)newValue);
				return;
			case BasicPackage.TFIELD_DEFINITION__HIDDEN_BY:
				getHiddenBy().clear();
				getHiddenBy().addAll((Collection<? extends TFieldDefinition>)newValue);
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
			case BasicPackage.TFIELD_DEFINITION__SIGNATURE:
				setSignature((TFieldSignature)null);
				return;
			case BasicPackage.TFIELD_DEFINITION__HIDING:
				setHiding((TFieldDefinition)null);
				return;
			case BasicPackage.TFIELD_DEFINITION__HIDDEN_BY:
				getHiddenBy().clear();
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
			case BasicPackage.TFIELD_DEFINITION__SIGNATURE:
				return getSignature() != null;
			case BasicPackage.TFIELD_DEFINITION__HIDING:
				return hiding != null;
			case BasicPackage.TFIELD_DEFINITION__HIDDEN_BY:
				return hiddenBy != null && !hiddenBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TFieldDefinitionImpl
