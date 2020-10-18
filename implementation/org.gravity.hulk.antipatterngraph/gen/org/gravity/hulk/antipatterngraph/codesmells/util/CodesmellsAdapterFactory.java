/**
 */
package org.gravity.hulk.antipatterngraph.codesmells.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HCodeSmell;
import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.codesmells.*;

import org.gravity.typegraph.basic.annotations.TAnnotation;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage
 * @generated
 */
public class CodesmellsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CodesmellsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodesmellsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CodesmellsPackage.eINSTANCE;
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
	protected CodesmellsSwitch<Adapter> modelSwitch = new CodesmellsSwitch<Adapter>() {
		@Override
		public Adapter caseHControllerClassSmell(HControllerClassSmell object) {
			return createHControllerClassSmellAdapter();
		}

		@Override
		public Adapter caseHDataClassSmell(HDataClassSmell object) {
			return createHDataClassSmellAdapter();
		}

		@Override
		public Adapter caseHEmptyClassSmell(HEmptyClassSmell object) {
			return createHEmptyClassSmellAdapter();
		}

		@Override
		public Adapter caseHGetterSetterSmell(HGetterSetterSmell object) {
			return createHGetterSetterSmellAdapter();
		}

		@Override
		public Adapter caseHLargeClassLowCohesionSmell(HLargeClassLowCohesionSmell object) {
			return createHLargeClassLowCohesionSmellAdapter();
		}

		@Override
		public Adapter caseHLargeClassSmell(HLargeClassSmell object) {
			return createHLargeClassSmellAdapter();
		}

		@Override
		public Adapter caseHLowCohesionSmell(HLowCohesionSmell object) {
			return createHLowCohesionSmellAdapter();
		}

		@Override
		public Adapter caseHDataClassAccessor(HDataClassAccessor object) {
			return createHDataClassAccessorAdapter();
		}

		@Override
		public Adapter caseHMuchOverloadingCodeSmell(HMuchOverloadingCodeSmell object) {
			return createHMuchOverloadingCodeSmellAdapter();
		}

		@Override
		public Adapter caseHManyParametersCodeSmell(HManyParametersCodeSmell object) {
			return createHManyParametersCodeSmellAdapter();
		}

		@Override
		public Adapter caseHIntenseFieldUsageCodeSmell(HIntenseFieldUsageCodeSmell object) {
			return createHIntenseFieldUsageCodeSmellAdapter();
		}

		@Override
		public Adapter caseHNoInheritanceCodeSmell(HNoInheritanceCodeSmell object) {
			return createHNoInheritanceCodeSmellAdapter();
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
		public Adapter caseHCodeSmell(HCodeSmell object) {
			return createHCodeSmellAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.codesmells.HControllerClassSmell <em>HController Class Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HControllerClassSmell
	 * @generated
	 */
	public Adapter createHControllerClassSmellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell <em>HData Class Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell
	 * @generated
	 */
	public Adapter createHDataClassSmellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.codesmells.HEmptyClassSmell <em>HEmpty Class Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HEmptyClassSmell
	 * @generated
	 */
	public Adapter createHEmptyClassSmellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell <em>HGetter Setter Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell
	 * @generated
	 */
	public Adapter createHGetterSetterSmellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.codesmells.HLargeClassLowCohesionSmell <em>HLarge Class Low Cohesion Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HLargeClassLowCohesionSmell
	 * @generated
	 */
	public Adapter createHLargeClassLowCohesionSmellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell <em>HLarge Class Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell
	 * @generated
	 */
	public Adapter createHLargeClassSmellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.codesmells.HLowCohesionSmell <em>HLow Cohesion Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HLowCohesionSmell
	 * @generated
	 */
	public Adapter createHLowCohesionSmellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.codesmells.HDataClassAccessor <em>HData Class Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HDataClassAccessor
	 * @generated
	 */
	public Adapter createHDataClassAccessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.codesmells.HMuchOverloadingCodeSmell <em>HMuch Overloading Code Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HMuchOverloadingCodeSmell
	 * @generated
	 */
	public Adapter createHMuchOverloadingCodeSmellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.codesmells.HManyParametersCodeSmell <em>HMany Parameters Code Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HManyParametersCodeSmell
	 * @generated
	 */
	public Adapter createHManyParametersCodeSmellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.codesmells.HIntenseFieldUsageCodeSmell <em>HIntense Field Usage Code Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HIntenseFieldUsageCodeSmell
	 * @generated
	 */
	public Adapter createHIntenseFieldUsageCodeSmellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.codesmells.HNoInheritanceCodeSmell <em>HNo Inheritance Code Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HNoInheritanceCodeSmell
	 * @generated
	 */
	public Adapter createHNoInheritanceCodeSmellAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.antipatterngraph.HCodeSmell <em>HCode Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.antipatterngraph.HCodeSmell
	 * @generated
	 */
	public Adapter createHCodeSmellAdapter() {
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

} //CodesmellsAdapterFactory
