/**
 */
package org.gravity.typegraph.basic.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TAbstractType;
import java.util.Collections;
import java.util.HashSet;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TInterface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TInterfaceImpl#getImplementedBy <em>Implemented By</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TInterfaceImpl#getParentInterfaces <em>Parent Interfaces</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TInterfaceImpl#getChildInterfaces <em>Child Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TInterfaceImpl extends TAbstractTypeImpl implements TInterface {
	/**
	 * The cached value of the '{@link #getImplementedBy() <em>Implemented By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<TClass> implementedBy;

	/**
	 * The cached value of the '{@link #getParentInterfaces() <em>Parent Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<TInterface> parentInterfaces;

	/**
	 * The cached value of the '{@link #getChildInterfaces() <em>Child Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<TInterface> childInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TINTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TClass> getImplementedBy() {
		if (implementedBy == null) {
			implementedBy = new EObjectWithInverseResolvingEList.ManyInverse<TClass>(TClass.class, this, BasicPackage.TINTERFACE__IMPLEMENTED_BY, BasicPackage.TCLASS__IMPLEMENTS);
		}
		return implementedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TInterface> getParentInterfaces() {
		if (parentInterfaces == null) {
			parentInterfaces = new EObjectWithInverseResolvingEList.ManyInverse<TInterface>(TInterface.class, this, BasicPackage.TINTERFACE__PARENT_INTERFACES, BasicPackage.TINTERFACE__CHILD_INTERFACES);
		}
		return parentInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TInterface> getChildInterfaces() {
		if (childInterfaces == null) {
			childInterfaces = new EObjectWithInverseResolvingEList.ManyInverse<TInterface>(TInterface.class, this, BasicPackage.TINTERFACE__CHILD_INTERFACES, BasicPackage.TINTERFACE__PARENT_INTERFACES);
		}
		return childInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSuperTypeOf(TAbstractType tType) {
		// [user code injected with eMoflon]
		if (tType instanceof TInterface) {
			EList<TInterface> tInterfaces = getParentInterfaces();
			if (tInterfaces.contains(tType)) {
				return true;
			} else {
				for (TInterface tInterface : tInterfaces) {
					if (tInterface.isSuperTypeOf(tType)) {
						return true;
					}
				}
			}
		}
		return false;
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
			case BasicPackage.TINTERFACE__IMPLEMENTED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplementedBy()).basicAdd(otherEnd, msgs);
			case BasicPackage.TINTERFACE__PARENT_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentInterfaces()).basicAdd(otherEnd, msgs);
			case BasicPackage.TINTERFACE__CHILD_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildInterfaces()).basicAdd(otherEnd, msgs);
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
			case BasicPackage.TINTERFACE__IMPLEMENTED_BY:
				return ((InternalEList<?>)getImplementedBy()).basicRemove(otherEnd, msgs);
			case BasicPackage.TINTERFACE__PARENT_INTERFACES:
				return ((InternalEList<?>)getParentInterfaces()).basicRemove(otherEnd, msgs);
			case BasicPackage.TINTERFACE__CHILD_INTERFACES:
				return ((InternalEList<?>)getChildInterfaces()).basicRemove(otherEnd, msgs);
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
			case BasicPackage.TINTERFACE__IMPLEMENTED_BY:
				return getImplementedBy();
			case BasicPackage.TINTERFACE__PARENT_INTERFACES:
				return getParentInterfaces();
			case BasicPackage.TINTERFACE__CHILD_INTERFACES:
				return getChildInterfaces();
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
			case BasicPackage.TINTERFACE__IMPLEMENTED_BY:
				getImplementedBy().clear();
				getImplementedBy().addAll((Collection<? extends TClass>)newValue);
				return;
			case BasicPackage.TINTERFACE__PARENT_INTERFACES:
				getParentInterfaces().clear();
				getParentInterfaces().addAll((Collection<? extends TInterface>)newValue);
				return;
			case BasicPackage.TINTERFACE__CHILD_INTERFACES:
				getChildInterfaces().clear();
				getChildInterfaces().addAll((Collection<? extends TInterface>)newValue);
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
			case BasicPackage.TINTERFACE__IMPLEMENTED_BY:
				getImplementedBy().clear();
				return;
			case BasicPackage.TINTERFACE__PARENT_INTERFACES:
				getParentInterfaces().clear();
				return;
			case BasicPackage.TINTERFACE__CHILD_INTERFACES:
				getChildInterfaces().clear();
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
			case BasicPackage.TINTERFACE__IMPLEMENTED_BY:
				return implementedBy != null && !implementedBy.isEmpty();
			case BasicPackage.TINTERFACE__PARENT_INTERFACES:
				return parentInterfaces != null && !parentInterfaces.isEmpty();
			case BasicPackage.TINTERFACE__CHILD_INTERFACES:
				return childInterfaces != null && !childInterfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	// <-- [user code injected with eMoflon]

	private HashSet<TInterface> fillParents(HashSet<TInterface> parents) {

		int size = parents.size();
		parents.addAll(this.getParentInterfaces());
		if (size < parents.size()) {
			fillParents(parents);
		}

		return parents;
	}

	public boolean hasCommonSuperType(TAbstractType tAbstractType) {
		if (!(tAbstractType instanceof TInterfaceImpl)) {
			return false;
		}
		TInterfaceImpl tInterface = (TInterfaceImpl) tAbstractType;
		HashSet<TInterface> parents = new HashSet<TInterface>();
		HashSet<TInterface> otherParents = new HashSet<TInterface>();

		parents.add(this);
		otherParents.add(tInterface);
		this.fillParents(parents);
		tInterface.fillParents(otherParents);

		return (!Collections.disjoint(parents, otherParents));
	}

	// [user code injected with eMoflon] -->
} //TInterfaceImpl
