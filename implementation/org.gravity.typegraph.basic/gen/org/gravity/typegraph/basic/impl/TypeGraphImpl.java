/**
 */
package org.gravity.typegraph.basic.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
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
 * <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getOwnedTypes
 * <em>Owned Types</em>}</li>
 * <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getTAnnotationTypes
 * <em>TAnnotation Types</em>}</li>
 * <li>{@link org.gravity.typegraph.basic.impl.TypeGraphImpl#getTName
 * <em>TName</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeGraphImpl extends TAnnotatableImpl implements TypeGraph {
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
	 * The cached value of the '{@link #getOwnedTypes() <em>Owned Types</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getOwnedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TAbstractType> ownedTypes;

	/**
	 * The cached value of the '{@link #getTAnnotationTypes() <em>TAnnotation
	 * Types</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
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
			this.packages = new EObjectContainmentEList<>(TPackage.class, this, BasicPackage.TYPE_GRAPH__PACKAGES);
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
			this.fields = new EObjectContainmentWithInverseEList<>(TField.class, this, BasicPackage.TYPE_GRAPH__FIELDS,
					BasicPackage.TFIELD__MODEL);
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
			this.interfaces = new EObjectResolvingEList<>(TInterface.class, this, BasicPackage.TYPE_GRAPH__INTERFACES);
		}
		return this.interfaces;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<TAbstractType> getOwnedTypes() {
		if (this.ownedTypes == null) {
			this.ownedTypes = new EObjectContainmentWithInverseEList<>(TAbstractType.class, this,
					BasicPackage.TYPE_GRAPH__OWNED_TYPES, BasicPackage.TABSTRACT_TYPE__MODEL);
		}
		return this.ownedTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<TAnnotationType> getTAnnotationTypes() {
		if (this.tAnnotationTypes == null) {
			this.tAnnotationTypes = new EObjectResolvingEList<>(TAnnotationType.class, this,
					BasicPackage.TYPE_GRAPH__TANNOTATION_TYPES);
		}
		return this.tAnnotationTypes;
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
		final String oldTName = this.tName;
		this.tName = newTName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TYPE_GRAPH__TNAME, oldTName,
					this.tName));
		}
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
		for (final TClass tClass : getClasses()) {
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
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMethods()).basicAdd(otherEnd, msgs);
		case BasicPackage.TYPE_GRAPH__FIELDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFields()).basicAdd(otherEnd, msgs);
		case BasicPackage.TYPE_GRAPH__OWNED_TYPES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedTypes()).basicAdd(otherEnd, msgs);
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
			return ((InternalEList<?>) getPackages()).basicRemove(otherEnd, msgs);
		case BasicPackage.TYPE_GRAPH__METHODS:
			return ((InternalEList<?>) getMethods()).basicRemove(otherEnd, msgs);
		case BasicPackage.TYPE_GRAPH__FIELDS:
			return ((InternalEList<?>) getFields()).basicRemove(otherEnd, msgs);
		case BasicPackage.TYPE_GRAPH__OWNED_TYPES:
			return ((InternalEList<?>) getOwnedTypes()).basicRemove(otherEnd, msgs);
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
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(final int featureID, final Object newValue) {
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
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
		case BasicPackage.TYPE_GRAPH__PACKAGES:
			return (this.packages != null) && !this.packages.isEmpty();
		case BasicPackage.TYPE_GRAPH__METHODS:
			return (this.methods != null) && !this.methods.isEmpty();
		case BasicPackage.TYPE_GRAPH__FIELDS:
			return (this.fields != null) && !this.fields.isEmpty();
		case BasicPackage.TYPE_GRAPH__CLASSES:
			return (this.classes != null) && !this.classes.isEmpty();
		case BasicPackage.TYPE_GRAPH__INTERFACES:
			return (this.interfaces != null) && !this.interfaces.isEmpty();
		case BasicPackage.TYPE_GRAPH__OWNED_TYPES:
			return (this.ownedTypes != null) && !this.ownedTypes.isEmpty();
		case BasicPackage.TYPE_GRAPH__TANNOTATION_TYPES:
			return (this.tAnnotationTypes != null) && !this.tAnnotationTypes.isEmpty();
		case BasicPackage.TYPE_GRAPH__TNAME:
			return TNAME_EDEFAULT == null ? this.tName != null : !TNAME_EDEFAULT.equals(this.tName);
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
			return getDeclaredTClasses();
		case BasicPackage.TYPE_GRAPH___TO_STRING:
			return toString();
		case BasicPackage.TYPE_GRAPH___GET_PACKAGE__STRING:
			return getPackage((String) arguments.get(0));
		case BasicPackage.TYPE_GRAPH___GET_PACKAGE__ELIST:
			return getPackage((EList<String>) arguments.get(0));
		case BasicPackage.TYPE_GRAPH___GET_CLASS__STRING:
			return getClass((String) arguments.get(0));
		case BasicPackage.TYPE_GRAPH___GET_INTERFACE__STRING:
			return getInterface((String) arguments.get(0));
		case BasicPackage.TYPE_GRAPH___GET_METHOD__STRING:
			return getMethod((String) arguments.get(0));
		case BasicPackage.TYPE_GRAPH___GET_FIELD__STRING:
			return getField((String) arguments.get(0));
		case BasicPackage.TYPE_GRAPH___GET_SIGNATURE__STRING:
			return getSignature((String) arguments.get(0));
		case BasicPackage.TYPE_GRAPH___GET_FIELD_SIGNATURE__STRING:
			return getFieldSignature((String) arguments.get(0));
		case BasicPackage.TYPE_GRAPH___GET_METHOD_SIGNATURE__STRING:
			return getMethodSignature((String) arguments.get(0));
		case BasicPackage.TYPE_GRAPH___GET_DEFINITION__STRING:
			return getDefinition((String) arguments.get(0));
		case BasicPackage.TYPE_GRAPH___GET_FIELD_DEFINITION__STRING:
			return getFieldDefinition((String) arguments.get(0));
		case BasicPackage.TYPE_GRAPH___GET_METHOD_DEFINITION__STRING:
			return getMethodDefinition((String) arguments.get(0));
		case BasicPackage.TYPE_GRAPH___CREATE_PACKAGE__STRING:
			return createPackage((String) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TPackage getPackage(final String namespace) {
		return getPackage(namespace.split("\\."));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TPackage getPackage(final EList<String> namespace) {
		return getPackage((List<String>) namespace);
	}

	public TPackage getPackage(final List<String> namespace) {
		EList<TPackage> next = getPackages();
		for (int i = 0; i < namespace.size();) {
			final String name = namespace.get(i++);
			boolean contains = false;
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
		EList<TPackage> next = getPackages();
		for (int i = 0; i < namespace.length;) {
			final String name = namespace[i++];
			boolean contains = false;
			for (final TPackage tPackage : next) {
				if (name.equals(tPackage.getTName())) {
					if (i == namespace.length) {
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
	public TInterface getInterface(final String fullyQualifiedName) {
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
	public TAbstractType getType(final String fullyQualifiedName) {
		final int index = fullyQualifiedName.lastIndexOf('.');
		String defaultPackage = "(default package)";
		if (index > 0) {
			defaultPackage = fullyQualifiedName.substring(0, index);
		}
		final String name = fullyQualifiedName.substring(index + 1);
		final TPackage tPackage = getPackage(defaultPackage);
		if (tPackage != null) {
			final String[] types = name.split("\\$");
			TAbstractType tOuterType = null;
			for (final TAbstractType tType : tPackage.getOwnedTypes()) {
				if (tType.getTName().equals(types[0])) {
					tOuterType = tType;
					break;
				}
			}
			if (tOuterType != null) {
				TAbstractType tType = tOuterType;
				for (int i = 1; i < types.length; i++) {
					final EList<TAbstractType> innerTypes = tType.getInnerTypes();
					tType = null;
					for (final TAbstractType innerType : innerTypes) {
						if (innerType.getTName().equals(types[i])) {
							tType = innerType;
							break;
						}
					}
				}
				if (tType != null) {
					return tType;
				}
			}
			if (index > 0) {
				return null;
			}
		}
		return getOwnedTypes().parallelStream()
				.filter(type -> (type.getPackage() == null) && type.getTName().equals(name)).findAny().orElse(null);
	}

	/**
	 * Searches the method with the given name
	 *
	 * @param name The desired name
	 * @return The method or null if there is no element with the desired name
	 */
	@Override
	public TMethod getMethod(final String name) {
		return (TMethod) getElementByName(name, getMethods().parallelStream());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TField getField(final String name) {
		return (TField) getElementByName(name, getFields().parallelStream());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TSignature getSignature(final String signature) {
		final String typeName;
		final int colonIndex = signature.indexOf(':');
		if (colonIndex >= 0) {
			typeName = signature.substring(colonIndex + 1).trim();
		} else {
			typeName = "void";
		}
		final boolean isArray = typeName.indexOf('[') >= 0;
		final String finalTypeName;
		if(isArray) {
			finalTypeName = typeName.substring(0, typeName.indexOf('['));
		}
		else {
			finalTypeName = typeName;
		}
		TAbstractType type;
		if (typeName.contains(".")) {
			type = getType(typeName);
		} else {
			type = getOwnedTypes().parallelStream().filter(element -> finalTypeName.equals(element.getTName())).findAny()
					.orElse(null);
		}
		final int openBraceIndex = signature.lastIndexOf('(');
		if (openBraceIndex < 0) {
			final String name = signature.substring(0, colonIndex);
			return getFieldSignature(name, type, isArray);
		}
		String name = signature.substring(0, openBraceIndex).trim();
		final int dotIndex = name.lastIndexOf('.');
		if (dotIndex >= 0) {
			name = name.substring(dotIndex + 1);
		}
		final TMethod method = getMethod(name);
		if (method == null) {
			return null;
		}
		final int closeBraceIndex = signature.lastIndexOf(')');
		final String paramString = signature.substring(openBraceIndex + 1, closeBraceIndex).trim();
		final String[] params;
		if (paramString.length() > 0) {
			params = paramString.split("\\s*,\\s*");
		} else {
			params = new String[0];
		}
		return getMethodSignature(method, type, isArray, params);
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
			final EList<TParameter> parameterList = methodSignature.getParameters();
			if (parameterList.size() != parameterSignatures.length) {
				continue;
			}
			boolean equal = true;
			TParameter tParameter = methodSignature.getFirstParameter();
			for (final String parameterTypeName : parameterSignatures) {
				equal &= equals(parameterTypeName, tParameter);
				if (!equal) {
					break;
				}
				tParameter = tParameter.getNext();
			}
			final TAbstractType siganturesReturnType = methodSignature.getReturnType();
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
		final int open = signature.indexOf('[');
		final boolean paramIsArray = open >= 0;
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
		return getField(name).getSignatures().parallelStream()
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
		final TSignature sig = getSignature(signature);
		return sig instanceof TFieldDefinition ? (TFieldSignature) sig : null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TMethodSignature getMethodSignature(final String signature) {
		final TSignature sig = getSignature(signature);
		return sig instanceof TMethodSignature ? (TMethodSignature) sig : null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TMember getDefinition(final String signature) {
		final int index = signature.indexOf('(');
		if (index < 0) {
			return getFieldDefinition(signature);
		} else {
			return getMethodDefinition(signature);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TFieldDefinition getFieldDefinition(final String signature) {
		final int index = signature.lastIndexOf('.', signature.indexOf(':'));
		final TFieldSignature fieldSig = getFieldSignature(signature.substring(index + 1));
		final TAbstractType type = getType(signature.substring(0, index));
		return type.getDefines().parallelStream().filter(member -> member.getSignature().equals(fieldSig))
				.map(member -> (TFieldDefinition) member).findAny().orElse(null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TMethodDefinition getMethodDefinition(final String signature) {
		final int index = signature.lastIndexOf('.', signature.lastIndexOf('('));
		if (index < 0) {
			return null;
		}
		final TMethodSignature methodSig = getMethodSignature(signature.substring(index + 1));
		final TAbstractType type = getType(signature.substring(0, index));
		if (type == null) {
			return null;
		}
		return type.getDefines().parallelStream().filter(member -> member.getSignature().equals(methodSig))
				.map(member -> (TMethodDefinition) member).findAny().orElse(null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TPackage createPackage(final String namespace) {
		final String[] names = namespace.split("\\.");
		int i = 0;
		TPackage currentPackage = null;
		List<TPackage> subPackages = getPackages();
		for (; i < names.length; i++) {
			final String packageName = names[i];
			final Optional<TPackage> match = subPackages.parallelStream().filter(n -> packageName.equals(n.getTName()))
					.findAny();
			if (match.isPresent()) {
				currentPackage = match.get();
				subPackages = currentPackage.getSubpackages();
			} else {
				break;
			}
		}
		for (; i < names.length; i++) {
			final TPackage nextPackage = BasicFactory.eINSTANCE.createTPackage();
			nextPackage.setTName(names[i]);
			if (i == 0) {
				getPackages().add(nextPackage);
			} else {
				nextPackage.setParent(currentPackage);
			}
			nextPackage.setModel(this);
			currentPackage = nextPackage;
		}
		return currentPackage;
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
