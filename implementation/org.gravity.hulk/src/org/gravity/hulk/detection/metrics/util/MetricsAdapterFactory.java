/**
 */
package org.gravity.hulk.detection.metrics.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gravity.hulk.HDetector;

import org.gravity.hulk.detection.HClassBasedCalculator;
import org.gravity.hulk.detection.HClassBasedMetricCalculator;
import org.gravity.hulk.detection.HMetricCalculator;

import org.gravity.hulk.detection.metrics.*;

import org.moflon.core.dfs.Node;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.detection.metrics.MetricsPackage
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
		public Adapter caseHInvocationRelationCalculator(HInvocationRelationCalculator object) {
			return createHInvocationRelationCalculatorAdapter();
		}

		@Override
		public Adapter caseHIGAMCalculator(HIGAMCalculator object) {
			return createHIGAMCalculatorAdapter();
		}

		@Override
		public Adapter caseHNumberOfChildCalculator(HNumberOfChildCalculator object) {
			return createHNumberOfChildCalculatorAdapter();
		}

		@Override
		public Adapter caseHIGATCalculator(HIGATCalculator object) {
			return createHIGATCalculatorAdapter();
		}

		@Override
		public Adapter caseHMemberNumberCalculator(HMemberNumberCalculator object) {
			return createHMemberNumberCalculatorAdapter();
		}

		@Override
		public Adapter caseHLocalAccessRelationCalculator(HLocalAccessRelationCalculator object) {
			return createHLocalAccessRelationCalculatorAdapter();
		}

		@Override
		public Adapter caseHMethodNumberCalculator(HMethodNumberCalculator object) {
			return createHMethodNumberCalculatorAdapter();
		}

		@Override
		public Adapter caseHGetterSetterMethodRelationCalculator(HGetterSetterMethodRelationCalculator object) {
			return createHGetterSetterMethodRelationCalculatorAdapter();
		}

		@Override
		public Adapter caseHAverageParametersCalculator(HAverageParametersCalculator object) {
			return createHAverageParametersCalculatorAdapter();
		}

		@Override
		public Adapter caseHAverageOverloadingInClassCalculator(HAverageOverloadingInClassCalculator object) {
			return createHAverageOverloadingInClassCalculatorAdapter();
		}

		@Override
		public Adapter caseHLocalMethodAccessCalculator(HLocalMethodAccessCalculator object) {
			return createHLocalMethodAccessCalculatorAdapter();
		}

		@Override
		public Adapter caseHLocalFieldsAccessCalculator(HLocalFieldsAccessCalculator object) {
			return createHLocalFieldsAccessCalculatorAdapter();
		}

		@Override
		public Adapter caseHFieldNumberCalculator(HFieldNumberCalculator object) {
			return createHFieldNumberCalculatorAdapter();
		}

		@Override
		public Adapter caseHTotalVisibilityCalculator(HTotalVisibilityCalculator object) {
			return createHTotalVisibilityCalculatorAdapter();
		}

		@Override
		public Adapter caseHTotalCouplingCalculator(HTotalCouplingCalculator object) {
			return createHTotalCouplingCalculatorAdapter();
		}

		@Override
		public Adapter caseHLcom5Calculator(HLcom5Calculator object) {
			return createHLcom5CalculatorAdapter();
		}

		@Override
		public Adapter caseHLocalFieldUniqueAccessCalculator(HLocalFieldUniqueAccessCalculator object) {
			return createHLocalFieldUniqueAccessCalculatorAdapter();
		}

		@Override
		public Adapter caseHAfferentCouplingCalculator(HAfferentCouplingCalculator object) {
			return createHAfferentCouplingCalculatorAdapter();
		}

		@Override
		public Adapter caseHEfferentCouplingCalculator(HEfferentCouplingCalculator object) {
			return createHEfferentCouplingCalculatorAdapter();
		}

		@Override
		public Adapter caseHIncommingInvocationCalculator(HIncommingInvocationCalculator object) {
			return createHIncommingInvocationCalculatorAdapter();
		}

		@Override
		public Adapter caseHOutgoingInvocationCalculator(HOutgoingInvocationCalculator object) {
			return createHOutgoingInvocationCalculatorAdapter();
		}

		@Override
		public Adapter caseHDepthOfInheritanceCalculator(HDepthOfInheritanceCalculator object) {
			return createHDepthOfInheritanceCalculatorAdapter();
		}

		@Override
		public Adapter caseHGetterCalculator(HGetterCalculator object) {
			return createHGetterCalculatorAdapter();
		}

		@Override
		public Adapter caseHSetterCalculator(HSetterCalculator object) {
			return createHSetterCalculatorAdapter();
		}

		@Override
		public Adapter caseNode(Node object) {
			return createNodeAdapter();
		}

		@Override
		public Adapter caseHDetector(HDetector object) {
			return createHDetectorAdapter();
		}

		@Override
		public Adapter caseHClassBasedCalculator(HClassBasedCalculator object) {
			return createHClassBasedCalculatorAdapter();
		}

		@Override
		public Adapter caseHMetricCalculator(HMetricCalculator object) {
			return createHMetricCalculatorAdapter();
		}

		@Override
		public Adapter caseHClassBasedMetricCalculator(HClassBasedMetricCalculator object) {
			return createHClassBasedMetricCalculatorAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HInvocationRelationCalculator <em>HInvocation Relation Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HInvocationRelationCalculator
	 * @generated
	 */
	public Adapter createHInvocationRelationCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HIGAMCalculator <em>HIGAM Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HIGAMCalculator
	 * @generated
	 */
	public Adapter createHIGAMCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HNumberOfChildCalculator <em>HNumber Of Child Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HNumberOfChildCalculator
	 * @generated
	 */
	public Adapter createHNumberOfChildCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HIGATCalculator <em>HIGAT Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HIGATCalculator
	 * @generated
	 */
	public Adapter createHIGATCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HMemberNumberCalculator <em>HMember Number Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HMemberNumberCalculator
	 * @generated
	 */
	public Adapter createHMemberNumberCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator <em>HLocal Access Relation Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator
	 * @generated
	 */
	public Adapter createHLocalAccessRelationCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HMethodNumberCalculator <em>HMethod Number Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HMethodNumberCalculator
	 * @generated
	 */
	public Adapter createHMethodNumberCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator <em>HGetter Setter Method Relation Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator
	 * @generated
	 */
	public Adapter createHGetterSetterMethodRelationCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HAverageParametersCalculator <em>HAverage Parameters Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HAverageParametersCalculator
	 * @generated
	 */
	public Adapter createHAverageParametersCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HAverageOverloadingInClassCalculator <em>HAverage Overloading In Class Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HAverageOverloadingInClassCalculator
	 * @generated
	 */
	public Adapter createHAverageOverloadingInClassCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HLocalMethodAccessCalculator <em>HLocal Method Access Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HLocalMethodAccessCalculator
	 * @generated
	 */
	public Adapter createHLocalMethodAccessCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HLocalFieldsAccessCalculator <em>HLocal Fields Access Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HLocalFieldsAccessCalculator
	 * @generated
	 */
	public Adapter createHLocalFieldsAccessCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HFieldNumberCalculator <em>HField Number Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HFieldNumberCalculator
	 * @generated
	 */
	public Adapter createHFieldNumberCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HTotalVisibilityCalculator <em>HTotal Visibility Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HTotalVisibilityCalculator
	 * @generated
	 */
	public Adapter createHTotalVisibilityCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HTotalCouplingCalculator <em>HTotal Coupling Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HTotalCouplingCalculator
	 * @generated
	 */
	public Adapter createHTotalCouplingCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HLcom5Calculator <em>HLcom5 Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HLcom5Calculator
	 * @generated
	 */
	public Adapter createHLcom5CalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HLocalFieldUniqueAccessCalculator <em>HLocal Field Unique Access Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HLocalFieldUniqueAccessCalculator
	 * @generated
	 */
	public Adapter createHLocalFieldUniqueAccessCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HAfferentCouplingCalculator <em>HAfferent Coupling Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HAfferentCouplingCalculator
	 * @generated
	 */
	public Adapter createHAfferentCouplingCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HEfferentCouplingCalculator <em>HEfferent Coupling Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HEfferentCouplingCalculator
	 * @generated
	 */
	public Adapter createHEfferentCouplingCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HIncommingInvocationCalculator <em>HIncomming Invocation Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HIncommingInvocationCalculator
	 * @generated
	 */
	public Adapter createHIncommingInvocationCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HOutgoingInvocationCalculator <em>HOutgoing Invocation Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HOutgoingInvocationCalculator
	 * @generated
	 */
	public Adapter createHOutgoingInvocationCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HDepthOfInheritanceCalculator <em>HDepth Of Inheritance Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HDepthOfInheritanceCalculator
	 * @generated
	 */
	public Adapter createHDepthOfInheritanceCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HGetterCalculator <em>HGetter Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HGetterCalculator
	 * @generated
	 */
	public Adapter createHGetterCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.HSetterCalculator <em>HSetter Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.HSetterCalculator
	 * @generated
	 */
	public Adapter createHSetterCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.core.dfs.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.core.dfs.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.HDetector <em>HDetector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.HDetector
	 * @generated
	 */
	public Adapter createHDetectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.HClassBasedCalculator <em>HClass Based Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.HClassBasedCalculator
	 * @generated
	 */
	public Adapter createHClassBasedCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.HMetricCalculator <em>HMetric Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.HMetricCalculator
	 * @generated
	 */
	public Adapter createHMetricCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.HClassBasedMetricCalculator <em>HClass Based Metric Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.HClassBasedMetricCalculator
	 * @generated
	 */
	public Adapter createHClassBasedMetricCalculatorAdapter() {
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
