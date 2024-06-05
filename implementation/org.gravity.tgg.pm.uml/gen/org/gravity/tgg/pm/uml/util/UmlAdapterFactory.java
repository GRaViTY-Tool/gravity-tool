/**
 */
package org.gravity.tgg.pm.uml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gravity.tgg.pm.uml.*;

import org.moflon.tgg.runtime.AbstractCorrespondence;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.tgg.pm.uml.UmlPackage
 * @generated
 */
public class UmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UmlPackage.eINSTANCE;
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
	protected UmlSwitch<Adapter> modelSwitch = new UmlSwitch<Adapter>() {
		@Override
		public Adapter caseStereotypeProperty2AnnotationNode(StereotypeProperty2AnnotationNode object) {
			return createStereotypeProperty2AnnotationNodeAdapter();
		}

		@Override
		public Adapter caseOperation2TMethodSignature(Operation2TMethodSignature object) {
			return createOperation2TMethodSignatureAdapter();
		}

		@Override
		public Adapter caseFDependency2TAccess(FDependency2TAccess object) {
			return createFDependency2TAccessAdapter();
		}

		@Override
		public Adapter caseOperation2TMethodDefinition(Operation2TMethodDefinition object) {
			return createOperation2TMethodDefinitionAdapter();
		}

		@Override
		public Adapter caseComment2TTextAnnotation(Comment2TTextAnnotation object) {
			return createComment2TTextAnnotationAdapter();
		}

		@Override
		public Adapter caseStereotype2TAnnotation(Stereotype2TAnnotation object) {
			return createStereotype2TAnnotationAdapter();
		}

		@Override
		public Adapter caseType2TAbstractType(Type2TAbstractType object) {
			return createType2TAbstractTypeAdapter();
		}

		@Override
		public Adapter caseProperty2TFieldDefinition(Property2TFieldDefinition object) {
			return createProperty2TFieldDefinitionAdapter();
		}

		@Override
		public Adapter casePackage2TPackage(Package2TPackage object) {
			return createPackage2TPackageAdapter();
		}

		@Override
		public Adapter caseModel2TypeGraph(Model2TypeGraph object) {
			return createModel2TypeGraphAdapter();
		}

		@Override
		public Adapter caseProperty2TFieldSignature(Property2TFieldSignature object) {
			return createProperty2TFieldSignatureAdapter();
		}

		@Override
		public Adapter caseOperation2TMethodName(Operation2TMethodName object) {
			return createOperation2TMethodNameAdapter();
		}

		@Override
		public Adapter caseParameter2TParameter(Parameter2TParameter object) {
			return createParameter2TParameterAdapter();
		}

		@Override
		public Adapter caseElement2TAnnotatable(Element2TAnnotatable object) {
			return createElement2TAnnotatableAdapter();
		}

		@Override
		public Adapter caseFeature2TMember(Feature2TMember object) {
			return createFeature2TMemberAdapter();
		}

		@Override
		public Adapter caseFeature2TSignature(Feature2TSignature object) {
			return createFeature2TSignatureAdapter();
		}

		@Override
		public Adapter caseClass2TClass(Class2TClass object) {
			return createClass2TClassAdapter();
		}

		@Override
		public Adapter caseInterface2TInterface(Interface2TInterface object) {
			return createInterface2TInterfaceAdapter();
		}

		@Override
		public Adapter casePrimitiveType2TClass(PrimitiveType2TClass object) {
			return createPrimitiveType2TClassAdapter();
		}

		@Override
		public Adapter caseProperty2TFieldName(Property2TFieldName object) {
			return createProperty2TFieldNameAdapter();
		}

		@Override
		public Adapter caseAbstractCorrespondence(AbstractCorrespondence object) {
			return createAbstractCorrespondenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.pm.uml.StereotypeProperty2AnnotationNode <em>Stereotype Property2 Annotation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.pm.uml.StereotypeProperty2AnnotationNode
	 * @generated
	 */
	public Adapter createStereotypeProperty2AnnotationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.pm.uml.Operation2TMethodSignature <em>Operation2 TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.pm.uml.Operation2TMethodSignature
	 * @generated
	 */
	public Adapter createOperation2TMethodSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.pm.uml.FDependency2TAccess <em>FDependency2 TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.pm.uml.FDependency2TAccess
	 * @generated
	 */
	public Adapter createFDependency2TAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.pm.uml.Operation2TMethodDefinition <em>Operation2 TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.pm.uml.Operation2TMethodDefinition
	 * @generated
	 */
	public Adapter createOperation2TMethodDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.pm.uml.Comment2TTextAnnotation <em>Comment2 TText Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.pm.uml.Comment2TTextAnnotation
	 * @generated
	 */
	public Adapter createComment2TTextAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.pm.uml.Stereotype2TAnnotation <em>Stereotype2 TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.pm.uml.Stereotype2TAnnotation
	 * @generated
	 */
	public Adapter createStereotype2TAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.pm.uml.Type2TAbstractType <em>Type2 TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.pm.uml.Type2TAbstractType
	 * @generated
	 */
	public Adapter createType2TAbstractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.pm.uml.Property2TFieldDefinition <em>Property2 TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.pm.uml.Property2TFieldDefinition
	 * @generated
	 */
	public Adapter createProperty2TFieldDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.pm.uml.Package2TPackage <em>Package2 TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.pm.uml.Package2TPackage
	 * @generated
	 */
	public Adapter createPackage2TPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.pm.uml.Model2TypeGraph <em>Model2 Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.pm.uml.Model2TypeGraph
	 * @generated
	 */
	public Adapter createModel2TypeGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.pm.uml.Property2TFieldSignature <em>Property2 TField Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.pm.uml.Property2TFieldSignature
	 * @generated
	 */
	public Adapter createProperty2TFieldSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.pm.uml.Operation2TMethodName <em>Operation2 TMethod Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.pm.uml.Operation2TMethodName
	 * @generated
	 */
	public Adapter createOperation2TMethodNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.pm.uml.Parameter2TParameter <em>Parameter2 TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.pm.uml.Parameter2TParameter
	 * @generated
	 */
	public Adapter createParameter2TParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.pm.uml.Element2TAnnotatable <em>Element2 TAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.pm.uml.Element2TAnnotatable
	 * @generated
	 */
	public Adapter createElement2TAnnotatableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.pm.uml.Feature2TMember <em>Feature2 TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.pm.uml.Feature2TMember
	 * @generated
	 */
	public Adapter createFeature2TMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.pm.uml.Feature2TSignature <em>Feature2 TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.pm.uml.Feature2TSignature
	 * @generated
	 */
	public Adapter createFeature2TSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.pm.uml.Class2TClass <em>Class2 TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.pm.uml.Class2TClass
	 * @generated
	 */
	public Adapter createClass2TClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.pm.uml.Interface2TInterface <em>Interface2 TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.pm.uml.Interface2TInterface
	 * @generated
	 */
	public Adapter createInterface2TInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.pm.uml.PrimitiveType2TClass <em>Primitive Type2 TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.pm.uml.PrimitiveType2TClass
	 * @generated
	 */
	public Adapter createPrimitiveType2TClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.pm.uml.Property2TFieldName <em>Property2 TField Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.pm.uml.Property2TFieldName
	 * @generated
	 */
	public Adapter createProperty2TFieldNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.tgg.runtime.AbstractCorrespondence <em>Abstract Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.tgg.runtime.AbstractCorrespondence
	 * @generated
	 */
	public Adapter createAbstractCorrespondenceAdapter() {
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

} //UmlAdapterFactory
