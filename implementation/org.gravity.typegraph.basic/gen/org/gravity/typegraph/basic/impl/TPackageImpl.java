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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

import org.gravity.typegraph.basic.annotations.impl.TAnnotatableImpl;
// <-- [user defined imports]
import java.util.LinkedList;
import org.eclipse.emf.common.util.BasicEList;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TPackageImpl#getPg <em>Pg</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TPackageImpl#getSubpackage <em>Subpackage</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TPackageImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TPackageImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TPackageImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TPackageImpl#getOwnedTypes <em>Owned Types</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TPackageImpl#getTypeGraph <em>Type Graph</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TPackageImpl#getTName <em>TName</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TPackageImpl extends TAnnotatableImpl implements TPackage {
	/**
	 * The cached value of the '{@link #getSubpackage() <em>Subpackage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubpackage()
	 * @generated
	 * @ordered
	 */
	protected EList<TPackage> subpackage;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<TClass> classes;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<TInterface> interfaces;

	/**
	 * The cached value of the '{@link #getOwnedTypes() <em>Owned Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TAbstractType> ownedTypes;

	/**
	 * The cached value of the '{@link #getTypeGraph() <em>Type Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeGraph()
	 * @generated
	 * @ordered
	 */
	protected TypeGraph typeGraph;

	/**
	 * The default value of the '{@link #getTName() <em>TName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTName()
	 * @generated
	 * @ordered
	 */
	protected static final String TNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTName() <em>TName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTName()
	 * @generated
	 * @ordered
	 */
	protected String tName = TNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TPACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeGraph getPg() {
		if (eContainerFeatureID() != BasicPackage.TPACKAGE__PG) return null;
		return (TypeGraph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPg(TypeGraph newPg, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPg, BasicPackage.TPACKAGE__PG, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPg(TypeGraph newPg) {
		if (newPg != eInternalContainer() || (eContainerFeatureID() != BasicPackage.TPACKAGE__PG && newPg != null)) {
			if (EcoreUtil.isAncestor(this, newPg))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPg != null)
				msgs = ((InternalEObject)newPg).eInverseAdd(this, BasicPackage.TYPE_GRAPH__PACKAGES, TypeGraph.class, msgs);
			msgs = basicSetPg(newPg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TPACKAGE__PG, newPg, newPg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TPackage> getSubpackage() {
		if (subpackage == null) {
			subpackage = new EObjectContainmentWithInverseEList<TPackage>(TPackage.class, this, BasicPackage.TPACKAGE__SUBPACKAGE, BasicPackage.TPACKAGE__PARENT);
		}
		return subpackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPackage getParent() {
		if (eContainerFeatureID() != BasicPackage.TPACKAGE__PARENT) return null;
		return (TPackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TPackage newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, BasicPackage.TPACKAGE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(TPackage newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != BasicPackage.TPACKAGE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, BasicPackage.TPACKAGE__SUBPACKAGE, TPackage.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TPACKAGE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TClass> getClasses() {
		if (classes == null) {
			classes = new EObjectResolvingEList<TClass>(TClass.class, this, BasicPackage.TPACKAGE__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TInterface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectResolvingEList<TInterface>(TInterface.class, this, BasicPackage.TPACKAGE__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAbstractType> getOwnedTypes() {
		if (ownedTypes == null) {
			ownedTypes = new EObjectWithInverseResolvingEList<TAbstractType>(TAbstractType.class, this, BasicPackage.TPACKAGE__OWNED_TYPES, BasicPackage.TABSTRACT_TYPE__PACKAGE);
		}
		return ownedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeGraph getTypeGraph() {
		if (typeGraph != null && typeGraph.eIsProxy()) {
			InternalEObject oldTypeGraph = (InternalEObject)typeGraph;
			typeGraph = (TypeGraph)eResolveProxy(oldTypeGraph);
			if (typeGraph != oldTypeGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TPACKAGE__TYPE_GRAPH, oldTypeGraph, typeGraph));
			}
		}
		return typeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraph basicGetTypeGraph() {
		return typeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeGraph(TypeGraph newTypeGraph) {
		TypeGraph oldTypeGraph = typeGraph;
		typeGraph = newTypeGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TPACKAGE__TYPE_GRAPH, oldTypeGraph, typeGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTName() {
		return tName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTName(String newTName) {
		String oldTName = tName;
		tName = newTName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TPACKAGE__TNAME, oldTName, tName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getFullyQualifiedName() {
		// [user code injected with eMoflon]
		LinkedList<String> names = new LinkedList<>();
		TPackage current = this;
		while (current != null) {
			names.add(0, current.getTName());
			TPackage parent = getParent();
			if (parent == current) {
				break;
			}
			current = parent;
		}
		return String.join(".", names);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<TAbstractType> getAllOwnedTypes() {
		// [user code injected with eMoflon]
		EList<TAbstractType> tAllOwnedTypes = new BasicEList<>();
		tAllOwnedTypes.addAll(getOwnedTypes());
		for (TPackage tSubPackage : getSubpackage()) {
			tAllOwnedTypes.addAll(tSubPackage.getAllOwnedTypes());
		}
		return tAllOwnedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<TClass> getAllOwnedClasses() {
		// [user code injected with eMoflon]
		EList<TClass> tAllOwnedTypes = new BasicEList<>();
		for (TAbstractType tType : getOwnedTypes()) {
			if (tType instanceof TClass) {
				tAllOwnedTypes.add((TClass) tType);

			}
		}
		for (TPackage tSubPackage : getSubpackage()) {
			tAllOwnedTypes.addAll(tSubPackage.getAllOwnedClasses());
		}
		return tAllOwnedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TPackage getBasePackage() {
		// [user code injected with eMoflon]
		TPackage parent = getParent();
		if (parent != null && !parent.equals(this)) {
			return parent.getBasePackage();
		} else {
			return this;
		}
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
			case BasicPackage.TPACKAGE__PG:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPg((TypeGraph)otherEnd, msgs);
			case BasicPackage.TPACKAGE__SUBPACKAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubpackage()).basicAdd(otherEnd, msgs);
			case BasicPackage.TPACKAGE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TPackage)otherEnd, msgs);
			case BasicPackage.TPACKAGE__OWNED_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedTypes()).basicAdd(otherEnd, msgs);
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
			case BasicPackage.TPACKAGE__PG:
				return basicSetPg(null, msgs);
			case BasicPackage.TPACKAGE__SUBPACKAGE:
				return ((InternalEList<?>)getSubpackage()).basicRemove(otherEnd, msgs);
			case BasicPackage.TPACKAGE__PARENT:
				return basicSetParent(null, msgs);
			case BasicPackage.TPACKAGE__OWNED_TYPES:
				return ((InternalEList<?>)getOwnedTypes()).basicRemove(otherEnd, msgs);
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
			case BasicPackage.TPACKAGE__PG:
				return eInternalContainer().eInverseRemove(this, BasicPackage.TYPE_GRAPH__PACKAGES, TypeGraph.class, msgs);
			case BasicPackage.TPACKAGE__PARENT:
				return eInternalContainer().eInverseRemove(this, BasicPackage.TPACKAGE__SUBPACKAGE, TPackage.class, msgs);
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
			case BasicPackage.TPACKAGE__PG:
				return getPg();
			case BasicPackage.TPACKAGE__SUBPACKAGE:
				return getSubpackage();
			case BasicPackage.TPACKAGE__PARENT:
				return getParent();
			case BasicPackage.TPACKAGE__CLASSES:
				return getClasses();
			case BasicPackage.TPACKAGE__INTERFACES:
				return getInterfaces();
			case BasicPackage.TPACKAGE__OWNED_TYPES:
				return getOwnedTypes();
			case BasicPackage.TPACKAGE__TYPE_GRAPH:
				if (resolve) return getTypeGraph();
				return basicGetTypeGraph();
			case BasicPackage.TPACKAGE__TNAME:
				return getTName();
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
			case BasicPackage.TPACKAGE__PG:
				setPg((TypeGraph)newValue);
				return;
			case BasicPackage.TPACKAGE__SUBPACKAGE:
				getSubpackage().clear();
				getSubpackage().addAll((Collection<? extends TPackage>)newValue);
				return;
			case BasicPackage.TPACKAGE__PARENT:
				setParent((TPackage)newValue);
				return;
			case BasicPackage.TPACKAGE__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends TClass>)newValue);
				return;
			case BasicPackage.TPACKAGE__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends TInterface>)newValue);
				return;
			case BasicPackage.TPACKAGE__OWNED_TYPES:
				getOwnedTypes().clear();
				getOwnedTypes().addAll((Collection<? extends TAbstractType>)newValue);
				return;
			case BasicPackage.TPACKAGE__TYPE_GRAPH:
				setTypeGraph((TypeGraph)newValue);
				return;
			case BasicPackage.TPACKAGE__TNAME:
				setTName((String)newValue);
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
			case BasicPackage.TPACKAGE__PG:
				setPg((TypeGraph)null);
				return;
			case BasicPackage.TPACKAGE__SUBPACKAGE:
				getSubpackage().clear();
				return;
			case BasicPackage.TPACKAGE__PARENT:
				setParent((TPackage)null);
				return;
			case BasicPackage.TPACKAGE__CLASSES:
				getClasses().clear();
				return;
			case BasicPackage.TPACKAGE__INTERFACES:
				getInterfaces().clear();
				return;
			case BasicPackage.TPACKAGE__OWNED_TYPES:
				getOwnedTypes().clear();
				return;
			case BasicPackage.TPACKAGE__TYPE_GRAPH:
				setTypeGraph((TypeGraph)null);
				return;
			case BasicPackage.TPACKAGE__TNAME:
				setTName(TNAME_EDEFAULT);
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
			case BasicPackage.TPACKAGE__PG:
				return getPg() != null;
			case BasicPackage.TPACKAGE__SUBPACKAGE:
				return subpackage != null && !subpackage.isEmpty();
			case BasicPackage.TPACKAGE__PARENT:
				return getParent() != null;
			case BasicPackage.TPACKAGE__CLASSES:
				return classes != null && !classes.isEmpty();
			case BasicPackage.TPACKAGE__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case BasicPackage.TPACKAGE__OWNED_TYPES:
				return ownedTypes != null && !ownedTypes.isEmpty();
			case BasicPackage.TPACKAGE__TYPE_GRAPH:
				return typeGraph != null;
			case BasicPackage.TPACKAGE__TNAME:
				return TNAME_EDEFAULT == null ? tName != null : !TNAME_EDEFAULT.equals(tName);
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
			case BasicPackage.TPACKAGE___GET_FULLY_QUALIFIED_NAME:
				return getFullyQualifiedName();
			case BasicPackage.TPACKAGE___GET_ALL_OWNED_TYPES:
				return getAllOwnedTypes();
			case BasicPackage.TPACKAGE___GET_ALL_OWNED_CLASSES:
				return getAllOwnedClasses();
			case BasicPackage.TPACKAGE___GET_BASE_PACKAGE:
				return getBasePackage();
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
		result.append(" (tName: ");
		result.append(tName);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TPackageImpl
