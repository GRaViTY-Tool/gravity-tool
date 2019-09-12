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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSyntethicMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMethod Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodDefinitionImpl#getOverriding <em>Overriding</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodDefinitionImpl#getOverriddenBy <em>Overridden By</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodDefinitionImpl#getOverloading <em>Overloading</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodDefinitionImpl#getOverloadedBy <em>Overloaded By</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodDefinitionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodDefinitionImpl#getSyntethicMethods <em>Syntethic Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMethodDefinitionImpl extends TMemberImpl implements TMethodDefinition {
	/**
	 * The cached value of the '{@link #getOverriding() <em>Overriding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverriding()
	 * @generated
	 * @ordered
	 */
	protected TMethodDefinition overriding;

	/**
	 * The cached value of the '{@link #getOverriddenBy() <em>Overridden By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverriddenBy()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethodDefinition> overriddenBy;

	/**
	 * The cached value of the '{@link #getOverloading() <em>Overloading</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverloading()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethodDefinition> overloading;

	/**
	 * The cached value of the '{@link #getOverloadedBy() <em>Overloaded By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverloadedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethodDefinition> overloadedBy;

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
	 * The cached value of the '{@link #getSyntethicMethods() <em>Syntethic Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntethicMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<TSyntethicMethod> syntethicMethods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMethodDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TMETHOD_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public TMethodSignature getSignature() {
		return (TMethodSignature) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethodDefinition getOverriding() {
		if (overriding != null && overriding.eIsProxy()) {
			InternalEObject oldOverriding = (InternalEObject)overriding;
			overriding = (TMethodDefinition)eResolveProxy(oldOverriding);
			if (overriding != oldOverriding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TMETHOD_DEFINITION__OVERRIDING, oldOverriding, overriding));
			}
		}
		return overriding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodDefinition basicGetOverriding() {
		return overriding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverriding(TMethodDefinition newOverriding, NotificationChain msgs) {
		TMethodDefinition oldOverriding = overriding;
		overriding = newOverriding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicPackage.TMETHOD_DEFINITION__OVERRIDING, oldOverriding, newOverriding);
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
	public void setOverriding(TMethodDefinition newOverriding) {
		if (newOverriding != overriding) {
			NotificationChain msgs = null;
			if (overriding != null)
				msgs = ((InternalEObject)overriding).eInverseRemove(this, BasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY, TMethodDefinition.class, msgs);
			if (newOverriding != null)
				msgs = ((InternalEObject)newOverriding).eInverseAdd(this, BasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY, TMethodDefinition.class, msgs);
			msgs = basicSetOverriding(newOverriding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TMETHOD_DEFINITION__OVERRIDING, newOverriding, newOverriding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TMethodDefinition> getOverriddenBy() {
		if (overriddenBy == null) {
			overriddenBy = new EObjectWithInverseResolvingEList<TMethodDefinition>(TMethodDefinition.class, this, BasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY, BasicPackage.TMETHOD_DEFINITION__OVERRIDING);
		}
		return overriddenBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TMethodDefinition> getOverloading() {
		if (overloading == null) {
			overloading = new EObjectWithInverseResolvingEList.ManyInverse<TMethodDefinition>(TMethodDefinition.class, this, BasicPackage.TMETHOD_DEFINITION__OVERLOADING, BasicPackage.TMETHOD_DEFINITION__OVERLOADED_BY);
		}
		return overloading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TMethodDefinition> getOverloadedBy() {
		if (overloadedBy == null) {
			overloadedBy = new EObjectWithInverseResolvingEList.ManyInverse<TMethodDefinition>(TMethodDefinition.class, this, BasicPackage.TMETHOD_DEFINITION__OVERLOADED_BY, BasicPackage.TMETHOD_DEFINITION__OVERLOADING);
		}
		return overloadedBy;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TMETHOD_DEFINITION__RETURN_TYPE, oldReturnType, returnType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TMETHOD_DEFINITION__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TSyntethicMethod> getSyntethicMethods() {
		if (syntethicMethods == null) {
			syntethicMethods = new EObjectWithInverseResolvingEList<TSyntethicMethod>(TSyntethicMethod.class, this, BasicPackage.TMETHOD_DEFINITION__SYNTETHIC_METHODS, BasicPackage.TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION);
		}
		return syntethicMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getSignatureString() {
		// [user code injected with eMoflon]

		return getSignature().getSignatureString();
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
			case BasicPackage.TMETHOD_DEFINITION__OVERRIDING:
				if (overriding != null)
					msgs = ((InternalEObject)overriding).eInverseRemove(this, BasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY, TMethodDefinition.class, msgs);
				return basicSetOverriding((TMethodDefinition)otherEnd, msgs);
			case BasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOverriddenBy()).basicAdd(otherEnd, msgs);
			case BasicPackage.TMETHOD_DEFINITION__OVERLOADING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOverloading()).basicAdd(otherEnd, msgs);
			case BasicPackage.TMETHOD_DEFINITION__OVERLOADED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOverloadedBy()).basicAdd(otherEnd, msgs);
			case BasicPackage.TMETHOD_DEFINITION__SYNTETHIC_METHODS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSyntethicMethods()).basicAdd(otherEnd, msgs);
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
			case BasicPackage.TMETHOD_DEFINITION__OVERRIDING:
				return basicSetOverriding(null, msgs);
			case BasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY:
				return ((InternalEList<?>)getOverriddenBy()).basicRemove(otherEnd, msgs);
			case BasicPackage.TMETHOD_DEFINITION__OVERLOADING:
				return ((InternalEList<?>)getOverloading()).basicRemove(otherEnd, msgs);
			case BasicPackage.TMETHOD_DEFINITION__OVERLOADED_BY:
				return ((InternalEList<?>)getOverloadedBy()).basicRemove(otherEnd, msgs);
			case BasicPackage.TMETHOD_DEFINITION__SYNTETHIC_METHODS:
				return ((InternalEList<?>)getSyntethicMethods()).basicRemove(otherEnd, msgs);
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
			case BasicPackage.TMETHOD_DEFINITION__OVERRIDING:
				if (resolve) return getOverriding();
				return basicGetOverriding();
			case BasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY:
				return getOverriddenBy();
			case BasicPackage.TMETHOD_DEFINITION__OVERLOADING:
				return getOverloading();
			case BasicPackage.TMETHOD_DEFINITION__OVERLOADED_BY:
				return getOverloadedBy();
			case BasicPackage.TMETHOD_DEFINITION__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
			case BasicPackage.TMETHOD_DEFINITION__SYNTETHIC_METHODS:
				return getSyntethicMethods();
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
			case BasicPackage.TMETHOD_DEFINITION__OVERRIDING:
				setOverriding((TMethodDefinition)newValue);
				return;
			case BasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY:
				getOverriddenBy().clear();
				getOverriddenBy().addAll((Collection<? extends TMethodDefinition>)newValue);
				return;
			case BasicPackage.TMETHOD_DEFINITION__OVERLOADING:
				getOverloading().clear();
				getOverloading().addAll((Collection<? extends TMethodDefinition>)newValue);
				return;
			case BasicPackage.TMETHOD_DEFINITION__OVERLOADED_BY:
				getOverloadedBy().clear();
				getOverloadedBy().addAll((Collection<? extends TMethodDefinition>)newValue);
				return;
			case BasicPackage.TMETHOD_DEFINITION__RETURN_TYPE:
				setReturnType((TAbstractType)newValue);
				return;
			case BasicPackage.TMETHOD_DEFINITION__SYNTETHIC_METHODS:
				getSyntethicMethods().clear();
				getSyntethicMethods().addAll((Collection<? extends TSyntethicMethod>)newValue);
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
			case BasicPackage.TMETHOD_DEFINITION__OVERRIDING:
				setOverriding((TMethodDefinition)null);
				return;
			case BasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY:
				getOverriddenBy().clear();
				return;
			case BasicPackage.TMETHOD_DEFINITION__OVERLOADING:
				getOverloading().clear();
				return;
			case BasicPackage.TMETHOD_DEFINITION__OVERLOADED_BY:
				getOverloadedBy().clear();
				return;
			case BasicPackage.TMETHOD_DEFINITION__RETURN_TYPE:
				setReturnType((TAbstractType)null);
				return;
			case BasicPackage.TMETHOD_DEFINITION__SYNTETHIC_METHODS:
				getSyntethicMethods().clear();
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
			case BasicPackage.TMETHOD_DEFINITION__OVERRIDING:
				return overriding != null;
			case BasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY:
				return overriddenBy != null && !overriddenBy.isEmpty();
			case BasicPackage.TMETHOD_DEFINITION__OVERLOADING:
				return overloading != null && !overloading.isEmpty();
			case BasicPackage.TMETHOD_DEFINITION__OVERLOADED_BY:
				return overloadedBy != null && !overloadedBy.isEmpty();
			case BasicPackage.TMETHOD_DEFINITION__RETURN_TYPE:
				return returnType != null;
			case BasicPackage.TMETHOD_DEFINITION__SYNTETHIC_METHODS:
				return syntethicMethods != null && !syntethicMethods.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BasicPackage.TMETHOD_DEFINITION___TO_STRING:
				return toString();
			case BasicPackage.TMETHOD_DEFINITION___GET_SIGNATURE:
				return getSignature();
		}
		return super.eInvoke(operationID, arguments);
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String toString() {
		String string = super.toString();
		String name = getSignature().getMethod().getTName();
		return string.substring(0, string.length() - 1).concat(", name: ").concat(name).concat(")");
	}

	// [user code injected with eMoflon] -->
} //TMethodDefinitionImpl
