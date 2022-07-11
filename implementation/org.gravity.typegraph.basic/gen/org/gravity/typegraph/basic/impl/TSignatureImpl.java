/**
 */
package org.gravity.typegraph.basic.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractFlowElement;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TFlow;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.annotations.impl.TAnnotatableImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSignature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TSignatureImpl#getOwnedFlows <em>Owned Flows</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TSignatureImpl#getIncomingFlows <em>Incoming Flows</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TSignatureImpl#getOutgoingFlows <em>Outgoing Flows</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TSignatureImpl extends TAnnotatableImpl implements TSignature {
	/**
	 * The cached value of the '{@link #getOwnedFlows() <em>Owned Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<TFlow> ownedFlows;
	/**
	 * The cached value of the '{@link #getIncomingFlows() <em>Incoming Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<TAbstractFlowElement> incomingFlows;
	/**
	 * The cached value of the '{@link #getOutgoingFlows() <em>Outgoing Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<TAbstractFlowElement> outgoingFlows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TSIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TFlow> getOwnedFlows() {
		if (this.ownedFlows == null) {
			this.ownedFlows = new EObjectContainmentWithInverseEList<>(TFlow.class, this, BasicPackage.TSIGNATURE__OWNED_FLOWS, BasicPackage.TFLOW__FLOW_OWNER);
		}
		return this.ownedFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAbstractFlowElement> getIncomingFlows() {
		if (this.incomingFlows == null) {
			this.incomingFlows = new EObjectResolvingEList<>(TAbstractFlowElement.class, this, BasicPackage.TSIGNATURE__INCOMING_FLOWS);
		}
		return this.incomingFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAbstractFlowElement> getOutgoingFlows() {
		if (this.outgoingFlows == null) {
			this.outgoingFlows = new EObjectResolvingEList<>(TAbstractFlowElement.class, this, BasicPackage.TSIGNATURE__OUTGOING_FLOWS);
		}
		return this.outgoingFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public abstract String getSignatureString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public abstract TMember getTDefinition(TAbstractType defining);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicPackage.TSIGNATURE__OWNED_FLOWS:
			return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFlows()).basicAdd(otherEnd, msgs);
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
		case BasicPackage.TSIGNATURE__OWNED_FLOWS:
			return ((InternalEList<?>)getOwnedFlows()).basicRemove(otherEnd, msgs);
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
		case BasicPackage.TSIGNATURE__OWNED_FLOWS:
			return getOwnedFlows();
		case BasicPackage.TSIGNATURE__INCOMING_FLOWS:
			return getIncomingFlows();
		case BasicPackage.TSIGNATURE__OUTGOING_FLOWS:
			return getOutgoingFlows();
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
		case BasicPackage.TSIGNATURE__OWNED_FLOWS:
			getOwnedFlows().clear();
			getOwnedFlows().addAll((Collection<? extends TFlow>)newValue);
			return;
		case BasicPackage.TSIGNATURE__INCOMING_FLOWS:
			getIncomingFlows().clear();
			getIncomingFlows().addAll((Collection<? extends TFlow>)newValue);
			return;
		case BasicPackage.TSIGNATURE__OUTGOING_FLOWS:
			getOutgoingFlows().clear();
			getOutgoingFlows().addAll((Collection<? extends TFlow>)newValue);
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
		case BasicPackage.TSIGNATURE__OWNED_FLOWS:
			getOwnedFlows().clear();
			return;
		case BasicPackage.TSIGNATURE__INCOMING_FLOWS:
			getIncomingFlows().clear();
			return;
		case BasicPackage.TSIGNATURE__OUTGOING_FLOWS:
			getOutgoingFlows().clear();
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
		case BasicPackage.TSIGNATURE__OWNED_FLOWS:
			return this.ownedFlows != null && !this.ownedFlows.isEmpty();
		case BasicPackage.TSIGNATURE__INCOMING_FLOWS:
			return this.incomingFlows != null && !this.incomingFlows.isEmpty();
		case BasicPackage.TSIGNATURE__OUTGOING_FLOWS:
			return this.outgoingFlows != null && !this.outgoingFlows.isEmpty();
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
		if (baseClass == TAbstractFlowElement.class) {
			switch (derivedFeatureID) {
			case BasicPackage.TSIGNATURE__OWNED_FLOWS: return BasicPackage.TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS;
			case BasicPackage.TSIGNATURE__INCOMING_FLOWS: return BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS;
			case BasicPackage.TSIGNATURE__OUTGOING_FLOWS: return BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS;
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
		if (baseClass == TAbstractFlowElement.class) {
			switch (baseFeatureID) {
			case BasicPackage.TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS: return BasicPackage.TSIGNATURE__OWNED_FLOWS;
			case BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS: return BasicPackage.TSIGNATURE__INCOMING_FLOWS;
			case BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS: return BasicPackage.TSIGNATURE__OUTGOING_FLOWS;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case BasicPackage.TSIGNATURE___GET_SIGNATURE_STRING:
			return getSignatureString();
		case BasicPackage.TSIGNATURE___GET_TDEFINITION__TABSTRACTTYPE:
			return getTDefinition((TAbstractType)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TSignatureImpl
