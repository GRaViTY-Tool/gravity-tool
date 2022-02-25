/**
 */
package org.gravity.tgg.pm.uml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Model;

import org.gravity.typegraph.basic.TypeGraph;

import org.moflon.tgg.runtime.AbstractCorrespondence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model2 Type Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.tgg.pm.uml.Model2TypeGraph#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.pm.uml.Model2TypeGraph#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.gravity.tgg.pm.uml.UmlPackage#getModel2TypeGraph()
 * @model
 * @generated
 */
public interface Model2TypeGraph extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Model)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getModel2TypeGraph_Source()
	 * @model required="true"
	 * @generated
	 */
	Model getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.Model2TypeGraph#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Model value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TypeGraph)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getModel2TypeGraph_Target()
	 * @model required="true"
	 * @generated
	 */
	TypeGraph getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.Model2TypeGraph#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TypeGraph value);

} // Model2TypeGraph
