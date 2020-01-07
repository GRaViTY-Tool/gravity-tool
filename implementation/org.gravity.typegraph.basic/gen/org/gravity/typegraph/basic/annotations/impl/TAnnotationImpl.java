/**
 */
package org.gravity.typegraph.basic.annotations.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.gravity.typegraph.basic.annotations.AnnotationsPackage;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;
import org.gravity.typegraph.basic.annotations.TAnnotationValue;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>TAnnotation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.annotations.impl.TAnnotationImpl#getTAnnotated <em>TAnnotated</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.annotations.impl.TAnnotationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.annotations.impl.TAnnotationImpl#getTValues <em>TValues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TAnnotationImpl extends EObjectImpl implements TAnnotation {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TAnnotationType type;

	/**
	 * The cached value of the '{@link #getTValues() <em>TValues</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TAnnotationValue> tValues;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.TANNOTATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAnnotatable getTAnnotated() {
		if (eContainerFeatureID() != AnnotationsPackage.TANNOTATION__TANNOTATED) return null;
		return (TAnnotatable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTAnnotated(TAnnotatable newTAnnotated, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTAnnotated, AnnotationsPackage.TANNOTATION__TANNOTATED, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTAnnotated(TAnnotatable newTAnnotated) {
		if (newTAnnotated != eInternalContainer() || (eContainerFeatureID() != AnnotationsPackage.TANNOTATION__TANNOTATED && newTAnnotated != null)) {
			if (EcoreUtil.isAncestor(this, newTAnnotated))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTAnnotated != null)
				msgs = ((InternalEObject)newTAnnotated).eInverseAdd(this, AnnotationsPackage.TANNOTATABLE__TANNOTATION, TAnnotatable.class, msgs);
			msgs = basicSetTAnnotated(newTAnnotated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.TANNOTATION__TANNOTATED, newTAnnotated, newTAnnotated));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAnnotationType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (TAnnotationType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.TANNOTATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TAnnotationType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TAnnotationType newType, NotificationChain msgs) {
		TAnnotationType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnnotationsPackage.TANNOTATION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TAnnotationType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, AnnotationsPackage.TANNOTATION_TYPE__ANNOTATIONS, TAnnotationType.class, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, AnnotationsPackage.TANNOTATION_TYPE__ANNOTATIONS, TAnnotationType.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.TANNOTATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAnnotationValue> getTValues() {
		if (tValues == null) {
			tValues = new EObjectContainmentEList<TAnnotationValue>(TAnnotationValue.class, this, AnnotationsPackage.TANNOTATION__TVALUES);
		}
		return tValues;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TAnnotationValue getValue(String key) {
		return getTValues().parallelStream().filter(value -> value.getTKey().equals(key)).findAny().orElse(null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsPackage.TANNOTATION__TANNOTATED:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTAnnotated((TAnnotatable)otherEnd, msgs);
			case AnnotationsPackage.TANNOTATION__TYPE:
				if (type != null)
					msgs = ((InternalEObject)type).eInverseRemove(this, AnnotationsPackage.TANNOTATION_TYPE__ANNOTATIONS, TAnnotationType.class, msgs);
				return basicSetType((TAnnotationType)otherEnd, msgs);
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
			case AnnotationsPackage.TANNOTATION__TANNOTATED:
				return basicSetTAnnotated(null, msgs);
			case AnnotationsPackage.TANNOTATION__TYPE:
				return basicSetType(null, msgs);
			case AnnotationsPackage.TANNOTATION__TVALUES:
				return ((InternalEList<?>)getTValues()).basicRemove(otherEnd, msgs);
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
			case AnnotationsPackage.TANNOTATION__TANNOTATED:
				return eInternalContainer().eInverseRemove(this, AnnotationsPackage.TANNOTATABLE__TANNOTATION, TAnnotatable.class, msgs);
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
			case AnnotationsPackage.TANNOTATION__TANNOTATED:
				return getTAnnotated();
			case AnnotationsPackage.TANNOTATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case AnnotationsPackage.TANNOTATION__TVALUES:
				return getTValues();
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
			case AnnotationsPackage.TANNOTATION__TANNOTATED:
				setTAnnotated((TAnnotatable)newValue);
				return;
			case AnnotationsPackage.TANNOTATION__TYPE:
				setType((TAnnotationType)newValue);
				return;
			case AnnotationsPackage.TANNOTATION__TVALUES:
				getTValues().clear();
				getTValues().addAll((Collection<? extends TAnnotationValue>)newValue);
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
			case AnnotationsPackage.TANNOTATION__TANNOTATED:
				setTAnnotated((TAnnotatable)null);
				return;
			case AnnotationsPackage.TANNOTATION__TYPE:
				setType((TAnnotationType)null);
				return;
			case AnnotationsPackage.TANNOTATION__TVALUES:
				getTValues().clear();
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
			case AnnotationsPackage.TANNOTATION__TANNOTATED:
				return getTAnnotated() != null;
			case AnnotationsPackage.TANNOTATION__TYPE:
				return type != null;
			case AnnotationsPackage.TANNOTATION__TVALUES:
				return tValues != null && !tValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AnnotationsPackage.TANNOTATION___GET_VALUE__STRING:
				return getValue((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TAnnotationImpl
