/**
 */
package org.gravity.hulk.refactoringgraph.refactorings.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.refactoringgraph.refactorings.*;

import org.gravity.typegraph.basic.annotations.TAnnotation;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage
 * @generated
 */
public class RefactoringsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RefactoringsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RefactoringsPackage.eINSTANCE;
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
	protected RefactoringsSwitch<Adapter> modelSwitch = new RefactoringsSwitch<Adapter>() {
		@Override
		public Adapter caseHRefactoring(HRefactoring object) {
			return createHRefactoringAdapter();
		}

		@Override
		public Adapter caseHMoveMethod(HMoveMethod object) {
			return createHMoveMethodAdapter();
		}

		@Override
		public Adapter caseHExtractClass(HExtractClass object) {
			return createHExtractClassAdapter();
		}

		@Override
		public Adapter caseHMoveMember(HMoveMember object) {
			return createHMoveMemberAdapter();
		}

		@Override
		public Adapter caseHMoveField(HMoveField object) {
			return createHMoveFieldAdapter();
		}

		@Override
		public Adapter caseHMoveMembers(HMoveMembers object) {
			return createHMoveMembersAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.refactoringgraph.refactorings.HRefactoring <em>HRefactoring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HRefactoring
	 * @generated
	 */
	public Adapter createHRefactoringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMethod <em>HMove Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HMoveMethod
	 * @generated
	 */
	public Adapter createHMoveMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.refactoringgraph.refactorings.HExtractClass <em>HExtract Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HExtractClass
	 * @generated
	 */
	public Adapter createHExtractClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMember <em>HMove Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HMoveMember
	 * @generated
	 */
	public Adapter createHMoveMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveField <em>HMove Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HMoveField
	 * @generated
	 */
	public Adapter createHMoveFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers <em>HMove Members</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers
	 * @generated
	 */
	public Adapter createHMoveMembersAdapter() {
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

} //RefactoringsAdapterFactory
