/**
 */
package org.gravity.tgg.pm.uml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.uml.Feature;
import org.gravity.tgg.pm.uml.Feature2TMember;
import org.gravity.tgg.pm.uml.UmlPackage;
import org.gravity.typegraph.basic.TMember;
import org.moflon.tgg.runtime.impl.AbstractCorrespondenceImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature2 TMember</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.tgg.pm.uml.impl.Feature2TMemberImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.pm.uml.impl.Feature2TMemberImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Feature2TMemberImpl extends AbstractCorrespondenceImpl implements Feature2TMember {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Feature source;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Feature2TMemberImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.Literals.FEATURE2_TMEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getSource() {
		if ((this.source != null) && this.source.eIsProxy()) {
			final InternalEObject oldSource = (InternalEObject) this.source;
			this.source = (Feature) eResolveProxy(oldSource);
			if ((this.source != oldSource) && eNotificationRequired()) {
				eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.FEATURE2_TMEMBER__SOURCE,
						oldSource, this.source));
			}
		}
		return this.source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetSource() {
		return this.source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(final Feature newSource) {
		final Feature oldSource = this.source;
		this.source = newSource;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.FEATURE2_TMEMBER__SOURCE, oldSource,
					this.source));
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
			final InternalEObject oldTarget = (InternalEObject) this.target;
			this.target = (TMember) eResolveProxy(oldTarget);
			if ((this.target != oldTarget) && eNotificationRequired()) {
				eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.FEATURE2_TMEMBER__TARGET,
						oldTarget, this.target));
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
		final TMember oldTarget = this.target;
		this.target = newTarget;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.FEATURE2_TMEMBER__TARGET, oldTarget,
					this.target));
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
		case UmlPackage.FEATURE2_TMEMBER__SOURCE:
			if (resolve) {
				return getSource();
			}
			return basicGetSource();
		case UmlPackage.FEATURE2_TMEMBER__TARGET:
			if (resolve) {
				return getTarget();
			}
			return basicGetTarget();
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
		case UmlPackage.FEATURE2_TMEMBER__SOURCE:
			setSource((Feature) newValue);
			return;
		case UmlPackage.FEATURE2_TMEMBER__TARGET:
			setTarget((TMember) newValue);
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
		case UmlPackage.FEATURE2_TMEMBER__SOURCE:
			setSource((Feature) null);
			return;
		case UmlPackage.FEATURE2_TMEMBER__TARGET:
			setTarget((TMember) null);
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
		case UmlPackage.FEATURE2_TMEMBER__SOURCE:
			return this.source != null;
		case UmlPackage.FEATURE2_TMEMBER__TARGET:
			return this.target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]
	@Override
	public String toString() {
		return super.toString() + " ("+getSource()+" <--> "+getTarget()	+ ")";
	}
	// [user code injected with eMoflon] -->
} //Feature2TMemberImpl
