/**
 */
package org.gravity.modisco.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import org.eclipse.gmt.modisco.java.emf.impl.BodyDeclarationImpl;

import org.gravity.modisco.MAbstractFlowElement;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MFlow;
import org.gravity.modisco.MSingleVariableAccess;
import org.gravity.modisco.MethodInvocationStaticType;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MDefinition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MDefinitionImpl#getOwnedFlows <em>Owned Flows</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MDefinitionImpl#getIncomingFlows <em>Incoming Flows</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MDefinitionImpl#getOutgoingFlows <em>Outgoing Flows</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MDefinitionImpl#getInvocationStaticTypes <em>Invocation Static Types</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MDefinitionImpl#getMMethodInvocations <em>MMethod Invocations</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MDefinitionImpl#getMAbstractFieldAccess <em>MAbstract Field Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MDefinitionImpl extends BodyDeclarationImpl implements MDefinition {
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
	 * The cached value of the '{@link #getInvocationStaticTypes() <em>Invocation Static Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvocationStaticTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodInvocationStaticType> invocationStaticTypes;

	/**
	 * The cached value of the '{@link #getMMethodInvocations() <em>MMethod Invocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMethodInvocations()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMethodInvocation> mMethodInvocations;

	/**
	 * The cached value of the '{@link #getMAbstractFieldAccess() <em>MAbstract Field Access</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAbstractFieldAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<MSingleVariableAccess> mAbstractFieldAccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MDEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFlow> getOwnedFlows() {
		if (ownedFlows == null) {
			ownedFlows = new EObjectContainmentWithInverseEList<MFlow>(MFlow.class, this, ModiscoPackage.MDEFINITION__OWNED_FLOWS, ModiscoPackage.MFLOW__FLOW_OWNER);
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
			incomingFlows = new EObjectWithInverseResolvingEList<MFlow>(MFlow.class, this, ModiscoPackage.MDEFINITION__INCOMING_FLOWS, ModiscoPackage.MFLOW__FLOW_TARGET);
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
			outgoingFlows = new EObjectWithInverseResolvingEList<MFlow>(MFlow.class, this, ModiscoPackage.MDEFINITION__OUTGOING_FLOWS, ModiscoPackage.MFLOW__FLOW_SOURCE);
		}
		return outgoingFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodInvocationStaticType> getInvocationStaticTypes() {
		if (invocationStaticTypes == null) {
			invocationStaticTypes = new EObjectResolvingEList<MethodInvocationStaticType>(MethodInvocationStaticType.class, this, ModiscoPackage.MDEFINITION__INVOCATION_STATIC_TYPES);
		}
		return invocationStaticTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractMethodInvocation> getMMethodInvocations() {
		if (mMethodInvocations == null) {
			mMethodInvocations = new EObjectResolvingEList<AbstractMethodInvocation>(AbstractMethodInvocation.class, this, ModiscoPackage.MDEFINITION__MMETHOD_INVOCATIONS);
		}
		return mMethodInvocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MSingleVariableAccess> getMAbstractFieldAccess() {
		if (mAbstractFieldAccess == null) {
			mAbstractFieldAccess = new EObjectResolvingEList<MSingleVariableAccess>(MSingleVariableAccess.class, this, ModiscoPackage.MDEFINITION__MABSTRACT_FIELD_ACCESS);
		}
		return mAbstractFieldAccess;
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
			case ModiscoPackage.MDEFINITION__OWNED_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFlows()).basicAdd(otherEnd, msgs);
			case ModiscoPackage.MDEFINITION__INCOMING_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingFlows()).basicAdd(otherEnd, msgs);
			case ModiscoPackage.MDEFINITION__OUTGOING_FLOWS:
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
			case ModiscoPackage.MDEFINITION__OWNED_FLOWS:
				return ((InternalEList<?>)getOwnedFlows()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MDEFINITION__INCOMING_FLOWS:
				return ((InternalEList<?>)getIncomingFlows()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MDEFINITION__OUTGOING_FLOWS:
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
			case ModiscoPackage.MDEFINITION__OWNED_FLOWS:
				return getOwnedFlows();
			case ModiscoPackage.MDEFINITION__INCOMING_FLOWS:
				return getIncomingFlows();
			case ModiscoPackage.MDEFINITION__OUTGOING_FLOWS:
				return getOutgoingFlows();
			case ModiscoPackage.MDEFINITION__INVOCATION_STATIC_TYPES:
				return getInvocationStaticTypes();
			case ModiscoPackage.MDEFINITION__MMETHOD_INVOCATIONS:
				return getMMethodInvocations();
			case ModiscoPackage.MDEFINITION__MABSTRACT_FIELD_ACCESS:
				return getMAbstractFieldAccess();
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
			case ModiscoPackage.MDEFINITION__OWNED_FLOWS:
				getOwnedFlows().clear();
				getOwnedFlows().addAll((Collection<? extends MFlow>)newValue);
				return;
			case ModiscoPackage.MDEFINITION__INCOMING_FLOWS:
				getIncomingFlows().clear();
				getIncomingFlows().addAll((Collection<? extends MFlow>)newValue);
				return;
			case ModiscoPackage.MDEFINITION__OUTGOING_FLOWS:
				getOutgoingFlows().clear();
				getOutgoingFlows().addAll((Collection<? extends MFlow>)newValue);
				return;
			case ModiscoPackage.MDEFINITION__INVOCATION_STATIC_TYPES:
				getInvocationStaticTypes().clear();
				getInvocationStaticTypes().addAll((Collection<? extends MethodInvocationStaticType>)newValue);
				return;
			case ModiscoPackage.MDEFINITION__MMETHOD_INVOCATIONS:
				getMMethodInvocations().clear();
				getMMethodInvocations().addAll((Collection<? extends AbstractMethodInvocation>)newValue);
				return;
			case ModiscoPackage.MDEFINITION__MABSTRACT_FIELD_ACCESS:
				getMAbstractFieldAccess().clear();
				getMAbstractFieldAccess().addAll((Collection<? extends MSingleVariableAccess>)newValue);
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
			case ModiscoPackage.MDEFINITION__OWNED_FLOWS:
				getOwnedFlows().clear();
				return;
			case ModiscoPackage.MDEFINITION__INCOMING_FLOWS:
				getIncomingFlows().clear();
				return;
			case ModiscoPackage.MDEFINITION__OUTGOING_FLOWS:
				getOutgoingFlows().clear();
				return;
			case ModiscoPackage.MDEFINITION__INVOCATION_STATIC_TYPES:
				getInvocationStaticTypes().clear();
				return;
			case ModiscoPackage.MDEFINITION__MMETHOD_INVOCATIONS:
				getMMethodInvocations().clear();
				return;
			case ModiscoPackage.MDEFINITION__MABSTRACT_FIELD_ACCESS:
				getMAbstractFieldAccess().clear();
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
			case ModiscoPackage.MDEFINITION__OWNED_FLOWS:
				return ownedFlows != null && !ownedFlows.isEmpty();
			case ModiscoPackage.MDEFINITION__INCOMING_FLOWS:
				return incomingFlows != null && !incomingFlows.isEmpty();
			case ModiscoPackage.MDEFINITION__OUTGOING_FLOWS:
				return outgoingFlows != null && !outgoingFlows.isEmpty();
			case ModiscoPackage.MDEFINITION__INVOCATION_STATIC_TYPES:
				return invocationStaticTypes != null && !invocationStaticTypes.isEmpty();
			case ModiscoPackage.MDEFINITION__MMETHOD_INVOCATIONS:
				return mMethodInvocations != null && !mMethodInvocations.isEmpty();
			case ModiscoPackage.MDEFINITION__MABSTRACT_FIELD_ACCESS:
				return mAbstractFieldAccess != null && !mAbstractFieldAccess.isEmpty();
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
				case ModiscoPackage.MDEFINITION__OWNED_FLOWS: return ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS;
				case ModiscoPackage.MDEFINITION__INCOMING_FLOWS: return ModiscoPackage.MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS;
				case ModiscoPackage.MDEFINITION__OUTGOING_FLOWS: return ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS;
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
				case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS: return ModiscoPackage.MDEFINITION__OWNED_FLOWS;
				case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS: return ModiscoPackage.MDEFINITION__INCOMING_FLOWS;
				case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS: return ModiscoPackage.MDEFINITION__OUTGOING_FLOWS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MDefinitionImpl
