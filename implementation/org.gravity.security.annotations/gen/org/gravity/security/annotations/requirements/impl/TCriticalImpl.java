/**
 */
package org.gravity.security.annotations.requirements.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gravity.security.annotations.requirements.RequirementsPackage;
import org.gravity.security.annotations.requirements.TCritical;

import org.gravity.typegraph.basic.TSignature;

import org.gravity.typegraph.basic.annotations.impl.TAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCritical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.security.annotations.requirements.impl.TCriticalImpl#getSecrecy <em>Secrecy</em>}</li>
 *   <li>{@link org.gravity.security.annotations.requirements.impl.TCriticalImpl#getIntegrity <em>Integrity</em>}</li>
 *   <li>{@link org.gravity.security.annotations.requirements.impl.TCriticalImpl#getHigh <em>High</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCriticalImpl extends TAbstractCriticalElementImpl implements TCritical {
	/**
	 * The cached value of the '{@link #getSecrecy() <em>Secrecy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecrecy()
	 * @generated
	 * @ordered
	 */
	protected EList<TSignature> secrecy;

	/**
	 * The cached value of the '{@link #getIntegrity() <em>Integrity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrity()
	 * @generated
	 * @ordered
	 */
	protected EList<TSignature> integrity;

	/**
	 * The cached value of the '{@link #getHigh() <em>High</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh()
	 * @generated
	 * @ordered
	 */
	protected EList<TSignature> high;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCriticalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.TCRITICAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TSignature> getSecrecy() {
		if (secrecy == null) {
			secrecy = new EObjectResolvingEList<TSignature>(TSignature.class, this,
					RequirementsPackage.TCRITICAL__SECRECY);
		}
		return secrecy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TSignature> getIntegrity() {
		if (integrity == null) {
			integrity = new EObjectResolvingEList<TSignature>(TSignature.class, this,
					RequirementsPackage.TCRITICAL__INTEGRITY);
		}
		return integrity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TSignature> getHigh() {
		if (high == null) {
			high = new EObjectResolvingEList<TSignature>(TSignature.class, this, RequirementsPackage.TCRITICAL__HIGH);
		}
		return high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RequirementsPackage.TCRITICAL__SECRECY:
			return getSecrecy();
		case RequirementsPackage.TCRITICAL__INTEGRITY:
			return getIntegrity();
		case RequirementsPackage.TCRITICAL__HIGH:
			return getHigh();
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
		case RequirementsPackage.TCRITICAL__SECRECY:
			getSecrecy().clear();
			getSecrecy().addAll((Collection<? extends TSignature>) newValue);
			return;
		case RequirementsPackage.TCRITICAL__INTEGRITY:
			getIntegrity().clear();
			getIntegrity().addAll((Collection<? extends TSignature>) newValue);
			return;
		case RequirementsPackage.TCRITICAL__HIGH:
			getHigh().clear();
			getHigh().addAll((Collection<? extends TSignature>) newValue);
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
		case RequirementsPackage.TCRITICAL__SECRECY:
			getSecrecy().clear();
			return;
		case RequirementsPackage.TCRITICAL__INTEGRITY:
			getIntegrity().clear();
			return;
		case RequirementsPackage.TCRITICAL__HIGH:
			getHigh().clear();
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
		case RequirementsPackage.TCRITICAL__SECRECY:
			return secrecy != null && !secrecy.isEmpty();
		case RequirementsPackage.TCRITICAL__INTEGRITY:
			return integrity != null && !integrity.isEmpty();
		case RequirementsPackage.TCRITICAL__HIGH:
			return high != null && !high.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TCriticalImpl
