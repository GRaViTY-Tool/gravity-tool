/**
 */
package org.gravity.tgg.modisco.uml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gravity.tgg.modisco.uml.*;

import org.moflon.tgg.runtime.AbstractCorrespondence;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.tgg.modisco.uml.UmlPackage
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
		public Adapter caseJavaModel2UMLPackage(JavaModel2UMLPackage object) {
			return createJavaModel2UMLPackageAdapter();
		}

		@Override
		public Adapter caseASTNode2Element(ASTNode2Element object) {
			return createASTNode2ElementAdapter();
		}

		@Override
		public Adapter caseTypeAccess2Property(TypeAccess2Property object) {
			return createTypeAccess2PropertyAdapter();
		}

		@Override
		public Adapter caseParameterizedType2RedefinableTemplateSignature(
				ParameterizedType2RedefinableTemplateSignature object) {
			return createParameterizedType2RedefinableTemplateSignatureAdapter();
		}

		@Override
		public Adapter caseTypeAccess2Generalization(TypeAccess2Generalization object) {
			return createTypeAccess2GeneralizationAdapter();
		}

		@Override
		public Adapter caseTypeAccess2TemplateBinding(TypeAccess2TemplateBinding object) {
			return createTypeAccess2TemplateBindingAdapter();
		}

		@Override
		public Adapter caseModifier2NamedElement(Modifier2NamedElement object) {
			return createModifier2NamedElementAdapter();
		}

		@Override
		public Adapter caseTypeAccess2InterfaceRealization(TypeAccess2InterfaceRealization object) {
			return createTypeAccess2InterfaceRealizationAdapter();
		}

		@Override
		public Adapter caseJavaPackage2UmlPackage(JavaPackage2UmlPackage object) {
			return createJavaPackage2UmlPackageAdapter();
		}

		@Override
		public Adapter caseTypeAccess2Parameter(TypeAccess2Parameter object) {
			return createTypeAccess2ParameterAdapter();
		}

		@Override
		public Adapter caseCompilationUnit2Artifact(CompilationUnit2Artifact object) {
			return createCompilationUnit2ArtifactAdapter();
		}

		@Override
		public Adapter caseExpression2Comment(Expression2Comment object) {
			return createExpression2CommentAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.JavaModel2UMLPackage <em>Java Model2 UML Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.JavaModel2UMLPackage
	 * @generated
	 */
	public Adapter createJavaModel2UMLPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.ASTNode2Element <em>AST Node2 Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.ASTNode2Element
	 * @generated
	 */
	public Adapter createASTNode2ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.TypeAccess2Property <em>Type Access2 Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.TypeAccess2Property
	 * @generated
	 */
	public Adapter createTypeAccess2PropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.ParameterizedType2RedefinableTemplateSignature <em>Parameterized Type2 Redefinable Template Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.ParameterizedType2RedefinableTemplateSignature
	 * @generated
	 */
	public Adapter createParameterizedType2RedefinableTemplateSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.TypeAccess2Generalization <em>Type Access2 Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.TypeAccess2Generalization
	 * @generated
	 */
	public Adapter createTypeAccess2GeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.TypeAccess2TemplateBinding <em>Type Access2 Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.TypeAccess2TemplateBinding
	 * @generated
	 */
	public Adapter createTypeAccess2TemplateBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Modifier2NamedElement <em>Modifier2 Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Modifier2NamedElement
	 * @generated
	 */
	public Adapter createModifier2NamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization <em>Type Access2 Interface Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization
	 * @generated
	 */
	public Adapter createTypeAccess2InterfaceRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.JavaPackage2UmlPackage <em>Java Package2 Uml Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.JavaPackage2UmlPackage
	 * @generated
	 */
	public Adapter createJavaPackage2UmlPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.TypeAccess2Parameter <em>Type Access2 Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.TypeAccess2Parameter
	 * @generated
	 */
	public Adapter createTypeAccess2ParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.CompilationUnit2Artifact <em>Compilation Unit2 Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.CompilationUnit2Artifact
	 * @generated
	 */
	public Adapter createCompilationUnit2ArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Expression2Comment <em>Expression2 Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Expression2Comment
	 * @generated
	 */
	public Adapter createExpression2CommentAdapter() {
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
