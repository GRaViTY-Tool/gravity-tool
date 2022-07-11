/**
 */
package org.gravity.typegraph.basic.annotations.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gravity.typegraph.basic.annotations.AnnotationsPackage;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
import java.security.InvalidParameterException;
import org.eclipse.emf.common.util.BasicEList;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAnnotatable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.annotations.impl.TAnnotatableImpl#getTAnnotation <em>TAnnotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TAnnotatableImpl extends MinimalEObjectImpl.Container implements TAnnotatable {
	/**
	 * The cached value of the '{@link #getTAnnotation() <em>TAnnotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<TAnnotation> tAnnotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TAnnotatableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.TANNOTATABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAnnotation> getTAnnotation() {
		if (tAnnotation == null) {
			tAnnotation = new EObjectContainmentWithInverseEList<TAnnotation>(TAnnotation.class, this, AnnotationsPackage.TANNOTATABLE__TANNOTATION, AnnotationsPackage.TANNOTATION__TANNOTATED);
		}
		return tAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<TAnnotation> getTAnnotation(EClass tType) {
		// [user code injected with eMoflon]
		if (!tType.getEAllSuperTypes().contains(AnnotationsPackage.eINSTANCE.getTAnnotation())) {
			throw new InvalidParameterException();
		}
		EList<TAnnotation> tAnnotations = new BasicEList<TAnnotation>();
		for (TAnnotation tAnnotation : getTAnnotation()) {
			if (tAnnotation.eClass().equals(tType)) {
				tAnnotations.add(tAnnotation);
			}
		}
		return tAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsPackage.TANNOTATABLE__TANNOTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTAnnotation()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsPackage.TANNOTATABLE__TANNOTATION:
				return ((InternalEList<?>)getTAnnotation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnnotationsPackage.TANNOTATABLE__TANNOTATION:
				return getTAnnotation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnnotationsPackage.TANNOTATABLE__TANNOTATION:
				getTAnnotation().clear();
				getTAnnotation().addAll((Collection<? extends TAnnotation>)newValue);
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
			case AnnotationsPackage.TANNOTATABLE__TANNOTATION:
				getTAnnotation().clear();
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
			case AnnotationsPackage.TANNOTATABLE__TANNOTATION:
				return tAnnotation != null && !tAnnotation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AnnotationsPackage.TANNOTATABLE___GET_TANNOTATION__ECLASS:
				return getTAnnotation((EClass)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TAnnotatableImpl
