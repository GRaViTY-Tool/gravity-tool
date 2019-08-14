/**
 */
package org.gravity.hulk.refactoringgraph.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.refactoringgraph.*;

import org.gravity.typegraph.basic.annotations.TAnnotation;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.refactoringgraph.RefactoringgraphPackage
 * @generated
 */
public class RefactoringgraphAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RefactoringgraphPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringgraphAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RefactoringgraphPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefactoringgraphSwitch<Adapter> modelSwitch = new RefactoringgraphSwitch<Adapter>() {
		@Override
		public Adapter caseHMethodToDataClassAccess(HMethodToDataClassAccess object) {
			return createHMethodToDataClassAccessAdapter();
		}

		@Override
		public Adapter caseHInBlobAccess(HInBlobAccess object) {
			return createHInBlobAccessAdapter();
		}

		@Override
		public Adapter caseHBlobResolveAnnotation(HBlobResolveAnnotation object) {
			return createHBlobResolveAnnotationAdapter();
		}

		@Override
		public Adapter caseHCluster(HCluster object) {
			return createHClusterAdapter();
		}

		@Override
		public Adapter caseHInBlobClusterAccess(HInBlobClusterAccess object) {
			return createHInBlobClusterAccessAdapter();
		}

		@Override
		public Adapter caseTAnnotation(TAnnotation object) {
			return createTAnnotationAdapter();
		}

		@Override
		public Adapter caseHAnnotation(HAnnotation object) {
			return createHAnnotationAdapter();
		}

		@Override
		public Adapter caseHMetric(HMetric object) {
			return createHMetricAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess <em>HMethod To Data Class Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess
	 * @generated
	 */
	public Adapter createHMethodToDataClassAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.refactoringgraph.HInBlobAccess <em>HIn Blob Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.refactoringgraph.HInBlobAccess
	 * @generated
	 */
	public Adapter createHInBlobAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation <em>HBlob Resolve Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation
	 * @generated
	 */
	public Adapter createHBlobResolveAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.refactoringgraph.HCluster <em>HCluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.refactoringgraph.HCluster
	 * @generated
	 */
	public Adapter createHClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.refactoringgraph.HInBlobClusterAccess <em>HIn Blob Cluster Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.refactoringgraph.HInBlobClusterAccess
	 * @generated
	 */
	public Adapter createHInBlobClusterAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.typegraph.basic.annotations.TAnnotation <em>TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.typegraph.basic.annotations.TAnnotation
	 * @generated
	 */
	public Adapter createTAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.HAnnotation <em>HAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.HAnnotation
	 * @generated
	 */
	public Adapter createHAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.HMetric <em>HMetric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.HMetric
	 * @generated
	 */
	public Adapter createHMetricAdapter() {
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

} //RefactoringgraphAdapterFactory
