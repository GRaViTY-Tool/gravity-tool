/**
 */
package org.gravity.hulk.antipatterngraph.impl;

import java.lang.reflect.InvocationTargetException;
// <-- [user defined imports]
import java.util.SortedSet;
import java.util.TreeSet;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.values.HRelativeValue;
import org.gravity.hulk.antipatterngraph.values.HRelativeValue;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.antipatterngraph.values.ValuesFactory;
import org.gravity.hulk.help.HSort;
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>HMetric</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.gravity.hulk.antipatterngraph.impl.HMetricImpl#getValue
 * <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HMetricImpl extends HAnnotationImpl implements HMetric {
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected HMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntipatterngraphPackage.Literals.HMETRIC;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntipatterngraphPackage.HMETRIC__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public HRelativeValue getRelativeAmount() {
		// [user code injected with eMoflon]
		EList<HAnnotation> annotations = getApg().getHAnnotations();

		SortedSet<Double> keys = new TreeSet<>();

		for (HAnnotation a : annotations) {
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
	 * 
	 * @generated NOT
	 */
	@Override
	public double increment() {
		// [user code injected with eMoflon]

		return this.value++;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AntipatterngraphPackage.HMETRIC__VALUE:
			return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AntipatterngraphPackage.HMETRIC__VALUE:
			setValue((Double) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AntipatterngraphPackage.HMETRIC__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AntipatterngraphPackage.HMETRIC__VALUE:
			return value != VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT:
			return getRelativeAmount();
		case AntipatterngraphPackage.HMETRIC___INCREMENT:
			return increment();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HMetricImpl
