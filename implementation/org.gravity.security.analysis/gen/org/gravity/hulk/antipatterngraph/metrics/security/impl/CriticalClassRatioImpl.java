/**
 */
package org.gravity.hulk.antipatterngraph.metrics.security.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.hulk.antipatterngraph.impl.HMetricImpl;
import org.gravity.hulk.antipatterngraph.metrics.security.CriticalClassRatio;
import org.gravity.hulk.antipatterngraph.metrics.security.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Critical Class Ratio</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CriticalClassRatioImpl extends HMetricImpl implements CriticalClassRatio {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriticalClassRatioImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.CRITICAL_CLASS_RATIO;
	}

	@Override
	public TreeItem createItemContents(final TreeItem item, final int style) {
		item.setText("Prortion of Critical Classes =" + getValue());
		return item;
	}

} //CriticalClassRatioImpl
