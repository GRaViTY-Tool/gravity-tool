/**
 */
package org.gravity.tgg.pm.uml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Property;

import org.gravity.tgg.pm.uml.StereotypeProperty2AnnotationNode;
import org.gravity.tgg.pm.uml.UmlPackage;

import org.gravity.typegraph.basic.annotations.TAbstractNode;

import org.moflon.tgg.runtime.impl.AbstractCorrespondenceImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stereotype Property2 Annotation Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.tgg.pm.uml.impl.StereotypeProperty2AnnotationNodeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.pm.uml.impl.StereotypeProperty2AnnotationNodeImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StereotypeProperty2AnnotationNodeImpl extends AbstractCorrespondenceImpl
		implements StereotypeProperty2AnnotationNode {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Property source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TAbstractNode target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StereotypeProperty2AnnotationNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.Literals.STEREOTYPE_PROPERTY2_ANNOTATION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (Property) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UmlPackage.STEREOTYPE_PROPERTY2_ANNOTATION_NODE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Property newSource) {
		Property oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UmlPackage.STEREOTYPE_PROPERTY2_ANNOTATION_NODE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (TAbstractNode) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UmlPackage.STEREOTYPE_PROPERTY2_ANNOTATION_NODE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TAbstractNode newTarget) {
		TAbstractNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UmlPackage.STEREOTYPE_PROPERTY2_ANNOTATION_NODE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UmlPackage.STEREOTYPE_PROPERTY2_ANNOTATION_NODE__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case UmlPackage.STEREOTYPE_PROPERTY2_ANNOTATION_NODE__TARGET:
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
		case UmlPackage.STEREOTYPE_PROPERTY2_ANNOTATION_NODE__SOURCE:
			setSource((Property) newValue);
			return;
		case UmlPackage.STEREOTYPE_PROPERTY2_ANNOTATION_NODE__TARGET:
			setTarget((TAbstractNode) newValue);
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
		case UmlPackage.STEREOTYPE_PROPERTY2_ANNOTATION_NODE__SOURCE:
			setSource((Property) null);
			return;
		case UmlPackage.STEREOTYPE_PROPERTY2_ANNOTATION_NODE__TARGET:
			setTarget((TAbstractNode) null);
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
		case UmlPackage.STEREOTYPE_PROPERTY2_ANNOTATION_NODE__SOURCE:
			return source != null;
		case UmlPackage.STEREOTYPE_PROPERTY2_ANNOTATION_NODE__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //StereotypeProperty2AnnotationNodeImpl
