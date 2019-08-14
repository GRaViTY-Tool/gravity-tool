/**
 */
package org.gravity.hulk.antipatterngraph.codesmells.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage;
import org.gravity.hulk.antipatterngraph.codesmells.HControllerClassSmell;
import org.gravity.hulk.antipatterngraph.impl.HCodeSmellImpl;
import org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation;
import org.gravity.typegraph.basic.TClass;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HController Class Smell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HControllerClassSmellImpl#getHInvocationRelation <em>HInvocation Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HControllerClassSmellImpl extends HCodeSmellImpl implements HControllerClassSmell {
	/**
	 * The cached value of the '{@link #getHInvocationRelation() <em>HInvocation Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHInvocationRelation()
	 * @generated
	 * @ordered
	 */
	protected HInvocationRelation hInvocationRelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HControllerClassSmellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HCONTROLLER_CLASS_SMELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HInvocationRelation getHInvocationRelation() {
		if (hInvocationRelation != null && hInvocationRelation.eIsProxy()) {
			InternalEObject oldHInvocationRelation = (InternalEObject) hInvocationRelation;
			hInvocationRelation = (HInvocationRelation) eResolveProxy(oldHInvocationRelation);
			if (hInvocationRelation != oldHInvocationRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodesmellsPackage.HCONTROLLER_CLASS_SMELL__HINVOCATION_RELATION, oldHInvocationRelation,
							hInvocationRelation));
			}
		}
		return hInvocationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HInvocationRelation basicGetHInvocationRelation() {
		return hInvocationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHInvocationRelation(HInvocationRelation newHInvocationRelation) {
		HInvocationRelation oldHInvocationRelation = hInvocationRelation;
		hInvocationRelation = newHInvocationRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodesmellsPackage.HCONTROLLER_CLASS_SMELL__HINVOCATION_RELATION, oldHInvocationRelation,
					hInvocationRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodesmellsPackage.HCONTROLLER_CLASS_SMELL__HINVOCATION_RELATION:
			if (resolve)
				return getHInvocationRelation();
			return basicGetHInvocationRelation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CodesmellsPackage.HCONTROLLER_CLASS_SMELL__HINVOCATION_RELATION:
			setHInvocationRelation((HInvocationRelation) newValue);
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
		case CodesmellsPackage.HCONTROLLER_CLASS_SMELL__HINVOCATION_RELATION:
			setHInvocationRelation((HInvocationRelation) null);
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
		case CodesmellsPackage.HCONTROLLER_CLASS_SMELL__HINVOCATION_RELATION:
			return hInvocationRelation != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText(((TClass) getTAnnotated()).getTName());
		getHInvocationRelation().createItemContents(item, style);
		return item;
	}

	// [user code injected with eMoflon] -->
} //HControllerClassSmellImpl
