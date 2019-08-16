/**
 */
package org.gravity.hulk.antipatterngraph.impl;

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

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.typegraph.basic.TypeGraph;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HAnti Pattern Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.impl.HAntiPatternGraphImpl#getPg <em>Pg</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.impl.HAntiPatternGraphImpl#getHAnnotations <em>HAnnotations</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.impl.HAntiPatternGraphImpl#getCurrentID <em>Current ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HAntiPatternGraphImpl extends EObjectImpl implements HAntiPatternGraph {
	/**
	 * The cached value of the '{@link #getPg() <em>Pg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPg()
	 * @generated
	 * @ordered
	 */
	protected TypeGraph pg;

	/**
	 * The cached value of the '{@link #getHAnnotations() <em>HAnnotations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<HAnnotation> hAnnotations;

	/**
	 * The default value of the '{@link #getCurrentID() <em>Current ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentID()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentID() <em>Current ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentID()
	 * @generated
	 * @ordered
	 */
	protected int currentID = CURRENT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HAntiPatternGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntipatterngraphPackage.Literals.HANTI_PATTERN_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeGraph getPg() {
		if (pg != null && pg.eIsProxy()) {
			InternalEObject oldPg = (InternalEObject) pg;
			pg = (TypeGraph) eResolveProxy(oldPg);
			if (pg != oldPg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AntipatterngraphPackage.HANTI_PATTERN_GRAPH__PG, oldPg, pg));
			}
		}
		return pg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraph basicGetPg() {
		return pg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPg(TypeGraph newPg) {
		TypeGraph oldPg = pg;
		pg = newPg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntipatterngraphPackage.HANTI_PATTERN_GRAPH__PG,
					oldPg, pg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HAnnotation> getHAnnotations() {
		if (hAnnotations == null) {
			hAnnotations = new EObjectWithInverseResolvingEList<HAnnotation>(HAnnotation.class, this,
					AntipatterngraphPackage.HANTI_PATTERN_GRAPH__HANNOTATIONS,
					AntipatterngraphPackage.HANNOTATION__APG);
		}
		return hAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCurrentID() {
		return currentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentID(int newCurrentID) {
		int oldCurrentID = currentID;
		currentID = newCurrentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AntipatterngraphPackage.HANTI_PATTERN_GRAPH__CURRENT_ID, oldCurrentID, currentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getNextID() {
		// [user code injected with eMoflon]
		return currentID++;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AntipatterngraphPackage.HANTI_PATTERN_GRAPH__HANNOTATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getHAnnotations()).basicAdd(otherEnd, msgs);
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
		case AntipatterngraphPackage.HANTI_PATTERN_GRAPH__HANNOTATIONS:
			return ((InternalEList<?>) getHAnnotations()).basicRemove(otherEnd, msgs);
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
		case AntipatterngraphPackage.HANTI_PATTERN_GRAPH__PG:
			if (resolve)
				return getPg();
			return basicGetPg();
		case AntipatterngraphPackage.HANTI_PATTERN_GRAPH__HANNOTATIONS:
			return getHAnnotations();
		case AntipatterngraphPackage.HANTI_PATTERN_GRAPH__CURRENT_ID:
			return getCurrentID();
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
		case AntipatterngraphPackage.HANTI_PATTERN_GRAPH__PG:
			setPg((TypeGraph) newValue);
			return;
		case AntipatterngraphPackage.HANTI_PATTERN_GRAPH__HANNOTATIONS:
			getHAnnotations().clear();
			getHAnnotations().addAll((Collection<? extends HAnnotation>) newValue);
			return;
		case AntipatterngraphPackage.HANTI_PATTERN_GRAPH__CURRENT_ID:
			setCurrentID((Integer) newValue);
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
		case AntipatterngraphPackage.HANTI_PATTERN_GRAPH__PG:
			setPg((TypeGraph) null);
			return;
		case AntipatterngraphPackage.HANTI_PATTERN_GRAPH__HANNOTATIONS:
			getHAnnotations().clear();
			return;
		case AntipatterngraphPackage.HANTI_PATTERN_GRAPH__CURRENT_ID:
			setCurrentID(CURRENT_ID_EDEFAULT);
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
		case AntipatterngraphPackage.HANTI_PATTERN_GRAPH__PG:
			return pg != null;
		case AntipatterngraphPackage.HANTI_PATTERN_GRAPH__HANNOTATIONS:
			return hAnnotations != null && !hAnnotations.isEmpty();
		case AntipatterngraphPackage.HANTI_PATTERN_GRAPH__CURRENT_ID:
			return currentID != CURRENT_ID_EDEFAULT;
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
		case AntipatterngraphPackage.HANTI_PATTERN_GRAPH___GET_NEXT_ID:
			return getNextID();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (currentID: ");
		result.append(currentID);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //HAntiPatternGraphImpl
