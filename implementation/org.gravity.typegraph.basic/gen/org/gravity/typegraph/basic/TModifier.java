/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TModifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TModifier#getTVisibility <em>TVisibility</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TModifier#isIsStatic <em>Is Static</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTModifier()
 * @model
 * @generated
 */
public interface TModifier extends EObject {
	/**
	 * Returns the value of the '<em><b>TVisibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gravity.typegraph.basic.TVisibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TVisibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TVisibility</em>' attribute.
	 * @see org.gravity.typegraph.basic.TVisibility
	 * @see #setTVisibility(TVisibility)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTModifier_TVisibility()
	 * @model
	 * @generated
	 */
	TVisibility getTVisibility();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TModifier#getTVisibility <em>TVisibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TVisibility</em>' attribute.
	 * @see org.gravity.typegraph.basic.TVisibility
	 * @see #getTVisibility()
	 * @generated
	 */
	void setTVisibility(TVisibility value);

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTModifier_IsStatic()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TModifier#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TModifier
