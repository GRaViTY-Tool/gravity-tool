/**
 */
package org.gravity.modisco.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.modisco.java.ConstructorDeclaration;
import org.gravity.modisco.MConstructorDefinition;
import org.gravity.modisco.MEntry;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MParameterList;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MConstructor Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MConstructorDefinitionImpl#getMFirstEntry <em>MFirst Entry</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MConstructorDefinitionImpl#getMEntrys <em>MEntrys</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MConstructorDefinitionImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MConstructorDefinitionImpl extends MAbstractMethodDefinitionImpl implements MConstructorDefinition {
	/**
	 * The cached value of the '{@link #getMFirstEntry() <em>MFirst Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFirstEntry()
	 * @generated
	 * @ordered
	 */
	protected MEntry mFirstEntry;

	/**
	 * The cached value of the '{@link #getMEntrys() <em>MEntrys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMEntrys()
	 * @generated
	 * @ordered
	 */
	protected EList<MEntry> mEntrys;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected MGravityModel model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MConstructorDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MCONSTRUCTOR_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEntry getMFirstEntry() {
		if (mFirstEntry != null && mFirstEntry.eIsProxy()) {
			InternalEObject oldMFirstEntry = (InternalEObject)mFirstEntry;
			mFirstEntry = (MEntry)eResolveProxy(oldMFirstEntry);
			if (mFirstEntry != oldMFirstEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MCONSTRUCTOR_DEFINITION__MFIRST_ENTRY, oldMFirstEntry, mFirstEntry));
			}
		}
		return mFirstEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEntry basicGetMFirstEntry() {
		return mFirstEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMFirstEntry(MEntry newMFirstEntry) {
		MEntry oldMFirstEntry = mFirstEntry;
		mFirstEntry = newMFirstEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MCONSTRUCTOR_DEFINITION__MFIRST_ENTRY, oldMFirstEntry, mFirstEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MEntry> getMEntrys() {
		if (mEntrys == null) {
			mEntrys = new EObjectContainmentEList<MEntry>(MEntry.class, this, ModiscoPackage.MCONSTRUCTOR_DEFINITION__MENTRYS);
		}
		return mEntrys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGravityModel getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (MGravityModel)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGravityModel basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(MGravityModel newModel, NotificationChain msgs) {
		MGravityModel oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL, oldModel, newModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(MGravityModel newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject)model).eInverseRemove(this, ModiscoPackage.MGRAVITY_MODEL__MCONSTRUCTOR_DEFINITIONS, MGravityModel.class, msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, ModiscoPackage.MGRAVITY_MODEL__MCONSTRUCTOR_DEFINITIONS, MGravityModel.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL:
				if (model != null)
					msgs = ((InternalEObject)model).eInverseRemove(this, ModiscoPackage.MGRAVITY_MODEL__MCONSTRUCTOR_DEFINITIONS, MGravityModel.class, msgs);
				return basicSetModel((MGravityModel)otherEnd, msgs);
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
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MENTRYS:
				return ((InternalEList<?>)getMEntrys()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL:
				return basicSetModel(null, msgs);
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
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MFIRST_ENTRY:
				if (resolve) return getMFirstEntry();
				return basicGetMFirstEntry();
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MENTRYS:
				return getMEntrys();
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
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
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MFIRST_ENTRY:
				setMFirstEntry((MEntry)newValue);
				return;
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MENTRYS:
				getMEntrys().clear();
				getMEntrys().addAll((Collection<? extends MEntry>)newValue);
				return;
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL:
				setModel((MGravityModel)newValue);
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
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MFIRST_ENTRY:
				setMFirstEntry((MEntry)null);
				return;
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MENTRYS:
				getMEntrys().clear();
				return;
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL:
				setModel((MGravityModel)null);
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
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MFIRST_ENTRY:
				return mFirstEntry != null;
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MENTRYS:
				return mEntrys != null && !mEntrys.isEmpty();
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL:
				return model != null;
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
		if (baseClass == ConstructorDeclaration.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MParameterList.class) {
			switch (derivedFeatureID) {
				case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MFIRST_ENTRY: return ModiscoPackage.MPARAMETER_LIST__MFIRST_ENTRY;
				case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MENTRYS: return ModiscoPackage.MPARAMETER_LIST__MENTRYS;
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
		if (baseClass == ConstructorDeclaration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MParameterList.class) {
			switch (baseFeatureID) {
				case ModiscoPackage.MPARAMETER_LIST__MFIRST_ENTRY: return ModiscoPackage.MCONSTRUCTOR_DEFINITION__MFIRST_ENTRY;
				case ModiscoPackage.MPARAMETER_LIST__MENTRYS: return ModiscoPackage.MCONSTRUCTOR_DEFINITION__MENTRYS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MConstructorDefinitionImpl
