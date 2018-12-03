/**
 */
package org.gravity.typegraph.basic.annotations.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gravity.typegraph.basic.TAbstractType;

import org.gravity.typegraph.basic.annotations.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.typegraph.basic.annotations.AnnotationsPackage
 * @generated
 */
public class AnnotationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnnotationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AnnotationsPackage.eINSTANCE;
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
	protected AnnotationsSwitch<Adapter> modelSwitch = new AnnotationsSwitch<Adapter>() {
			@Override
			public Adapter caseTAnnotationValue(TAnnotationValue object) {
				return createTAnnotationValueAdapter();
			}
			@Override
			public Adapter caseTTextAnnotation(TTextAnnotation object) {
				return createTTextAnnotationAdapter();
			}
			@Override
			public Adapter caseTAnnotation(TAnnotation object) {
				return createTAnnotationAdapter();
			}
			@Override
			public Adapter caseTAnnotationType(TAnnotationType object) {
				return createTAnnotationTypeAdapter();
			}
			@Override
			public Adapter caseTAnnotatable(TAnnotatable object) {
				return createTAnnotatableAdapter();
			}
			@Override
			public Adapter caseTTextNode(TTextNode object) {
				return createTTextNodeAdapter();
			}
			@Override
			public Adapter caseTNumberNode(TNumberNode object) {
				return createTNumberNodeAdapter();
			}
			@Override
			public Adapter caseTBoolNode(TBoolNode object) {
				return createTBoolNodeAdapter();
			}
			@Override
			public Adapter caseTClassNode(TClassNode object) {
				return createTClassNodeAdapter();
			}
			@Override
			public Adapter caseTAbstractType(TAbstractType object) {
				return createTAbstractTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.gravity.typegraph.basic.annotations.TAnnotationValue <em>TAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.typegraph.basic.annotations.TAnnotationValue
	 * @generated
	 */
	public Adapter createTAnnotationValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.typegraph.basic.annotations.TTextAnnotation <em>TText Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.typegraph.basic.annotations.TTextAnnotation
	 * @generated
	 */
	public Adapter createTTextAnnotationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.typegraph.basic.annotations.TAnnotationType <em>TAnnotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.typegraph.basic.annotations.TAnnotationType
	 * @generated
	 */
	public Adapter createTAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.typegraph.basic.annotations.TAnnotatable <em>TAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.typegraph.basic.annotations.TAnnotatable
	 * @generated
	 */
	public Adapter createTAnnotatableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.typegraph.basic.annotations.TTextNode <em>TText Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.typegraph.basic.annotations.TTextNode
	 * @generated
	 */
	public Adapter createTTextNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.typegraph.basic.annotations.TNumberNode <em>TNumber Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.typegraph.basic.annotations.TNumberNode
	 * @generated
	 */
	public Adapter createTNumberNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.typegraph.basic.annotations.TBoolNode <em>TBool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.typegraph.basic.annotations.TBoolNode
	 * @generated
	 */
	public Adapter createTBoolNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.typegraph.basic.annotations.TClassNode <em>TClass Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.typegraph.basic.annotations.TClassNode
	 * @generated
	 */
	public Adapter createTClassNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.typegraph.basic.TAbstractType <em>TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.typegraph.basic.TAbstractType
	 * @generated
	 */
	public Adapter createTAbstractTypeAdapter() {
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

} //AnnotationsAdapterFactory
