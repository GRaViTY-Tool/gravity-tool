/**
 */
package org.gravity.typegraph.basic.containers.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gravity.typegraph.basic.containers.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.typegraph.basic.containers.ContainersPackage
 * @generated
 */
public class ContainersAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContainersPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainersAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ContainersPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainersSwitch<Adapter> modelSwitch = new ContainersSwitch<Adapter>() {
			@Override
			public Adapter caseTTypeContainer(TTypeContainer object) {
				return createTTypeContainerAdapter();
			}
			@Override
			public Adapter caseTAccessContainer(TAccessContainer object) {
				return createTAccessContainerAdapter();
			}
			@Override
			public Adapter caseTMemberContainer(TMemberContainer object) {
				return createTMemberContainerAdapter();
			}
			@Override
			public Adapter caseTClassContainer(TClassContainer object) {
				return createTClassContainerAdapter();
			}
			@Override
			public Adapter caseTFieldContainer(TFieldContainer object) {
				return createTFieldContainerAdapter();
			}
			@Override
			public Adapter caseTFieldDefinitionContainer(TFieldDefinitionContainer object) {
				return createTFieldDefinitionContainerAdapter();
			}
			@Override
			public Adapter caseTFieldSignatureContainer(TFieldSignatureContainer object) {
				return createTFieldSignatureContainerAdapter();
			}
			@Override
			public Adapter caseTSignatureContainer(TSignatureContainer object) {
				return createTSignatureContainerAdapter();
			}
			@Override
			public Adapter caseTMethodDefinitionContainer(TMethodDefinitionContainer object) {
				return createTMethodDefinitionContainerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.typegraph.basic.containers.TTypeContainer <em>TType Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.typegraph.basic.containers.TTypeContainer
	 * @generated
	 */
	public Adapter createTTypeContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.typegraph.basic.containers.TAccessContainer <em>TAccess Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.typegraph.basic.containers.TAccessContainer
	 * @generated
	 */
	public Adapter createTAccessContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.typegraph.basic.containers.TMemberContainer <em>TMember Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.typegraph.basic.containers.TMemberContainer
	 * @generated
	 */
	public Adapter createTMemberContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.typegraph.basic.containers.TClassContainer <em>TClass Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.typegraph.basic.containers.TClassContainer
	 * @generated
	 */
	public Adapter createTClassContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.typegraph.basic.containers.TFieldContainer <em>TField Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.typegraph.basic.containers.TFieldContainer
	 * @generated
	 */
	public Adapter createTFieldContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.typegraph.basic.containers.TFieldDefinitionContainer <em>TField Definition Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.typegraph.basic.containers.TFieldDefinitionContainer
	 * @generated
	 */
	public Adapter createTFieldDefinitionContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.typegraph.basic.containers.TFieldSignatureContainer <em>TField Signature Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.typegraph.basic.containers.TFieldSignatureContainer
	 * @generated
	 */
	public Adapter createTFieldSignatureContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.typegraph.basic.containers.TSignatureContainer <em>TSignature Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.typegraph.basic.containers.TSignatureContainer
	 * @generated
	 */
	public Adapter createTSignatureContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.typegraph.basic.containers.TMethodDefinitionContainer <em>TMethod Definition Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.typegraph.basic.containers.TMethodDefinitionContainer
	 * @generated
	 */
	public Adapter createTMethodDefinitionContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ContainersAdapterFactory
