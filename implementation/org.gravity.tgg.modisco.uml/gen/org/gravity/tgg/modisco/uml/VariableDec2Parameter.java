/**
 */
package org.gravity.tgg.modisco.uml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.VariableDeclaration;

import org.eclipse.uml2.uml.Parameter;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Dec2 Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.uml.VariableDec2Parameter#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.uml.VariableDec2Parameter#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.uml.UmlPackage#getVariableDec2Parameter()
 * @model
 * @generated
 */
public interface VariableDec2Parameter extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(VariableDeclaration)
	 * @see org.gravity.tgg.modisco.uml.UmlPackage#getVariableDec2Parameter_Source()
	 * @model required="true"
	 * @generated
	 */
	VariableDeclaration getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.uml.VariableDec2Parameter#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(VariableDeclaration value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Parameter)
	 * @see org.gravity.tgg.modisco.uml.UmlPackage#getVariableDec2Parameter_Target()
	 * @model required="true"
	 * @generated
	 */
	Parameter getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.uml.VariableDec2Parameter#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Parameter value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // VariableDec2Parameter
