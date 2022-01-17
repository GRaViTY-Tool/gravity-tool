/**
 */
package org.gravity.hulk.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
// <-- [user defined imports]
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gravity.hulk.HAntiPatternHandling;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkPackage;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.detection.HulkDetector;
// [user defined imports] -->
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.moflon.core.dfs.impl.NodeImpl;

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

	private static final Logger LOGGER = Logger.getLogger(HDetector.class);

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
	@Override
	public EList<HAnnotation> getHAnnotation() {
		if (this.hAnnotation == null) {
			this.hAnnotation = new EObjectResolvingEList<>(HAnnotation.class, this,
					HulkPackage.HDETECTOR__HANNOTATION);
		}
		return this.hAnnotation;
	}

	@Override
	public final boolean hasAlreadyBeenAnnotated(final TClass tClass) {
		for (final TAnnotation tmpExisting : tClass.getTAnnotation()) {
			if (tmpExisting instanceof HAnnotation) {
				final var existing = (HAnnotation) tmpExisting;
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
	@Override
	public HAntiPatternHandling getHAntiPatternHandling() {
		if ((this.hAntiPatternHandling != null) && this.hAntiPatternHandling.eIsProxy()) {
			final var oldHAntiPatternHandling = (InternalEObject) this.hAntiPatternHandling;
			this.hAntiPatternHandling = (HAntiPatternHandling) eResolveProxy(oldHAntiPatternHandling);
			if ((this.hAntiPatternHandling != oldHAntiPatternHandling) && eNotificationRequired()) {
				eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						HulkPackage.HDETECTOR__HANTI_PATTERN_HANDLING, oldHAntiPatternHandling,
						this.hAntiPatternHandling));
			}
		}
		return this.hAntiPatternHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAntiPatternHandling basicGetHAntiPatternHandling() {
		return this.hAntiPatternHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHAntiPatternHandling(final HAntiPatternHandling newHAntiPatternHandling,
			NotificationChain msgs) {
		final var oldHAntiPatternHandling = this.hAntiPatternHandling;
		this.hAntiPatternHandling = newHAntiPatternHandling;
		if (eNotificationRequired()) {
			final var notification = new ENotificationImpl(this, Notification.SET,
					HulkPackage.HDETECTOR__HANTI_PATTERN_HANDLING, oldHAntiPatternHandling, newHAntiPatternHandling);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHAntiPatternHandling(final HAntiPatternHandling newHAntiPatternHandling) {
		if (newHAntiPatternHandling != this.hAntiPatternHandling) {
			NotificationChain msgs = null;
			if (this.hAntiPatternHandling != null) {
				msgs = ((InternalEObject) this.hAntiPatternHandling).eInverseRemove(this,
						HulkPackage.HANTI_PATTERN_HANDLING__HDETECTOR, HAntiPatternHandling.class, msgs);
			}
			if (newHAntiPatternHandling != null) {
				msgs = ((InternalEObject) newHAntiPatternHandling).eInverseAdd(this,
						HulkPackage.HANTI_PATTERN_HANDLING__HDETECTOR, HAntiPatternHandling.class, msgs);
			}
			msgs = basicSetHAntiPatternHandling(newHAntiPatternHandling, msgs);
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, HulkPackage.HDETECTOR__HANTI_PATTERN_HANDLING,
					newHAntiPatternHandling, newHAntiPatternHandling));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HulkPackage.HDETECTOR__HANTI_PATTERN_HANDLING:
			if (this.hAntiPatternHandling != null) {
				msgs = ((InternalEObject) this.hAntiPatternHandling).eInverseRemove(this,
						HulkPackage.HANTI_PATTERN_HANDLING__HDETECTOR, HAntiPatternHandling.class, msgs);
			}
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
	public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
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
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case HulkPackage.HDETECTOR__HANNOTATION:
			return getHAnnotation();
		case HulkPackage.HDETECTOR__HANTI_PATTERN_HANDLING:
			if (resolve) {
				return getHAntiPatternHandling();
			}
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
	public void eSet(final int featureID, final Object newValue) {
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
	public void eUnset(final int featureID) {
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
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
		case HulkPackage.HDETECTOR__HANNOTATION:
			return (this.hAnnotation != null) && !this.hAnnotation.isEmpty();
		case HulkPackage.HDETECTOR__HANTI_PATTERN_HANDLING:
			return this.hAntiPatternHandling != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case HulkPackage.HDETECTOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	protected double calculateRelativeThreshold(final HRelativeValueConstants level, final Class<? extends HMetric> clazz) {
		final var annotations = getHAntiPatternHandling().getApg().getHAnnotations();

		final List<Double> keys = new LinkedList<>();
		for (final HAnnotation a : annotations) {
			if (clazz.isAssignableFrom(a.getClass())) {
				final var key = ((HMetric) a).getValue();
				keys.add(key);
			}
		}
		final var size = keys.size();
		if (keys.isEmpty()) {
			final var value = HulkDetector.getDefaultThresholds().get(clazz.getName());
			if((value == null) || value.isBlank()) {
				LOGGER.error("No default value for: "+clazz.getName());
				return Double.NaN;
			}
			return Double.valueOf(value);
		}

		Collections.sort(keys);

		switch (level) {
		case VERY_LOW:
			return keys.get((size * 1) / 6);
		case LOW:
			return keys.get((size * 2) / 6);
		case MEDIUM:
			return keys.get((size * 3) / 6);
		case HIGH:
			return keys.get((size * 4) / 6);
		case VERY_HIGH:
			return keys.get((size * 5) / 6);
		}
		throw new RuntimeException();
	}


	public void removeAnnotations(final TAnnotatable annotated) {
		final var annotations = annotated.getTAnnotation();
		final List<TAnnotation> delete = new LinkedList<>();
		for(var i = annotations.size() -1; i >= 0; i--) {
			if( getHAnnotationType().isInstance(annotations.get(i))) {
				delete.add(annotations.remove(i));
			}
		}
		EcoreUtil.deleteAll(delete, true);
	}

	// [user code injected with eMoflon] -->
} //HDetectorImpl
