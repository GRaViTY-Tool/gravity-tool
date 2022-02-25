/**
 */
package org.gravity.tgg.pm.uml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Operation;

import org.gravity.tgg.pm.uml.Operation2TMethodDefinition;
import org.gravity.tgg.pm.uml.UmlPackage;

import org.gravity.typegraph.basic.TMethodDefinition;

import org.moflon.tgg.runtime.impl.AbstractCorrespondenceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation2 TMethod Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.tgg.pm.uml.impl.Operation2TMethodDefinitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.pm.uml.impl.Operation2TMethodDefinitionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Operation2TMethodDefinitionImpl extends AbstractCorrespondenceImpl implements Operation2TMethodDefinition {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Operation source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TMethodDefinition target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Operation2TMethodDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.Literals.OPERATION2_TMETHOD_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (Operation) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UmlPackage.OPERATION2_TMETHOD_DEFINITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Operation newSource) {
		Operation oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION2_TMETHOD_DEFINITION__SOURCE,
					oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethodDefinition getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (TMethodDefinition) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UmlPackage.OPERATION2_TMETHOD_DEFINITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodDefinition basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(TMethodDefinition newTarget) {
		TMethodDefinition oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION2_TMETHOD_DEFINITION__TARGET,
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
		case UmlPackage.OPERATION2_TMETHOD_DEFINITION__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case UmlPackage.OPERATION2_TMETHOD_DEFINITION__TARGET:
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
		case UmlPackage.OPERATION2_TMETHOD_DEFINITION__SOURCE:
			setSource((Operation) newValue);
			return;
		case UmlPackage.OPERATION2_TMETHOD_DEFINITION__TARGET:
			setTarget((TMethodDefinition) newValue);
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
		case UmlPackage.OPERATION2_TMETHOD_DEFINITION__SOURCE:
			setSource((Operation) null);
			return;
		case UmlPackage.OPERATION2_TMETHOD_DEFINITION__TARGET:
			setTarget((TMethodDefinition) null);
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
		case UmlPackage.OPERATION2_TMETHOD_DEFINITION__SOURCE:
			return source != null;
		case UmlPackage.OPERATION2_TMETHOD_DEFINITION__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}

} //Operation2TMethodDefinitionImpl
