/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMethod Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TMethodEntity#getTMethodDefinition <em>TMethod Definition</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTMethodEntity()
 * @model
 * @generated
 */
public interface TMethodEntity extends EObject, TMemberEntity {
	/**
	 * Returns the value of the '<em><b>TMethod Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TMethodDefinition#getTMethodEntity <em>TMethod Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TMethod Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TMethod Definition</em>' reference.
	 * @see #setTMethodDefinition(TMethodDefinition)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMethodEntity_TMethodDefinition()
	 * @see org.gravity.typegraph.basic.TMethodDefinition#getTMethodEntity
	 * @model opposite="tMethodEntity" required="true"
	 * @generated
	 */
	TMethodDefinition getTMethodDefinition();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TMethodEntity#getTMethodDefinition <em>TMethod Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TMethod Definition</em>' reference.
	 * @see #getTMethodDefinition()
	 * @generated
	 */
	void setTMethodDefinition(TMethodDefinition value);

} // TMethodEntity
