/**
 */
package org.gravity.hulk;

import org.moflon.core.dfs.DFSGraph;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HAnti Pattern Detection</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.hulk.HulkPackage#getHAntiPatternDetection()
 * @model
 * @generated
 */
public interface HAntiPatternDetection extends HAntiPatternHandling {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createAntiPatternDependencies(DFSGraph graph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createCodeSmellDependencies(DFSGraph graph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createMetricDependencies(DFSGraph graph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	DFSGraph getDependencyGraph();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HAntiPatternDetection
