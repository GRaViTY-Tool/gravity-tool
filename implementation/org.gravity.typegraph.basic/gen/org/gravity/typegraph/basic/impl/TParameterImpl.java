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
import org.eclipse.emf.ecore.util.InternalEList;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractFlowElement;
import org.gravity.typegraph.basic.TAbstractMultiplicity;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TFlow;
import org.gravity.typegraph.basic.TParameter;

import org.gravity.typegraph.basic.annotations.impl.TAnnotatableImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TParameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TParameterImpl#getOwnedFlows <em>Owned Flows</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TParameterImpl#getIncomingFlows <em>Incoming Flows</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TParameterImpl#getOutgoingFlows <em>Outgoing Flows</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TParameterImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TParameterImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TParameterImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TParameterImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TParameterImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TParameterImpl extends TAnnotatableImpl implements TParameter {
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
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_BOUND_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected int upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected TParameter next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected TParameter previous;

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
	protected TParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TPARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TFlow> getOwnedFlows() {
		if (ownedFlows == null) {
			ownedFlows = new EObjectContainmentWithInverseEList<TFlow>(TFlow.class, this, BasicPackage.TPARAMETER__OWNED_FLOWS, BasicPackage.TFLOW__FLOW_OWNER);
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
			incomingFlows = new EObjectWithInverseResolvingEList.ManyInverse<TAbstractFlowElement>(TAbstractFlowElement.class, this, BasicPackage.TPARAMETER__INCOMING_FLOWS, BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS);
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
			outgoingFlows = new EObjectWithInverseResolvingEList.ManyInverse<TAbstractFlowElement>(TAbstractFlowElement.class, this, BasicPackage.TPARAMETER__OUTGOING_FLOWS, BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS);
		}
		return outgoingFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerBound(int newLowerBound) {
		int oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TPARAMETER__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperBound(int newUpperBound) {
		int oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TPARAMETER__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TParameter getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (TParameter)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TPARAMETER__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TParameter basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(TParameter newNext, NotificationChain msgs) {
		TParameter oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicPackage.TPARAMETER__NEXT, oldNext, newNext);
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
	public void setNext(TParameter newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, BasicPackage.TPARAMETER__PREVIOUS, TParameter.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, BasicPackage.TPARAMETER__PREVIOUS, TParameter.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TPARAMETER__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TParameter getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (TParameter)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TPARAMETER__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TParameter basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(TParameter newPrevious, NotificationChain msgs) {
		TParameter oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicPackage.TPARAMETER__PREVIOUS, oldPrevious, newPrevious);
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
	public void setPrevious(TParameter newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, BasicPackage.TPARAMETER__NEXT, TParameter.class, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, BasicPackage.TPARAMETER__NEXT, TParameter.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TPARAMETER__PREVIOUS, newPrevious, newPrevious));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TPARAMETER__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TPARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isArray() {
		return getUpperBound() != 1;
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
			case BasicPackage.TPARAMETER__OWNED_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFlows()).basicAdd(otherEnd, msgs);
			case BasicPackage.TPARAMETER__INCOMING_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingFlows()).basicAdd(otherEnd, msgs);
			case BasicPackage.TPARAMETER__OUTGOING_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingFlows()).basicAdd(otherEnd, msgs);
			case BasicPackage.TPARAMETER__NEXT:
				if (next != null)
					msgs = ((InternalEObject)next).eInverseRemove(this, BasicPackage.TPARAMETER__PREVIOUS, TParameter.class, msgs);
				return basicSetNext((TParameter)otherEnd, msgs);
			case BasicPackage.TPARAMETER__PREVIOUS:
				if (previous != null)
					msgs = ((InternalEObject)previous).eInverseRemove(this, BasicPackage.TPARAMETER__NEXT, TParameter.class, msgs);
				return basicSetPrevious((TParameter)otherEnd, msgs);
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
			case BasicPackage.TPARAMETER__OWNED_FLOWS:
				return ((InternalEList<?>)getOwnedFlows()).basicRemove(otherEnd, msgs);
			case BasicPackage.TPARAMETER__INCOMING_FLOWS:
				return ((InternalEList<?>)getIncomingFlows()).basicRemove(otherEnd, msgs);
			case BasicPackage.TPARAMETER__OUTGOING_FLOWS:
				return ((InternalEList<?>)getOutgoingFlows()).basicRemove(otherEnd, msgs);
			case BasicPackage.TPARAMETER__NEXT:
				return basicSetNext(null, msgs);
			case BasicPackage.TPARAMETER__PREVIOUS:
				return basicSetPrevious(null, msgs);
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
			case BasicPackage.TPARAMETER__OWNED_FLOWS:
				return getOwnedFlows();
			case BasicPackage.TPARAMETER__INCOMING_FLOWS:
				return getIncomingFlows();
			case BasicPackage.TPARAMETER__OUTGOING_FLOWS:
				return getOutgoingFlows();
			case BasicPackage.TPARAMETER__LOWER_BOUND:
				return getLowerBound();
			case BasicPackage.TPARAMETER__UPPER_BOUND:
				return getUpperBound();
			case BasicPackage.TPARAMETER__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case BasicPackage.TPARAMETER__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case BasicPackage.TPARAMETER__TYPE:
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
			case BasicPackage.TPARAMETER__OWNED_FLOWS:
				getOwnedFlows().clear();
				getOwnedFlows().addAll((Collection<? extends TFlow>)newValue);
				return;
			case BasicPackage.TPARAMETER__INCOMING_FLOWS:
				getIncomingFlows().clear();
				getIncomingFlows().addAll((Collection<? extends TAbstractFlowElement>)newValue);
				return;
			case BasicPackage.TPARAMETER__OUTGOING_FLOWS:
				getOutgoingFlows().clear();
				getOutgoingFlows().addAll((Collection<? extends TAbstractFlowElement>)newValue);
				return;
			case BasicPackage.TPARAMETER__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case BasicPackage.TPARAMETER__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case BasicPackage.TPARAMETER__NEXT:
				setNext((TParameter)newValue);
				return;
			case BasicPackage.TPARAMETER__PREVIOUS:
				setPrevious((TParameter)newValue);
				return;
			case BasicPackage.TPARAMETER__TYPE:
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
			case BasicPackage.TPARAMETER__OWNED_FLOWS:
				getOwnedFlows().clear();
				return;
			case BasicPackage.TPARAMETER__INCOMING_FLOWS:
				getIncomingFlows().clear();
				return;
			case BasicPackage.TPARAMETER__OUTGOING_FLOWS:
				getOutgoingFlows().clear();
				return;
			case BasicPackage.TPARAMETER__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case BasicPackage.TPARAMETER__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case BasicPackage.TPARAMETER__NEXT:
				setNext((TParameter)null);
				return;
			case BasicPackage.TPARAMETER__PREVIOUS:
				setPrevious((TParameter)null);
				return;
			case BasicPackage.TPARAMETER__TYPE:
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
			case BasicPackage.TPARAMETER__OWNED_FLOWS:
				return ownedFlows != null && !ownedFlows.isEmpty();
			case BasicPackage.TPARAMETER__INCOMING_FLOWS:
				return incomingFlows != null && !incomingFlows.isEmpty();
			case BasicPackage.TPARAMETER__OUTGOING_FLOWS:
				return outgoingFlows != null && !outgoingFlows.isEmpty();
			case BasicPackage.TPARAMETER__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case BasicPackage.TPARAMETER__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case BasicPackage.TPARAMETER__NEXT:
				return next != null;
			case BasicPackage.TPARAMETER__PREVIOUS:
				return previous != null;
			case BasicPackage.TPARAMETER__TYPE:
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
				case BasicPackage.TPARAMETER__OWNED_FLOWS: return BasicPackage.TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS;
				case BasicPackage.TPARAMETER__INCOMING_FLOWS: return BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS;
				case BasicPackage.TPARAMETER__OUTGOING_FLOWS: return BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == TAbstractMultiplicity.class) {
			switch (derivedFeatureID) {
				case BasicPackage.TPARAMETER__LOWER_BOUND: return BasicPackage.TABSTRACT_MULTIPLICITY__LOWER_BOUND;
				case BasicPackage.TPARAMETER__UPPER_BOUND: return BasicPackage.TABSTRACT_MULTIPLICITY__UPPER_BOUND;
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
				case BasicPackage.TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS: return BasicPackage.TPARAMETER__OWNED_FLOWS;
				case BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS: return BasicPackage.TPARAMETER__INCOMING_FLOWS;
				case BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS: return BasicPackage.TPARAMETER__OUTGOING_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == TAbstractMultiplicity.class) {
			switch (baseFeatureID) {
				case BasicPackage.TABSTRACT_MULTIPLICITY__LOWER_BOUND: return BasicPackage.TPARAMETER__LOWER_BOUND;
				case BasicPackage.TABSTRACT_MULTIPLICITY__UPPER_BOUND: return BasicPackage.TPARAMETER__UPPER_BOUND;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == TAbstractFlowElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == TAbstractMultiplicity.class) {
			switch (baseOperationID) {
				case BasicPackage.TABSTRACT_MULTIPLICITY___IS_ARRAY: return BasicPackage.TPARAMETER___IS_ARRAY;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BasicPackage.TPARAMETER___IS_ARRAY:
				return isArray();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TParameterImpl
