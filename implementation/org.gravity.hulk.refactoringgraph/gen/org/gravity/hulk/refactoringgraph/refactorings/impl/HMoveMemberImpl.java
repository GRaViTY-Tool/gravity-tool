/**
 */
package org.gravity.hulk.refactoringgraph.refactorings.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gravity.hulk.refactoringgraph.HInBlobAccess;
import org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess;

import org.gravity.hulk.refactoringgraph.refactorings.HMoveMember;
import org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TSignature;
// <-- [user defined imports]
import org.eclipse.swt.widgets.TreeItem;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HMove Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveMemberImpl#getSourceClass <em>Source Class</em>}</li>
 *   <li>{@link org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveMemberImpl#getTargetClass <em>Target Class</em>}</li>
 *   <li>{@link org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveMemberImpl#getM2dc <em>M2dc</em>}</li>
 *   <li>{@link org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveMemberImpl#getIba <em>Iba</em>}</li>
 *   <li>{@link org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveMemberImpl#getTSignature <em>TSignature</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HMoveMemberImpl extends HRefactoringImpl implements HMoveMember {
	/**
	 * The cached value of the '{@link #getSourceClass() <em>Source Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceClass()
	 * @generated
	 * @ordered
	 */
	protected TClass sourceClass;

	/**
	 * The cached value of the '{@link #getTargetClass() <em>Target Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClass()
	 * @generated
	 * @ordered
	 */
	protected TClass targetClass;

	/**
	 * The cached value of the '{@link #getM2dc() <em>M2dc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM2dc()
	 * @generated
	 * @ordered
	 */
	protected HMethodToDataClassAccess m2dc;

	/**
	 * The cached value of the '{@link #getIba() <em>Iba</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIba()
	 * @generated
	 * @ordered
	 */
	protected HInBlobAccess iba;

	/**
	 * The cached value of the '{@link #getTSignature() <em>TSignature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTSignature()
	 * @generated
	 * @ordered
	 */
	protected EList<TSignature> tSignature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMoveMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringsPackage.Literals.HMOVE_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TClass getSourceClass() {
		if (sourceClass != null && sourceClass.eIsProxy()) {
			InternalEObject oldSourceClass = (InternalEObject) sourceClass;
			sourceClass = (TClass) eResolveProxy(oldSourceClass);
			if (sourceClass != oldSourceClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RefactoringsPackage.HMOVE_MEMBER__SOURCE_CLASS, oldSourceClass, sourceClass));
			}
		}
		return sourceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetSourceClass() {
		return sourceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceClass(TClass newSourceClass) {
		TClass oldSourceClass = sourceClass;
		sourceClass = newSourceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringsPackage.HMOVE_MEMBER__SOURCE_CLASS,
					oldSourceClass, sourceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TClass getTargetClass() {
		if (targetClass != null && targetClass.eIsProxy()) {
			InternalEObject oldTargetClass = (InternalEObject) targetClass;
			targetClass = (TClass) eResolveProxy(oldTargetClass);
			if (targetClass != oldTargetClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RefactoringsPackage.HMOVE_MEMBER__TARGET_CLASS, oldTargetClass, targetClass));
			}
		}
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetTargetClass() {
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetClass(TClass newTargetClass) {
		TClass oldTargetClass = targetClass;
		targetClass = newTargetClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringsPackage.HMOVE_MEMBER__TARGET_CLASS,
					oldTargetClass, targetClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HMethodToDataClassAccess getM2dc() {
		if (m2dc != null && m2dc.eIsProxy()) {
			InternalEObject oldM2dc = (InternalEObject) m2dc;
			m2dc = (HMethodToDataClassAccess) eResolveProxy(oldM2dc);
			if (m2dc != oldM2dc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringsPackage.HMOVE_MEMBER__M2DC,
							oldM2dc, m2dc));
			}
		}
		return m2dc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMethodToDataClassAccess basicGetM2dc() {
		return m2dc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setM2dc(HMethodToDataClassAccess newM2dc) {
		HMethodToDataClassAccess oldM2dc = m2dc;
		m2dc = newM2dc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringsPackage.HMOVE_MEMBER__M2DC, oldM2dc,
					m2dc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HInBlobAccess getIba() {
		if (iba != null && iba.eIsProxy()) {
			InternalEObject oldIba = (InternalEObject) iba;
			iba = (HInBlobAccess) eResolveProxy(oldIba);
			if (iba != oldIba) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringsPackage.HMOVE_MEMBER__IBA,
							oldIba, iba));
			}
		}
		return iba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HInBlobAccess basicGetIba() {
		return iba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIba(HInBlobAccess newIba) {
		HInBlobAccess oldIba = iba;
		iba = newIba;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringsPackage.HMOVE_MEMBER__IBA, oldIba, iba));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TSignature> getTSignature() {
		if (tSignature == null) {
			tSignature = new EObjectResolvingEList<TSignature>(TSignature.class, this,
					RefactoringsPackage.HMOVE_MEMBER__TSIGNATURE);
		}
		return tSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RefactoringsPackage.HMOVE_MEMBER__SOURCE_CLASS:
			if (resolve)
				return getSourceClass();
			return basicGetSourceClass();
		case RefactoringsPackage.HMOVE_MEMBER__TARGET_CLASS:
			if (resolve)
				return getTargetClass();
			return basicGetTargetClass();
		case RefactoringsPackage.HMOVE_MEMBER__M2DC:
			if (resolve)
				return getM2dc();
			return basicGetM2dc();
		case RefactoringsPackage.HMOVE_MEMBER__IBA:
			if (resolve)
				return getIba();
			return basicGetIba();
		case RefactoringsPackage.HMOVE_MEMBER__TSIGNATURE:
			return getTSignature();
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
		case RefactoringsPackage.HMOVE_MEMBER__SOURCE_CLASS:
			setSourceClass((TClass) newValue);
			return;
		case RefactoringsPackage.HMOVE_MEMBER__TARGET_CLASS:
			setTargetClass((TClass) newValue);
			return;
		case RefactoringsPackage.HMOVE_MEMBER__M2DC:
			setM2dc((HMethodToDataClassAccess) newValue);
			return;
		case RefactoringsPackage.HMOVE_MEMBER__IBA:
			setIba((HInBlobAccess) newValue);
			return;
		case RefactoringsPackage.HMOVE_MEMBER__TSIGNATURE:
			getTSignature().clear();
			getTSignature().addAll((Collection<? extends TSignature>) newValue);
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
		case RefactoringsPackage.HMOVE_MEMBER__SOURCE_CLASS:
			setSourceClass((TClass) null);
			return;
		case RefactoringsPackage.HMOVE_MEMBER__TARGET_CLASS:
			setTargetClass((TClass) null);
			return;
		case RefactoringsPackage.HMOVE_MEMBER__M2DC:
			setM2dc((HMethodToDataClassAccess) null);
			return;
		case RefactoringsPackage.HMOVE_MEMBER__IBA:
			setIba((HInBlobAccess) null);
			return;
		case RefactoringsPackage.HMOVE_MEMBER__TSIGNATURE:
			getTSignature().clear();
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
		case RefactoringsPackage.HMOVE_MEMBER__SOURCE_CLASS:
			return sourceClass != null;
		case RefactoringsPackage.HMOVE_MEMBER__TARGET_CLASS:
			return targetClass != null;
		case RefactoringsPackage.HMOVE_MEMBER__M2DC:
			return m2dc != null;
		case RefactoringsPackage.HMOVE_MEMBER__IBA:
			return iba != null;
		case RefactoringsPackage.HMOVE_MEMBER__TSIGNATURE:
			return tSignature != null && !tSignature.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	public int compare(HMoveMember hMoveMethod) {
		int i = (int) (1000 * (getIba().getValue() - hMoveMethod.getIba().getValue()));
		if (i == 0) {
			return (int) (1000 * (hMoveMethod.getM2dc().getValue() - getM2dc().getValue()));
		}
		return i;
	}

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		String text = "Move ";
		int i;
		for (i = 0; i < tSignature.size() - 1; i++) {
			text += tSignature.get(i).getSignatureString();
			text += ", ";
		}
		text += tSignature.get(i).getSignatureString();
		text += " from " + sourceClass.getFullyQualifiedName() + " to " + targetClass.getFullyQualifiedName();
		item.setText(text);
		TreeItem details = new TreeItem(item, style);
		details.setText("details");
		if (getIba() != null) {
			getIba().createItemContents(new TreeItem(details, style), style);
		}
		if (getM2dc() != null) {
			getM2dc().createItemContents(new TreeItem(details, style), style);
		}
		return item;
	}

	// [user code injected with eMoflon] -->
} //HMoveMemberImpl
