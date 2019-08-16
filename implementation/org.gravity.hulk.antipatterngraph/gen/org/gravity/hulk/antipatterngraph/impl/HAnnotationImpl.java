/**
 */
package org.gravity.hulk.antipatterngraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.typegraph.basic.annotations.impl.TAnnotationImpl;
// <-- [user defined imports]
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HAnnotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.impl.HAnnotationImpl#getApg <em>Apg</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.impl.HAnnotationImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.impl.HAnnotationImpl#isChanged <em>Changed</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HAnnotationImpl extends TAnnotationImpl implements HAnnotation {
	/**
	 * The cached value of the '{@link #getApg() <em>Apg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApg()
	 * @generated
	 * @ordered
	 */
	protected HAntiPatternGraph apg;

	/**
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected EList<HAnnotation> partOf;

	/**
	 * The default value of the '{@link #isChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChanged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHANGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChanged()
	 * @generated
	 * @ordered
	 */
	protected boolean changed = CHANGED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntipatterngraphPackage.Literals.HANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HAntiPatternGraph getApg() {
		if (apg != null && apg.eIsProxy()) {
			InternalEObject oldApg = (InternalEObject) apg;
			apg = (HAntiPatternGraph) eResolveProxy(oldApg);
			if (apg != oldApg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AntipatterngraphPackage.HANNOTATION__APG,
							oldApg, apg));
			}
		}
		return apg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAntiPatternGraph basicGetApg() {
		return apg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApg(HAntiPatternGraph newApg, NotificationChain msgs) {
		HAntiPatternGraph oldApg = apg;
		apg = newApg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AntipatterngraphPackage.HANNOTATION__APG, oldApg, newApg);
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
	@Override
	public void setApg(HAntiPatternGraph newApg) {
		if (newApg != apg) {
			NotificationChain msgs = null;
			if (apg != null)
				msgs = ((InternalEObject) apg).eInverseRemove(this,
						AntipatterngraphPackage.HANTI_PATTERN_GRAPH__HANNOTATIONS, HAntiPatternGraph.class, msgs);
			if (newApg != null)
				msgs = ((InternalEObject) newApg).eInverseAdd(this,
						AntipatterngraphPackage.HANTI_PATTERN_GRAPH__HANNOTATIONS, HAntiPatternGraph.class, msgs);
			msgs = basicSetApg(newApg, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntipatterngraphPackage.HANNOTATION__APG, newApg,
					newApg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HAnnotation> getPartOf() {
		if (partOf == null) {
			partOf = new EObjectResolvingEList<HAnnotation>(HAnnotation.class, this,
					AntipatterngraphPackage.HANNOTATION__PART_OF);
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isChanged() {
		return changed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChanged(boolean newChanged) {
		boolean oldChanged = changed;
		changed = newChanged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntipatterngraphPackage.HANNOTATION__CHANGED,
					oldChanged, changed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AntipatterngraphPackage.HANNOTATION__APG:
			if (apg != null)
				msgs = ((InternalEObject) apg).eInverseRemove(this,
						AntipatterngraphPackage.HANTI_PATTERN_GRAPH__HANNOTATIONS, HAntiPatternGraph.class, msgs);
			return basicSetApg((HAntiPatternGraph) otherEnd, msgs);
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
		case AntipatterngraphPackage.HANNOTATION__APG:
			return basicSetApg(null, msgs);
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
		case AntipatterngraphPackage.HANNOTATION__APG:
			if (resolve)
				return getApg();
			return basicGetApg();
		case AntipatterngraphPackage.HANNOTATION__PART_OF:
			return getPartOf();
		case AntipatterngraphPackage.HANNOTATION__CHANGED:
			return isChanged();
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
		case AntipatterngraphPackage.HANNOTATION__APG:
			setApg((HAntiPatternGraph) newValue);
			return;
		case AntipatterngraphPackage.HANNOTATION__PART_OF:
			getPartOf().clear();
			getPartOf().addAll((Collection<? extends HAnnotation>) newValue);
			return;
		case AntipatterngraphPackage.HANNOTATION__CHANGED:
			setChanged((Boolean) newValue);
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
		case AntipatterngraphPackage.HANNOTATION__APG:
			setApg((HAntiPatternGraph) null);
			return;
		case AntipatterngraphPackage.HANNOTATION__PART_OF:
			getPartOf().clear();
			return;
		case AntipatterngraphPackage.HANNOTATION__CHANGED:
			setChanged(CHANGED_EDEFAULT);
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
		case AntipatterngraphPackage.HANNOTATION__APG:
			return apg != null;
		case AntipatterngraphPackage.HANNOTATION__PART_OF:
			return partOf != null && !partOf.isEmpty();
		case AntipatterngraphPackage.HANNOTATION__CHANGED:
			return changed != CHANGED_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (changed: ");
		result.append(changed);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	public TreeItem getTreeItem(Tree tree, int style) {
		return createItemContents(new TreeItem(tree, style), style);
	}

	@Override
	public TreeItem getTreeItem(TreeItem item, int style) {
		return createItemContents(new TreeItem(item, style), style);
	}

	// [user code injected with eMoflon] -->
} //HAnnotationImpl
