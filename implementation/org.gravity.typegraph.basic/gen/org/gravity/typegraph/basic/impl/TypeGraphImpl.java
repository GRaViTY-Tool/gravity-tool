/**
 */
package org.gravity.typegraph.basic.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.stream.Stream;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
// <-- [user defined imports]
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TName;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TSignature;
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
 *   <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getOwnedTypes <em>Owned Types</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getTAnnotationTypes <em>TAnnotation Types</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getTName <em>TName</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeGraphImpl extends TAnnotatableImpl implements TypeGraph {
	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<TPackage> packages;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethod> methods;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<TField> fields;

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
	 * The cached value of the '{@link #getOwnedTypes() <em>Owned Types</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOwnedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TAbstractType> ownedTypes;

	/**
	 * The cached value of the '{@link #getTAnnotationTypes() <em>TAnnotation Types</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTAnnotationTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TAnnotationType> tAnnotationTypes;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TYPE_GRAPH;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TPackage> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentWithInverseEList<TPackage>(TPackage.class, this, BasicPackage.TYPE_GRAPH__PACKAGES, BasicPackage.TPACKAGE__PG);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TMethod> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentWithInverseEList<TMethod>(TMethod.class, this, BasicPackage.TYPE_GRAPH__METHODS, BasicPackage.TMETHOD__PG);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentWithInverseEList<TField>(TField.class, this, BasicPackage.TYPE_GRAPH__FIELDS, BasicPackage.TFIELD__PG);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TClass> getClasses() {
		if (classes == null) {
			classes = new EObjectResolvingEList<TClass>(TClass.class, this, BasicPackage.TYPE_GRAPH__CLASSES);
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
			interfaces = new EObjectResolvingEList<TInterface>(TInterface.class, this, BasicPackage.TYPE_GRAPH__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAbstractType> getOwnedTypes() {
		if (ownedTypes == null) {
			ownedTypes = new EObjectContainmentWithInverseEList<TAbstractType>(TAbstractType.class, this, BasicPackage.TYPE_GRAPH__OWNED_TYPES, BasicPackage.TABSTRACT_TYPE__PG);
		}
		return ownedTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAnnotationType> getTAnnotationTypes() {
		if (tAnnotationTypes == null) {
			tAnnotationTypes = new EObjectResolvingEList<TAnnotationType>(TAnnotationType.class, this, BasicPackage.TYPE_GRAPH__TANNOTATION_TYPES);
		}
		return tAnnotationTypes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TYPE_GRAPH__TNAME, oldTName, tName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<TClass> getDeclaredTClasses() {
		// [user code injected with eMoflon]
		final EList<TClass> classes = new BasicEList<>();
		for (final TClass tClass : getClasses()) {
			if (tClass.isDeclared()) {
				classes.add(tClass);
			}
		}
		return classes;
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
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicPackage.TYPE_GRAPH__PACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackages()).basicAdd(otherEnd, msgs);
			case BasicPackage.TYPE_GRAPH__METHODS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethods()).basicAdd(otherEnd, msgs);
			case BasicPackage.TYPE_GRAPH__FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFields()).basicAdd(otherEnd, msgs);
			case BasicPackage.TYPE_GRAPH__OWNED_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedTypes()).basicAdd(otherEnd, msgs);
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
			case BasicPackage.TYPE_GRAPH__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case BasicPackage.TYPE_GRAPH__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case BasicPackage.TYPE_GRAPH__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case BasicPackage.TYPE_GRAPH__OWNED_TYPES:
				return ((InternalEList<?>)getOwnedTypes()).basicRemove(otherEnd, msgs);
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
			case BasicPackage.TYPE_GRAPH__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends TPackage>)newValue);
				return;
			case BasicPackage.TYPE_GRAPH__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends TMethod>)newValue);
				return;
			case BasicPackage.TYPE_GRAPH__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends TField>)newValue);
				return;
			case BasicPackage.TYPE_GRAPH__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends TClass>)newValue);
				return;
			case BasicPackage.TYPE_GRAPH__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends TInterface>)newValue);
				return;
			case BasicPackage.TYPE_GRAPH__OWNED_TYPES:
				getOwnedTypes().clear();
				getOwnedTypes().addAll((Collection<? extends TAbstractType>)newValue);
				return;
			case BasicPackage.TYPE_GRAPH__TANNOTATION_TYPES:
				getTAnnotationTypes().clear();
				getTAnnotationTypes().addAll((Collection<? extends TAnnotationType>)newValue);
				return;
			case BasicPackage.TYPE_GRAPH__TNAME:
				setTName((String)newValue);
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
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BasicPackage.TYPE_GRAPH___GET_DECLARED_TCLASSES:
				return getDeclaredTClasses();
			case BasicPackage.TYPE_GRAPH___TO_STRING:
				return toString();
			case BasicPackage.TYPE_GRAPH___GET_PACKAGE__STRING:
				return getPackage((String)arguments.get(0));
			case BasicPackage.TYPE_GRAPH___GET_PACKAGE__ELIST:
				return getPackage((EList<String>)arguments.get(0));
			case BasicPackage.TYPE_GRAPH___GET_CLASS__STRING:
				return getClass((String)arguments.get(0));
			case BasicPackage.TYPE_GRAPH___GET_INTERFACE__STRING:
				return getInterface((String)arguments.get(0));
			case BasicPackage.TYPE_GRAPH___GET_METHOD__STRING:
				return getMethod((String)arguments.get(0));
			case BasicPackage.TYPE_GRAPH___GET_FIELD__STRING:
				return getField((String)arguments.get(0));
			case BasicPackage.TYPE_GRAPH___GET_SIGNATURE__STRING:
				return getSignature((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TPackage getPackage(String namespace) {
		return getPackage(namespace.split("\\."));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TPackage getPackage(EList<String> namespace) {
		EList<TPackage> next = getPackages();
		for (int i = 0; i < namespace.size();) {
			final String name = namespace.get(i++);
			boolean contains = false;
			for (final TPackage tPackage : next) {
				if (name.equals(tPackage.getTName())) {
					if (i == namespace.size()) {
						return tPackage;
					}
					next = tPackage.getSubpackage();
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
	public TPackage getPackage(String[] namespace) {
		EList<TPackage> next = getPackages();
		for (int i = 0; i < namespace.length;) {
			final String name = namespace[i++];
			boolean contains = false;
			for (final TPackage tPackage : next) {
				if (name.equals(tPackage.getTName())) {
					if (i == namespace.length) {
						return tPackage;
					}
					next = tPackage.getSubpackage();
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
	public TClass getClass(String fullyQualifiedName) {
		final int index = fullyQualifiedName.lastIndexOf('.');
		String defaultPackage = "default";
		if (index > 0) {
			defaultPackage = fullyQualifiedName.substring(0, index);
		}
		final TPackage tPackage = getPackage(defaultPackage);
		if (tPackage != null) {
			final String name = fullyQualifiedName.substring(index + 1);
			for (final TClass tType : tPackage.getClasses()) {
				if (tType.getTName().equals(name) || tType.getTName().contentEquals(fullyQualifiedName)) {
					return tType;
				}
			}
		} else {
			final String name = fullyQualifiedName.substring(index + 1);
			for (final TClass tType : getClasses()) {
				if (tType.getTName().equals(name) || tType.getTName().contentEquals(fullyQualifiedName)) {
					return tType;
				}
			}
		}
		return null;
	}

	@Override
	public TInterface getInterface(String fullyQualifiedName) {
		final int index = fullyQualifiedName.lastIndexOf('.');
		String defaultPackage = "default";
		if (index > 0) {
			defaultPackage = fullyQualifiedName.substring(0, index);
		}
		final TPackage tPackage = getPackage(defaultPackage);
		if (tPackage != null) {
			final String name = fullyQualifiedName.substring(index + 1);
			for (final TInterface tType : tPackage.getInterfaces()) {
				if (tType.getTName().equals(name) || tType.getTName().contentEquals(fullyQualifiedName)) {
					return tType;
				}
			}
		}
		return null;
	}

	@Override
	public TAbstractType getType(String fullyQualifiedName) {
		final int index = fullyQualifiedName.lastIndexOf('.');
		String defaultPackage = "default";
		if (index > 0) {
			defaultPackage = fullyQualifiedName.substring(0, index);
		}
		final String name = fullyQualifiedName.substring(index + 1);
		final TPackage tPackage = getPackage(defaultPackage);
		if (tPackage != null) {
			for (final TAbstractType tType : tPackage.getOwnedTypes()) {
				if (tType.getTName().equals(name) || tType.getTName().contentEquals(fullyQualifiedName)) {
					return tType;
				}
			}
		}
		return getOwnedTypes().parallelStream()
				.filter(type -> type.getPackage() == null && type.getTName().equals(name)).findAny().orElse(null);
	}

	/**
	 * Searches the method with the given name
	 *
	 * @param name The desired name
	 * @return The method or null if there is no element with the desired name
	 */
	@Override
	public TMethod getMethod(String name) {
		return (TMethod) getElementByName(name, getMethods().parallelStream());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TField getField(String name) {
		return (TField) getElementByName(name, getFields().parallelStream());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TSignature getSignature(String signature) {
		final String typeName;
		final int colonIndex = signature.indexOf(':');
		if (colonIndex >= 0) {
			typeName = signature.substring(colonIndex + 1).trim();
		} else {
			typeName = "void";
		}
		TAbstractType type;
		if (typeName.contains(".")) {
			type = getType(typeName);
		} else {
			type = getOwnedTypes().parallelStream().filter(element -> element.getTName().equals(typeName)).findAny()
					.orElse(null);
		}
		final int openBraceIndex = signature.indexOf('(');
		if (openBraceIndex < 0) {
			return getField(signature.substring(0, colonIndex)).getSignatures().parallelStream()
					.filter(element -> type.equals(element.getType())).findAny().orElse(null);
		}
		String name = signature.substring(0, openBraceIndex).trim();
		final int dotIndex = name.lastIndexOf('.');
		if(dotIndex >= 0) {
			name = name.substring(dotIndex +1);
		}
		final TMethod method = getMethod(name);
		final int closeBraceIndex = signature.indexOf(')');
		final String paramString = signature.substring(openBraceIndex + 1, closeBraceIndex).trim();
		final String[] params;
		if(paramString.length() > 0) {
			params = paramString.split("\\s*,\\s*");
		}
		else {
			params = new String[0];
		}
		for (final TMethodSignature methodSignature : method.getSignatures()) {
			final EList<TParameter> parameterList = methodSignature.getParameters();
			if (parameterList.size() != params.length) {
				continue;
			}
			boolean equal = true;
			for (int i = 0; i < params.length; i++) {
				final String parameterTypeName = params[i];
				String other;
				if (parameterTypeName.contains(".")) {
					other = parameterList.get(i).getType().getFullyQualifiedName();
				} else {
					other = parameterList.get(i).getType().getTName();
				}
				equal &= parameterTypeName.equals(other);
				if (!equal) {
					break;
				}
			}
			if (equal && methodSignature.getReturnType().equals(type)) {
				return methodSignature;
			}
		}
		return null;
	}

	/**
	 * Searches in the stream for the element with the given name
	 *
	 * @param name   The desired name
	 * @param stream The elements
	 * @return The searched element or null if there is no element with the desired
	 *         name
	 */
	private TName getElementByName(String name, final Stream<? extends TName> stream) {
		return stream.filter(m -> name.equals(m.getTName())).findAny().orElse(null);
	}
} // TypeGraphImpl
