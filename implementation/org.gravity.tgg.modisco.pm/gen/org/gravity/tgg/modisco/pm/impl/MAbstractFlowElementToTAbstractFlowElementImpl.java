/**
 */
package org.gravity.tgg.modisco.pm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.modisco.MAbstractFlowElement;

import org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement;
import org.gravity.tgg.modisco.pm.PmPackage;

import org.gravity.typegraph.basic.TAbstractFlowElement;

import org.moflon.tgg.runtime.impl.AbstractCorrespondenceImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MAbstract Flow Element To TAbstract Flow Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.pm.impl.MAbstractFlowElementToTAbstractFlowElementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.pm.impl.MAbstractFlowElementToTAbstractFlowElementImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MAbstractFlowElementToTAbstractFlowElementImpl extends AbstractCorrespondenceImpl
		implements MAbstractFlowElementToTAbstractFlowElement {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected MAbstractFlowElement source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TAbstractFlowElement target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MAbstractFlowElementToTAbstractFlowElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PmPackage.Literals.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAbstractFlowElement getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (MAbstractFlowElement) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PmPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAbstractFlowElement basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(MAbstractFlowElement newSource) {
		MAbstractFlowElement oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PmPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractFlowElement getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (TAbstractFlowElement) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PmPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractFlowElement basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TAbstractFlowElement newTarget) {
		TAbstractFlowElement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PmPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PmPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case PmPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__TARGET:
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
		case PmPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__SOURCE:
			setSource((MAbstractFlowElement) newValue);
			return;
		case PmPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__TARGET:
			setTarget((TAbstractFlowElement) newValue);
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
		case PmPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__SOURCE:
			setSource((MAbstractFlowElement) null);
			return;
		case PmPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__TARGET:
			setTarget((TAbstractFlowElement) null);
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
		case PmPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__SOURCE:
			return source != null;
		case PmPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MAbstractFlowElementToTAbstractFlowElementImpl
