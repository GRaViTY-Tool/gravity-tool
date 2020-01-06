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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.AbstractMethodInvocation;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.Block;
import org.eclipse.modisco.java.MethodRef;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeParameter;

import org.eclipse.modisco.java.emf.JavaPackage;

import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MAbstract Method Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MAbstractMethodDefinitionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MAbstractMethodDefinitionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MAbstractMethodDefinitionImpl#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MAbstractMethodDefinitionImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MAbstractMethodDefinitionImpl#getUsagesInDocComments <em>Usages In Doc Comments</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MAbstractMethodDefinitionImpl#getUsages <em>Usages</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MAbstractMethodDefinitionImpl#getMInnerTypes <em>MInner Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MAbstractMethodDefinitionImpl extends MDefinitionImpl implements MAbstractMethodDefinition {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Block body;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVariableDeclaration> parameters;

	/**
	 * The cached value of the '{@link #getThrownExceptions() <em>Thrown Exceptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrownExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAccess> thrownExceptions;

	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeParameter> typeParameters;

	/**
	 * The cached value of the '{@link #getUsagesInDocComments() <em>Usages In Doc Comments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInDocComments()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodRef> usagesInDocComments;

	/**
	 * The cached value of the '{@link #getUsages() <em>Usages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsages()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMethodInvocation> usages;

	/**
	 * The cached value of the '{@link #getMInnerTypes() <em>MInner Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMInnerTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTypeDeclaration> mInnerTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MAbstractMethodDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MABSTRACT_METHOD_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Block newBody, NotificationChain msgs) {
		Block oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModiscoPackage.MABSTRACT_METHOD_DEFINITION__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Block newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModiscoPackage.MABSTRACT_METHOD_DEFINITION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModiscoPackage.MABSTRACT_METHOD_DEFINITION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MABSTRACT_METHOD_DEFINITION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SingleVariableDeclaration> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<SingleVariableDeclaration>(SingleVariableDeclaration.class, this, ModiscoPackage.MABSTRACT_METHOD_DEFINITION__PARAMETERS, JavaPackage.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAccess> getThrownExceptions() {
		if (thrownExceptions == null) {
			thrownExceptions = new EObjectContainmentEList<TypeAccess>(TypeAccess.class, this, ModiscoPackage.MABSTRACT_METHOD_DEFINITION__THROWN_EXCEPTIONS);
		}
		return thrownExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeParameter> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EObjectContainmentEList<TypeParameter>(TypeParameter.class, this, ModiscoPackage.MABSTRACT_METHOD_DEFINITION__TYPE_PARAMETERS);
		}
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodRef> getUsagesInDocComments() {
		if (usagesInDocComments == null) {
			usagesInDocComments = new EObjectWithInverseResolvingEList<MethodRef>(MethodRef.class, this, ModiscoPackage.MABSTRACT_METHOD_DEFINITION__USAGES_IN_DOC_COMMENTS, JavaPackage.METHOD_REF__METHOD);
		}
		return usagesInDocComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractMethodInvocation> getUsages() {
		if (usages == null) {
			usages = new EObjectWithInverseResolvingEList<AbstractMethodInvocation>(AbstractMethodInvocation.class, this, ModiscoPackage.MABSTRACT_METHOD_DEFINITION__USAGES, JavaPackage.ABSTRACT_METHOD_INVOCATION__METHOD);
		}
		return usages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTypeDeclaration> getMInnerTypes() {
		if (mInnerTypes == null) {
			mInnerTypes = new EObjectResolvingEList<AbstractTypeDeclaration>(AbstractTypeDeclaration.class, this, ModiscoPackage.MABSTRACT_METHOD_DEFINITION__MINNER_TYPES);
		}
		return mInnerTypes;
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
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__USAGES_IN_DOC_COMMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsagesInDocComments()).basicAdd(otherEnd, msgs);
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__USAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsages()).basicAdd(otherEnd, msgs);
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
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__BODY:
				return basicSetBody(null, msgs);
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__THROWN_EXCEPTIONS:
				return ((InternalEList<?>)getThrownExceptions()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__USAGES_IN_DOC_COMMENTS:
				return ((InternalEList<?>)getUsagesInDocComments()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__USAGES:
				return ((InternalEList<?>)getUsages()).basicRemove(otherEnd, msgs);
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
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__BODY:
				return getBody();
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__PARAMETERS:
				return getParameters();
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__THROWN_EXCEPTIONS:
				return getThrownExceptions();
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__TYPE_PARAMETERS:
				return getTypeParameters();
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__USAGES_IN_DOC_COMMENTS:
				return getUsagesInDocComments();
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__USAGES:
				return getUsages();
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__MINNER_TYPES:
				return getMInnerTypes();
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
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__BODY:
				setBody((Block)newValue);
				return;
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends SingleVariableDeclaration>)newValue);
				return;
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__THROWN_EXCEPTIONS:
				getThrownExceptions().clear();
				getThrownExceptions().addAll((Collection<? extends TypeAccess>)newValue);
				return;
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
				return;
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__USAGES_IN_DOC_COMMENTS:
				getUsagesInDocComments().clear();
				getUsagesInDocComments().addAll((Collection<? extends MethodRef>)newValue);
				return;
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__USAGES:
				getUsages().clear();
				getUsages().addAll((Collection<? extends AbstractMethodInvocation>)newValue);
				return;
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__MINNER_TYPES:
				getMInnerTypes().clear();
				getMInnerTypes().addAll((Collection<? extends AbstractTypeDeclaration>)newValue);
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
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__BODY:
				setBody((Block)null);
				return;
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__PARAMETERS:
				getParameters().clear();
				return;
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__THROWN_EXCEPTIONS:
				getThrownExceptions().clear();
				return;
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__USAGES_IN_DOC_COMMENTS:
				getUsagesInDocComments().clear();
				return;
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__USAGES:
				getUsages().clear();
				return;
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__MINNER_TYPES:
				getMInnerTypes().clear();
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
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__BODY:
				return body != null;
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__THROWN_EXCEPTIONS:
				return thrownExceptions != null && !thrownExceptions.isEmpty();
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__TYPE_PARAMETERS:
				return typeParameters != null && !typeParameters.isEmpty();
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__USAGES_IN_DOC_COMMENTS:
				return usagesInDocComments != null && !usagesInDocComments.isEmpty();
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__USAGES:
				return usages != null && !usages.isEmpty();
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__MINNER_TYPES:
				return mInnerTypes != null && !mInnerTypes.isEmpty();
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
		if (baseClass == AbstractMethodDeclaration.class) {
			switch (derivedFeatureID) {
				case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__BODY: return JavaPackage.ABSTRACT_METHOD_DECLARATION__BODY;
				case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__PARAMETERS: return JavaPackage.ABSTRACT_METHOD_DECLARATION__PARAMETERS;
				case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__THROWN_EXCEPTIONS: return JavaPackage.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS;
				case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__TYPE_PARAMETERS: return JavaPackage.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS;
				case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__USAGES_IN_DOC_COMMENTS: return JavaPackage.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS;
				case ModiscoPackage.MABSTRACT_METHOD_DEFINITION__USAGES: return JavaPackage.ABSTRACT_METHOD_DECLARATION__USAGES;
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
		if (baseClass == AbstractMethodDeclaration.class) {
			switch (baseFeatureID) {
				case JavaPackage.ABSTRACT_METHOD_DECLARATION__BODY: return ModiscoPackage.MABSTRACT_METHOD_DEFINITION__BODY;
				case JavaPackage.ABSTRACT_METHOD_DECLARATION__PARAMETERS: return ModiscoPackage.MABSTRACT_METHOD_DEFINITION__PARAMETERS;
				case JavaPackage.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS: return ModiscoPackage.MABSTRACT_METHOD_DEFINITION__THROWN_EXCEPTIONS;
				case JavaPackage.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS: return ModiscoPackage.MABSTRACT_METHOD_DEFINITION__TYPE_PARAMETERS;
				case JavaPackage.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS: return ModiscoPackage.MABSTRACT_METHOD_DEFINITION__USAGES_IN_DOC_COMMENTS;
				case JavaPackage.ABSTRACT_METHOD_DECLARATION__USAGES: return ModiscoPackage.MABSTRACT_METHOD_DEFINITION__USAGES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MAbstractMethodDefinitionImpl
