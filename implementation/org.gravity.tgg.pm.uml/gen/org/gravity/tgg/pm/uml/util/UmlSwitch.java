/**
 */
package org.gravity.tgg.pm.uml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.tgg.pm.uml.*;

import org.moflon.tgg.runtime.AbstractCorrespondence;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.gravity.tgg.pm.uml.UmlPackage
 * @generated
 */
public class UmlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UmlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlSwitch() {
		if (modelPackage == null) {
			modelPackage = UmlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case UmlPackage.INTERFACE2_TINTERFACE: {
			Interface2TInterface interface2TInterface = (Interface2TInterface) theEObject;
			T result = caseInterface2TInterface(interface2TInterface);
			if (result == null)
				result = caseAbstractCorrespondence(interface2TInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.CLASS2_TCLASS: {
			Class2TClass class2TClass = (Class2TClass) theEObject;
			T result = caseClass2TClass(class2TClass);
			if (result == null)
				result = caseAbstractCorrespondence(class2TClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.PRIMITIVE_TYPE2_TCLASS: {
			PrimitiveType2TClass primitiveType2TClass = (PrimitiveType2TClass) theEObject;
			T result = casePrimitiveType2TClass(primitiveType2TClass);
			if (result == null)
				result = caseAbstractCorrespondence(primitiveType2TClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.PACKAGE2_TPACKAGE: {
			Package2TPackage package2TPackage = (Package2TPackage) theEObject;
			T result = casePackage2TPackage(package2TPackage);
			if (result == null)
				result = caseAbstractCorrespondence(package2TPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.OPERATION2_TMETHOD_DEFINITION: {
			Operation2TMethodDefinition operation2TMethodDefinition = (Operation2TMethodDefinition) theEObject;
			T result = caseOperation2TMethodDefinition(operation2TMethodDefinition);
			if (result == null)
				result = caseAbstractCorrespondence(operation2TMethodDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.FEATURE2_TMEMBER: {
			Feature2TMember feature2TMember = (Feature2TMember) theEObject;
			T result = caseFeature2TMember(feature2TMember);
			if (result == null)
				result = caseAbstractCorrespondence(feature2TMember);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.FDEPENDENCY2_TACCESS: {
			FDependency2TAccess fDependency2TAccess = (FDependency2TAccess) theEObject;
			T result = caseFDependency2TAccess(fDependency2TAccess);
			if (result == null)
				result = caseAbstractCorrespondence(fDependency2TAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.PROPERTY2_TFIELD_NAME: {
			Property2TFieldName property2TFieldName = (Property2TFieldName) theEObject;
			T result = caseProperty2TFieldName(property2TFieldName);
			if (result == null)
				result = caseAbstractCorrespondence(property2TFieldName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.PROPERTY2_TFIELD_DEFINITION: {
			Property2TFieldDefinition property2TFieldDefinition = (Property2TFieldDefinition) theEObject;
			T result = caseProperty2TFieldDefinition(property2TFieldDefinition);
			if (result == null)
				result = caseAbstractCorrespondence(property2TFieldDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.PROPERTY2_TFIELD_SIGNATURE: {
			Property2TFieldSignature property2TFieldSignature = (Property2TFieldSignature) theEObject;
			T result = caseProperty2TFieldSignature(property2TFieldSignature);
			if (result == null)
				result = caseAbstractCorrespondence(property2TFieldSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.PARAMETER2_TPARAMETER: {
			Parameter2TParameter parameter2TParameter = (Parameter2TParameter) theEObject;
			T result = caseParameter2TParameter(parameter2TParameter);
			if (result == null)
				result = caseAbstractCorrespondence(parameter2TParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.STEREOTYPE_PROPERTY2_ANNOTATION_NODE: {
			StereotypeProperty2AnnotationNode stereotypeProperty2AnnotationNode = (StereotypeProperty2AnnotationNode) theEObject;
			T result = caseStereotypeProperty2AnnotationNode(stereotypeProperty2AnnotationNode);
			if (result == null)
				result = caseAbstractCorrespondence(stereotypeProperty2AnnotationNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.MODEL2_TYPE_GRAPH: {
			Model2TypeGraph model2TypeGraph = (Model2TypeGraph) theEObject;
			T result = caseModel2TypeGraph(model2TypeGraph);
			if (result == null)
				result = caseAbstractCorrespondence(model2TypeGraph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.TYPE2_TABSTRACT_TYPE: {
			Type2TAbstractType type2TAbstractType = (Type2TAbstractType) theEObject;
			T result = caseType2TAbstractType(type2TAbstractType);
			if (result == null)
				result = caseAbstractCorrespondence(type2TAbstractType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.OPERATION2_TMETHOD_NAME: {
			Operation2TMethodName operation2TMethodName = (Operation2TMethodName) theEObject;
			T result = caseOperation2TMethodName(operation2TMethodName);
			if (result == null)
				result = caseAbstractCorrespondence(operation2TMethodName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.OPERATION2_TMETHOD_SIGNATURE: {
			Operation2TMethodSignature operation2TMethodSignature = (Operation2TMethodSignature) theEObject;
			T result = caseOperation2TMethodSignature(operation2TMethodSignature);
			if (result == null)
				result = caseAbstractCorrespondence(operation2TMethodSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.COMMENT2_TTEXT_ANNOTATION: {
			Comment2TTextAnnotation comment2TTextAnnotation = (Comment2TTextAnnotation) theEObject;
			T result = caseComment2TTextAnnotation(comment2TTextAnnotation);
			if (result == null)
				result = caseAbstractCorrespondence(comment2TTextAnnotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.STEREOTYPE2_TANNOTATION: {
			Stereotype2TAnnotation stereotype2TAnnotation = (Stereotype2TAnnotation) theEObject;
			T result = caseStereotype2TAnnotation(stereotype2TAnnotation);
			if (result == null)
				result = caseAbstractCorrespondence(stereotype2TAnnotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.FEATURE2_TSIGNATURE: {
			Feature2TSignature feature2TSignature = (Feature2TSignature) theEObject;
			T result = caseFeature2TSignature(feature2TSignature);
			if (result == null)
				result = caseAbstractCorrespondence(feature2TSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UmlPackage.ELEMENT2_TANNOTATABLE: {
			Element2TAnnotatable element2TAnnotatable = (Element2TAnnotatable) theEObject;
			T result = caseElement2TAnnotatable(element2TAnnotatable);
			if (result == null)
				result = caseAbstractCorrespondence(element2TAnnotatable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface2 TInterface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface2 TInterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface2TInterface(Interface2TInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class2 TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class2 TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass2TClass(Class2TClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type2 TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type2 TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType2TClass(PrimitiveType2TClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package2 TPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package2 TPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage2TPackage(Package2TPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation2 TMethod Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation2 TMethod Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation2TMethodDefinition(Operation2TMethodDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature2 TMember</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature2 TMember</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature2TMember(Feature2TMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FDependency2 TAccess</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FDependency2 TAccess</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFDependency2TAccess(FDependency2TAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property2 TField Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property2 TField Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty2TFieldName(Property2TFieldName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property2 TField Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property2 TField Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty2TFieldDefinition(Property2TFieldDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property2 TField Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property2 TField Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty2TFieldSignature(Property2TFieldSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter2 TParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter2 TParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter2TParameter(Parameter2TParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype Property2 Annotation Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype Property2 Annotation Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotypeProperty2AnnotationNode(StereotypeProperty2AnnotationNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model2 Type Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model2 Type Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel2TypeGraph(Model2TypeGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type2 TAbstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type2 TAbstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType2TAbstractType(Type2TAbstractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation2 TMethod Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation2 TMethod Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation2TMethodName(Operation2TMethodName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation2 TMethod Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation2 TMethod Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation2TMethodSignature(Operation2TMethodSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment2 TText Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment2 TText Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment2TTextAnnotation(Comment2TTextAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype2 TAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype2 TAnnotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotype2TAnnotation(Stereotype2TAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature2 TSignature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature2 TSignature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature2TSignature(Feature2TSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element2 TAnnotatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element2 TAnnotatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement2TAnnotatable(Element2TAnnotatable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCorrespondence(AbstractCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UmlSwitch
