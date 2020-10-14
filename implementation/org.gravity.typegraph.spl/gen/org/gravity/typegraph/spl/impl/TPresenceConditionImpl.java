/**
 */
package org.gravity.typegraph.spl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.typegraph.basic.annotations.impl.TAnnotationImpl;

import org.gravity.typegraph.spl.SplPackage;
import org.gravity.typegraph.spl.TPresenceCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPresence Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.spl.impl.TPresenceConditionImpl#getPc <em>Pc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TPresenceConditionImpl extends TAnnotationImpl implements TPresenceCondition {
	/**
	 * The default value of the '{@link #getPc() <em>Pc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPc()
	 * @generated
	 * @ordered
	 */
	protected static final String PC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPc() <em>Pc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPc()
	 * @generated
	 * @ordered
	 */
	protected String pc = PC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPresenceConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SplPackage.Literals.TPRESENCE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPc() {
		return pc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPc(String newPc) {
		String oldPc = pc;
		pc = newPc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplPackage.TPRESENCE_CONDITION__PC, oldPc, pc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SplPackage.TPRESENCE_CONDITION__PC:
				return getPc();
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
			case SplPackage.TPRESENCE_CONDITION__PC:
				setPc((String)newValue);
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
			case SplPackage.TPRESENCE_CONDITION__PC:
				setPc(PC_EDEFAULT);
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
			case SplPackage.TPRESENCE_CONDITION__PC:
				return PC_EDEFAULT == null ? pc != null : !PC_EDEFAULT.equals(pc);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (pc: ");
		result.append(pc);
		result.append(')');
		return result.toString();
	}

} //TPresenceConditionImpl
