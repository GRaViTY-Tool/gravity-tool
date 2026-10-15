/**
 */
package org.gravity.tgg.modisco.uml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.ParameterizedType;

import org.eclipse.uml2.uml.RedefinableTemplateSignature;

import org.gravity.tgg.modisco.uml.ParameterizedType2RedefinableTemplateSignature;
import org.gravity.tgg.modisco.uml.UmlPackage;

import org.moflon.tgg.runtime.impl.AbstractCorrespondenceImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameterized Type2 Redefinable Template Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.uml.impl.ParameterizedType2RedefinableTemplateSignatureImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.uml.impl.ParameterizedType2RedefinableTemplateSignatureImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterizedType2RedefinableTemplateSignatureImpl extends AbstractCorrespondenceImpl
		implements ParameterizedType2RedefinableTemplateSignature {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ParameterizedType source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected RedefinableTemplateSignature target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterizedType2RedefinableTemplateSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.Literals.PARAMETERIZED_TYPE2_REDEFINABLE_TEMPLATE_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterizedType getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (ParameterizedType) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UmlPackage.PARAMETERIZED_TYPE2_REDEFINABLE_TEMPLATE_SIGNATURE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterizedType basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ParameterizedType newSource) {
		ParameterizedType oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UmlPackage.PARAMETERIZED_TYPE2_REDEFINABLE_TEMPLATE_SIGNATURE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableTemplateSignature getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (RedefinableTemplateSignature) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UmlPackage.PARAMETERIZED_TYPE2_REDEFINABLE_TEMPLATE_SIGNATURE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableTemplateSignature basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(RedefinableTemplateSignature newTarget) {
		RedefinableTemplateSignature oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UmlPackage.PARAMETERIZED_TYPE2_REDEFINABLE_TEMPLATE_SIGNATURE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UmlPackage.PARAMETERIZED_TYPE2_REDEFINABLE_TEMPLATE_SIGNATURE__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case UmlPackage.PARAMETERIZED_TYPE2_REDEFINABLE_TEMPLATE_SIGNATURE__TARGET:
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
		case UmlPackage.PARAMETERIZED_TYPE2_REDEFINABLE_TEMPLATE_SIGNATURE__SOURCE:
			setSource((ParameterizedType) newValue);
			return;
		case UmlPackage.PARAMETERIZED_TYPE2_REDEFINABLE_TEMPLATE_SIGNATURE__TARGET:
			setTarget((RedefinableTemplateSignature) newValue);
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
		case UmlPackage.PARAMETERIZED_TYPE2_REDEFINABLE_TEMPLATE_SIGNATURE__SOURCE:
			setSource((ParameterizedType) null);
			return;
		case UmlPackage.PARAMETERIZED_TYPE2_REDEFINABLE_TEMPLATE_SIGNATURE__TARGET:
			setTarget((RedefinableTemplateSignature) null);
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
		case UmlPackage.PARAMETERIZED_TYPE2_REDEFINABLE_TEMPLATE_SIGNATURE__SOURCE:
			return source != null;
		case UmlPackage.PARAMETERIZED_TYPE2_REDEFINABLE_TEMPLATE_SIGNATURE__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParameterizedType2RedefinableTemplateSignatureImpl
