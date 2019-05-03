/**
 */
package org.gravity.hulk.resolve.impl;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.resolve.HAntiPatternResolver;
import org.gravity.hulk.resolve.ResolvePackage;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HAnti Pattern Resolver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class HAntiPatternResolverImpl extends HResolverImpl implements HAntiPatternResolver {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HAntiPatternResolverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResolvePackage.Literals.HANTI_PATTERN_RESOLVER;
	}
	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Resolve Anti-patterns";
	}

	// [user code injected with eMoflon] -->
} //HAntiPatternResolverImpl
