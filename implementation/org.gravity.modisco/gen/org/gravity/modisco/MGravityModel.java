/**
 */
package org.gravity.modisco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.TypeParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MGravity Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MGravityModel#getMMethodDefinitions <em>MMethod Definitions</em>}</li>
 *   <li>{@link org.gravity.modisco.MGravityModel#getMFieldDefinitions <em>MField Definitions</em>}</li>
 *   <li>{@link org.gravity.modisco.MGravityModel#getMConstructorDefinitions <em>MConstructor Definitions</em>}</li>
 *   <li>{@link org.gravity.modisco.MGravityModel#getMMethodNames <em>MMethod Names</em>}</li>
 *   <li>{@link org.gravity.modisco.MGravityModel#getMNames <em>MNames</em>}</li>
 *   <li>{@link org.gravity.modisco.MGravityModel#getMMethodSignatures <em>MMethod Signatures</em>}</li>
 *   <li>{@link org.gravity.modisco.MGravityModel#getMFieldSignatures <em>MField Signatures</em>}</li>
 *   <li>{@link org.gravity.modisco.MGravityModel#getMFieldNames <em>MField Names</em>}</li>
 *   <li>{@link org.gravity.modisco.MGravityModel#getMAbstractMethodDefinitions <em>MAbstract Method Definitions</em>}</li>
 *   <li>{@link org.gravity.modisco.MGravityModel#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.gravity.modisco.MGravityModel#getMExtensions <em>MExtensions</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMGravityModel()
 * @model
 * @generated
 */
public interface MGravityModel extends Model {
	/**
	 * Returns the value of the '<em><b>MMethod Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MMethodDefinition}.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MMethodDefinition#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMethod Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMethod Definitions</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMGravityModel_MMethodDefinitions()
	 * @see org.gravity.modisco.MMethodDefinition#getModel
	 * @model opposite="model"
	 * @generated
	 */
	EList<MMethodDefinition> getMMethodDefinitions();

	/**
	 * Returns the value of the '<em><b>MField Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MFieldDefinition}.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MFieldDefinition#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MField Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MField Definitions</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMGravityModel_MFieldDefinitions()
	 * @see org.gravity.modisco.MFieldDefinition#getModel
	 * @model opposite="model"
	 * @generated
	 */
	EList<MFieldDefinition> getMFieldDefinitions();

	/**
	 * Returns the value of the '<em><b>MConstructor Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MConstructorDefinition}.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MConstructorDefinition#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MConstructor Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MConstructor Definitions</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMGravityModel_MConstructorDefinitions()
	 * @see org.gravity.modisco.MConstructorDefinition#getModel
	 * @model opposite="model"
	 * @generated
	 */
	EList<MConstructorDefinition> getMConstructorDefinitions();

	/**
	 * Returns the value of the '<em><b>MMethod Names</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.modisco.MMethodName}.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MMethodName#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMethod Names</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMethod Names</em>' containment reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMGravityModel_MMethodNames()
	 * @see org.gravity.modisco.MMethodName#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<MMethodName> getMMethodNames();

	/**
	 * Returns the value of the '<em><b>MNames</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MNames</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MNames</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMGravityModel_MNames()
	 * @model
	 * @generated
	 */
	EList<MName> getMNames();

	/**
	 * Returns the value of the '<em><b>MMethod Signatures</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.modisco.MMethodSignature}.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MMethodSignature#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMethod Signatures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMethod Signatures</em>' containment reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMGravityModel_MMethodSignatures()
	 * @see org.gravity.modisco.MMethodSignature#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<MMethodSignature> getMMethodSignatures();

	/**
	 * Returns the value of the '<em><b>MField Signatures</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.modisco.MFieldSignature}.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MFieldSignature#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MField Signatures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MField Signatures</em>' containment reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMGravityModel_MFieldSignatures()
	 * @see org.gravity.modisco.MFieldSignature#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<MFieldSignature> getMFieldSignatures();

	/**
	 * Returns the value of the '<em><b>MField Names</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.modisco.MFieldName}.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MFieldName#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MField Names</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MField Names</em>' containment reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMGravityModel_MFieldNames()
	 * @see org.gravity.modisco.MFieldName#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<MFieldName> getMFieldNames();

	/**
	 * Returns the value of the '<em><b>MAbstract Method Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MAbstractMethodDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MAbstract Method Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MAbstract Method Definitions</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMGravityModel_MAbstractMethodDefinitions()
	 * @model
	 * @generated
	 */
	EList<MAbstractMethodDefinition> getMAbstractMethodDefinitions();

	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.java.TypeParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMGravityModel_TypeParameters()
	 * @model
	 * @generated
	 */
	EList<TypeParameter> getTypeParameters();

	/**
	 * Returns the value of the '<em><b>MExtensions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.modisco.MExtension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MExtensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MExtensions</em>' containment reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMGravityModel_MExtensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<MExtension> getMExtensions();

} // MGravityModel
