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

import org.gravity.hulk.refactoringgraph.refactorings.HMoveMember;
import org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers;
import org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
import org.eclipse.swt.widgets.TreeItem;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HMove Members</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveMembersImpl#getHMoveMembers <em>HMove Members</em>}</li>
 *   <li>{@link org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveMembersImpl#getTargetClass <em>Target Class</em>}</li>
 *   <li>{@link org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveMembersImpl#getSourceClass <em>Source Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HMoveMembersImpl extends HRefactoringImpl implements HMoveMembers {
	/**
	 * The cached value of the '{@link #getHMoveMembers() <em>HMove Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHMoveMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<HMoveMember> hMoveMembers;

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
	 * The cached value of the '{@link #getSourceClass() <em>Source Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceClass()
	 * @generated
	 * @ordered
	 */
	protected TClass sourceClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMoveMembersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringsPackage.Literals.HMOVE_MEMBERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HMoveMember> getHMoveMembers() {
		if (hMoveMembers == null) {
			hMoveMembers = new EObjectResolvingEList<HMoveMember>(HMoveMember.class, this,
					RefactoringsPackage.HMOVE_MEMBERS__HMOVE_MEMBERS);
		}
		return hMoveMembers;
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
							RefactoringsPackage.HMOVE_MEMBERS__TARGET_CLASS, oldTargetClass, targetClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringsPackage.HMOVE_MEMBERS__TARGET_CLASS,
					oldTargetClass, targetClass));
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
							RefactoringsPackage.HMOVE_MEMBERS__SOURCE_CLASS, oldSourceClass, sourceClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringsPackage.HMOVE_MEMBERS__SOURCE_CLASS,
					oldSourceClass, sourceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RefactoringsPackage.HMOVE_MEMBERS__HMOVE_MEMBERS:
			return getHMoveMembers();
		case RefactoringsPackage.HMOVE_MEMBERS__TARGET_CLASS:
			if (resolve)
				return getTargetClass();
			return basicGetTargetClass();
		case RefactoringsPackage.HMOVE_MEMBERS__SOURCE_CLASS:
			if (resolve)
				return getSourceClass();
			return basicGetSourceClass();
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
		case RefactoringsPackage.HMOVE_MEMBERS__HMOVE_MEMBERS:
			getHMoveMembers().clear();
			getHMoveMembers().addAll((Collection<? extends HMoveMember>) newValue);
			return;
		case RefactoringsPackage.HMOVE_MEMBERS__TARGET_CLASS:
			setTargetClass((TClass) newValue);
			return;
		case RefactoringsPackage.HMOVE_MEMBERS__SOURCE_CLASS:
			setSourceClass((TClass) newValue);
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
		case RefactoringsPackage.HMOVE_MEMBERS__HMOVE_MEMBERS:
			getHMoveMembers().clear();
			return;
		case RefactoringsPackage.HMOVE_MEMBERS__TARGET_CLASS:
			setTargetClass((TClass) null);
			return;
		case RefactoringsPackage.HMOVE_MEMBERS__SOURCE_CLASS:
			setSourceClass((TClass) null);
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
		case RefactoringsPackage.HMOVE_MEMBERS__HMOVE_MEMBERS:
			return hMoveMembers != null && !hMoveMembers.isEmpty();
		case RefactoringsPackage.HMOVE_MEMBERS__TARGET_CLASS:
			return targetClass != null;
		case RefactoringsPackage.HMOVE_MEMBERS__SOURCE_CLASS:
			return sourceClass != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText("Move " + hMoveMembers.size() + " members to the class " + targetClass.getFullyQualifiedName());
		for (HMoveMember member : hMoveMembers) {
			member.createItemContents(new TreeItem(item, style), style);
		}
		return null;
	}

	// [user code injected with eMoflon] -->
} //HMoveMembersImpl
