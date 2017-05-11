/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAnnotatable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TAnnotatable#getTAnnotation <em>TAnnotation</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTAnnotatable()
 * @model abstract="true"
 * @generated
 */
public interface TAnnotatable extends EObject {
	/**
	 * Returns the value of the '<em><b>TAnnotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TAnnotation}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TAnnotation#getTAnnotated <em>TAnnotated</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TAnnotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TAnnotation</em>' containment reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTAnnotatable_TAnnotation()
	 * @see org.gravity.typegraph.basic.TAnnotation#getTAnnotated
	 * @model opposite="tAnnotated" containment="true"
	 * @generated
	 */
	EList<TAnnotation> getTAnnotation();

} // TAnnotatable
