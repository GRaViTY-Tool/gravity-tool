/**
 */
package org.gravity.modisco.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.TypeParameter;

import org.eclipse.modisco.java.emf.impl.ModelImpl;

import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MExtension;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MFieldName;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodName;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MGravity Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MGravityModelImpl#getMFieldDefinitions <em>MField Definitions</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MGravityModelImpl#getAnonymousClassDeclarations <em>Anonymous Class Declarations</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MGravityModelImpl#getMMethodNames <em>MMethod Names</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MGravityModelImpl#getMFieldNames <em>MField Names</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MGravityModelImpl#getMAbstractMethodDefinitions <em>MAbstract Method Definitions</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MGravityModelImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MGravityModelImpl#getMExtensions <em>MExtensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MGravityModelImpl extends ModelImpl implements MGravityModel {
	/**
	 * The cached value of the '{@link #getMFieldDefinitions() <em>MField Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFieldDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<MFieldDefinition> mFieldDefinitions;

	/**
	 * The cached value of the '{@link #getAnonymousClassDeclarations() <em>Anonymous Class Declarations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousClassDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<AnonymousClassDeclaration> anonymousClassDeclarations;

	/**
	 * The cached value of the '{@link #getMMethodNames() <em>MMethod Names</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMethodNames()
	 * @generated
	 * @ordered
	 */
	protected EList<MMethodName> mMethodNames;

	/**
	 * The cached value of the '{@link #getMFieldNames() <em>MField Names</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFieldNames()
	 * @generated
	 * @ordered
	 */
	protected EList<MFieldName> mFieldNames;

	/**
	 * The cached value of the '{@link #getMAbstractMethodDefinitions() <em>MAbstract Method Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAbstractMethodDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<MAbstractMethodDefinition> mAbstractMethodDefinitions;

	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeParameter> typeParameters;

	/**
	 * The cached value of the '{@link #getMExtensions() <em>MExtensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<MExtension> mExtensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MGravityModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MGRAVITY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFieldDefinition> getMFieldDefinitions() {
		if (mFieldDefinitions == null) {
			mFieldDefinitions = new EObjectResolvingEList<MFieldDefinition>(MFieldDefinition.class, this, ModiscoPackage.MGRAVITY_MODEL__MFIELD_DEFINITIONS);
		}
		return mFieldDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnonymousClassDeclaration> getAnonymousClassDeclarations() {
		if (anonymousClassDeclarations == null) {
			anonymousClassDeclarations = new EObjectResolvingEList<AnonymousClassDeclaration>(AnonymousClassDeclaration.class, this, ModiscoPackage.MGRAVITY_MODEL__ANONYMOUS_CLASS_DECLARATIONS);
		}
		return anonymousClassDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MMethodName> getMMethodNames() {
		if (mMethodNames == null) {
			mMethodNames = new EObjectContainmentEList<MMethodName>(MMethodName.class, this, ModiscoPackage.MGRAVITY_MODEL__MMETHOD_NAMES);
		}
		return mMethodNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFieldName> getMFieldNames() {
		if (mFieldNames == null) {
			mFieldNames = new EObjectContainmentEList<MFieldName>(MFieldName.class, this, ModiscoPackage.MGRAVITY_MODEL__MFIELD_NAMES);
		}
		return mFieldNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MAbstractMethodDefinition> getMAbstractMethodDefinitions() {
		if (mAbstractMethodDefinitions == null) {
			mAbstractMethodDefinitions = new EObjectResolvingEList<MAbstractMethodDefinition>(MAbstractMethodDefinition.class, this, ModiscoPackage.MGRAVITY_MODEL__MABSTRACT_METHOD_DEFINITIONS);
		}
		return mAbstractMethodDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeParameter> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EObjectResolvingEList<TypeParameter>(TypeParameter.class, this, ModiscoPackage.MGRAVITY_MODEL__TYPE_PARAMETERS);
		}
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MExtension> getMExtensions() {
		if (mExtensions == null) {
			mExtensions = new EObjectContainmentEList<MExtension>(MExtension.class, this, ModiscoPackage.MGRAVITY_MODEL__MEXTENSIONS);
		}
		return mExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_NAMES:
				return ((InternalEList<?>)getMMethodNames()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_NAMES:
				return ((InternalEList<?>)getMFieldNames()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MGRAVITY_MODEL__MEXTENSIONS:
				return ((InternalEList<?>)getMExtensions()).basicRemove(otherEnd, msgs);
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
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_DEFINITIONS:
				return getMFieldDefinitions();
			case ModiscoPackage.MGRAVITY_MODEL__ANONYMOUS_CLASS_DECLARATIONS:
				return getAnonymousClassDeclarations();
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_NAMES:
				return getMMethodNames();
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_NAMES:
				return getMFieldNames();
			case ModiscoPackage.MGRAVITY_MODEL__MABSTRACT_METHOD_DEFINITIONS:
				return getMAbstractMethodDefinitions();
			case ModiscoPackage.MGRAVITY_MODEL__TYPE_PARAMETERS:
				return getTypeParameters();
			case ModiscoPackage.MGRAVITY_MODEL__MEXTENSIONS:
				return getMExtensions();
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
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_DEFINITIONS:
				getMFieldDefinitions().clear();
				getMFieldDefinitions().addAll((Collection<? extends MFieldDefinition>)newValue);
				return;
			case ModiscoPackage.MGRAVITY_MODEL__ANONYMOUS_CLASS_DECLARATIONS:
				getAnonymousClassDeclarations().clear();
				getAnonymousClassDeclarations().addAll((Collection<? extends AnonymousClassDeclaration>)newValue);
				return;
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_NAMES:
				getMMethodNames().clear();
				getMMethodNames().addAll((Collection<? extends MMethodName>)newValue);
				return;
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_NAMES:
				getMFieldNames().clear();
				getMFieldNames().addAll((Collection<? extends MFieldName>)newValue);
				return;
			case ModiscoPackage.MGRAVITY_MODEL__MABSTRACT_METHOD_DEFINITIONS:
				getMAbstractMethodDefinitions().clear();
				getMAbstractMethodDefinitions().addAll((Collection<? extends MAbstractMethodDefinition>)newValue);
				return;
			case ModiscoPackage.MGRAVITY_MODEL__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
				return;
			case ModiscoPackage.MGRAVITY_MODEL__MEXTENSIONS:
				getMExtensions().clear();
				getMExtensions().addAll((Collection<? extends MExtension>)newValue);
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
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_DEFINITIONS:
				getMFieldDefinitions().clear();
				return;
			case ModiscoPackage.MGRAVITY_MODEL__ANONYMOUS_CLASS_DECLARATIONS:
				getAnonymousClassDeclarations().clear();
				return;
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_NAMES:
				getMMethodNames().clear();
				return;
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_NAMES:
				getMFieldNames().clear();
				return;
			case ModiscoPackage.MGRAVITY_MODEL__MABSTRACT_METHOD_DEFINITIONS:
				getMAbstractMethodDefinitions().clear();
				return;
			case ModiscoPackage.MGRAVITY_MODEL__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case ModiscoPackage.MGRAVITY_MODEL__MEXTENSIONS:
				getMExtensions().clear();
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
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_DEFINITIONS:
				return mFieldDefinitions != null && !mFieldDefinitions.isEmpty();
			case ModiscoPackage.MGRAVITY_MODEL__ANONYMOUS_CLASS_DECLARATIONS:
				return anonymousClassDeclarations != null && !anonymousClassDeclarations.isEmpty();
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_NAMES:
				return mMethodNames != null && !mMethodNames.isEmpty();
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_NAMES:
				return mFieldNames != null && !mFieldNames.isEmpty();
			case ModiscoPackage.MGRAVITY_MODEL__MABSTRACT_METHOD_DEFINITIONS:
				return mAbstractMethodDefinitions != null && !mAbstractMethodDefinitions.isEmpty();
			case ModiscoPackage.MGRAVITY_MODEL__TYPE_PARAMETERS:
				return typeParameters != null && !typeParameters.isEmpty();
			case ModiscoPackage.MGRAVITY_MODEL__MEXTENSIONS:
				return mExtensions != null && !mExtensions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MGravityModelImpl
