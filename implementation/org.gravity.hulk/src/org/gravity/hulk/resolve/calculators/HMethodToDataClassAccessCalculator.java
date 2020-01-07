/**
 */
package org.gravity.hulk.resolve.calculators;

import org.eclipse.emf.common.util.EList;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.detection.HMetricCalculator;
import org.gravity.hulk.resolve.HResolver;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HMethod To Data Class Access Calculator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.hulk.resolve.calculators.CalculatorsPackage#getHMethodToDataClassAccessCalculator()
 * @model
 * @generated
 */
public interface HMethodToDataClassAccessCalculator extends HMetricCalculator, HResolver {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	@Override
	boolean detect(HAntiPatternGraph apg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<TMember> getAllAffectedMembers(TClass tClass);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HMethodToDataClassAccessCalculator
