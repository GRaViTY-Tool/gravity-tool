/**
 */
package org.gravity.typegraph.basic.impl;

import java.lang.reflect.InvocationTargetException;
import java.security.InvalidParameterException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.annotations.AnnotationsPackage;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAccess</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAccessImpl#getTAnnotation <em>TAnnotation</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAccessImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAccessImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAccessImpl#getStaticType <em>Static Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TAccessImpl extends TAbstractFlowElementImpl implements TAccess {
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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TMember target;

	/**
	 * The cached value of the '{@link #getStaticType() <em>Static Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticType()
	 * @generated
	 * @ordered
	 */
	protected TAbstractType staticType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TAccessImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAnnotation> getTAnnotation() {
		if (this.tAnnotation == null) {
			this.tAnnotation = new EObjectContainmentWithInverseEList<>(TAnnotation.class, this, BasicPackage.TACCESS__TANNOTATION, AnnotationsPackage.TANNOTATION__TANNOTATED);
		}
		return this.tAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMember getTarget() {
		if ((this.target != null) && this.target.eIsProxy()) {
			final InternalEObject oldTarget = (InternalEObject)this.target;
			this.target = (TMember)eResolveProxy(oldTarget);
			if ((this.target != oldTarget) && eNotificationRequired()) {
				eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TACCESS__TARGET, oldTarget, this.target));
			}
		}
		return this.target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMember basicGetTarget() {
		return this.target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(final TMember newTarget, NotificationChain msgs) {
		final TMember oldTarget = this.target;
		this.target = newTarget;
		if (eNotificationRequired()) {
			final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicPackage.TACCESS__TARGET, oldTarget, newTarget);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(final TMember newTarget) {
		if (newTarget != this.target) {
			NotificationChain msgs = null;
			if (this.target != null) {
				msgs = ((InternalEObject)this.target).eInverseRemove(this, BasicPackage.TMEMBER__ACCESSED_BY, TMember.class, msgs);
			}
			if (newTarget != null) {
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, BasicPackage.TMEMBER__ACCESSED_BY, TMember.class, msgs);
			}
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TACCESS__TARGET, newTarget, newTarget));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMember getSource() {
		if (eContainerFeatureID() != BasicPackage.TACCESS__SOURCE) {
			return null;
		}
		return (TMember)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(final TMember newSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSource, BasicPackage.TACCESS__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(final TMember newSource) {
		if ((newSource != eInternalContainer()) || ((eContainerFeatureID() != BasicPackage.TACCESS__SOURCE) && (newSource != null))) {
			if (EcoreUtil.isAncestor(this, newSource)) {
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			}
			NotificationChain msgs = null;
			if (eInternalContainer() != null) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			if (newSource != null) {
				msgs = ((InternalEObject)newSource).eInverseAdd(this, BasicPackage.TMEMBER__ACCESSING, TMember.class, msgs);
			}
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TACCESS__SOURCE, newSource, newSource));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractType getStaticType() {
		if ((this.staticType != null) && this.staticType.eIsProxy()) {
			final InternalEObject oldStaticType = (InternalEObject)this.staticType;
			this.staticType = (TAbstractType)eResolveProxy(oldStaticType);
			if ((this.staticType != oldStaticType) && eNotificationRequired()) {
				eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TACCESS__STATIC_TYPE, oldStaticType, this.staticType));
			}
		}
		return this.staticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType basicGetStaticType() {
		return this.staticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStaticType(final TAbstractType newStaticType) {
		final TAbstractType oldStaticType = this.staticType;
		this.staticType = newStaticType;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TACCESS__STATIC_TYPE, oldStaticType, this.staticType));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<TAnnotation> getTAnnotation(final EClass tType) {
		if (!tType.getEAllSuperTypes().contains(AnnotationsPackage.eINSTANCE.getTAnnotation())) {
			throw new InvalidParameterException();
		}
		final EList<TAnnotation> tAnnotations = new BasicEList<>();
		for (final TAnnotation tAnnotation : getTAnnotation()) {
			if (tAnnotation.eClass().equals(tType)) {
				tAnnotations.add(tAnnotation);
			}
		}
		return tAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicPackage.TACCESS__TANNOTATION:
			return ((InternalEList<InternalEObject>)(InternalEList<?>)getTAnnotation()).basicAdd(otherEnd, msgs);
		case BasicPackage.TACCESS__TARGET:
			if (this.target != null) {
				msgs = ((InternalEObject)this.target).eInverseRemove(this, BasicPackage.TMEMBER__ACCESSED_BY, TMember.class, msgs);
			}
			return basicSetTarget((TMember)otherEnd, msgs);
		case BasicPackage.TACCESS__SOURCE:
			if (eInternalContainer() != null) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			return basicSetSource((TMember)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
		switch (featureID) {
		case BasicPackage.TACCESS__TANNOTATION:
			return ((InternalEList<?>)getTAnnotation()).basicRemove(otherEnd, msgs);
		case BasicPackage.TACCESS__TARGET:
			return basicSetTarget(null, msgs);
		case BasicPackage.TACCESS__SOURCE:
			return basicSetSource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(final NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case BasicPackage.TACCESS__SOURCE:
			return eInternalContainer().eInverseRemove(this, BasicPackage.TMEMBER__ACCESSING, TMember.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case BasicPackage.TACCESS__TANNOTATION:
			return getTAnnotation();
		case BasicPackage.TACCESS__TARGET:
			if (resolve) {
				return getTarget();
			}
			return basicGetTarget();
		case BasicPackage.TACCESS__SOURCE:
			return getSource();
		case BasicPackage.TACCESS__STATIC_TYPE:
			if (resolve) {
				return getStaticType();
			}
			return basicGetStaticType();
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
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case BasicPackage.TACCESS__TANNOTATION:
			getTAnnotation().clear();
			getTAnnotation().addAll((Collection<? extends TAnnotation>)newValue);
			return;
		case BasicPackage.TACCESS__TARGET:
			setTarget((TMember)newValue);
			return;
		case BasicPackage.TACCESS__SOURCE:
			setSource((TMember)newValue);
			return;
		case BasicPackage.TACCESS__STATIC_TYPE:
			setStaticType((TAbstractType)newValue);
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
	public void eUnset(final int featureID) {
		switch (featureID) {
		case BasicPackage.TACCESS__TANNOTATION:
			getTAnnotation().clear();
			return;
		case BasicPackage.TACCESS__TARGET:
			setTarget((TMember)null);
			return;
		case BasicPackage.TACCESS__SOURCE:
			setSource((TMember)null);
			return;
		case BasicPackage.TACCESS__STATIC_TYPE:
			setStaticType((TAbstractType)null);
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
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
		case BasicPackage.TACCESS__TANNOTATION:
			return (this.tAnnotation != null) && !this.tAnnotation.isEmpty();
		case BasicPackage.TACCESS__TARGET:
			return this.target != null;
		case BasicPackage.TACCESS__SOURCE:
			return getSource() != null;
		case BasicPackage.TACCESS__STATIC_TYPE:
			return this.staticType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
		if (baseClass == TAnnotatable.class) {
			switch (derivedFeatureID) {
			case BasicPackage.TACCESS__TANNOTATION: return AnnotationsPackage.TANNOTATABLE__TANNOTATION;
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
	public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
		if (baseClass == TAnnotatable.class) {
			switch (baseFeatureID) {
			case AnnotationsPackage.TANNOTATABLE__TANNOTATION: return BasicPackage.TACCESS__TANNOTATION;
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
	public int eDerivedOperationID(final int baseOperationID, final Class<?> baseClass) {
		if (baseClass == TAnnotatable.class) {
			switch (baseOperationID) {
			case AnnotationsPackage.TANNOTATABLE___GET_TANNOTATION__ECLASS: return BasicPackage.TACCESS___GET_TANNOTATION__ECLASS;
			default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case BasicPackage.TACCESS___GET_TANNOTATION__ECLASS:
			return getTAnnotation((EClass)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TAccessImpl
