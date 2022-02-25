/**
 */
package org.gravity.tgg.pm.uml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Property;

import org.gravity.typegraph.basic.annotations.TAbstractNode;

import org.moflon.tgg.runtime.AbstractCorrespondence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype Property2 Annotation Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.tgg.pm.uml.StereotypeProperty2AnnotationNode#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.pm.uml.StereotypeProperty2AnnotationNode#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.gravity.tgg.pm.uml.UmlPackage#getStereotypeProperty2AnnotationNode()
 * @model
 * @generated
 */
public interface StereotypeProperty2AnnotationNode extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Property)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getStereotypeProperty2AnnotationNode_Source()
	 * @model required="true"
	 * @generated
	 */
	Property getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.StereotypeProperty2AnnotationNode#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Property value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TAbstractNode)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getStereotypeProperty2AnnotationNode_Target()
	 * @model required="true"
	 * @generated
	 */
	TAbstractNode getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.StereotypeProperty2AnnotationNode#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TAbstractNode value);

} // StereotypeProperty2AnnotationNode
