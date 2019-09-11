/**
 */
package org.gravity.typegraph.basic.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.typegraph.basic.*;

import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;

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
 * @see org.gravity.typegraph.basic.BasicPackage
 * @generated
 */
public class BasicSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasicPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicSwitch() {
		if (modelPackage == null) {
			modelPackage = BasicPackage.eINSTANCE;
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
			case BasicPackage.TACCESS: {
				TAccess tAccess = (TAccess)theEObject;
				T result = caseTAccess(tAccess);
				if (result == null) result = caseTAbstractFlowElement(tAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TCLASS: {
				TClass tClass = (TClass)theEObject;
				T result = caseTClass(tClass);
				if (result == null) result = caseTAbstractType(tClass);
				if (result == null) result = caseTAnnotatable(tClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TFIELD: {
				TField tField = (TField)theEObject;
				T result = caseTField(tField);
				if (result == null) result = caseTName(tField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TFIELD_DEFINITION: {
				TFieldDefinition tFieldDefinition = (TFieldDefinition)theEObject;
				T result = caseTFieldDefinition(tFieldDefinition);
				if (result == null) result = caseTMember(tFieldDefinition);
				if (result == null) result = caseTAnnotatable(tFieldDefinition);
				if (result == null) result = caseTAbstractFlowElement(tFieldDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TFIELD_SIGNATURE: {
				TFieldSignature tFieldSignature = (TFieldSignature)theEObject;
				T result = caseTFieldSignature(tFieldSignature);
				if (result == null) result = caseTSignature(tFieldSignature);
				if (result == null) result = caseTAnnotatable(tFieldSignature);
				if (result == null) result = caseTAbstractFlowElement(tFieldSignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TCALL: {
				TCall tCall = (TCall)theEObject;
				T result = caseTCall(tCall);
				if (result == null) result = caseTAccess(tCall);
				if (result == null) result = caseTAbstractFlowElement(tCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TMEMBER: {
				TMember tMember = (TMember)theEObject;
				T result = caseTMember(tMember);
				if (result == null) result = caseTAnnotatable(tMember);
				if (result == null) result = caseTAbstractFlowElement(tMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TMETHOD: {
				TMethod tMethod = (TMethod)theEObject;
				T result = caseTMethod(tMethod);
				if (result == null) result = caseTName(tMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TMETHOD_DEFINITION: {
				TMethodDefinition tMethodDefinition = (TMethodDefinition)theEObject;
				T result = caseTMethodDefinition(tMethodDefinition);
				if (result == null) result = caseTMember(tMethodDefinition);
				if (result == null) result = caseTAnnotatable(tMethodDefinition);
				if (result == null) result = caseTAbstractFlowElement(tMethodDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TMETHOD_SIGNATURE: {
				TMethodSignature tMethodSignature = (TMethodSignature)theEObject;
				T result = caseTMethodSignature(tMethodSignature);
				if (result == null) result = caseTSignature(tMethodSignature);
				if (result == null) result = caseTAnnotatable(tMethodSignature);
				if (result == null) result = caseTAbstractFlowElement(tMethodSignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TPACKAGE: {
				TPackage tPackage = (TPackage)theEObject;
				T result = caseTPackage(tPackage);
				if (result == null) result = caseTAnnotatable(tPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TPARAMETER: {
				TParameter tParameter = (TParameter)theEObject;
				T result = caseTParameter(tParameter);
				if (result == null) result = caseTAnnotatable(tParameter);
				if (result == null) result = caseTAbstractFlowElement(tParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TSIGNATURE: {
				TSignature tSignature = (TSignature)theEObject;
				T result = caseTSignature(tSignature);
				if (result == null) result = caseTAnnotatable(tSignature);
				if (result == null) result = caseTAbstractFlowElement(tSignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TYPE_GRAPH: {
				TypeGraph typeGraph = (TypeGraph)theEObject;
				T result = caseTypeGraph(typeGraph);
				if (result == null) result = caseTAnnotatable(typeGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TINTERFACE: {
				TInterface tInterface = (TInterface)theEObject;
				T result = caseTInterface(tInterface);
				if (result == null) result = caseTAbstractType(tInterface);
				if (result == null) result = caseTAnnotatable(tInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TABSTRACT_TYPE: {
				TAbstractType tAbstractType = (TAbstractType)theEObject;
				T result = caseTAbstractType(tAbstractType);
				if (result == null) result = caseTAnnotatable(tAbstractType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TREAD: {
				TRead tRead = (TRead)theEObject;
				T result = caseTRead(tRead);
				if (result == null) result = caseTAccess(tRead);
				if (result == null) result = caseTAbstractFlowElement(tRead);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TWRITE: {
				TWrite tWrite = (TWrite)theEObject;
				T result = caseTWrite(tWrite);
				if (result == null) result = caseTAccess(tWrite);
				if (result == null) result = caseTAbstractFlowElement(tWrite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TMODIFIER: {
				TModifier tModifier = (TModifier)theEObject;
				T result = caseTModifier(tModifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TSYNTETHIC_METHOD: {
				TSyntethicMethod tSyntethicMethod = (TSyntethicMethod)theEObject;
				T result = caseTSyntethicMethod(tSyntethicMethod);
				if (result == null) result = caseTMember(tSyntethicMethod);
				if (result == null) result = caseTAnnotatable(tSyntethicMethod);
				if (result == null) result = caseTAbstractFlowElement(tSyntethicMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TUNRESOLVED_TYPE: {
				TUnresolvedType tUnresolvedType = (TUnresolvedType)theEObject;
				T result = caseTUnresolvedType(tUnresolvedType);
				if (result == null) result = caseTClass(tUnresolvedType);
				if (result == null) result = caseTInterface(tUnresolvedType);
				if (result == null) result = caseTAbstractType(tUnresolvedType);
				if (result == null) result = caseTAnnotatable(tUnresolvedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TNAME: {
				TName tName = (TName)theEObject;
				T result = caseTName(tName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TFLOW: {
				TFlow tFlow = (TFlow)theEObject;
				T result = caseTFlow(tFlow);
				if (result == null) result = caseTAbstractFlowElement(tFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TABSTRACT_FLOW_ELEMENT: {
				TAbstractFlowElement tAbstractFlowElement = (TAbstractFlowElement)theEObject;
				T result = caseTAbstractFlowElement(tAbstractFlowElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TREAD_WRITE: {
				TReadWrite tReadWrite = (TReadWrite)theEObject;
				T result = caseTReadWrite(tReadWrite);
				if (result == null) result = caseTAccess(tReadWrite);
				if (result == null) result = caseTAbstractFlowElement(tReadWrite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TCONSTRUCTOR: {
				TConstructor tConstructor = (TConstructor)theEObject;
				T result = caseTConstructor(tConstructor);
				if (result == null) result = caseTAnnotation(tConstructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.TENUM: {
				TEnum tEnum = (TEnum)theEObject;
				T result = caseTEnum(tEnum);
				if (result == null) result = caseTAnnotation(tEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAccess</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAccess</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAccess(TAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTClass(TClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTField(TField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TField Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TField Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTFieldDefinition(TFieldDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TField Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TField Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTFieldSignature(TFieldSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCall</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCall</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCall(TCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMember</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMember</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMember(TMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMethod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMethod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMethod(TMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMethod Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMethod Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMethodDefinition(TMethodDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMethod Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMethod Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMethodSignature(TMethodSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPackage(TPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTParameter(TParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSignature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSignature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSignature(TSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeGraph(TypeGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TInterface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TInterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTInterface(TInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAbstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAbstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAbstractType(TAbstractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRead</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRead</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRead(TRead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TWrite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TWrite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTWrite(TWrite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TModifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TModifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTModifier(TModifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSyntethic Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSyntethic Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSyntethicMethod(TSyntethicMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TUnresolved Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TUnresolved Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTUnresolvedType(TUnresolvedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TName</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TName</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTName(TName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TFlow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TFlow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTFlow(TFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAbstract Flow Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAbstract Flow Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAbstractFlowElement(TAbstractFlowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRead Write</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRead Write</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTReadWrite(TReadWrite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TConstructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TConstructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTConstructor(TConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEnum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEnum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEnum(TEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAnnotatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAnnotatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAnnotatable(TAnnotatable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAnnotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAnnotation(TAnnotation object) {
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

} //BasicSwitch
