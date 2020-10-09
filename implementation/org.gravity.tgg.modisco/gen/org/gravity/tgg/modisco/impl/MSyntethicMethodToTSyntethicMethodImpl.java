/**
 */
package org.gravity.tgg.modisco.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.modisco.MSyntheticMethodDefinition;

import org.gravity.tgg.modisco.MSyntethicMethodToTSyntethicMethod;
import org.gravity.tgg.modisco.ModiscoPackage;

import org.gravity.typegraph.basic.TSyntethicMethod;

import org.moflon.tgg.runtime.impl.AbstractCorrespondenceImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MSyntethic Method To TSyntethic Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.impl.MSyntethicMethodToTSyntethicMethodImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.impl.MSyntethicMethodToTSyntethicMethodImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MSyntethicMethodToTSyntethicMethodImpl extends AbstractCorrespondenceImpl
		implements MSyntethicMethodToTSyntethicMethod {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected MSyntheticMethodDefinition source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TSyntethicMethod target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MSyntethicMethodToTSyntethicMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSyntheticMethodDefinition getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (MSyntheticMethodDefinition) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSyntheticMethodDefinition basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(MSyntheticMethodDefinition newSource) {
		MSyntheticMethodDefinition oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSyntethicMethod getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (TSyntethicMethod) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSyntethicMethod basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TSyntethicMethod newTarget) {
		TSyntethicMethod oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case ModiscoPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__TARGET:
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
		case ModiscoPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__SOURCE:
			setSource((MSyntheticMethodDefinition) newValue);
			return;
		case ModiscoPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__TARGET:
			setTarget((TSyntethicMethod) newValue);
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
		case ModiscoPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__SOURCE:
			setSource((MSyntheticMethodDefinition) null);
			return;
		case ModiscoPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__TARGET:
			setTarget((TSyntethicMethod) null);
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
		case ModiscoPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__SOURCE:
			return source != null;
		case ModiscoPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MSyntethicMethodToTSyntethicMethodImpl
