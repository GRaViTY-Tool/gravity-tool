/**
 */
package org.gravity.tgg.pm.uml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Dependency;

import org.gravity.typegraph.basic.TAccess;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FDependency2 TAccess</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.pm.uml.FDependency2TAccess#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.pm.uml.FDependency2TAccess#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.pm.uml.UmlPackage#getFDependency2TAccess()
 * @model
 * @generated
 */
public interface FDependency2TAccess extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Dependency)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getFDependency2TAccess_Source()
	 * @model required="true"
	 * @generated
	 */
	Dependency getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.FDependency2TAccess#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Dependency value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TAccess)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getFDependency2TAccess_Target()
	 * @model required="true"
	 * @generated
	 */
	TAccess getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.FDependency2TAccess#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TAccess value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // FDependency2TAccess
