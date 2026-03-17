/**
 */
package org.gravity.typegraph.basic.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
// <-- [user defined imports]
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TModule;
import org.gravity.typegraph.basic.TName;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotationType;
import org.gravity.typegraph.basic.annotations.impl.TAnnotatableImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Type
 * Graph</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getTName
 * <em>TName</em>}</li>
 * <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getPackages
 * <em>Packages</em>}</li>
 * <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getMethods
 * <em>Methods</em>}</li>
 * <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getFields
 * <em>Fields</em>}</li>
 * <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getClasses
 * <em>Classes</em>}</li>
 * <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getInterfaces
 * <em>Interfaces</em>}</li>
 * <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getAnnotationTypes
 * <em>Annotation Types</em>}</li>
 * <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getAllTypes <em>All
 * Types</em>}</li>
 * <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getModules
 * <em>Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeGraphImpl extends TAnnotatableImpl implements TypeGraph {
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
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<TPackage> packages;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethod> methods;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<TField> fields;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<TClass> classes;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<TInterface> interfaces;

	/**
	 * The cached value of the '{@link #getAnnotationTypes() <em>Annotation
	 * Types</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getAnnotationTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TAnnotationType> annotationTypes;

	/**
	 * The cached value of the '{@link #getAllTypes() <em>All Types</em>}' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getAllTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TAbstractType> allTypes;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<TModule> modules;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TypeGraphImpl() {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TYPE_GRAPH;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<TPackage> getPackages() {
		if (this.packages == null) {
			this.packages = new EObjectContainmentEList<>(TPackage.class, this,
					BasicPackage.TYPE_GRAPH__PACKAGES);
		}
		return this.packages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<TMethod> getMethods() {
		if (this.methods == null) {
			this.methods = new EObjectContainmentWithInverseEList<>(TMethod.class, this,
					BasicPackage.TYPE_GRAPH__METHODS, BasicPackage.TMETHOD__MODEL);
		}
		return this.methods;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<TField> getFields() {
		if (this.fields == null) {
			this.fields = new EObjectContainmentWithInverseEList<>(TField.class, this,
					BasicPackage.TYPE_GRAPH__FIELDS, BasicPackage.TFIELD__MODEL);
		}
		return this.fields;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<TClass> getClasses() {
		if (this.classes == null) {
			this.classes = new EObjectResolvingEList<>(TClass.class, this, BasicPackage.TYPE_GRAPH__CLASSES);
		}
		return this.classes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<TInterface> getInterfaces() {
		if (this.interfaces == null) {
			this.interfaces = new EObjectResolvingEList<>(TInterface.class, this,
					BasicPackage.TYPE_GRAPH__INTERFACES);
		}
		return this.interfaces;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<TAnnotationType> getAnnotationTypes() {
		if (this.annotationTypes == null) {
			this.annotationTypes = new EObjectResolvingEList<>(TAnnotationType.class, this,
					BasicPackage.TYPE_GRAPH__ANNOTATION_TYPES);
		}
		return this.annotationTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<TAbstractType> getAllTypes() {
		if (this.allTypes == null) {
			this.allTypes = new EObjectWithInverseResolvingEList<>(TAbstractType.class, this,
					BasicPackage.TYPE_GRAPH__ALL_TYPES, BasicPackage.TABSTRACT_TYPE__MODEL);
		}
		return this.allTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getTName() {
		return this.tName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setTName(final String newTName) {
		final var oldTName = this.tName;
		this.tName = newTName;
		if (this.eNotificationRequired()) {
			this.eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TYPE_GRAPH__TNAME, oldTName,
					this.tName));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<TModule> getModules() {
		if (this.modules == null) {
			this.modules = new EObjectContainmentEList<>(TModule.class, this, BasicPackage.TYPE_GRAPH__MODULES);
		}
		return this.modules;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<TClass> getDeclaredTClasses() {
		// [user code injected with eMoflon]
		final EList<TClass> declaredClasses = new BasicEList<>();
		for (final TClass tClass : this.getClasses()) {
			if (tClass.isDeclared()) {
				declaredClasses.add(tClass);
			}
		}
		return declaredClasses;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public String toString() {
		// [user code injected with eMoflon]
		return super.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID,
			final NotificationChain msgs) {
		switch (featureID) {
			case BasicPackage.TYPE_GRAPH__METHODS:
				return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getMethods()).basicAdd(otherEnd, msgs);
			case BasicPackage.TYPE_GRAPH__FIELDS:
				return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getFields()).basicAdd(otherEnd, msgs);
			case BasicPackage.TYPE_GRAPH__ALL_TYPES:
				return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getAllTypes()).basicAdd(otherEnd,
						msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
			final NotificationChain msgs) {
		switch (featureID) {
			case BasicPackage.TYPE_GRAPH__PACKAGES:
				return ((InternalEList<?>) this.getPackages()).basicRemove(otherEnd, msgs);
			case BasicPackage.TYPE_GRAPH__METHODS:
				return ((InternalEList<?>) this.getMethods()).basicRemove(otherEnd, msgs);
			case BasicPackage.TYPE_GRAPH__FIELDS:
				return ((InternalEList<?>) this.getFields()).basicRemove(otherEnd, msgs);
			case BasicPackage.TYPE_GRAPH__ALL_TYPES:
				return ((InternalEList<?>) this.getAllTypes()).basicRemove(otherEnd, msgs);
			case BasicPackage.TYPE_GRAPH__MODULES:
				return ((InternalEList<?>) this.getModules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
			case BasicPackage.TYPE_GRAPH__TNAME:
				return this.getTName();
			case BasicPackage.TYPE_GRAPH__PACKAGES:
				return this.getPackages();
			case BasicPackage.TYPE_GRAPH__METHODS:
				return this.getMethods();
			case BasicPackage.TYPE_GRAPH__FIELDS:
				return this.getFields();
			case BasicPackage.TYPE_GRAPH__CLASSES:
				return this.getClasses();
			case BasicPackage.TYPE_GRAPH__INTERFACES:
				return this.getInterfaces();
			case BasicPackage.TYPE_GRAPH__ANNOTATION_TYPES:
				return this.getAnnotationTypes();
			case BasicPackage.TYPE_GRAPH__ALL_TYPES:
				return this.getAllTypes();
			case BasicPackage.TYPE_GRAPH__MODULES:
				return this.getModules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
			case BasicPackage.TYPE_GRAPH__TNAME:
				this.setTName((String) newValue);
				return;
			case BasicPackage.TYPE_GRAPH__PACKAGES:
				this.getPackages().clear();
				this.getPackages().addAll((Collection<? extends TPackage>) newValue);
				return;
			case BasicPackage.TYPE_GRAPH__METHODS:
				this.getMethods().clear();
				this.getMethods().addAll((Collection<? extends TMethod>) newValue);
				return;
			case BasicPackage.TYPE_GRAPH__FIELDS:
				this.getFields().clear();
				this.getFields().addAll((Collection<? extends TField>) newValue);
				return;
			case BasicPackage.TYPE_GRAPH__CLASSES:
				this.getClasses().clear();
				this.getClasses().addAll((Collection<? extends TClass>) newValue);
				return;
			case BasicPackage.TYPE_GRAPH__INTERFACES:
				this.getInterfaces().clear();
				this.getInterfaces().addAll((Collection<? extends TInterface>) newValue);
				return;
			case BasicPackage.TYPE_GRAPH__ANNOTATION_TYPES:
				this.getAnnotationTypes().clear();
				this.getAnnotationTypes().addAll((Collection<? extends TAnnotationType>) newValue);
				return;
			case BasicPackage.TYPE_GRAPH__ALL_TYPES:
				this.getAllTypes().clear();
				this.getAllTypes().addAll((Collection<? extends TAbstractType>) newValue);
				return;
			case BasicPackage.TYPE_GRAPH__MODULES:
				this.getModules().clear();
				this.getModules().addAll((Collection<? extends TModule>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(final int featureID) {
		switch (featureID) {
			case BasicPackage.TYPE_GRAPH__TNAME:
				this.setTName(TNAME_EDEFAULT);
				return;
			case BasicPackage.TYPE_GRAPH__PACKAGES:
				this.getPackages().clear();
				return;
			case BasicPackage.TYPE_GRAPH__METHODS:
				this.getMethods().clear();
				return;
			case BasicPackage.TYPE_GRAPH__FIELDS:
				this.getFields().clear();
				return;
			case BasicPackage.TYPE_GRAPH__CLASSES:
				this.getClasses().clear();
				return;
			case BasicPackage.TYPE_GRAPH__INTERFACES:
				this.getInterfaces().clear();
				return;
			case BasicPackage.TYPE_GRAPH__ANNOTATION_TYPES:
				this.getAnnotationTypes().clear();
				return;
			case BasicPackage.TYPE_GRAPH__ALL_TYPES:
				this.getAllTypes().clear();
				return;
			case BasicPackage.TYPE_GRAPH__MODULES:
				this.getModules().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
			case BasicPackage.TYPE_GRAPH__TNAME:
				return TNAME_EDEFAULT == null ? this.tName != null : !TNAME_EDEFAULT.equals(this.tName);
			case BasicPackage.TYPE_GRAPH__PACKAGES:
				return this.packages != null && !this.packages.isEmpty();
			case BasicPackage.TYPE_GRAPH__METHODS:
				return this.methods != null && !this.methods.isEmpty();
			case BasicPackage.TYPE_GRAPH__FIELDS:
				return this.fields != null && !this.fields.isEmpty();
			case BasicPackage.TYPE_GRAPH__CLASSES:
				return this.classes != null && !this.classes.isEmpty();
			case BasicPackage.TYPE_GRAPH__INTERFACES:
				return this.interfaces != null && !this.interfaces.isEmpty();
			case BasicPackage.TYPE_GRAPH__ANNOTATION_TYPES:
				return this.annotationTypes != null && !this.annotationTypes.isEmpty();
			case BasicPackage.TYPE_GRAPH__ALL_TYPES:
				return this.allTypes != null && !this.allTypes.isEmpty();
			case BasicPackage.TYPE_GRAPH__MODULES:
				return this.modules != null && !this.modules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BasicPackage.TYPE_GRAPH___GET_DECLARED_TCLASSES:
				return this.getDeclaredTClasses();
			case BasicPackage.TYPE_GRAPH___TO_STRING:
				return this.toString();
			case BasicPackage.TYPE_GRAPH___GET_PACKAGE__STRING:
				return this.getPackage((String) arguments.get(0));
			case BasicPackage.TYPE_GRAPH___GET_PACKAGE__ELIST:
				return this.getPackage((EList<String>) arguments.get(0));
			case BasicPackage.TYPE_GRAPH___GET_CLASS__STRING:
				return this.getClass((String) arguments.get(0));
			case BasicPackage.TYPE_GRAPH___GET_INTERFACE__STRING:
				return this.getInterface((String) arguments.get(0));
			case BasicPackage.TYPE_GRAPH___GET_METHOD__STRING:
				return this.getMethod((String) arguments.get(0));
			case BasicPackage.TYPE_GRAPH___GET_FIELD__STRING:
				return this.getField((String) arguments.get(0));
			case BasicPackage.TYPE_GRAPH___GET_SIGNATURE__STRING:
				return this.getSignature((String) arguments.get(0));
			case BasicPackage.TYPE_GRAPH___GET_FIELD_SIGNATURE__STRING:
				return this.getFieldSignature((String) arguments.get(0));
			case BasicPackage.TYPE_GRAPH___GET_METHOD_SIGNATURE__STRING:
				return this.getMethodSignature((String) arguments.get(0));
			case BasicPackage.TYPE_GRAPH___GET_DEFINITION__STRING:
				return this.getDefinition((String) arguments.get(0));
			case BasicPackage.TYPE_GRAPH___GET_FIELD_DEFINITION__STRING:
				return this.getFieldDefinition((String) arguments.get(0));
			case BasicPackage.TYPE_GRAPH___GET_METHOD_DEFINITION__STRING:
				return this.getMethodDefinition((String) arguments.get(0));
			case BasicPackage.TYPE_GRAPH___CREATE_PACKAGE__STRING:
				return this.createPackage((String) arguments.get(0));
			case BasicPackage.TYPE_GRAPH___CREATE_TCLASS__STRING_STRING_BOOLEAN_TVISIBILITY:
				return this.createTClass((String) arguments.get(0), (String) arguments.get(1),
						(Boolean) arguments.get(2),
						(TVisibility) arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TPackage getPackage(final String namespace) {
		return this.getPackage(namespace.split("\\."));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TPackage getPackage(final EList<String> namespace) {
		return this.getPackage((List<String>) namespace);
	}

	public TPackage getPackage(final List<String> namespace) {
		var next = this.getPackages();
		for (var i = 0; i < namespace.size(); i++) {
			final var name = namespace.get(i);
			var contains = false;
			for (final TPackage tPackage : next) {
				if (name.equals(tPackage.getTName())) {
					if (i == namespace.size()) {
						return tPackage;
					}
					next = tPackage.getSubpackages();
					contains = true;
					break;
				}
			}
			if (!contains) {
				return null;
			}
		}
		return null;
	}

	@Override
	public TPackage getPackage(final String[] namespace) {
		var next = this.getPackages();
		for (var i = 0; i < namespace.length; i++) {
			final var name = namespace[i];
			var contains = false;
			for (final TPackage tPackage : next) {
				if (name.equals(tPackage.getTName())) {
					if (i == (namespace.length - 1)) {
						return tPackage;
					}
					next = tPackage.getSubpackages();
					contains = true;
					break;
				}
			}
			if (!contains) {
				return null;
			}
		}
		return null;
	}

	@Override
	public TClass getClass(final String fullyQualifiedName) {
		final var index = fullyQualifiedName.lastIndexOf('.');
		var defaultPackage = "default";
		if (index > 0) {
			defaultPackage = fullyQualifiedName.substring(0, index);
		}
		final var tPackage = this.getPackage(defaultPackage);
		if (tPackage != null) {
			final var name = fullyQualifiedName.substring(index + 1);
			for (final TClass tType : tPackage.getClasses()) {
				if (tType.getTName().equals(name) || tType.getTName().contentEquals(fullyQualifiedName)) {
					return tType;
				}
			}
		} else {
			final var name = fullyQualifiedName.substring(index + 1);
			for (final TClass tType : this.getClasses()) {
				if (tType.getTName().equals(name) || tType.getTName().contentEquals(fullyQualifiedName)) {
					return tType;
				}
			}
		}
		return null;
	}

	@Override
	public TInterface getInterface(final String fullyQualifiedName) {
		final var index = fullyQualifiedName.lastIndexOf('.');
		var defaultPackage = "default";
		if (index > 0) {
			defaultPackage = fullyQualifiedName.substring(0, index);
		}
		final var tPackage = this.getPackage(defaultPackage);
		if (tPackage != null) {
			final var name = fullyQualifiedName.substring(index + 1);
			for (final TInterface tType : tPackage.getInterfaces()) {
				if (tType.getTName().equals(name) || tType.getTName().contentEquals(fullyQualifiedName)) {
					return tType;
				}
			}
		}
		return null;
	}

	@Override
	public TAbstractType getType(final String fullyQualifiedName) {
		final var index = fullyQualifiedName.lastIndexOf('.');
		var defaultPackage = "(default package)";
		if (index > 0) {
			defaultPackage = fullyQualifiedName.substring(0, index);
		}
		final var name = fullyQualifiedName.substring(index + 1);
		final var tPackage = this.getPackage(defaultPackage);
		if (tPackage != null) {
			TAbstractType type = null;
			for (final TAbstractType tType : tPackage.getAllTypes()) {
				if (tType.getTName().equals(name)) {
					type = tType;
					break;
				}
			}
			if (type != null) {
				return type;
			}
		}
		if (index == -1) {
			return this.getAllTypes().parallelStream()
					.filter(t -> t.getPackage() == null && t.getTName().equals(fullyQualifiedName)).findAny()
					.orElse(null);
		}
		return null;
	}

	/**
	 * Searches the method with the given name
	 *
	 * @param name The desired name
	 * @return The method or null if there is no element with the desired name
	 */
	@Override
	public TMethod getMethod(final String name) {
		return (TMethod) this.getElementByName(name, this.getMethods().parallelStream());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TField getField(final String name) {
		return (TField) this.getElementByName(name, this.getFields().parallelStream());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TSignature getSignature(final String signature) {
		final String typeName;
		final var colonIndex = signature.indexOf(':');
		if (colonIndex >= 0) {
			typeName = signature.substring(colonIndex + 1).trim();
		} else {
			typeName = "void";
		}
		final var isArray = typeName.indexOf('[') >= 0;
		final String finalTypeName;
		if (isArray) {
			finalTypeName = typeName.substring(0, typeName.indexOf('['));
		} else {
			finalTypeName = typeName;
		}
		TAbstractType type;
		if (typeName.contains(".")) {
			type = this.getType(typeName);
		} else {
			type = this.getAllTypes().parallelStream().filter(element -> finalTypeName.equals(element.getTName()))
					.findAny().orElse(null);
		}
		final var openBraceIndex = signature.lastIndexOf('(');
		if (openBraceIndex < 0) {
			final var name = signature.substring(0, colonIndex);
			return this.getFieldSignature(name, type, isArray);
		}
		var name = signature.substring(0, openBraceIndex).trim();
		final var dotIndex = name.lastIndexOf('.');
		if (dotIndex >= 0) {
			name = name.substring(dotIndex + 1);
		}
		final var method = this.getMethod(name);
		if (method == null) {
			return null;
		}
		final var closeBraceIndex = signature.lastIndexOf(')');
		final var paramString = signature.substring(openBraceIndex + 1, closeBraceIndex).trim();
		final String[] params;
		if (paramString.length() > 0) {
			params = paramString.split("\\s*,\\s*");
		} else {
			params = new String[0];
		}
		return this.getMethodSignature(method, type, isArray, params);
	}

	/**
	 * Searches a fitting method signature
	 *
	 * @param method              For this method name
	 * @param returnType          Returning this type
	 * @param returnsArray        Whether an array is returned
	 * @param parameterSignatures The signatures of the parameters
	 * @return The method signature
	 */
	private TSignature getMethodSignature(final TMethod method, final TAbstractType returnType,
			final boolean returnsArray, final String[] parameterSignatures) {
		for (final TMethodSignature methodSignature : method.getSignatures()) {
			final var parameterList = methodSignature.getParameters();
			if (parameterList.size() != parameterSignatures.length) {
				continue;
			}
			var equal = true;
			var tParameter = methodSignature.getFirstParameter();
			for (final String parameterTypeName : parameterSignatures) {
				equal &= this.equals(parameterTypeName, tParameter);
				if (!equal) {
					break;
				}
				tParameter = tParameter.getNext();
			}
			final var siganturesReturnType = methodSignature.getReturnType();
			if (equal && ((siganturesReturnType == null) || (returnType == siganturesReturnType))
					&& (methodSignature.isArray() == returnsArray)) {
				return methodSignature;
			}
		}
		return null;
	}

	/**
	 * Checks if the given parameter signature describes the parameter
	 *
	 * @param signature A parameter signature
	 * @param parameter A parameter
	 * @return true, if the parameter is described by the given signature
	 */
	private boolean equals(final String signature, final TParameter parameter) {
		String other;
		if (signature.contains(".")) {
			other = parameter.getType().getFullyQualifiedName();
		} else {
			other = parameter.getType().getTName();
		}
		final var open = signature.indexOf('[');
		final var paramIsArray = open >= 0;
		String name;
		if (paramIsArray) {
			name = signature.substring(0, open);
		} else {
			name = signature;
		}
		return name.equals(other) && (paramIsArray == parameter.isArray());
	}

	/**
	 * Searches the field with the given type and name
	 *
	 * @param name  The name of the field
	 * @param type  The type of the field
	 * @param array If the field is an array
	 * @return the signature of the field
	 */
	private TSignature getFieldSignature(final String name, final TAbstractType type, final boolean array) {
		return this.getField(name).getSignatures().parallelStream()
				.filter(element -> type.equals(element.getType()) && (array == element.isArray())).findAny()
				.orElse(null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TFieldSignature getFieldSignature(final String signature) {
		final var sig = this.getSignature(signature);
		return sig instanceof TFieldDefinition ? (TFieldSignature) sig : null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TMethodSignature getMethodSignature(final String signature) {
		final var sig = this.getSignature(signature);
		return sig instanceof TMethodSignature ? (TMethodSignature) sig : null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TMember getDefinition(final String signature) {
		final var index = signature.indexOf('(');
		if (index < 0) {
			return this.getFieldDefinition(signature);
		}
		return this.getMethodDefinition(signature);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TFieldDefinition getFieldDefinition(final String signature) {
		final var index = signature.lastIndexOf('.', signature.indexOf(':'));
		final var fieldSig = this.getFieldSignature(signature.substring(index + 1));
		final var type = this.getType(signature.substring(0, index));
		return type.getDefines().parallelStream().filter(member -> member.getSignature().equals(fieldSig))
				.map(TFieldDefinition.class::cast).findAny().orElse(null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TMethodDefinition getMethodDefinition(final String signature) {
		final var index = signature.lastIndexOf('.', signature.lastIndexOf('('));
		if (index < 0) {
			return null;
		}
		final var methodSig = this.getMethodSignature(signature.substring(index + 1));
		final var type = this.getType(signature.substring(0, index));
		if (type == null) {
			return null;
		}
		return type.getDefines().parallelStream().filter(member -> member.getSignature().equals(methodSig))
				.map(TMethodDefinition.class::cast).findAny().orElse(null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TPackage createPackage(final String namespace) {
		final var names = namespace.split("\\.");
		var i = 0;
		TPackage currentPackage = null;
		List<TPackage> subPackages = this.getPackages();
		for (; i < names.length; i++) {
			final var packageName = names[i];
			final var match = subPackages.parallelStream().filter(n -> packageName.equals(n.getTName())).findAny();
			if (!match.isPresent()) {
				break;
			}
			currentPackage = match.get();
			subPackages = currentPackage.getSubpackages();
		}
		for (; i < names.length; i++) {
			final var nextPackage = BasicFactory.eINSTANCE.createTPackage();
			nextPackage.setTName(names[i]);
			if (i == 0) {
				this.getPackages().add(nextPackage);
			} else {
				nextPackage.setParent(currentPackage);
			}
			nextPackage.setModel(this);
			currentPackage = nextPackage;
		}
		return currentPackage;
	}

	/**
	 * <!-- begin-user-doc --> Creates a class in the program model
	 *
	 * @param namespace  The namespace to which the class should be added
	 * @param name       The name of the new class
	 * @param visibility the visibility of the generated class
	 * @param lib        Whether the class is from a lib or used code
	 * @return The generated class <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public TClass createTClass(String namespace, final String name, final boolean lib, final TVisibility visibility) {
		TPackage p;
		if (namespace == null) {
			namespace = "(default package)";
		}
		p = this.getPackage(namespace);
		if (p == null) {
			p = this.createPackage(namespace);
		}
		return p.createTClass(name, lib, visibility);
	}

	/**
	 * Searches in the stream for the element with the given name
	 *
	 * @param name   The desired name
	 * @param stream The elements
	 * @return The searched element or null if there is no element with the desired
	 *         name
	 */
	private TName getElementByName(final String name, final Stream<? extends TName> stream) {
		return stream.filter(m -> name.equals(m.getTName())).findAny().orElse(null);
	}
} // TypeGraphImpl
