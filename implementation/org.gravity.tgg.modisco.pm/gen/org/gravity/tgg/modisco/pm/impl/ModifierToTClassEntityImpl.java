/**
 */
package org.gravity.tgg.modisco.pm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.Modifier;

import org.gravity.tgg.modisco.pm.ModifierToTClassEntity;
import org.gravity.tgg.modisco.pm.PmPackage;

import org.gravity.typegraph.basic.TClass;

import org.moflon.tgg.runtime.impl.AbstractCorrespondenceImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifier To TClass Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.pm.impl.ModifierToTClassEntityImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.pm.impl.ModifierToTClassEntityImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModifierToTClassEntityImpl extends AbstractCorrespondenceImpl implements ModifierToTClassEntity {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Modifier source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TClass target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifierToTClassEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PmPackage.Literals.MODIFIER_TO_TCLASS_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modifier getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (Modifier) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PmPackage.MODIFIER_TO_TCLASS_ENTITY__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modifier basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Modifier newSource) {
		Modifier oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PmPackage.MODIFIER_TO_TCLASS_ENTITY__SOURCE,
					oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (TClass) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PmPackage.MODIFIER_TO_TCLASS_ENTITY__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TClass newTarget) {
		TClass oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PmPackage.MODIFIER_TO_TCLASS_ENTITY__TARGET,
					oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PmPackage.MODIFIER_TO_TCLASS_ENTITY__SOURCE:
				if (resolve)
					return getSource();
				return basicGetSource();
			case PmPackage.MODIFIER_TO_TCLASS_ENTITY__TARGET:
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
			case PmPackage.MODIFIER_TO_TCLASS_ENTITY__SOURCE:
				setSource((Modifier) newValue);
				return;
			case PmPackage.MODIFIER_TO_TCLASS_ENTITY__TARGET:
				setTarget((TClass) newValue);
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
			case PmPackage.MODIFIER_TO_TCLASS_ENTITY__SOURCE:
				setSource((Modifier) null);
				return;
			case PmPackage.MODIFIER_TO_TCLASS_ENTITY__TARGET:
				setTarget((TClass) null);
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
			case PmPackage.MODIFIER_TO_TCLASS_ENTITY__SOURCE:
				return source != null;
			case PmPackage.MODIFIER_TO_TCLASS_ENTITY__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ModifierToTClassEntityImpl
