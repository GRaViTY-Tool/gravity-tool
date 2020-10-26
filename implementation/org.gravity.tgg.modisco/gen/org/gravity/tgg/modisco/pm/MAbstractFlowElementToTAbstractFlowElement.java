/**
 */
package org.gravity.tgg.modisco.pm;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MAbstractFlowElement;

import org.gravity.typegraph.basic.TAbstractFlowElement;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MAbstract Flow Element To TAbstract Flow Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.pm.PmPackage#getMAbstractFlowElementToTAbstractFlowElement()
 * @model
 * @generated
 */
public interface MAbstractFlowElementToTAbstractFlowElement extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MAbstractFlowElement)
	 * @see org.gravity.tgg.modisco.pm.PmPackage#getMAbstractFlowElementToTAbstractFlowElement_Source()
	 * @model required="true"
	 * @generated
	 */
	MAbstractFlowElement getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MAbstractFlowElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TAbstractFlowElement)
	 * @see org.gravity.tgg.modisco.pm.PmPackage#getMAbstractFlowElementToTAbstractFlowElement_Target()
	 * @model required="true"
	 * @generated
	 */
	TAbstractFlowElement getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TAbstractFlowElement value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MAbstractFlowElementToTAbstractFlowElement
