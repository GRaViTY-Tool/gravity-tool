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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractFlowElement;
import org.gravity.typegraph.basic.TAbstractMultiplicity;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TFlow;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
// <-- [user defined imports]
import org.gravity.typegraph.basic.annotations.impl.TAnnotatableImpl;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TMember;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMethod Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodSignatureImpl#getOwnedFlows <em>Owned Flows</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodSignatureImpl#getIncomingFlows <em>Incoming Flows</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodSignatureImpl#getOutgoingFlows <em>Outgoing Flows</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodSignatureImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodSignatureImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodSignatureImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodSignatureImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodSignatureImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodSignatureImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodSignatureImpl#getFirstParameter <em>First Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMethodSignatureImpl extends TAnnotatableImpl implements TMethodSignature {
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
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected TAbstractType returnType;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TParameter> parameters;

	/**
	 * The cached value of the '{@link #getFirstParameter() <em>First Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstParameter()
	 * @generated
	 * @ordered
	 */
	protected TParameter firstParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMethodSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TMETHOD_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TFlow> getOwnedFlows() {
		if (ownedFlows == null) {
			ownedFlows = new EObjectContainmentWithInverseEList<TFlow>(TFlow.class, this, BasicPackage.TMETHOD_SIGNATURE__OWNED_FLOWS, BasicPackage.TFLOW__FLOW_OWNER);
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
			incomingFlows = new EObjectWithInverseResolvingEList.ManyInverse<TAbstractFlowElement>(TAbstractFlowElement.class, this, BasicPackage.TMETHOD_SIGNATURE__INCOMING_FLOWS, BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS);
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
			outgoingFlows = new EObjectWithInverseResolvingEList.ManyInverse<TAbstractFlowElement>(TAbstractFlowElement.class, this, BasicPackage.TMETHOD_SIGNATURE__OUTGOING_FLOWS, BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS);
		}
		return outgoingFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethod getMethod() {
		if (eContainerFeatureID() != BasicPackage.TMETHOD_SIGNATURE__METHOD) return null;
		return (TMethod)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(TMethod newMethod, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMethod, BasicPackage.TMETHOD_SIGNATURE__METHOD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(TMethod newMethod) {
		if (newMethod != eInternalContainer() || (eContainerFeatureID() != BasicPackage.TMETHOD_SIGNATURE__METHOD && newMethod != null)) {
			if (EcoreUtil.isAncestor(this, newMethod))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, BasicPackage.TMETHOD__SIGNATURES, TMethod.class, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TMETHOD_SIGNATURE__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TMember> getDefinitions() {
		if (definitions == null) {
			definitions = new EObjectContainmentWithInverseEList<TMember>(TMember.class, this, BasicPackage.TMETHOD_SIGNATURE__DEFINITIONS, BasicPackage.TMEMBER__SIGNATURE);
		}
		return definitions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TMETHOD_SIGNATURE__LOWER_BOUND, oldLowerBound, lowerBound));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TMETHOD_SIGNATURE__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractType getReturnType() {
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject)returnType;
			returnType = (TAbstractType)eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TMETHOD_SIGNATURE__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnType(TAbstractType newReturnType) {
		TAbstractType oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TMETHOD_SIGNATURE__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<TParameter>(TParameter.class, this, BasicPackage.TMETHOD_SIGNATURE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TParameter getFirstParameter() {
		if (firstParameter != null && firstParameter.eIsProxy()) {
			InternalEObject oldFirstParameter = (InternalEObject)firstParameter;
			firstParameter = (TParameter)eResolveProxy(oldFirstParameter);
			if (firstParameter != oldFirstParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TMETHOD_SIGNATURE__FIRST_PARAMETER, oldFirstParameter, firstParameter));
			}
		}
		return firstParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TParameter basicGetFirstParameter() {
		return firstParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstParameter(TParameter newFirstParameter) {
		TParameter oldFirstParameter = firstParameter;
		firstParameter = newFirstParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TMETHOD_SIGNATURE__FIRST_PARAMETER, oldFirstParameter, firstParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getSignatureString() {
		StringBuilder s = new StringBuilder(getMethod().getTName());
		s.append('(');
		TParameter current = getFirstParameter();
		while (current != null) {
			TAbstractType type = current.getType();
			if (type != null) {
				s.append(type.getTName());
				if(current.isArray()) {
					s.append("[]");
				}
			} 
			else {
				throw new IllegalStateException("The type of a parameter is null!");
			}
			current = current.getNext();
			if (current != null) {
				s.append(", ");
			}
		}
		TAbstractType ret = getReturnType();
		if (ret == null) {
			return s.append(')').toString();
		} else {
			s.append("):").append(ret.getTName());
			if(isArray()) {
				s.append("[]");
			}
			return s.toString();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TMethodDefinition getTDefinition(TAbstractType defining) {
		// [user code injected with eMoflon]
		if (defining.getSignature().contains(this)) {
			for (TMember definition : defining.getDefines()) {
				if (this.getDefinitions().contains(definition)) {
					return (TMethodDefinition) definition;
				}
			}
		}
		return null;
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
			case BasicPackage.TMETHOD_SIGNATURE__OWNED_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFlows()).basicAdd(otherEnd, msgs);
			case BasicPackage.TMETHOD_SIGNATURE__INCOMING_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingFlows()).basicAdd(otherEnd, msgs);
			case BasicPackage.TMETHOD_SIGNATURE__OUTGOING_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingFlows()).basicAdd(otherEnd, msgs);
			case BasicPackage.TMETHOD_SIGNATURE__DEFINITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDefinitions()).basicAdd(otherEnd, msgs);
			case BasicPackage.TMETHOD_SIGNATURE__METHOD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMethod((TMethod)otherEnd, msgs);
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
			case BasicPackage.TMETHOD_SIGNATURE__OWNED_FLOWS:
				return ((InternalEList<?>)getOwnedFlows()).basicRemove(otherEnd, msgs);
			case BasicPackage.TMETHOD_SIGNATURE__INCOMING_FLOWS:
				return ((InternalEList<?>)getIncomingFlows()).basicRemove(otherEnd, msgs);
			case BasicPackage.TMETHOD_SIGNATURE__OUTGOING_FLOWS:
				return ((InternalEList<?>)getOutgoingFlows()).basicRemove(otherEnd, msgs);
			case BasicPackage.TMETHOD_SIGNATURE__DEFINITIONS:
				return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
			case BasicPackage.TMETHOD_SIGNATURE__METHOD:
				return basicSetMethod(null, msgs);
			case BasicPackage.TMETHOD_SIGNATURE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case BasicPackage.TMETHOD_SIGNATURE__METHOD:
				return eInternalContainer().eInverseRemove(this, BasicPackage.TMETHOD__SIGNATURES, TMethod.class, msgs);
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
			case BasicPackage.TMETHOD_SIGNATURE__OWNED_FLOWS:
				return getOwnedFlows();
			case BasicPackage.TMETHOD_SIGNATURE__INCOMING_FLOWS:
				return getIncomingFlows();
			case BasicPackage.TMETHOD_SIGNATURE__OUTGOING_FLOWS:
				return getOutgoingFlows();
			case BasicPackage.TMETHOD_SIGNATURE__DEFINITIONS:
				return getDefinitions();
			case BasicPackage.TMETHOD_SIGNATURE__LOWER_BOUND:
				return getLowerBound();
			case BasicPackage.TMETHOD_SIGNATURE__UPPER_BOUND:
				return getUpperBound();
			case BasicPackage.TMETHOD_SIGNATURE__METHOD:
				return getMethod();
			case BasicPackage.TMETHOD_SIGNATURE__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
			case BasicPackage.TMETHOD_SIGNATURE__PARAMETERS:
				return getParameters();
			case BasicPackage.TMETHOD_SIGNATURE__FIRST_PARAMETER:
				if (resolve) return getFirstParameter();
				return basicGetFirstParameter();
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
			case BasicPackage.TMETHOD_SIGNATURE__OWNED_FLOWS:
				getOwnedFlows().clear();
				getOwnedFlows().addAll((Collection<? extends TFlow>)newValue);
				return;
			case BasicPackage.TMETHOD_SIGNATURE__INCOMING_FLOWS:
				getIncomingFlows().clear();
				getIncomingFlows().addAll((Collection<? extends TAbstractFlowElement>)newValue);
				return;
			case BasicPackage.TMETHOD_SIGNATURE__OUTGOING_FLOWS:
				getOutgoingFlows().clear();
				getOutgoingFlows().addAll((Collection<? extends TAbstractFlowElement>)newValue);
				return;
			case BasicPackage.TMETHOD_SIGNATURE__DEFINITIONS:
				getDefinitions().clear();
				getDefinitions().addAll((Collection<? extends TMember>)newValue);
				return;
			case BasicPackage.TMETHOD_SIGNATURE__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case BasicPackage.TMETHOD_SIGNATURE__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case BasicPackage.TMETHOD_SIGNATURE__METHOD:
				setMethod((TMethod)newValue);
				return;
			case BasicPackage.TMETHOD_SIGNATURE__RETURN_TYPE:
				setReturnType((TAbstractType)newValue);
				return;
			case BasicPackage.TMETHOD_SIGNATURE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends TParameter>)newValue);
				return;
			case BasicPackage.TMETHOD_SIGNATURE__FIRST_PARAMETER:
				setFirstParameter((TParameter)newValue);
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
			case BasicPackage.TMETHOD_SIGNATURE__OWNED_FLOWS:
				getOwnedFlows().clear();
				return;
			case BasicPackage.TMETHOD_SIGNATURE__INCOMING_FLOWS:
				getIncomingFlows().clear();
				return;
			case BasicPackage.TMETHOD_SIGNATURE__OUTGOING_FLOWS:
				getOutgoingFlows().clear();
				return;
			case BasicPackage.TMETHOD_SIGNATURE__DEFINITIONS:
				getDefinitions().clear();
				return;
			case BasicPackage.TMETHOD_SIGNATURE__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case BasicPackage.TMETHOD_SIGNATURE__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case BasicPackage.TMETHOD_SIGNATURE__METHOD:
				setMethod((TMethod)null);
				return;
			case BasicPackage.TMETHOD_SIGNATURE__RETURN_TYPE:
				setReturnType((TAbstractType)null);
				return;
			case BasicPackage.TMETHOD_SIGNATURE__PARAMETERS:
				getParameters().clear();
				return;
			case BasicPackage.TMETHOD_SIGNATURE__FIRST_PARAMETER:
				setFirstParameter((TParameter)null);
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
			case BasicPackage.TMETHOD_SIGNATURE__OWNED_FLOWS:
				return ownedFlows != null && !ownedFlows.isEmpty();
			case BasicPackage.TMETHOD_SIGNATURE__INCOMING_FLOWS:
				return incomingFlows != null && !incomingFlows.isEmpty();
			case BasicPackage.TMETHOD_SIGNATURE__OUTGOING_FLOWS:
				return outgoingFlows != null && !outgoingFlows.isEmpty();
			case BasicPackage.TMETHOD_SIGNATURE__DEFINITIONS:
				return definitions != null && !definitions.isEmpty();
			case BasicPackage.TMETHOD_SIGNATURE__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case BasicPackage.TMETHOD_SIGNATURE__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case BasicPackage.TMETHOD_SIGNATURE__METHOD:
				return getMethod() != null;
			case BasicPackage.TMETHOD_SIGNATURE__RETURN_TYPE:
				return returnType != null;
			case BasicPackage.TMETHOD_SIGNATURE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case BasicPackage.TMETHOD_SIGNATURE__FIRST_PARAMETER:
				return firstParameter != null;
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
				case BasicPackage.TMETHOD_SIGNATURE__OWNED_FLOWS: return BasicPackage.TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS;
				case BasicPackage.TMETHOD_SIGNATURE__INCOMING_FLOWS: return BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS;
				case BasicPackage.TMETHOD_SIGNATURE__OUTGOING_FLOWS: return BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == TAbstractMultiplicity.class) {
			switch (derivedFeatureID) {
				case BasicPackage.TMETHOD_SIGNATURE__LOWER_BOUND: return BasicPackage.TABSTRACT_MULTIPLICITY__LOWER_BOUND;
				case BasicPackage.TMETHOD_SIGNATURE__UPPER_BOUND: return BasicPackage.TABSTRACT_MULTIPLICITY__UPPER_BOUND;
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
				case BasicPackage.TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS: return BasicPackage.TMETHOD_SIGNATURE__OWNED_FLOWS;
				case BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS: return BasicPackage.TMETHOD_SIGNATURE__INCOMING_FLOWS;
				case BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS: return BasicPackage.TMETHOD_SIGNATURE__OUTGOING_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == TAbstractMultiplicity.class) {
			switch (baseFeatureID) {
				case BasicPackage.TABSTRACT_MULTIPLICITY__LOWER_BOUND: return BasicPackage.TMETHOD_SIGNATURE__LOWER_BOUND;
				case BasicPackage.TABSTRACT_MULTIPLICITY__UPPER_BOUND: return BasicPackage.TMETHOD_SIGNATURE__UPPER_BOUND;
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
				case BasicPackage.TABSTRACT_MULTIPLICITY___IS_ARRAY: return BasicPackage.TMETHOD_SIGNATURE___IS_ARRAY;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BasicPackage.TMETHOD_SIGNATURE___GET_SIGNATURE_STRING:
				return getSignatureString();
			case BasicPackage.TMETHOD_SIGNATURE___GET_TDEFINITION__TABSTRACTTYPE:
				return getTDefinition((TAbstractType)arguments.get(0));
			case BasicPackage.TMETHOD_SIGNATURE___TO_STRING:
				return toString();
			case BasicPackage.TMETHOD_SIGNATURE___GET_METHOD_DEFINITIONS:
				return getMethodDefinitions();
			case BasicPackage.TMETHOD_SIGNATURE___IS_ARRAY:
				return isArray();
		}
		return super.eInvoke(operationID, arguments);
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String toString() {
		String string = super.toString();
		String name = getMethod().getTName();
		return string.substring(0, string.length() - 1).concat(", name: ").concat(name).concat(")");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<TMethodDefinition> getMethodDefinitions() {
		return (EList<TMethodDefinition>) ((EList<? extends TMethodDefinition>) getDefinitions());
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

	// [user code injected with eMoflon] -->
} //TMethodSignatureImpl
