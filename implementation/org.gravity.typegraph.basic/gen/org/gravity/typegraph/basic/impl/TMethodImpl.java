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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TypeGraph;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>TMethod</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodImpl#getSignatures <em>Signatures</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodImpl#getPg <em>Pg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMethodImpl extends TNameImpl implements TMethod {
	/**
	 * The cached value of the '{@link #getSignatures() <em>Signatures</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethodSignature> signatures;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TMETHOD;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TMethodSignature> getSignatures() {
		if (signatures == null) {
			signatures = new EObjectContainmentWithInverseEList<TMethodSignature>(TMethodSignature.class, this, BasicPackage.TMETHOD__SIGNATURES, BasicPackage.TMETHOD_SIGNATURE__METHOD);
		}
		return signatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeGraph getPg() {
		if (eContainerFeatureID() != BasicPackage.TMETHOD__PG) return null;
		return (TypeGraph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPg(TypeGraph newPg, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPg, BasicPackage.TMETHOD__PG, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPg(TypeGraph newPg) {
		if (newPg != eInternalContainer() || (eContainerFeatureID() != BasicPackage.TMETHOD__PG && newPg != null)) {
			if (EcoreUtil.isAncestor(this, newPg))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPg != null)
				msgs = ((InternalEObject)newPg).eInverseAdd(this, BasicPackage.TYPE_GRAPH__METHODS, TypeGraph.class, msgs);
			msgs = basicSetPg(newPg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TMETHOD__PG, newPg, newPg));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public TMethodSignature getSignature(TAbstractType returnType, EList<TAbstractType> parameterTypes) {
		return getSignatures().parallelStream()
				.filter(signature -> signature.isThisSignature(returnType, parameterTypes))
				.findAny().orElse(null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicPackage.TMETHOD__SIGNATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSignatures()).basicAdd(otherEnd, msgs);
			case BasicPackage.TMETHOD__PG:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPg((TypeGraph)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicPackage.TMETHOD__SIGNATURES:
				return ((InternalEList<?>)getSignatures()).basicRemove(otherEnd, msgs);
			case BasicPackage.TMETHOD__PG:
				return basicSetPg(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case BasicPackage.TMETHOD__PG:
				return eInternalContainer().eInverseRemove(this, BasicPackage.TYPE_GRAPH__METHODS, TypeGraph.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicPackage.TMETHOD__SIGNATURES:
				return getSignatures();
			case BasicPackage.TMETHOD__PG:
				return getPg();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasicPackage.TMETHOD__SIGNATURES:
				getSignatures().clear();
				getSignatures().addAll((Collection<? extends TMethodSignature>)newValue);
				return;
			case BasicPackage.TMETHOD__PG:
				setPg((TypeGraph)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasicPackage.TMETHOD__SIGNATURES:
				getSignatures().clear();
				return;
			case BasicPackage.TMETHOD__PG:
				setPg((TypeGraph)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasicPackage.TMETHOD__SIGNATURES:
				return signatures != null && !signatures.isEmpty();
			case BasicPackage.TMETHOD__PG:
				return getPg() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BasicPackage.TMETHOD___GET_SIGNATURE__TABSTRACTTYPE_ELIST:
				return getSignature((TAbstractType)arguments.get(0), (EList<TAbstractType>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TMethodImpl
