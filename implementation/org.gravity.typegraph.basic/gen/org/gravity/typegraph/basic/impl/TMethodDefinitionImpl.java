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
import org.gravity.typegraph.basic.TAbstractMultiplicity;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSyntethicMethod;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>TMethod
 * Definition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodDefinitionImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodDefinitionImpl#getUpperBound <em>Upper Bound</em>}</li>
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
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_BOUND_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected int upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOverriding() <em>Overriding</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOverriding()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethodDefinition> overriding;

	/**
	 * The cached value of the '{@link #getOverriddenBy() <em>Overridden By</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOverriddenBy()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethodDefinition> overriddenBy;

	/**
	 * The cached value of the '{@link #getOverloading() <em>Overloading</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOverloading()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethodDefinition> overloading;

	/**
	 * The cached value of the '{@link #getOverloadedBy() <em>Overloaded By</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOverloadedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethodDefinition> overloadedBy;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected TAbstractType returnType;

	/**
	 * The cached value of the '{@link #getSyntethicMethods() <em>Syntethic Methods</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSyntethicMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<TSyntethicMethod> syntethicMethods;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TMethodDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TMETHOD_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerBound(int newLowerBound) {
		int oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TMETHOD_DEFINITION__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperBound(int newUpperBound) {
		int oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TMETHOD_DEFINITION__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TMethodSignature getSignature() {
		return (TMethodSignature) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public boolean isArray() {
		return getUpperBound() != 1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TMethodDefinition> getOverriding() {
		if (overriding == null) {
			overriding = new EObjectWithInverseResolvingEList.ManyInverse<TMethodDefinition>(TMethodDefinition.class, this, BasicPackage.TMETHOD_DEFINITION__OVERRIDING, BasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY);
		}
		return overriding;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TMethodDefinition> getOverriddenBy() {
		if (overriddenBy == null) {
			overriddenBy = new EObjectWithInverseResolvingEList.ManyInverse<TMethodDefinition>(TMethodDefinition.class, this, BasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY, BasicPackage.TMETHOD_DEFINITION__OVERRIDING);
		}
		return overriddenBy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public String getSignatureString() {
		// [user code injected with eMoflon]

		return getSignature().getSignatureString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicPackage.TMETHOD_DEFINITION__OVERRIDING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOverriding()).basicAdd(otherEnd, msgs);
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicPackage.TMETHOD_DEFINITION__OVERRIDING:
				return ((InternalEList<?>)getOverriding()).basicRemove(otherEnd, msgs);
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicPackage.TMETHOD_DEFINITION__LOWER_BOUND:
				return getLowerBound();
			case BasicPackage.TMETHOD_DEFINITION__UPPER_BOUND:
				return getUpperBound();
			case BasicPackage.TMETHOD_DEFINITION__OVERRIDING:
				return getOverriding();
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasicPackage.TMETHOD_DEFINITION__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case BasicPackage.TMETHOD_DEFINITION__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case BasicPackage.TMETHOD_DEFINITION__OVERRIDING:
				getOverriding().clear();
				getOverriding().addAll((Collection<? extends TMethodDefinition>)newValue);
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasicPackage.TMETHOD_DEFINITION__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case BasicPackage.TMETHOD_DEFINITION__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case BasicPackage.TMETHOD_DEFINITION__OVERRIDING:
				getOverriding().clear();
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasicPackage.TMETHOD_DEFINITION__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case BasicPackage.TMETHOD_DEFINITION__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case BasicPackage.TMETHOD_DEFINITION__OVERRIDING:
				return overriding != null && !overriding.isEmpty();
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TAbstractMultiplicity.class) {
			switch (derivedFeatureID) {
				case BasicPackage.TMETHOD_DEFINITION__LOWER_BOUND: return BasicPackage.TABSTRACT_MULTIPLICITY__LOWER_BOUND;
				case BasicPackage.TMETHOD_DEFINITION__UPPER_BOUND: return BasicPackage.TABSTRACT_MULTIPLICITY__UPPER_BOUND;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TAbstractMultiplicity.class) {
			switch (baseFeatureID) {
				case BasicPackage.TABSTRACT_MULTIPLICITY__LOWER_BOUND: return BasicPackage.TMETHOD_DEFINITION__LOWER_BOUND;
				case BasicPackage.TABSTRACT_MULTIPLICITY__UPPER_BOUND: return BasicPackage.TMETHOD_DEFINITION__UPPER_BOUND;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == TAbstractMultiplicity.class) {
			switch (baseOperationID) {
				case BasicPackage.TABSTRACT_MULTIPLICITY___IS_ARRAY: return BasicPackage.TMETHOD_DEFINITION___IS_ARRAY;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BasicPackage.TMETHOD_DEFINITION___TO_STRING:
				return toString();
			case BasicPackage.TMETHOD_DEFINITION___GET_SIGNATURE:
				return getSignature();
			case BasicPackage.TMETHOD_DEFINITION___IS_ARRAY:
				return isArray();
		}
		return super.eInvoke(operationID, arguments);
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String toString() {
		final String string = super.toString();
		final TMethodSignature signature = getSignature();
		if (signature != null) {
			final TMethod method = signature.getMethod();
			if (method != null) {
				final String name = method.getTName();
				if(name != null) {
					return string.substring(0, string.length() - 1).concat(", name: ").concat(name).concat(")");
				}
			}
		}
		return string;
	}

	// [user code injected with eMoflon] -->
} // TMethodDefinitionImpl
