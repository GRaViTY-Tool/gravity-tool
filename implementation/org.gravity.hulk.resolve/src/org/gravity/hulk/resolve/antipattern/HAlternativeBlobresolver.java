/**
 */
package org.gravity.hulk.resolve.antipattern;

import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation;
import org.gravity.hulk.refactoringgraph.HInBlobClusterAccess;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HAlternative Blobresolver</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.hulk.resolve.antipattern.AntipatternPackage#getHAlternativeBlobresolver()
 * @model
 * @generated
 */
public interface HAlternativeBlobresolver extends HBlobResolver {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean detect(HAntiPatternGraph apg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean process(HInBlobClusterAccess hCluster, TClass tClass, HBlobResolveAnnotation hParent);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HAlternativeBlobresolver