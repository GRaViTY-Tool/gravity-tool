/**
 */
package org.gravity.tgg.modisco.pm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.UnresolvedTypeDeclaration;

import org.gravity.tgg.modisco.pm.PmPackage;
import org.gravity.tgg.modisco.pm.UnresolvedTypeDeclarationToTClass;

import org.gravity.typegraph.basic.TClass;

import org.moflon.tgg.runtime.impl.AbstractCorrespondenceImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unresolved Type Declaration To TClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.pm.impl.UnresolvedTypeDeclarationToTClassImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.pm.impl.UnresolvedTypeDeclarationToTClassImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnresolvedTypeDeclarationToTClassImpl extends AbstractCorrespondenceImpl
		implements UnresolvedTypeDeclarationToTClass {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected UnresolvedTypeDeclaration source;

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
	protected UnresolvedTypeDeclarationToTClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PmPackage.Literals.UNRESOLVED_TYPE_DECLARATION_TO_TCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedTypeDeclaration getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (UnresolvedTypeDeclaration) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PmPackage.UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedTypeDeclaration basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(UnresolvedTypeDeclaration newSource) {
		UnresolvedTypeDeclaration oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PmPackage.UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__SOURCE, oldSource, source));
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
							PmPackage.UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					PmPackage.UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PmPackage.UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__SOURCE:
				if (resolve)
					return getSource();
				return basicGetSource();
			case PmPackage.UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__TARGET:
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
			case PmPackage.UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__SOURCE:
				setSource((UnresolvedTypeDeclaration) newValue);
				return;
			case PmPackage.UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__TARGET:
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
			case PmPackage.UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__SOURCE:
				setSource((UnresolvedTypeDeclaration) null);
				return;
			case PmPackage.UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__TARGET:
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
			case PmPackage.UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__SOURCE:
				return source != null;
			case PmPackage.UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UnresolvedTypeDeclarationToTClassImpl
