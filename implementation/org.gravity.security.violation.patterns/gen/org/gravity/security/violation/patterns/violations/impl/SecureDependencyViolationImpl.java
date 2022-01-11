/**
 */
package org.gravity.security.violation.patterns.violations.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.hulk.antipatterngraph.impl.HAnnotationImpl;
import org.gravity.security.violation.patterns.violations.SecureDependencyViolation;
import org.gravity.security.violation.patterns.violations.ViolationsPackage;
import org.gravity.typegraph.basic.TMember;

import carisma.profile.umlsec.critical;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secure Dependency Violation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.security.violation.patterns.violations.impl.SecureDependencyViolationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.security.violation.patterns.violations.impl.SecureDependencyViolationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.gravity.security.violation.patterns.violations.impl.SecureDependencyViolationImpl#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecureDependencyViolationImpl extends HAnnotationImpl implements SecureDependencyViolation {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected TMember source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TMember target;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected critical requirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecureDependencyViolationImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViolationsPackage.Literals.SECURE_DEPENDENCY_VIOLATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMember getSource() {
		if ((this.source != null) && this.source.eIsProxy()) {
			final var oldSource = (InternalEObject)this.source;
			this.source = (TMember)eResolveProxy(oldSource);
			if ((this.source != oldSource) && eNotificationRequired()) {
				eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViolationsPackage.SECURE_DEPENDENCY_VIOLATION__SOURCE, oldSource, this.source));
			}
		}
		return this.source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMember basicGetSource() {
		return this.source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(final TMember newSource) {
		final var oldSource = this.source;
		this.source = newSource;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ViolationsPackage.SECURE_DEPENDENCY_VIOLATION__SOURCE, oldSource, this.source));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMember getTarget() {
		if ((this.target != null) && this.target.eIsProxy()) {
			final var oldTarget = (InternalEObject)this.target;
			this.target = (TMember)eResolveProxy(oldTarget);
			if ((this.target != oldTarget) && eNotificationRequired()) {
				eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViolationsPackage.SECURE_DEPENDENCY_VIOLATION__TARGET, oldTarget, this.target));
			}
		}
		return this.target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMember basicGetTarget() {
		return this.target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(final TMember newTarget) {
		final var oldTarget = this.target;
		this.target = newTarget;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ViolationsPackage.SECURE_DEPENDENCY_VIOLATION__TARGET, oldTarget, this.target));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public critical getRequirement() {
		if ((this.requirement != null) && this.requirement.eIsProxy()) {
			final var oldRequirement = (InternalEObject)this.requirement;
			this.requirement = (critical)eResolveProxy(oldRequirement);
			if ((this.requirement != oldRequirement) && eNotificationRequired()) {
				eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViolationsPackage.SECURE_DEPENDENCY_VIOLATION__REQUIREMENT, oldRequirement, this.requirement));
			}
		}
		return this.requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public critical basicGetRequirement() {
		return this.requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirement(final critical newRequirement) {
		final var oldRequirement = this.requirement;
		this.requirement = newRequirement;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ViolationsPackage.SECURE_DEPENDENCY_VIOLATION__REQUIREMENT, oldRequirement, this.requirement));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case ViolationsPackage.SECURE_DEPENDENCY_VIOLATION__SOURCE:
			if (resolve) {
				return getSource();
			}
			return basicGetSource();
		case ViolationsPackage.SECURE_DEPENDENCY_VIOLATION__TARGET:
			if (resolve) {
				return getTarget();
			}
			return basicGetTarget();
		case ViolationsPackage.SECURE_DEPENDENCY_VIOLATION__REQUIREMENT:
			if (resolve) {
				return getRequirement();
			}
			return basicGetRequirement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case ViolationsPackage.SECURE_DEPENDENCY_VIOLATION__SOURCE:
			setSource((TMember)newValue);
			return;
		case ViolationsPackage.SECURE_DEPENDENCY_VIOLATION__TARGET:
			setTarget((TMember)newValue);
			return;
		case ViolationsPackage.SECURE_DEPENDENCY_VIOLATION__REQUIREMENT:
			setRequirement((critical)newValue);
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
		case ViolationsPackage.SECURE_DEPENDENCY_VIOLATION__SOURCE:
			setSource((TMember)null);
			return;
		case ViolationsPackage.SECURE_DEPENDENCY_VIOLATION__TARGET:
			setTarget((TMember)null);
			return;
		case ViolationsPackage.SECURE_DEPENDENCY_VIOLATION__REQUIREMENT:
			setRequirement((critical)null);
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
		case ViolationsPackage.SECURE_DEPENDENCY_VIOLATION__SOURCE:
			return this.source != null;
		case ViolationsPackage.SECURE_DEPENDENCY_VIOLATION__TARGET:
			return this.target != null;
		case ViolationsPackage.SECURE_DEPENDENCY_VIOLATION__REQUIREMENT:
			return this.requirement != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public TreeItem createItemContents(final TreeItem item, final int style) {
		final var treeItem = new TreeItem(item, style);
		treeItem.setText("Violation of UMLsec Secure Dependency");
		return treeItem;
	}

} //SecureDependencyViolationImpl
