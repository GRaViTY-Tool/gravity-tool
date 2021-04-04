/**
 */
package org.gravity.hulk.detection.codesmells.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gravity.hulk.HDetector;

import org.gravity.hulk.detection.HClassBasedCalculator;
import org.gravity.hulk.detection.HCodeSmellDetector;
import org.gravity.hulk.detection.HRelativeDetector;

import org.gravity.hulk.detection.codesmells.*;

import org.moflon.core.dfs.Node;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.detection.codesmells.CodesmellsPackage
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
		public Adapter caseHContollerClassDetector(HContollerClassDetector object) {
			return createHContollerClassDetectorAdapter();
		}

		@Override
		public Adapter caseHDataClassDetector(HDataClassDetector object) {
			return createHDataClassDetectorAdapter();
		}

		@Override
		public Adapter caseHEmptyClassDetector(HEmptyClassDetector object) {
			return createHEmptyClassDetectorAdapter();
		}

		@Override
		public Adapter caseHGetterSetterDetector(HGetterSetterDetector object) {
			return createHGetterSetterDetectorAdapter();
		}

		@Override
		public Adapter caseHLargeClassDetector(HLargeClassDetector object) {
			return createHLargeClassDetectorAdapter();
		}

		@Override
		public Adapter caseHLowCohesionDetector(HLowCohesionDetector object) {
			return createHLowCohesionDetectorAdapter();
		}

		@Override
		public Adapter caseHDataClassAccessorDetector(HDataClassAccessorDetector object) {
			return createHDataClassAccessorDetectorAdapter();
		}

		@Override
		public Adapter caseHManyParametersDetector(HManyParametersDetector object) {
			return createHManyParametersDetectorAdapter();
		}

		@Override
		public Adapter caseHMuchOverloadingDetector(HMuchOverloadingDetector object) {
			return createHMuchOverloadingDetectorAdapter();
		}

		@Override
		public Adapter caseHIntenseFieldUsageDetector(HIntenseFieldUsageDetector object) {
			return createHIntenseFieldUsageDetectorAdapter();
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
		public Adapter caseHCodeSmellDetector(HCodeSmellDetector object) {
			return createHCodeSmellDetectorAdapter();
		}

		@Override
		public Adapter caseHClassBasedCalculator(HClassBasedCalculator object) {
			return createHClassBasedCalculatorAdapter();
		}

		@Override
		public Adapter caseHRelativeDetector(HRelativeDetector object) {
			return createHRelativeDetectorAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.codesmells.HContollerClassDetector <em>HContoller Class Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.codesmells.HContollerClassDetector
	 * @generated
	 */
	public Adapter createHContollerClassDetectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.codesmells.HDataClassDetector <em>HData Class Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.codesmells.HDataClassDetector
	 * @generated
	 */
	public Adapter createHDataClassDetectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.codesmells.HEmptyClassDetector <em>HEmpty Class Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.codesmells.HEmptyClassDetector
	 * @generated
	 */
	public Adapter createHEmptyClassDetectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.codesmells.HGetterSetterDetector <em>HGetter Setter Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.codesmells.HGetterSetterDetector
	 * @generated
	 */
	public Adapter createHGetterSetterDetectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.codesmells.HLargeClassLowCohesionDetector <em>HLarge Class Low Cohesion Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.codesmells.HLargeClassLowCohesionDetector
	 * @generated
	 */
	public Adapter createHLargeClassLowCohesionDetectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.codesmells.HLargeClassDetector <em>HLarge Class Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.codesmells.HLargeClassDetector
	 * @generated
	 */
	public Adapter createHLargeClassDetectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.codesmells.HLowCohesionDetector <em>HLow Cohesion Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.codesmells.HLowCohesionDetector
	 * @generated
	 */
	public Adapter createHLowCohesionDetectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.codesmells.HDataClassAccessorDetector <em>HData Class Accessor Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.codesmells.HDataClassAccessorDetector
	 * @generated
	 */
	public Adapter createHDataClassAccessorDetectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.codesmells.HManyParametersDetector <em>HMany Parameters Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.codesmells.HManyParametersDetector
	 * @generated
	 */
	public Adapter createHManyParametersDetectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.codesmells.HMuchOverloadingDetector <em>HMuch Overloading Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.codesmells.HMuchOverloadingDetector
	 * @generated
	 */
	public Adapter createHMuchOverloadingDetectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.codesmells.HIntenseFieldUsageDetector <em>HIntense Field Usage Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.codesmells.HIntenseFieldUsageDetector
	 * @generated
	 */
	public Adapter createHIntenseFieldUsageDetectorAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.HCodeSmellDetector <em>HCode Smell Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.HCodeSmellDetector
	 * @generated
	 */
	public Adapter createHCodeSmellDetectorAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.HRelativeDetector <em>HRelative Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.HRelativeDetector
	 * @generated
	 */
	public Adapter createHRelativeDetectorAdapter() {
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
