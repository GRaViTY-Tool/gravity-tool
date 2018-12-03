/**
 */
package org.gravity.typegraph.basic.containers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.gravity.typegraph.basic.TMethodDefinition;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMethod Definition Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.containers.TMethodDefinitionContainer#getTMethodDefinitions <em>TMethod Definitions</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.containers.ContainersPackage#getTMethodDefinitionContainer()
 * @model
 * @generated
 */
public interface TMethodDefinitionContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>TMethod Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TMethodDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TMethod Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TMethod Definitions</em>' reference list.
	 * @see org.gravity.typegraph.basic.containers.ContainersPackage#getTMethodDefinitionContainer_TMethodDefinitions()
	 * @model
	 * @generated
	 */
	EList<TMethodDefinition> getTMethodDefinitions();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TMethodDefinitionContainer
