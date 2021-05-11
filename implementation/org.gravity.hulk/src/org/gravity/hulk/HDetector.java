/**
 */
package org.gravity.hulk;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.typegraph.basic.TClass;
import org.moflon.core.dfs.Node;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HDetector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.HDetector#getHAnnotation <em>HAnnotation</em>}</li>
 *   <li>{@link org.gravity.hulk.HDetector#getHAntiPatternHandling <em>HAnti Pattern Handling</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.HulkPackage#getHDetector()
 * @model abstract="true"
 * @generated
 */
public interface HDetector extends EObject, Node {
	/**
	 * Returns the value of the '<em><b>HAnnotation</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.hulk.antipatterngraph.HAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HAnnotation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HAnnotation</em>' reference list.
	 * @see org.gravity.hulk.HulkPackage#getHDetector_HAnnotation()
	 * @model
	 * @generated
	 */
	EList<HAnnotation> getHAnnotation();

	EClass getHAnnotationType();

	/**
	 * Returns the value of the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.hulk.HAntiPatternHandling#getHDetector <em>HDetector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HAnti Pattern Handling</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HAnti Pattern Handling</em>' reference.
	 * @see #setHAntiPatternHandling(HAntiPatternHandling)
	 * @see org.gravity.hulk.HulkPackage#getHDetector_HAntiPatternHandling()
	 * @see org.gravity.hulk.HAntiPatternHandling#getHDetector
	 * @model opposite="hDetector" required="true"
	 * @generated
	 */
	HAntiPatternHandling getHAntiPatternHandling();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.HDetector#getHAntiPatternHandling <em>HAnti Pattern Handling</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HAnti Pattern Handling</em>' reference.
	 * @see #getHAntiPatternHandling()
	 * @generated
	 */
	void setHAntiPatternHandling(HAntiPatternHandling value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean detect(HAntiPatternGraph apg);
	// <-- [user code injected with eMoflon]

	String getGuiName();

	boolean hasAlreadyBeenAnnotated(TClass tClass);

	// [user code injected with eMoflon] -->
} // HDetector
