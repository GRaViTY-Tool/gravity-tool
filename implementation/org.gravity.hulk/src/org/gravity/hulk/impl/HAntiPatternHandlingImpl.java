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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.gravity.hulk.HAntiPatternHandling;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkPackage;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HAnti
 * Pattern Handling</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.gravity.hulk.impl.HAntiPatternHandlingImpl#getHDetector
 * <em>HDetector</em>}</li>
 * <li>{@link org.gravity.hulk.impl.HAntiPatternHandlingImpl#getApg
 * <em>Apg</em>}</li>
 * <li>{@link org.gravity.hulk.impl.HAntiPatternHandlingImpl#getProgramlocation
 * <em>Programlocation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class HAntiPatternHandlingImpl extends EObjectImpl implements HAntiPatternHandling {
	/**
	 * The cached value of the '{@link #getHDetector() <em>HDetector</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getHDetector()
	 * @generated
	 * @ordered
	 */
	protected EList<HDetector> hDetector;

	/**
	 * The cached value of the '{@link #getApg() <em>Apg</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getApg()
	 * @generated
	 * @ordered
	 */
	protected HAntiPatternGraph apg;

	/**
	 * The default value of the '{@link #getProgramlocation()
	 * <em>Programlocation</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getProgramlocation()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAMLOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramlocation()
	 * <em>Programlocation</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getProgramlocation()
	 * @generated
	 * @ordered
	 */
	protected String programlocation = PROGRAMLOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HAntiPatternHandlingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HulkPackage.Literals.HANTI_PATTERN_HANDLING;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<HDetector> getHDetector() {
		if (this.hDetector == null) {
			this.hDetector = new EObjectWithInverseResolvingEList<>(HDetector.class, this,
					HulkPackage.HANTI_PATTERN_HANDLING__HDETECTOR, HulkPackage.HDETECTOR__HANTI_PATTERN_HANDLING);
		}
		return this.hDetector;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAntiPatternGraph getApg() {
		return this.apg;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetApg(HAntiPatternGraph newApg, NotificationChain msgs) {
		final HAntiPatternGraph oldApg = this.apg;
		this.apg = newApg;
		if (eNotificationRequired()) {
			final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HulkPackage.HANTI_PATTERN_HANDLING__APG, oldApg, newApg);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setApg(HAntiPatternGraph newApg) {
		if (newApg != this.apg) {
			NotificationChain msgs = null;
			if (this.apg != null) {
				msgs = ((InternalEObject) this.apg).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - HulkPackage.HANTI_PATTERN_HANDLING__APG, null, msgs);
			}
			if (newApg != null) {
				msgs = ((InternalEObject) newApg).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - HulkPackage.HANTI_PATTERN_HANDLING__APG, null, msgs);
			}
			msgs = basicSetApg(newApg, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, HulkPackage.HANTI_PATTERN_HANDLING__APG, newApg,
					newApg));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getProgramlocation() {
		return this.programlocation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setProgramlocation(String newProgramlocation) {
		final String oldProgramlocation = this.programlocation;
		this.programlocation = newProgramlocation;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, HulkPackage.HANTI_PATTERN_HANDLING__PROGRAMLOCATION,
					oldProgramlocation, this.programlocation));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		if (featureID == HulkPackage.HANTI_PATTERN_HANDLING__HDETECTOR) {
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getHDetector()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		if (featureID == HulkPackage.HANTI_PATTERN_HANDLING__HDETECTOR) {
			return ((InternalEList<?>) getHDetector()).basicRemove(otherEnd, msgs);
		} else if (featureID == HulkPackage.HANTI_PATTERN_HANDLING__APG) {
			return basicSetApg(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HulkPackage.HANTI_PATTERN_HANDLING__HDETECTOR:
			return getHDetector();
		case HulkPackage.HANTI_PATTERN_HANDLING__APG:
			return getApg();
		case HulkPackage.HANTI_PATTERN_HANDLING__PROGRAMLOCATION:
			return getProgramlocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HulkPackage.HANTI_PATTERN_HANDLING__HDETECTOR:
			getHDetector().clear();
			getHDetector().addAll((Collection<? extends HDetector>) newValue);
			return;
		case HulkPackage.HANTI_PATTERN_HANDLING__APG:
			setApg((HAntiPatternGraph) newValue);
			return;
		case HulkPackage.HANTI_PATTERN_HANDLING__PROGRAMLOCATION:
			setProgramlocation((String) newValue);
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
		case HulkPackage.HANTI_PATTERN_HANDLING__HDETECTOR:
			getHDetector().clear();
			return;
		case HulkPackage.HANTI_PATTERN_HANDLING__APG:
			setApg((HAntiPatternGraph) null);
			return;
		case HulkPackage.HANTI_PATTERN_HANDLING__PROGRAMLOCATION:
			setProgramlocation(PROGRAMLOCATION_EDEFAULT);
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
		case HulkPackage.HANTI_PATTERN_HANDLING__HDETECTOR:
			return this.hDetector != null && !this.hDetector.isEmpty();
		case HulkPackage.HANTI_PATTERN_HANDLING__APG:
			return this.apg != null;
		case HulkPackage.HANTI_PATTERN_HANDLING__PROGRAMLOCATION:
			return PROGRAMLOCATION_EDEFAULT == null ? this.programlocation != null
			: !PROGRAMLOCATION_EDEFAULT.equals(this.programlocation);
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
		case HulkPackage.HANTI_PATTERN_HANDLING___GET_DEPENDENCY_GRAPH:
			return getDependencyGraph();
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

		return new StringBuffer(super.toString()).append(" (programlocation: ").append(this.programlocation).append(')')
				.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HAntiPatternHandlingImpl
