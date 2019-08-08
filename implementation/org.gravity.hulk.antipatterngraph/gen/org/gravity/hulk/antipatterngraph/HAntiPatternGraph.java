/**
 */
package org.gravity.hulk.antipatterngraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.gravity.typegraph.basic.TypeGraph;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HAnti Pattern Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.HAntiPatternGraph#getPg <em>Pg</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.HAntiPatternGraph#getHAnnotations <em>HAnnotations</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.HAntiPatternGraph#getCurrentID <em>Current ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.antipatterngraph.AntipatterngraphPackage#getHAntiPatternGraph()
 * @model
 * @generated
 */
public interface HAntiPatternGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Pg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pg</em>' containment reference.
	 * @see #setPg(TypeGraph)
	 * @see org.gravity.hulk.antipatterngraph.AntipatterngraphPackage#getHAntiPatternGraph_Pg()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeGraph getPg();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.HAntiPatternGraph#getPg <em>Pg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pg</em>' containment reference.
	 * @see #getPg()
	 * @generated
	 */
	void setPg(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>HAnnotations</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.hulk.antipatterngraph.HAnnotation}.
	 * It is bidirectional and its opposite is '{@link org.gravity.hulk.antipatterngraph.HAnnotation#getApg <em>Apg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HAnnotations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HAnnotations</em>' reference list.
	 * @see org.gravity.hulk.antipatterngraph.AntipatterngraphPackage#getHAntiPatternGraph_HAnnotations()
	 * @see org.gravity.hulk.antipatterngraph.HAnnotation#getApg
	 * @model opposite="apg"
	 * @generated
	 */
	EList<HAnnotation> getHAnnotations();

	/**
	 * Returns the value of the '<em><b>Current ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current ID</em>' attribute.
	 * @see #setCurrentID(int)
	 * @see org.gravity.hulk.antipatterngraph.AntipatterngraphPackage#getHAntiPatternGraph_CurrentID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCurrentID();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.HAntiPatternGraph#getCurrentID <em>Current ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current ID</em>' attribute.
	 * @see #getCurrentID()
	 * @generated
	 */
	void setCurrentID(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getNextID();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HAntiPatternGraph
