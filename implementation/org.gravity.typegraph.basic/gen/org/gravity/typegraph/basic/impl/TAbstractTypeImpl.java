/**
 */
package org.gravity.typegraph.basic.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
// [user defined imports] -->
// <-- [user defined imports]
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
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
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TModifier;
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
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeGraph getModel() {
		if (eContainerFeatureID() != BasicPackage.TABSTRACT_TYPE__MODEL) {
			return null;
		}
		return (TypeGraph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(final TypeGraph newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, BasicPackage.TABSTRACT_TYPE__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(final TypeGraph newModel) {
		if ((newModel != eInternalContainer()) || ((eContainerFeatureID() != BasicPackage.TABSTRACT_TYPE__MODEL) && (newModel != null))) {
			if (EcoreUtil.isAncestor(this, newModel)) {
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			}
			NotificationChain msgs = null;
			if (eInternalContainer() != null) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			if (newModel != null) {
				msgs = ((InternalEObject)newModel).eInverseAdd(this, BasicPackage.TYPE_GRAPH__OWNED_TYPES, TypeGraph.class, msgs);
			}
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__MODEL, newModel, newModel));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPackage getPackage() {
		if ((this.package_ != null) && this.package_.eIsProxy()) {
			final InternalEObject oldPackage = (InternalEObject)this.package_;
			this.package_ = (TPackage)eResolveProxy(oldPackage);
			if ((this.package_ != oldPackage) && eNotificationRequired()) {
				eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TABSTRACT_TYPE__PACKAGE, oldPackage, this.package_));
			}
		}
		return this.package_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TPackage basicGetPackage() {
		return this.package_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(final TPackage newPackage, NotificationChain msgs) {
		final TPackage oldPackage = this.package_;
		this.package_ = newPackage;
		if (eNotificationRequired()) {
			final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__PACKAGE, oldPackage, newPackage);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackage(final TPackage newPackage) {
		if (newPackage != this.package_) {
			NotificationChain msgs = null;
			if (this.package_ != null) {
				msgs = ((InternalEObject)this.package_).eInverseRemove(this, BasicPackage.TPACKAGE__OWNED_TYPES, TPackage.class, msgs);
			}
			if (newPackage != null) {
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, BasicPackage.TPACKAGE__OWNED_TYPES, TPackage.class, msgs);
			}
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__PACKAGE, newPackage, newPackage));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TSignature> getSignature() {
		if (this.signature == null) {
			this.signature = new EObjectResolvingEList<>(TSignature.class, this, BasicPackage.TABSTRACT_TYPE__SIGNATURE);
		}
		return this.signature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TMember> getDefines() {
		if (this.defines == null) {
			this.defines = new EObjectWithInverseResolvingEList<>(TMember.class, this, BasicPackage.TABSTRACT_TYPE__DEFINES, BasicPackage.TMEMBER__DEFINED_BY);
		}
		return this.defines;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTLib() {
		return this.tLib;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTLib(final boolean newTLib) {
		final boolean oldTLib = this.tLib;
		this.tLib = newTLib;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__TLIB, oldTLib, this.tLib));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTName() {
		return this.tName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTName(final String newTName) {
		final String oldTName = this.tName;
		this.tName = newTName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__TNAME, oldTName, this.tName));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TModifier getTModifier() {
		return this.tModifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTModifier(final TModifier newTModifier, NotificationChain msgs) {
		final TModifier oldTModifier = this.tModifier;
		this.tModifier = newTModifier;
		if (eNotificationRequired()) {
			final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__TMODIFIER, oldTModifier, newTModifier);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTModifier(final TModifier newTModifier) {
		if (newTModifier != this.tModifier) {
			NotificationChain msgs = null;
			if (this.tModifier != null) {
				msgs = ((InternalEObject)this.tModifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicPackage.TABSTRACT_TYPE__TMODIFIER, null, msgs);
			}
			if (newTModifier != null) {
				msgs = ((InternalEObject)newTModifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicPackage.TABSTRACT_TYPE__TMODIFIER, null, msgs);
			}
			msgs = basicSetTModifier(newTModifier, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__TMODIFIER, newTModifier, newTModifier));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAbstractType> getInnerTypes() {
		if (this.innerTypes == null) {
			this.innerTypes = new EObjectWithInverseResolvingEList<>(TAbstractType.class, this, BasicPackage.TABSTRACT_TYPE__INNER_TYPES, BasicPackage.TABSTRACT_TYPE__OUTER_TYPE);
		}
		return this.innerTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractType getOuterType() {
		if ((this.outerType != null) && this.outerType.eIsProxy()) {
			final InternalEObject oldOuterType = (InternalEObject)this.outerType;
			this.outerType = (TAbstractType)eResolveProxy(oldOuterType);
			if ((this.outerType != oldOuterType) && eNotificationRequired()) {
				eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TABSTRACT_TYPE__OUTER_TYPE, oldOuterType, this.outerType));
			}
		}
		return this.outerType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType basicGetOuterType() {
		return this.outerType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterType(final TAbstractType newOuterType, NotificationChain msgs) {
		final TAbstractType oldOuterType = this.outerType;
		this.outerType = newOuterType;
		if (eNotificationRequired()) {
			final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__OUTER_TYPE, oldOuterType, newOuterType);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOuterType(final TAbstractType newOuterType) {
		if (newOuterType != this.outerType) {
			NotificationChain msgs = null;
			if (this.outerType != null) {
				msgs = ((InternalEObject)this.outerType).eInverseRemove(this, BasicPackage.TABSTRACT_TYPE__INNER_TYPES, TAbstractType.class, msgs);
			}
			if (newOuterType != null) {
				msgs = ((InternalEObject)newOuterType).eInverseAdd(this, BasicPackage.TABSTRACT_TYPE__INNER_TYPES, TAbstractType.class, msgs);
			}
			msgs = basicSetOuterType(newOuterType, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__OUTER_TYPE, newOuterType, newOuterType));
		}
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicPackage.TABSTRACT_TYPE__MODEL:
			if (eInternalContainer() != null) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			return basicSetModel((TypeGraph)otherEnd, msgs);
		case BasicPackage.TABSTRACT_TYPE__PACKAGE:
			if (this.package_ != null) {
				msgs = ((InternalEObject)this.package_).eInverseRemove(this, BasicPackage.TPACKAGE__OWNED_TYPES, TPackage.class, msgs);
			}
			return basicSetPackage((TPackage)otherEnd, msgs);
		case BasicPackage.TABSTRACT_TYPE__DEFINES:
			return ((InternalEList<InternalEObject>)(InternalEList<?>)getDefines()).basicAdd(otherEnd, msgs);
		case BasicPackage.TABSTRACT_TYPE__INNER_TYPES:
			return ((InternalEList<InternalEObject>)(InternalEList<?>)getInnerTypes()).basicAdd(otherEnd, msgs);
		case BasicPackage.TABSTRACT_TYPE__OUTER_TYPE:
			if (this.outerType != null) {
				msgs = ((InternalEObject)this.outerType).eInverseRemove(this, BasicPackage.TABSTRACT_TYPE__INNER_TYPES, TAbstractType.class, msgs);
			}
			return basicSetOuterType((TAbstractType)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
		switch (featureID) {
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
	public NotificationChain eBasicRemoveFromContainerFeature(final NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case BasicPackage.TABSTRACT_TYPE__MODEL:
			return eInternalContainer().eInverseRemove(this, BasicPackage.TYPE_GRAPH__OWNED_TYPES, TypeGraph.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case BasicPackage.TABSTRACT_TYPE__MODEL:
			return getModel();
		case BasicPackage.TABSTRACT_TYPE__PACKAGE:
			if (resolve) {
				return getPackage();
			}
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
			if (resolve) {
				return getOuterType();
			}
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
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
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
	public void eUnset(final int featureID) {
		switch (featureID) {
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
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
		case BasicPackage.TABSTRACT_TYPE__MODEL:
			return getModel() != null;
		case BasicPackage.TABSTRACT_TYPE__PACKAGE:
			return this.package_ != null;
		case BasicPackage.TABSTRACT_TYPE__SIGNATURE:
			return (this.signature != null) && !this.signature.isEmpty();
		case BasicPackage.TABSTRACT_TYPE__DEFINES:
			return (this.defines != null) && !this.defines.isEmpty();
		case BasicPackage.TABSTRACT_TYPE__TLIB:
			return this.tLib != TLIB_EDEFAULT;
		case BasicPackage.TABSTRACT_TYPE__TNAME:
			return TNAME_EDEFAULT == null ? this.tName != null : !TNAME_EDEFAULT.equals(this.tName);
		case BasicPackage.TABSTRACT_TYPE__TMODIFIER:
			return this.tModifier != null;
		case BasicPackage.TABSTRACT_TYPE__INNER_TYPES:
			return (this.innerTypes != null) && !this.innerTypes.isEmpty();
		case BasicPackage.TABSTRACT_TYPE__OUTER_TYPE:
			return this.outerType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
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
		case BasicPackage.TABSTRACT_TYPE___FILL_SAME_TYPE__ELIST:
			fillSameType((EList<TAbstractType>)arguments.get(0));
			return null;
		case BasicPackage.TABSTRACT_TYPE___IS_INNER_TYPE__TABSTRACTTYPE:
			return isInnerType((TAbstractType)arguments.get(0));
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
		if (eIsProxy()) {
			return super.toString();
		}

		final StringBuilder result = new StringBuilder(super.toString());
		result.append(" (tLib: ");
		result.append(this.tLib);
		result.append(", tName: ");
		result.append(this.tName);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void fillSameType(final EList<TAbstractType> list) {
		boolean changed = false;
		final ArrayList<TAbstractType> copy = new ArrayList<>(list);

		for (final TAbstractType type : copy) {
			for (final TAbstractType innerType : type.getInnerTypes()) {
				if (!list.contains(innerType)) {
					list.add(innerType);
					changed = true;
				}
			}
			if ((type.getOuterType() != null) && !list.contains(type.getOuterType())) {
				list.add(type.getOuterType());
				changed = true;
			}
		}
		if (changed) {
			fillSameType(list);
		}
	}

	@Override
	public boolean isInnerType(final TAbstractType tAbstractType) {

		final EList<TAbstractType> list = new BasicEList<>();
		list.add(this);
		fillSameType(list);

		final EList<TAbstractType> listOther = new BasicEList<>();
		listOther.add(tAbstractType);
		fillSameType(listOther);

		return !Collections.disjoint(list, listOther);
	}

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
