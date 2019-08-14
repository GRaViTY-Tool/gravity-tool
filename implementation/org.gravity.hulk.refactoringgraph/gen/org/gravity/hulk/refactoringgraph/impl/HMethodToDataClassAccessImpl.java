/**
 */
package org.gravity.hulk.refactoringgraph.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell;

import org.gravity.hulk.antipatterngraph.impl.HMetricImpl;

import org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess;
import org.gravity.hulk.refactoringgraph.RefactoringgraphPackage;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
// <-- [user defined imports]
import java.util.SortedSet;
import java.util.TreeSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.values.HRelativeValue;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.antipatterngraph.values.ValuesFactory;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HMethod To Data Class Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.refactoringgraph.impl.HMethodToDataClassAccessImpl#getHDataClassSmell <em>HData Class Smell</em>}</li>
 *   <li>{@link org.gravity.hulk.refactoringgraph.impl.HMethodToDataClassAccessImpl#getHDataClass <em>HData Class</em>}</li>
 *   <li>{@link org.gravity.hulk.refactoringgraph.impl.HMethodToDataClassAccessImpl#getTMethodDefinition <em>TMethod Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HMethodToDataClassAccessImpl extends HMetricImpl implements HMethodToDataClassAccess {
	/**
	 * The cached value of the '{@link #getHDataClassSmell() <em>HData Class Smell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHDataClassSmell()
	 * @generated
	 * @ordered
	 */
	protected HDataClassSmell hDataClassSmell;

	/**
	 * The cached value of the '{@link #getHDataClass() <em>HData Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHDataClass()
	 * @generated
	 * @ordered
	 */
	protected TClass hDataClass;

	/**
	 * The cached value of the '{@link #getTMethodDefinition() <em>TMethod Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTMethodDefinition()
	 * @generated
	 * @ordered
	 */
	protected TMember tMethodDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMethodToDataClassAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringgraphPackage.Literals.HMETHOD_TO_DATA_CLASS_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HDataClassSmell getHDataClassSmell() {
		if (hDataClassSmell != null && hDataClassSmell.eIsProxy()) {
			InternalEObject oldHDataClassSmell = (InternalEObject) hDataClassSmell;
			hDataClassSmell = (HDataClassSmell) eResolveProxy(oldHDataClassSmell);
			if (hDataClassSmell != oldHDataClassSmell) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RefactoringgraphPackage.HMETHOD_TO_DATA_CLASS_ACCESS__HDATA_CLASS_SMELL, oldHDataClassSmell,
							hDataClassSmell));
			}
		}
		return hDataClassSmell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDataClassSmell basicGetHDataClassSmell() {
		return hDataClassSmell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHDataClassSmell(HDataClassSmell newHDataClassSmell) {
		HDataClassSmell oldHDataClassSmell = hDataClassSmell;
		hDataClassSmell = newHDataClassSmell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RefactoringgraphPackage.HMETHOD_TO_DATA_CLASS_ACCESS__HDATA_CLASS_SMELL, oldHDataClassSmell,
					hDataClassSmell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TClass getHDataClass() {
		if (hDataClass != null && hDataClass.eIsProxy()) {
			InternalEObject oldHDataClass = (InternalEObject) hDataClass;
			hDataClass = (TClass) eResolveProxy(oldHDataClass);
			if (hDataClass != oldHDataClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RefactoringgraphPackage.HMETHOD_TO_DATA_CLASS_ACCESS__HDATA_CLASS, oldHDataClass,
							hDataClass));
			}
		}
		return hDataClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetHDataClass() {
		return hDataClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHDataClass(TClass newHDataClass) {
		TClass oldHDataClass = hDataClass;
		hDataClass = newHDataClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RefactoringgraphPackage.HMETHOD_TO_DATA_CLASS_ACCESS__HDATA_CLASS, oldHDataClass, hDataClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMember getTMethodDefinition() {
		if (tMethodDefinition != null && tMethodDefinition.eIsProxy()) {
			InternalEObject oldTMethodDefinition = (InternalEObject) tMethodDefinition;
			tMethodDefinition = (TMember) eResolveProxy(oldTMethodDefinition);
			if (tMethodDefinition != oldTMethodDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RefactoringgraphPackage.HMETHOD_TO_DATA_CLASS_ACCESS__TMETHOD_DEFINITION,
							oldTMethodDefinition, tMethodDefinition));
			}
		}
		return tMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMember basicGetTMethodDefinition() {
		return tMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTMethodDefinition(TMember newTMethodDefinition) {
		TMember oldTMethodDefinition = tMethodDefinition;
		tMethodDefinition = newTMethodDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RefactoringgraphPackage.HMETHOD_TO_DATA_CLASS_ACCESS__TMETHOD_DEFINITION, oldTMethodDefinition,
					tMethodDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public HRelativeValue getRelativeAmount() {
		// [user code injected with eMoflon]
		EList<TAnnotation> annotations = getTAnnotated().getTAnnotation();

		SortedSet<Double> keys = new TreeSet<>();

		for (TAnnotation a : annotations) {
			if (this.getClass().equals(a.getClass())) {
				double key = ((HMetric) a).getValue();
				keys.add(key);
			}
		}

		double index = keys.headSet(this.getValue()).size();

		if (index == -1) {
			throw new RuntimeException();
		}

		HRelativeValue value = ValuesFactory.eINSTANCE.createHRelativeValue();

		double q = (index + 1) / keys.size();

		if (q < 0.2) {
			value.setValue(HRelativeValueConstants.VERY_LOW);
		} else if (q < 0.4) {
			value.setValue(HRelativeValueConstants.LOW);
		} else if (q < 0.6) {
			value.setValue(HRelativeValueConstants.MEDIUM);
		} else if (q < 0.8) {
			value.setValue(HRelativeValueConstants.HIGH);
		} else {
			value.setValue(HRelativeValueConstants.VERY_HIGH);
		}

		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RefactoringgraphPackage.HMETHOD_TO_DATA_CLASS_ACCESS__HDATA_CLASS_SMELL:
			if (resolve)
				return getHDataClassSmell();
			return basicGetHDataClassSmell();
		case RefactoringgraphPackage.HMETHOD_TO_DATA_CLASS_ACCESS__HDATA_CLASS:
			if (resolve)
				return getHDataClass();
			return basicGetHDataClass();
		case RefactoringgraphPackage.HMETHOD_TO_DATA_CLASS_ACCESS__TMETHOD_DEFINITION:
			if (resolve)
				return getTMethodDefinition();
			return basicGetTMethodDefinition();
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
		case RefactoringgraphPackage.HMETHOD_TO_DATA_CLASS_ACCESS__HDATA_CLASS_SMELL:
			setHDataClassSmell((HDataClassSmell) newValue);
			return;
		case RefactoringgraphPackage.HMETHOD_TO_DATA_CLASS_ACCESS__HDATA_CLASS:
			setHDataClass((TClass) newValue);
			return;
		case RefactoringgraphPackage.HMETHOD_TO_DATA_CLASS_ACCESS__TMETHOD_DEFINITION:
			setTMethodDefinition((TMember) newValue);
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
		case RefactoringgraphPackage.HMETHOD_TO_DATA_CLASS_ACCESS__HDATA_CLASS_SMELL:
			setHDataClassSmell((HDataClassSmell) null);
			return;
		case RefactoringgraphPackage.HMETHOD_TO_DATA_CLASS_ACCESS__HDATA_CLASS:
			setHDataClass((TClass) null);
			return;
		case RefactoringgraphPackage.HMETHOD_TO_DATA_CLASS_ACCESS__TMETHOD_DEFINITION:
			setTMethodDefinition((TMember) null);
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
		case RefactoringgraphPackage.HMETHOD_TO_DATA_CLASS_ACCESS__HDATA_CLASS_SMELL:
			return hDataClassSmell != null;
		case RefactoringgraphPackage.HMETHOD_TO_DATA_CLASS_ACCESS__HDATA_CLASS:
			return hDataClass != null;
		case RefactoringgraphPackage.HMETHOD_TO_DATA_CLASS_ACCESS__TMETHOD_DEFINITION:
			return tMethodDefinition != null;
		}
		return super.eIsSet(featureID);
	}

	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		TMember tMember = (TMember) getTAnnotated();
		TAbstractType definingClass = tMember.getDefinedBy();
		item.setText("MemberToDataClassAccess(" + definingClass.getFullyQualifiedName() + "."
				+ tMember.getSignatureString() + ")=" + getValue());
		return item;
	}

	// [user code injected with eMoflon] -->
} //HMethodToDataClassAccessImpl
