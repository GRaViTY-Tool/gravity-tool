/**
 */
package org.gravity.tgg.pm.uml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Interface;

import org.gravity.tgg.pm.uml.Interface2TInterface;
import org.gravity.tgg.pm.uml.UmlPackage;

import org.gravity.typegraph.basic.TInterface;

import org.moflon.tgg.runtime.impl.AbstractCorrespondenceImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface2 TInterface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.tgg.pm.uml.impl.Interface2TInterfaceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.pm.uml.impl.Interface2TInterfaceImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Interface2TInterfaceImpl extends AbstractCorrespondenceImpl implements Interface2TInterface {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Interface source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TInterface target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Interface2TInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.Literals.INTERFACE2_TINTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (Interface) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.INTERFACE2_TINTERFACE__SOURCE,
							oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Interface newSource) {
		Interface oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERFACE2_TINTERFACE__SOURCE, oldSource,
					source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TInterface getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (TInterface) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.INTERFACE2_TINTERFACE__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TInterface basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TInterface newTarget) {
		TInterface oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERFACE2_TINTERFACE__TARGET, oldTarget,
					target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UmlPackage.INTERFACE2_TINTERFACE__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case UmlPackage.INTERFACE2_TINTERFACE__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
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
		case UmlPackage.INTERFACE2_TINTERFACE__SOURCE:
			setSource((Interface) newValue);
			return;
		case UmlPackage.INTERFACE2_TINTERFACE__TARGET:
			setTarget((TInterface) newValue);
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
		case UmlPackage.INTERFACE2_TINTERFACE__SOURCE:
			setSource((Interface) null);
			return;
		case UmlPackage.INTERFACE2_TINTERFACE__TARGET:
			setTarget((TInterface) null);
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
		case UmlPackage.INTERFACE2_TINTERFACE__SOURCE:
			return source != null;
		case UmlPackage.INTERFACE2_TINTERFACE__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //Interface2TInterfaceImpl
