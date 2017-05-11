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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TClassEntity;
import org.gravity.typegraph.basic.TInterface;

import org.gravity.typegraph.basic.containers.TMemberContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TClassImpl#getParentClass <em>Parent Class</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TClassImpl#getChildClasses <em>Child Classes</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TClassImpl#getTClassEntity <em>TClass Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TClassImpl extends TAbstractTypeImpl implements TClass {
	/**
	 * The cached value of the '{@link #getParentClass() <em>Parent Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentClass()
	 * @generated
	 * @ordered
	 */
	protected TClass parentClass;

	/**
	 * The cached value of the '{@link #getChildClasses() <em>Child Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<TClass> childClasses;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<TInterface> implements_;

	/**
	 * The cached value of the '{@link #getTClassEntity() <em>TClass Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTClassEntity()
	 * @generated
	 * @ordered
	 */
	protected TClassEntity tClassEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass getParentClass() {
		if (parentClass != null && parentClass.eIsProxy()) {
			InternalEObject oldParentClass = (InternalEObject) parentClass;
			parentClass = (TClass) eResolveProxy(oldParentClass);
			if (parentClass != oldParentClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TCLASS__PARENT_CLASS,
							oldParentClass, parentClass));
			}
		}
		return parentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetParentClass() {
		return parentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentClass(TClass newParentClass, NotificationChain msgs) {
		TClass oldParentClass = parentClass;
		parentClass = newParentClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BasicPackage.TCLASS__PARENT_CLASS, oldParentClass, newParentClass);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentClass(TClass newParentClass) {
		if (newParentClass != parentClass) {
			NotificationChain msgs = null;
			if (parentClass != null)
				msgs = ((InternalEObject) parentClass).eInverseRemove(this, BasicPackage.TCLASS__CHILD_CLASSES,
						TClass.class, msgs);
			if (newParentClass != null)
				msgs = ((InternalEObject) newParentClass).eInverseAdd(this, BasicPackage.TCLASS__CHILD_CLASSES,
						TClass.class, msgs);
			msgs = basicSetParentClass(newParentClass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TCLASS__PARENT_CLASS, newParentClass,
					newParentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TClass> getChildClasses() {
		if (childClasses == null) {
			childClasses = new EObjectWithInverseResolvingEList<TClass>(TClass.class, this,
					BasicPackage.TCLASS__CHILD_CLASSES, BasicPackage.TCLASS__PARENT_CLASS);
		}
		return childClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TInterface> getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectWithInverseResolvingEList.ManyInverse<TInterface>(TInterface.class, this,
					BasicPackage.TCLASS__IMPLEMENTS, BasicPackage.TINTERFACE__IMPLEMENTED_BY);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClassEntity getTClassEntity() {
		if (tClassEntity != null && tClassEntity.eIsProxy()) {
			InternalEObject oldTClassEntity = (InternalEObject) tClassEntity;
			tClassEntity = (TClassEntity) eResolveProxy(oldTClassEntity);
			if (tClassEntity != oldTClassEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TCLASS__TCLASS_ENTITY,
							oldTClassEntity, tClassEntity));
			}
		}
		return tClassEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClassEntity basicGetTClassEntity() {
		return tClassEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTClassEntity(TClassEntity newTClassEntity, NotificationChain msgs) {
		TClassEntity oldTClassEntity = tClassEntity;
		tClassEntity = newTClassEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BasicPackage.TCLASS__TCLASS_ENTITY, oldTClassEntity, newTClassEntity);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTClassEntity(TClassEntity newTClassEntity) {
		if (newTClassEntity != tClassEntity) {
			NotificationChain msgs = null;
			if (tClassEntity != null)
				msgs = ((InternalEObject) tClassEntity).eInverseRemove(this, BasicPackage.TCLASS_ENTITY__TCLASS,
						TClassEntity.class, msgs);
			if (newTClassEntity != null)
				msgs = ((InternalEObject) newTClassEntity).eInverseAdd(this, BasicPackage.TCLASS_ENTITY__TCLASS,
						TClassEntity.class, msgs);
			msgs = basicSetTClassEntity(newTClassEntity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TCLASS__TCLASS_ENTITY, newTClassEntity,
					newTClassEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMemberContainer getAllTMembers() {
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
		case BasicPackage.TCLASS__PARENT_CLASS:
			if (parentClass != null)
				msgs = ((InternalEObject) parentClass).eInverseRemove(this, BasicPackage.TCLASS__CHILD_CLASSES,
						TClass.class, msgs);
			return basicSetParentClass((TClass) otherEnd, msgs);
		case BasicPackage.TCLASS__CHILD_CLASSES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getChildClasses()).basicAdd(otherEnd, msgs);
		case BasicPackage.TCLASS__IMPLEMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getImplements()).basicAdd(otherEnd, msgs);
		case BasicPackage.TCLASS__TCLASS_ENTITY:
			if (tClassEntity != null)
				msgs = ((InternalEObject) tClassEntity).eInverseRemove(this, BasicPackage.TCLASS_ENTITY__TCLASS,
						TClassEntity.class, msgs);
			return basicSetTClassEntity((TClassEntity) otherEnd, msgs);
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
		case BasicPackage.TCLASS__PARENT_CLASS:
			return basicSetParentClass(null, msgs);
		case BasicPackage.TCLASS__CHILD_CLASSES:
			return ((InternalEList<?>) getChildClasses()).basicRemove(otherEnd, msgs);
		case BasicPackage.TCLASS__IMPLEMENTS:
			return ((InternalEList<?>) getImplements()).basicRemove(otherEnd, msgs);
		case BasicPackage.TCLASS__TCLASS_ENTITY:
			return basicSetTClassEntity(null, msgs);
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
		case BasicPackage.TCLASS__PARENT_CLASS:
			if (resolve)
				return getParentClass();
			return basicGetParentClass();
		case BasicPackage.TCLASS__CHILD_CLASSES:
			return getChildClasses();
		case BasicPackage.TCLASS__IMPLEMENTS:
			return getImplements();
		case BasicPackage.TCLASS__TCLASS_ENTITY:
			if (resolve)
				return getTClassEntity();
			return basicGetTClassEntity();
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
		case BasicPackage.TCLASS__PARENT_CLASS:
			setParentClass((TClass) newValue);
			return;
		case BasicPackage.TCLASS__CHILD_CLASSES:
			getChildClasses().clear();
			getChildClasses().addAll((Collection<? extends TClass>) newValue);
			return;
		case BasicPackage.TCLASS__IMPLEMENTS:
			getImplements().clear();
			getImplements().addAll((Collection<? extends TInterface>) newValue);
			return;
		case BasicPackage.TCLASS__TCLASS_ENTITY:
			setTClassEntity((TClassEntity) newValue);
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
		case BasicPackage.TCLASS__PARENT_CLASS:
			setParentClass((TClass) null);
			return;
		case BasicPackage.TCLASS__CHILD_CLASSES:
			getChildClasses().clear();
			return;
		case BasicPackage.TCLASS__IMPLEMENTS:
			getImplements().clear();
			return;
		case BasicPackage.TCLASS__TCLASS_ENTITY:
			setTClassEntity((TClassEntity) null);
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
		case BasicPackage.TCLASS__PARENT_CLASS:
			return parentClass != null;
		case BasicPackage.TCLASS__CHILD_CLASSES:
			return childClasses != null && !childClasses.isEmpty();
		case BasicPackage.TCLASS__IMPLEMENTS:
			return implements_ != null && !implements_.isEmpty();
		case BasicPackage.TCLASS__TCLASS_ENTITY:
			return tClassEntity != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case BasicPackage.TCLASS___GET_ALL_TMEMBERS:
			return getAllTMembers();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TClassImpl
