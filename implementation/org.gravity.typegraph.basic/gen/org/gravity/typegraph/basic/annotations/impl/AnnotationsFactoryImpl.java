/**
 */
package org.gravity.typegraph.basic.annotations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.typegraph.basic.annotations.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationsFactoryImpl extends EFactoryImpl implements AnnotationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnnotationsFactory init() {
		try {
			AnnotationsFactory theAnnotationsFactory = (AnnotationsFactory)EPackage.Registry.INSTANCE.getEFactory(AnnotationsPackage.eNS_URI);
			if (theAnnotationsFactory != null) {
				return theAnnotationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnnotationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AnnotationsPackage.TANNOTATION_VALUE: return createTAnnotationValue();
			case AnnotationsPackage.TTEXT_ANNOTATION: return createTTextAnnotation();
			case AnnotationsPackage.TANNOTATION: return createTAnnotation();
			case AnnotationsPackage.TANNOTATION_TYPE: return createTAnnotationType();
			case AnnotationsPackage.TTEXT_NODE: return createTTextNode();
			case AnnotationsPackage.TNUMBER_NODE: return createTNumberNode();
			case AnnotationsPackage.TBOOL_NODE: return createTBoolNode();
			case AnnotationsPackage.TCLASS_NODE: return createTClassNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAnnotationValue createTAnnotationValue() {
		TAnnotationValueImpl tAnnotationValue = new TAnnotationValueImpl();
		return tAnnotationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTextAnnotation createTTextAnnotation() {
		TTextAnnotationImpl tTextAnnotation = new TTextAnnotationImpl();
		return tTextAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAnnotation createTAnnotation() {
		TAnnotationImpl tAnnotation = new TAnnotationImpl();
		return tAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAnnotationType createTAnnotationType() {
		TAnnotationTypeImpl tAnnotationType = new TAnnotationTypeImpl();
		return tAnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTextNode createTTextNode() {
		TTextNodeImpl tTextNode = new TTextNodeImpl();
		return tTextNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TNumberNode createTNumberNode() {
		TNumberNodeImpl tNumberNode = new TNumberNodeImpl();
		return tNumberNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBoolNode createTBoolNode() {
		TBoolNodeImpl tBoolNode = new TBoolNodeImpl();
		return tBoolNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TClassNode createTClassNode() {
		TClassNodeImpl tClassNode = new TClassNodeImpl();
		return tClassNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationsPackage getAnnotationsPackage() {
		return (AnnotationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnnotationsPackage getPackage() {
		return AnnotationsPackage.eINSTANCE;
	}

} //AnnotationsFactoryImpl
