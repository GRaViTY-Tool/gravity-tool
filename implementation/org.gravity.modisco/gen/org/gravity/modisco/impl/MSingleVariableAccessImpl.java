/**
 */
package org.gravity.modisco.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.java.emf.impl.SingleVariableAccessImpl;

import org.gravity.modisco.AccessKind;
import org.gravity.modisco.MAbstractFlowElement;
import org.gravity.modisco.MAccess;
import org.gravity.modisco.MFlow;
import org.gravity.modisco.MSingleVariableAccess;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MSingle Variable Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MSingleVariableAccessImpl#getOwnedFlows <em>Owned Flows</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MSingleVariableAccessImpl#getIncomingFlows <em>Incoming Flows</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MSingleVariableAccessImpl#getOutgoingFlows <em>Outgoing Flows</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MSingleVariableAccessImpl#getAccessKind <em>Access Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MSingleVariableAccessImpl extends SingleVariableAccessImpl implements MSingleVariableAccess {
	/**
	 * The cached value of the '{@link #getOwnedFlows() <em>Owned Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<MFlow> ownedFlows;

	/**
	 * The cached value of the '{@link #getIncomingFlows() <em>Incoming Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<MFlow> incomingFlows;

	/**
	 * The cached value of the '{@link #getOutgoingFlows() <em>Outgoing Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<MFlow> outgoingFlows;

	/**
	 * The default value of the '{@link #getAccessKind() <em>Access Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessKind()
	 * @generated
	 * @ordered
	 */
	protected static final AccessKind ACCESS_KIND_EDEFAULT = AccessKind.READ;

	/**
	 * The cached value of the '{@link #getAccessKind() <em>Access Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessKind()
	 * @generated
	 * @ordered
	 */
	protected AccessKind accessKind = ACCESS_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MSingleVariableAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MSINGLE_VARIABLE_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFlow> getOwnedFlows() {
		if (ownedFlows == null) {
			ownedFlows = new EObjectContainmentWithInverseEList<MFlow>(MFlow.class, this, ModiscoPackage.MSINGLE_VARIABLE_ACCESS__OWNED_FLOWS, ModiscoPackage.MFLOW__FLOW_OWNER);
		}
		return ownedFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFlow> getIncomingFlows() {
		if (incomingFlows == null) {
			incomingFlows = new EObjectWithInverseResolvingEList<MFlow>(MFlow.class, this, ModiscoPackage.MSINGLE_VARIABLE_ACCESS__INCOMING_FLOWS, ModiscoPackage.MFLOW__FLOW_TARGET);
		}
		return incomingFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFlow> getOutgoingFlows() {
		if (outgoingFlows == null) {
			outgoingFlows = new EObjectWithInverseResolvingEList<MFlow>(MFlow.class, this, ModiscoPackage.MSINGLE_VARIABLE_ACCESS__OUTGOING_FLOWS, ModiscoPackage.MFLOW__FLOW_SOURCE);
		}
		return outgoingFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessKind getAccessKind() {
		return accessKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessKind(AccessKind newAccessKind) {
		AccessKind oldAccessKind = accessKind;
		accessKind = newAccessKind == null ? ACCESS_KIND_EDEFAULT : newAccessKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MSINGLE_VARIABLE_ACCESS__ACCESS_KIND, oldAccessKind, accessKind));
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
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__OWNED_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFlows()).basicAdd(otherEnd, msgs);
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__INCOMING_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingFlows()).basicAdd(otherEnd, msgs);
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__OUTGOING_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingFlows()).basicAdd(otherEnd, msgs);
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
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__OWNED_FLOWS:
				return ((InternalEList<?>)getOwnedFlows()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__INCOMING_FLOWS:
				return ((InternalEList<?>)getIncomingFlows()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__OUTGOING_FLOWS:
				return ((InternalEList<?>)getOutgoingFlows()).basicRemove(otherEnd, msgs);
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
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__OWNED_FLOWS:
				return getOwnedFlows();
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__INCOMING_FLOWS:
				return getIncomingFlows();
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__OUTGOING_FLOWS:
				return getOutgoingFlows();
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__ACCESS_KIND:
				return getAccessKind();
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
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__OWNED_FLOWS:
				getOwnedFlows().clear();
				getOwnedFlows().addAll((Collection<? extends MFlow>)newValue);
				return;
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__INCOMING_FLOWS:
				getIncomingFlows().clear();
				getIncomingFlows().addAll((Collection<? extends MFlow>)newValue);
				return;
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__OUTGOING_FLOWS:
				getOutgoingFlows().clear();
				getOutgoingFlows().addAll((Collection<? extends MFlow>)newValue);
				return;
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__ACCESS_KIND:
				setAccessKind((AccessKind)newValue);
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
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__OWNED_FLOWS:
				getOwnedFlows().clear();
				return;
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__INCOMING_FLOWS:
				getIncomingFlows().clear();
				return;
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__OUTGOING_FLOWS:
				getOutgoingFlows().clear();
				return;
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__ACCESS_KIND:
				setAccessKind(ACCESS_KIND_EDEFAULT);
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
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__OWNED_FLOWS:
				return ownedFlows != null && !ownedFlows.isEmpty();
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__INCOMING_FLOWS:
				return incomingFlows != null && !incomingFlows.isEmpty();
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__OUTGOING_FLOWS:
				return outgoingFlows != null && !outgoingFlows.isEmpty();
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__ACCESS_KIND:
				return accessKind != ACCESS_KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MAbstractFlowElement.class) {
			switch (derivedFeatureID) {
				case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__OWNED_FLOWS: return ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS;
				case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__INCOMING_FLOWS: return ModiscoPackage.MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS;
				case ModiscoPackage.MSINGLE_VARIABLE_ACCESS__OUTGOING_FLOWS: return ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == MAccess.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MAbstractFlowElement.class) {
			switch (baseFeatureID) {
				case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS: return ModiscoPackage.MSINGLE_VARIABLE_ACCESS__OWNED_FLOWS;
				case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS: return ModiscoPackage.MSINGLE_VARIABLE_ACCESS__INCOMING_FLOWS;
				case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS: return ModiscoPackage.MSINGLE_VARIABLE_ACCESS__OUTGOING_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == MAccess.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (accessKind: ");
		result.append(accessKind);
		result.append(')');
		return result.toString();
	}

} //MSingleVariableAccessImpl
