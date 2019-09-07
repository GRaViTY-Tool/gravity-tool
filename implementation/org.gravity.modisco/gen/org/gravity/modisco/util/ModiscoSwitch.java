/**
 */
package org.gravity.modisco.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.AbstractTypeQualifiedExpression;
import org.eclipse.gmt.modisco.java.AbstractVariablesContainer;
import org.eclipse.gmt.modisco.java.Annotation;
import org.eclipse.gmt.modisco.java.AnonymousClassDeclaration;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.ClassInstanceCreation;
import org.eclipse.gmt.modisco.java.ConstructorDeclaration;
import org.eclipse.gmt.modisco.java.ConstructorInvocation;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.MethodInvocation;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.NamedElement;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.Statement;
import org.eclipse.gmt.modisco.java.SuperConstructorInvocation;
import org.eclipse.gmt.modisco.java.SuperMethodInvocation;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeDeclaration;

import org.eclipse.gmt.modisco.java.VariableDeclaration;
import org.gravity.modisco.*;

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
 * @see org.gravity.modisco.ModiscoPackage
 * @generated
 */
public class ModiscoSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModiscoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModiscoSwitch() {
		if (modelPackage == null) {
			modelPackage = ModiscoPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModiscoPackage.MABSTRACT_METHOD_DEFINITION: {
				MAbstractMethodDefinition mAbstractMethodDefinition = (MAbstractMethodDefinition)theEObject;
				T result = caseMAbstractMethodDefinition(mAbstractMethodDefinition);
				if (result == null) result = caseMDefinition(mAbstractMethodDefinition);
				if (result == null) result = caseAbstractMethodDeclaration(mAbstractMethodDefinition);
				if (result == null) result = caseBodyDeclaration(mAbstractMethodDefinition);
				if (result == null) result = caseMAbstractFlowElement(mAbstractMethodDefinition);
				if (result == null) result = caseNamedElement(mAbstractMethodDefinition);
				if (result == null) result = caseASTNode(mAbstractMethodDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MACCESS: {
				MAccess mAccess = (MAccess)theEObject;
				T result = caseMAccess(mAccess);
				if (result == null) result = caseMAbstractFlowElement(mAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION: {
				MConstructorDefinition mConstructorDefinition = (MConstructorDefinition)theEObject;
				T result = caseMConstructorDefinition(mConstructorDefinition);
				if (result == null) result = caseMAbstractMethodDefinition(mConstructorDefinition);
				if (result == null) result = caseConstructorDeclaration(mConstructorDefinition);
				if (result == null) result = caseMDefinition(mConstructorDefinition);
				if (result == null) result = caseAbstractMethodDeclaration(mConstructorDefinition);
				if (result == null) result = caseBodyDeclaration(mConstructorDefinition);
				if (result == null) result = caseMAbstractFlowElement(mConstructorDefinition);
				if (result == null) result = caseNamedElement(mConstructorDefinition);
				if (result == null) result = caseASTNode(mConstructorDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MDEFINITION: {
				MDefinition mDefinition = (MDefinition)theEObject;
				T result = caseMDefinition(mDefinition);
				if (result == null) result = caseBodyDeclaration(mDefinition);
				if (result == null) result = caseMAbstractFlowElement(mDefinition);
				if (result == null) result = caseNamedElement(mDefinition);
				if (result == null) result = caseASTNode(mDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MMETHOD_SIGNATURE: {
				MMethodSignature mMethodSignature = (MMethodSignature)theEObject;
				T result = caseMMethodSignature(mMethodSignature);
				if (result == null) result = caseMSignature(mMethodSignature);
				if (result == null) result = caseMAbstractFlowElement(mMethodSignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MPARAMETER_LIST: {
				MParameterList mParameterList = (MParameterList)theEObject;
				T result = caseMParameterList(mParameterList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MNAME: {
				MName mName = (MName)theEObject;
				T result = caseMName(mName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MMETHOD_NAME: {
				MMethodName mMethodName = (MMethodName)theEObject;
				T result = caseMMethodName(mMethodName);
				if (result == null) result = caseMName(mMethodName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MFIELD_NAME: {
				MFieldName mFieldName = (MFieldName)theEObject;
				T result = caseMFieldName(mFieldName);
				if (result == null) result = caseMName(mFieldName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MFIELD_DEFINITION: {
				MFieldDefinition mFieldDefinition = (MFieldDefinition)theEObject;
				T result = caseMFieldDefinition(mFieldDefinition);
				if (result == null) result = caseMDefinition(mFieldDefinition);
				if (result == null) result = caseFieldDeclaration(mFieldDefinition);
				if (result == null) result = caseBodyDeclaration(mFieldDefinition);
				if (result == null) result = caseMAbstractFlowElement(mFieldDefinition);
				if (result == null) result = caseAbstractVariablesContainer(mFieldDefinition);
				if (result == null) result = caseNamedElement(mFieldDefinition);
				if (result == null) result = caseASTNode(mFieldDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MMETHOD_DEFINITION: {
				MMethodDefinition mMethodDefinition = (MMethodDefinition)theEObject;
				T result = caseMMethodDefinition(mMethodDefinition);
				if (result == null) result = caseMethodDeclaration(mMethodDefinition);
				if (result == null) result = caseMAbstractMethodDefinition(mMethodDefinition);
				if (result == null) result = caseAbstractMethodDeclaration(mMethodDefinition);
				if (result == null) result = caseMDefinition(mMethodDefinition);
				if (result == null) result = caseBodyDeclaration(mMethodDefinition);
				if (result == null) result = caseMAbstractFlowElement(mMethodDefinition);
				if (result == null) result = caseNamedElement(mMethodDefinition);
				if (result == null) result = caseASTNode(mMethodDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MSIGNATURE: {
				MSignature mSignature = (MSignature)theEObject;
				T result = caseMSignature(mSignature);
				if (result == null) result = caseMAbstractFlowElement(mSignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MENTRY: {
				MEntry mEntry = (MEntry)theEObject;
				T result = caseMEntry(mEntry);
				if (result == null) result = caseMAbstractFlowElement(mEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MGRAVITY_MODEL: {
				MGravityModel mGravityModel = (MGravityModel)theEObject;
				T result = caseMGravityModel(mGravityModel);
				if (result == null) result = caseModel(mGravityModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MFIELD_SIGNATURE: {
				MFieldSignature mFieldSignature = (MFieldSignature)theEObject;
				T result = caseMFieldSignature(mFieldSignature);
				if (result == null) result = caseMSignature(mFieldSignature);
				if (result == null) result = caseMAbstractFlowElement(mFieldSignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MANNOTATION: {
				MAnnotation mAnnotation = (MAnnotation)theEObject;
				T result = caseMAnnotation(mAnnotation);
				if (result == null) result = caseAnnotation(mAnnotation);
				if (result == null) result = caseExpression(mAnnotation);
				if (result == null) result = caseASTNode(mAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MSYNTHETIC_METHOD_DEFINITION: {
				MSyntheticMethodDefinition mSyntheticMethodDefinition = (MSyntheticMethodDefinition)theEObject;
				T result = caseMSyntheticMethodDefinition(mSyntheticMethodDefinition);
				if (result == null) result = caseBodyDeclaration(mSyntheticMethodDefinition);
				if (result == null) result = caseNamedElement(mSyntheticMethodDefinition);
				if (result == null) result = caseASTNode(mSyntheticMethodDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.METHOD_INVOCATION_STATIC_TYPE: {
				MethodInvocationStaticType methodInvocationStaticType = (MethodInvocationStaticType)theEObject;
				T result = caseMethodInvocationStaticType(methodInvocationStaticType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MANONYMOUS: {
				MAnonymous mAnonymous = (MAnonymous)theEObject;
				T result = caseMAnonymous(mAnonymous);
				if (result == null) result = caseAnonymousClassDeclaration(mAnonymous);
				if (result == null) result = caseASTNode(mAnonymous);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MCLASS: {
				MClass mClass = (MClass)theEObject;
				T result = caseMClass(mClass);
				if (result == null) result = caseClassDeclaration(mClass);
				if (result == null) result = caseTypeDeclaration(mClass);
				if (result == null) result = caseAbstractTypeDeclaration(mClass);
				if (result == null) result = caseBodyDeclaration(mClass);
				if (result == null) result = caseType(mClass);
				if (result == null) result = caseNamedElement(mClass);
				if (result == null) result = caseASTNode(mClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MEXTENSION: {
				MExtension mExtension = (MExtension)theEObject;
				T result = caseMExtension(mExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MFLOW: {
				MFlow mFlow = (MFlow)theEObject;
				T result = caseMFlow(mFlow);
				if (result == null) result = caseMAbstractFlowElement(mFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MABSTRACT_FLOW_ELEMENT: {
				MAbstractFlowElement mAbstractFlowElement = (MAbstractFlowElement)theEObject;
				T result = caseMAbstractFlowElement(mAbstractFlowElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS: {
				MSingleVariableAccess mSingleVariableAccess = (MSingleVariableAccess)theEObject;
				T result = caseMSingleVariableAccess(mSingleVariableAccess);
				if (result == null) result = caseSingleVariableAccess(mSingleVariableAccess);
				if (result == null) result = caseMAccess(mSingleVariableAccess);
				if (result == null) result = caseExpression(mSingleVariableAccess);
				if (result == null) result = caseMAbstractFlowElement(mSingleVariableAccess);
				if (result == null) result = caseASTNode(mSingleVariableAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MMETHOD_INVOCATION: {
				MMethodInvocation mMethodInvocation = (MMethodInvocation)theEObject;
				T result = caseMMethodInvocation(mMethodInvocation);
				if (result == null) result = caseMethodInvocation(mMethodInvocation);
				if (result == null) result = caseMAbstractMethodInvocation(mMethodInvocation);
				if (result == null) result = caseExpression(mMethodInvocation);
				if (result == null) result = caseAbstractMethodInvocation(mMethodInvocation);
				if (result == null) result = caseMAccess(mMethodInvocation);
				if (result == null) result = caseASTNode(mMethodInvocation);
				if (result == null) result = caseMAbstractFlowElement(mMethodInvocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MCONSTRUCTOR_INVOCATION: {
				MConstructorInvocation mConstructorInvocation = (MConstructorInvocation)theEObject;
				T result = caseMConstructorInvocation(mConstructorInvocation);
				if (result == null) result = caseConstructorInvocation(mConstructorInvocation);
				if (result == null) result = caseMAbstractMethodInvocation(mConstructorInvocation);
				if (result == null) result = caseStatement(mConstructorInvocation);
				if (result == null) result = caseAbstractMethodInvocation(mConstructorInvocation);
				if (result == null) result = caseMAccess(mConstructorInvocation);
				if (result == null) result = caseASTNode(mConstructorInvocation);
				if (result == null) result = caseMAbstractFlowElement(mConstructorInvocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MSINGLE_VARIABLE_DECLARATION: {
				MSingleVariableDeclaration mSingleVariableDeclaration = (MSingleVariableDeclaration)theEObject;
				T result = caseMSingleVariableDeclaration(mSingleVariableDeclaration);
				if (result == null) result = caseSingleVariableDeclaration(mSingleVariableDeclaration);
				if (result == null) result = caseVariableDeclaration(mSingleVariableDeclaration);
				if (result == null) result = caseNamedElement(mSingleVariableDeclaration);
				if (result == null) result = caseASTNode(mSingleVariableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MABSTRACT_METHOD_INVOCATION: {
				MAbstractMethodInvocation mAbstractMethodInvocation = (MAbstractMethodInvocation)theEObject;
				T result = caseMAbstractMethodInvocation(mAbstractMethodInvocation);
				if (result == null) result = caseAbstractMethodInvocation(mAbstractMethodInvocation);
				if (result == null) result = caseMAccess(mAbstractMethodInvocation);
				if (result == null) result = caseASTNode(mAbstractMethodInvocation);
				if (result == null) result = caseMAbstractFlowElement(mAbstractMethodInvocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MSUPER_METHOD_INVOCATION: {
				MSuperMethodInvocation mSuperMethodInvocation = (MSuperMethodInvocation)theEObject;
				T result = caseMSuperMethodInvocation(mSuperMethodInvocation);
				if (result == null) result = caseSuperMethodInvocation(mSuperMethodInvocation);
				if (result == null) result = caseMAbstractMethodInvocation(mSuperMethodInvocation);
				if (result == null) result = caseAbstractTypeQualifiedExpression(mSuperMethodInvocation);
				if (result == null) result = caseAbstractMethodInvocation(mSuperMethodInvocation);
				if (result == null) result = caseMAccess(mSuperMethodInvocation);
				if (result == null) result = caseExpression(mSuperMethodInvocation);
				if (result == null) result = caseMAbstractFlowElement(mSuperMethodInvocation);
				if (result == null) result = caseASTNode(mSuperMethodInvocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MCLASS_INSTANCE_CREATION: {
				MClassInstanceCreation mClassInstanceCreation = (MClassInstanceCreation)theEObject;
				T result = caseMClassInstanceCreation(mClassInstanceCreation);
				if (result == null) result = caseClassInstanceCreation(mClassInstanceCreation);
				if (result == null) result = caseMAbstractMethodInvocation(mClassInstanceCreation);
				if (result == null) result = caseExpression(mClassInstanceCreation);
				if (result == null) result = caseAbstractMethodInvocation(mClassInstanceCreation);
				if (result == null) result = caseMAccess(mClassInstanceCreation);
				if (result == null) result = caseASTNode(mClassInstanceCreation);
				if (result == null) result = caseMAbstractFlowElement(mClassInstanceCreation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoPackage.MSUPER_CONSTRUCTOR_INVOCATION: {
				MSuperConstructorInvocation mSuperConstructorInvocation = (MSuperConstructorInvocation)theEObject;
				T result = caseMSuperConstructorInvocation(mSuperConstructorInvocation);
				if (result == null) result = caseSuperConstructorInvocation(mSuperConstructorInvocation);
				if (result == null) result = caseMAbstractMethodInvocation(mSuperConstructorInvocation);
				if (result == null) result = caseStatement(mSuperConstructorInvocation);
				if (result == null) result = caseAbstractMethodInvocation(mSuperConstructorInvocation);
				if (result == null) result = caseMAccess(mSuperConstructorInvocation);
				if (result == null) result = caseASTNode(mSuperConstructorInvocation);
				if (result == null) result = caseMAbstractFlowElement(mSuperConstructorInvocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAbstract Method Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAbstract Method Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAbstractMethodDefinition(MAbstractMethodDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAccess</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAccess</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAccess(MAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MConstructor Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MConstructor Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMConstructorDefinition(MConstructorDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDefinition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDefinition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDefinition(MDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMethod Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMethod Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMethodSignature(MMethodSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameter List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameter List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterList(MParameterList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MName</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MName</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMName(MName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMethod Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMethod Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMethodName(MMethodName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MField Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MField Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFieldName(MFieldName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MField Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MField Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFieldDefinition(MFieldDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMethod Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMethod Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMethodDefinition(MMethodDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMethod Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMethod Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMethodInvocation(MMethodInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MConstructor Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MConstructor Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMConstructorInvocation(MConstructorInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSingle Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSingle Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSingleVariableDeclaration(MSingleVariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAbstract Method Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAbstract Method Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAbstractMethodInvocation(MAbstractMethodInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSuper Method Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSuper Method Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSuperMethodInvocation(MSuperMethodInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MClass Instance Creation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MClass Instance Creation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMClassInstanceCreation(MClassInstanceCreation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSuper Constructor Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSuper Constructor Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSuperConstructorInvocation(MSuperConstructorInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSignature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSignature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSignature(MSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEntry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEntry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEntry(MEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MGravity Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MGravity Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMGravityModel(MGravityModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MField Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MField Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFieldSignature(MFieldSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAnnotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAnnotation(MAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSynthetic Method Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSynthetic Method Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSyntheticMethodDefinition(MSyntheticMethodDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Invocation Static Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Invocation Static Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodInvocationStaticType(MethodInvocationStaticType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAnonymous</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAnonymous</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAnonymous(MAnonymous object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMClass(MClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MExtension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MExtension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMExtension(MExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFlow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFlow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFlow(MFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAbstract Flow Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAbstract Flow Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAbstractFlowElement(MAbstractFlowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSingle Variable Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSingle Variable Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSingleVariableAccess(MSingleVariableAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AST Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AST Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASTNode(ASTNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyDeclaration(BodyDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodDeclaration(AbstractMethodDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorDeclaration(ConstructorDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Variables Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Variables Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractVariablesContainer(AbstractVariablesContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDeclaration(FieldDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDeclaration(MethodDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodInvocation(AbstractMethodInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodInvocation(MethodInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorInvocation(ConstructorInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration(VariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVariableDeclaration(SingleVariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type Qualified Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type Qualified Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTypeQualifiedExpression(AbstractTypeQualifiedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Method Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Method Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperMethodInvocation(SuperMethodInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Instance Creation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Instance Creation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassInstanceCreation(ClassInstanceCreation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Constructor Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Constructor Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperConstructorInvocation(SuperConstructorInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClassDeclaration(AnonymousClassDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTypeDeclaration(AbstractTypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDeclaration(TypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDeclaration(ClassDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Variable Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Variable Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVariableAccess(SingleVariableAccess object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //ModiscoSwitch
