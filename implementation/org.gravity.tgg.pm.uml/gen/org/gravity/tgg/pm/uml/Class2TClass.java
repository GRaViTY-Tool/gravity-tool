/**
 */
package org.gravity.tgg.pm.uml;

import org.eclipse.emf.ecore.EObject;

import org.gravity.typegraph.basic.TClass;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class2 TClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.pm.uml.Class2TClass#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.pm.uml.Class2TClass#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.pm.uml.UmlPackage#getClass2TClass()
 * @model
 * @generated
 */
public interface Class2TClass extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(org.eclipse.uml2.uml.Class)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getClass2TClass_Source()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.Class2TClass#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TClass)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getClass2TClass_Target()
	 * @model required="true"
	 * @generated
	 */
	TClass getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.Class2TClass#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TClass value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Class2TClass
