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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.java.AbstractMethodInvocation;
import org.eclipse.modisco.java.AbstractTypeDeclaration;

import org.eclipse.modisco.java.emf.impl.MethodDeclarationImpl;

import org.gravity.modisco.MAbstractFlowElement;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MFlow;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MSignature;
import org.gravity.modisco.MSingleVariableAccess;
import org.gravity.modisco.MSyntheticMethodDefinition;
import org.gravity.modisco.MethodInvocationStaticType;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MMethod Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MMethodDefinitionImpl#getOwnedFlows <em>Owned Flows</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MMethodDefinitionImpl#getIncomingFlows <em>Incoming Flows</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MMethodDefinitionImpl#getOutgoingFlows <em>Outgoing Flows</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MMethodDefinitionImpl#getInvocationStaticTypes <em>Invocation Static Types</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MMethodDefinitionImpl#getMMethodInvocations <em>MMethod Invocations</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MMethodDefinitionImpl#getMAbstractFieldAccess <em>MAbstract Field Access</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MMethodDefinitionImpl#getMSignature <em>MSignature</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MMethodDefinitionImpl#getMInnerTypes <em>MInner Types</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MMethodDefinitionImpl#getSyntheticMethodDefinitions <em>Synthetic Method Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MMethodDefinitionImpl extends MethodDeclarationImpl implements MMethodDefinition {
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
	 * The cached value of the '{@link #getMSignature() <em>MSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSignature()
	 * @generated
	 * @ordered
	 */
	protected MSignature mSignature;

	/**
	 * The cached value of the '{@link #getMInnerTypes() <em>MInner Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMInnerTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTypeDeclaration> mInnerTypes;

	/**
	 * The cached value of the '{@link #getSyntheticMethodDefinitions() <em>Synthetic Method Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntheticMethodDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<MSyntheticMethodDefinition> syntheticMethodDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MMethodDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MMETHOD_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFlow> getOwnedFlows() {
		if (ownedFlows == null) {
			ownedFlows = new EObjectContainmentWithInverseEList<MFlow>(MFlow.class, this, ModiscoPackage.MMETHOD_DEFINITION__OWNED_FLOWS, ModiscoPackage.MFLOW__FLOW_OWNER);
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
			incomingFlows = new EObjectWithInverseResolvingEList<MFlow>(MFlow.class, this, ModiscoPackage.MMETHOD_DEFINITION__INCOMING_FLOWS, ModiscoPackage.MFLOW__FLOW_TARGET);
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
			outgoingFlows = new EObjectWithInverseResolvingEList<MFlow>(MFlow.class, this, ModiscoPackage.MMETHOD_DEFINITION__OUTGOING_FLOWS, ModiscoPackage.MFLOW__FLOW_SOURCE);
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
			invocationStaticTypes = new EObjectResolvingEList<MethodInvocationStaticType>(MethodInvocationStaticType.class, this, ModiscoPackage.MMETHOD_DEFINITION__INVOCATION_STATIC_TYPES);
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
			mMethodInvocations = new EObjectResolvingEList<AbstractMethodInvocation>(AbstractMethodInvocation.class, this, ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_INVOCATIONS);
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
			mAbstractFieldAccess = new EObjectResolvingEList<MSingleVariableAccess>(MSingleVariableAccess.class, this, ModiscoPackage.MMETHOD_DEFINITION__MABSTRACT_FIELD_ACCESS);
		}
		return mAbstractFieldAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSignature getMSignature() {
		if (mSignature != null && mSignature.eIsProxy()) {
			InternalEObject oldMSignature = (InternalEObject)mSignature;
			mSignature = (MSignature)eResolveProxy(oldMSignature);
			if (mSignature != oldMSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MMETHOD_DEFINITION__MSIGNATURE, oldMSignature, mSignature));
			}
		}
		return mSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSignature basicGetMSignature() {
		return mSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSignature(MSignature newMSignature, NotificationChain msgs) {
		MSignature oldMSignature = mSignature;
		mSignature = newMSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModiscoPackage.MMETHOD_DEFINITION__MSIGNATURE, oldMSignature, newMSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSignature(MSignature newMSignature) {
		if (newMSignature != mSignature) {
			NotificationChain msgs = null;
			if (mSignature != null)
				msgs = ((InternalEObject)mSignature).eInverseRemove(this, ModiscoPackage.MSIGNATURE__MDEFINITIONS, MSignature.class, msgs);
			if (newMSignature != null)
				msgs = ((InternalEObject)newMSignature).eInverseAdd(this, ModiscoPackage.MSIGNATURE__MDEFINITIONS, MSignature.class, msgs);
			msgs = basicSetMSignature(newMSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MMETHOD_DEFINITION__MSIGNATURE, newMSignature, newMSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTypeDeclaration> getMInnerTypes() {
		if (mInnerTypes == null) {
			mInnerTypes = new EObjectResolvingEList<AbstractTypeDeclaration>(AbstractTypeDeclaration.class, this, ModiscoPackage.MMETHOD_DEFINITION__MINNER_TYPES);
		}
		return mInnerTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MSyntheticMethodDefinition> getSyntheticMethodDefinitions() {
		if (syntheticMethodDefinitions == null) {
			syntheticMethodDefinitions = new EObjectWithInverseResolvingEList<MSyntheticMethodDefinition>(MSyntheticMethodDefinition.class, this, ModiscoPackage.MMETHOD_DEFINITION__SYNTHETIC_METHOD_DEFINITIONS, ModiscoPackage.MSYNTHETIC_METHOD_DEFINITION__ORIGINAL_METHOD_DEFINITION);
		}
		return syntheticMethodDefinitions;
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
			case ModiscoPackage.MMETHOD_DEFINITION__OWNED_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFlows()).basicAdd(otherEnd, msgs);
			case ModiscoPackage.MMETHOD_DEFINITION__INCOMING_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingFlows()).basicAdd(otherEnd, msgs);
			case ModiscoPackage.MMETHOD_DEFINITION__OUTGOING_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingFlows()).basicAdd(otherEnd, msgs);
			case ModiscoPackage.MMETHOD_DEFINITION__MSIGNATURE:
				if (mSignature != null)
					msgs = ((InternalEObject)mSignature).eInverseRemove(this, ModiscoPackage.MSIGNATURE__MDEFINITIONS, MSignature.class, msgs);
				return basicSetMSignature((MSignature)otherEnd, msgs);
			case ModiscoPackage.MMETHOD_DEFINITION__SYNTHETIC_METHOD_DEFINITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSyntheticMethodDefinitions()).basicAdd(otherEnd, msgs);
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
			case ModiscoPackage.MMETHOD_DEFINITION__OWNED_FLOWS:
				return ((InternalEList<?>)getOwnedFlows()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MMETHOD_DEFINITION__INCOMING_FLOWS:
				return ((InternalEList<?>)getIncomingFlows()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MMETHOD_DEFINITION__OUTGOING_FLOWS:
				return ((InternalEList<?>)getOutgoingFlows()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MMETHOD_DEFINITION__MSIGNATURE:
				return basicSetMSignature(null, msgs);
			case ModiscoPackage.MMETHOD_DEFINITION__SYNTHETIC_METHOD_DEFINITIONS:
				return ((InternalEList<?>)getSyntheticMethodDefinitions()).basicRemove(otherEnd, msgs);
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
			case ModiscoPackage.MMETHOD_DEFINITION__OWNED_FLOWS:
				return getOwnedFlows();
			case ModiscoPackage.MMETHOD_DEFINITION__INCOMING_FLOWS:
				return getIncomingFlows();
			case ModiscoPackage.MMETHOD_DEFINITION__OUTGOING_FLOWS:
				return getOutgoingFlows();
			case ModiscoPackage.MMETHOD_DEFINITION__INVOCATION_STATIC_TYPES:
				return getInvocationStaticTypes();
			case ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_INVOCATIONS:
				return getMMethodInvocations();
			case ModiscoPackage.MMETHOD_DEFINITION__MABSTRACT_FIELD_ACCESS:
				return getMAbstractFieldAccess();
			case ModiscoPackage.MMETHOD_DEFINITION__MSIGNATURE:
				if (resolve) return getMSignature();
				return basicGetMSignature();
			case ModiscoPackage.MMETHOD_DEFINITION__MINNER_TYPES:
				return getMInnerTypes();
			case ModiscoPackage.MMETHOD_DEFINITION__SYNTHETIC_METHOD_DEFINITIONS:
				return getSyntheticMethodDefinitions();
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
			case ModiscoPackage.MMETHOD_DEFINITION__OWNED_FLOWS:
				getOwnedFlows().clear();
				getOwnedFlows().addAll((Collection<? extends MFlow>)newValue);
				return;
			case ModiscoPackage.MMETHOD_DEFINITION__INCOMING_FLOWS:
				getIncomingFlows().clear();
				getIncomingFlows().addAll((Collection<? extends MFlow>)newValue);
				return;
			case ModiscoPackage.MMETHOD_DEFINITION__OUTGOING_FLOWS:
				getOutgoingFlows().clear();
				getOutgoingFlows().addAll((Collection<? extends MFlow>)newValue);
				return;
			case ModiscoPackage.MMETHOD_DEFINITION__INVOCATION_STATIC_TYPES:
				getInvocationStaticTypes().clear();
				getInvocationStaticTypes().addAll((Collection<? extends MethodInvocationStaticType>)newValue);
				return;
			case ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_INVOCATIONS:
				getMMethodInvocations().clear();
				getMMethodInvocations().addAll((Collection<? extends AbstractMethodInvocation>)newValue);
				return;
			case ModiscoPackage.MMETHOD_DEFINITION__MABSTRACT_FIELD_ACCESS:
				getMAbstractFieldAccess().clear();
				getMAbstractFieldAccess().addAll((Collection<? extends MSingleVariableAccess>)newValue);
				return;
			case ModiscoPackage.MMETHOD_DEFINITION__MSIGNATURE:
				setMSignature((MSignature)newValue);
				return;
			case ModiscoPackage.MMETHOD_DEFINITION__MINNER_TYPES:
				getMInnerTypes().clear();
				getMInnerTypes().addAll((Collection<? extends AbstractTypeDeclaration>)newValue);
				return;
			case ModiscoPackage.MMETHOD_DEFINITION__SYNTHETIC_METHOD_DEFINITIONS:
				getSyntheticMethodDefinitions().clear();
				getSyntheticMethodDefinitions().addAll((Collection<? extends MSyntheticMethodDefinition>)newValue);
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
			case ModiscoPackage.MMETHOD_DEFINITION__OWNED_FLOWS:
				getOwnedFlows().clear();
				return;
			case ModiscoPackage.MMETHOD_DEFINITION__INCOMING_FLOWS:
				getIncomingFlows().clear();
				return;
			case ModiscoPackage.MMETHOD_DEFINITION__OUTGOING_FLOWS:
				getOutgoingFlows().clear();
				return;
			case ModiscoPackage.MMETHOD_DEFINITION__INVOCATION_STATIC_TYPES:
				getInvocationStaticTypes().clear();
				return;
			case ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_INVOCATIONS:
				getMMethodInvocations().clear();
				return;
			case ModiscoPackage.MMETHOD_DEFINITION__MABSTRACT_FIELD_ACCESS:
				getMAbstractFieldAccess().clear();
				return;
			case ModiscoPackage.MMETHOD_DEFINITION__MSIGNATURE:
				setMSignature((MSignature)null);
				return;
			case ModiscoPackage.MMETHOD_DEFINITION__MINNER_TYPES:
				getMInnerTypes().clear();
				return;
			case ModiscoPackage.MMETHOD_DEFINITION__SYNTHETIC_METHOD_DEFINITIONS:
				getSyntheticMethodDefinitions().clear();
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
			case ModiscoPackage.MMETHOD_DEFINITION__OWNED_FLOWS:
				return ownedFlows != null && !ownedFlows.isEmpty();
			case ModiscoPackage.MMETHOD_DEFINITION__INCOMING_FLOWS:
				return incomingFlows != null && !incomingFlows.isEmpty();
			case ModiscoPackage.MMETHOD_DEFINITION__OUTGOING_FLOWS:
				return outgoingFlows != null && !outgoingFlows.isEmpty();
			case ModiscoPackage.MMETHOD_DEFINITION__INVOCATION_STATIC_TYPES:
				return invocationStaticTypes != null && !invocationStaticTypes.isEmpty();
			case ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_INVOCATIONS:
				return mMethodInvocations != null && !mMethodInvocations.isEmpty();
			case ModiscoPackage.MMETHOD_DEFINITION__MABSTRACT_FIELD_ACCESS:
				return mAbstractFieldAccess != null && !mAbstractFieldAccess.isEmpty();
			case ModiscoPackage.MMETHOD_DEFINITION__MSIGNATURE:
				return mSignature != null;
			case ModiscoPackage.MMETHOD_DEFINITION__MINNER_TYPES:
				return mInnerTypes != null && !mInnerTypes.isEmpty();
			case ModiscoPackage.MMETHOD_DEFINITION__SYNTHETIC_METHOD_DEFINITIONS:
				return syntheticMethodDefinitions != null && !syntheticMethodDefinitions.isEmpty();
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
				case ModiscoPackage.MMETHOD_DEFINITION__OWNED_FLOWS: return ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS;
				case ModiscoPackage.MMETHOD_DEFINITION__INCOMING_FLOWS: return ModiscoPackage.MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS;
				case ModiscoPackage.MMETHOD_DEFINITION__OUTGOING_FLOWS: return ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == MDefinition.class) {
			switch (derivedFeatureID) {
				case ModiscoPackage.MMETHOD_DEFINITION__INVOCATION_STATIC_TYPES: return ModiscoPackage.MDEFINITION__INVOCATION_STATIC_TYPES;
				case ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_INVOCATIONS: return ModiscoPackage.MDEFINITION__MMETHOD_INVOCATIONS;
				case ModiscoPackage.MMETHOD_DEFINITION__MABSTRACT_FIELD_ACCESS: return ModiscoPackage.MDEFINITION__MABSTRACT_FIELD_ACCESS;
				case ModiscoPackage.MMETHOD_DEFINITION__MSIGNATURE: return ModiscoPackage.MDEFINITION__MSIGNATURE;
				default: return -1;
			}
		}
		if (baseClass == MAbstractMethodDefinition.class) {
			switch (derivedFeatureID) {
				case ModiscoPackage.MMETHOD_DEFINITION__MINNER_TYPES: return ModiscoPackage.MABSTRACT_METHOD_DEFINITION__MINNER_TYPES;
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
				case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS: return ModiscoPackage.MMETHOD_DEFINITION__OWNED_FLOWS;
				case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS: return ModiscoPackage.MMETHOD_DEFINITION__INCOMING_FLOWS;
				case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS: return ModiscoPackage.MMETHOD_DEFINITION__OUTGOING_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == MDefinition.class) {
			switch (baseFeatureID) {
				case ModiscoPackage.MDEFINITION__INVOCATION_STATIC_TYPES: return ModiscoPackage.MMETHOD_DEFINITION__INVOCATION_STATIC_TYPES;
				case ModiscoPackage.MDEFINITION__MMETHOD_INVOCATIONS: return ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_INVOCATIONS;
				case ModiscoPackage.MDEFINITION__MABSTRACT_FIELD_ACCESS: return ModiscoPackage.MMETHOD_DEFINITION__MABSTRACT_FIELD_ACCESS;
				case ModiscoPackage.MDEFINITION__MSIGNATURE: return ModiscoPackage.MMETHOD_DEFINITION__MSIGNATURE;
				default: return -1;
			}
		}
		if (baseClass == MAbstractMethodDefinition.class) {
			switch (baseFeatureID) {
				case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__MINNER_TYPES: return ModiscoPackage.MMETHOD_DEFINITION__MINNER_TYPES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MMethodDefinitionImpl
