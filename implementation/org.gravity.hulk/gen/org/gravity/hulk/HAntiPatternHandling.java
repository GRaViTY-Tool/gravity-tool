/**
 */
package org.gravity.hulk;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.moflon.core.dfs.DFSGraph;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HAnti Pattern Handling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.HAntiPatternHandling#getHDetector <em>HDetector</em>}</li>
 *   <li>{@link org.gravity.hulk.HAntiPatternHandling#getApg <em>Apg</em>}</li>
 *   <li>{@link org.gravity.hulk.HAntiPatternHandling#getProgramlocation <em>Programlocation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.HulkPackage#getHAntiPatternHandling()
 * @model
 * @generated
 */
public interface HAntiPatternHandling extends EObject {
	/**
	 * Returns the value of the '<em><b>HDetector</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.hulk.HDetector}.
	 * It is bidirectional and its opposite is '{@link org.gravity.hulk.HDetector#getHAntiPatternHandling <em>HAnti Pattern Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HDetector</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HDetector</em>' reference list.
	 * @see org.gravity.hulk.HulkPackage#getHAntiPatternHandling_HDetector()
	 * @see org.gravity.hulk.HDetector#getHAntiPatternHandling
	 * @model opposite="hAntiPatternHandling"
	 * @generated
	 */
	EList<HDetector> getHDetector();

	/**
	 * Returns the value of the '<em><b>Apg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apg</em>' containment reference.
	 * @see #setApg(HAntiPatternGraph)
	 * @see org.gravity.hulk.HulkPackage#getHAntiPatternHandling_Apg()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HAntiPatternGraph getApg();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.HAntiPatternHandling#getApg <em>Apg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apg</em>' containment reference.
	 * @see #getApg()
	 * @generated
	 */
	void setApg(HAntiPatternGraph value);

	/**
	 * Returns the value of the '<em><b>Programlocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Programlocation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programlocation</em>' attribute.
	 * @see #setProgramlocation(String)
	 * @see org.gravity.hulk.HulkPackage#getHAntiPatternHandling_Programlocation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getProgramlocation();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.HAntiPatternHandling#getProgramlocation <em>Programlocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programlocation</em>' attribute.
	 * @see #getProgramlocation()
	 * @generated
	 */
	void setProgramlocation(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean execute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	DFSGraph getDependencyGraph();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HAntiPatternHandling
