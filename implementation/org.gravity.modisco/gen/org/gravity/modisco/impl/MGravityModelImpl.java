/**
 */
package org.gravity.modisco.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmt.modisco.java.AnonymousClassDeclaration;
import org.eclipse.gmt.modisco.java.TypeParameter;

import org.eclipse.gmt.modisco.java.emf.impl.ModelImpl;

import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MConstructorDefinition;
import org.gravity.modisco.MExtension;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MFieldName;
import org.gravity.modisco.MFieldSignature;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MMethodName;
import org.gravity.modisco.MMethodSignature;
import org.gravity.modisco.MName;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MGravity Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MGravityModelImpl#getMMethodDefinitions <em>MMethod Definitions</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MGravityModelImpl#getMFieldDefinitions <em>MField Definitions</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MGravityModelImpl#getMConstructorDefinitions <em>MConstructor Definitions</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MGravityModelImpl#getAnonymousClassDeclarations <em>Anonymous Class Declarations</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MGravityModelImpl#getMMethodNames <em>MMethod Names</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MGravityModelImpl#getMNames <em>MNames</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MGravityModelImpl#getMMethodSignatures <em>MMethod Signatures</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MGravityModelImpl#getMFieldSignatures <em>MField Signatures</em>}</li>
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
	 * The cached value of the '{@link #getMMethodDefinitions() <em>MMethod Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMethodDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<MMethodDefinition> mMethodDefinitions;

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
	 * The cached value of the '{@link #getMConstructorDefinitions() <em>MConstructor Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMConstructorDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<MConstructorDefinition> mConstructorDefinitions;

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
	 * The cached value of the '{@link #getMNames() <em>MNames</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMNames()
	 * @generated
	 * @ordered
	 */
	protected EList<MName> mNames;

	/**
	 * The cached value of the '{@link #getMMethodSignatures() <em>MMethod Signatures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMethodSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<MMethodSignature> mMethodSignatures;

	/**
	 * The cached value of the '{@link #getMFieldSignatures() <em>MField Signatures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFieldSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<MFieldSignature> mFieldSignatures;

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
	public EList<MMethodDefinition> getMMethodDefinitions() {
		if (mMethodDefinitions == null) {
			mMethodDefinitions = new EObjectWithInverseResolvingEList<MMethodDefinition>(MMethodDefinition.class, this, ModiscoPackage.MGRAVITY_MODEL__MMETHOD_DEFINITIONS, ModiscoPackage.MMETHOD_DEFINITION__MODEL);
		}
		return mMethodDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFieldDefinition> getMFieldDefinitions() {
		if (mFieldDefinitions == null) {
			mFieldDefinitions = new EObjectWithInverseResolvingEList<MFieldDefinition>(MFieldDefinition.class, this, ModiscoPackage.MGRAVITY_MODEL__MFIELD_DEFINITIONS, ModiscoPackage.MFIELD_DEFINITION__MODEL);
		}
		return mFieldDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MConstructorDefinition> getMConstructorDefinitions() {
		if (mConstructorDefinitions == null) {
			mConstructorDefinitions = new EObjectWithInverseResolvingEList<MConstructorDefinition>(MConstructorDefinition.class, this, ModiscoPackage.MGRAVITY_MODEL__MCONSTRUCTOR_DEFINITIONS, ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL);
		}
		return mConstructorDefinitions;
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
			mMethodNames = new EObjectContainmentWithInverseEList<MMethodName>(MMethodName.class, this, ModiscoPackage.MGRAVITY_MODEL__MMETHOD_NAMES, ModiscoPackage.MMETHOD_NAME__MODEL);
		}
		return mMethodNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MName> getMNames() {
		if (mNames == null) {
			mNames = new EObjectResolvingEList<MName>(MName.class, this, ModiscoPackage.MGRAVITY_MODEL__MNAMES);
		}
		return mNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MMethodSignature> getMMethodSignatures() {
		if (mMethodSignatures == null) {
			mMethodSignatures = new EObjectContainmentWithInverseEList<MMethodSignature>(MMethodSignature.class, this, ModiscoPackage.MGRAVITY_MODEL__MMETHOD_SIGNATURES, ModiscoPackage.MMETHOD_SIGNATURE__MODEL);
		}
		return mMethodSignatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFieldSignature> getMFieldSignatures() {
		if (mFieldSignatures == null) {
			mFieldSignatures = new EObjectContainmentWithInverseEList<MFieldSignature>(MFieldSignature.class, this, ModiscoPackage.MGRAVITY_MODEL__MFIELD_SIGNATURES, ModiscoPackage.MFIELD_SIGNATURE__MODEL);
		}
		return mFieldSignatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFieldName> getMFieldNames() {
		if (mFieldNames == null) {
			mFieldNames = new EObjectContainmentWithInverseEList<MFieldName>(MFieldName.class, this, ModiscoPackage.MGRAVITY_MODEL__MFIELD_NAMES, ModiscoPackage.MFIELD_NAME__MODEL);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_DEFINITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMMethodDefinitions()).basicAdd(otherEnd, msgs);
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_DEFINITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMFieldDefinitions()).basicAdd(otherEnd, msgs);
			case ModiscoPackage.MGRAVITY_MODEL__MCONSTRUCTOR_DEFINITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMConstructorDefinitions()).basicAdd(otherEnd, msgs);
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_NAMES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMMethodNames()).basicAdd(otherEnd, msgs);
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_SIGNATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMMethodSignatures()).basicAdd(otherEnd, msgs);
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_SIGNATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMFieldSignatures()).basicAdd(otherEnd, msgs);
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_NAMES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMFieldNames()).basicAdd(otherEnd, msgs);
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
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_DEFINITIONS:
				return ((InternalEList<?>)getMMethodDefinitions()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_DEFINITIONS:
				return ((InternalEList<?>)getMFieldDefinitions()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MGRAVITY_MODEL__MCONSTRUCTOR_DEFINITIONS:
				return ((InternalEList<?>)getMConstructorDefinitions()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_NAMES:
				return ((InternalEList<?>)getMMethodNames()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_SIGNATURES:
				return ((InternalEList<?>)getMMethodSignatures()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_SIGNATURES:
				return ((InternalEList<?>)getMFieldSignatures()).basicRemove(otherEnd, msgs);
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
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_DEFINITIONS:
				return getMMethodDefinitions();
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_DEFINITIONS:
				return getMFieldDefinitions();
			case ModiscoPackage.MGRAVITY_MODEL__MCONSTRUCTOR_DEFINITIONS:
				return getMConstructorDefinitions();
			case ModiscoPackage.MGRAVITY_MODEL__ANONYMOUS_CLASS_DECLARATIONS:
				return getAnonymousClassDeclarations();
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_NAMES:
				return getMMethodNames();
			case ModiscoPackage.MGRAVITY_MODEL__MNAMES:
				return getMNames();
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_SIGNATURES:
				return getMMethodSignatures();
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_SIGNATURES:
				return getMFieldSignatures();
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
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_DEFINITIONS:
				getMMethodDefinitions().clear();
				getMMethodDefinitions().addAll((Collection<? extends MMethodDefinition>)newValue);
				return;
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_DEFINITIONS:
				getMFieldDefinitions().clear();
				getMFieldDefinitions().addAll((Collection<? extends MFieldDefinition>)newValue);
				return;
			case ModiscoPackage.MGRAVITY_MODEL__MCONSTRUCTOR_DEFINITIONS:
				getMConstructorDefinitions().clear();
				getMConstructorDefinitions().addAll((Collection<? extends MConstructorDefinition>)newValue);
				return;
			case ModiscoPackage.MGRAVITY_MODEL__ANONYMOUS_CLASS_DECLARATIONS:
				getAnonymousClassDeclarations().clear();
				getAnonymousClassDeclarations().addAll((Collection<? extends AnonymousClassDeclaration>)newValue);
				return;
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_NAMES:
				getMMethodNames().clear();
				getMMethodNames().addAll((Collection<? extends MMethodName>)newValue);
				return;
			case ModiscoPackage.MGRAVITY_MODEL__MNAMES:
				getMNames().clear();
				getMNames().addAll((Collection<? extends MName>)newValue);
				return;
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_SIGNATURES:
				getMMethodSignatures().clear();
				getMMethodSignatures().addAll((Collection<? extends MMethodSignature>)newValue);
				return;
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_SIGNATURES:
				getMFieldSignatures().clear();
				getMFieldSignatures().addAll((Collection<? extends MFieldSignature>)newValue);
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
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_DEFINITIONS:
				getMMethodDefinitions().clear();
				return;
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_DEFINITIONS:
				getMFieldDefinitions().clear();
				return;
			case ModiscoPackage.MGRAVITY_MODEL__MCONSTRUCTOR_DEFINITIONS:
				getMConstructorDefinitions().clear();
				return;
			case ModiscoPackage.MGRAVITY_MODEL__ANONYMOUS_CLASS_DECLARATIONS:
				getAnonymousClassDeclarations().clear();
				return;
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_NAMES:
				getMMethodNames().clear();
				return;
			case ModiscoPackage.MGRAVITY_MODEL__MNAMES:
				getMNames().clear();
				return;
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_SIGNATURES:
				getMMethodSignatures().clear();
				return;
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_SIGNATURES:
				getMFieldSignatures().clear();
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
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_DEFINITIONS:
				return mMethodDefinitions != null && !mMethodDefinitions.isEmpty();
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_DEFINITIONS:
				return mFieldDefinitions != null && !mFieldDefinitions.isEmpty();
			case ModiscoPackage.MGRAVITY_MODEL__MCONSTRUCTOR_DEFINITIONS:
				return mConstructorDefinitions != null && !mConstructorDefinitions.isEmpty();
			case ModiscoPackage.MGRAVITY_MODEL__ANONYMOUS_CLASS_DECLARATIONS:
				return anonymousClassDeclarations != null && !anonymousClassDeclarations.isEmpty();
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_NAMES:
				return mMethodNames != null && !mMethodNames.isEmpty();
			case ModiscoPackage.MGRAVITY_MODEL__MNAMES:
				return mNames != null && !mNames.isEmpty();
			case ModiscoPackage.MGRAVITY_MODEL__MMETHOD_SIGNATURES:
				return mMethodSignatures != null && !mMethodSignatures.isEmpty();
			case ModiscoPackage.MGRAVITY_MODEL__MFIELD_SIGNATURES:
				return mFieldSignatures != null && !mFieldSignatures.isEmpty();
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
