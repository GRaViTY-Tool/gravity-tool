/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;
import org.gravity.hulk.detection.HCodeSmellDetector;
import org.gravity.hulk.detection.HRelativeDetector;
import org.gravity.hulk.detection.codesmells.CodesmellsPackage;
import org.gravity.hulk.detection.codesmells.HLowCohesionDetector;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.hulk.detection.impl.HRelativeDetectorImpl;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HLow
 * Cohesion Detector</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.gravity.hulk.detection.codesmells.impl.HLowCohesionDetectorImpl#isRelative
 * <em>Relative</em>}</li>
 * <li>{@link org.gravity.hulk.detection.codesmells.impl.HLowCohesionDetectorImpl#getThreshold
 * <em>Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HLowCohesionDetectorImpl extends HClassBasedCalculatorImpl implements HLowCohesionDetector {
	/**
	 * The default value of the '{@link #isRelative() <em>Relative</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isRelative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELATIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRelative() <em>Relative</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isRelative()
	 * @generated
	 * @ordered
	 */
	protected boolean relative = RELATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreshold() <em>Threshold</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double THRESHOLD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected double threshold = THRESHOLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HLowCohesionDetectorImpl() {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HLOW_COHESION_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isRelative() {
		return this.relative;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setRelative(final boolean newRelative) {
		final var oldRelative = this.relative;
		this.relative = newRelative;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CodesmellsPackage.HLOW_COHESION_DETECTOR__RELATIVE,
					oldRelative, this.relative));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public double getThreshold() {
		return this.threshold;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setThreshold(final double newThreshold) {
		final var oldThreshold = this.threshold;
		this.threshold = newThreshold;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CodesmellsPackage.HLOW_COHESION_DETECTOR__THRESHOLD,
					oldThreshold, this.threshold));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAnnotation calculate(final TClass tClass) {//
		removeAnnotations(tClass);

		if (tClass.isTLib()) {
			return null;
		}
		for (final TAnnotation tmpLcom : tClass.getTAnnotation()) {
			if (tmpLcom instanceof HLCOM5Metric) {
				final var lcom = (HLCOM5Metric) tmpLcom;

				setRelative(true);
				setThreshold(calculateRelativeThreshold(HRelativeValueConstants.HIGH));
				//
				if (HRelativeDetectorImpl.thresholdReached(lcom, this.threshold)) {
					//
					final var smell = CodesmellsFactory.eINSTANCE.createHLowCohesionSmell();
					smell.setTAnnotated(tClass);
					smell.setHLCOM5CustomMetric(lcom);
					lcom.getPartOf().add(smell);
					getHAnnotation().add(smell);
					return smell;
				}
				return null;
			}
		}
		return null;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public double calculateRelativeThreshold(final HRelativeValueConstants level) {
		// [user code injected with eMoflon]

		return calculateRelativeThreshold(level, HLCOM5Metric.class);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case CodesmellsPackage.HLOW_COHESION_DETECTOR__RELATIVE:
			return isRelative();
		case CodesmellsPackage.HLOW_COHESION_DETECTOR__THRESHOLD:
			return getThreshold();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case CodesmellsPackage.HLOW_COHESION_DETECTOR__RELATIVE:
			setRelative((Boolean) newValue);
			return;
		case CodesmellsPackage.HLOW_COHESION_DETECTOR__THRESHOLD:
			setThreshold((Double) newValue);
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
	public void eUnset(final int featureID) {
		switch (featureID) {
		case CodesmellsPackage.HLOW_COHESION_DETECTOR__RELATIVE:
			setRelative(RELATIVE_EDEFAULT);
			return;
		case CodesmellsPackage.HLOW_COHESION_DETECTOR__THRESHOLD:
			setThreshold(THRESHOLD_EDEFAULT);
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
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
		case CodesmellsPackage.HLOW_COHESION_DETECTOR__RELATIVE:
			return this.relative != RELATIVE_EDEFAULT;
		case CodesmellsPackage.HLOW_COHESION_DETECTOR__THRESHOLD:
			return this.threshold != THRESHOLD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
		if (baseClass == HCodeSmellDetector.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == HRelativeDetector.class) {
			switch (derivedFeatureID) {
			case CodesmellsPackage.HLOW_COHESION_DETECTOR__RELATIVE:
				return DetectionPackage.HRELATIVE_DETECTOR__RELATIVE;
			case CodesmellsPackage.HLOW_COHESION_DETECTOR__THRESHOLD:
				return DetectionPackage.HRELATIVE_DETECTOR__THRESHOLD;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
		if (baseClass == HCodeSmellDetector.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == HRelativeDetector.class) {
			switch (baseFeatureID) {
			case DetectionPackage.HRELATIVE_DETECTOR__RELATIVE:
				return CodesmellsPackage.HLOW_COHESION_DETECTOR__RELATIVE;
			case DetectionPackage.HRELATIVE_DETECTOR__THRESHOLD:
				return CodesmellsPackage.HLOW_COHESION_DETECTOR__THRESHOLD;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(final int baseOperationID, final Class<?> baseClass) {
		if (baseClass == HClassBasedCalculator.class) {
			switch (baseOperationID) {
			case DetectionPackage.HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS:
				return CodesmellsPackage.HLOW_COHESION_DETECTOR___CALCULATE__TCLASS;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == HCodeSmellDetector.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == HRelativeDetector.class) {
			switch (baseOperationID) {
			case DetectionPackage.HRELATIVE_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS:
				return CodesmellsPackage.HLOW_COHESION_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CodesmellsPackage.HLOW_COHESION_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case CodesmellsPackage.HLOW_COHESION_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS:
			return calculateRelativeThreshold((HRelativeValueConstants) arguments.get(0));
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
		if (eIsProxy()) {
			return super.toString();
		}

		final var result = new StringBuffer(super.toString());
		result.append(" (relative: ");
		result.append(this.relative);
		result.append(", threshold: ");
		result.append(this.threshold);
		result.append(')');
		return result.toString();
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Low Cohesion Smell";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage.eINSTANCE.getHLowCohesionSmell();
	}

	// [user code injected with eMoflon] -->
} // HLowCohesionDetectorImpl
