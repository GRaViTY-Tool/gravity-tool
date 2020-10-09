/**
 */
package org.gravity.tgg.modisco;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.InterfaceDeclaration;

import org.gravity.typegraph.basic.TInterface;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Declaration To TInterface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.InterfaceDeclarationToTInterface#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.InterfaceDeclarationToTInterface#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.ModiscoPackage#getInterfaceDeclarationToTInterface()
 * @model
 * @generated
 */
public interface InterfaceDeclarationToTInterface extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(InterfaceDeclaration)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getInterfaceDeclarationToTInterface_Source()
	 * @model required="true"
	 * @generated
	 */
	InterfaceDeclaration getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.InterfaceDeclarationToTInterface#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(InterfaceDeclaration value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TInterface)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getInterfaceDeclarationToTInterface_Target()
	 * @model required="true"
	 * @generated
	 */
	TInterface getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.InterfaceDeclarationToTInterface#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TInterface value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // InterfaceDeclarationToTInterface
