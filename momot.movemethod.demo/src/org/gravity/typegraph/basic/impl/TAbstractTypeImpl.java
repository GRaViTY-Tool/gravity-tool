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
import org.gravity.typegraph.basic.TAnnotatable;
import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAbstract Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl#getTAnnotation <em>TAnnotation</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl#getPg <em>Pg</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl#getDefines <em>Defines</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl#isTLib <em>TLib</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl#getTName <em>TName</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TAbstractTypeImpl extends TElementWithIdImpl implements TAbstractType {
	/**
	 * The cached value of the '{@link #getTAnnotation() <em>TAnnotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<TAnnotation> tAnnotation;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected EList<TSignature> signature;

	/**
	 * The cached value of the '{@link #getDefines() <em>Defines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefines()
	 * @generated
	 * @ordered
	 */
	protected EList<TMember> defines;

	/**
	 * The default value of the '{@link #isTLib() <em>TLib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTLib()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TLIB_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTLib() <em>TLib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTLib()
	 * @generated
	 * @ordered
	 */
	protected boolean tLib = TLIB_EDEFAULT;

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
	protected TAbstractTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	public EList<TAnnotation> getTAnnotation() {
		if (tAnnotation == null) {
			tAnnotation = new EObjectContainmentWithInverseEList<TAnnotation>(TAnnotation.class, this, BasicPackage.TABSTRACT_TYPE__TANNOTATION, BasicPackage.TANNOTATION__TANNOTATED);
		}
		return tAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraph getPg() {
		if (eContainerFeatureID() != BasicPackage.TABSTRACT_TYPE__PG) return null;
		return (TypeGraph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPg(TypeGraph newPg, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPg, BasicPackage.TABSTRACT_TYPE__PG, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TSignature> getSignature() {
		if (signature == null) {
			signature = new EObjectResolvingEList<TSignature>(TSignature.class, this, BasicPackage.TABSTRACT_TYPE__SIGNATURE);
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMember> getDefines() {
		if (defines == null) {
			defines = new EObjectWithInverseResolvingEList<TMember>(TMember.class, this, BasicPackage.TABSTRACT_TYPE__DEFINES, BasicPackage.TMEMBER__DEFINED_BY);
		}
		return defines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTLib() {
		return tLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTLib(boolean newTLib) {
		boolean oldTLib = tLib;
		tLib = newTLib;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__TLIB, oldTLib, tLib));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TABSTRACT_TYPE__TNAME, oldTName, tName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullyQualifiedName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case BasicPackage.TABSTRACT_TYPE__TANNOTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTAnnotation()).basicAdd(otherEnd, msgs);
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
			case BasicPackage.TABSTRACT_TYPE__TANNOTATION:
				return ((InternalEList<?>)getTAnnotation()).basicRemove(otherEnd, msgs);
			case BasicPackage.TABSTRACT_TYPE__PG:
				return basicSetPg(null, msgs);
			case BasicPackage.TABSTRACT_TYPE__PACKAGE:
				return basicSetPackage(null, msgs);
			case BasicPackage.TABSTRACT_TYPE__DEFINES:
				return ((InternalEList<?>)getDefines()).basicRemove(otherEnd, msgs);
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
			case BasicPackage.TABSTRACT_TYPE__PG:
				return eInternalContainer().eInverseRemove(this, BasicPackage.TYPE_GRAPH__OWNED_TYPES, TypeGraph.class, msgs);
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
			case BasicPackage.TABSTRACT_TYPE__TANNOTATION:
				return getTAnnotation();
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
			case BasicPackage.TABSTRACT_TYPE__TANNOTATION:
				getTAnnotation().clear();
				getTAnnotation().addAll((Collection<? extends TAnnotation>)newValue);
				return;
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
			case BasicPackage.TABSTRACT_TYPE__TANNOTATION:
				getTAnnotation().clear();
				return;
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
			case BasicPackage.TABSTRACT_TYPE__TANNOTATION:
				return tAnnotation != null && !tAnnotation.isEmpty();
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
		if (baseClass == TAnnotatable.class) {
			switch (derivedFeatureID) {
				case BasicPackage.TABSTRACT_TYPE__TANNOTATION: return BasicPackage.TANNOTATABLE__TANNOTATION;
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
		if (baseClass == TAnnotatable.class) {
			switch (baseFeatureID) {
				case BasicPackage.TANNOTATABLE__TANNOTATION: return BasicPackage.TABSTRACT_TYPE__TANNOTATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BasicPackage.TABSTRACT_TYPE___GET_FULLY_QUALIFIED_NAME:
				return getFullyQualifiedName();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tLib: ");
		result.append(tLib);
		result.append(", tName: ");
		result.append(tName);
		result.append(')');
		return result.toString();
	}

} //TAbstractTypeImpl
