/**
 */
package org.gravity.hulk.refactoringgraph.impl;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.impl.HMetricImpl;

import org.gravity.hulk.refactoringgraph.HInBlobAccess;
import org.gravity.hulk.refactoringgraph.RefactoringgraphPackage;
// <-- [user defined imports]
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMember;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HIn Blob Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HInBlobAccessImpl extends HMetricImpl implements HInBlobAccess {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HInBlobAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringgraphPackage.Literals.HIN_BLOB_ACCESS;
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		TMember methodDef = ((TMember) getTAnnotated());
		String methodName = methodDef.getSignatureString();

		TAbstractType definingClass = methodDef.getDefinedBy();
		String definingClassName = "DefaultClassName";
		if (definingClass != null) {
			definingClassName = definingClass.getFullyQualifiedName();
		}

		item.setText("InBlobAccess(" + definingClassName + "->" + methodName + ")=" + getValue());
		return item;
	}

	// [user code injected with eMoflon] -->
} //HInBlobAccessImpl
