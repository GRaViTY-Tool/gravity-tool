/**
 */
package org.gravity.modisco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.TypeParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MGravity Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MGravityModel#getMFieldDefinitions <em>MField Definitions</em>}</li>
 *   <li>{@link org.gravity.modisco.MGravityModel#getAnonymousClassDeclarations <em>Anonymous Class Declarations</em>}</li>
 *   <li>{@link org.gravity.modisco.MGravityModel#getMMethodNames <em>MMethod Names</em>}</li>
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
	 * Returns the value of the '<em><b>MField Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MFieldDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MField Definitions</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMGravityModel_MFieldDefinitions()
	 * @model
	 * @generated
	 */
	EList<MFieldDefinition> getMFieldDefinitions();

	/**
	 * Returns the value of the '<em><b>Anonymous Class Declarations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.AnonymousClassDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous Class Declarations</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMGravityModel_AnonymousClassDeclarations()
	 * @model
	 * @generated
	 */
	EList<AnonymousClassDeclaration> getAnonymousClassDeclarations();

	/**
	 * Returns the value of the '<em><b>MMethod Names</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.modisco.MMethodName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMethod Names</em>' containment reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMGravityModel_MMethodNames()
	 * @model containment="true"
	 * @generated
	 */
	EList<MMethodName> getMMethodNames();

	/**
	 * Returns the value of the '<em><b>MField Names</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.modisco.MFieldName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MField Names</em>' containment reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMGravityModel_MFieldNames()
	 * @model containment="true"
	 * @generated
	 */
	EList<MFieldName> getMFieldNames();

	/**
	 * Returns the value of the '<em><b>MAbstract Method Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MAbstractMethodDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MAbstract Method Definitions</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMGravityModel_MAbstractMethodDefinitions()
	 * @model
	 * @generated
	 */
	EList<MAbstractMethodDefinition> getMAbstractMethodDefinitions();

	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.TypeParameter}.
	 * <!-- begin-user-doc -->
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MExtensions</em>' containment reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMGravityModel_MExtensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<MExtension> getMExtensions();

} // MGravityModel
