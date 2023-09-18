/**
 */
package org.gravity.typegraph.basic.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Deque;
// [user defined imports] -->
// <-- [user defined imports]
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TContainableElement;
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TModule;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.impl.TAnnotatableImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>TAbstract Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl#getModule <em>Module</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl#getDefines <em>Defines</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl#isTLib <em>TLib</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl#getTName <em>TName</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl#getTModifier <em>TModifier</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl#getInnerTypes <em>Inner Types</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl#getOuterType <em>Outer Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TAbstractTypeImpl extends TAnnotatableImpl implements TAbstractType {
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected TypeGraph model;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected TPackage package_;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected EList<TSignature> signature;

	/**
	 * The cached value of the '{@link #getDefines() <em>Defines</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDefines()
	 * @generated
	 * @ordered
	 */
	protected EList<TMember> defines;

	/**
	 * The default value of the '{@link #isTLib() <em>TLib</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isTLib()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TLIB_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTLib() <em>TLib</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isTLib()
	 * @generated
	 * @ordered
	 */
	protected boolean tLib = TLIB_EDEFAULT;

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
	 * The cached value of the '{@link #getTModifier() <em>TModifier</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTModifier()
	 * @generated
	 * @ordered
	 */
	protected TModifier tModifier;

	/**
	 * The cached value of the '{@link #getInnerTypes() <em>Inner Types</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInnerTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TAbstractType> innerTypes;

	/**
	 * The cached value of the '{@link #getOuterType() <em>Outer Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOuterType()
	 * @generated
	 * @ordered
	 */
	protected TAbstractType outerType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TAbstractTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TABSTRACT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TModule getModule() {
		if (eContainerFeatureID() != BasicPackage.TABSTRACT_TYPE__MODULE) return null;
		return (TModule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(TModule newModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModule, BasicPackage.TABSTRACT_TYPE__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModule(TModule newModule) {
		if (newModule != eInternalContainer() || (eContainerFeatureID() != BasicPackage.TABSTRACT_TYPE__MODULE && newModule != null)) {
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, BasicPackage.TMODULE__CONTAINS, TModule.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__MODULE, newModule, newModule));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TABSTRACT_TYPE__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraph basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(TypeGraph newModel, NotificationChain msgs) {
		TypeGraph oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__MODEL, oldModel, newModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(TypeGraph newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject)model).eInverseRemove(this, BasicPackage.TYPE_GRAPH__ALL_TYPES, TypeGraph.class, msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, BasicPackage.TYPE_GRAPH__ALL_TYPES, TypeGraph.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPackage getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (TPackage)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TABSTRACT_TYPE__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackage basicGetPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(TPackage newPackage, NotificationChain msgs) {
		TPackage oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__PACKAGE, oldPackage, newPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackage(TPackage newPackage) {
		if (newPackage != package_) {
			NotificationChain msgs = null;
			if (package_ != null)
				msgs = ((InternalEObject)package_).eInverseRemove(this, BasicPackage.TPACKAGE__ALL_TYPES, TPackage.class, msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, BasicPackage.TPACKAGE__ALL_TYPES, TPackage.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TSignature> getSignature() {
		if (signature == null) {
			signature = new EObjectResolvingEList<TSignature>(TSignature.class, this, BasicPackage.TABSTRACT_TYPE__SIGNATURE);
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TMember> getDefines() {
		if (defines == null) {
			defines = new EObjectWithInverseResolvingEList<TMember>(TMember.class, this, BasicPackage.TABSTRACT_TYPE__DEFINES, BasicPackage.TMEMBER__DEFINED_BY);
		}
		return defines;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTLib() {
		return tLib;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTLib(boolean newTLib) {
		boolean oldTLib = tLib;
		tLib = newTLib;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__TLIB, oldTLib, tLib));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__TNAME, oldTName, tName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TModifier getTModifier() {
		return tModifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTModifier(TModifier newTModifier, NotificationChain msgs) {
		TModifier oldTModifier = tModifier;
		tModifier = newTModifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__TMODIFIER, oldTModifier, newTModifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTModifier(TModifier newTModifier) {
		if (newTModifier != tModifier) {
			NotificationChain msgs = null;
			if (tModifier != null)
				msgs = ((InternalEObject)tModifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicPackage.TABSTRACT_TYPE__TMODIFIER, null, msgs);
			if (newTModifier != null)
				msgs = ((InternalEObject)newTModifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicPackage.TABSTRACT_TYPE__TMODIFIER, null, msgs);
			msgs = basicSetTModifier(newTModifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__TMODIFIER, newTModifier, newTModifier));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAbstractType> getInnerTypes() {
		if (innerTypes == null) {
			innerTypes = new EObjectWithInverseResolvingEList<TAbstractType>(TAbstractType.class, this, BasicPackage.TABSTRACT_TYPE__INNER_TYPES, BasicPackage.TABSTRACT_TYPE__OUTER_TYPE);
		}
		return innerTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractType getOuterType() {
		if (outerType != null && outerType.eIsProxy()) {
			InternalEObject oldOuterType = (InternalEObject)outerType;
			outerType = (TAbstractType)eResolveProxy(oldOuterType);
			if (outerType != oldOuterType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TABSTRACT_TYPE__OUTER_TYPE, oldOuterType, outerType));
			}
		}
		return outerType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType basicGetOuterType() {
		return outerType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterType(TAbstractType newOuterType, NotificationChain msgs) {
		TAbstractType oldOuterType = outerType;
		outerType = newOuterType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__OUTER_TYPE, oldOuterType, newOuterType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOuterType(TAbstractType newOuterType) {
		if (newOuterType != outerType) {
			NotificationChain msgs = null;
			if (outerType != null)
				msgs = ((InternalEObject)outerType).eInverseRemove(this, BasicPackage.TABSTRACT_TYPE__INNER_TYPES, TAbstractType.class, msgs);
			if (newOuterType != null)
				msgs = ((InternalEObject)newOuterType).eInverseAdd(this, BasicPackage.TABSTRACT_TYPE__INNER_TYPES, TAbstractType.class, msgs);
			msgs = basicSetOuterType(newOuterType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__OUTER_TYPE, newOuterType, newOuterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSuperTypeOf(TAbstractType tType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public boolean isSubTypeOf(final TAbstractType tType) {
		// [user code injected with eMoflon]
		return tType.isSuperTypeOf(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public boolean isDeclared() {
		// [user code injected with eMoflon]
		if (getTName().equals("T")) {
			return false;
		}
		if (getTName().endsWith("$Anonymous")) {
			return false;
		}
		return !isTLib();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public String getFullyQualifiedName() {
		// [user code injected with eMoflon]

		final StringBuilder builder = new StringBuilder();
		final List<String> packages = new LinkedList<>();
		TPackage tPackage = getPackage();
		if (tPackage == null) {
			return getTName();
		}
		if (!"(default package)".equals(tPackage.getTName())) {
			while (tPackage != null) {
				packages.add(0, tPackage.getTName());
				tPackage = tPackage.getParent();
			}
			for (final String name : packages) {
				builder.append(name);
				if ((name.length() > 0) && !name.endsWith("$") && !name.endsWith("$1")) { //$NON-NLS-1$ //$NON-NLS-2$
					builder.append('.');
				}
			}
		}
		builder.append(getTName());
		return builder.toString().replaceAll("%.*%", "");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TMethodSignature getTMethodSignature(final String signature) {
		// [user code injected with eMoflon]
		final String voidString = ":void";
		for (final TSignature sig : getSignature()) {
			if (sig instanceof TMethodSignature) {
				String sigString = sig.getSignatureString().replace(" ", "");

				if (sigString.endsWith(voidString)) {
					sigString = sigString.substring(0, sigString.length() - voidString.length());
				}
				String methodSigString = signature.replace(" ", "");
				if (methodSigString.endsWith(voidString)) {
					methodSigString = methodSigString.substring(0, methodSigString.length() - voidString.length());
				}
				if (sigString.equals(methodSigString)) {
					return (TMethodSignature) sig;
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TMethodDefinition getTMethodDefinition(final String signature) {
		// [user code injected with eMoflon]
		final String voidString = ":void";
		for (final TMember def : getDefines()) {
			if (def instanceof TMethodDefinition) {
				String sigString = def.getSignatureString().replace(" ", "");

				if (sigString.endsWith(voidString)) {
					sigString = sigString.substring(0, sigString.length() - voidString.length());
				}
				String methodSigString = signature.replace(" ", "");
				if (methodSigString.endsWith(voidString)) {
					methodSigString = methodSigString.substring(0, methodSigString.length() - voidString.length());
				}
				if (sigString.equals(methodSigString)) {
					return (TMethodDefinition) def;
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TPackage getBasePackage() {
		// [user code injected with eMoflon]
		final TPackage tPackage = getPackage();
		if (tPackage != null) {
			return tPackage.getBasePackage();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TMember getTDefinition(final TSignature signature) {
		// [user code injected with eMoflon]
		return signature.getTDefinition(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TMember getTDefinition(final String signatureString) {
		final String voidString = ":void";
		String searchedSignatureString = signatureString.replace(" ", "");
		for (final TMember def : getDefines()) {
			String nextSignatureString = def.getSignatureString().replace(" ", "");
			if (searchedSignatureString.equals(nextSignatureString)) {
				return def;
			}
			if (def instanceof TMethodDefinition) {
				if (nextSignatureString.endsWith(voidString)) {
					nextSignatureString = nextSignatureString.substring(0,
							nextSignatureString.length() - voidString.length());
				}
				if (searchedSignatureString.endsWith(voidString)) {
					searchedSignatureString = searchedSignatureString.substring(0,
							searchedSignatureString.length() - voidString.length());
				}
				if (nextSignatureString.equals(searchedSignatureString)) {
					return def;
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public boolean hasTMember(final TMember member) {
		// [user code injected with eMoflon]
		return equals(member.getDefinedBy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean hasCommonSuperType(TAbstractType tType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicPackage.TABSTRACT_TYPE__MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModule((TModule)otherEnd, msgs);
			case BasicPackage.TABSTRACT_TYPE__MODEL:
				if (model != null)
					msgs = ((InternalEObject)model).eInverseRemove(this, BasicPackage.TYPE_GRAPH__ALL_TYPES, TypeGraph.class, msgs);
				return basicSetModel((TypeGraph)otherEnd, msgs);
			case BasicPackage.TABSTRACT_TYPE__PACKAGE:
				if (package_ != null)
					msgs = ((InternalEObject)package_).eInverseRemove(this, BasicPackage.TPACKAGE__ALL_TYPES, TPackage.class, msgs);
				return basicSetPackage((TPackage)otherEnd, msgs);
			case BasicPackage.TABSTRACT_TYPE__DEFINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDefines()).basicAdd(otherEnd, msgs);
			case BasicPackage.TABSTRACT_TYPE__INNER_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInnerTypes()).basicAdd(otherEnd, msgs);
			case BasicPackage.TABSTRACT_TYPE__OUTER_TYPE:
				if (outerType != null)
					msgs = ((InternalEObject)outerType).eInverseRemove(this, BasicPackage.TABSTRACT_TYPE__INNER_TYPES, TAbstractType.class, msgs);
				return basicSetOuterType((TAbstractType)otherEnd, msgs);
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
			case BasicPackage.TABSTRACT_TYPE__MODULE:
				return basicSetModule(null, msgs);
			case BasicPackage.TABSTRACT_TYPE__MODEL:
				return basicSetModel(null, msgs);
			case BasicPackage.TABSTRACT_TYPE__PACKAGE:
				return basicSetPackage(null, msgs);
			case BasicPackage.TABSTRACT_TYPE__DEFINES:
				return ((InternalEList<?>)getDefines()).basicRemove(otherEnd, msgs);
			case BasicPackage.TABSTRACT_TYPE__TMODIFIER:
				return basicSetTModifier(null, msgs);
			case BasicPackage.TABSTRACT_TYPE__INNER_TYPES:
				return ((InternalEList<?>)getInnerTypes()).basicRemove(otherEnd, msgs);
			case BasicPackage.TABSTRACT_TYPE__OUTER_TYPE:
				return basicSetOuterType(null, msgs);
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
			case BasicPackage.TABSTRACT_TYPE__MODULE:
				return eInternalContainer().eInverseRemove(this, BasicPackage.TMODULE__CONTAINS, TModule.class, msgs);
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
			case BasicPackage.TABSTRACT_TYPE__MODULE:
				return getModule();
			case BasicPackage.TABSTRACT_TYPE__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case BasicPackage.TABSTRACT_TYPE__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case BasicPackage.TABSTRACT_TYPE__SIGNATURE:
				return getSignature();
			case BasicPackage.TABSTRACT_TYPE__DEFINES:
				return getDefines();
			case BasicPackage.TABSTRACT_TYPE__TLIB:
				return isTLib();
			case BasicPackage.TABSTRACT_TYPE__TNAME:
				return getTName();
			case BasicPackage.TABSTRACT_TYPE__TMODIFIER:
				return getTModifier();
			case BasicPackage.TABSTRACT_TYPE__INNER_TYPES:
				return getInnerTypes();
			case BasicPackage.TABSTRACT_TYPE__OUTER_TYPE:
				if (resolve) return getOuterType();
				return basicGetOuterType();
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
			case BasicPackage.TABSTRACT_TYPE__MODULE:
				setModule((TModule)newValue);
				return;
			case BasicPackage.TABSTRACT_TYPE__MODEL:
				setModel((TypeGraph)newValue);
				return;
			case BasicPackage.TABSTRACT_TYPE__PACKAGE:
				setPackage((TPackage)newValue);
				return;
			case BasicPackage.TABSTRACT_TYPE__SIGNATURE:
				getSignature().clear();
				getSignature().addAll((Collection<? extends TSignature>)newValue);
				return;
			case BasicPackage.TABSTRACT_TYPE__DEFINES:
				getDefines().clear();
				getDefines().addAll((Collection<? extends TMember>)newValue);
				return;
			case BasicPackage.TABSTRACT_TYPE__TLIB:
				setTLib((Boolean)newValue);
				return;
			case BasicPackage.TABSTRACT_TYPE__TNAME:
				setTName((String)newValue);
				return;
			case BasicPackage.TABSTRACT_TYPE__TMODIFIER:
				setTModifier((TModifier)newValue);
				return;
			case BasicPackage.TABSTRACT_TYPE__INNER_TYPES:
				getInnerTypes().clear();
				getInnerTypes().addAll((Collection<? extends TAbstractType>)newValue);
				return;
			case BasicPackage.TABSTRACT_TYPE__OUTER_TYPE:
				setOuterType((TAbstractType)newValue);
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
			case BasicPackage.TABSTRACT_TYPE__MODULE:
				setModule((TModule)null);
				return;
			case BasicPackage.TABSTRACT_TYPE__MODEL:
				setModel((TypeGraph)null);
				return;
			case BasicPackage.TABSTRACT_TYPE__PACKAGE:
				setPackage((TPackage)null);
				return;
			case BasicPackage.TABSTRACT_TYPE__SIGNATURE:
				getSignature().clear();
				return;
			case BasicPackage.TABSTRACT_TYPE__DEFINES:
				getDefines().clear();
				return;
			case BasicPackage.TABSTRACT_TYPE__TLIB:
				setTLib(TLIB_EDEFAULT);
				return;
			case BasicPackage.TABSTRACT_TYPE__TNAME:
				setTName(TNAME_EDEFAULT);
				return;
			case BasicPackage.TABSTRACT_TYPE__TMODIFIER:
				setTModifier((TModifier)null);
				return;
			case BasicPackage.TABSTRACT_TYPE__INNER_TYPES:
				getInnerTypes().clear();
				return;
			case BasicPackage.TABSTRACT_TYPE__OUTER_TYPE:
				setOuterType((TAbstractType)null);
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
			case BasicPackage.TABSTRACT_TYPE__MODULE:
				return getModule() != null;
			case BasicPackage.TABSTRACT_TYPE__MODEL:
				return model != null;
			case BasicPackage.TABSTRACT_TYPE__PACKAGE:
				return package_ != null;
			case BasicPackage.TABSTRACT_TYPE__SIGNATURE:
				return signature != null && !signature.isEmpty();
			case BasicPackage.TABSTRACT_TYPE__DEFINES:
				return defines != null && !defines.isEmpty();
			case BasicPackage.TABSTRACT_TYPE__TLIB:
				return tLib != TLIB_EDEFAULT;
			case BasicPackage.TABSTRACT_TYPE__TNAME:
				return TNAME_EDEFAULT == null ? tName != null : !TNAME_EDEFAULT.equals(tName);
			case BasicPackage.TABSTRACT_TYPE__TMODIFIER:
				return tModifier != null;
			case BasicPackage.TABSTRACT_TYPE__INNER_TYPES:
				return innerTypes != null && !innerTypes.isEmpty();
			case BasicPackage.TABSTRACT_TYPE__OUTER_TYPE:
				return outerType != null;
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
		if (baseClass == TContainableElement.class) {
			switch (derivedFeatureID) {
				case BasicPackage.TABSTRACT_TYPE__MODULE: return BasicPackage.TCONTAINABLE_ELEMENT__MODULE;
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
		if (baseClass == TContainableElement.class) {
			switch (baseFeatureID) {
				case BasicPackage.TCONTAINABLE_ELEMENT__MODULE: return BasicPackage.TABSTRACT_TYPE__MODULE;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BasicPackage.TABSTRACT_TYPE___IS_SUPER_TYPE_OF__TABSTRACTTYPE:
				return isSuperTypeOf((TAbstractType)arguments.get(0));
			case BasicPackage.TABSTRACT_TYPE___IS_SUB_TYPE_OF__TABSTRACTTYPE:
				return isSubTypeOf((TAbstractType)arguments.get(0));
			case BasicPackage.TABSTRACT_TYPE___IS_DECLARED:
				return isDeclared();
			case BasicPackage.TABSTRACT_TYPE___GET_FULLY_QUALIFIED_NAME:
				return getFullyQualifiedName();
			case BasicPackage.TABSTRACT_TYPE___GET_TMETHOD_SIGNATURE__STRING:
				return getTMethodSignature((String)arguments.get(0));
			case BasicPackage.TABSTRACT_TYPE___GET_TMETHOD_DEFINITION__STRING:
				return getTMethodDefinition((String)arguments.get(0));
			case BasicPackage.TABSTRACT_TYPE___GET_BASE_PACKAGE:
				return getBasePackage();
			case BasicPackage.TABSTRACT_TYPE___GET_TDEFINITION__TSIGNATURE:
				return getTDefinition((TSignature)arguments.get(0));
			case BasicPackage.TABSTRACT_TYPE___GET_TDEFINITION__STRING:
				return getTDefinition((String)arguments.get(0));
			case BasicPackage.TABSTRACT_TYPE___HAS_TMEMBER__TMEMBER:
				return hasTMember((TMember)arguments.get(0));
			case BasicPackage.TABSTRACT_TYPE___HAS_COMMON_SUPER_TYPE__TABSTRACTTYPE:
				return hasCommonSuperType((TAbstractType)arguments.get(0));
			case BasicPackage.TABSTRACT_TYPE___GET_REAL_PACKAGE__TABSTRACTTYPE:
				return getRealPackage((TAbstractType)arguments.get(0));
			case BasicPackage.TABSTRACT_TYPE___GET_TFIELD_SIGNATURE__STRING:
				return getTFieldSignature((String)arguments.get(0));
			case BasicPackage.TABSTRACT_TYPE___GET_TFIELD_DEFINITION__STRING:
				return getTFieldDefinition((String)arguments.get(0));
			case BasicPackage.TABSTRACT_TYPE___CREATE_METHOD_DEFINITION__STRING_TABSTRACTTYPE_INT_INT_ELIST_ELIST_ELIST_BOOLEAN_TVISIBILITY:
				return createMethodDefinition((String)arguments.get(0), (TAbstractType)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (EList<TAbstractType>)arguments.get(4), (EList<Integer>)arguments.get(5), (EList<Integer>)arguments.get(6), (Boolean)arguments.get(7), (TVisibility)arguments.get(8));
			case BasicPackage.TABSTRACT_TYPE___CREATE_FIELD_DEFINITION__STRING_TABSTRACTTYPE_INT_INT_BOOLEAN_TVISIBILITY:
				return createFieldDefinition((String)arguments.get(0), (TAbstractType)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Boolean)arguments.get(4), (TVisibility)arguments.get(5));
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
		result.append(" (tLib: ");
		result.append(tLib);
		result.append(", tName: ");
		result.append(tName);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TPackage getRealPackage(final TAbstractType type) {

		if (type.getOuterType() != null) {
			return getRealPackage(type.getOuterType());
		} else {
			return type.getPackage();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TFieldSignature getTFieldSignature(final String signature) {
		final int colon = signature.indexOf(':');
		final int open = signature.indexOf('[');
		final boolean array = open > 0;
		final String name = signature.substring(0, colon).trim();
		final String type;
		if (array) {
			type = signature.substring(colon + 1, open).trim();
		} else {
			type = signature.substring(colon + 1).trim();
		}
		return getSignature().parallelStream().filter(TFieldSignature.class::isInstance)
				.map(TFieldSignature.class::cast).filter(field -> field.isArray() == array)
				.filter(field -> field.getField().getTName().equals(name))
				.filter(field -> field.getType().getFullyQualifiedName().endsWith(type)).findAny().orElse(null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TFieldDefinition getTFieldDefinition(final String signature) {
		final int colon = signature.indexOf(':');
		final int open = signature.indexOf('[');
		final boolean array = open > 0;
		final String name = signature.substring(0, colon).trim();
		final String type;
		if (array) {
			type = signature.substring(colon + 1, open).trim();
		} else {
			type = signature.substring(colon + 1).trim();
		}
		return getDefines().parallelStream().filter(TFieldDefinition.class::isInstance)
				.map(TFieldDefinition.class::cast).filter(definition -> {
					final TFieldSignature field = definition.getSignature();
					return (field.isArray() == array) && field.getField().getTName().equals(name)
							&& field.getType().getFullyQualifiedName().endsWith(type);
				}).findAny().orElse(null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TMethodDefinition createMethodDefinition(final String name, final TAbstractType returnType,
			final int returnLowerBound, final int returnUpperBound, final EList<TAbstractType> parameters,
			final EList<Integer> parameterLowerBounds, final EList<Integer> parameterUpperBounds, final boolean static_,
			final TVisibility visibility) {
		final TypeGraph pm = getModel();
		TMethod method = pm.getMethod(name);
		if (method == null) {
			method = BasicFactory.eINSTANCE.createTMethod();
			method.setTName(name);
			method.setModel(pm);
		}
		TMethodSignature methodSignature = method.getMethodSignature(returnType, returnLowerBound, returnUpperBound,
				parameters, parameterLowerBounds, parameterUpperBounds);
		if (methodSignature == null) {
			methodSignature = method.createMethodSignature(returnType, returnLowerBound, returnUpperBound, parameters,
					parameterLowerBounds, parameterUpperBounds);
		}

		TMethodDefinition definition = methodSignature.getTDefinition(this);
		if (definition == null) {
			getSignature().add(methodSignature);
			definition = BasicFactory.eINSTANCE.createTMethodDefinition();
			if (this instanceof TClass) {
				final EList<TMethodDefinition> otherMethodDefinitions = methodSignature.getMethodDefinitions();
				Deque<TClass> parent = new LinkedList<>(((TClass) this).getParentClasses());
				while ((parent != null) && !parent.isEmpty()) {
					final TClass parentCopy = parent.pop();
					final Optional<TMethodDefinition> match = otherMethodDefinitions.parallelStream()
							.filter(def -> parentCopy.equals(def.getDefinedBy())).findAny();
					if (match.isPresent()) {
						definition.getOverriding().add(match.get());
						parent = null;
					} else {
						parent.addAll(parentCopy.getParentClasses());
					}
				}
			}
			definition.setSignature(methodSignature);
			definition.setDefinedBy(this);
			definition.setReturnType(returnType);
			definition.setLowerBound(returnLowerBound);
			definition.setUpperBound(returnUpperBound);
			final TModifier modifier = BasicFactory.eINSTANCE.createTModifier();
			modifier.setIsStatic(static_);
			modifier.setTVisibility(visibility);
			definition.setTModifier(modifier);

		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TFieldDefinition createFieldDefinition(final String name, final TAbstractType type, final int lowerBound,
			final int upperBound, final boolean static_, final TVisibility visibility) {
		final TypeGraph pm = getModel();
		TField field = pm.getField(name);
		if (field == null) {
			field = BasicFactory.eINSTANCE.createTField();
			field.setTName(name);
			field.setModel(pm);
		}
		TFieldSignature fieldSignature = null;
		for (final TFieldSignature candidate : field.getSignatures()) {
			if (candidate.getType().equals(type) && (lowerBound == candidate.getLowerBound())
					&& (upperBound == candidate.getUpperBound())) {
				fieldSignature = candidate;
				break;
			}
		}
		if (fieldSignature == null) {
			fieldSignature = BasicFactory.eINSTANCE.createTFieldSignature();
			fieldSignature.setField(field);
			fieldSignature.setType(type);
			fieldSignature.setLowerBound(lowerBound);
			fieldSignature.setUpperBound(upperBound);
		}

		TFieldDefinition definition = null;
		for (final TFieldDefinition candidate : fieldSignature.getFieldDefinitions()) {
			if (equals(candidate.getDefinedBy())) {
				definition = candidate;
				break;
			}
		}
		if (definition == null) {
			getSignature().add(fieldSignature);
			definition = BasicFactory.eINSTANCE.createTFieldDefinition();
			definition.setSignature(fieldSignature);
			definition.setDefinedBy(this);
			if (this instanceof TClass) {
				final Deque<TAbstractType> parents = new LinkedList<>();
				parents.addAll(((TClass) this).getParentClasses());
				while (!parents.isEmpty()) {
					final TAbstractType parent = parents.pop();
					if (parent instanceof TClass) {

						parents.addAll(((TClass) parent).getParentClasses());
						if ((parent != null) && parent.getSignature().contains(fieldSignature)) {
							definition.setHiding(fieldSignature.getTDefinition(parent));
							break;
						}
					}
				}
			}
		}
		return definition;
	}

	// [user code injected with eMoflon] -->
} // TAbstractTypeImpl
