/**
 */
package org.gravity.tgg.pm.uml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.uml.Type;
import org.gravity.tgg.pm.uml.Type2TAbstractType;
import org.gravity.tgg.pm.uml.UmlPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.moflon.tgg.runtime.impl.AbstractCorrespondenceImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type2 TAbstract Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.tgg.pm.uml.impl.Type2TAbstractTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.pm.uml.impl.Type2TAbstractTypeImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Type2TAbstractTypeImpl extends AbstractCorrespondenceImpl implements Type2TAbstractType {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Type source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TAbstractType target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Type2TAbstractTypeImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.Literals.TYPE2_TABSTRACT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getSource() {
		if ((this.source != null) && this.source.eIsProxy()) {
			final InternalEObject oldSource = (InternalEObject) this.source;
			this.source = (Type) eResolveProxy(oldSource);
			if ((this.source != oldSource) && eNotificationRequired()) {
				eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.TYPE2_TABSTRACT_TYPE__SOURCE,
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
	public Type basicGetSource() {
		return this.source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(final Type newSource) {
		final Type oldSource = this.source;
		this.source = newSource;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TYPE2_TABSTRACT_TYPE__SOURCE, oldSource,
					this.source));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractType getTarget() {
		if ((this.target != null) && this.target.eIsProxy()) {
			final InternalEObject oldTarget = (InternalEObject) this.target;
			this.target = (TAbstractType) eResolveProxy(oldTarget);
			if ((this.target != oldTarget) && eNotificationRequired()) {
				eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.TYPE2_TABSTRACT_TYPE__TARGET,
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
	public TAbstractType basicGetTarget() {
		return this.target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(final TAbstractType newTarget) {
		final TAbstractType oldTarget = this.target;
		this.target = newTarget;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TYPE2_TABSTRACT_TYPE__TARGET, oldTarget,
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
		case UmlPackage.TYPE2_TABSTRACT_TYPE__SOURCE:
			if (resolve) {
				return getSource();
			}
			return basicGetSource();
		case UmlPackage.TYPE2_TABSTRACT_TYPE__TARGET:
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
		case UmlPackage.TYPE2_TABSTRACT_TYPE__SOURCE:
			setSource((Type) newValue);
			return;
		case UmlPackage.TYPE2_TABSTRACT_TYPE__TARGET:
			setTarget((TAbstractType) newValue);
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
		case UmlPackage.TYPE2_TABSTRACT_TYPE__SOURCE:
			setSource((Type) null);
			return;
		case UmlPackage.TYPE2_TABSTRACT_TYPE__TARGET:
			setTarget((TAbstractType) null);
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
		case UmlPackage.TYPE2_TABSTRACT_TYPE__SOURCE:
			return this.source != null;
		case UmlPackage.TYPE2_TABSTRACT_TYPE__TARGET:
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
} //Type2TAbstractTypeImpl
