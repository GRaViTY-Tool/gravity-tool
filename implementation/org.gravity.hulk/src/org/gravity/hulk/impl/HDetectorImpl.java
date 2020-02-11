/**
 */
package org.gravity.hulk.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gravity.hulk.HAntiPatternHandling;
import org.gravity.hulk.HulkPackage;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.moflon.core.dfs.impl.NodeImpl;
// <-- [user defined imports]
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.detection.HulkDetector;
// [user defined imports] -->
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.TAnnotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HDetector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.hulk.impl.HDetectorImpl#getHAnnotation <em>HAnnotation</em>}</li>
 *   <li>{@link org.gravity.hulk.impl.HDetectorImpl#getHAntiPatternHandling <em>HAnti Pattern Handling</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class HDetectorImpl extends NodeImpl implements HDetector {
	/**
	 * The cached value of the '{@link #getHAnnotation() <em>HAnnotation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<HAnnotation> hAnnotation;

	/**
	 * The cached value of the '{@link #getHAntiPatternHandling() <em>HAnti Pattern Handling</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHAntiPatternHandling()
	 * @generated
	 * @ordered
	 */
	protected HAntiPatternHandling hAntiPatternHandling;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HulkPackage.Literals.HDETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HAnnotation> getHAnnotation() {
		if (hAnnotation == null) {
			hAnnotation = new EObjectResolvingEList<HAnnotation>(HAnnotation.class, this,
					HulkPackage.HDETECTOR__HANNOTATION);
		}
		return hAnnotation;
	}

	public final boolean hasAlreadyBeenAnnotated(TClass tClass) {
		for (TAnnotation tmpExisting : tClass.getTAnnotation()) {
			if (tmpExisting instanceof HAnnotation) {
				HAnnotation existing = (HAnnotation) tmpExisting;
				if (getHAnnotation().contains(existing)) {
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAntiPatternHandling getHAntiPatternHandling() {
		if (hAntiPatternHandling != null && hAntiPatternHandling.eIsProxy()) {
			InternalEObject oldHAntiPatternHandling = (InternalEObject) hAntiPatternHandling;
			hAntiPatternHandling = (HAntiPatternHandling) eResolveProxy(oldHAntiPatternHandling);
			if (hAntiPatternHandling != oldHAntiPatternHandling) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							HulkPackage.HDETECTOR__HANTI_PATTERN_HANDLING, oldHAntiPatternHandling,
							hAntiPatternHandling));
			}
		}
		return hAntiPatternHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAntiPatternHandling basicGetHAntiPatternHandling() {
		return hAntiPatternHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHAntiPatternHandling(HAntiPatternHandling newHAntiPatternHandling,
			NotificationChain msgs) {
		HAntiPatternHandling oldHAntiPatternHandling = hAntiPatternHandling;
		hAntiPatternHandling = newHAntiPatternHandling;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HulkPackage.HDETECTOR__HANTI_PATTERN_HANDLING, oldHAntiPatternHandling, newHAntiPatternHandling);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHAntiPatternHandling(HAntiPatternHandling newHAntiPatternHandling) {
		if (newHAntiPatternHandling != hAntiPatternHandling) {
			NotificationChain msgs = null;
			if (hAntiPatternHandling != null)
				msgs = ((InternalEObject) hAntiPatternHandling).eInverseRemove(this,
						HulkPackage.HANTI_PATTERN_HANDLING__HDETECTOR, HAntiPatternHandling.class, msgs);
			if (newHAntiPatternHandling != null)
				msgs = ((InternalEObject) newHAntiPatternHandling).eInverseAdd(this,
						HulkPackage.HANTI_PATTERN_HANDLING__HDETECTOR, HAntiPatternHandling.class, msgs);
			msgs = basicSetHAntiPatternHandling(newHAntiPatternHandling, msgs);
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HulkPackage.HDETECTOR__HANTI_PATTERN_HANDLING,
					newHAntiPatternHandling, newHAntiPatternHandling));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HulkPackage.HDETECTOR__HANTI_PATTERN_HANDLING:
			if (hAntiPatternHandling != null)
				msgs = ((InternalEObject) hAntiPatternHandling).eInverseRemove(this,
						HulkPackage.HANTI_PATTERN_HANDLING__HDETECTOR, HAntiPatternHandling.class, msgs);
			return basicSetHAntiPatternHandling((HAntiPatternHandling) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HulkPackage.HDETECTOR__HANTI_PATTERN_HANDLING:
			return basicSetHAntiPatternHandling(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HulkPackage.HDETECTOR__HANNOTATION:
			return getHAnnotation();
		case HulkPackage.HDETECTOR__HANTI_PATTERN_HANDLING:
			if (resolve)
				return getHAntiPatternHandling();
			return basicGetHAntiPatternHandling();
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
		case HulkPackage.HDETECTOR__HANNOTATION:
			getHAnnotation().clear();
			getHAnnotation().addAll((Collection<? extends HAnnotation>) newValue);
			return;
		case HulkPackage.HDETECTOR__HANTI_PATTERN_HANDLING:
			setHAntiPatternHandling((HAntiPatternHandling) newValue);
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
		case HulkPackage.HDETECTOR__HANNOTATION:
			getHAnnotation().clear();
			return;
		case HulkPackage.HDETECTOR__HANTI_PATTERN_HANDLING:
			setHAntiPatternHandling((HAntiPatternHandling) null);
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
		case HulkPackage.HDETECTOR__HANNOTATION:
			return hAnnotation != null && !hAnnotation.isEmpty();
		case HulkPackage.HDETECTOR__HANTI_PATTERN_HANDLING:
			return hAntiPatternHandling != null;
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
		case HulkPackage.HDETECTOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	protected double calculateRelativeThreshold(HRelativeValueConstants level, Class<? extends HMetric> clazz) {
		EList<HAnnotation> annotations = getHAntiPatternHandling().getApg().getHAnnotations();

		List<Double> keys = new LinkedList<>();
		for (HAnnotation a : annotations) {
			if (clazz.isAssignableFrom(a.getClass())) {
				double key = ((HMetric) a).getValue();
				keys.add(key);
			}
		}
		int size = keys.size();
		if (keys.isEmpty()) {
			return Double.valueOf(HulkDetector.getDefaultThresholds().get(clazz.getName()));
		}

		Collections.sort(keys);

		switch (level) {
		case VERY_LOW:
			return keys.get(size * 1 / 6);
		case LOW:
			return keys.get(size * 2 / 6);
		case MEDIUM:
			return keys.get(size * 3 / 6);
		case HIGH:
			return keys.get(size * 4 / 6);
		case VERY_HIGH:
			return keys.get(size * 5 / 6);
		}
		throw new RuntimeException();
	}

	// [user code injected with eMoflon] -->
} //HDetectorImpl
