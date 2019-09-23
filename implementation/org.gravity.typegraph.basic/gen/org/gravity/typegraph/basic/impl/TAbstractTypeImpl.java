/**
 */
package org.gravity.typegraph.basic.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
// [user defined imports] -->
// <-- [user defined imports]
import java.util.LinkedList;
import java.util.List;

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
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.impl.TAnnotatableImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>TAbstract Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl#getPg <em>Pg</em>}</li>
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeGraph getPg() {
		if (eContainerFeatureID() != BasicPackage.TABSTRACT_TYPE__PG) return null;
		return (TypeGraph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPg(TypeGraph newPg, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPg, BasicPackage.TABSTRACT_TYPE__PG, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPg(TypeGraph newPg) {
		if (newPg != eInternalContainer() || (eContainerFeatureID() != BasicPackage.TABSTRACT_TYPE__PG && newPg != null)) {
			if (EcoreUtil.isAncestor(this, newPg))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPg != null)
				msgs = ((InternalEObject)newPg).eInverseAdd(this, BasicPackage.TYPE_GRAPH__OWNED_TYPES, TypeGraph.class, msgs);
			msgs = basicSetPg(newPg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__PG, newPg, newPg));
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
				msgs = ((InternalEObject)package_).eInverseRemove(this, BasicPackage.TPACKAGE__OWNED_TYPES, TPackage.class, msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, BasicPackage.TPACKAGE__OWNED_TYPES, TPackage.class, msgs);
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public abstract boolean isSuperTypeOf(TAbstractType tType);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public boolean isSubTypeOf(TAbstractType tType) {
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
		if (getTName().equals("Anonymous")) {
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
				if (name.length() > 0 && !name.endsWith("$") && !name.endsWith("$1")) { //$NON-NLS-1$ //$NON-NLS-2$
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
	public TMethodSignature getTMethodSignature(String signature) {
		// [user code injected with eMoflon]
		final String voidString = ":void";
		for (final TSignature sig : getSignature()) {
			if (sig instanceof TMethodSignature) {
				String sigString = sig.getSignatureString().replaceAll(" ", "");

				if (sigString.endsWith(voidString)) {
					sigString = sigString.substring(0, sigString.length() - voidString.length());
				}
				String methodSigString = signature.replaceAll(" ", "");
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
	public TMethodDefinition getTMethodDefinition(String signature) {
		// [user code injected with eMoflon]
		final String voidString = ":void";
		for (final TMember def : getDefines()) {
			if (def instanceof TMethodDefinition) {
				String sigString = def.getSignatureString().replaceAll(" ", "");

				if (sigString.endsWith(voidString)) {
					sigString = sigString.substring(0, sigString.length() - voidString.length());
				}
				String methodSigString = signature.replaceAll(" ", "");
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
	public TMember getTDefinition(TSignature signature) {
		// [user code injected with eMoflon]
		return signature.getTDefinition(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TMember getTDefinition(String signatureString) {
		final String voidString = ":void";
		String searchedSignatureString = signatureString.replaceAll(" ", "");
		for (final TMember def : getDefines()) {
			String nextSignatureString = def.getSignatureString().replaceAll(" ", "");
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
	public boolean hasTMember(TMember member) {
		// [user code injected with eMoflon]
		return this.equals(member.getDefinedBy());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicPackage.TABSTRACT_TYPE__PG:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPg((TypeGraph)otherEnd, msgs);
			case BasicPackage.TABSTRACT_TYPE__PACKAGE:
				if (package_ != null)
					msgs = ((InternalEObject)package_).eInverseRemove(this, BasicPackage.TPACKAGE__OWNED_TYPES, TPackage.class, msgs);
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
			case BasicPackage.TABSTRACT_TYPE__PG:
				return basicSetPg(null, msgs);
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
			case BasicPackage.TABSTRACT_TYPE__PG:
				return eInternalContainer().eInverseRemove(this, BasicPackage.TYPE_GRAPH__OWNED_TYPES, TypeGraph.class, msgs);
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
			case BasicPackage.TABSTRACT_TYPE__PG:
				return getPg();
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
			case BasicPackage.TABSTRACT_TYPE__PG:
				setPg((TypeGraph)newValue);
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
			case BasicPackage.TABSTRACT_TYPE__PG:
				setPg((TypeGraph)null);
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
			case BasicPackage.TABSTRACT_TYPE__PG:
				return getPg() != null;
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
			case BasicPackage.TABSTRACT_TYPE___FILL_SAME_TYPE__ELIST:
				fillSameType((EList<TAbstractType>)arguments.get(0));
				return null;
			case BasicPackage.TABSTRACT_TYPE___IS_INNER_TYPE__TABSTRACTTYPE:
				return isInnerType((TAbstractType)arguments.get(0));
			case BasicPackage.TABSTRACT_TYPE___GET_REAL_PACKAGE__TABSTRACTTYPE:
				return getRealPackage((TAbstractType)arguments.get(0));
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
	public abstract boolean hasCommonSuperType(TAbstractType tAbstractType);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void fillSameType(EList<TAbstractType> list) {
		boolean changed = false;
		final ArrayList<TAbstractType> copy = new ArrayList<>(list);

		for (final TAbstractType type : copy) {
			for (final TAbstractType innerType : type.getInnerTypes()) {
				if (!list.contains(innerType)) {
					list.add(innerType);
					changed = true;
				}
			}
			if (type.getOuterType() != null && !list.contains(type.getOuterType())) {
				list.add(type.getOuterType());
				changed = true;
			}
		}
		if (changed) {
			fillSameType(list);
		}
	}

	@Override
	public boolean isInnerType(TAbstractType tAbstractType) {

		final EList<TAbstractType> list = new BasicEList<>();
		list.add(this);
		fillSameType(list);

		final EList<TAbstractType> listOther = new BasicEList<>();
		listOther.add(tAbstractType);
		fillSameType(listOther);

		return !Collections.disjoint(list, listOther);
	}

	@Override
	public TPackage getRealPackage(TAbstractType type) {

		if (type.getOuterType() != null) {
			return getRealPackage(type.getOuterType());
		} else {
			return type.getPackage();
		}
	}

	// [user code injected with eMoflon] -->
} // TAbstractTypeImpl
