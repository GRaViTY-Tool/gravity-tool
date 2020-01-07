/**
 */
package org.gravity.typegraph.basic.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractFlowElement;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
// <-- [user defined imports]
import org.gravity.typegraph.basic.TFlow;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.annotations.impl.TAnnotatableImpl;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TField Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TFieldSignatureImpl#getOwnedFlows <em>Owned Flows</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TFieldSignatureImpl#getIncomingFlows <em>Incoming Flows</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TFieldSignatureImpl#getOutgoingFlows <em>Outgoing Flows</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TFieldSignatureImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TFieldSignatureImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TFieldSignatureImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TFieldSignatureImpl extends TAnnotatableImpl implements TFieldSignature {
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
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<TMember> definitions;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TAbstractType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFieldSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TFIELD_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TFlow> getOwnedFlows() {
		if (ownedFlows == null) {
			ownedFlows = new EObjectContainmentWithInverseEList<TFlow>(TFlow.class, this, BasicPackage.TFIELD_SIGNATURE__OWNED_FLOWS, BasicPackage.TFLOW__FLOW_OWNER);
		}
		return ownedFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAbstractFlowElement> getIncomingFlows() {
		if (incomingFlows == null) {
			incomingFlows = new EObjectWithInverseResolvingEList.ManyInverse<TAbstractFlowElement>(TAbstractFlowElement.class, this, BasicPackage.TFIELD_SIGNATURE__INCOMING_FLOWS, BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS);
		}
		return incomingFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAbstractFlowElement> getOutgoingFlows() {
		if (outgoingFlows == null) {
			outgoingFlows = new EObjectWithInverseResolvingEList.ManyInverse<TAbstractFlowElement>(TAbstractFlowElement.class, this, BasicPackage.TFIELD_SIGNATURE__OUTGOING_FLOWS, BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS);
		}
		return outgoingFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TMember> getDefinitions() {
		if (definitions == null) {
			definitions = new EObjectContainmentWithInverseEList<TMember>(TMember.class, this, BasicPackage.TFIELD_SIGNATURE__DEFINITIONS, BasicPackage.TMEMBER__SIGNATURE);
		}
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TField getField() {
		if (eContainerFeatureID() != BasicPackage.TFIELD_SIGNATURE__FIELD) return null;
		return (TField)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetField(TField newField, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newField, BasicPackage.TFIELD_SIGNATURE__FIELD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setField(TField newField) {
		if (newField != eInternalContainer() || (eContainerFeatureID() != BasicPackage.TFIELD_SIGNATURE__FIELD && newField != null)) {
			if (EcoreUtil.isAncestor(this, newField))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newField != null)
				msgs = ((InternalEObject)newField).eInverseAdd(this, BasicPackage.TFIELD__SIGNATURES, TField.class, msgs);
			msgs = basicSetField(newField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TFIELD_SIGNATURE__FIELD, newField, newField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (TAbstractType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TFIELD_SIGNATURE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TAbstractType newType) {
		TAbstractType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TFIELD_SIGNATURE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getSignatureString() {
		// [user code injected with eMoflon]

		String name = getField().getTName();
		return name + ":" + getType().getTName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TFieldDefinition getTDefinition(TAbstractType defining) {
		// [user code injected with eMoflon]
		if (defining.getSignature().contains(this)) {
			for (TMember definition : defining.getDefines()) {
				if (this.getDefinitions().contains(definition)) {
					return (TFieldDefinition) definition;
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<TFieldDefinition> getFieldDefinitions() {
		return (EList<TFieldDefinition>) ((EList<? extends TFieldDefinition>) getDefinitions());
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
			case BasicPackage.TFIELD_SIGNATURE__OWNED_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFlows()).basicAdd(otherEnd, msgs);
			case BasicPackage.TFIELD_SIGNATURE__INCOMING_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingFlows()).basicAdd(otherEnd, msgs);
			case BasicPackage.TFIELD_SIGNATURE__OUTGOING_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingFlows()).basicAdd(otherEnd, msgs);
			case BasicPackage.TFIELD_SIGNATURE__DEFINITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDefinitions()).basicAdd(otherEnd, msgs);
			case BasicPackage.TFIELD_SIGNATURE__FIELD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetField((TField)otherEnd, msgs);
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
			case BasicPackage.TFIELD_SIGNATURE__OWNED_FLOWS:
				return ((InternalEList<?>)getOwnedFlows()).basicRemove(otherEnd, msgs);
			case BasicPackage.TFIELD_SIGNATURE__INCOMING_FLOWS:
				return ((InternalEList<?>)getIncomingFlows()).basicRemove(otherEnd, msgs);
			case BasicPackage.TFIELD_SIGNATURE__OUTGOING_FLOWS:
				return ((InternalEList<?>)getOutgoingFlows()).basicRemove(otherEnd, msgs);
			case BasicPackage.TFIELD_SIGNATURE__DEFINITIONS:
				return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
			case BasicPackage.TFIELD_SIGNATURE__FIELD:
				return basicSetField(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case BasicPackage.TFIELD_SIGNATURE__FIELD:
				return eInternalContainer().eInverseRemove(this, BasicPackage.TFIELD__SIGNATURES, TField.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicPackage.TFIELD_SIGNATURE__OWNED_FLOWS:
				return getOwnedFlows();
			case BasicPackage.TFIELD_SIGNATURE__INCOMING_FLOWS:
				return getIncomingFlows();
			case BasicPackage.TFIELD_SIGNATURE__OUTGOING_FLOWS:
				return getOutgoingFlows();
			case BasicPackage.TFIELD_SIGNATURE__DEFINITIONS:
				return getDefinitions();
			case BasicPackage.TFIELD_SIGNATURE__FIELD:
				return getField();
			case BasicPackage.TFIELD_SIGNATURE__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case BasicPackage.TFIELD_SIGNATURE__OWNED_FLOWS:
				getOwnedFlows().clear();
				getOwnedFlows().addAll((Collection<? extends TFlow>)newValue);
				return;
			case BasicPackage.TFIELD_SIGNATURE__INCOMING_FLOWS:
				getIncomingFlows().clear();
				getIncomingFlows().addAll((Collection<? extends TAbstractFlowElement>)newValue);
				return;
			case BasicPackage.TFIELD_SIGNATURE__OUTGOING_FLOWS:
				getOutgoingFlows().clear();
				getOutgoingFlows().addAll((Collection<? extends TAbstractFlowElement>)newValue);
				return;
			case BasicPackage.TFIELD_SIGNATURE__DEFINITIONS:
				getDefinitions().clear();
				getDefinitions().addAll((Collection<? extends TMember>)newValue);
				return;
			case BasicPackage.TFIELD_SIGNATURE__FIELD:
				setField((TField)newValue);
				return;
			case BasicPackage.TFIELD_SIGNATURE__TYPE:
				setType((TAbstractType)newValue);
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
			case BasicPackage.TFIELD_SIGNATURE__OWNED_FLOWS:
				getOwnedFlows().clear();
				return;
			case BasicPackage.TFIELD_SIGNATURE__INCOMING_FLOWS:
				getIncomingFlows().clear();
				return;
			case BasicPackage.TFIELD_SIGNATURE__OUTGOING_FLOWS:
				getOutgoingFlows().clear();
				return;
			case BasicPackage.TFIELD_SIGNATURE__DEFINITIONS:
				getDefinitions().clear();
				return;
			case BasicPackage.TFIELD_SIGNATURE__FIELD:
				setField((TField)null);
				return;
			case BasicPackage.TFIELD_SIGNATURE__TYPE:
				setType((TAbstractType)null);
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
			case BasicPackage.TFIELD_SIGNATURE__OWNED_FLOWS:
				return ownedFlows != null && !ownedFlows.isEmpty();
			case BasicPackage.TFIELD_SIGNATURE__INCOMING_FLOWS:
				return incomingFlows != null && !incomingFlows.isEmpty();
			case BasicPackage.TFIELD_SIGNATURE__OUTGOING_FLOWS:
				return outgoingFlows != null && !outgoingFlows.isEmpty();
			case BasicPackage.TFIELD_SIGNATURE__DEFINITIONS:
				return definitions != null && !definitions.isEmpty();
			case BasicPackage.TFIELD_SIGNATURE__FIELD:
				return getField() != null;
			case BasicPackage.TFIELD_SIGNATURE__TYPE:
				return type != null;
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
				case BasicPackage.TFIELD_SIGNATURE__OWNED_FLOWS: return BasicPackage.TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS;
				case BasicPackage.TFIELD_SIGNATURE__INCOMING_FLOWS: return BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS;
				case BasicPackage.TFIELD_SIGNATURE__OUTGOING_FLOWS: return BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS;
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
				case BasicPackage.TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS: return BasicPackage.TFIELD_SIGNATURE__OWNED_FLOWS;
				case BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS: return BasicPackage.TFIELD_SIGNATURE__INCOMING_FLOWS;
				case BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS: return BasicPackage.TFIELD_SIGNATURE__OUTGOING_FLOWS;
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
			case BasicPackage.TFIELD_SIGNATURE___GET_SIGNATURE_STRING:
				return getSignatureString();
			case BasicPackage.TFIELD_SIGNATURE___GET_TDEFINITION__TABSTRACTTYPE:
				return getTDefinition((TAbstractType)arguments.get(0));
			case BasicPackage.TFIELD_SIGNATURE___GET_FIELD_DEFINITIONS:
				return getFieldDefinitions();
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TFieldSignatureImpl
