/**
 */
package org.gravity.hulk.antipatterngraph.metrics.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.*;

import org.gravity.typegraph.basic.annotations.TAnnotation;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage
 * @generated
 */
public class MetricsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetricsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetricsPackage.eINSTANCE;
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
	protected MetricsSwitch<Adapter> modelSwitch = new MetricsSwitch<Adapter>() {
		@Override
		public Adapter caseHNACCMetric(HNACCMetric object) {
			return createHNACCMetricAdapter();
		}

		@Override
		public Adapter caseHNumberOfMembersMetric(HNumberOfMembersMetric object) {
			return createHNumberOfMembersMetricAdapter();
		}

		@Override
		public Adapter caseHLocalAccessRelationMetric(HLocalAccessRelationMetric object) {
			return createHLocalAccessRelationMetricAdapter();
		}

		@Override
		public Adapter caseHInvocationRelation(HInvocationRelation object) {
			return createHInvocationRelationAdapter();
		}

		@Override
		public Adapter caseHNumberOfChildMetric(HNumberOfChildMetric object) {
			return createHNumberOfChildMetricAdapter();
		}

		@Override
		public Adapter caseHIGAMMetric(HIGAMMetric object) {
			return createHIGAMMetricAdapter();
		}

		@Override
		public Adapter caseHIGATMetric(HIGATMetric object) {
			return createHIGATMetricAdapter();
		}

		@Override
		public Adapter caseHNumberOfMethodsMetric(HNumberOfMethodsMetric object) {
			return createHNumberOfMethodsMetricAdapter();
		}

		@Override
		public Adapter caseHAverageOverloadingInClassMetric(HAverageOverloadingInClassMetric object) {
			return createHAverageOverloadingInClassMetricAdapter();
		}

		@Override
		public Adapter caseHAverageParametersMetric(HAverageParametersMetric object) {
			return createHAverageParametersMetricAdapter();
		}

		@Override
		public Adapter caseHLocalMethodAccessesMetric(HLocalMethodAccessesMetric object) {
			return createHLocalMethodAccessesMetricAdapter();
		}

		@Override
		public Adapter caseHLocalFieldAccessesMetric(HLocalFieldAccessesMetric object) {
			return createHLocalFieldAccessesMetricAdapter();
		}

		@Override
		public Adapter caseHTotalVisibilityMetric(HTotalVisibilityMetric object) {
			return createHTotalVisibilityMetricAdapter();
		}

		@Override
		public Adapter caseHTotalCouplingMetric(HTotalCouplingMetric object) {
			return createHTotalCouplingMetricAdapter();
		}

		@Override
		public Adapter caseHNumberOfFieldsMetric(HNumberOfFieldsMetric object) {
			return createHNumberOfFieldsMetricAdapter();
		}

		@Override
		public Adapter caseHLCOM5Metric(HLCOM5Metric object) {
			return createHLCOM5MetricAdapter();
		}

		@Override
		public Adapter caseHEfferentCouplingMetric(HEfferentCouplingMetric object) {
			return createHEfferentCouplingMetricAdapter();
		}

		@Override
		public Adapter caseHAfferentCouplingMetric(HAfferentCouplingMetric object) {
			return createHAfferentCouplingMetricAdapter();
		}

		@Override
		public Adapter caseHLocalFieldUniqueAccessMetric(HLocalFieldUniqueAccessMetric object) {
			return createHLocalFieldUniqueAccessMetricAdapter();
		}

		@Override
		public Adapter caseHIncommingInvocationMetric(HIncommingInvocationMetric object) {
			return createHIncommingInvocationMetricAdapter();
		}

		@Override
		public Adapter caseHOutgoingInvocationMetric(HOutgoingInvocationMetric object) {
			return createHOutgoingInvocationMetricAdapter();
		}

		@Override
		public Adapter caseHDepthOfInheritanceMetric(HDepthOfInheritanceMetric object) {
			return createHDepthOfInheritanceMetricAdapter();
		}

		@Override
		public Adapter caseHGetterMetric(HGetterMetric object) {
			return createHGetterMetricAdapter();
		}

		@Override
		public Adapter caseHSetterMetric(HSetterMetric object) {
			return createHSetterMetricAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HNACCMetric <em>HNACC Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNACCMetric
	 * @generated
	 */
	public Adapter createHNACCMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HNumberOfMembersMetric <em>HNumber Of Members Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNumberOfMembersMetric
	 * @generated
	 */
	public Adapter createHNumberOfMembersMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric <em>HLocal Access Relation Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric
	 * @generated
	 */
	public Adapter createHLocalAccessRelationMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation <em>HInvocation Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation
	 * @generated
	 */
	public Adapter createHInvocationRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HNumberOfChildMetric <em>HNumber Of Child Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNumberOfChildMetric
	 * @generated
	 */
	public Adapter createHNumberOfChildMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HIGAMMetric <em>HIGAM Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HIGAMMetric
	 * @generated
	 */
	public Adapter createHIGAMMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HIGATMetric <em>HIGAT Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HIGATMetric
	 * @generated
	 */
	public Adapter createHIGATMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric <em>HNumber Of Methods Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric
	 * @generated
	 */
	public Adapter createHNumberOfMethodsMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric <em>HAverage Overloading In Class Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric
	 * @generated
	 */
	public Adapter createHAverageOverloadingInClassMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HAverageParametersMetric <em>HAverage Parameters Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HAverageParametersMetric
	 * @generated
	 */
	public Adapter createHAverageParametersMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HLocalMethodAccessesMetric <em>HLocal Method Accesses Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HLocalMethodAccessesMetric
	 * @generated
	 */
	public Adapter createHLocalMethodAccessesMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HLocalFieldAccessesMetric <em>HLocal Field Accesses Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HLocalFieldAccessesMetric
	 * @generated
	 */
	public Adapter createHLocalFieldAccessesMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HTotalVisibilityMetric <em>HTotal Visibility Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HTotalVisibilityMetric
	 * @generated
	 */
	public Adapter createHTotalVisibilityMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HTotalCouplingMetric <em>HTotal Coupling Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HTotalCouplingMetric
	 * @generated
	 */
	public Adapter createHTotalCouplingMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HNumberOfFieldsMetric <em>HNumber Of Fields Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNumberOfFieldsMetric
	 * @generated
	 */
	public Adapter createHNumberOfFieldsMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric <em>HLCOM5 Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric
	 * @generated
	 */
	public Adapter createHLCOM5MetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HEfferentCouplingMetric <em>HEfferent Coupling Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HEfferentCouplingMetric
	 * @generated
	 */
	public Adapter createHEfferentCouplingMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HAfferentCouplingMetric <em>HAfferent Coupling Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HAfferentCouplingMetric
	 * @generated
	 */
	public Adapter createHAfferentCouplingMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HLocalFieldUniqueAccessMetric <em>HLocal Field Unique Access Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HLocalFieldUniqueAccessMetric
	 * @generated
	 */
	public Adapter createHLocalFieldUniqueAccessMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HIncommingInvocationMetric <em>HIncomming Invocation Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HIncommingInvocationMetric
	 * @generated
	 */
	public Adapter createHIncommingInvocationMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HOutgoingInvocationMetric <em>HOutgoing Invocation Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HOutgoingInvocationMetric
	 * @generated
	 */
	public Adapter createHOutgoingInvocationMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HDepthOfInheritanceMetric <em>HDepth Of Inheritance Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HDepthOfInheritanceMetric
	 * @generated
	 */
	public Adapter createHDepthOfInheritanceMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HGetterMetric <em>HGetter Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HGetterMetric
	 * @generated
	 */
	public Adapter createHGetterMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.metrics.HSetterMetric <em>HSetter Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HSetterMetric
	 * @generated
	 */
	public Adapter createHSetterMetricAdapter() {
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

} //MetricsAdapterFactory
