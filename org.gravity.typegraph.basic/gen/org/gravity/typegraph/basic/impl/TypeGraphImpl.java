/**
 */
package org.gravity.typegraph.basic.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAnnotationType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TDeclaredEntity;
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getOwnedTypes <em>Owned Types</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getTAnnotationTypes <em>TAnnotation Types</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getTName <em>TName</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getTDeclaredEntities <em>TDeclared Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeGraphImpl extends EObjectImpl implements TypeGraph {
	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<TPackage> packages;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethod> methods;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<TField> fields;

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
	 * The cached value of the '{@link #getOwnedTypes() <em>Owned Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TAbstractType> ownedTypes;

	/**
	 * The cached value of the '{@link #getTAnnotationTypes() <em>TAnnotation Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTAnnotationTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TAnnotationType> tAnnotationTypes;

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
	 * The cached value of the '{@link #getTDeclaredEntities() <em>TDeclared Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTDeclaredEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<TDeclaredEntity> tDeclaredEntities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TYPE_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TPackage> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentWithInverseEList<TPackage>(TPackage.class, this,
					BasicPackage.TYPE_GRAPH__PACKAGES, BasicPackage.TPACKAGE__PG);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMethod> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentWithInverseEList<TMethod>(TMethod.class, this,
					BasicPackage.TYPE_GRAPH__METHODS, BasicPackage.TMETHOD__PG);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentWithInverseEList<TField>(TField.class, this, BasicPackage.TYPE_GRAPH__FIELDS,
					BasicPackage.TFIELD__PG);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TClass> getClasses() {
		if (classes == null) {
			classes = new EObjectResolvingEList<TClass>(TClass.class, this, BasicPackage.TYPE_GRAPH__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TInterface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectResolvingEList<TInterface>(TInterface.class, this,
					BasicPackage.TYPE_GRAPH__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TAbstractType> getOwnedTypes() {
		if (ownedTypes == null) {
			ownedTypes = new EObjectContainmentWithInverseEList<TAbstractType>(TAbstractType.class, this,
					BasicPackage.TYPE_GRAPH__OWNED_TYPES, BasicPackage.TABSTRACT_TYPE__PG);
		}
		return ownedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TAnnotationType> getTAnnotationTypes() {
		if (tAnnotationTypes == null) {
			tAnnotationTypes = new EObjectResolvingEList<TAnnotationType>(TAnnotationType.class, this,
					BasicPackage.TYPE_GRAPH__TANNOTATION_TYPES);
		}
		return tAnnotationTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTName() {
		return tName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTName(String newTName) {
		String oldTName = tName;
		tName = newTName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TYPE_GRAPH__TNAME, oldTName, tName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TDeclaredEntity> getTDeclaredEntities() {
		if (tDeclaredEntities == null) {
			tDeclaredEntities = new EObjectContainmentWithInverseEList<TDeclaredEntity>(TDeclaredEntity.class, this,
					BasicPackage.TYPE_GRAPH__TDECLARED_ENTITIES, BasicPackage.TDECLARED_ENTITY__PG);
		}
		return tDeclaredEntities;
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
		case BasicPackage.TYPE_GRAPH__PACKAGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackages()).basicAdd(otherEnd, msgs);
		case BasicPackage.TYPE_GRAPH__METHODS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMethods()).basicAdd(otherEnd, msgs);
		case BasicPackage.TYPE_GRAPH__FIELDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFields()).basicAdd(otherEnd, msgs);
		case BasicPackage.TYPE_GRAPH__OWNED_TYPES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedTypes()).basicAdd(otherEnd, msgs);
		case BasicPackage.TYPE_GRAPH__TDECLARED_ENTITIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTDeclaredEntities()).basicAdd(otherEnd,
					msgs);
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
		case BasicPackage.TYPE_GRAPH__PACKAGES:
			return ((InternalEList<?>) getPackages()).basicRemove(otherEnd, msgs);
		case BasicPackage.TYPE_GRAPH__METHODS:
			return ((InternalEList<?>) getMethods()).basicRemove(otherEnd, msgs);
		case BasicPackage.TYPE_GRAPH__FIELDS:
			return ((InternalEList<?>) getFields()).basicRemove(otherEnd, msgs);
		case BasicPackage.TYPE_GRAPH__OWNED_TYPES:
			return ((InternalEList<?>) getOwnedTypes()).basicRemove(otherEnd, msgs);
		case BasicPackage.TYPE_GRAPH__TDECLARED_ENTITIES:
			return ((InternalEList<?>) getTDeclaredEntities()).basicRemove(otherEnd, msgs);
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
		case BasicPackage.TYPE_GRAPH__PACKAGES:
			return getPackages();
		case BasicPackage.TYPE_GRAPH__METHODS:
			return getMethods();
		case BasicPackage.TYPE_GRAPH__FIELDS:
			return getFields();
		case BasicPackage.TYPE_GRAPH__CLASSES:
			return getClasses();
		case BasicPackage.TYPE_GRAPH__INTERFACES:
			return getInterfaces();
		case BasicPackage.TYPE_GRAPH__OWNED_TYPES:
			return getOwnedTypes();
		case BasicPackage.TYPE_GRAPH__TANNOTATION_TYPES:
			return getTAnnotationTypes();
		case BasicPackage.TYPE_GRAPH__TNAME:
			return getTName();
		case BasicPackage.TYPE_GRAPH__TDECLARED_ENTITIES:
			return getTDeclaredEntities();
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
		case BasicPackage.TYPE_GRAPH__PACKAGES:
			getPackages().clear();
			getPackages().addAll((Collection<? extends TPackage>) newValue);
			return;
		case BasicPackage.TYPE_GRAPH__METHODS:
			getMethods().clear();
			getMethods().addAll((Collection<? extends TMethod>) newValue);
			return;
		case BasicPackage.TYPE_GRAPH__FIELDS:
			getFields().clear();
			getFields().addAll((Collection<? extends TField>) newValue);
			return;
		case BasicPackage.TYPE_GRAPH__CLASSES:
			getClasses().clear();
			getClasses().addAll((Collection<? extends TClass>) newValue);
			return;
		case BasicPackage.TYPE_GRAPH__INTERFACES:
			getInterfaces().clear();
			getInterfaces().addAll((Collection<? extends TInterface>) newValue);
			return;
		case BasicPackage.TYPE_GRAPH__OWNED_TYPES:
			getOwnedTypes().clear();
			getOwnedTypes().addAll((Collection<? extends TAbstractType>) newValue);
			return;
		case BasicPackage.TYPE_GRAPH__TANNOTATION_TYPES:
			getTAnnotationTypes().clear();
			getTAnnotationTypes().addAll((Collection<? extends TAnnotationType>) newValue);
			return;
		case BasicPackage.TYPE_GRAPH__TNAME:
			setTName((String) newValue);
			return;
		case BasicPackage.TYPE_GRAPH__TDECLARED_ENTITIES:
			getTDeclaredEntities().clear();
			getTDeclaredEntities().addAll((Collection<? extends TDeclaredEntity>) newValue);
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
		case BasicPackage.TYPE_GRAPH__PACKAGES:
			getPackages().clear();
			return;
		case BasicPackage.TYPE_GRAPH__METHODS:
			getMethods().clear();
			return;
		case BasicPackage.TYPE_GRAPH__FIELDS:
			getFields().clear();
			return;
		case BasicPackage.TYPE_GRAPH__CLASSES:
			getClasses().clear();
			return;
		case BasicPackage.TYPE_GRAPH__INTERFACES:
			getInterfaces().clear();
			return;
		case BasicPackage.TYPE_GRAPH__OWNED_TYPES:
			getOwnedTypes().clear();
			return;
		case BasicPackage.TYPE_GRAPH__TANNOTATION_TYPES:
			getTAnnotationTypes().clear();
			return;
		case BasicPackage.TYPE_GRAPH__TNAME:
			setTName(TNAME_EDEFAULT);
			return;
		case BasicPackage.TYPE_GRAPH__TDECLARED_ENTITIES:
			getTDeclaredEntities().clear();
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
		case BasicPackage.TYPE_GRAPH__PACKAGES:
			return packages != null && !packages.isEmpty();
		case BasicPackage.TYPE_GRAPH__METHODS:
			return methods != null && !methods.isEmpty();
		case BasicPackage.TYPE_GRAPH__FIELDS:
			return fields != null && !fields.isEmpty();
		case BasicPackage.TYPE_GRAPH__CLASSES:
			return classes != null && !classes.isEmpty();
		case BasicPackage.TYPE_GRAPH__INTERFACES:
			return interfaces != null && !interfaces.isEmpty();
		case BasicPackage.TYPE_GRAPH__OWNED_TYPES:
			return ownedTypes != null && !ownedTypes.isEmpty();
		case BasicPackage.TYPE_GRAPH__TANNOTATION_TYPES:
			return tAnnotationTypes != null && !tAnnotationTypes.isEmpty();
		case BasicPackage.TYPE_GRAPH__TNAME:
			return TNAME_EDEFAULT == null ? tName != null : !TNAME_EDEFAULT.equals(tName);
		case BasicPackage.TYPE_GRAPH__TDECLARED_ENTITIES:
			return tDeclaredEntities != null && !tDeclaredEntities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tName: ");
		result.append(tName);
		result.append(')');
		return result.toString();
	}

} //TypeGraphImpl
