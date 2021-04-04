/**
 */
package org.gravity.hulk.antipatterngraph.codesmells.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage;
import org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell;

import org.gravity.hulk.antipatterngraph.impl.HCodeSmellImpl;
// <-- [user defined imports]
import java.util.List;
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TParameterList;
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HGetter
 * Setter Smell</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HGetterSetterSmellImpl#getTFieldDefinition <em>TField Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HGetterSetterSmellImpl extends HCodeSmellImpl implements HGetterSetterSmell {
	/**
	 * The cached value of the '{@link #getTFieldDefinition() <em>TField Definition</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTFieldDefinition()
	 * @generated
	 * @ordered
	 */
	protected TFieldDefinition tFieldDefinition;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected HGetterSetterSmellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HGETTER_SETTER_SMELL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFieldDefinition getTFieldDefinition() {
		if (tFieldDefinition != null && tFieldDefinition.eIsProxy()) {
			InternalEObject oldTFieldDefinition = (InternalEObject) tFieldDefinition;
			tFieldDefinition = (TFieldDefinition) eResolveProxy(oldTFieldDefinition);
			if (tFieldDefinition != oldTFieldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodesmellsPackage.HGETTER_SETTER_SMELL__TFIELD_DEFINITION, oldTFieldDefinition,
							tFieldDefinition));
			}
		}
		return tFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldDefinition basicGetTFieldDefinition() {
		return tFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTFieldDefinition(TFieldDefinition newTFieldDefinition) {
		TFieldDefinition oldTFieldDefinition = tFieldDefinition;
		tFieldDefinition = newTFieldDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodesmellsPackage.HGETTER_SETTER_SMELL__TFIELD_DEFINITION, oldTFieldDefinition, tFieldDefinition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodesmellsPackage.HGETTER_SETTER_SMELL__TFIELD_DEFINITION:
			if (resolve)
				return getTFieldDefinition();
			return basicGetTFieldDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CodesmellsPackage.HGETTER_SETTER_SMELL__TFIELD_DEFINITION:
			setTFieldDefinition((TFieldDefinition) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CodesmellsPackage.HGETTER_SETTER_SMELL__TFIELD_DEFINITION:
			setTFieldDefinition((TFieldDefinition) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CodesmellsPackage.HGETTER_SETTER_SMELL__TFIELD_DEFINITION:
			return tFieldDefinition != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText(((TMethodDefinition) getTAnnotated()).getSignatureString());
		return item;
	}

	// [user code injected with eMoflon] -->
} // HGetterSetterSmellImpl
