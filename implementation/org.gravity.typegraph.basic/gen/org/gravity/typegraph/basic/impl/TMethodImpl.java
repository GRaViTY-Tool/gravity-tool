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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TypeGraph;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>TMethod</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodImpl#getSignatures <em>Signatures</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMethodImpl extends TNameImpl implements TMethod {
	/**
	 * The cached value of the '{@link #getSignatures() <em>Signatures</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethodSignature> signatures;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TMETHOD;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TMethodSignature> getSignatures() {
		if (signatures == null) {
			signatures = new EObjectContainmentWithInverseEList<TMethodSignature>(TMethodSignature.class, this, BasicPackage.TMETHOD__SIGNATURES, BasicPackage.TMETHOD_SIGNATURE__METHOD);
		}
		return signatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeGraph getModel() {
		if (eContainerFeatureID() != BasicPackage.TMETHOD__MODEL) return null;
		return (TypeGraph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(TypeGraph newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, BasicPackage.TMETHOD__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(TypeGraph newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID() != BasicPackage.TMETHOD__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, BasicPackage.TYPE_GRAPH__METHODS, TypeGraph.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TMETHOD__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicPackage.TMETHOD__SIGNATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSignatures()).basicAdd(otherEnd, msgs);
			case BasicPackage.TMETHOD__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((TypeGraph)otherEnd, msgs);
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
			case BasicPackage.TMETHOD__SIGNATURES:
				return ((InternalEList<?>)getSignatures()).basicRemove(otherEnd, msgs);
			case BasicPackage.TMETHOD__MODEL:
				return basicSetModel(null, msgs);
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
			case BasicPackage.TMETHOD__MODEL:
				return eInternalContainer().eInverseRemove(this, BasicPackage.TYPE_GRAPH__METHODS, TypeGraph.class, msgs);
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
			case BasicPackage.TMETHOD__SIGNATURES:
				return getSignatures();
			case BasicPackage.TMETHOD__MODEL:
				return getModel();
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
			case BasicPackage.TMETHOD__SIGNATURES:
				getSignatures().clear();
				getSignatures().addAll((Collection<? extends TMethodSignature>)newValue);
				return;
			case BasicPackage.TMETHOD__MODEL:
				setModel((TypeGraph)newValue);
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
			case BasicPackage.TMETHOD__SIGNATURES:
				getSignatures().clear();
				return;
			case BasicPackage.TMETHOD__MODEL:
				setModel((TypeGraph)null);
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
			case BasicPackage.TMETHOD__SIGNATURES:
				return signatures != null && !signatures.isEmpty();
			case BasicPackage.TMETHOD__MODEL:
				return getModel() != null;
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
			case BasicPackage.TMETHOD___GET_METHOD_SIGNATURE__TABSTRACTTYPE_INT_INT_ELIST_ELIST_ELIST:
				return getMethodSignature((TAbstractType)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (EList<TAbstractType>)arguments.get(3), (EList<Integer>)arguments.get(4), (EList<Integer>)arguments.get(5));
			case BasicPackage.TMETHOD___CREATE_METHOD_SIGNATURE__TABSTRACTTYPE_INT_INT_ELIST_ELIST_ELIST:
				return createMethodSignature((TAbstractType)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (EList<TAbstractType>)arguments.get(3), (EList<Integer>)arguments.get(4), (EList<Integer>)arguments.get(5));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public TMethodSignature getMethodSignature(final TAbstractType returnType, final int returnLowerBound,
			final int returnUpperBound, final EList<TAbstractType> parameters,
			final EList<Integer> parameterLowerBounds, final EList<Integer> parameterUpperBounds) {
		for (final TMethodSignature signature : getSignatures()) {
			if ((returnLowerBound != signature.getLowerBound()) || (returnUpperBound != signature.getUpperBound())
					|| !signature.getReturnType().isSuperTypeOf(returnType)
					|| (signature.getParameters().size() != parameters.size())) {
				continue;
			}
			boolean paramsEqual = true;
			TParameter currentParam = signature.getFirstParameter();
			for (int i = 0; i < parameters.size(); i++) {
				if (!currentParam.getType().isSuperTypeOf(parameters.get(i))
						|| (currentParam.getLowerBound() != parameterLowerBounds.get(i))
						|| (currentParam.getUpperBound() != parameterUpperBounds.get(i))) {
					paramsEqual = false;
					break;
				}
				currentParam = currentParam.getNext();
			}
			if (paramsEqual) {
				return signature;
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
	public TMethodSignature createMethodSignature(final TAbstractType returnType, final int returnLowerBound,
			final int returnUpperBound, final EList<TAbstractType> parameters,
			final EList<Integer> parameterLowerBounds, final EList<Integer> parameterUpperBounds) {
		TMethodSignature signature = getMethodSignature(returnType, returnLowerBound, returnUpperBound, parameters,
				parameterLowerBounds, parameterUpperBounds);
		if (signature == null) {
			signature = BasicFactory.eINSTANCE.createTMethodSignature();
			signature.setMethod(this);
			signature.setReturnType(returnType);
			signature.setLowerBound(returnLowerBound);
			signature.setUpperBound(returnUpperBound);
			TParameter previous = null;
			for (int i = 0; i < parameters.size(); i++) {
				final TParameter current = BasicFactory.eINSTANCE.createTParameter();
				current.setType(parameters.get(i));
				current.setLowerBound(parameterLowerBounds.get(i));
				current.setUpperBound(parameterUpperBounds.get(i));
				if (previous == null) {
					signature.setFirstParameter(current);
				} else {
					previous.setNext(current);
				}
				previous = current;
			}
		}
		return signature;
	}
} // TMethodImpl
