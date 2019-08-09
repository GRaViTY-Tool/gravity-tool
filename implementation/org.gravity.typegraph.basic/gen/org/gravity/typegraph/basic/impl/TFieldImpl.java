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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TypeGraph;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TField</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TFieldImpl#getSignatures <em>Signatures</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TFieldImpl#getPg <em>Pg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TFieldImpl extends TNameImpl implements TField {
	/**
	 * The cached value of the '{@link #getSignatures() <em>Signatures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<TFieldSignature> signatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TFIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TFieldSignature> getSignatures() {
		if (signatures == null) {
			signatures = new EObjectContainmentWithInverseEList<TFieldSignature>(TFieldSignature.class, this, BasicPackage.TFIELD__SIGNATURES, BasicPackage.TFIELD_SIGNATURE__FIELD);
		}
		return signatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeGraph getPg() {
		if (eContainerFeatureID() != BasicPackage.TFIELD__PG) return null;
		return (TypeGraph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPg(TypeGraph newPg, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPg, BasicPackage.TFIELD__PG, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPg(TypeGraph newPg) {
		if (newPg != eInternalContainer() || (eContainerFeatureID() != BasicPackage.TFIELD__PG && newPg != null)) {
			if (EcoreUtil.isAncestor(this, newPg))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPg != null)
				msgs = ((InternalEObject)newPg).eInverseAdd(this, BasicPackage.TYPE_GRAPH__FIELDS, TypeGraph.class, msgs);
			msgs = basicSetPg(newPg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TFIELD__PG, newPg, newPg));
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
			case BasicPackage.TFIELD__SIGNATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSignatures()).basicAdd(otherEnd, msgs);
			case BasicPackage.TFIELD__PG:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPg((TypeGraph)otherEnd, msgs);
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
			case BasicPackage.TFIELD__SIGNATURES:
				return ((InternalEList<?>)getSignatures()).basicRemove(otherEnd, msgs);
			case BasicPackage.TFIELD__PG:
				return basicSetPg(null, msgs);
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
			case BasicPackage.TFIELD__PG:
				return eInternalContainer().eInverseRemove(this, BasicPackage.TYPE_GRAPH__FIELDS, TypeGraph.class, msgs);
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
			case BasicPackage.TFIELD__SIGNATURES:
				return getSignatures();
			case BasicPackage.TFIELD__PG:
				return getPg();
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
			case BasicPackage.TFIELD__SIGNATURES:
				getSignatures().clear();
				getSignatures().addAll((Collection<? extends TFieldSignature>)newValue);
				return;
			case BasicPackage.TFIELD__PG:
				setPg((TypeGraph)newValue);
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
			case BasicPackage.TFIELD__SIGNATURES:
				getSignatures().clear();
				return;
			case BasicPackage.TFIELD__PG:
				setPg((TypeGraph)null);
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
			case BasicPackage.TFIELD__SIGNATURES:
				return signatures != null && !signatures.isEmpty();
			case BasicPackage.TFIELD__PG:
				return getPg() != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TFieldImpl
