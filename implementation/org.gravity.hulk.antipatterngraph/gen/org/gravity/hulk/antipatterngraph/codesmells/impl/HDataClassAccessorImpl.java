/**
 */
package org.gravity.hulk.antipatterngraph.codesmells.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
// <-- [user defined imports]
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassAccessor;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell;
import org.gravity.hulk.antipatterngraph.impl.HCodeSmellImpl;
import org.gravity.hulk.antipatterngraph.values.HRelativeValue;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.antipatterngraph.values.ValuesFactory;
import org.gravity.typegraph.basic.TClass;
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HData
 * Class Accessor</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HDataClassAccessorImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HDataClassAccessorImpl#getHDataClassSmells <em>HData Class Smells</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HDataClassAccessorImpl extends HCodeSmellImpl implements HDataClassAccessor {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHDataClassSmells() <em>HData Class Smells</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHDataClassSmells()
	 * @generated
	 * @ordered
	 */
	protected EList<HDataClassSmell> hDataClassSmells;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected HDataClassAccessorImpl() {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HDATA_CLASS_ACCESSOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getValue() {
		return this.value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(final double newValue) {
		final double oldValue = this.value;
		this.value = newValue;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CodesmellsPackage.HDATA_CLASS_ACCESSOR__VALUE,
					oldValue, this.value));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HDataClassSmell> getHDataClassSmells() {
		if (this.hDataClassSmells == null) {
			this.hDataClassSmells = new EObjectResolvingEList<>(HDataClassSmell.class, this,
					CodesmellsPackage.HDATA_CLASS_ACCESSOR__HDATA_CLASS_SMELLS);
		}
		return this.hDataClassSmells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public HRelativeValue getRelativeAmount() {
		// [user code injected with eMoflon]

		final EList<HAnnotation> annotations = getApg().getHAnnotations();

		final SortedSet<Double> keys = new TreeSet<>();

		for (final HAnnotation a : annotations) {
			if (this.getClass().equals(a.getClass())) {
				final double key = ((HMetric) a).getValue();
				keys.add(key);
			}
		}

		final double index = keys.headSet(this.getValue()).size();

		if (index == -1) {
			throw new RuntimeException();
		}

		final HRelativeValue value = ValuesFactory.eINSTANCE.createHRelativeValue();

		final double q = (index + 1) / keys.size();

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
	 * @generated NOT
	 */
	@Override
	public double increment() {
		// [user code injected with eMoflon]

		return this.value++;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case CodesmellsPackage.HDATA_CLASS_ACCESSOR__VALUE:
			return getValue();
		case CodesmellsPackage.HDATA_CLASS_ACCESSOR__HDATA_CLASS_SMELLS:
			return getHDataClassSmells();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case CodesmellsPackage.HDATA_CLASS_ACCESSOR__VALUE:
			setValue((Double) newValue);
			return;
		case CodesmellsPackage.HDATA_CLASS_ACCESSOR__HDATA_CLASS_SMELLS:
			getHDataClassSmells().clear();
			getHDataClassSmells().addAll((Collection<? extends HDataClassSmell>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(final int featureID) {
		switch (featureID) {
		case CodesmellsPackage.HDATA_CLASS_ACCESSOR__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case CodesmellsPackage.HDATA_CLASS_ACCESSOR__HDATA_CLASS_SMELLS:
			getHDataClassSmells().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
		case CodesmellsPackage.HDATA_CLASS_ACCESSOR__VALUE:
			return this.value != VALUE_EDEFAULT;
		case CodesmellsPackage.HDATA_CLASS_ACCESSOR__HDATA_CLASS_SMELLS:
			return (this.hDataClassSmells != null) && !this.hDataClassSmells.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
		if (baseClass == HMetric.class) {
			switch (derivedFeatureID) {
			case CodesmellsPackage.HDATA_CLASS_ACCESSOR__VALUE:
				return AntipatterngraphPackage.HMETRIC__VALUE;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
		if (baseClass == HMetric.class) {
			switch (baseFeatureID) {
			case AntipatterngraphPackage.HMETRIC__VALUE:
				return CodesmellsPackage.HDATA_CLASS_ACCESSOR__VALUE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(final int baseOperationID, final Class<?> baseClass) {
		if (baseClass == HMetric.class) {
			switch (baseOperationID) {
			case AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT:
				return CodesmellsPackage.HDATA_CLASS_ACCESSOR___GET_RELATIVE_AMOUNT;
			case AntipatterngraphPackage.HMETRIC___INCREMENT:
				return CodesmellsPackage.HDATA_CLASS_ACCESSOR___INCREMENT;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CodesmellsPackage.HDATA_CLASS_ACCESSOR___GET_RELATIVE_AMOUNT:
			return getRelativeAmount();
		case CodesmellsPackage.HDATA_CLASS_ACCESSOR___INCREMENT:
			return increment();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		final StringBuilder result = new StringBuilder(super.toString());
		result.append(" (value: ");
		result.append(this.value);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(final TreeItem item, final int style) {
		item.setText("NumberOfAccessedDataClass(" + ((TClass) getTAnnotated()).getTName() + ")=" + getValue());
		for (final HDataClassSmell data : getHDataClassSmells()) {
			final TreeItem item_data = new TreeItem(item, style);
			data.getTreeItem(item_data, style);
		}
		return item;
	}

	// [user code injected with eMoflon] -->
} // HDataClassAccessorImpl
