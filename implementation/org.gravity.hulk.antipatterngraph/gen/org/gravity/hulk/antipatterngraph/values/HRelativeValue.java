/**
 */
package org.gravity.hulk.antipatterngraph.values;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HRelative Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.values.HRelativeValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.antipatterngraph.values.ValuesPackage#getHRelativeValue()
 * @model
 * @generated
 */
public interface HRelativeValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants
	 * @see #setValue(HRelativeValueConstants)
	 * @see org.gravity.hulk.antipatterngraph.values.ValuesPackage#getHRelativeValue_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	HRelativeValueConstants getValue();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.values.HRelativeValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants
	 * @see #getValue()
	 * @generated
	 */
	void setValue(HRelativeValueConstants value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HRelativeValue
