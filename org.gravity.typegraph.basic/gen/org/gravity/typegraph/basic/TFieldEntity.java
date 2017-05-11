/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TField Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TFieldEntity#getTFieldDefinition <em>TField Definition</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTFieldEntity()
 * @model
 * @generated
 */
public interface TFieldEntity extends EObject, TMemberEntity {
	/**
	 * Returns the value of the '<em><b>TField Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TFieldDefinition#getTFieldEntity <em>TField Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TField Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TField Definition</em>' reference.
	 * @see #setTFieldDefinition(TFieldDefinition)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTFieldEntity_TFieldDefinition()
	 * @see org.gravity.typegraph.basic.TFieldDefinition#getTFieldEntity
	 * @model opposite="tFieldEntity" required="true"
	 * @generated
	 */
	TFieldDefinition getTFieldDefinition();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TFieldEntity#getTFieldDefinition <em>TField Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TField Definition</em>' reference.
	 * @see #getTFieldDefinition()
	 * @generated
	 */
	void setTFieldDefinition(TFieldDefinition value);

} // TFieldEntity
