/**
 */
package org.gravity.typegraph.basic.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
// <-- [user defined imports]
import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
// [user defined imports] -->
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TModule;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.impl.TAnnotatableImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>TPackage</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TPackageImpl#getSubpackages <em>Subpackages</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TPackageImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TPackageImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TPackageImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TPackageImpl#getAllTypes <em>All Types</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TPackageImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TPackageImpl#getTName <em>TName</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TPackageImpl#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TPackageImpl extends TAnnotatableImpl implements TPackage {
	/**
	 * The cached value of the '{@link #getSubpackages() <em>Subpackages</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSubpackages()
	 * @generated
	 * @ordered
	 */
	protected EList<TPackage> subpackages;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<TClass> classes;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<TInterface> interfaces;

	/**
	 * The cached value of the '{@link #getAllTypes() <em>All Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TAbstractType> allTypes;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected TypeGraph model;

	/**
	 * The default value of the '{@link #getTName() <em>TName</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getTName()
	 * @generated
	 * @ordered
	 */
	protected static final String TNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTName() <em>TName</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getTName()
	 * @generated
	 * @ordered
	 */
	protected String tName = TNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<TModule> modules;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TPACKAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TPackage> getSubpackages() {
		if (subpackages == null) {
			subpackages = new EObjectContainmentWithInverseEList<TPackage>(TPackage.class, this, BasicPackage.TPACKAGE__SUBPACKAGES, BasicPackage.TPACKAGE__PARENT);
		}
		return subpackages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPackage getParent() {
		if (eContainerFeatureID() != BasicPackage.TPACKAGE__PARENT) return null;
		return (TPackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TPackage newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, BasicPackage.TPACKAGE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
				msgs = ((InternalEObject)newParent).eInverseAdd(this, BasicPackage.TPACKAGE__SUBPACKAGES, TPackage.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TPACKAGE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	public EList<TAbstractType> getAllTypes() {
		if (allTypes == null) {
			allTypes = new EObjectWithInverseResolvingEList<TAbstractType>(TAbstractType.class, this, BasicPackage.TPACKAGE__ALL_TYPES, BasicPackage.TABSTRACT_TYPE__PACKAGE);
		}
		return allTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeGraph getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (TypeGraph)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TPACKAGE__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraph basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(TypeGraph newModel) {
		TypeGraph oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TPACKAGE__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTName() {
		return tName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * @generated
	 */
	@Override
	public EList<TModule> getModules() {
		if (modules == null) {
			modules = new EObjectWithInverseResolvingEList<TModule>(TModule.class, this, BasicPackage.TPACKAGE__MODULES, BasicPackage.TMODULE__NAMESPACE);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public String getFullyQualifiedName() {
		// [user code injected with eMoflon]
		final LinkedList<String> names = new LinkedList<>();
		TPackage current = this;
		while (current != null) {
			names.add(0, current.getTName());
			final TPackage parent = current.getParent();
			if (parent == current) {
				throw new IllegalStateException("There shouldn't be cycles in the package hierarchy!");
			}
			current = parent;
		}
		return String.join(".", names);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<TAbstractType> getAllOwnedTypes() {
		// [user code injected with eMoflon]
		final EList<TAbstractType> tAllOwnedTypes = new BasicEList<>();
		tAllOwnedTypes.addAll(getAllTypes());
		for (final TPackage tSubPackage : getSubpackages()) {
			tAllOwnedTypes.addAll(tSubPackage.getAllOwnedTypes());
		}
		return tAllOwnedTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<TClass> getAllOwnedClasses() {
		// [user code injected with eMoflon]
		final EList<TClass> tAllOwnedTypes = new BasicEList<>();
		for (final TAbstractType tType : getAllTypes()) {
			if (tType instanceof TClass) {
				tAllOwnedTypes.add((TClass) tType);

			}
		}
		for (final TPackage tSubPackage : getSubpackages()) {
			tAllOwnedTypes.addAll(tSubPackage.getAllOwnedClasses());
		}
		return tAllOwnedTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TPackage getBasePackage() {
		// [user code injected with eMoflon]
		final TPackage parent = getParent();
		if ((parent != null) && !parent.equals(this)) {
			return parent.getBasePackage();
		} else {
			return this;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TClass createTClass(final String name, final boolean lib, final TVisibility visibility) {
		final TModifier modifier = BasicFactory.eINSTANCE.createTModifier();
		modifier.setTVisibility(visibility);

		final TClass tClass = BasicFactory.eINSTANCE.createTClass();
		tClass.setTName(name);
		tClass.setTLib(lib);
		tClass.setTModifier(modifier);

		getClasses().add(tClass);
		getAllTypes().add(tClass);

		final TypeGraph pm = getModel();
		pm.getClasses().add(tClass);
		pm.getAllTypes().add(tClass);
		return tClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TClass getTClass(final String name) {
		return getAllOwnedClasses().stream().filter(clazz -> clazz.getTName().equals(name)).findAny().orElse(null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicPackage.TPACKAGE__SUBPACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubpackages()).basicAdd(otherEnd, msgs);
			case BasicPackage.TPACKAGE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TPackage)otherEnd, msgs);
			case BasicPackage.TPACKAGE__ALL_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllTypes()).basicAdd(otherEnd, msgs);
			case BasicPackage.TPACKAGE__MODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModules()).basicAdd(otherEnd, msgs);
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
			case BasicPackage.TPACKAGE__SUBPACKAGES:
				return ((InternalEList<?>)getSubpackages()).basicRemove(otherEnd, msgs);
			case BasicPackage.TPACKAGE__PARENT:
				return basicSetParent(null, msgs);
			case BasicPackage.TPACKAGE__ALL_TYPES:
				return ((InternalEList<?>)getAllTypes()).basicRemove(otherEnd, msgs);
			case BasicPackage.TPACKAGE__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case BasicPackage.TPACKAGE__PARENT:
				return eInternalContainer().eInverseRemove(this, BasicPackage.TPACKAGE__SUBPACKAGES, TPackage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicPackage.TPACKAGE__SUBPACKAGES:
				return getSubpackages();
			case BasicPackage.TPACKAGE__PARENT:
				return getParent();
			case BasicPackage.TPACKAGE__CLASSES:
				return getClasses();
			case BasicPackage.TPACKAGE__INTERFACES:
				return getInterfaces();
			case BasicPackage.TPACKAGE__ALL_TYPES:
				return getAllTypes();
			case BasicPackage.TPACKAGE__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case BasicPackage.TPACKAGE__TNAME:
				return getTName();
			case BasicPackage.TPACKAGE__MODULES:
				return getModules();
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
			case BasicPackage.TPACKAGE__SUBPACKAGES:
				getSubpackages().clear();
				getSubpackages().addAll((Collection<? extends TPackage>)newValue);
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
			case BasicPackage.TPACKAGE__ALL_TYPES:
				getAllTypes().clear();
				getAllTypes().addAll((Collection<? extends TAbstractType>)newValue);
				return;
			case BasicPackage.TPACKAGE__MODEL:
				setModel((TypeGraph)newValue);
				return;
			case BasicPackage.TPACKAGE__TNAME:
				setTName((String)newValue);
				return;
			case BasicPackage.TPACKAGE__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends TModule>)newValue);
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
			case BasicPackage.TPACKAGE__SUBPACKAGES:
				getSubpackages().clear();
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
			case BasicPackage.TPACKAGE__ALL_TYPES:
				getAllTypes().clear();
				return;
			case BasicPackage.TPACKAGE__MODEL:
				setModel((TypeGraph)null);
				return;
			case BasicPackage.TPACKAGE__TNAME:
				setTName(TNAME_EDEFAULT);
				return;
			case BasicPackage.TPACKAGE__MODULES:
				getModules().clear();
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
			case BasicPackage.TPACKAGE__SUBPACKAGES:
				return subpackages != null && !subpackages.isEmpty();
			case BasicPackage.TPACKAGE__PARENT:
				return getParent() != null;
			case BasicPackage.TPACKAGE__CLASSES:
				return classes != null && !classes.isEmpty();
			case BasicPackage.TPACKAGE__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case BasicPackage.TPACKAGE__ALL_TYPES:
				return allTypes != null && !allTypes.isEmpty();
			case BasicPackage.TPACKAGE__MODEL:
				return model != null;
			case BasicPackage.TPACKAGE__TNAME:
				return TNAME_EDEFAULT == null ? tName != null : !TNAME_EDEFAULT.equals(tName);
			case BasicPackage.TPACKAGE__MODULES:
				return modules != null && !modules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
			case BasicPackage.TPACKAGE___CREATE_TCLASS__STRING_BOOLEAN_TVISIBILITY:
				return createTClass((String)arguments.get(0), (Boolean)arguments.get(1), (TVisibility)arguments.get(2));
			case BasicPackage.TPACKAGE___GET_TCLASS__STRING:
				return getTClass((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
} // TPackageImpl
