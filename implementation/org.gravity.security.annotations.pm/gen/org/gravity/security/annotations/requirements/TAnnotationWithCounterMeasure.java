/**
 */
package org.gravity.security.annotations.requirements;

import org.gravity.typegraph.basic.TMethodDefinition;

import org.gravity.typegraph.basic.annotations.TAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAnnotation With Counter Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.security.annotations.requirements.TAnnotationWithCounterMeasure#getCountermeasure <em>Countermeasure</em>}</li>
 * </ul>
 *
 * @see org.gravity.security.annotations.requirements.RequirementsPackage#getTAnnotationWithCounterMeasure()
 * @model
 * @generated
 */
public interface TAnnotationWithCounterMeasure extends TAnnotation {
	/**
	 * Returns the value of the '<em><b>Countermeasure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Countermeasure</em>' reference.
	 * @see #setCountermeasure(TMethodDefinition)
	 * @see org.gravity.security.annotations.requirements.RequirementsPackage#getTAnnotationWithCounterMeasure_Countermeasure()
	 * @model
	 * @generated
	 */
	TMethodDefinition getCountermeasure();

	/**
	 * Sets the value of the '{@link org.gravity.security.annotations.requirements.TAnnotationWithCounterMeasure#getCountermeasure <em>Countermeasure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Countermeasure</em>' reference.
	 * @see #getCountermeasure()
	 * @generated
	 */
	void setCountermeasure(TMethodDefinition value);

} // TAnnotationWithCounterMeasure
