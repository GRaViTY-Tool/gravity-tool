/**
 */
package org.gravity.hulk.refactoringgraph.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.hulk.antipatterngraph.impl.HMetricImpl;

import org.gravity.hulk.antipatterngraph.values.HRelativeValue;

import org.gravity.hulk.refactoringgraph.HCluster;
import org.gravity.hulk.refactoringgraph.HInBlobClusterAccess;
import org.gravity.hulk.refactoringgraph.RefactoringgraphPackage;
// <-- [user defined imports]
import java.util.SortedSet;
import java.util.TreeSet;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.values.ValuesFactory;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.eclipse.swt.widgets.TreeItem;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HIn Blob Cluster Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.refactoringgraph.impl.HInBlobClusterAccessImpl#getHCluster <em>HCluster</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HInBlobClusterAccessImpl extends HMetricImpl implements HInBlobClusterAccess {
	/**
	 * The cached value of the '{@link #getHCluster() <em>HCluster</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHCluster()
	 * @generated
	 * @ordered
	 */
	protected HCluster hCluster;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HInBlobClusterAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringgraphPackage.Literals.HIN_BLOB_CLUSTER_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HCluster getHCluster() {
		if (hCluster != null && hCluster.eIsProxy()) {
			InternalEObject oldHCluster = (InternalEObject) hCluster;
			hCluster = (HCluster) eResolveProxy(oldHCluster);
			if (hCluster != oldHCluster) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RefactoringgraphPackage.HIN_BLOB_CLUSTER_ACCESS__HCLUSTER, oldHCluster, hCluster));
			}
		}
		return hCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HCluster basicGetHCluster() {
		return hCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHCluster(HCluster newHCluster) {
		HCluster oldHCluster = hCluster;
		hCluster = newHCluster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RefactoringgraphPackage.HIN_BLOB_CLUSTER_ACCESS__HCLUSTER, oldHCluster, hCluster));
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
		case RefactoringgraphPackage.HIN_BLOB_CLUSTER_ACCESS__HCLUSTER:
			if (resolve)
				return getHCluster();
			return basicGetHCluster();
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
		case RefactoringgraphPackage.HIN_BLOB_CLUSTER_ACCESS__HCLUSTER:
			setHCluster((HCluster) newValue);
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
		case RefactoringgraphPackage.HIN_BLOB_CLUSTER_ACCESS__HCLUSTER:
			setHCluster((HCluster) null);
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
		case RefactoringgraphPackage.HIN_BLOB_CLUSTER_ACCESS__HCLUSTER:
			return hCluster != null;
		}
		return super.eIsSet(featureID);
	}

	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		String string = "There ";
		switch (getRelativeAmount().getValue()) {
		case HIGH:
			string += "are many";
			break;
		case LOW:
			string += "are few";
			break;
		case MEDIUM:
			string += "is an average amount of";
			break;
		case VERY_HIGH:
			string += "are very many";
			break;
		case VERY_LOW:
			string += "are very many";
			break;
		default:
			break;

		}
		string += " accesses to other member clusters of this class.";
		item.setText(string);
		new TreeItem(item, style).setText("value =" + value);
		return item;
	}

	// [user code injected with eMoflon] -->
} //HInBlobClusterAccessImpl
