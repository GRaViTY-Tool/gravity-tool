/**
 */
package org.gravity.typegraph.basic.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TDeclaredEntity;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDeclared Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TDeclaredEntityImpl#getPg <em>Pg</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TDeclaredEntityImpl#getTVisibility <em>TVisibility</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TDeclaredEntityImpl extends EObjectImpl implements TDeclaredEntity {
	/**
	 * The default value of the '{@link #getTVisibility() <em>TVisibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final TVisibility TVISIBILITY_EDEFAULT = TVisibility.TPRIVATE;

	/**
	 * The cached value of the '{@link #getTVisibility() <em>TVisibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTVisibility()
	 * @generated
	 * @ordered
	 */
	protected TVisibility tVisibility = TVISIBILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDeclaredEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TDECLARED_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraph getPg() {
		if (eContainerFeatureID() != BasicPackage.TDECLARED_ENTITY__PG)
			return null;
		return (TypeGraph) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPg(TypeGraph newPg, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPg, BasicPackage.TDECLARED_ENTITY__PG, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPg(TypeGraph newPg) {
		if (newPg != eInternalContainer()
				|| (eContainerFeatureID() != BasicPackage.TDECLARED_ENTITY__PG && newPg != null)) {
			if (EcoreUtil.isAncestor(this, newPg))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPg != null)
				msgs = ((InternalEObject) newPg).eInverseAdd(this, BasicPackage.TYPE_GRAPH__TDECLARED_ENTITIES,
						TypeGraph.class, msgs);
			msgs = basicSetPg(newPg, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TDECLARED_ENTITY__PG, newPg, newPg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVisibility getTVisibility() {
		return tVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTVisibility(TVisibility newTVisibility) {
		TVisibility oldTVisibility = tVisibility;
		tVisibility = newTVisibility == null ? TVISIBILITY_EDEFAULT : newTVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TDECLARED_ENTITY__TVISIBILITY,
					oldTVisibility, tVisibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDeclaredEntity getParent() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TDeclaredEntity> getParents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackage getPackage() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVisibility getMinimumRequiredVisibility(TDeclaredEntity tDeclaredEntity) {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicPackage.TDECLARED_ENTITY__PG:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPg((TypeGraph) otherEnd, msgs);
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
		case BasicPackage.TDECLARED_ENTITY__PG:
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
		case BasicPackage.TDECLARED_ENTITY__PG:
			return eInternalContainer().eInverseRemove(this, BasicPackage.TYPE_GRAPH__TDECLARED_ENTITIES,
					TypeGraph.class, msgs);
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
		case BasicPackage.TDECLARED_ENTITY__PG:
			return getPg();
		case BasicPackage.TDECLARED_ENTITY__TVISIBILITY:
			return getTVisibility();
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
		case BasicPackage.TDECLARED_ENTITY__PG:
			setPg((TypeGraph) newValue);
			return;
		case BasicPackage.TDECLARED_ENTITY__TVISIBILITY:
			setTVisibility((TVisibility) newValue);
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
		case BasicPackage.TDECLARED_ENTITY__PG:
			setPg((TypeGraph) null);
			return;
		case BasicPackage.TDECLARED_ENTITY__TVISIBILITY:
			setTVisibility(TVISIBILITY_EDEFAULT);
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
		case BasicPackage.TDECLARED_ENTITY__PG:
			return getPg() != null;
		case BasicPackage.TDECLARED_ENTITY__TVISIBILITY:
			return tVisibility != TVISIBILITY_EDEFAULT;
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
		case BasicPackage.TDECLARED_ENTITY___GET_PARENT:
			return getParent();
		case BasicPackage.TDECLARED_ENTITY___GET_PARENTS:
			return getParents();
		case BasicPackage.TDECLARED_ENTITY___GET_PACKAGE:
			return getPackage();
		case BasicPackage.TDECLARED_ENTITY___GET_MINIMUM_REQUIRED_VISIBILITY__TDECLAREDENTITY:
			return getMinimumRequiredVisibility((TDeclaredEntity) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tVisibility: ");
		result.append(tVisibility);
		result.append(')');
		return result.toString();
	}

} //TDeclaredEntityImpl
