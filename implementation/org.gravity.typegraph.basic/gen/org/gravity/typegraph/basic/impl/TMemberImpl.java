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
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TFlow;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TSignature;

import org.gravity.typegraph.basic.annotations.impl.TAnnotatableImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMember</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMemberImpl#getOwnedFlows <em>Owned Flows</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMemberImpl#getIncomingFlows <em>Incoming Flows</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMemberImpl#getOutgoingFlows <em>Outgoing Flows</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMemberImpl#getDefinedBy <em>Defined By</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMemberImpl#getAccessedBy <em>Accessed By</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMemberImpl#getAccessing <em>Accessing</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMemberImpl#getTModifier <em>TModifier</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMemberImpl#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TMemberImpl extends TAnnotatableImpl implements TMember {
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
	 * The cached value of the '{@link #getDefinedBy() <em>Defined By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedBy()
	 * @generated
	 * @ordered
	 */
	protected TAbstractType definedBy;

	/**
	 * The cached value of the '{@link #getAccessedBy() <em>Accessed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<TAccess> accessedBy;

	/**
	 * The cached value of the '{@link #getAccessing() <em>Accessing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessing()
	 * @generated
	 * @ordered
	 */
	protected EList<TAccess> accessing;

	/**
	 * The cached value of the '{@link #getTModifier() <em>TModifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTModifier()
	 * @generated
	 * @ordered
	 */
	protected TModifier tModifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TMEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TFlow> getOwnedFlows() {
		if (ownedFlows == null) {
			ownedFlows = new EObjectContainmentWithInverseEList<TFlow>(TFlow.class, this, BasicPackage.TMEMBER__OWNED_FLOWS, BasicPackage.TFLOW__FLOW_OWNER);
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
			incomingFlows = new EObjectWithInverseResolvingEList.ManyInverse<TAbstractFlowElement>(TAbstractFlowElement.class, this, BasicPackage.TMEMBER__INCOMING_FLOWS, BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS);
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
			outgoingFlows = new EObjectWithInverseResolvingEList.ManyInverse<TAbstractFlowElement>(TAbstractFlowElement.class, this, BasicPackage.TMEMBER__OUTGOING_FLOWS, BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS);
		}
		return outgoingFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractType getDefinedBy() {
		if (definedBy != null && definedBy.eIsProxy()) {
			InternalEObject oldDefinedBy = (InternalEObject)definedBy;
			definedBy = (TAbstractType)eResolveProxy(oldDefinedBy);
			if (definedBy != oldDefinedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TMEMBER__DEFINED_BY, oldDefinedBy, definedBy));
			}
		}
		return definedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType basicGetDefinedBy() {
		return definedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinedBy(TAbstractType newDefinedBy, NotificationChain msgs) {
		TAbstractType oldDefinedBy = definedBy;
		definedBy = newDefinedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicPackage.TMEMBER__DEFINED_BY, oldDefinedBy, newDefinedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinedBy(TAbstractType newDefinedBy) {
		if (newDefinedBy != definedBy) {
			NotificationChain msgs = null;
			if (definedBy != null)
				msgs = ((InternalEObject)definedBy).eInverseRemove(this, BasicPackage.TABSTRACT_TYPE__DEFINES, TAbstractType.class, msgs);
			if (newDefinedBy != null)
				msgs = ((InternalEObject)newDefinedBy).eInverseAdd(this, BasicPackage.TABSTRACT_TYPE__DEFINES, TAbstractType.class, msgs);
			msgs = basicSetDefinedBy(newDefinedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TMEMBER__DEFINED_BY, newDefinedBy, newDefinedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAccess> getAccessedBy() {
		if (accessedBy == null) {
			accessedBy = new EObjectWithInverseResolvingEList<TAccess>(TAccess.class, this, BasicPackage.TMEMBER__ACCESSED_BY, BasicPackage.TACCESS__TARGET);
		}
		return accessedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAccess> getAccessing() {
		if (accessing == null) {
			accessing = new EObjectContainmentWithInverseEList<TAccess>(TAccess.class, this, BasicPackage.TMEMBER__ACCESSING, BasicPackage.TACCESS__SOURCE);
		}
		return accessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TModifier getTModifier() {
		return tModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTModifier(TModifier newTModifier, NotificationChain msgs) {
		TModifier oldTModifier = tModifier;
		tModifier = newTModifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicPackage.TMEMBER__TMODIFIER, oldTModifier, newTModifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTModifier(TModifier newTModifier) {
		if (newTModifier != tModifier) {
			NotificationChain msgs = null;
			if (tModifier != null)
				msgs = ((InternalEObject)tModifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicPackage.TMEMBER__TMODIFIER, null, msgs);
			if (newTModifier != null)
				msgs = ((InternalEObject)newTModifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicPackage.TMEMBER__TMODIFIER, null, msgs);
			msgs = basicSetTModifier(newTModifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TMEMBER__TMODIFIER, newTModifier, newTModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract TSignature getSignature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignature(TSignature newSignature, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSignature, BasicPackage.TMEMBER__SIGNATURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignature(TSignature newSignature) {
		if (newSignature != eInternalContainer() || (eContainerFeatureID() != BasicPackage.TMEMBER__SIGNATURE && newSignature != null)) {
			if (EcoreUtil.isAncestor(this, newSignature))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSignature != null)
				msgs = ((InternalEObject)newSignature).eInverseAdd(this, BasicPackage.TSIGNATURE__DEFINITIONS, TSignature.class, msgs);
			msgs = basicSetSignature(newSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TMEMBER__SIGNATURE, newSignature, newSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract String getSignatureString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicPackage.TMEMBER__OWNED_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFlows()).basicAdd(otherEnd, msgs);
			case BasicPackage.TMEMBER__INCOMING_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingFlows()).basicAdd(otherEnd, msgs);
			case BasicPackage.TMEMBER__OUTGOING_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingFlows()).basicAdd(otherEnd, msgs);
			case BasicPackage.TMEMBER__DEFINED_BY:
				if (definedBy != null)
					msgs = ((InternalEObject)definedBy).eInverseRemove(this, BasicPackage.TABSTRACT_TYPE__DEFINES, TAbstractType.class, msgs);
				return basicSetDefinedBy((TAbstractType)otherEnd, msgs);
			case BasicPackage.TMEMBER__ACCESSED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccessedBy()).basicAdd(otherEnd, msgs);
			case BasicPackage.TMEMBER__ACCESSING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccessing()).basicAdd(otherEnd, msgs);
			case BasicPackage.TMEMBER__SIGNATURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSignature((TSignature)otherEnd, msgs);
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
			case BasicPackage.TMEMBER__OWNED_FLOWS:
				return ((InternalEList<?>)getOwnedFlows()).basicRemove(otherEnd, msgs);
			case BasicPackage.TMEMBER__INCOMING_FLOWS:
				return ((InternalEList<?>)getIncomingFlows()).basicRemove(otherEnd, msgs);
			case BasicPackage.TMEMBER__OUTGOING_FLOWS:
				return ((InternalEList<?>)getOutgoingFlows()).basicRemove(otherEnd, msgs);
			case BasicPackage.TMEMBER__DEFINED_BY:
				return basicSetDefinedBy(null, msgs);
			case BasicPackage.TMEMBER__ACCESSED_BY:
				return ((InternalEList<?>)getAccessedBy()).basicRemove(otherEnd, msgs);
			case BasicPackage.TMEMBER__ACCESSING:
				return ((InternalEList<?>)getAccessing()).basicRemove(otherEnd, msgs);
			case BasicPackage.TMEMBER__TMODIFIER:
				return basicSetTModifier(null, msgs);
			case BasicPackage.TMEMBER__SIGNATURE:
				return basicSetSignature(null, msgs);
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
			case BasicPackage.TMEMBER__SIGNATURE:
				return eInternalContainer().eInverseRemove(this, BasicPackage.TSIGNATURE__DEFINITIONS, TSignature.class, msgs);
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
			case BasicPackage.TMEMBER__OWNED_FLOWS:
				return getOwnedFlows();
			case BasicPackage.TMEMBER__INCOMING_FLOWS:
				return getIncomingFlows();
			case BasicPackage.TMEMBER__OUTGOING_FLOWS:
				return getOutgoingFlows();
			case BasicPackage.TMEMBER__DEFINED_BY:
				if (resolve) return getDefinedBy();
				return basicGetDefinedBy();
			case BasicPackage.TMEMBER__ACCESSED_BY:
				return getAccessedBy();
			case BasicPackage.TMEMBER__ACCESSING:
				return getAccessing();
			case BasicPackage.TMEMBER__TMODIFIER:
				return getTModifier();
			case BasicPackage.TMEMBER__SIGNATURE:
				return getSignature();
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
			case BasicPackage.TMEMBER__OWNED_FLOWS:
				getOwnedFlows().clear();
				getOwnedFlows().addAll((Collection<? extends TFlow>)newValue);
				return;
			case BasicPackage.TMEMBER__INCOMING_FLOWS:
				getIncomingFlows().clear();
				getIncomingFlows().addAll((Collection<? extends TAbstractFlowElement>)newValue);
				return;
			case BasicPackage.TMEMBER__OUTGOING_FLOWS:
				getOutgoingFlows().clear();
				getOutgoingFlows().addAll((Collection<? extends TAbstractFlowElement>)newValue);
				return;
			case BasicPackage.TMEMBER__DEFINED_BY:
				setDefinedBy((TAbstractType)newValue);
				return;
			case BasicPackage.TMEMBER__ACCESSED_BY:
				getAccessedBy().clear();
				getAccessedBy().addAll((Collection<? extends TAccess>)newValue);
				return;
			case BasicPackage.TMEMBER__ACCESSING:
				getAccessing().clear();
				getAccessing().addAll((Collection<? extends TAccess>)newValue);
				return;
			case BasicPackage.TMEMBER__TMODIFIER:
				setTModifier((TModifier)newValue);
				return;
			case BasicPackage.TMEMBER__SIGNATURE:
				setSignature((TSignature)newValue);
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
			case BasicPackage.TMEMBER__OWNED_FLOWS:
				getOwnedFlows().clear();
				return;
			case BasicPackage.TMEMBER__INCOMING_FLOWS:
				getIncomingFlows().clear();
				return;
			case BasicPackage.TMEMBER__OUTGOING_FLOWS:
				getOutgoingFlows().clear();
				return;
			case BasicPackage.TMEMBER__DEFINED_BY:
				setDefinedBy((TAbstractType)null);
				return;
			case BasicPackage.TMEMBER__ACCESSED_BY:
				getAccessedBy().clear();
				return;
			case BasicPackage.TMEMBER__ACCESSING:
				getAccessing().clear();
				return;
			case BasicPackage.TMEMBER__TMODIFIER:
				setTModifier((TModifier)null);
				return;
			case BasicPackage.TMEMBER__SIGNATURE:
				setSignature((TSignature)null);
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
			case BasicPackage.TMEMBER__OWNED_FLOWS:
				return ownedFlows != null && !ownedFlows.isEmpty();
			case BasicPackage.TMEMBER__INCOMING_FLOWS:
				return incomingFlows != null && !incomingFlows.isEmpty();
			case BasicPackage.TMEMBER__OUTGOING_FLOWS:
				return outgoingFlows != null && !outgoingFlows.isEmpty();
			case BasicPackage.TMEMBER__DEFINED_BY:
				return definedBy != null;
			case BasicPackage.TMEMBER__ACCESSED_BY:
				return accessedBy != null && !accessedBy.isEmpty();
			case BasicPackage.TMEMBER__ACCESSING:
				return accessing != null && !accessing.isEmpty();
			case BasicPackage.TMEMBER__TMODIFIER:
				return tModifier != null;
			case BasicPackage.TMEMBER__SIGNATURE:
				return getSignature() != null;
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
				case BasicPackage.TMEMBER__OWNED_FLOWS: return BasicPackage.TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS;
				case BasicPackage.TMEMBER__INCOMING_FLOWS: return BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS;
				case BasicPackage.TMEMBER__OUTGOING_FLOWS: return BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS;
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
				case BasicPackage.TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS: return BasicPackage.TMEMBER__OWNED_FLOWS;
				case BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS: return BasicPackage.TMEMBER__INCOMING_FLOWS;
				case BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS: return BasicPackage.TMEMBER__OUTGOING_FLOWS;
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
			case BasicPackage.TMEMBER___GET_SIGNATURE_STRING:
				return getSignatureString();
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TMemberImpl
