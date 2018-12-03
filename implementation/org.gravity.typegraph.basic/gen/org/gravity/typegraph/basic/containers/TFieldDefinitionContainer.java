/**
 */
package org.gravity.typegraph.basic.containers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.gravity.typegraph.basic.TFieldDefinition;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TField Definition Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.containers.TFieldDefinitionContainer#getTFieldDefinitions <em>TField Definitions</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.containers.ContainersPackage#getTFieldDefinitionContainer()
 * @model
 * @generated
 */
public interface TFieldDefinitionContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>TField Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TFieldDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TField Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TField Definitions</em>' reference list.
	 * @see org.gravity.typegraph.basic.containers.ContainersPackage#getTFieldDefinitionContainer_TFieldDefinitions()
	 * @model
	 * @generated
	 */
	EList<TFieldDefinition> getTFieldDefinitions();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TFieldDefinitionContainer
