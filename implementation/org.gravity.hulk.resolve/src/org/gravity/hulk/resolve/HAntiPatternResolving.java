/**
 */
package org.gravity.hulk.resolve;

import org.gravity.hulk.HAntiPatternDetection;
import org.moflon.core.dfs.DFSGraph;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HAnti Pattern Resolving</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.hulk.HulkPackage#getHAntiPatternResolving()
 * @model
 * @generated
 */
public interface HAntiPatternResolving extends HAntiPatternDetection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createResolveCalculatorDependency(DFSGraph graph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	DFSGraph getDependencyGraph();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createResolveAntiPatternDependency(DFSGraph graph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	DFSGraph getSuperDependencyGraph();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HAntiPatternResolving