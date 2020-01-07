/**
 */
package org.gravity.hulk.detection;

import org.gravity.hulk.HDetector;

import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HRelative Detector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.detection.HRelativeDetector#isRelative <em>Relative</em>}</li>
 *   <li>{@link org.gravity.hulk.detection.HRelativeDetector#getThreshold <em>Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.detection.DetectionPackage#getHRelativeDetector()
 * @model abstract="true"
 * @generated
 */
public interface HRelativeDetector extends HDetector {
	/**
	 * Returns the value of the '<em><b>Relative</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative</em>' attribute.
	 * @see #setRelative(boolean)
	 * @see org.gravity.hulk.detection.DetectionPackage#getHRelativeDetector_Relative()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isRelative();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.detection.HRelativeDetector#isRelative <em>Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative</em>' attribute.
	 * @see #isRelative()
	 * @generated
	 */
	void setRelative(boolean value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(double)
	 * @see org.gravity.hulk.detection.DetectionPackage#getHRelativeDetector_Threshold()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getThreshold();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.detection.HRelativeDetector#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double calculateRelativeThreshold(HRelativeValueConstants level);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HRelativeDetector
