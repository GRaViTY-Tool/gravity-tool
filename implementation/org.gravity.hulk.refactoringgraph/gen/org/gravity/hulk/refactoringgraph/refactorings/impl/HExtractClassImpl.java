/**
 */
package org.gravity.hulk.refactoringgraph.refactorings.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gravity.hulk.refactoringgraph.refactorings.HExtractClass;
import org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage;

import org.gravity.typegraph.basic.TMember;
// <-- [user defined imports]
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.hulk.refactoringgraph.HInBlobAccess;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HExtract Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.refactoringgraph.refactorings.impl.HExtractClassImpl#getTMembers <em>TMembers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HExtractClassImpl extends HRefactoringImpl implements HExtractClass {
	/**
	 * The cached value of the '{@link #getTMembers() <em>TMembers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<TMember> tMembers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HExtractClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringsPackage.Literals.HEXTRACT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TMember> getTMembers() {
		if (tMembers == null) {
			tMembers = new EObjectResolvingEList<TMember>(TMember.class, this,
					RefactoringsPackage.HEXTRACT_CLASS__TMEMBERS);
		}
		return tMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getAvgIba() {
		// [user code injected with eMoflon]

		double sum = 0.0;
		int count = 0;
		for (TMember m : getTMembers()) {
			for (TAnnotation a : m.getTAnnotation()) {
				if (a instanceof HInBlobAccess) {
					sum += ((HInBlobAccess) a).getValue();
					count++;
				}
			}
		}
		return sum / count;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RefactoringsPackage.HEXTRACT_CLASS__TMEMBERS:
			return getTMembers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RefactoringsPackage.HEXTRACT_CLASS__TMEMBERS:
			getTMembers().clear();
			getTMembers().addAll((Collection<? extends TMember>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RefactoringsPackage.HEXTRACT_CLASS__TMEMBERS:
			getTMembers().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RefactoringsPackage.HEXTRACT_CLASS__TMEMBERS:
			return tMembers != null && !tMembers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RefactoringsPackage.HEXTRACT_CLASS___GET_AVG_IBA:
			return getAvgIba();
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText("Extract " + getTMembers().size() + " members to a new class.");
		for (TMember tMember : getTMembers()) {
			new TreeItem(item, style).setText(tMember.getSignatureString());
		}
		return item;
	}

	public int compare(HExtractClass hExtractClass) {
		return (int) (1000 * (getAvgIba() - hExtractClass.getAvgIba()));
	}

	// [user code injected with eMoflon] -->
} //HExtractClassImpl
