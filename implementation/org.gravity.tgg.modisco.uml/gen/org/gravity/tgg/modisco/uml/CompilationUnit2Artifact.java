/**
 */
package org.gravity.tgg.modisco.uml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.CompilationUnit;

import org.eclipse.uml2.uml.Artifact;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit2 Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.uml.CompilationUnit2Artifact#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.uml.CompilationUnit2Artifact#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.uml.UmlPackage#getCompilationUnit2Artifact()
 * @model
 * @generated
 */
public interface CompilationUnit2Artifact extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(CompilationUnit)
	 * @see org.gravity.tgg.modisco.uml.UmlPackage#getCompilationUnit2Artifact_Source()
	 * @model required="true"
	 * @generated
	 */
	CompilationUnit getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.uml.CompilationUnit2Artifact#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(CompilationUnit value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Artifact)
	 * @see org.gravity.tgg.modisco.uml.UmlPackage#getCompilationUnit2Artifact_Target()
	 * @model required="true"
	 * @generated
	 */
	Artifact getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.uml.CompilationUnit2Artifact#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Artifact value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // CompilationUnit2Artifact
